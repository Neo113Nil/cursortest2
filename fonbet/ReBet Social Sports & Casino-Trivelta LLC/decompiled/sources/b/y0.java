package b;

import java.io.IOException;

/* loaded from: classes.dex */
public final class y0 implements InterfaceC2323t, InterfaceC2310g {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24156a;

    public y0(C2306e c2306e) {
        this.f24156a = c2306e;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return j0.a(this.f24156a.b());
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return b();
        } catch (IOException e10) {
            throw new t0(e10.getMessage(), e10);
        }
    }
}
