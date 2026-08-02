package com.google.crypto.tink.shaded.protobuf;

import B0.A0;
import C.C2702w;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5906l extends AbstractC5901g {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f59427b = Logger.getLogger(AbstractC5906l.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f59428c = p0.x();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f59429d = 0;

    /* renamed from: a, reason: collision with root package name */
    C5907m f59430a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    static class a extends AbstractC5906l {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f59431e;

        /* renamed from: f, reason: collision with root package name */
        private final int f59432f;

        /* renamed from: g, reason: collision with root package name */
        private int f59433g;

        a(int i11, byte[] bArr) {
            super(0);
            if (((bArr.length - i11) | i11) < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(A0.a(bArr.length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            this.f59431e = bArr;
            this.f59433g = 0;
            this.f59432f = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void A(int i11, long j11) throws IOException {
            x(i11, 0);
            B(j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void B(long j11) throws IOException {
            int i11;
            int i12 = this.f59433g;
            boolean z11 = AbstractC5906l.f59428c;
            byte[] bArr = this.f59431e;
            if (!z11 || m() < 10) {
                while ((j11 & (-128)) != 0) {
                    i11 = i12 + 1;
                    try {
                        bArr[i12] = (byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN);
                        j11 >>>= 7;
                        i12 = i11;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new b(i11, this.f59432f, 1, e11);
                    }
                }
                i11 = i12 + 1;
                bArr[i12] = (byte) j11;
            } else {
                while ((j11 & (-128)) != 0) {
                    p0.A(bArr, i12, (byte) (((int) j11) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j11 >>>= 7;
                    i12++;
                }
                i11 = i12 + 1;
                p0.A(bArr, i12, (byte) j11);
            }
            this.f59433g = i11;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5901g
        public final void a(byte[] bArr, int i11, int i12) throws IOException {
            try {
                System.arraycopy(bArr, i11, this.f59431e, this.f59433g, i12);
                this.f59433g += i12;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(this.f59433g, this.f59432f, i12, e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final int m() {
            return this.f59432f - this.f59433g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void n(byte b11) throws IOException {
            int i11 = this.f59433g;
            try {
                int i12 = i11 + 1;
                try {
                    this.f59431e[i11] = b11;
                    this.f59433g = i12;
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    i11 = i12;
                    throw new b(i11, this.f59432f, 1, e);
                }
            } catch (IndexOutOfBoundsException e12) {
                e = e12;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void o(int i11, boolean z11) throws IOException {
            x(i11, 0);
            n(z11 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void p(int i11, AbstractC5903i abstractC5903i) throws IOException {
            x(i11, 2);
            z(abstractC5903i.size());
            abstractC5903i.s(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void q(int i11, int i12) throws IOException {
            x(i11, 5);
            r(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void r(int i11) throws IOException {
            int i12 = this.f59433g;
            try {
                byte[] bArr = this.f59431e;
                bArr[i12] = (byte) i11;
                bArr[i12 + 1] = (byte) (i11 >> 8);
                bArr[i12 + 2] = (byte) (i11 >> 16);
                bArr[i12 + 3] = (byte) (i11 >> 24);
                this.f59433g = i12 + 4;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(i12, this.f59432f, 4, e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void s(int i11, long j11) throws IOException {
            x(i11, 1);
            t(j11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void t(long j11) throws IOException {
            int i11 = this.f59433g;
            try {
                byte[] bArr = this.f59431e;
                bArr[i11] = (byte) j11;
                bArr[i11 + 1] = (byte) (j11 >> 8);
                bArr[i11 + 2] = (byte) (j11 >> 16);
                bArr[i11 + 3] = (byte) (j11 >> 24);
                bArr[i11 + 4] = (byte) (j11 >> 32);
                bArr[i11 + 5] = (byte) (j11 >> 40);
                bArr[i11 + 6] = (byte) (j11 >> 48);
                bArr[i11 + 7] = (byte) (j11 >> 56);
                this.f59433g = i11 + 8;
            } catch (IndexOutOfBoundsException e11) {
                throw new b(i11, this.f59432f, 8, e11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void u(int i11, int i12) throws IOException {
            x(i11, 0);
            v(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void v(int i11) throws IOException {
            if (i11 >= 0) {
                z(i11);
            } else {
                B(i11);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void w(int i11, String str) throws IOException {
            x(i11, 2);
            int i12 = this.f59433g;
            try {
                int j11 = AbstractC5906l.j(str.length() * 3);
                int j12 = AbstractC5906l.j(str.length());
                byte[] bArr = this.f59431e;
                if (j12 != j11) {
                    z(q0.f(str));
                    this.f59433g = q0.e(str, bArr, this.f59433g, m());
                    return;
                }
                int i13 = i12 + j12;
                this.f59433g = i13;
                int e11 = q0.e(str, bArr, i13, m());
                this.f59433g = i12;
                z((e11 - i12) - j12);
                this.f59433g = e11;
            } catch (q0.d e12) {
                this.f59433g = i12;
                l(str, e12);
            } catch (IndexOutOfBoundsException e13) {
                throw new b(e13);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void x(int i11, int i12) throws IOException {
            z((i11 << 3) | i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void y(int i11, int i12) throws IOException {
            x(i11, 0);
            z(i12);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5906l
        public final void z(int i11) throws IOException {
            int i12;
            int i13 = this.f59433g;
            while (true) {
                int i14 = i11 & (-128);
                byte[] bArr = this.f59431e;
                if (i14 == 0) {
                    i12 = i13 + 1;
                    bArr[i13] = (byte) i11;
                    this.f59433g = i12;
                    return;
                } else {
                    i12 = i13 + 1;
                    try {
                        bArr[i13] = (byte) (i11 | UserVerificationMethods.USER_VERIFY_PATTERN);
                        i11 >>>= 7;
                        i13 = i12;
                    } catch (IndexOutOfBoundsException e11) {
                        throw new b(i12, this.f59432f, 1, e11);
                    }
                }
                throw new b(i12, this.f59432f, 1, e11);
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$b */
    /* loaded from: classes9.dex */
    public static class b extends IOException {
        b(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        b(int i11, int i12, int i13, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(r0.toString()), indexOutOfBoundsException);
            Locale locale = Locale.US;
            StringBuilder d11 = C2702w.d(i11, "Pos: ", ", limit: ");
            d11.append(i12);
            d11.append(", len: ");
            d11.append(i13);
        }
    }

    private AbstractC5906l() {
    }

    public static int c(int i11, AbstractC5903i abstractC5903i) {
        return d(abstractC5903i) + i(i11);
    }

    public static int d(AbstractC5903i abstractC5903i) {
        int size = abstractC5903i.size();
        return j(size) + size;
    }

    public static int e(D d11) {
        int a11 = d11.a();
        return j(a11) + a11;
    }

    public static int f(int i11) {
        return j((i11 >> 31) ^ (i11 << 1));
    }

    public static int g(long j11) {
        return k((j11 >> 63) ^ (j11 << 1));
    }

    public static int h(String str) {
        int length;
        try {
            length = q0.f(str);
        } catch (q0.d unused) {
            length = str.getBytes(C5919z.f59480a).length;
        }
        return j(length) + length;
    }

    public static int i(int i11) {
        return j(i11 << 3);
    }

    public static int j(int i11) {
        return (352 - (Integer.numberOfLeadingZeros(i11) * 9)) >>> 6;
    }

    public static int k(long j11) {
        return (640 - (Long.numberOfLeadingZeros(j11) * 9)) >>> 6;
    }

    public abstract void A(int i11, long j11) throws IOException;

    public abstract void B(long j11) throws IOException;

    final void l(String str, q0.d dVar) throws IOException {
        f59427b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(C5919z.f59480a);
        try {
            z(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e11) {
            throw new b(e11);
        }
    }

    public abstract int m();

    public abstract void n(byte b11) throws IOException;

    public abstract void o(int i11, boolean z11) throws IOException;

    public abstract void p(int i11, AbstractC5903i abstractC5903i) throws IOException;

    public abstract void q(int i11, int i12) throws IOException;

    public abstract void r(int i11) throws IOException;

    public abstract void s(int i11, long j11) throws IOException;

    public abstract void t(long j11) throws IOException;

    public abstract void u(int i11, int i12) throws IOException;

    public abstract void v(int i11) throws IOException;

    public abstract void w(int i11, String str) throws IOException;

    public abstract void x(int i11, int i12) throws IOException;

    public abstract void y(int i11, int i12) throws IOException;

    public abstract void z(int i11) throws IOException;

    /* synthetic */ AbstractC5906l(int i11) {
        this();
    }
}
