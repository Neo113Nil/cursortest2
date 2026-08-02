package org.chromium.base.metrics;

import internal.org.chromium.build.BuildConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.chromium.base.Callback;
import org.chromium.base.Log;

/* loaded from: classes10.dex */
final class CachingUmaRecorder implements UmaRecorder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_HISTOGRAM_COUNT = 256;
    static final int MAX_USER_ACTION_COUNT = 256;
    private static final String TAG = "CachingUmaRecorder";
    private UmaRecorder mDelegate;
    private int mDroppedUserActionCount;
    private List<Callback<String>> mUserActionCallbacksForTesting;
    private final ReentrantReadWriteLock mRwLock = new ReentrantReadWriteLock(false);
    private Map<String, Histogram> mHistogramByName = new HashMap();
    private final AtomicInteger mDroppedHistogramSampleCount = new AtomicInteger();
    private List<UserAction> mUserActions = new ArrayList();

    CachingUmaRecorder() {
    }

    static class Histogram {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MAX_SAMPLE_COUNT = 256;
        private final int mMax;
        private final int mMin;
        private final String mName;
        private final int mNumBuckets;
        private final List<Integer> mSamples = new ArrayList(1);
        private final int mType;

        @Retention(RetentionPolicy.SOURCE)
        @interface Type {
            public static final int BOOLEAN = 1;
            public static final int EXPONENTIAL = 2;
            public static final int LINEAR = 3;
            public static final int SPARSE = 4;
        }

        Histogram(int type, String name, int min, int max, int numBuckets) {
            this.mType = type;
            this.mName = name;
            this.mMin = min;
            this.mMax = max;
            this.mNumBuckets = numBuckets;
        }

        synchronized boolean addSample(int type, String name, int sample, int min, int max, int numBuckets) {
            if (this.mSamples.size() >= 256) {
                return false;
            }
            this.mSamples.add(Integer.valueOf(sample));
            return true;
        }

        synchronized int flushTo(UmaRecorder recorder) {
            int size;
            int i = this.mType;
            int i2 = 0;
            if (i == 1) {
                for (int i3 = 0; i3 < this.mSamples.size(); i3++) {
                    recorder.recordBooleanHistogram(this.mName, this.mSamples.get(i3).intValue() != 0);
                }
            } else if (i == 2) {
                UmaRecorder umaRecorder = recorder;
                while (i2 < this.mSamples.size()) {
                    UmaRecorder umaRecorder2 = umaRecorder;
                    umaRecorder2.recordExponentialHistogram(this.mName, this.mSamples.get(i2).intValue(), this.mMin, this.mMax, this.mNumBuckets);
                    i2++;
                    umaRecorder = umaRecorder2;
                }
            } else if (i == 3) {
                while (i2 < this.mSamples.size()) {
                    UmaRecorder umaRecorder3 = recorder;
                    umaRecorder3.recordLinearHistogram(this.mName, this.mSamples.get(i2).intValue(), this.mMin, this.mMax, this.mNumBuckets);
                    i2++;
                    recorder = umaRecorder3;
                }
            } else if (i == 4) {
                while (i2 < this.mSamples.size()) {
                    recorder.recordSparseHistogram(this.mName, this.mSamples.get(i2).intValue());
                    i2++;
                }
            }
            size = this.mSamples.size();
            this.mSamples.clear();
            return size;
        }
    }

    private static class UserAction {
        private final long mElapsedRealtimeMillis;
        private final String mName;

        UserAction(String name, long elapsedRealtimeMillis) {
            this.mName = name;
            this.mElapsedRealtimeMillis = elapsedRealtimeMillis;
        }

        void flushTo(UmaRecorder recorder) {
            recorder.recordUserAction(this.mName, this.mElapsedRealtimeMillis);
        }
    }

    public UmaRecorder setDelegate(final UmaRecorder recorder) {
        Map<String, Histogram> map;
        int i;
        this.mRwLock.writeLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            this.mDelegate = recorder;
            if (BuildConfig.IS_FOR_TEST) {
                swapUserActionCallbacksForTesting(umaRecorder, recorder);
            }
            if (recorder == null) {
                return umaRecorder;
            }
            List<UserAction> list = null;
            int i2 = 0;
            if (this.mHistogramByName.isEmpty()) {
                map = null;
                i = 0;
            } else {
                map = this.mHistogramByName;
                this.mHistogramByName = new HashMap();
                i = this.mDroppedHistogramSampleCount.getAndSet(0);
            }
            if (!this.mUserActions.isEmpty()) {
                list = this.mUserActions;
                this.mUserActions = new ArrayList();
                int i3 = this.mDroppedUserActionCount;
                this.mDroppedUserActionCount = 0;
                i2 = i3;
            }
            this.mRwLock.readLock().lock();
            if (map != null) {
                try {
                    flushHistogramsAlreadyLocked(map, i);
                } catch (Throwable th) {
                    this.mRwLock.readLock().unlock();
                    throw th;
                }
            }
            if (list != null) {
                flushUserActionsAlreadyLocked(list, i2);
            }
            this.mRwLock.readLock().unlock();
            return umaRecorder;
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    private void flushHistogramsAlreadyLocked(Map<String, Histogram> cache, int droppedHistogramSampleCount) {
        int size = cache.size();
        Iterator<Histogram> it = cache.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().flushTo(this.mDelegate);
        }
        Log.i(TAG, "Flushed %d samples from %d histograms, %d samples were dropped.", Integer.valueOf(i), Integer.valueOf(size), Integer.valueOf(droppedHistogramSampleCount));
    }

    private void flushUserActionsAlreadyLocked(List<UserAction> cache, int droppedUserActionCount) {
        Iterator<UserAction> it = cache.iterator();
        while (it.hasNext()) {
            it.next().flushTo(this.mDelegate);
        }
        Log.i(TAG, "Flushed %d user action samples, %d samples were dropped.", Integer.valueOf(cache.size()), Integer.valueOf(droppedUserActionCount));
    }

    private void cacheOrRecordHistogramSample(int type, String name, int sample, int min, int max, int numBuckets) {
        boolean tryAppendOrRecordSample = tryAppendOrRecordSample(type, name, sample, min, max, numBuckets);
        CachingUmaRecorder cachingUmaRecorder = this;
        if (tryAppendOrRecordSample) {
            return;
        }
        cachingUmaRecorder.mRwLock.writeLock().lock();
        try {
            if (cachingUmaRecorder.mDelegate == null) {
                try {
                    cacheHistogramSampleAlreadyWriteLocked(type, name, sample, min, max, numBuckets);
                    this.mRwLock.writeLock().unlock();
                    return;
                } catch (Throwable th) {
                    th = th;
                    cachingUmaRecorder = this;
                    Throwable th2 = th;
                    cachingUmaRecorder.mRwLock.writeLock().unlock();
                    throw th2;
                }
            }
            cachingUmaRecorder.mRwLock.readLock().lock();
            cachingUmaRecorder.mRwLock.writeLock().unlock();
            try {
                recordHistogramSampleAlreadyLocked(type, name, sample, min, max, numBuckets);
            } finally {
                this.mRwLock.readLock().unlock();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean tryAppendOrRecordSample(int type, String name, int sample, int min, int max, int numBuckets) {
        CachingUmaRecorder cachingUmaRecorder;
        this.mRwLock.readLock().lock();
        try {
            if (this.mDelegate != null) {
                recordHistogramSampleAlreadyLocked(type, name, sample, min, max, numBuckets);
                cachingUmaRecorder = this;
            } else {
                cachingUmaRecorder = this;
                try {
                    Histogram histogram = cachingUmaRecorder.mHistogramByName.get(name);
                    if (histogram != null) {
                        if (!histogram.addSample(type, name, sample, min, max, numBuckets)) {
                            cachingUmaRecorder.mDroppedHistogramSampleCount.incrementAndGet();
                        }
                    } else {
                        cachingUmaRecorder.mRwLock.readLock().unlock();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    cachingUmaRecorder.mRwLock.readLock().unlock();
                    throw th2;
                }
            }
            cachingUmaRecorder.mRwLock.readLock().unlock();
            return true;
        } catch (Throwable th3) {
            th = th3;
            cachingUmaRecorder = this;
        }
    }

    private void cacheHistogramSampleAlreadyWriteLocked(int type, String name, int sample, int min, int max, int numBuckets) {
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        Histogram histogram = this.mHistogramByName.get(name);
        if (histogram != null) {
            i = type;
            str = name;
            i2 = min;
            i3 = max;
            i4 = numBuckets;
        } else {
            if (this.mHistogramByName.size() >= 256) {
                this.mDroppedHistogramSampleCount.incrementAndGet();
                return;
            }
            histogram = new Histogram(type, name, min, max, numBuckets);
            this.mHistogramByName.put(name, histogram);
            i3 = max;
            i4 = numBuckets;
            i2 = min;
            str = name;
            i = type;
        }
        if (histogram.addSample(i, str, sample, i2, i3, i4)) {
            return;
        }
        this.mDroppedHistogramSampleCount.incrementAndGet();
    }

    private void recordHistogramSampleAlreadyLocked(int type, String name, int sample, int min, int max, int numBuckets) {
        if (type == 1) {
            this.mDelegate.recordBooleanHistogram(name, sample != 0);
            return;
        }
        if (type == 2) {
            this.mDelegate.recordExponentialHistogram(name, sample, min, max, numBuckets);
            return;
        }
        if (type == 3) {
            this.mDelegate.recordLinearHistogram(name, sample, min, max, numBuckets);
        } else if (type == 4) {
            this.mDelegate.recordSparseHistogram(name, sample);
        } else {
            throw new UnsupportedOperationException("Unknown histogram type " + type);
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(String str, boolean z) {
        cacheOrRecordHistogramSample(1, str, z ? 1 : 0, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(String name, int sample, int min, int max, int numBuckets) {
        cacheOrRecordHistogramSample(2, name, sample, min, max, numBuckets);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(String name, int sample, int min, int max, int numBuckets) {
        cacheOrRecordHistogramSample(3, name, sample, min, max, numBuckets);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(String name, int sample) {
        cacheOrRecordHistogramSample(4, name, sample, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(String name, long elapsedRealtimeMillis) {
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.recordUserAction(name, elapsedRealtimeMillis);
                return;
            }
            this.mRwLock.readLock().unlock();
            this.mRwLock.writeLock().lock();
            try {
                if (this.mDelegate == null) {
                    if (this.mUserActions.size() < 256) {
                        this.mUserActions.add(new UserAction(name, elapsedRealtimeMillis));
                    } else {
                        this.mDroppedUserActionCount++;
                    }
                    if (this.mUserActionCallbacksForTesting != null) {
                        for (int i = 0; i < this.mUserActionCallbacksForTesting.size(); i++) {
                            this.mUserActionCallbacksForTesting.get(i).lambda$bind$0(name);
                        }
                    }
                    return;
                }
                this.mRwLock.readLock().lock();
                try {
                    this.mDelegate.recordUserAction(name, elapsedRealtimeMillis);
                } finally {
                }
            } finally {
                this.mRwLock.writeLock().unlock();
            }
        } finally {
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(String name, int sample) {
        int i;
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                return umaRecorder.getHistogramValueCountForTesting(name, sample);
            }
            Histogram histogram = this.mHistogramByName.get(name);
            if (histogram == null) {
                return 0;
            }
            synchronized (histogram) {
                i = 0;
                for (int i2 = 0; i2 < histogram.mSamples.size(); i2++) {
                    if (((Integer) histogram.mSamples.get(i2)).intValue() == sample) {
                        i++;
                    }
                }
            }
            return i;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(String name) {
        int size;
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                return umaRecorder.getHistogramTotalCountForTesting(name);
            }
            Histogram histogram = this.mHistogramByName.get(name);
            if (histogram == null) {
                this.mRwLock.readLock().unlock();
                return 0;
            }
            synchronized (histogram) {
                size = histogram.mSamples.size();
            }
            return size;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public List<HistogramBucket> getHistogramSamplesForTesting(String name) {
        Integer[] numArr;
        List<HistogramBucket> arrayList;
        this.mRwLock.readLock().lock();
        try {
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                arrayList = umaRecorder.getHistogramSamplesForTesting(name);
            } else {
                Histogram histogram = this.mHistogramByName.get(name);
                if (histogram == null) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    synchronized (histogram) {
                        numArr = (Integer[]) histogram.mSamples.toArray(new Integer[0]);
                    }
                    Arrays.sort(numArr);
                    arrayList = new ArrayList<>();
                    int i = 0;
                    while (i < numArr.length) {
                        int intValue = numArr[i].intValue();
                        int i2 = 0;
                        do {
                            i2++;
                            i++;
                            if (i < numArr.length) {
                            }
                            arrayList.add(new HistogramBucket(intValue, intValue + 1, i2));
                        } while (numArr[i].intValue() == intValue);
                        arrayList.add(new HistogramBucket(intValue, intValue + 1, i2));
                    }
                }
            }
            return arrayList;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(Callback<String> callback) {
        this.mRwLock.writeLock().lock();
        try {
            if (this.mUserActionCallbacksForTesting == null) {
                this.mUserActionCallbacksForTesting = new ArrayList();
            }
            this.mUserActionCallbacksForTesting.add(callback);
            UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.addUserActionCallbackForTesting(callback);
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(Callback<String> callback) {
        this.mRwLock.writeLock().lock();
        try {
            List<Callback<String>> list = this.mUserActionCallbacksForTesting;
            if (list != null) {
                list.remove(callback);
                UmaRecorder umaRecorder = this.mDelegate;
                if (umaRecorder != null) {
                    umaRecorder.removeUserActionCallbackForTesting(callback);
                }
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    private void swapUserActionCallbacksForTesting(UmaRecorder previousRecorder, UmaRecorder newRecorder) {
        if (this.mUserActionCallbacksForTesting == null) {
            return;
        }
        for (int i = 0; i < this.mUserActionCallbacksForTesting.size(); i++) {
            if (previousRecorder != null) {
                previousRecorder.removeUserActionCallbackForTesting(this.mUserActionCallbacksForTesting.get(i));
            }
            if (newRecorder != null) {
                newRecorder.addUserActionCallbackForTesting(this.mUserActionCallbacksForTesting.get(i));
            }
        }
    }
}
