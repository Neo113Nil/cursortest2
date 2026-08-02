package b;

import java.io.IOException;

/* loaded from: classes.dex */
public final class u0 implements InterfaceC2323t, InterfaceC2310g {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24146a;

    public u0(C2306e c2306e) {
        this.f24146a = c2306e;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        try {
            return new g0(new p0(this.f24146a.b()));
        } catch (IllegalArgumentException e10) {
            throw new C2275C(e10.getMessage(), e10);
        }
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return b();
        } catch (IOException e10) {
            throw new t0("unable to get DER object", e10);
        } catch (IllegalArgumentException e11) {
            throw new t0("unable to get DER object", e11);
        }
    }
}
