package b;

import b3.AbstractC2382a;
import com.plaid.internal.EnumC3631g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import kotlin.UByte;

/* renamed from: b.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2287O extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final int f24074a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24075b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[][] f24076c;

    public C2287O(ByteArrayInputStream byteArrayInputStream, int i10) {
        this(byteArrayInputStream, i10, false);
    }

    public static w0 J(int i10, C2302c c2302c, byte[][] bArr) {
        try {
            switch (i10) {
                case 1:
                    byte[] U10 = U(c2302c, bArr);
                    if (U10.length != 1) {
                        throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                    }
                    byte b10 = U10[0];
                    return b10 != -1 ? b10 != 0 ? new C2319p(b10) : C2319p.f24135f : C2319p.f24136g;
                case 2:
                    return new C2290S(c2302c.k());
                case 3:
                    return AbstractC2311h.j(c2302c.k());
                case 4:
                    return new C2317n(c2302c.k());
                case 5:
                    if (c2302c.k().length == 0) {
                        return C2308f.f24105d;
                    }
                    throw new IllegalStateException("malformed NULL encoding encountered");
                case 6:
                    int i11 = c2302c.f24092d;
                    HashMap hashMap = C2307e0.f24101f;
                    if (i11 > 4096) {
                        throw new IllegalArgumentException("exceeded OID contents length limit");
                    }
                    byte[] U11 = U(c2302c, bArr);
                    if (U11.length > 4096) {
                        throw new IllegalArgumentException("exceeded OID contents length limit");
                    }
                    C2301b0 c2301b0 = new C2301b0(U11);
                    HashMap hashMap2 = C2307e0.f24101f;
                    synchronized (hashMap2) {
                        try {
                            C2307e0 c2307e0 = (C2307e0) hashMap2.get(c2301b0);
                            if (c2307e0 != null) {
                                return c2307e0;
                            }
                            if (z0.k(U11)) {
                                return new C2307e0(AbstractC2382a.a(U11));
                            }
                            throw new IllegalArgumentException("invalid OID contents");
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                case 7:
                    return new C2296Y(new D0(c2302c.k()));
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    throw new IOException("unknown tag " + i10 + " encountered");
                case 10:
                    byte[] U12 = U(c2302c, bArr);
                    if (U12.length > 1) {
                        return new C2329z(U12, true);
                    }
                    if (U12.length == 0) {
                        throw new IllegalArgumentException("ENUMERATED has zero length");
                    }
                    int i12 = U12[0] & UByte.MAX_VALUE;
                    C2329z[] c2329zArr = C2329z.f24157b;
                    if (i12 >= 12) {
                        return new C2329z(U12, true);
                    }
                    C2329z c2329z = c2329zArr[i12];
                    if (c2329z != null) {
                        return c2329z;
                    }
                    C2329z c2329z2 = new C2329z(U12, true);
                    c2329zArr[i12] = c2329z2;
                    return c2329z2;
                case 12:
                    return new C2286N(c2302c.k());
                case 13:
                    int i13 = c2302c.f24092d;
                    HashMap hashMap3 = z0.f24159f;
                    if (i13 <= 4096) {
                        return z0.j(U(c2302c, bArr), true);
                    }
                    throw new IllegalArgumentException("exceeded relative OID contents length limit");
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    throw new IOException("unsupported tag " + i10 + " encountered");
                case 18:
                    return new C2313j(c2302c.k());
                case 19:
                    return new C2328y(c2302c.k());
                case 20:
                    return new C2280H(c2302c.k());
                case 21:
                    return new C2292U(c2302c.k());
                case 22:
                    return new C2300b(c2302c.k());
                case 23:
                    return new C2316m(c2302c.k());
                case 24:
                    return new C2281I(c2302c.k());
                case 25:
                    return new D0(c2302c.k());
                case 26:
                    return new C2295X(c2302c.k());
                case 27:
                    return new x0(c2302c.k());
                case 28:
                    return new C2289Q(c2302c.k());
                case 30:
                    return new l0(w0(c2302c));
            }
        } catch (IllegalArgumentException e10) {
            throw new C2275C(e10.getMessage(), e10);
        } catch (IllegalStateException e11) {
            throw new C2275C(e11.getMessage(), e11);
        }
    }

    public static byte[] U(C2302c c2302c, byte[][] bArr) {
        int i10 = c2302c.f24092d;
        if (i10 >= bArr.length) {
            return c2302c.k();
        }
        byte[] bArr2 = bArr[i10];
        if (bArr2 == null) {
            bArr2 = new byte[i10];
            bArr[i10] = bArr2;
        }
        if (i10 != bArr2.length) {
            throw new IllegalArgumentException("buffer length not right for data");
        }
        if (i10 == 0) {
            return bArr2;
        }
        int i11 = c2302c.f24143b;
        if (i10 >= i11) {
            throw new IOException("corrupted stream - out of bounds length found: " + c2302c.f24092d + " >= " + i11);
        }
        InputStream inputStream = c2302c.f24142a;
        int length = bArr2.length;
        int i12 = 0;
        while (i12 < length) {
            int read = inputStream.read(bArr2, i12, length - i12);
            if (read < 0) {
                break;
            }
            i12 += read;
        }
        int i13 = i10 - i12;
        c2302c.f24092d = i13;
        if (i13 == 0) {
            c2302c.d();
            return bArr2;
        }
        throw new EOFException("DEF length " + c2302c.f24091c + " object truncated by " + c2302c.f24092d);
    }

    public static int d(InputStream inputStream, int i10) {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int read = inputStream.read();
        if (read < 31) {
            if (read < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i12 = read & 127;
        if (i12 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((read & 128) != 0) {
            if ((i12 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            int i13 = i12 << 7;
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i12 = i13 | (read2 & 127);
            read = read2;
        }
        return i12;
    }

    public static int k(InputStream inputStream, int i10, boolean z10) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == read) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i11 = read & 127;
        int i12 = 0;
        int i13 = 0;
        do {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i12 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i12 = (i12 << 8) + read2;
            i13++;
        } while (i13 < i11);
        if (i12 < i10 || z10) {
            return i12;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i12 + " >= " + i10);
    }

    public static char[] w0(C2302c c2302c) {
        int i10 = c2302c.f24092d;
        if ((i10 & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i11 = i10 / 2;
        char[] cArr = new char[i11];
        byte[] bArr = new byte[8];
        int i12 = 0;
        int i13 = 0;
        while (i10 >= 8) {
            int i14 = 0;
            while (i14 < 8) {
                int read = c2302c.read(bArr, i14, 8 - i14);
                if (read < 0) {
                    break;
                }
                i14 += read;
            }
            if (i14 != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i13] = (char) ((bArr[0] << 8) | (bArr[1] & UByte.MAX_VALUE));
            cArr[i13 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & UByte.MAX_VALUE));
            cArr[i13 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & UByte.MAX_VALUE));
            cArr[i13 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & UByte.MAX_VALUE));
            i13 += 4;
            i10 -= 8;
        }
        if (i10 > 0) {
            int i15 = 0;
            while (i15 < i10) {
                int read2 = c2302c.read(bArr, i15, i10 - i15);
                if (read2 < 0) {
                    break;
                }
                i15 += read2;
            }
            if (i15 != i10) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i16 = i12 + 1;
                int i17 = bArr[i12] << 8;
                i12 += 2;
                cArr[i13] = (char) ((bArr[i16] & UByte.MAX_VALUE) | i17);
                i13++;
            } while (i12 < i10);
        }
        if (c2302c.f24092d == 0 && i11 == i13) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    public final w0 B(int i10, int i11, int i12) {
        C2302c c2302c = new C2302c(this, i12, this.f24074a);
        if ((i10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE) == 0) {
            return J(i11, c2302c, this.f24076c);
        }
        int i13 = i10 & 192;
        int i14 = 0;
        if (i13 != 0) {
            if ((i10 & 32) == 0) {
                return new B0(4, i13, i11, new C2317n(c2302c.k()));
            }
            C2326w z02 = z0(c2302c);
            int i15 = z02.f24150b;
            if (i15 == 1) {
                return new B0(3, i13, i11, z02.a(0));
            }
            p0 p0Var = j0.f24123a;
            return new B0(4, i13, i11, i15 < 1 ? j0.f24123a : new p0(z02));
        }
        if (i11 == 3) {
            C2326w z03 = z0(c2302c);
            int i16 = z03.f24150b;
            AbstractC2311h[] abstractC2311hArr = new AbstractC2311h[i16];
            while (i14 != i16) {
                InterfaceC2323t a10 = z03.a(i14);
                if (!(a10 instanceof AbstractC2311h)) {
                    throw new C2275C("unknown object encountered in constructed BIT STRING: " + a10.getClass());
                }
                abstractC2311hArr[i14] = (AbstractC2311h) a10;
                i14++;
            }
            return new C2327x(abstractC2311hArr);
        }
        if (i11 == 4) {
            C2326w z04 = z0(c2302c);
            int i17 = z04.f24150b;
            k0[] k0VarArr = new k0[i17];
            while (i14 != i17) {
                InterfaceC2323t a11 = z04.a(i14);
                if (!(a11 instanceof k0)) {
                    throw new C2275C("unknown object encountered in constructed OCTET STRING: " + a11.getClass());
                }
                k0VarArr[i14] = (k0) a11;
                i14++;
            }
            return new C2279G(C2279G.l(k0VarArr), k0VarArr);
        }
        if (i11 == 8) {
            C2326w z05 = z0(c2302c);
            p0 p0Var2 = j0.f24123a;
            p0 p0Var3 = z05.f24150b < 1 ? j0.f24123a : new p0(z05);
            p0Var3.getClass();
            return new g0(p0Var3);
        }
        if (i11 != 16) {
            if (i11 == 17) {
                return j0.a(z0(c2302c));
            }
            throw new IOException("unknown tag " + i11 + " encountered");
        }
        if (c2302c.f24092d < 1) {
            return j0.f24123a;
        }
        if (this.f24075b) {
            return new C2318o(c2302c.k());
        }
        C2326w z06 = z0(c2302c);
        p0 p0Var4 = j0.f24123a;
        return z06.f24150b < 1 ? j0.f24123a : new p0(z06);
    }

    public final w0 r() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int d10 = d(this, read);
        int k10 = k(this, this.f24074a, false);
        if (k10 >= 0) {
            try {
                return B(read, d10, k10);
            } catch (IllegalArgumentException e10) {
                throw new C2275C("corrupted stream detected", e10);
            }
        }
        if ((read & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        C2306e c2306e = new C2306e(new C2314k(this, this.f24074a), this.f24074a, this.f24076c);
        int i10 = read & 192;
        if (i10 != 0) {
            C2326w b10 = c2306e.b();
            int i11 = b10.f24150b;
            if (i11 == 1) {
                return new C2297Z(3, i10, d10, b10.a(0));
            }
            C2285M c2285m = AbstractC2276D.f24058a;
            return new C2297Z(4, i10, d10, i11 < 1 ? AbstractC2276D.f24058a : new C2285M(b10));
        }
        if (d10 == 3) {
            C2309f0 c2309f0 = new C2309f0(c2306e);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read2 = c2309f0.read(bArr, 0, 4096);
                if (read2 < 0) {
                    return new C2327x(byteArrayOutputStream.toByteArray(), c2309f0.f24109d);
                }
                byteArrayOutputStream.write(bArr, 0, read2);
            }
        } else {
            if (d10 != 4) {
                if (d10 == 8) {
                    try {
                        return new g0(new p0(c2306e.b()));
                    } catch (IllegalArgumentException e11) {
                        throw new C2275C(e11.getMessage(), e11);
                    }
                }
                if (d10 == 16) {
                    return new C2285M(c2306e.b());
                }
                if (d10 == 17) {
                    return new C2291T(c2306e.b());
                }
                throw new IOException("unknown BER object encountered");
            }
            i0 i0Var = new i0(c2306e);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read3 = i0Var.read(bArr2, 0, 4096);
                if (read3 < 0) {
                    return new C2279G(byteArrayOutputStream2.toByteArray(), null);
                }
                byteArrayOutputStream2.write(bArr2, 0, read3);
            }
        }
    }

    public final C2326w z0(C2302c c2302c) {
        int i10 = c2302c.f24092d;
        if (i10 < 1) {
            return new C2326w(0);
        }
        C2287O c2287o = new C2287O(c2302c, i10, this.f24075b, this.f24076c);
        w0 r10 = c2287o.r();
        if (r10 == null) {
            return new C2326w(0);
        }
        C2326w c2326w = new C2326w(10);
        do {
            c2326w.b(r10);
            r10 = c2287o.r();
        } while (r10 != null);
        return c2326w;
    }

    public C2287O(ByteArrayInputStream byteArrayInputStream, int i10, boolean z10) {
        this(byteArrayInputStream, i10, z10, new byte[11][]);
    }

    public C2287O(InputStream inputStream, int i10, boolean z10, byte[][] bArr) {
        super(inputStream);
        this.f24074a = i10;
        this.f24075b = z10;
        this.f24076c = bArr;
    }

    public C2287O(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
