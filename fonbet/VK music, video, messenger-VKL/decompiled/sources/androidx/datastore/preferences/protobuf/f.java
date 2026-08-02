package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import ru.ok.proto.rtmp.amf.AmfConstants;
import xsna.tgw;

/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class f {
    public int a;
    public final int b = 100;
    public final int c = Integer.MAX_VALUE;
    public g d;

    /* compiled from: CodedInputStream.java */
    public static final class a extends f {
        public final byte[] e;
        public int f;
        public int g;
        public int h;
        public final int i;
        public int j;
        public int k = Integer.MAX_VALUE;

        public a(byte[] bArr, int i, int i2, boolean z) {
            this.e = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = i;
        }

        public final int A() throws IOException {
            int i = this.h;
            if (this.f - i < 4) {
                throw InvalidProtocolBufferException.m();
            }
            this.h = i + 4;
            byte[] bArr = this.e;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long B() throws IOException {
            int i = this.h;
            if (this.f - i < 8) {
                throw InvalidProtocolBufferException.m();
            }
            this.h = i + 8;
            byte[] bArr = this.e;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int C() throws IOException {
            int i;
            int i2 = this.h;
            int i3 = this.f;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.e;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.h = i4;
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
                    this.h = i5;
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
            int i = this.h;
            int i2 = this.f;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.e;
                byte b = bArr[i];
                if (b >= 0) {
                    this.h = i3;
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
                    this.h = i4;
                    return j;
                }
            }
            return E();
        }

        public final long E() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.h;
                if (i2 == this.f) {
                    throw InvalidProtocolBufferException.m();
                }
                this.h = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.e[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.i();
        }

        public final void F() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = i - this.i;
            int i3 = this.k;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        public final void G(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.f;
                int i3 = this.h;
                if (i <= i2 - i3) {
                    this.h = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.m();
            }
            throw InvalidProtocolBufferException.j();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.j != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int b() {
            return this.h - this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final boolean c() throws IOException {
            return this.h == this.f;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final void e(int i) {
            this.k = i;
            F();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int f(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.j();
            }
            int b = b() + i;
            if (b < 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int i2 = this.k;
            if (b > i2) {
                throw InvalidProtocolBufferException.m();
            }
            this.k = b;
            F();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final boolean g() throws IOException {
            return D() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final ByteString.g h() throws IOException {
            byte[] bArr;
            int C = C();
            byte[] bArr2 = this.e;
            if (C > 0) {
                int i = this.f;
                int i2 = this.h;
                if (C <= i - i2) {
                    ByteString.g e = ByteString.e(i2, C, bArr2);
                    this.h += C;
                    return e;
                }
            }
            if (C == 0) {
                return ByteString.b;
            }
            if (C > 0) {
                int i3 = this.f;
                int i4 = this.h;
                if (C <= i3 - i4) {
                    int i5 = C + i4;
                    this.h = i5;
                    bArr = Arrays.copyOfRange(bArr2, i4, i5);
                    ByteString.g gVar = ByteString.b;
                    return new ByteString.g(bArr);
                }
            }
            if (C > 0) {
                throw InvalidProtocolBufferException.m();
            }
            if (C != 0) {
                throw InvalidProtocolBufferException.j();
            }
            bArr = p.b;
            ByteString.g gVar2 = ByteString.b;
            return new ByteString.g(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final double i() throws IOException {
            return Double.longBitsToDouble(B());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int j() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int k() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long l() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final float m() throws IOException {
            return Float.intBitsToFloat(A());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int n() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long o() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int p() throws IOException {
            return A();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long q() throws IOException {
            return B();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int r() throws IOException {
            int C = C();
            return (-(C & 1)) ^ (C >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long s() throws IOException {
            long D = D();
            return (-(D & 1)) ^ (D >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final String t() throws IOException {
            int C = C();
            if (C > 0) {
                int i = this.f;
                int i2 = this.h;
                if (C <= i - i2) {
                    String str = new String(this.e, i2, C, p.a);
                    this.h += C;
                    return str;
                }
            }
            if (C == 0) {
                return "";
            }
            if (C < 0) {
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final String u() throws IOException {
            int C = C();
            if (C > 0) {
                int i = this.f;
                int i2 = this.h;
                if (C <= i - i2) {
                    String a = h0.a.a(i2, C, this.e);
                    this.h += C;
                    return a;
                }
            }
            if (C == 0) {
                return "";
            }
            if (C <= 0) {
                throw InvalidProtocolBufferException.j();
            }
            throw InvalidProtocolBufferException.m();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int v() throws IOException {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int C = C();
            this.j = C;
            if ((C >>> 3) != 0) {
                return C;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int w() throws IOException {
            return C();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long x() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final boolean y(int i) throws IOException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    G(8);
                    return true;
                }
                if (i2 == 2) {
                    G(C());
                    return true;
                }
                if (i2 == 3) {
                    z();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.h();
                }
                G(4);
                return true;
            }
            int i4 = this.f - this.h;
            byte[] bArr = this.e;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.i();
            }
            while (i3 < 10) {
                int i6 = this.h;
                if (i6 == this.f) {
                    throw InvalidProtocolBufferException.m();
                }
                this.h = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.i();
            return true;
        }
    }

    /* compiled from: CodedInputStream.java */
    public static final class b extends f {
        public final InputStream e;
        public final byte[] f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l = Integer.MAX_VALUE;

        public b(InputStream inputStream) {
            p.a(inputStream, "input");
            this.e = inputStream;
            this.f = new byte[4096];
            this.g = 0;
            this.i = 0;
            this.k = 0;
        }

        public final byte[] A(int i) throws IOException {
            byte[] B = B(i);
            if (B != null) {
                return B;
            }
            int i2 = this.i;
            int i3 = this.g;
            int i4 = i3 - i2;
            this.k += i3;
            this.i = 0;
            this.g = 0;
            ArrayList C = C(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, i2, bArr, 0, i4);
            Iterator it = C.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] B(int i) throws IOException {
            if (i == 0) {
                return p.b;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i2 = this.k;
            int i3 = this.i;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.l;
            if (i4 > i5) {
                K((i5 - i2) - i3);
                throw InvalidProtocolBufferException.m();
            }
            int i6 = this.g - i3;
            int i7 = i - i6;
            InputStream inputStream = this.e;
            if (i7 >= 4096) {
                try {
                    if (i7 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.k();
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.f, this.i, bArr, 0, i6);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (i6 < i) {
                try {
                    int read = inputStream.read(bArr, i6, i - i6);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.k += read;
                    i6 += read;
                } catch (InvalidProtocolBufferException e2) {
                    e2.k();
                    throw e2;
                }
            }
            return bArr;
        }

        public final ArrayList C(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.e.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.m();
                    }
                    this.k += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int D() throws IOException {
            int i = this.i;
            if (this.g - i < 4) {
                J(4);
                i = this.i;
            }
            this.i = i + 4;
            byte[] bArr = this.f;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long E() throws IOException {
            int i = this.i;
            if (this.g - i < 8) {
                J(8);
                i = this.i;
            }
            this.i = i + 8;
            byte[] bArr = this.f;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final int F() throws IOException {
            int i;
            int i2 = this.i;
            int i3 = this.g;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.f;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.i = i4;
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
                    this.i = i5;
                    return i;
                }
            }
            return (int) H();
        }

        public final long G() throws IOException {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.i;
            int i2 = this.g;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.f;
                byte b = bArr[i];
                if (b >= 0) {
                    this.i = i3;
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
                    this.i = i4;
                    return j;
                }
            }
            return H();
        }

        public final long H() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.i == this.g) {
                    J(1);
                }
                int i2 = this.i;
                this.i = i2 + 1;
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((this.f[i2] & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.i();
        }

        public final void I() {
            int i = this.g + this.h;
            this.g = i;
            int i2 = this.k + i;
            int i3 = this.l;
            if (i2 <= i3) {
                this.h = 0;
                return;
            }
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
        }

        public final void J(int i) throws IOException {
            if (L(i)) {
                return;
            }
            if (i <= (this.c - this.k) - this.i) {
                throw InvalidProtocolBufferException.m();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        public final void K(int i) throws IOException {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3 && i >= 0) {
                this.i = i3 + i;
                return;
            }
            InputStream inputStream = this.e;
            if (i < 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i4 = this.k;
            int i5 = i4 + i3;
            int i6 = i5 + i;
            int i7 = this.l;
            if (i6 > i7) {
                K((i7 - i4) - i3);
                throw InvalidProtocolBufferException.m();
            }
            this.k = i5;
            int i8 = i2 - i3;
            this.g = 0;
            this.i = 0;
            while (i8 < i) {
                long j = i - i8;
                try {
                    try {
                        long skip = inputStream.skip(j);
                        if (skip < 0 || skip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i8 += (int) skip;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.k();
                        throw e;
                    }
                } catch (Throwable th) {
                    this.k += i8;
                    I();
                    throw th;
                }
            }
            this.k += i8;
            I();
            if (i8 >= i) {
                return;
            }
            int i9 = this.g;
            int i10 = i9 - this.i;
            this.i = i9;
            J(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.g;
                if (i11 <= i12) {
                    this.i = i11;
                    return;
                } else {
                    i10 += i12;
                    this.i = i12;
                    J(1);
                }
            }
        }

        public final boolean L(int i) throws IOException {
            InputStream inputStream = this.e;
            int i2 = this.i;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 <= i4) {
                throw new IllegalStateException(tgw.b(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i5 = this.k;
            int i6 = this.c;
            if (i <= (i6 - i5) - i2 && i5 + i2 + i <= this.l) {
                byte[] bArr = this.f;
                if (i2 > 0) {
                    if (i4 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                    }
                    this.k += i2;
                    this.g -= i2;
                    this.i = 0;
                }
                int i7 = this.g;
                try {
                    int read = inputStream.read(bArr, i7, Math.min(bArr.length - i7, (i6 - this.k) - i7));
                    if (read == 0 || read < -1 || read > bArr.length) {
                        throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                    if (read > 0) {
                        this.g += read;
                        I();
                        if (this.g >= i) {
                            return true;
                        }
                        return L(i);
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.k();
                    throw e;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final void a(int i) throws InvalidProtocolBufferException {
            if (this.j != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int b() {
            return this.k + this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final boolean c() throws IOException {
            return this.i == this.g && !L(1);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final void e(int i) {
            this.l = i;
            I();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int f(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.j();
            }
            int i2 = this.k + this.i + i;
            if (i2 < 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int i3 = this.l;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.m();
            }
            this.l = i2;
            I();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final boolean g() throws IOException {
            return G() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final ByteString.g h() throws IOException {
            int F = F();
            int i = this.g;
            int i2 = this.i;
            int i3 = i - i2;
            byte[] bArr = this.f;
            if (F <= i3 && F > 0) {
                ByteString.g e = ByteString.e(i2, F, bArr);
                this.i += F;
                return e;
            }
            if (F == 0) {
                return ByteString.b;
            }
            if (F < 0) {
                throw InvalidProtocolBufferException.j();
            }
            byte[] B = B(F);
            if (B != null) {
                return ByteString.e(0, B.length, B);
            }
            int i4 = this.i;
            int i5 = this.g;
            int i6 = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            ArrayList C = C(F - i6);
            byte[] bArr2 = new byte[F];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            Iterator it = C.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i6, bArr3.length);
                i6 += bArr3.length;
            }
            ByteString.g gVar = ByteString.b;
            return new ByteString.g(bArr2);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final double i() throws IOException {
            return Double.longBitsToDouble(E());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int j() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int k() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long l() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final float m() throws IOException {
            return Float.intBitsToFloat(D());
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int n() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long o() throws IOException {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int p() throws IOException {
            return D();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long q() throws IOException {
            return E();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int r() throws IOException {
            int F = F();
            return (-(F & 1)) ^ (F >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long s() throws IOException {
            long G = G();
            return (-(G & 1)) ^ (G >>> 1);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final String t() throws IOException {
            int F = F();
            byte[] bArr = this.f;
            if (F > 0) {
                int i = this.g;
                int i2 = this.i;
                if (F <= i - i2) {
                    String str = new String(bArr, i2, F, p.a);
                    this.i += F;
                    return str;
                }
            }
            if (F == 0) {
                return "";
            }
            if (F < 0) {
                throw InvalidProtocolBufferException.j();
            }
            if (F > this.g) {
                return new String(A(F), p.a);
            }
            J(F);
            String str2 = new String(bArr, this.i, F, p.a);
            this.i += F;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final String u() throws IOException {
            int F = F();
            int i = this.i;
            int i2 = this.g;
            int i3 = i2 - i;
            byte[] bArr = this.f;
            if (F <= i3 && F > 0) {
                this.i = i + F;
            } else {
                if (F == 0) {
                    return "";
                }
                if (F < 0) {
                    throw InvalidProtocolBufferException.j();
                }
                i = 0;
                if (F <= i2) {
                    J(F);
                    this.i = F;
                } else {
                    bArr = A(F);
                }
            }
            return h0.a.a(i, F, bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int v() throws IOException {
            if (c()) {
                this.j = 0;
                return 0;
            }
            int F = F();
            this.j = F;
            if ((F >>> 3) != 0) {
                return F;
            }
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final int w() throws IOException {
            return F();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final long x() throws IOException {
            return G();
        }

        @Override // androidx.datastore.preferences.protobuf.f
        public final boolean y(int i) throws IOException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    K(8);
                    return true;
                }
                if (i2 == 2) {
                    K(F());
                    return true;
                }
                if (i2 == 3) {
                    z();
                    a(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 5) {
                    throw InvalidProtocolBufferException.h();
                }
                K(4);
                return true;
            }
            int i4 = this.g - this.i;
            byte[] bArr = this.f;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.i;
                    this.i = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.i();
            }
            while (i3 < 10) {
                if (this.i == this.g) {
                    J(1);
                }
                int i6 = this.i;
                this.i = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.i();
            return true;
        }
    }

    public static a d(byte[] bArr, int i, int i2, boolean z) {
        a aVar = new a(bArr, i, i2, z);
        try {
            aVar.f(i2);
            return aVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int b();

    public abstract boolean c() throws IOException;

    public abstract void e(int i);

    public abstract int f(int i) throws InvalidProtocolBufferException;

    public abstract boolean g() throws IOException;

    public abstract ByteString.g h() throws IOException;

    public abstract double i() throws IOException;

    public abstract int j() throws IOException;

    public abstract int k() throws IOException;

    public abstract long l() throws IOException;

    public abstract float m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract String t() throws IOException;

    public abstract String u() throws IOException;

    public abstract int v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract boolean y(int i) throws IOException;

    public final void z() throws IOException {
        int v;
        do {
            v = v();
            if (v == 0) {
                return;
            }
            int i = this.a;
            if (i >= this.b) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.a = i + 1;
            this.a--;
        } while (y(v));
    }
}
