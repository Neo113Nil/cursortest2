package b;

import java.io.IOException;

/* renamed from: b.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2288P implements InterfaceC2323t, InterfaceC2310g {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24077a;

    public C2288P(C2306e c2306e) {
        this.f24077a = c2306e;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return new C2285M(this.f24077a.b());
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return new C2285M(this.f24077a.b());
        } catch (IOException e10) {
            throw new IllegalStateException(e10.getMessage());
        }
    }
}
