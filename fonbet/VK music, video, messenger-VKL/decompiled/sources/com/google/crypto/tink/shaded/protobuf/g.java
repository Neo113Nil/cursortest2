package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.IOException;
import java.util.Arrays;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class g {
    public int a;
    public final int b = 100;
    public h c;

    /* compiled from: CodedInputStream.java */
    public static final class a extends g {
        public final byte[] d;
        public int e;
        public int f;
        public int g;
        public final int h;
        public int i;
        public int j = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.d = bArr;
            this.e = i2 + i;
            this.g = i;
            this.h = i;
        }

        public final int A() throws IOException {
            int i = this.g;
            if (this.e - i < 4) {
                throw InvalidProtocolBufferException.l();
            }
            this.g = i + 4;
            byte[] bArr = this.d;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long B() throws IOException {
            int i = this.g;
            if (this.e - i < 8) {
                throw InvalidProtocolBufferException.l();
            }
            this.g = i + 8;
            byte[] bArr = this.d;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int C() throws IOException {
            int i;
            int i2 = this.g;
            int i3 = this.e;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.d;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.g = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << AmfConstants.TYPE_RECORDSET_MARKER) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.g = i5;
                    return i;
                }
            }
            return (int) E();
        }

        public final long D() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.g;
            int i2 = this.e;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.d;
                byte b = bArr[i];
                if (b >= 0) {
                    this.g = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << AmfConstants.TYPE_RECORDSET_MARKER) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                j4 = (-2080896) ^ i9;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    i8 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i8] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i8] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i10;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j4 = j2 ^ j7;
                                }
                                j = j3 ^ j6;
                            }
                            i4 = i8;
                            j = j4;
                        }
                    }
                    this.g = i4;
                    return j;
                }
            }
            return E();
        }

        public final long E() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.g;
                if (i2 == this.e) {
                    throw InvalidProtocolBufferException.l();
                }
                this.g = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.d[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.h();
        }

        public final void F() {
            int i = this.e + this.f;
            this.e = i;
            int i2 = i - this.h;
            int i3 = this.j;
            if (i2 <= i3) {
                this.f = 0;
                return;
            }
            int i4 = i2 - i3;
            this.f = i4;
            this.e = i - i4;
        }

        public final void G(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.e;
                int i3 = this.g;
                if (i <= i2 - i3) {
                    this.g = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.l();
            }
            throw InvalidProtocolBufferException.i();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.i != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int d() {
            return this.g - this.h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final boolean e() throws IOException {
            return this.g == this.e;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final void f(int i) {
            this.j = i;
            F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int g(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.i();
            }
            int d = d() + i;
            int i2 = this.j;
            if (d > i2) {
                throw InvalidProtocolBufferException.l();
            }
            this.j = d;
            F();
            return i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final boolean h() throws IOException {
            return D() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final ByteString.g i() throws IOException {
            byte[] bArr;
            int C = C();
            byte[] bArr2 = this.d;
            if (C > 0) {
                int i = this.e;
                int i2 = this.g;
                if (C <= i - i2) {
                    ByteString.g e = ByteString.e(i2, C, bArr2);
                    this.g += C;
                    return e;
                }
            }
            if (C == 0) {
                return ByteString.b;
            }
            if (C > 0) {
                int i3 = this.e;
                int i4 = this.g;
                if (C <= i3 - i4) {
                    int i5 = C + i4;
                    this.g = i5;
                    bArr = Arrays.copyOfRange(bArr2, i4, i5);
                    ByteString.g gVar = ByteString.b;
                    return new ByteString.g(bArr);
                }
            }
            if (C > 0) {
                throw InvalidProtocolBufferException.l();
            }
            if (C != 0) {
                throw InvalidProtocolBufferException.i();
            }
            bArr = q.b;
            ByteString.g gVar2 = ByteString.b;
            return new ByteString.g(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final double j() throws IOException {
            return Double.longBitsToDouble(B());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int k() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int l() throws IOException {
            return A();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final long m() throws IOException {
            return B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final float n() throws IOException {
            return Float.intBitsToFloat(A());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int o() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final long p() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int q() throws IOException {
            return A();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final long r() throws IOException {
            return B();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int s() throws IOException {
            return g.b(C());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final long t() throws IOException {
            return g.c(D());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final String u() throws IOException {
            int C = C();
            if (C > 0) {
                int i = this.e;
                int i2 = this.g;
                if (C <= i - i2) {
                    String str = new String(this.d, i2, C, q.a);
                    this.g += C;
                    return str;
                }
            }
            if (C == 0) {
                return "";
            }
            if (C < 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final String v() throws IOException {
            int C = C();
            if (C > 0) {
                int i = this.e;
                int i2 = this.g;
                if (C <= i - i2) {
                    String a = h0.a.a(i2, C, this.d);
                    this.g += C;
                    return a;
                }
            }
            if (C == 0) {
                return "";
            }
            if (C <= 0) {
                throw InvalidProtocolBufferException.i();
            }
            throw InvalidProtocolBufferException.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int w() throws IOException {
            if (e()) {
                this.i = 0;
                return 0;
            }
            int C = C();
            this.i = C;
            if ((C >>> 3) != 0) {
                return C;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final int x() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final long y() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.g
        public final boolean z(int i) throws IOException {
            int w;
            int i2 = i & 7;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.e - this.g;
                byte[] bArr = this.d;
                if (i4 >= 10) {
                    while (i3 < 10) {
                        int i5 = this.g;
                        this.g = i5 + 1;
                        if (bArr[i5] < 0) {
                            i3++;
                        }
                    }
                    throw InvalidProtocolBufferException.h();
                }
                while (i3 < 10) {
                    int i6 = this.g;
                    if (i6 == this.e) {
                        throw InvalidProtocolBufferException.l();
                    }
                    this.g = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.h();
                return true;
            }
            if (i2 == 1) {
                G(8);
                return true;
            }
            if (i2 == 2) {
                G(C());
                return true;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.g();
                }
                G(4);
                return true;
            }
            do {
                w = w();
                if (w == 0) {
                    break;
                }
            } while (z(w));
            a(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void f(int i);

    public abstract int g(int i) throws InvalidProtocolBufferException;

    public abstract boolean h() throws IOException;

    public abstract ByteString.g i() throws IOException;

    public abstract double j() throws IOException;

    public abstract int k() throws IOException;

    public abstract int l() throws IOException;

    public abstract long m() throws IOException;

    public abstract float n() throws IOException;

    public abstract int o() throws IOException;

    public abstract long p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract int s() throws IOException;

    public abstract long t() throws IOException;

    public abstract String u() throws IOException;

    public abstract String v() throws IOException;

    public abstract int w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract boolean z(int i) throws IOException;
}
