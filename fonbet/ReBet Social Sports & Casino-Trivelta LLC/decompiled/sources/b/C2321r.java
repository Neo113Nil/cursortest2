package b;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2321r implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final C2302c f24141a;

    public C2321r(C2302c c2302c) {
        this.f24141a = c2302c;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return new C2317n(this.f24141a.k());
    }

    @Override // b.n0
    public final InputStream c() {
        return this.f24141a;
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return b();
        } catch (IOException e10) {
            throw new t0("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }
}
