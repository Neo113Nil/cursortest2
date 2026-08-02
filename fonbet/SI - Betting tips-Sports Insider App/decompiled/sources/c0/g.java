package c0;

import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Window$OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f3256a;

    public g(h hVar) {
        this.f3256a = hVar;
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i5) {
        h hVar = this.f3256a;
        if ((hVar.f3263d & 1) != 0) {
            h.w(hVar.f3264e[0], frameMetrics.getMetric(8));
        }
        h hVar2 = this.f3256a;
        if ((hVar2.f3263d & 2) != 0) {
            h.w(hVar2.f3264e[1], frameMetrics.getMetric(1));
        }
        h hVar3 = this.f3256a;
        if ((hVar3.f3263d & 4) != 0) {
            h.w(hVar3.f3264e[2], frameMetrics.getMetric(3));
        }
        h hVar4 = this.f3256a;
        if ((hVar4.f3263d & 8) != 0) {
            h.w(hVar4.f3264e[3], frameMetrics.getMetric(4));
        }
        h hVar5 = this.f3256a;
        if ((hVar5.f3263d & 16) != 0) {
            h.w(hVar5.f3264e[4], frameMetrics.getMetric(5));
        }
        h hVar6 = this.f3256a;
        if ((hVar6.f3263d & 64) != 0) {
            h.w(hVar6.f3264e[6], frameMetrics.getMetric(7));
        }
        h hVar7 = this.f3256a;
        if ((hVar7.f3263d & 32) != 0) {
            h.w(hVar7.f3264e[5], frameMetrics.getMetric(6));
        }
        h hVar8 = this.f3256a;
        if ((hVar8.f3263d & 128) != 0) {
            h.w(hVar8.f3264e[7], frameMetrics.getMetric(0));
        }
        h hVar9 = this.f3256a;
        if ((hVar9.f3263d & 256) != 0) {
            h.w(hVar9.f3264e[8], frameMetrics.getMetric(2));
        }
    }
}
