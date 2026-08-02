package b;

import java.io.IOException;

/* loaded from: classes.dex */
public final class s0 implements InterfaceC2323t, InterfaceC2310g {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24144a;

    public s0(C2306e c2306e) {
        this.f24144a = c2306e;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        C2326w b10 = this.f24144a.b();
        p0 p0Var = j0.f24123a;
        return b10.f24150b < 1 ? j0.f24123a : new p0(b10);
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return b();
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
