package sf;

import Am.C2438a;
import B0.A0;
import C.C2702w;
import E0.C2942q;
import I0.C3173b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.collections.AbstractC7696c;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import tf.C9869a;
import tf.C9870b;

/* renamed from: sf.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9681g implements InterfaceC9683i, InterfaceC9682h, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public H f98708a;

    /* renamed from: b, reason: collision with root package name */
    private long f98709b;

    /* renamed from: sf.g$a */
    public static final class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        public C9681g f98710a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f98711b;

        /* renamed from: c, reason: collision with root package name */
        private H f98712c;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f98714e;

        /* renamed from: d, reason: collision with root package name */
        public long f98713d = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f98715f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f98716g = -1;

        public final void c(long j11) {
            C9681g c9681g = this.f98710a;
            if (c9681g == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f98711b) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = c9681g.size();
            if (j11 <= size) {
                if (j11 < 0) {
                    throw new IllegalArgumentException(C3173b.b(j11, "newSize < 0: ").toString());
                }
                long j12 = size - j11;
                while (true) {
                    if (j12 <= 0) {
                        break;
                    }
                    H h11 = c9681g.f98708a;
                    Intrinsics.f(h11);
                    H h12 = h11.f98676g;
                    Intrinsics.f(h12);
                    int i11 = h12.f98672c;
                    long j13 = i11 - h12.f98671b;
                    if (j13 > j12) {
                        h12.f98672c = i11 - ((int) j12);
                        break;
                    } else {
                        c9681g.f98708a = h12.a();
                        I.a(h12);
                        j12 -= j13;
                    }
                }
                this.f98712c = null;
                this.f98713d = j11;
                this.f98714e = null;
                this.f98715f = -1;
                this.f98716g = -1;
            } else if (j11 > size) {
                long j14 = j11 - size;
                int i12 = 1;
                boolean z11 = true;
                for (long j15 = 0; j14 > j15; j15 = 0) {
                    H W11 = c9681g.W(i12);
                    int min = (int) Math.min(j14, 8192 - W11.f98672c);
                    int i13 = W11.f98672c + min;
                    W11.f98672c = i13;
                    j14 -= min;
                    if (z11) {
                        this.f98712c = W11;
                        this.f98713d = size;
                        this.f98714e = W11.f98670a;
                        this.f98715f = i13 - min;
                        this.f98716g = i13;
                        z11 = false;
                    }
                    i12 = 1;
                }
            }
            c9681g.O(j11);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f98710a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f98710a = null;
            this.f98712c = null;
            this.f98713d = -1L;
            this.f98714e = null;
            this.f98715f = -1;
            this.f98716g = -1;
        }

        public final int d(long j11) {
            C9681g c9681g = this.f98710a;
            if (c9681g == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j11 < -1 || j11 > c9681g.size()) {
                StringBuilder d11 = C2702w.d(j11, "offset=", " > size=");
                d11.append(c9681g.size());
                throw new ArrayIndexOutOfBoundsException(d11.toString());
            }
            if (j11 == -1 || j11 == c9681g.size()) {
                this.f98712c = null;
                this.f98713d = j11;
                this.f98714e = null;
                this.f98715f = -1;
                this.f98716g = -1;
                return -1;
            }
            long size = c9681g.size();
            H h11 = c9681g.f98708a;
            H h12 = this.f98712c;
            long j12 = 0;
            if (h12 != null) {
                long j13 = this.f98713d - (this.f98715f - h12.f98671b);
                if (j13 > j11) {
                    h12 = h11;
                    h11 = h12;
                    size = j13;
                } else {
                    j12 = j13;
                }
            } else {
                h12 = h11;
            }
            if (size - j11 > j11 - j12) {
                while (true) {
                    Intrinsics.f(h12);
                    long j14 = (h12.f98672c - h12.f98671b) + j12;
                    if (j11 < j14) {
                        break;
                    }
                    h12 = h12.f98675f;
                    j12 = j14;
                }
            } else {
                while (size > j11) {
                    Intrinsics.f(h11);
                    h11 = h11.f98676g;
                    Intrinsics.f(h11);
                    size -= h11.f98672c - h11.f98671b;
                }
                j12 = size;
                h12 = h11;
            }
            if (this.f98711b) {
                Intrinsics.f(h12);
                if (h12.f98673d) {
                    byte[] bArr = h12.f98670a;
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
                    H h13 = new H(copyOf, h12.f98671b, h12.f98672c, false, true);
                    if (c9681g.f98708a == h12) {
                        c9681g.f98708a = h13;
                    }
                    h12.b(h13);
                    H h14 = h13.f98676g;
                    Intrinsics.f(h14);
                    h14.a();
                    h12 = h13;
                }
            }
            this.f98712c = h12;
            this.f98713d = j11;
            Intrinsics.f(h12);
            this.f98714e = h12.f98670a;
            int i11 = h12.f98671b + ((int) (j11 - j12));
            this.f98715f = i11;
            int i12 = h12.f98672c;
            this.f98716g = i12;
            return i12 - i11;
        }
    }

    /* renamed from: sf.g$c */
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        @NotNull
        public final String toString() {
            return C9681g.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i11) {
            C9681g.this.d0(i11);
        }

        @Override // java.io.OutputStream
        public final void write(@NotNull byte[] data, int i11, int i12) {
            Intrinsics.checkNotNullParameter(data, "data");
            C9681g.this.b0(data, i11, i12);
        }
    }

    public final short B() throws EOFException {
        short readShort = readShort();
        int i11 = C9676b.f98695c;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @NotNull
    public final void D0(int i11, int i12, @NotNull String string) {
        char charAt;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "beginIndex < 0: ").toString());
        }
        if (i12 < i11) {
            throw new IllegalArgumentException(A0.a(i12, i11, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i12 > string.length()) {
            StringBuilder f7 = P4.f.f(i12, "endIndex > string.length: ", " > ");
            f7.append(string.length());
            throw new IllegalArgumentException(f7.toString().toString());
        }
        while (i11 < i12) {
            char charAt2 = string.charAt(i11);
            if (charAt2 < 128) {
                H W11 = W(1);
                int i13 = W11.f98672c - i11;
                int min = Math.min(i12, 8192 - i13);
                int i14 = i11 + 1;
                byte[] bArr = W11.f98670a;
                bArr[i11 + i13] = (byte) charAt2;
                while (true) {
                    i11 = i14;
                    if (i11 >= min || (charAt = string.charAt(i11)) >= 128) {
                        break;
                    }
                    i14 = i11 + 1;
                    bArr[i11 + i13] = (byte) charAt;
                }
                int i15 = W11.f98672c;
                int i16 = (i13 + i11) - i15;
                W11.f98672c = i15 + i16;
                this.f98709b += i16;
            } else {
                if (charAt2 < 2048) {
                    H W12 = W(2);
                    int i17 = W12.f98672c;
                    byte[] bArr2 = W12.f98670a;
                    bArr2[i17] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i17 + 1] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    W12.f98672c = i17 + 2;
                    this.f98709b += 2;
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    H W13 = W(3);
                    int i18 = W13.f98672c;
                    byte[] bArr3 = W13.f98670a;
                    bArr3[i18] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i18 + 1] = (byte) ((63 & (charAt2 >> 6)) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    bArr3[i18 + 2] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                    W13.f98672c = i18 + 3;
                    this.f98709b += 3;
                } else {
                    int i19 = i11 + 1;
                    char charAt3 = i19 < i12 ? string.charAt(i19) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        d0(63);
                        i11 = i19;
                    } else {
                        int i21 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        H W14 = W(4);
                        int i22 = W14.f98672c;
                        byte[] bArr4 = W14.f98670a;
                        bArr4[i22] = (byte) ((i21 >> 18) | 240);
                        bArr4[i22 + 1] = (byte) (((i21 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i22 + 2] = (byte) (((i21 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        bArr4[i22 + 3] = (byte) ((i21 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        W14.f98672c = i22 + 4;
                        this.f98709b += 4;
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
    }

    @Override // sf.InterfaceC9683i
    public final long F0(@NotNull C9684j targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return q(0L, targetBytes);
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final String G0() {
        return I(this.f98709b, Charsets.UTF_8);
    }

    @NotNull
    public final void H0(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        D0(0, string.length(), string);
    }

    @NotNull
    public final String I(long j11, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount: ").toString());
        }
        if (this.f98709b < j11) {
            throw new EOFException();
        }
        if (j11 == 0) {
            return "";
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        int i11 = h11.f98671b;
        if (i11 + j11 > h11.f98672c) {
            return new String(v(j11), charset);
        }
        int i12 = (int) j11;
        String str = new String(h11.f98670a, i11, i12, charset);
        int i13 = h11.f98671b + i12;
        h11.f98671b = i13;
        this.f98709b -= j11;
        if (i13 == h11.f98672c) {
            this.f98708a = h11.a();
            I.a(h11);
        }
        return str;
    }

    @NotNull
    public final void K0(int i11) {
        String str;
        if (i11 < 128) {
            d0(i11);
            return;
        }
        if (i11 < 2048) {
            H W11 = W(2);
            int i12 = W11.f98672c;
            byte[] bArr = W11.f98670a;
            bArr[i12] = (byte) ((i11 >> 6) | 192);
            bArr[1 + i12] = (byte) ((i11 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            W11.f98672c = i12 + 2;
            this.f98709b += 2;
            return;
        }
        if (55296 <= i11 && i11 < 57344) {
            d0(63);
            return;
        }
        if (i11 < 65536) {
            H W12 = W(3);
            int i13 = W12.f98672c;
            byte[] bArr2 = W12.f98670a;
            bArr2[i13] = (byte) ((i11 >> 12) | 224);
            bArr2[1 + i13] = (byte) (((i11 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr2[2 + i13] = (byte) ((i11 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            W12.f98672c = i13 + 3;
            this.f98709b += 3;
            return;
        }
        if (i11 <= 1114111) {
            H W13 = W(4);
            int i14 = W13.f98672c;
            byte[] bArr3 = W13.f98670a;
            bArr3[i14] = (byte) ((i11 >> 18) | 240);
            bArr3[1 + i14] = (byte) (((i11 >> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[2 + i14] = (byte) (((i11 >> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            bArr3[3 + i14] = (byte) ((i11 & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
            W13.f98672c = i14 + 4;
            this.f98709b += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        int i15 = C9676b.f98695c;
        if (i11 != 0) {
            char[] cArr = {C9870b.b()[(i11 >> 28) & 15], C9870b.b()[(i11 >> 24) & 15], C9870b.b()[(i11 >> 20) & 15], C9870b.b()[(i11 >> 16) & 15], C9870b.b()[(i11 >> 12) & 15], C9870b.b()[(i11 >> 8) & 15], C9870b.b()[(i11 >> 4) & 15], C9870b.b()[i11 & 15]};
            int i16 = 0;
            while (i16 < 8 && cArr[i16] == '0') {
                i16++;
            }
            Intrinsics.checkNotNullParameter(cArr, "<this>");
            AbstractC7696c.INSTANCE.getClass();
            if (i16 < 0) {
                StringBuilder a11 = C2438a.a("startIndex: ", i16, ", endIndex: ", ", size: ", 8);
                a11.append(8);
                throw new IndexOutOfBoundsException(a11.toString());
            }
            if (i16 > 8) {
                throw new IllegalArgumentException(A0.a(i16, 8, "startIndex: ", " > endIndex: "));
            }
            str = new String(cArr, i16, 8 - i16);
        } else {
            str = "0";
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final int L() throws EOFException {
        int i11;
        int i12;
        int i13;
        if (this.f98709b == 0) {
            throw new EOFException();
        }
        byte o11 = o(0L);
        if ((o11 & 128) == 0) {
            i11 = o11 & Byte.MAX_VALUE;
            i13 = 0;
            i12 = 1;
        } else if ((o11 & 224) == 192) {
            i11 = o11 & 31;
            i12 = 2;
            i13 = 128;
        } else if ((o11 & 240) == 224) {
            i11 = o11 & 15;
            i12 = 3;
            i13 = 2048;
        } else {
            if ((o11 & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i11 = o11 & 7;
            i12 = 4;
            i13 = 65536;
        }
        long j11 = i12;
        if (this.f98709b < j11) {
            StringBuilder f7 = P4.f.f(i12, "size < ", ": ");
            f7.append(this.f98709b);
            f7.append(" (to read code point prefixed 0x");
            f7.append(C9676b.i(o11));
            f7.append(')');
            throw new EOFException(f7.toString());
        }
        for (int i14 = 1; i14 < i12; i14++) {
            long j12 = i14;
            byte o12 = o(j12);
            if ((o12 & 192) != 128) {
                skip(j12);
                return 65533;
            }
            i11 = (i11 << 6) | (o12 & 63);
        }
        skip(j11);
        if (i11 > 1114111) {
            return 65533;
        }
        if ((55296 > i11 || i11 >= 57344) && i11 >= i13) {
            return i11;
        }
        return 65533;
    }

    public final void O(long j11) {
        this.f98709b = j11;
    }

    @Override // sf.InterfaceC9682h
    public final InterfaceC9682h P0() {
        return this;
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h P1(int i11, int i12, String str) {
        D0(i11, i12, str);
        return this;
    }

    @NotNull
    public final C9684j Q() {
        long j11 = this.f98709b;
        if (j11 <= 2147483647L) {
            return R((int) j11);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f98709b).toString());
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h Q1(C9684j c9684j) {
        X(c9684j);
        return this;
    }

    @NotNull
    public final C9684j R(int i11) {
        if (i11 == 0) {
            return C9684j.f98719d;
        }
        C9676b.b(this.f98709b, 0L, i11);
        H h11 = this.f98708a;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Intrinsics.f(h11);
            int i15 = h11.f98672c;
            int i16 = h11.f98671b;
            if (i15 == i16) {
                throw new AssertionError("s.limit == s.pos");
            }
            i13 += i15 - i16;
            i14++;
            h11 = h11.f98675f;
        }
        byte[][] bArr = new byte[i14][];
        int[] iArr = new int[i14 * 2];
        H h12 = this.f98708a;
        int i17 = 0;
        while (i12 < i11) {
            Intrinsics.f(h12);
            bArr[i17] = h12.f98670a;
            i12 += h12.f98672c - h12.f98671b;
            iArr[i17] = Math.min(i12, i11);
            iArr[i17 + i14] = h12.f98671b;
            h12.f98673d = true;
            i17++;
            h12 = h12.f98675f;
        }
        return new J(bArr, iArr);
    }

    @Override // sf.InterfaceC9683i
    public final int R0(@NotNull C9674B options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int d11 = C9869a.d(this, options, false);
        if (d11 == -1) {
            return -1;
        }
        skip(options.b()[d11].g());
        return d11;
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h U(byte[] bArr) {
        Z(bArr);
        return this;
    }

    @NotNull
    public final H W(int i11) {
        if (i11 < 1 || i11 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        H h11 = this.f98708a;
        if (h11 == null) {
            H b11 = I.b();
            this.f98708a = b11;
            b11.f98676g = b11;
            b11.f98675f = b11;
            return b11;
        }
        H h12 = h11.f98676g;
        Intrinsics.f(h12);
        if (h12.f98672c + i11 <= 8192 && h12.f98674e) {
            return h12;
        }
        H b12 = I.b();
        h12.b(b12);
        return b12;
    }

    @NotNull
    public final void X(@NotNull C9684j byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.I(this, byteString.g());
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h Y(long j11) {
        l0(j11);
        return this;
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h Y1(int i11, int i12, byte[] bArr) {
        b0(bArr, i11, i12);
        return this;
    }

    @NotNull
    public final void Z(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        b0(source, 0, source.length);
    }

    @Override // sf.InterfaceC9683i
    public final void a0(@NotNull C9681g sink, long j11) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j12 = this.f98709b;
        if (j12 >= j11) {
            sink.z0(this, j11);
        } else {
            sink.z0(this, j12);
            throw new EOFException();
        }
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final InputStream a2() {
        return new b();
    }

    @NotNull
    public final void b0(@NotNull byte[] source, int i11, int i12) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = i12;
        C9676b.b(source.length, i11, j11);
        int i13 = i12 + i11;
        while (i11 < i13) {
            H W11 = W(1);
            int min = Math.min(i13 - i11, 8192 - W11.f98672c);
            int i14 = i11 + min;
            C7705l.o(W11.f98672c, i11, i14, source, W11.f98670a);
            W11.f98672c += min;
            i11 = i14;
        }
        this.f98709b += j11;
    }

    @Override // sf.InterfaceC9683i
    public final long b1(byte b11, long j11, long j12) {
        H h11;
        long j13 = 0;
        if (0 > j11 || j11 > j12) {
            StringBuilder sb2 = new StringBuilder("size=");
            sb2.append(this.f98709b);
            C2942q.f(sb2, " fromIndex=", j11, " toIndex=");
            sb2.append(j12);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j14 = this.f98709b;
        if (j12 > j14) {
            j12 = j14;
        }
        if (j11 == j12 || (h11 = this.f98708a) == null) {
            return -1L;
        }
        if (j14 - j11 < j11) {
            while (j14 > j11) {
                h11 = h11.f98676g;
                Intrinsics.f(h11);
                j14 -= h11.f98672c - h11.f98671b;
            }
            while (j14 < j12) {
                int min = (int) Math.min(h11.f98672c, (h11.f98671b + j12) - j14);
                for (int i11 = (int) ((h11.f98671b + j11) - j14); i11 < min; i11++) {
                    if (h11.f98670a[i11] == b11) {
                        return (i11 - h11.f98671b) + j14;
                    }
                }
                j14 += h11.f98672c - h11.f98671b;
                h11 = h11.f98675f;
                Intrinsics.f(h11);
                j11 = j14;
            }
            return -1L;
        }
        while (true) {
            long j15 = (h11.f98672c - h11.f98671b) + j13;
            if (j15 > j11) {
                break;
            }
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j13 = j15;
        }
        while (j13 < j12) {
            int min2 = (int) Math.min(h11.f98672c, (h11.f98671b + j12) - j13);
            for (int i12 = (int) ((h11.f98671b + j11) - j13); i12 < min2; i12++) {
                if (h11.f98670a[i12] == b11) {
                    return (i12 - h11.f98671b) + j13;
                }
            }
            j13 += h11.f98672c - h11.f98671b;
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j11 = j13;
        }
        return -1L;
    }

    public final void c() {
        skip(this.f98709b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, sf.K
    public final void close() {
    }

    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C9681g clone() {
        C9681g c9681g = new C9681g();
        if (this.f98709b == 0) {
            return c9681g;
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        H c11 = h11.c();
        c9681g.f98708a = c11;
        c11.f98676g = c11;
        c11.f98675f = c11;
        for (H h12 = h11.f98675f; h12 != h11; h12 = h12.f98675f) {
            H h13 = c11.f98676g;
            Intrinsics.f(h13);
            Intrinsics.f(h12);
            h13.b(h12.c());
        }
        c9681g.f98709b = this.f98709b;
        return c9681g;
    }

    @NotNull
    public final void d0(int i11) {
        H W11 = W(1);
        int i12 = W11.f98672c;
        W11.f98672c = i12 + 1;
        W11.f98670a[i12] = (byte) i11;
        this.f98709b++;
    }

    public final boolean equals(Object obj) {
        boolean z11 = true;
        if (this == obj) {
            return true;
        }
        boolean z12 = false;
        if (!(obj instanceof C9681g)) {
            return false;
        }
        long j11 = this.f98709b;
        C9681g c9681g = (C9681g) obj;
        if (j11 != c9681g.f98709b) {
            return false;
        }
        if (j11 == 0) {
            return true;
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        H h12 = c9681g.f98708a;
        Intrinsics.f(h12);
        int i11 = h11.f98671b;
        int i12 = h12.f98671b;
        long j12 = 0;
        while (j12 < this.f98709b) {
            long min = Math.min(h11.f98672c - i11, h12.f98672c - i12);
            long j13 = 0;
            while (j13 < min) {
                int i13 = i11 + 1;
                boolean z13 = z11;
                byte b11 = h11.f98670a[i11];
                int i14 = i12 + 1;
                boolean z14 = z12;
                if (b11 != h12.f98670a[i12]) {
                    return z14;
                }
                j13++;
                i12 = i14;
                i11 = i13;
                z11 = z13;
                z12 = z14;
            }
            boolean z15 = z11;
            boolean z16 = z12;
            if (i11 == h11.f98672c) {
                H h13 = h11.f98675f;
                Intrinsics.f(h13);
                i11 = h13.f98671b;
                h11 = h13;
            }
            if (i12 == h12.f98672c) {
                h12 = h12.f98675f;
                Intrinsics.f(h12);
                i12 = h12.f98671b;
            }
            j12 += min;
            z11 = z15;
            z12 = z16;
        }
        return z11;
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final C9681g f() {
        return this;
    }

    @Override // sf.InterfaceC9682h, sf.K, java.io.Flushable
    public final void flush() {
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final byte[] g0() {
        return v(this.f98709b);
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h h0(int i11) {
        d0(i11);
        return this;
    }

    @Override // sf.InterfaceC9682h
    public final /* bridge */ /* synthetic */ InterfaceC9682h h1(String str) {
        H0(str);
        return this;
    }

    public final int hashCode() {
        H h11 = this.f98708a;
        if (h11 == null) {
            return 0;
        }
        int i11 = 1;
        do {
            int i12 = h11.f98672c;
            for (int i13 = h11.f98671b; i13 < i12; i13++) {
                i11 = (i11 * 31) + h11.f98670a[i13];
            }
            h11 = h11.f98675f;
            Intrinsics.f(h11);
        } while (h11 != this.f98708a);
        return i11;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long j() {
        long j11 = this.f98709b;
        if (j11 == 0) {
            return 0L;
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        H h12 = h11.f98676g;
        Intrinsics.f(h12);
        return (h12.f98672c >= 8192 || !h12.f98674e) ? j11 : j11 - (r3 - h12.f98671b);
    }

    @NotNull
    public final void k(@NotNull C9681g out, long j11, long j12) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j13 = j11;
        C9676b.b(this.f98709b, j13, j12);
        if (j12 == 0) {
            return;
        }
        out.f98709b += j12;
        H h11 = this.f98708a;
        while (true) {
            Intrinsics.f(h11);
            long j14 = h11.f98672c - h11.f98671b;
            if (j13 < j14) {
                break;
            }
            j13 -= j14;
            h11 = h11.f98675f;
        }
        H h12 = h11;
        long j15 = j12;
        while (j15 > 0) {
            Intrinsics.f(h12);
            H c11 = h12.c();
            int i11 = c11.f98671b + ((int) j13);
            c11.f98671b = i11;
            c11.f98672c = Math.min(i11 + ((int) j15), c11.f98672c);
            H h13 = out.f98708a;
            if (h13 == null) {
                c11.f98676g = c11;
                c11.f98675f = c11;
                out.f98708a = c11;
            } else {
                H h14 = h13.f98676g;
                Intrinsics.f(h14);
                h14.b(c11);
            }
            j15 -= c11.f98672c - c11.f98671b;
            h12 = h12.f98675f;
            j13 = 0;
        }
    }

    @NotNull
    public final void l0(long j11) {
        boolean z11;
        byte[] bArr;
        if (j11 == 0) {
            d0(48);
            return;
        }
        int i11 = 1;
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                H0("-9223372036854775808");
                return;
            }
            z11 = true;
        } else {
            z11 = false;
        }
        if (j11 >= 100000000) {
            i11 = j11 < 1000000000000L ? j11 < 10000000000L ? j11 < 1000000000 ? 9 : 10 : j11 < 100000000000L ? 11 : 12 : j11 < 1000000000000000L ? j11 < 10000000000000L ? 13 : j11 < 100000000000000L ? 14 : 15 : j11 < 100000000000000000L ? j11 < 10000000000000000L ? 16 : 17 : j11 < 1000000000000000000L ? 18 : 19;
        } else if (j11 >= 10000) {
            i11 = j11 < 1000000 ? j11 < 100000 ? 5 : 6 : j11 < 10000000 ? 7 : 8;
        } else if (j11 >= 100) {
            i11 = j11 < 1000 ? 3 : 4;
        } else if (j11 >= 10) {
            i11 = 2;
        }
        if (z11) {
            i11++;
        }
        H W11 = W(i11);
        int i12 = W11.f98672c + i11;
        while (true) {
            bArr = W11.f98670a;
            if (j11 == 0) {
                break;
            }
            long j12 = 10;
            i12--;
            bArr[i12] = C9869a.a()[(int) (j11 % j12)];
            j11 /= j12;
        }
        if (z11) {
            bArr[i12 - 1] = 45;
        }
        W11.f98672c += i11;
        this.f98709b += i11;
    }

    public final boolean m() {
        return this.f98709b == 0;
    }

    @Override // sf.InterfaceC9683i
    public final boolean n(long j11) {
        return this.f98709b >= j11;
    }

    @Override // sf.InterfaceC9683i
    public final long n0(@NotNull C9684j bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return p(0L, bytes);
    }

    public final byte o(long j11) {
        C9676b.b(this.f98709b, j11, 1L);
        H h11 = this.f98708a;
        if (h11 == null) {
            Intrinsics.f(null);
            throw null;
        }
        long j12 = this.f98709b;
        if (j12 - j11 < j11) {
            while (j12 > j11) {
                h11 = h11.f98676g;
                Intrinsics.f(h11);
                j12 -= h11.f98672c - h11.f98671b;
            }
            return h11.f98670a[(int) ((h11.f98671b + j11) - j12)];
        }
        long j13 = 0;
        while (true) {
            int i11 = h11.f98672c;
            int i12 = h11.f98671b;
            long j14 = (i11 - i12) + j13;
            if (j14 > j11) {
                return h11.f98670a[(int) ((i12 + j11) - j13)];
            }
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j13 = j14;
        }
    }

    @NotNull
    public final void o0(long j11) {
        if (j11 == 0) {
            d0(48);
            return;
        }
        long j12 = (j11 >>> 1) | j11;
        long j13 = j12 | (j12 >>> 2);
        long j14 = j13 | (j13 >>> 4);
        long j15 = j14 | (j14 >>> 8);
        long j16 = j15 | (j15 >>> 16);
        long j17 = j16 | (j16 >>> 32);
        long j18 = j17 - ((j17 >>> 1) & 6148914691236517205L);
        long j19 = ((j18 >>> 2) & 3689348814741910323L) + (j18 & 3689348814741910323L);
        long j21 = ((j19 >>> 4) + j19) & 1085102592571150095L;
        long j22 = j21 + (j21 >>> 8);
        long j23 = j22 + (j22 >>> 16);
        int i11 = (int) ((((j23 & 63) + ((j23 >>> 32) & 63)) + 3) / 4);
        H W11 = W(i11);
        int i12 = W11.f98672c;
        for (int i13 = (i12 + i11) - 1; i13 >= i12; i13--) {
            W11.f98670a[i13] = C9869a.a()[(int) (15 & j11)];
            j11 >>>= 4;
        }
        W11.f98672c += i11;
        this.f98709b += i11;
    }

    @Override // sf.InterfaceC9683i
    public final long o1(@NotNull InterfaceC9682h sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j11 = this.f98709b;
        if (j11 > 0) {
            sink.z0(this, j11);
        }
        return j11;
    }

    public final long p(long j11, @NotNull C9684j bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.g() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "fromIndex < 0: ").toString());
        }
        H h11 = this.f98708a;
        if (h11 == null) {
            return -1L;
        }
        long j13 = this.f98709b;
        if (j13 - j11 < j11) {
            while (j13 > j11) {
                h11 = h11.f98676g;
                Intrinsics.f(h11);
                j13 -= h11.f98672c - h11.f98671b;
            }
            byte[] m11 = bytes.m();
            byte b11 = m11[0];
            int g10 = bytes.g();
            long j14 = (this.f98709b - g10) + 1;
            while (j13 < j14) {
                int min = (int) Math.min(h11.f98672c, (h11.f98671b + j14) - j13);
                for (int i11 = (int) ((h11.f98671b + j11) - j13); i11 < min; i11++) {
                    if (h11.f98670a[i11] == b11 && C9869a.b(h11, i11 + 1, m11, g10)) {
                        return (i11 - h11.f98671b) + j13;
                    }
                }
                j13 += h11.f98672c - h11.f98671b;
                h11 = h11.f98675f;
                Intrinsics.f(h11);
                j11 = j13;
            }
            return -1L;
        }
        while (true) {
            long j15 = (h11.f98672c - h11.f98671b) + j12;
            if (j15 > j11) {
                break;
            }
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j12 = j15;
        }
        byte[] m12 = bytes.m();
        byte b12 = m12[0];
        int g11 = bytes.g();
        long j16 = (this.f98709b - g11) + 1;
        while (j12 < j16) {
            int min2 = (int) Math.min(h11.f98672c, (h11.f98671b + j16) - j12);
            for (int i12 = (int) ((h11.f98671b + j11) - j12); i12 < min2; i12++) {
                if (h11.f98670a[i12] == b12 && C9869a.b(h11, i12 + 1, m12, g11)) {
                    return (i12 - h11.f98671b) + j12;
                }
            }
            j12 += h11.f98672c - h11.f98671b;
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j11 = j12;
        }
        return -1L;
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final G peek() {
        return z.d(new E(this));
    }

    public final long q(long j11, @NotNull C9684j targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "fromIndex < 0: ").toString());
        }
        H h11 = this.f98708a;
        if (h11 == null) {
            return -1L;
        }
        long j13 = this.f98709b;
        if (j13 - j11 < j11) {
            while (j13 > j11) {
                h11 = h11.f98676g;
                Intrinsics.f(h11);
                j13 -= h11.f98672c - h11.f98671b;
            }
            if (targetBytes.g() == 2) {
                byte n11 = targetBytes.n(0);
                byte n12 = targetBytes.n(1);
                while (j13 < this.f98709b) {
                    int i11 = h11.f98672c;
                    for (int i12 = (int) ((h11.f98671b + j11) - j13); i12 < i11; i12++) {
                        byte b11 = h11.f98670a[i12];
                        if (b11 == n11 || b11 == n12) {
                            return (i12 - h11.f98671b) + j13;
                        }
                    }
                    j13 += h11.f98672c - h11.f98671b;
                    h11 = h11.f98675f;
                    Intrinsics.f(h11);
                    j11 = j13;
                }
            } else {
                byte[] m11 = targetBytes.m();
                while (j13 < this.f98709b) {
                    int i13 = h11.f98672c;
                    for (int i14 = (int) ((h11.f98671b + j11) - j13); i14 < i13; i14++) {
                        byte b12 = h11.f98670a[i14];
                        for (byte b13 : m11) {
                            if (b12 == b13) {
                                return (i14 - h11.f98671b) + j13;
                            }
                        }
                    }
                    j13 += h11.f98672c - h11.f98671b;
                    h11 = h11.f98675f;
                    Intrinsics.f(h11);
                    j11 = j13;
                }
            }
            return -1L;
        }
        while (true) {
            long j14 = (h11.f98672c - h11.f98671b) + j12;
            if (j14 > j11) {
                break;
            }
            h11 = h11.f98675f;
            Intrinsics.f(h11);
            j12 = j14;
        }
        if (targetBytes.g() == 2) {
            byte n13 = targetBytes.n(0);
            byte n14 = targetBytes.n(1);
            while (j12 < this.f98709b) {
                int i15 = h11.f98672c;
                for (int i16 = (int) ((h11.f98671b + j11) - j12); i16 < i15; i16++) {
                    byte b14 = h11.f98670a[i16];
                    if (b14 == n13 || b14 == n14) {
                        return (i16 - h11.f98671b) + j12;
                    }
                }
                j12 += h11.f98672c - h11.f98671b;
                h11 = h11.f98675f;
                Intrinsics.f(h11);
                j11 = j12;
            }
        } else {
            byte[] m12 = targetBytes.m();
            while (j12 < this.f98709b) {
                int i17 = h11.f98672c;
                for (int i18 = (int) ((h11.f98671b + j11) - j12); i18 < i17; i18++) {
                    byte b15 = h11.f98670a[i18];
                    for (byte b16 : m12) {
                        if (b15 == b16) {
                            return (i18 - h11.f98671b) + j12;
                        }
                    }
                }
                j12 += h11.f98672c - h11.f98671b;
                h11 = h11.f98675f;
                Intrinsics.f(h11);
                j11 = j12;
            }
        }
        return -1L;
    }

    @NotNull
    public final OutputStream r() {
        return new c();
    }

    @NotNull
    public final void r0(int i11) {
        H W11 = W(4);
        int i12 = W11.f98672c;
        byte[] bArr = W11.f98670a;
        bArr[i12] = (byte) ((i11 >>> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >>> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
        W11.f98672c = i12 + 4;
        this.f98709b += 4;
    }

    @Override // sf.InterfaceC9683i
    public final void r1(long j11) throws EOFException {
        if (this.f98709b < j11) {
            throw new EOFException();
        }
    }

    @Override // sf.M
    public final long read(@NotNull C9681g sink, long j11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount < 0: ").toString());
        }
        long j12 = this.f98709b;
        if (j12 == 0) {
            return -1L;
        }
        if (j11 > j12) {
            j11 = j12;
        }
        sink.z0(this, j11);
        return j11;
    }

    @Override // sf.InterfaceC9683i
    public final byte readByte() throws EOFException {
        if (this.f98709b == 0) {
            throw new EOFException();
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        int i11 = h11.f98671b;
        int i12 = h11.f98672c;
        int i13 = i11 + 1;
        byte b11 = h11.f98670a[i11];
        this.f98709b--;
        if (i13 != i12) {
            h11.f98671b = i13;
            return b11;
        }
        this.f98708a = h11.a();
        I.a(h11);
        return b11;
    }

    @Override // sf.InterfaceC9683i
    public final void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i11 = 0;
        while (i11 < sink.length) {
            int s11 = s(sink, i11, sink.length - i11);
            if (s11 == -1) {
                throw new EOFException();
            }
            i11 += s11;
        }
    }

    @Override // sf.InterfaceC9683i
    public final long readLong() throws EOFException {
        if (this.f98709b < 8) {
            throw new EOFException();
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        int i11 = h11.f98671b;
        int i12 = h11.f98672c;
        if (i12 - i11 < 8) {
            return ((z() & 4294967295L) << 32) | (4294967295L & z());
        }
        byte[] bArr = h11.f98670a;
        int i13 = i11 + 7;
        long j11 = ((bArr[i11 + 3] & 255) << 32) | ((bArr[i11] & 255) << 56) | ((bArr[i11 + 1] & 255) << 48) | ((bArr[i11 + 2] & 255) << 40) | ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8);
        int i14 = i11 + 8;
        long j12 = j11 | (bArr[i13] & 255);
        this.f98709b -= 8;
        if (i14 != i12) {
            h11.f98671b = i14;
            return j12;
        }
        this.f98708a = h11.a();
        I.a(h11);
        return j12;
    }

    @Override // sf.InterfaceC9683i
    public final short readShort() throws EOFException {
        if (this.f98709b < 2) {
            throw new EOFException();
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        int i11 = h11.f98671b;
        int i12 = h11.f98672c;
        if (i12 - i11 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i13 = i11 + 1;
        byte[] bArr = h11.f98670a;
        int i14 = (bArr[i11] & 255) << 8;
        int i15 = i11 + 2;
        int i16 = (bArr[i13] & 255) | i14;
        this.f98709b -= 2;
        if (i15 == i12) {
            this.f98708a = h11.a();
            I.a(h11);
        } else {
            h11.f98671b = i15;
        }
        return (short) i16;
    }

    public final int s(@NotNull byte[] sink, int i11, int i12) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        C9676b.b(sink.length, i11, i12);
        H h11 = this.f98708a;
        if (h11 == null) {
            return -1;
        }
        int min = Math.min(i12, h11.f98672c - h11.f98671b);
        int i13 = h11.f98671b;
        C7705l.o(i11, i13, i13 + min, h11.f98670a, sink);
        int i14 = h11.f98671b + min;
        h11.f98671b = i14;
        this.f98709b -= min;
        if (i14 == h11.f98672c) {
            this.f98708a = h11.a();
            I.a(h11);
        }
        return min;
    }

    @NotNull
    public final void s0(long j11) {
        H W11 = W(8);
        int i11 = W11.f98672c;
        byte[] bArr = W11.f98670a;
        bArr[i11] = (byte) ((j11 >>> 56) & 255);
        bArr[i11 + 1] = (byte) ((j11 >>> 48) & 255);
        bArr[i11 + 2] = (byte) ((j11 >>> 40) & 255);
        bArr[i11 + 3] = (byte) ((j11 >>> 32) & 255);
        bArr[i11 + 4] = (byte) ((j11 >>> 24) & 255);
        bArr[i11 + 5] = (byte) ((j11 >>> 16) & 255);
        bArr[i11 + 6] = (byte) ((j11 >>> 8) & 255);
        bArr[i11 + 7] = (byte) (j11 & 255);
        W11.f98672c = i11 + 8;
        this.f98709b += 8;
    }

    public final long size() {
        return this.f98709b;
    }

    @Override // sf.InterfaceC9683i
    public final void skip(long j11) throws EOFException {
        while (j11 > 0) {
            H h11 = this.f98708a;
            if (h11 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j11, h11.f98672c - h11.f98671b);
            long j12 = min;
            this.f98709b -= j12;
            j11 -= j12;
            int i11 = h11.f98671b + min;
            h11.f98671b = i11;
            if (i11 == h11.f98672c) {
                this.f98708a = h11.a();
                I.a(h11);
            }
        }
    }

    @NotNull
    public final a t(@NotNull a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        int i11 = C9869a.f99483b;
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        a g10 = C9676b.g(unsafeCursor);
        if (g10.f98710a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g10.f98710a = this;
        g10.f98711b = true;
        return g10;
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final String t0(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return I(this.f98709b, charset);
    }

    @Override // sf.M
    @NotNull
    public final N timeout() {
        return N.f98683d;
    }

    @NotNull
    public final String toString() {
        return Q().toString();
    }

    @NotNull
    public final void u0(int i11) {
        H W11 = W(2);
        int i12 = W11.f98672c;
        byte[] bArr = W11.f98670a;
        bArr[i12] = (byte) ((i11 >>> 8) & 255);
        bArr[i12 + 1] = (byte) (i11 & 255);
        W11.f98672c = i12 + 2;
        this.f98709b += 2;
    }

    @NotNull
    public final byte[] v(long j11) throws EOFException {
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount: ").toString());
        }
        if (this.f98709b < j11) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j11];
        readFully(bArr);
        return bArr;
    }

    @Override // sf.InterfaceC9683i
    @NotNull
    public final C9684j v0() {
        return w(this.f98709b);
    }

    @NotNull
    public final C9684j w(long j11) throws EOFException {
        if (j11 < 0 || j11 > 2147483647L) {
            throw new IllegalArgumentException(C3173b.b(j11, "byteCount: ").toString());
        }
        if (this.f98709b < j11) {
            throw new EOFException();
        }
        if (j11 < 4096) {
            return new C9684j(v(j11));
        }
        C9684j R11 = R((int) j11);
        skip(j11);
        return R11;
    }

    @Override // sf.InterfaceC9683i
    public final boolean w1(long j11, @NotNull C9684j bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int g10 = bytes.g();
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j11 >= 0 && g10 >= 0 && this.f98709b - j11 >= g10 && bytes.g() >= g10) {
            for (int i11 = 0; i11 < g10; i11++) {
                if (o(i11 + j11) == bytes.n(i11)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i11 = remaining;
        while (i11 > 0) {
            H W11 = W(1);
            int min = Math.min(i11, 8192 - W11.f98672c);
            source.get(W11.f98670a, W11.f98672c, min);
            i11 -= min;
            W11.f98672c += min;
        }
        this.f98709b += remaining;
        return remaining;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008f, code lost:
    
        r3 = r17.f98709b - r1;
        r17.f98709b = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:
    
        if (r2 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0098, code lost:
    
        if (r1 >= r13) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r3 == r15) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        r1 = E0.C2942q.e(r1, " but was 0x");
        r1.append(sf.C9676b.i(o(r15)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a3, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c6, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c7, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:
    
        return -r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long x() throws EOFException {
        long j11;
        byte b11;
        long j12 = 0;
        if (this.f98709b == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z11 = false;
        long j13 = 0;
        long j14 = -7;
        boolean z12 = false;
        loop0: while (true) {
            H h11 = this.f98708a;
            Intrinsics.f(h11);
            int i12 = h11.f98671b;
            int i13 = h11.f98672c;
            while (true) {
                int i14 = 1;
                if (i12 >= i13) {
                    j11 = j12;
                    break;
                }
                b11 = h11.f98670a[i12];
                if (b11 < 48 || b11 > 57) {
                    j11 = j12;
                    if (b11 != 45 || i11 != 0) {
                        break;
                    }
                    j14--;
                    z11 = true;
                } else {
                    int i15 = 48 - b11;
                    if (j13 < -922337203685477580L) {
                        break loop0;
                    }
                    if (j13 == -922337203685477580L) {
                        j11 = j12;
                        if (i15 < j14) {
                            break loop0;
                        }
                    } else {
                        j11 = j12;
                    }
                    j13 = (j13 * 10) + i15;
                }
                i12++;
                i11++;
                j12 = j11;
            }
            if (i12 == i13) {
                this.f98708a = h11.a();
                I.a(h11);
            } else {
                h11.f98671b = i12;
            }
            if (z12 || this.f98708a == null) {
                break;
            }
            j12 = j11;
        }
        C9681g c9681g = new C9681g();
        c9681g.l0(j13);
        c9681g.d0(b11);
        if (!z11) {
            c9681g.readByte();
        }
        throw new NumberFormatException("Number too large: ".concat(c9681g.G0()));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[EDGE_INSN: B:40:0x008d->B:37:0x008d BREAK  A[LOOP:0: B:4:0x000b->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y() throws EOFException {
        int i11;
        if (this.f98709b == 0) {
            throw new EOFException();
        }
        int i12 = 0;
        boolean z11 = false;
        long j11 = 0;
        do {
            H h11 = this.f98708a;
            Intrinsics.f(h11);
            int i13 = h11.f98671b;
            int i14 = h11.f98672c;
            while (i13 < i14) {
                byte b11 = h11.f98670a[i13];
                if (b11 >= 48 && b11 <= 57) {
                    i11 = b11 - 48;
                } else if (b11 >= 97 && b11 <= 102) {
                    i11 = b11 - 87;
                } else if (b11 >= 65 && b11 <= 70) {
                    i11 = b11 - 55;
                } else {
                    if (i12 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(C9676b.i(b11)));
                    }
                    z11 = true;
                    if (i13 != i14) {
                        this.f98708a = h11.a();
                        I.a(h11);
                    } else {
                        h11.f98671b = i13;
                    }
                    if (!z11) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j11) != 0) {
                    C9681g c9681g = new C9681g();
                    c9681g.o0(j11);
                    c9681g.d0(b11);
                    throw new NumberFormatException("Number too large: ".concat(c9681g.G0()));
                }
                j11 = (j11 << 4) | i11;
                i13++;
                i12++;
            }
            if (i13 != i14) {
            }
            if (!z11) {
            }
        } while (this.f98708a != null);
        this.f98709b -= i12;
        return j11;
    }

    @Override // sf.InterfaceC9682h
    public final long y0(@NotNull M source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j11 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read == -1) {
                return j11;
            }
            j11 += read;
        }
    }

    public final int z() throws EOFException {
        if (this.f98709b < 4) {
            throw new EOFException();
        }
        H h11 = this.f98708a;
        Intrinsics.f(h11);
        int i11 = h11.f98671b;
        int i12 = h11.f98672c;
        if (i12 - i11 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = h11.f98670a;
        int i13 = i11 + 3;
        int i14 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
        int i15 = i11 + 4;
        int i16 = i14 | (bArr[i13] & 255);
        this.f98709b -= 4;
        if (i15 != i12) {
            h11.f98671b = i15;
            return i16;
        }
        this.f98708a = h11.a();
        I.a(h11);
        return i16;
    }

    @Override // sf.K
    public final void z0(@NotNull C9681g source, long j11) {
        H b11;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        C9676b.b(source.f98709b, 0L, j11);
        while (j11 > 0) {
            H h11 = source.f98708a;
            Intrinsics.f(h11);
            int i11 = h11.f98672c;
            H h12 = source.f98708a;
            Intrinsics.f(h12);
            long j12 = i11 - h12.f98671b;
            int i12 = 0;
            if (j11 < j12) {
                H h13 = this.f98708a;
                H h14 = h13 != null ? h13.f98676g : null;
                if (h14 != null && h14.f98674e) {
                    if ((h14.f98672c + j11) - (h14.f98673d ? 0 : h14.f98671b) <= 8192) {
                        H h15 = source.f98708a;
                        Intrinsics.f(h15);
                        h15.d(h14, (int) j11);
                        source.f98709b -= j11;
                        this.f98709b += j11;
                        return;
                    }
                }
                H h16 = source.f98708a;
                Intrinsics.f(h16);
                int i13 = (int) j11;
                if (i13 <= 0 || i13 > h16.f98672c - h16.f98671b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i13 >= 1024) {
                    b11 = h16.c();
                } else {
                    b11 = I.b();
                    int i14 = h16.f98671b;
                    C7705l.s(i14, i14 + i13, 2, h16.f98670a, b11.f98670a);
                }
                b11.f98672c = b11.f98671b + i13;
                h16.f98671b += i13;
                H h17 = h16.f98676g;
                Intrinsics.f(h17);
                h17.b(b11);
                source.f98708a = b11;
            }
            H h18 = source.f98708a;
            Intrinsics.f(h18);
            long j13 = h18.f98672c - h18.f98671b;
            source.f98708a = h18.a();
            H h19 = this.f98708a;
            if (h19 == null) {
                this.f98708a = h18;
                h18.f98676g = h18;
                h18.f98675f = h18;
            } else {
                H h21 = h19.f98676g;
                Intrinsics.f(h21);
                h21.b(h18);
                H h22 = h18.f98676g;
                if (h22 == h18) {
                    throw new IllegalStateException("cannot compact");
                }
                Intrinsics.f(h22);
                if (h22.f98674e) {
                    int i15 = h18.f98672c - h18.f98671b;
                    H h23 = h18.f98676g;
                    Intrinsics.f(h23);
                    int i16 = 8192 - h23.f98672c;
                    H h24 = h18.f98676g;
                    Intrinsics.f(h24);
                    if (!h24.f98673d) {
                        H h25 = h18.f98676g;
                        Intrinsics.f(h25);
                        i12 = h25.f98671b;
                    }
                    if (i15 <= i16 + i12) {
                        H h26 = h18.f98676g;
                        Intrinsics.f(h26);
                        h18.d(h26, i15);
                        h18.a();
                        I.a(h18);
                    }
                }
            }
            source.f98709b -= j13;
            this.f98709b += j13;
            j11 -= j13;
        }
    }

    /* renamed from: sf.g$b */
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C9681g.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            C9681g c9681g = C9681g.this;
            if (c9681g.size() > 0) {
                return c9681g.readByte() & 255;
            }
            return -1;
        }

        @NotNull
        public final String toString() {
            return C9681g.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] sink, int i11, int i12) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return C9681g.this.s(sink, i11, i12);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        H h11 = this.f98708a;
        if (h11 == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), h11.f98672c - h11.f98671b);
        sink.put(h11.f98670a, h11.f98671b, min);
        int i11 = h11.f98671b + min;
        h11.f98671b = i11;
        this.f98709b -= min;
        if (i11 == h11.f98672c) {
            this.f98708a = h11.a();
            I.a(h11);
        }
        return min;
    }
}
