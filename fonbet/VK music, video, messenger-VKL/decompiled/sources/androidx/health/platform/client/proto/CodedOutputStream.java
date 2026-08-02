package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.f1;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.ja20;
import xsna.nqy;
import xsna.t5q0;
import xsna.wn4;

/* loaded from: classes12.dex */
public abstract class CodedOutputStream extends wn4 {
    public static final Logger b = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean c = t5q0.e;
    public h a;

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

    public static class a extends CodedOutputStream {
        public final byte[] d;
        public final int e;
        public int f;

        public a(byte[] bArr, int i) {
            if (((bArr.length - i) | i) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.d = bArr;
            this.f = 0;
            this.e = i;
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void B(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void C(int i, boolean z) throws IOException {
            S(i, 0);
            B(z ? (byte) 1 : (byte) 0);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void D(int i, byte[] bArr) throws IOException {
            U(i);
            Y(bArr, 0, i);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void E(int i, ByteString byteString) throws IOException {
            S(i, 2);
            F(byteString);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void F(ByteString byteString) throws IOException {
            U(byteString.size());
            byteString.j(this);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void G(int i, int i2) throws IOException {
            S(i, 5);
            H(i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void H(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.f;
                int i3 = i2 + 1;
                this.f = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.f = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.f = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.f = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void I(int i, long j) throws IOException {
            S(i, 1);
            J(j);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void J(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                int i2 = i + 1;
                this.f = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.f = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.f = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.f = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.f = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.f = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.f = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.f = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void K(int i, int i2) throws IOException {
            S(i, 0);
            L(i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void L(int i) throws IOException {
            if (i >= 0) {
                U(i);
            } else {
                W(i);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void M(int i, ja20 ja20Var, w0 w0Var) throws IOException {
            S(i, 2);
            U(((androidx.health.platform.client.proto.a) ja20Var).e(w0Var));
            w0Var.g(ja20Var, this.a);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void N(ja20 ja20Var) throws IOException {
            U(ja20Var.getSerializedSize());
            ja20Var.b(this);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void O(int i, ja20 ja20Var) throws IOException {
            S(1, 3);
            T(2, i);
            S(3, 2);
            N(ja20Var);
            S(1, 4);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void P(int i, ByteString byteString) throws IOException {
            S(1, 3);
            T(2, i);
            E(3, byteString);
            S(1, 4);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void Q(int i, String str) throws IOException {
            S(i, 2);
            R(str);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void R(String str) throws IOException {
            int i = this.f;
            try {
                int z = CodedOutputStream.z(str.length() * 3);
                int z2 = CodedOutputStream.z(str.length());
                byte[] bArr = this.d;
                if (z2 != z) {
                    U(f1.b(str));
                    this.f = f1.a.b(str, bArr, this.f, X());
                    return;
                }
                int i2 = i + z2;
                this.f = i2;
                int b = f1.a.b(str, bArr, i2, X());
                this.f = i;
                U((b - i) - z2);
                this.f = b;
            } catch (f1.d e) {
                this.f = i;
                CodedOutputStream.b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(b0.a);
                try {
                    U(bytes.length);
                    Y(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(e2);
                }
            } catch (IndexOutOfBoundsException e3) {
                throw new OutOfSpaceException(e3);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void S(int i, int i2) throws IOException {
            U((i << 3) | i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void T(int i, int i2) throws IOException {
            S(i, 0);
            U(i2);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void U(int i) throws IOException {
            while (true) {
                int i2 = i & (-128);
                byte[] bArr = this.d;
                if (i2 == 0) {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr[i3] = (byte) i;
                    return;
                } else {
                    try {
                        int i4 = this.f;
                        this.f = i4 + 1;
                        bArr[i4] = (byte) ((i | 128) & 255);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void V(int i, long j) throws IOException {
            S(i, 0);
            W(j);
        }

        @Override // androidx.health.platform.client.proto.CodedOutputStream
        public final void W(long j) throws IOException {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (z && X() >= 10) {
                while ((j & (-128)) != 0) {
                    int i = this.f;
                    this.f = i + 1;
                    t5q0.k(bArr, i, (byte) ((((int) j) | 128) & 255));
                    j >>>= 7;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                t5q0.k(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) j;
        }

        public final int X() {
            return this.e - this.f;
        }

        public final void Y(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }
    }

    public static int A(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s(int i, ByteString byteString) {
        return t(byteString) + y(i);
    }

    public static int t(ByteString byteString) {
        int size = byteString.size();
        return z(size) + size;
    }

    public static int u(nqy nqyVar) {
        int size = nqyVar.b != null ? nqyVar.b.size() : nqyVar.a != null ? nqyVar.a.getSerializedSize() : 0;
        return z(size) + size;
    }

    public static int v(int i) {
        return z((i >> 31) ^ (i << 1));
    }

    public static int w(long j) {
        return A((j >> 63) ^ (j << 1));
    }

    public static int x(String str) {
        int length;
        try {
            length = f1.b(str);
        } catch (f1.d unused) {
            length = str.getBytes(b0.a).length;
        }
        return z(length) + length;
    }

    public static int y(int i) {
        return z(i << 3);
    }

    public static int z(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract void B(byte b2) throws IOException;

    public abstract void C(int i, boolean z) throws IOException;

    public abstract void D(int i, byte[] bArr) throws IOException;

    public abstract void E(int i, ByteString byteString) throws IOException;

    public abstract void F(ByteString byteString) throws IOException;

    public abstract void G(int i, int i2) throws IOException;

    public abstract void H(int i) throws IOException;

    public abstract void I(int i, long j) throws IOException;

    public abstract void J(long j) throws IOException;

    public abstract void K(int i, int i2) throws IOException;

    public abstract void L(int i) throws IOException;

    public abstract void M(int i, ja20 ja20Var, w0 w0Var) throws IOException;

    public abstract void N(ja20 ja20Var) throws IOException;

    public abstract void O(int i, ja20 ja20Var) throws IOException;

    public abstract void P(int i, ByteString byteString) throws IOException;

    public abstract void Q(int i, String str) throws IOException;

    public abstract void R(String str) throws IOException;

    public abstract void S(int i, int i2) throws IOException;

    public abstract void T(int i, int i2) throws IOException;

    public abstract void U(int i) throws IOException;

    public abstract void V(int i, long j) throws IOException;

    public abstract void W(long j) throws IOException;
}
