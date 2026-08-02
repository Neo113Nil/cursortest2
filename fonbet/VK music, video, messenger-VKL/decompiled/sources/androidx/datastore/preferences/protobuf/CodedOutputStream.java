package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.h0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.gu8;
import xsna.la20;
import xsna.m8h0;
import xsna.pqy;
import xsna.w5q0;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends gu8 {
    public static final Logger d = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean e = w5q0.e;
    public h c;

    /* loaded from: classes12.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
        }

        public OutOfSpaceException(String str, IndexOutOfBoundsException indexOutOfBoundsException) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(str), indexOutOfBoundsException);
        }
    }

    public static abstract class a extends CodedOutputStream {
        public final byte[] f;
        public final int g;
        public int h;

        public a(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f = bArr;
            this.g = bArr.length;
        }

        public final void N(int i) {
            int i2 = this.h;
            int i3 = i2 + 1;
            this.h = i3;
            byte[] bArr = this.f;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.h = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.h = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.h = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        }

        public final void O(long j) {
            int i = this.h;
            int i2 = i + 1;
            this.h = i2;
            byte[] bArr = this.f;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.h = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.h = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.h = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.h = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.h = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.h = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.h = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        }

        public final void P(int i, int i2) {
            Q((i << 3) | i2);
        }

        public final void Q(int i) {
            boolean z = CodedOutputStream.e;
            byte[] bArr = this.f;
            if (z) {
                while ((i & (-128)) != 0) {
                    int i2 = this.h;
                    this.h = i2 + 1;
                    w5q0.j(bArr, i2, (byte) ((i | 128) & 255));
                    i >>>= 7;
                }
                int i3 = this.h;
                this.h = i3 + 1;
                w5q0.j(bArr, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                int i4 = this.h;
                this.h = i4 + 1;
                bArr[i4] = (byte) ((i | 128) & 255);
                i >>>= 7;
            }
            int i5 = this.h;
            this.h = i5 + 1;
            bArr[i5] = (byte) i;
        }

        public final void R(long j) {
            boolean z = CodedOutputStream.e;
            byte[] bArr = this.f;
            if (z) {
                while ((j & (-128)) != 0) {
                    int i = this.h;
                    this.h = i + 1;
                    w5q0.j(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i2 = this.h;
                this.h = i2 + 1;
                w5q0.j(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                int i3 = this.h;
                this.h = i3 + 1;
                bArr[i3] = (byte) ((((int) j) | 128) & 255);
                j >>>= 7;
            }
            int i4 = this.h;
            this.h = i4 + 1;
            bArr[i4] = (byte) j;
        }
    }

    /* loaded from: classes12.dex */
    public static class b extends CodedOutputStream {
        public final byte[] f;
        public final int g;
        public int h;

        public b(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f = bArr;
            this.h = 0;
            this.g = i;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i, int i2) throws IOException {
            I(i, 0);
            B(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i) throws IOException {
            if (i >= 0) {
                K(i);
            } else {
                M(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(int i, la20 la20Var, m8h0 m8h0Var) throws IOException {
            I(i, 2);
            K(((androidx.datastore.preferences.protobuf.a) la20Var).d(m8h0Var));
            m8h0Var.h(la20Var, this.c);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(la20 la20Var) throws IOException {
            K(la20Var.getSerializedSize());
            la20Var.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i, la20 la20Var) throws IOException {
            I(1, 3);
            J(2, i);
            I(3, 2);
            D(la20Var);
            I(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(int i, ByteString byteString) throws IOException {
            I(1, 3);
            J(2, i);
            u(3, byteString);
            I(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i, String str) throws IOException {
            I(i, 2);
            H(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(String str) throws IOException {
            int i = this.h;
            try {
                int o = CodedOutputStream.o(str.length() * 3);
                int o2 = CodedOutputStream.o(str.length());
                int i2 = this.g;
                byte[] bArr = this.f;
                if (o2 != o) {
                    K(h0.a(str));
                    int i3 = this.h;
                    this.h = h0.a.b(str, bArr, i3, i2 - i3);
                    return;
                }
                int i4 = i + o2;
                this.h = i4;
                int b = h0.a.b(str, bArr, i4, i2 - i4);
                this.h = i;
                K((b - i) - o2);
                this.h = b;
            } catch (h0.d e) {
                this.h = i;
                q(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(int i, int i2) throws IOException {
            K((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(int i, int i2) throws IOException {
            I(i, 0);
            K(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i) throws IOException {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.f;
                if (i2 == 0) {
                    int i3 = this.h;
                    this.h = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.h;
                        this.h = i4 + 1;
                        bArr[i4] = (byte) ((i | 128) & 255);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(int i, long j) throws IOException {
            I(i, 0);
            M(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(long j) throws IOException {
            boolean z = CodedOutputStream.e;
            int i = this.g;
            byte[] bArr = this.f;
            if (z && i - this.h >= 10) {
                while ((j & (-128)) != 0) {
                    int i2 = this.h;
                    this.h = i2 + 1;
                    w5q0.j(bArr, i2, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i3 = this.h;
                this.h = i3 + 1;
                w5q0.j(bArr, i3, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i4 = this.h;
                    this.h = i4 + 1;
                    bArr[i4] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(i), 1), e);
                }
            }
            int i5 = this.h;
            this.h = i5 + 1;
            bArr[i5] = (byte) j;
        }

        public final void N(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f, this.h, i2);
                this.h += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), Integer.valueOf(i2)), e);
            }
        }

        @Override // xsna.gu8
        public final void g(byte[] bArr, int i, int i2) throws IOException {
            N(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r(byte b) throws IOException {
            try {
                byte[] bArr = this.f;
                int i = this.h;
                this.h = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s(int i, boolean z) throws IOException {
            I(i, 0);
            r(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t(int i, byte[] bArr) throws IOException {
            K(i);
            N(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i, ByteString byteString) throws IOException {
            I(i, 2);
            v(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(ByteString byteString) throws IOException {
            K(byteString.size());
            byteString.k(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(int i, int i2) throws IOException {
            I(i, 5);
            x(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i) throws IOException {
            try {
                byte[] bArr = this.f;
                int i2 = this.h;
                int i3 = i2 + 1;
                this.h = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.h = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.h = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.h = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(int i, long j) throws IOException {
            I(i, 1);
            z(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(long j) throws IOException {
            try {
                byte[] bArr = this.f;
                int i = this.h;
                int i2 = i + 1;
                this.h = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.h = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.h = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.h = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.h = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.h = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.h = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.h = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.h), Integer.valueOf(this.g), 1), e);
            }
        }
    }

    public static final class c extends a {
        public final OutputStream i;

        public c(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void A(int i, int i2) throws IOException {
            T(20);
            P(i, 0);
            if (i2 >= 0) {
                Q(i2);
            } else {
                R(i2);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void B(int i) throws IOException {
            if (i >= 0) {
                K(i);
            } else {
                M(i);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void C(int i, la20 la20Var, m8h0 m8h0Var) throws IOException {
            I(i, 2);
            K(((androidx.datastore.preferences.protobuf.a) la20Var).d(m8h0Var));
            m8h0Var.h(la20Var, this.c);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void D(la20 la20Var) throws IOException {
            K(la20Var.getSerializedSize());
            la20Var.b(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void E(int i, la20 la20Var) throws IOException {
            I(1, 3);
            J(2, i);
            I(3, 2);
            D(la20Var);
            I(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void F(int i, ByteString byteString) throws IOException {
            I(1, 3);
            J(2, i);
            u(3, byteString);
            I(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void G(int i, String str) throws IOException {
            I(i, 2);
            H(str);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void H(String str) throws IOException {
            try {
                int length = str.length() * 3;
                int o = CodedOutputStream.o(length);
                int i = o + length;
                int i2 = this.g;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int b = h0.a.b(str, bArr, 0, length);
                    K(b);
                    U(bArr, 0, b);
                    return;
                }
                if (i > i2 - this.h) {
                    S();
                }
                int o2 = CodedOutputStream.o(str.length());
                int i3 = this.h;
                byte[] bArr2 = this.f;
                try {
                    try {
                        if (o2 == o) {
                            int i4 = i3 + o2;
                            this.h = i4;
                            int b2 = h0.a.b(str, bArr2, i4, i2 - i4);
                            this.h = i3;
                            Q((b2 - i3) - o2);
                            this.h = b2;
                        } else {
                            int a = h0.a(str);
                            Q(a);
                            this.h = h0.a.b(str, bArr2, this.h, a);
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(e);
                    }
                } catch (h0.d e2) {
                    this.h = i3;
                    throw e2;
                }
            } catch (h0.d e3) {
                q(str, e3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void I(int i, int i2) throws IOException {
            K((i << 3) | i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void J(int i, int i2) throws IOException {
            T(20);
            P(i, 0);
            Q(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void K(int i) throws IOException {
            T(5);
            Q(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void L(int i, long j) throws IOException {
            T(20);
            P(i, 0);
            R(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void M(long j) throws IOException {
            T(10);
            R(j);
        }

        public final void S() throws IOException {
            this.i.write(this.f, 0, this.h);
            this.h = 0;
        }

        public final void T(int i) throws IOException {
            if (this.g - this.h < i) {
                S();
            }
        }

        public final void U(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.h;
            int i4 = this.g;
            int i5 = i4 - i3;
            byte[] bArr2 = this.f;
            if (i5 >= i2) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.h += i2;
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.h = i4;
            S();
            if (i7 > i4) {
                this.i.write(bArr, i6, i7);
            } else {
                System.arraycopy(bArr, i6, bArr2, 0, i7);
                this.h = i7;
            }
        }

        @Override // xsna.gu8
        public final void g(byte[] bArr, int i, int i2) throws IOException {
            U(bArr, i, i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void r(byte b) throws IOException {
            if (this.h == this.g) {
                S();
            }
            int i = this.h;
            this.h = i + 1;
            this.f[i] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void s(int i, boolean z) throws IOException {
            T(11);
            P(i, 0);
            byte b = z ? (byte) 1 : (byte) 0;
            int i2 = this.h;
            this.h = i2 + 1;
            this.f[i2] = b;
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void t(int i, byte[] bArr) throws IOException {
            K(i);
            U(bArr, 0, i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void u(int i, ByteString byteString) throws IOException {
            I(i, 2);
            v(byteString);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void v(ByteString byteString) throws IOException {
            K(byteString.size());
            byteString.k(this);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void w(int i, int i2) throws IOException {
            T(14);
            P(i, 5);
            N(i2);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void x(int i) throws IOException {
            T(4);
            N(i);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void y(int i, long j) throws IOException {
            T(18);
            P(i, 1);
            O(j);
        }

        @Override // androidx.datastore.preferences.protobuf.CodedOutputStream
        public final void z(long j) throws IOException {
            T(8);
            O(j);
        }
    }

    public static int h(int i, ByteString byteString) {
        return i(byteString) + n(i);
    }

    public static int i(ByteString byteString) {
        int size = byteString.size();
        return o(size) + size;
    }

    public static int j(pqy pqyVar) {
        int size = pqyVar.b != null ? pqyVar.b.size() : pqyVar.a != null ? pqyVar.a.getSerializedSize() : 0;
        return o(size) + size;
    }

    public static int k(int i) {
        return o((i >> 31) ^ (i << 1));
    }

    public static int l(long j) {
        return p((j >> 63) ^ (j << 1));
    }

    public static int m(String str) {
        int length;
        try {
            length = h0.a(str);
        } catch (h0.d unused) {
            length = str.getBytes(p.a).length;
        }
        return o(length) + length;
    }

    public static int n(int i) {
        return o(i << 3);
    }

    public static int o(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int p(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public abstract void A(int i, int i2) throws IOException;

    public abstract void B(int i) throws IOException;

    public abstract void C(int i, la20 la20Var, m8h0 m8h0Var) throws IOException;

    public abstract void D(la20 la20Var) throws IOException;

    public abstract void E(int i, la20 la20Var) throws IOException;

    public abstract void F(int i, ByteString byteString) throws IOException;

    public abstract void G(int i, String str) throws IOException;

    public abstract void H(String str) throws IOException;

    public abstract void I(int i, int i2) throws IOException;

    public abstract void J(int i, int i2) throws IOException;

    public abstract void K(int i) throws IOException;

    public abstract void L(int i, long j) throws IOException;

    public abstract void M(long j) throws IOException;

    public final void q(String str, h0.d dVar) throws IOException {
        d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(p.a);
        try {
            K(bytes.length);
            g(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    public abstract void r(byte b2) throws IOException;

    public abstract void s(int i, boolean z) throws IOException;

    public abstract void t(int i, byte[] bArr) throws IOException;

    public abstract void u(int i, ByteString byteString) throws IOException;

    public abstract void v(ByteString byteString) throws IOException;

    public abstract void w(int i, int i2) throws IOException;

    public abstract void x(int i) throws IOException;

    public abstract void y(int i, long j) throws IOException;

    public abstract void z(long j) throws IOException;
}
