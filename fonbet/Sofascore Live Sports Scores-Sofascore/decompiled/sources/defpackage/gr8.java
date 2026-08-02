package defpackage;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gr8 implements Window.OnFrameMetricsAvailableListener {
    public final /* synthetic */ axn a;

    public gr8(axn axnVar) {
        this.a = axnVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        axn axnVar = this.a;
        if ((axnVar.a & 1) != 0) {
            SparseIntArray sparseIntArray = ((SparseIntArray[]) axnVar.b)[0];
            long metric = frameMetrics.getMetric(8);
            if (sparseIntArray != null) {
                int i2 = (int) ((500000 + metric) / 1000000);
                if (metric >= 0) {
                    sparseIntArray.put(i2, sparseIntArray.get(i2) + 1);
                }
            }
        }
    }
}
