package b;

import com.plaid.internal.EnumC3631g;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306e {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f24098a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24099b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f24100c;

    public C2306e(AbstractC2322s abstractC2322s, int i10, byte[][] bArr) {
        this.f24098a = abstractC2322s;
        this.f24099b = i10;
        this.f24100c = bArr;
    }

    public final InterfaceC2323t a(int i10) {
        InputStream inputStream = this.f24098a;
        if (inputStream instanceof C2314k) {
            C2314k c2314k = (C2314k) inputStream;
            c2314k.f24128g = false;
            c2314k.k();
        }
        int d10 = C2287O.d(this.f24098a, i10);
        int k10 = C2287O.k(this.f24098a, this.f24099b, d10 == 3 || d10 == 4 || d10 == 16 || d10 == 17 || d10 == 8);
        if (k10 < 0) {
            if ((i10 & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            C2306e c2306e = new C2306e(new C2314k(this.f24098a, this.f24099b), this.f24099b, this.f24100c);
            int i11 = i10 & 192;
            if (i11 != 0) {
                return new C2303c0(i11, d10, c2306e);
            }
            if (d10 == 3) {
                return new C2273A(c2306e);
            }
            if (d10 == 4) {
                return new C2282J(c2306e);
            }
            if (d10 == 8) {
                return new u0(c2306e);
            }
            if (d10 == 16) {
                return new C2288P(c2306e);
            }
            if (d10 == 17) {
                return new C2294W(c2306e);
            }
            throw new C2275C("unknown BER object encountered: 0x" + Integer.toHexString(d10));
        }
        C2302c c2302c = new C2302c(this.f24098a, k10, this.f24099b);
        if ((i10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE) == 0) {
            if (d10 == 3) {
                return new C2305d0(c2302c);
            }
            if (d10 == 4) {
                return new C2321r(c2302c);
            }
            if (d10 == 8) {
                throw new C2275C("externals must use constructed encoding (see X.690 8.18)");
            }
            if (d10 == 16) {
                throw new C2275C("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (d10 == 17) {
                throw new C2275C("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
            try {
                return C2287O.J(d10, c2302c, this.f24100c);
            } catch (IllegalArgumentException e10) {
                throw new C2275C("corrupted stream detected", e10);
            }
        }
        C2306e c2306e2 = new C2306e(c2302c, c2302c.f24143b, this.f24100c);
        int i12 = i10 & 192;
        if (i12 != 0) {
            return new E0(i12, d10, (i10 & 32) != 0, c2306e2);
        }
        if (d10 == 3) {
            return new C2273A(c2306e2);
        }
        if (d10 == 4) {
            return new C2282J(c2306e2);
        }
        if (d10 == 8) {
            return new u0(c2306e2);
        }
        if (d10 == 16) {
            return new s0(c2306e2);
        }
        if (d10 == 17) {
            return new y0(c2306e2);
        }
        throw new C2275C("unknown DL object encountered: 0x" + Integer.toHexString(d10));
    }

    public final C2326w b() {
        int read = this.f24098a.read();
        if (read < 0) {
            return new C2326w(0);
        }
        C2326w c2326w = new C2326w(10);
        do {
            InterfaceC2323t a10 = a(read);
            c2326w.b(a10 instanceof InterfaceC2310g ? ((InterfaceC2310g) a10).b() : a10.d());
            read = this.f24098a.read();
        } while (read >= 0);
        return c2326w;
    }

    public final C2297Z c(int i10, int i11) {
        C2326w b10 = b();
        int i12 = b10.f24150b;
        if (i12 == 1) {
            return new C2297Z(3, i10, i11, b10.a(0));
        }
        C2285M c2285m = AbstractC2276D.f24058a;
        return new C2297Z(4, i10, i11, i12 < 1 ? AbstractC2276D.f24058a : new C2285M(b10));
    }
}
