package P2;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final WebSettingsBoundaryInterface f8722a;

    public s(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.f8722a = webSettingsBoundaryInterface;
    }

    public void a(boolean z10) {
        this.f8722a.setAlgorithmicDarkeningAllowed(z10);
    }

    public void b(int i10) {
        this.f8722a.setForceDark(i10);
    }

    public void c(int i10) {
        this.f8722a.setForceDarkBehavior(i10);
    }

    public void d(boolean z10) {
        this.f8722a.setPaymentRequestEnabled(z10);
    }
}
