package io.radar.sdk.util;

import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JobMapper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0007J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lio/radar/sdk/util/JobMapper;", "", "()V", "counter", "", "", "<set-?>", RRWebVideoEvent.JsonKeys.SIZE, "getSize", "()I", "adjustSize", "", "maxConcurrentJobs", "clear", "jobId", "get", "getJobId", "incAndGet", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JobMapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_JOB_ID = 20160525;
    private final Map<Integer, Integer> counter = new ConcurrentHashMap();
    private int size;

    /* compiled from: JobMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"Lio/radar/sdk/util/JobMapper$Companion;", "", "()V", "DEFAULT_JOB_ID", "", "getDEFAULT_JOB_ID$annotations", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getDEFAULT_JOB_ID$annotations() {
        }

        private Companion() {
        }
    }

    public final int getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getJobId(int maxConcurrentJobs) {
        if (maxConcurrentJobs == 0 || this.counter.isEmpty()) {
            return DEFAULT_JOB_ID;
        }
        adjustSize(maxConcurrentJobs);
        for (Map.Entry<Integer, Integer> entry : this.counter.entrySet()) {
            if (entry.getValue().intValue() == 0) {
                return entry.getKey().intValue();
            }
        }
        Object obj = null;
        if (this.size < maxConcurrentJobs) {
            Iterator<T> it = this.counter.entrySet().iterator();
            if (it.hasNext()) {
                obj = it.next();
                if (it.hasNext()) {
                    int intValue = ((Number) ((Map.Entry) obj).getKey()).intValue();
                    do {
                        Object next = it.next();
                        int intValue2 = ((Number) ((Map.Entry) next).getKey()).intValue();
                        if (intValue < intValue2) {
                            obj = next;
                            intValue = intValue2;
                        }
                    } while (it.hasNext());
                }
            }
            Map.Entry entry2 = (Map.Entry) obj;
            Intrinsics.checkNotNull(entry2);
            int intValue3 = ((Number) entry2.getKey()).intValue() + 1;
            this.counter.put(Integer.valueOf(intValue3), 0);
            return intValue3;
        }
        Iterator<T> it2 = this.counter.entrySet().iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                int intValue4 = ((Number) ((Map.Entry) obj).getValue()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue5 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue4 < intValue5) {
                        obj = next2;
                        intValue4 = intValue5;
                    }
                } while (it2.hasNext());
            }
        }
        Map.Entry entry3 = (Map.Entry) obj;
        Intrinsics.checkNotNull(entry3);
        this.counter.put(entry3.getKey(), 0);
        return ((Number) entry3.getKey()).intValue();
    }

    public final void adjustSize(int maxConcurrentJobs) {
        int i = this.size;
        if (i > maxConcurrentJobs) {
            while (i < maxConcurrentJobs) {
                this.counter.remove(Integer.valueOf(DEFAULT_JOB_ID + i));
                i++;
            }
        }
        this.size = maxConcurrentJobs;
    }

    public final int get(int jobId) {
        Integer num = this.counter.get(Integer.valueOf(jobId));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int incAndGet(int jobId) {
        int i = get(jobId) + 1;
        this.counter.put(Integer.valueOf(jobId), Integer.valueOf(i));
        return i;
    }

    public final void clear(int jobId) {
        this.counter.remove(Integer.valueOf(jobId));
    }
}
