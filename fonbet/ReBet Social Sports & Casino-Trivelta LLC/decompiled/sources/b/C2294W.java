package b;

import java.io.IOException;

/* renamed from: b.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2294W implements InterfaceC2323t, InterfaceC2310g {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24082a;

    public C2294W(C2306e c2306e) {
        this.f24082a = c2306e;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return new C2291T(this.f24082a.b());
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return new C2291T(this.f24082a.b());
        } catch (IOException e10) {
            throw new t0(e10.getMessage(), e10);
        }
    }
}
