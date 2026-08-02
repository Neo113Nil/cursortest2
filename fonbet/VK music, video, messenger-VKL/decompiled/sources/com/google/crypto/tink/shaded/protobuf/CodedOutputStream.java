package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import xsna.ka20;
import xsna.m12;
import xsna.oi6;
import xsna.u5q0;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends oi6 {
    public static final Logger b = Logger.getLogger(CodedOutputStream.class.getName());
    public static final boolean c = u5q0.f;
    public i a;

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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void A(int i, ka20 ka20Var, a0 a0Var) throws IOException {
            E(i, 2);
            com.google.crypto.tink.shaded.protobuf.a aVar = (com.google.crypto.tink.shaded.protobuf.a) ka20Var;
            int b = aVar.b();
            if (b == -1) {
                b = a0Var.i(aVar);
                aVar.d(b);
            }
            G(b);
            a0Var.j(ka20Var, this.a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void B(int i, ka20 ka20Var) throws IOException {
            E(1, 3);
            F(2, i);
            E(3, 2);
            G(ka20Var.getSerializedSize());
            ka20Var.f(this);
            E(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void C(int i, ByteString byteString) throws IOException {
            E(1, 3);
            F(2, i);
            t(3, byteString);
            E(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void D(int i, String str) throws IOException {
            E(i, 2);
            int i2 = this.f;
            try {
                int p = CodedOutputStream.p(str.length() * 3);
                int p2 = CodedOutputStream.p(str.length());
                byte[] bArr = this.d;
                if (p2 != p) {
                    G(h0.b(str));
                    this.f = h0.a.b(str, bArr, this.f, J());
                    return;
                }
                int i3 = i2 + p2;
                this.f = i3;
                int b = h0.a.b(str, bArr, i3, J());
                this.f = i2;
                G((b - i2) - p2);
                this.f = b;
            } catch (h0.d e) {
                this.f = i2;
                CodedOutputStream.b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(q.a);
                try {
                    G(bytes.length);
                    K(bytes, 0, bytes.length);
                } catch (OutOfSpaceException e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new OutOfSpaceException(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void E(int i, int i2) throws IOException {
            G((i << 3) | i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void F(int i, int i2) throws IOException {
            E(i, 0);
            G(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void G(int i) throws IOException {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (!z || m12.a() || J() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        int i2 = this.f;
                        this.f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                    }
                }
                int i3 = this.f;
                this.f = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                int i4 = this.f;
                this.f = i4 + 1;
                u5q0.j(bArr, i4, (byte) i);
                return;
            }
            int i5 = this.f;
            this.f = i5 + 1;
            u5q0.j(bArr, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                int i7 = this.f;
                this.f = i7 + 1;
                u5q0.j(bArr, i7, (byte) i6);
                return;
            }
            int i8 = this.f;
            this.f = i8 + 1;
            u5q0.j(bArr, i8, (byte) (i6 | 128));
            int i9 = i >>> 14;
            if ((i9 & (-128)) == 0) {
                int i10 = this.f;
                this.f = i10 + 1;
                u5q0.j(bArr, i10, (byte) i9);
                return;
            }
            int i11 = this.f;
            this.f = i11 + 1;
            u5q0.j(bArr, i11, (byte) (i9 | 128));
            int i12 = i >>> 21;
            if ((i12 & (-128)) == 0) {
                int i13 = this.f;
                this.f = i13 + 1;
                u5q0.j(bArr, i13, (byte) i12);
            } else {
                int i14 = this.f;
                this.f = i14 + 1;
                u5q0.j(bArr, i14, (byte) (i12 | 128));
                int i15 = this.f;
                this.f = i15 + 1;
                u5q0.j(bArr, i15, (byte) (i >>> 28));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void H(int i, long j) throws IOException {
            E(i, 0);
            I(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void I(long j) throws IOException {
            boolean z = CodedOutputStream.c;
            byte[] bArr = this.d;
            if (z && J() >= 10) {
                while ((j & (-128)) != 0) {
                    int i = this.f;
                    this.f = i + 1;
                    u5q0.j(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                int i2 = this.f;
                this.f = i2 + 1;
                u5q0.j(bArr, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    int i3 = this.f;
                    this.f = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
                }
            }
            int i4 = this.f;
            this.f = i4 + 1;
            bArr[i4] = (byte) j;
        }

        public final int J() {
            return this.e - this.f;
        }

        public final void K(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.f, i2);
                this.f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void r(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.f;
                this.f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void s(int i, boolean z) throws IOException {
            E(i, 0);
            r(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void t(int i, ByteString byteString) throws IOException {
            E(i, 2);
            G(byteString.size());
            byteString.o(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void u(int i, int i2) throws IOException {
            E(i, 5);
            v(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void v(int i) throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void w(int i, long j) throws IOException {
            E(i, 1);
            x(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void x(long j) throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void y(int i, int i2) throws IOException {
            E(i, 0);
            z(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void z(int i) throws IOException {
            if (i >= 0) {
                G(i);
            } else {
                I(i);
            }
        }
    }

    public static int g(int i, ByteString byteString) {
        return h(byteString) + n(i);
    }

    public static int h(ByteString byteString) {
        int size = byteString.size();
        return p(size) + size;
    }

    public static int i(int i) {
        return n(i) + 4;
    }

    public static int j(int i) {
        return n(i) + 8;
    }

    @Deprecated
    public static int k(int i, ka20 ka20Var, a0 a0Var) {
        int n = n(i) * 2;
        com.google.crypto.tink.shaded.protobuf.a aVar = (com.google.crypto.tink.shaded.protobuf.a) ka20Var;
        int b2 = aVar.b();
        if (b2 == -1) {
            b2 = a0Var.i(aVar);
            aVar.d(b2);
        }
        return b2 + n;
    }

    public static int l(int i) {
        if (i >= 0) {
            return p(i);
        }
        return 10;
    }

    public static int m(String str) {
        int length;
        try {
            length = h0.b(str);
        } catch (h0.d unused) {
            length = str.getBytes(q.a).length;
        }
        return p(length) + length;
    }

    public static int n(int i) {
        return p(i << 3);
    }

    public static int o(int i, int i2) {
        return p(i2) + n(i);
    }

    public static int p(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int q(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A(int i, ka20 ka20Var, a0 a0Var) throws IOException;

    public abstract void B(int i, ka20 ka20Var) throws IOException;

    public abstract void C(int i, ByteString byteString) throws IOException;

    public abstract void D(int i, String str) throws IOException;

    public abstract void E(int i, int i2) throws IOException;

    public abstract void F(int i, int i2) throws IOException;

    public abstract void G(int i) throws IOException;

    public abstract void H(int i, long j) throws IOException;

    public abstract void I(long j) throws IOException;

    public abstract void r(byte b2) throws IOException;

    public abstract void s(int i, boolean z) throws IOException;

    public abstract void t(int i, ByteString byteString) throws IOException;

    public abstract void u(int i, int i2) throws IOException;

    public abstract void v(int i) throws IOException;

    public abstract void w(int i, long j) throws IOException;

    public abstract void x(long j) throws IOException;

    public abstract void y(int i, int i2) throws IOException;

    public abstract void z(int i) throws IOException;
}
