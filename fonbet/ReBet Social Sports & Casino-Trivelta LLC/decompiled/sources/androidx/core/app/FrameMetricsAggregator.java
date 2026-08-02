package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final b f18805a;

    public static class a extends b {

        /* renamed from: d, reason: collision with root package name */
        public static HandlerThread f18806d;

        /* renamed from: e, reason: collision with root package name */
        public static Handler f18807e;

        /* renamed from: a, reason: collision with root package name */
        public int f18808a;
        SparseIntArray[] mMetrics = new SparseIntArray[9];

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f18809b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f18810c = new WindowOnFrameMetricsAvailableListenerC0356a();

        /* renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0356a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0356a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f18808a & 1) != 0) {
                    aVar.f(aVar.mMetrics[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f18808a & 2) != 0) {
                    aVar2.f(aVar2.mMetrics[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f18808a & 4) != 0) {
                    aVar3.f(aVar3.mMetrics[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f18808a & 8) != 0) {
                    aVar4.f(aVar4.mMetrics[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f18808a & 16) != 0) {
                    aVar5.f(aVar5.mMetrics[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f18808a & 64) != 0) {
                    aVar6.f(aVar6.mMetrics[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f18808a & 32) != 0) {
                    aVar7.f(aVar7.mMetrics[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f18808a & 128) != 0) {
                    aVar8.f(aVar8.mMetrics[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f18808a & 256) != 0) {
                    aVar9.f(aVar9.mMetrics[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i10) {
            this.f18808a = i10;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f18806d == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f18806d = handlerThread;
                handlerThread.start();
                f18807e = new Handler(f18806d.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.mMetrics;
                if (sparseIntArrayArr[i10] == null && (this.f18808a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f18810c, f18807e);
            this.f18809b.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            Iterator it = this.f18809b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == activity) {
                    this.f18809b.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f18810c);
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.mMetrics;
            this.mMetrics = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f18809b.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f18809b.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f18810c);
                    this.f18809b.remove(size);
                }
            }
            return this.mMetrics;
        }

        public void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    public static class b {
        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f18805a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f18805a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f18805a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f18805a.d();
    }

    public SparseIntArray[] e() {
        return this.f18805a.e();
    }

    public FrameMetricsAggregator(int i10) {
        this.f18805a = new a(i10);
    }
}
