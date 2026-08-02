package c0;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends m3.f {

    /* renamed from: h, reason: collision with root package name */
    public static HandlerThread f3261h;

    /* renamed from: i, reason: collision with root package name */
    public static Handler f3262i;

    /* renamed from: d, reason: collision with root package name */
    public final int f3263d;

    /* renamed from: e, reason: collision with root package name */
    public SparseIntArray[] f3264e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3265f;

    /* renamed from: g, reason: collision with root package name */
    public final g f3266g;

    public h(int i5) {
        super(5);
        this.f3264e = new SparseIntArray[9];
        this.f3265f = new ArrayList();
        this.f3266g = new g(this);
        this.f3263d = i5;
    }

    public static void w(SparseIntArray sparseIntArray, long j) {
        if (sparseIntArray != null) {
            int i5 = (int) ((500000 + j) / 1000000);
            if (j >= 0) {
                sparseIntArray.put(i5, sparseIntArray.get(i5) + 1);
            }
        }
    }

    @Override // m3.f
    public final void e(Activity activity) {
        if (f3261h == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            f3261h = handlerThread;
            handlerThread.start();
            f3262i = new Handler(f3261h.getLooper());
        }
        for (int i5 = 0; i5 <= 8; i5++) {
            SparseIntArray[] sparseIntArrayArr = this.f3264e;
            if (sparseIntArrayArr[i5] == null && (this.f3263d & (1 << i5)) != 0) {
                sparseIntArrayArr[i5] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(this.f3266g, f3262i);
        this.f3265f.add(new WeakReference(activity));
    }

    @Override // m3.f
    public final SparseIntArray[] m() {
        return this.f3264e;
    }

    @Override // m3.f
    public final SparseIntArray[] o(Activity activity) {
        ArrayList arrayList = this.f3265f;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3266g);
        return this.f3264e;
    }

    @Override // m3.f
    public final SparseIntArray[] p() {
        SparseIntArray[] sparseIntArrayArr = this.f3264e;
        this.f3264e = new SparseIntArray[9];
        return sparseIntArrayArr;
    }

    @Override // m3.f
    public final SparseIntArray[] s() {
        ArrayList arrayList = this.f3265f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            Activity activity = (Activity) weakReference.get();
            if (weakReference.get() != null) {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3266g);
                arrayList.remove(size);
            }
        }
        return this.f3264e;
    }
}
