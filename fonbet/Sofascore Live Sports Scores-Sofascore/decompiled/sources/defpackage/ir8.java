package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ir8 {
    public static final l10 e = l10.c();
    public final Activity a;
    public final sz8 b;
    public final HashMap c;
    public boolean d;

    public ir8(Activity activity) {
        sz8 sz8Var = new sz8(26);
        HashMap hashMap = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = sz8Var;
        this.c = hashMap;
    }

    public final jvd a() {
        boolean z = this.d;
        l10 l10Var = e;
        if (!z) {
            l10Var.getClass();
            return new jvd();
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((axn) this.b.b).b;
        if (sparseIntArrayArr == null) {
            l10Var.getClass();
            return new jvd();
        }
        SparseIntArray sparseIntArray = sparseIntArrayArr[0];
        if (sparseIntArray == null) {
            l10Var.getClass();
            return new jvd();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int keyAt = sparseIntArray.keyAt(i4);
            int valueAt = sparseIntArray.valueAt(i4);
            i += valueAt;
            if (keyAt > 700) {
                i3 += valueAt;
            }
            if (keyAt > 16) {
                i2 += valueAt;
            }
        }
        return new jvd(new hr8(i, i2, i3));
    }

    public final void b() {
        boolean z = this.d;
        Activity activity = this.a;
        if (z) {
            e.a("FrameMetricsAggregator is already recording %s", activity.getClass().getSimpleName());
            return;
        }
        axn axnVar = (axn) this.b.b;
        if (axn.e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            axn.e = handlerThread;
            handlerThread.start();
            axn.f = new Handler(axn.e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) axnVar.b;
            if (sparseIntArrayArr[i] == null) {
                if (((1 << i) & axnVar.a) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener((gr8) axnVar.d, axn.f);
        ((ArrayList) axnVar.c).add(new WeakReference(activity));
        this.d = true;
    }
}
