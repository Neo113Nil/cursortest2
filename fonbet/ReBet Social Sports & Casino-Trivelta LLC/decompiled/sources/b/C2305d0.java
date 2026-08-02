package b;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2305d0 implements InterfaceC2315l {

    /* renamed from: a, reason: collision with root package name */
    public final C2302c f24096a;

    /* renamed from: b, reason: collision with root package name */
    public int f24097b = 0;

    public C2305d0(C2302c c2302c) {
        this.f24096a = c2302c;
    }

    @Override // b.InterfaceC2315l
    public final InputStream a() {
        C2302c c2302c = this.f24096a;
        int i10 = c2302c.f24092d;
        if (i10 < 1) {
            throw new IllegalStateException("content octets cannot be empty");
        }
        int read = c2302c.read();
        this.f24097b = read;
        if (read > 0) {
            if (i10 < 2) {
                throw new IllegalStateException("zero length data with non-zero pad bits");
            }
            if (read > 7) {
                throw new IllegalStateException("pad bits cannot be greater than 7 or less than 0");
            }
        }
        return this.f24096a;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return AbstractC2311h.j(this.f24096a.k());
    }

    @Override // b.InterfaceC2323t
    public final w0 d() {
        try {
            return b();
        } catch (IOException e10) {
            throw new t0("IOException converting stream to byte array: " + e10.getMessage(), e10);
        }
    }

    @Override // b.InterfaceC2315l
    public final int e() {
        return this.f24097b;
    }
}
