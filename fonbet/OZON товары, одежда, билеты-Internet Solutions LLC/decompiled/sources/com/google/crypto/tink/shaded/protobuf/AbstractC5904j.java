package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC5903i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5904j {

    /* renamed from: a, reason: collision with root package name */
    int f59403a;

    /* renamed from: b, reason: collision with root package name */
    int f59404b;

    /* renamed from: c, reason: collision with root package name */
    int f59405c = 100;

    /* renamed from: d, reason: collision with root package name */
    int f59406d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    C5905k f59407e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j$a */
    private static final class a extends AbstractC5904j {

        /* renamed from: f, reason: collision with root package name */
        private final byte[] f59408f;

        /* renamed from: g, reason: collision with root package name */
        private int f59409g;

        /* renamed from: h, reason: collision with root package name */
        private int f59410h;

        /* renamed from: i, reason: collision with root package name */
        private int f59411i;

        /* renamed from: j, reason: collision with root package name */
        private int f59412j;

        /* renamed from: k, reason: collision with root package name */
        private int f59413k;

        /* renamed from: l, reason: collision with root package name */
        private int f59414l;

        a(byte[] bArr, int i11, int i12, boolean z11) {
            super(0);
            this.f59414l = Integer.MAX_VALUE;
            this.f59408f = bArr;
            this.f59409g = i12 + i11;
            this.f59411i = i11;
            this.f59412j = i11;
        }

        private void H() {
            int i11 = this.f59409g + this.f59410h;
            this.f59409g = i11;
            int i12 = i11 - this.f59412j;
            int i13 = this.f59414l;
            if (i12 <= i13) {
                this.f59410h = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f59410h = i14;
            this.f59409g = i11 - i14;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final boolean A(int i11) throws IOException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    I(8);
                    return true;
                }
                if (i12 == 2) {
                    I(E());
                    return true;
                }
                if (i12 == 3) {
                    B();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    if (this.f59404b == 0) {
                        a(0);
                    }
                    return false;
                }
                if (i12 != 5) {
                    throw A.e();
                }
                I(4);
                return true;
            }
            int i14 = this.f59409g - this.f59411i;
            byte[] bArr = this.f59408f;
            if (i14 >= 10) {
                while (i13 < 10) {
                    int i15 = this.f59411i;
                    this.f59411i = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw A.f();
            }
            while (i13 < 10) {
                int i16 = this.f59411i;
                if (i16 == this.f59409g) {
                    throw A.l();
                }
                this.f59411i = i16 + 1;
                if (bArr[i16] < 0) {
                    i13++;
                }
            }
            throw A.f();
            return true;
        }

        public final int C() throws IOException {
            int i11 = this.f59411i;
            if (this.f59409g - i11 < 4) {
                throw A.l();
            }
            this.f59411i = i11 + 4;
            byte[] bArr = this.f59408f;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public final long D() throws IOException {
            int i11 = this.f59411i;
            if (this.f59409g - i11 < 8) {
                throw A.l();
            }
            this.f59411i = i11 + 8;
            byte[] bArr = this.f59408f;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        public final int E() throws IOException {
            int i11;
            int i12 = this.f59411i;
            int i13 = this.f59409g;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f59408f;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f59411i = i14;
                    return b11;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b11;
                    if (i16 < 0) {
                        i11 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            int i19 = i12 + 4;
                            int i21 = i18 ^ (bArr[i17] << 21);
                            if (i21 < 0) {
                                i11 = (-2080896) ^ i21;
                            } else {
                                i17 = i12 + 5;
                                byte b12 = bArr[i19];
                                int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i19 = i12 + 6;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 7;
                                        if (bArr[i19] < 0) {
                                            i19 = i12 + 8;
                                            if (bArr[i17] < 0) {
                                                i17 = i12 + 9;
                                                if (bArr[i19] < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i15 = i23;
                                                        i11 = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i22;
                                }
                                i11 = i22;
                            }
                            i15 = i19;
                        }
                        i15 = i17;
                    }
                    this.f59411i = i15;
                    return i11;
                }
            }
            return (int) G();
        }

        public final long F() throws IOException {
            long j11;
            long j12;
            long j13;
            long j14;
            int i11 = this.f59411i;
            int i12 = this.f59409g;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f59408f;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f59411i = i13;
                    return b11;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b11;
                    if (i15 < 0) {
                        j11 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            j11 = i17 ^ 16256;
                            i14 = i16;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                j14 = (-2080896) ^ i19;
                            } else {
                                long j15 = i19;
                                i14 = i11 + 5;
                                long j16 = j15 ^ (bArr[i18] << 28);
                                if (j16 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    i18 = i11 + 6;
                                    long j17 = j16 ^ (bArr[i14] << 35);
                                    if (j17 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i14 = i11 + 7;
                                        j16 = j17 ^ (bArr[i18] << 42);
                                        if (j16 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i18 = i11 + 8;
                                            j17 = j16 ^ (bArr[i14] << 49);
                                            if (j17 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i14 = i11 + 9;
                                                long j18 = (j17 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                                if (j18 < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i14 = i21;
                                                    }
                                                }
                                                j11 = j18;
                                            }
                                        }
                                    }
                                    j14 = j12 ^ j17;
                                }
                                j11 = j13 ^ j16;
                            }
                            i14 = i18;
                            j11 = j14;
                        }
                    }
                    this.f59411i = i14;
                    return j11;
                }
            }
            return G();
        }

        final long G() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                int i12 = this.f59411i;
                if (i12 == this.f59409g) {
                    throw A.l();
                }
                this.f59411i = i12 + 1;
                j11 |= (r3 & Byte.MAX_VALUE) << i11;
                if ((this.f59408f[i12] & 128) == 0) {
                    return j11;
                }
            }
            throw A.f();
        }

        public final void I(int i11) throws IOException {
            if (i11 >= 0) {
                int i12 = this.f59409g;
                int i13 = this.f59411i;
                if (i11 <= i12 - i13) {
                    this.f59411i = i13 + i11;
                    return;
                }
            }
            if (i11 >= 0) {
                throw A.l();
            }
            throw A.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final void a(int i11) throws A {
            if (this.f59413k != i11) {
                throw new A("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int d() {
            return this.f59411i - this.f59412j;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final boolean e() throws IOException {
            return this.f59411i == this.f59409g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final void g(int i11) {
            this.f59414l = i11;
            H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int h(int i11) throws A {
            if (i11 < 0) {
                throw A.g();
            }
            int d11 = i11 + d();
            if (d11 < 0) {
                throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            int i12 = this.f59414l;
            if (d11 > i12) {
                throw A.l();
            }
            this.f59414l = d11;
            H();
            return i12;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final boolean i() throws IOException {
            return F() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final AbstractC5903i j() throws IOException {
            byte[] bArr;
            int E11 = E();
            byte[] bArr2 = this.f59408f;
            if (E11 > 0) {
                int i11 = this.f59409g;
                int i12 = this.f59411i;
                if (E11 <= i11 - i12) {
                    AbstractC5903i e11 = AbstractC5903i.e(i12, E11, bArr2);
                    this.f59411i += E11;
                    return e11;
                }
            }
            if (E11 == 0) {
                return AbstractC5903i.f59377b;
            }
            if (E11 > 0) {
                int i13 = this.f59409g;
                int i14 = this.f59411i;
                if (E11 <= i13 - i14) {
                    int i15 = E11 + i14;
                    this.f59411i = i15;
                    bArr = Arrays.copyOfRange(bArr2, i14, i15);
                    AbstractC5903i abstractC5903i = AbstractC5903i.f59377b;
                    return new AbstractC5903i.g(bArr);
                }
            }
            if (E11 > 0) {
                throw A.l();
            }
            if (E11 != 0) {
                throw A.g();
            }
            bArr = C5919z.f59481b;
            AbstractC5903i abstractC5903i2 = AbstractC5903i.f59377b;
            return new AbstractC5903i.g(bArr);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final double k() throws IOException {
            return Double.longBitsToDouble(D());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int l() throws IOException {
            return E();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int m() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long n() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final float o() throws IOException {
            return Float.intBitsToFloat(C());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int p() throws IOException {
            return E();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long q() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int r() throws IOException {
            return C();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long s() throws IOException {
            return D();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int t() throws IOException {
            return AbstractC5904j.b(E());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long u() throws IOException {
            return AbstractC5904j.c(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final String v() throws IOException {
            int E11 = E();
            if (E11 > 0) {
                int i11 = this.f59409g;
                int i12 = this.f59411i;
                if (E11 <= i11 - i12) {
                    String str = new String(this.f59408f, i12, E11, C5919z.f59480a);
                    this.f59411i += E11;
                    return str;
                }
            }
            if (E11 == 0) {
                return "";
            }
            if (E11 < 0) {
                throw A.g();
            }
            throw A.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final String w() throws IOException {
            int E11 = E();
            if (E11 > 0) {
                int i11 = this.f59409g;
                int i12 = this.f59411i;
                if (E11 <= i11 - i12) {
                    String d11 = q0.d(this.f59408f, i12, E11);
                    this.f59411i += E11;
                    return d11;
                }
            }
            if (E11 == 0) {
                return "";
            }
            if (E11 <= 0) {
                throw A.g();
            }
            throw A.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int x() throws IOException {
            if (e()) {
                this.f59413k = 0;
                return 0;
            }
            int E11 = E();
            this.f59413k = E11;
            if ((E11 >>> 3) != 0) {
                return E11;
            }
            throw A.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int y() throws IOException {
            return E();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long z() throws IOException {
            return F();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.j$b */
    static final class b extends AbstractC5904j {

        /* renamed from: f, reason: collision with root package name */
        private final ByteArrayInputStream f59415f;

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f59416g;

        /* renamed from: h, reason: collision with root package name */
        private int f59417h;

        /* renamed from: i, reason: collision with root package name */
        private int f59418i;

        /* renamed from: j, reason: collision with root package name */
        private int f59419j;

        /* renamed from: k, reason: collision with root package name */
        private int f59420k;

        /* renamed from: l, reason: collision with root package name */
        private int f59421l;

        /* renamed from: m, reason: collision with root package name */
        private int f59422m;

        b(ByteArrayInputStream byteArrayInputStream) {
            super(0);
            this.f59422m = Integer.MAX_VALUE;
            byte[] bArr = C5919z.f59481b;
            this.f59415f = byteArrayInputStream;
            this.f59416g = new byte[4096];
            this.f59417h = 0;
            this.f59419j = 0;
            this.f59421l = 0;
        }

        private byte[] C(int i11) throws IOException {
            byte[] D11 = D(i11);
            if (D11 != null) {
                return D11;
            }
            int i12 = this.f59419j;
            int i13 = this.f59417h;
            int i14 = i13 - i12;
            this.f59421l += i13;
            this.f59419j = 0;
            this.f59417h = 0;
            ArrayList E11 = E(i11 - i14);
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f59416g, i12, bArr, 0, i14);
            Iterator it = E11.iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                i14 += bArr2.length;
            }
            return bArr;
        }

        private byte[] D(int i11) throws IOException {
            if (i11 == 0) {
                return C5919z.f59481b;
            }
            if (i11 < 0) {
                throw A.g();
            }
            int i12 = this.f59421l;
            int i13 = this.f59419j;
            int i14 = i12 + i13 + i11;
            if (i14 - this.f59406d > 0) {
                throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            int i15 = this.f59422m;
            if (i14 > i15) {
                M((i15 - i12) - i13);
                throw A.l();
            }
            int i16 = this.f59417h - i13;
            int i17 = i11 - i16;
            ByteArrayInputStream byteArrayInputStream = this.f59415f;
            if (i17 >= 4096) {
                try {
                    if (i17 > byteArrayInputStream.available()) {
                        return null;
                    }
                } catch (A e11) {
                    e11.i();
                    throw e11;
                }
            }
            byte[] bArr = new byte[i11];
            System.arraycopy(this.f59416g, this.f59419j, bArr, 0, i16);
            this.f59421l += this.f59417h;
            this.f59419j = 0;
            this.f59417h = 0;
            while (i16 < i11) {
                try {
                    int read = byteArrayInputStream.read(bArr, i16, i11 - i16);
                    if (read == -1) {
                        throw A.l();
                    }
                    this.f59421l += read;
                    i16 += read;
                } catch (A e12) {
                    e12.i();
                    throw e12;
                }
            }
            return bArr;
        }

        private ArrayList E(int i11) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i11 > 0) {
                int min = Math.min(i11, 4096);
                byte[] bArr = new byte[min];
                int i12 = 0;
                while (i12 < min) {
                    int read = this.f59415f.read(bArr, i12, min - i12);
                    if (read == -1) {
                        throw A.l();
                    }
                    this.f59421l += read;
                    i12 += read;
                }
                i11 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void K() {
            int i11 = this.f59417h + this.f59418i;
            this.f59417h = i11;
            int i12 = this.f59421l + i11;
            int i13 = this.f59422m;
            if (i12 <= i13) {
                this.f59418i = 0;
                return;
            }
            int i14 = i12 - i13;
            this.f59418i = i14;
            this.f59417h = i11 - i14;
        }

        private void L(int i11) throws IOException {
            if (N(i11)) {
                return;
            }
            if (i11 <= (this.f59406d - this.f59421l) - this.f59419j) {
                throw A.l();
            }
            throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }

        private boolean N(int i11) throws IOException {
            int i12 = this.f59419j;
            int i13 = i12 + i11;
            int i14 = this.f59417h;
            if (i13 <= i14) {
                throw new IllegalStateException(T7.E.a(i11, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
            int i15 = this.f59421l;
            int i16 = this.f59406d;
            if (i11 <= (i16 - i15) - i12 && i15 + i12 + i11 <= this.f59422m) {
                byte[] bArr = this.f59416g;
                if (i12 > 0) {
                    if (i14 > i12) {
                        System.arraycopy(bArr, i12, bArr, 0, i14 - i12);
                    }
                    this.f59421l += i12;
                    this.f59417h -= i12;
                    this.f59419j = 0;
                }
                int i17 = this.f59417h;
                int min = Math.min(bArr.length - i17, (i16 - this.f59421l) - i17);
                ByteArrayInputStream byteArrayInputStream = this.f59415f;
                try {
                    int read = byteArrayInputStream.read(bArr, i17, min);
                    if (read == 0 || read < -1 || read > bArr.length) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                    }
                    if (read > 0) {
                        this.f59417h += read;
                        K();
                        if (this.f59417h >= i11 || N(i11)) {
                            return true;
                        }
                    }
                } catch (A e11) {
                    e11.i();
                    throw e11;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final boolean A(int i11) throws IOException {
            int i12 = i11 & 7;
            int i13 = 0;
            if (i12 != 0) {
                if (i12 == 1) {
                    M(8);
                    return true;
                }
                if (i12 == 2) {
                    M(H());
                    return true;
                }
                if (i12 == 3) {
                    B();
                    a(((i11 >>> 3) << 3) | 4);
                    return true;
                }
                if (i12 == 4) {
                    if (this.f59404b == 0) {
                        a(0);
                    }
                    return false;
                }
                if (i12 != 5) {
                    throw A.e();
                }
                M(4);
                return true;
            }
            int i14 = this.f59417h - this.f59419j;
            byte[] bArr = this.f59416g;
            if (i14 >= 10) {
                while (i13 < 10) {
                    int i15 = this.f59419j;
                    this.f59419j = i15 + 1;
                    if (bArr[i15] < 0) {
                        i13++;
                    }
                }
                throw A.f();
            }
            while (i13 < 10) {
                if (this.f59419j == this.f59417h) {
                    L(1);
                }
                int i16 = this.f59419j;
                this.f59419j = i16 + 1;
                if (bArr[i16] < 0) {
                    i13++;
                }
            }
            throw A.f();
            return true;
        }

        public final int F() throws IOException {
            int i11 = this.f59419j;
            if (this.f59417h - i11 < 4) {
                L(4);
                i11 = this.f59419j;
            }
            this.f59419j = i11 + 4;
            byte[] bArr = this.f59416g;
            return ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        }

        public final long G() throws IOException {
            int i11 = this.f59419j;
            if (this.f59417h - i11 < 8) {
                L(8);
                i11 = this.f59419j;
            }
            this.f59419j = i11 + 8;
            byte[] bArr = this.f59416g;
            return ((bArr[i11 + 7] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24) | ((bArr[i11 + 4] & 255) << 32) | ((bArr[i11 + 5] & 255) << 40) | ((bArr[i11 + 6] & 255) << 48);
        }

        public final int H() throws IOException {
            int i11;
            int i12 = this.f59419j;
            int i13 = this.f59417h;
            if (i13 != i12) {
                int i14 = i12 + 1;
                byte[] bArr = this.f59416g;
                byte b11 = bArr[i12];
                if (b11 >= 0) {
                    this.f59419j = i14;
                    return b11;
                }
                if (i13 - i14 >= 9) {
                    int i15 = i12 + 2;
                    int i16 = (bArr[i14] << 7) ^ b11;
                    if (i16 < 0) {
                        i11 = i16 ^ (-128);
                    } else {
                        int i17 = i12 + 3;
                        int i18 = (bArr[i15] << 14) ^ i16;
                        if (i18 >= 0) {
                            i11 = i18 ^ 16256;
                        } else {
                            int i19 = i12 + 4;
                            int i21 = i18 ^ (bArr[i17] << 21);
                            if (i21 < 0) {
                                i11 = (-2080896) ^ i21;
                            } else {
                                i17 = i12 + 5;
                                byte b12 = bArr[i19];
                                int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                                if (b12 < 0) {
                                    i19 = i12 + 6;
                                    if (bArr[i17] < 0) {
                                        i17 = i12 + 7;
                                        if (bArr[i19] < 0) {
                                            i19 = i12 + 8;
                                            if (bArr[i17] < 0) {
                                                i17 = i12 + 9;
                                                if (bArr[i19] < 0) {
                                                    int i23 = i12 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i15 = i23;
                                                        i11 = i22;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i11 = i22;
                                }
                                i11 = i22;
                            }
                            i15 = i19;
                        }
                        i15 = i17;
                    }
                    this.f59419j = i15;
                    return i11;
                }
            }
            return (int) J();
        }

        public final long I() throws IOException {
            long j11;
            long j12;
            long j13;
            long j14;
            int i11 = this.f59419j;
            int i12 = this.f59417h;
            if (i12 != i11) {
                int i13 = i11 + 1;
                byte[] bArr = this.f59416g;
                byte b11 = bArr[i11];
                if (b11 >= 0) {
                    this.f59419j = i13;
                    return b11;
                }
                if (i12 - i13 >= 9) {
                    int i14 = i11 + 2;
                    int i15 = (bArr[i13] << 7) ^ b11;
                    if (i15 < 0) {
                        j11 = i15 ^ (-128);
                    } else {
                        int i16 = i11 + 3;
                        int i17 = (bArr[i14] << 14) ^ i15;
                        if (i17 >= 0) {
                            j11 = i17 ^ 16256;
                            i14 = i16;
                        } else {
                            int i18 = i11 + 4;
                            int i19 = i17 ^ (bArr[i16] << 21);
                            if (i19 < 0) {
                                j14 = (-2080896) ^ i19;
                            } else {
                                long j15 = i19;
                                i14 = i11 + 5;
                                long j16 = j15 ^ (bArr[i18] << 28);
                                if (j16 >= 0) {
                                    j13 = 266354560;
                                } else {
                                    i18 = i11 + 6;
                                    long j17 = j16 ^ (bArr[i14] << 35);
                                    if (j17 < 0) {
                                        j12 = -34093383808L;
                                    } else {
                                        i14 = i11 + 7;
                                        j16 = j17 ^ (bArr[i18] << 42);
                                        if (j16 >= 0) {
                                            j13 = 4363953127296L;
                                        } else {
                                            i18 = i11 + 8;
                                            j17 = j16 ^ (bArr[i14] << 49);
                                            if (j17 < 0) {
                                                j12 = -558586000294016L;
                                            } else {
                                                i14 = i11 + 9;
                                                long j18 = (j17 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                                if (j18 < 0) {
                                                    int i21 = i11 + 10;
                                                    if (bArr[i14] >= 0) {
                                                        i14 = i21;
                                                    }
                                                }
                                                j11 = j18;
                                            }
                                        }
                                    }
                                    j14 = j12 ^ j17;
                                }
                                j11 = j13 ^ j16;
                            }
                            i14 = i18;
                            j11 = j14;
                        }
                    }
                    this.f59419j = i14;
                    return j11;
                }
            }
            return J();
        }

        final long J() throws IOException {
            long j11 = 0;
            for (int i11 = 0; i11 < 64; i11 += 7) {
                if (this.f59419j == this.f59417h) {
                    L(1);
                }
                int i12 = this.f59419j;
                this.f59419j = i12 + 1;
                j11 |= (r3 & Byte.MAX_VALUE) << i11;
                if ((this.f59416g[i12] & 128) == 0) {
                    return j11;
                }
            }
            throw A.f();
        }

        public final void M(int i11) throws IOException {
            int i12 = this.f59417h;
            int i13 = this.f59419j;
            int i14 = i12 - i13;
            if (i11 <= i14 && i11 >= 0) {
                this.f59419j = i13 + i11;
                return;
            }
            ByteArrayInputStream byteArrayInputStream = this.f59415f;
            if (i11 < 0) {
                throw A.g();
            }
            int i15 = this.f59421l;
            int i16 = i15 + i13;
            int i17 = i16 + i11;
            int i18 = this.f59422m;
            if (i17 > i18) {
                M((i18 - i15) - i13);
                throw A.l();
            }
            this.f59421l = i16;
            this.f59417h = 0;
            this.f59419j = 0;
            while (i14 < i11) {
                long j11 = i11 - i14;
                try {
                    try {
                        long skip = byteArrayInputStream.skip(j11);
                        if (skip < 0 || skip > j11) {
                            throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        }
                        if (skip == 0) {
                            break;
                        } else {
                            i14 += (int) skip;
                        }
                    } catch (A e11) {
                        e11.i();
                        throw e11;
                    }
                } catch (Throwable th2) {
                    this.f59421l += i14;
                    K();
                    throw th2;
                }
            }
            this.f59421l += i14;
            K();
            if (i14 >= i11) {
                return;
            }
            int i19 = this.f59417h;
            int i21 = i19 - this.f59419j;
            this.f59419j = i19;
            L(1);
            while (true) {
                int i22 = i11 - i21;
                int i23 = this.f59417h;
                if (i22 <= i23) {
                    this.f59419j = i22;
                    return;
                } else {
                    i21 += i23;
                    this.f59419j = i23;
                    L(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final void a(int i11) throws A {
            if (this.f59420k != i11) {
                throw new A("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int d() {
            return this.f59421l + this.f59419j;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final boolean e() throws IOException {
            return this.f59419j == this.f59417h && !N(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final void g(int i11) {
            this.f59422m = i11;
            K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int h(int i11) throws A {
            if (i11 < 0) {
                throw A.g();
            }
            int i12 = this.f59421l + this.f59419j + i11;
            if (i12 < 0) {
                throw new A("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            int i13 = this.f59422m;
            if (i12 > i13) {
                throw A.l();
            }
            this.f59422m = i12;
            K();
            return i13;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final boolean i() throws IOException {
            return I() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final AbstractC5903i j() throws IOException {
            int H11 = H();
            int i11 = this.f59417h;
            int i12 = this.f59419j;
            int i13 = i11 - i12;
            byte[] bArr = this.f59416g;
            if (H11 <= i13 && H11 > 0) {
                AbstractC5903i e11 = AbstractC5903i.e(i12, H11, bArr);
                this.f59419j += H11;
                return e11;
            }
            if (H11 == 0) {
                return AbstractC5903i.f59377b;
            }
            if (H11 < 0) {
                throw A.g();
            }
            byte[] D11 = D(H11);
            if (D11 != null) {
                return AbstractC5903i.e(0, D11.length, D11);
            }
            int i14 = this.f59419j;
            int i15 = this.f59417h;
            int i16 = i15 - i14;
            this.f59421l += i15;
            this.f59419j = 0;
            this.f59417h = 0;
            ArrayList E11 = E(H11 - i16);
            byte[] bArr2 = new byte[H11];
            System.arraycopy(bArr, i14, bArr2, 0, i16);
            Iterator it = E11.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, i16, bArr3.length);
                i16 += bArr3.length;
            }
            AbstractC5903i abstractC5903i = AbstractC5903i.f59377b;
            return new AbstractC5903i.g(bArr2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final double k() throws IOException {
            return Double.longBitsToDouble(G());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int l() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int m() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long n() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final float o() throws IOException {
            return Float.intBitsToFloat(F());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int p() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long q() throws IOException {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int r() throws IOException {
            return F();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long s() throws IOException {
            return G();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int t() throws IOException {
            return AbstractC5904j.b(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long u() throws IOException {
            return AbstractC5904j.c(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final String v() throws IOException {
            int H11 = H();
            byte[] bArr = this.f59416g;
            if (H11 > 0) {
                int i11 = this.f59417h;
                int i12 = this.f59419j;
                if (H11 <= i11 - i12) {
                    String str = new String(bArr, i12, H11, C5919z.f59480a);
                    this.f59419j += H11;
                    return str;
                }
            }
            if (H11 == 0) {
                return "";
            }
            if (H11 < 0) {
                throw A.g();
            }
            if (H11 > this.f59417h) {
                return new String(C(H11), C5919z.f59480a);
            }
            L(H11);
            String str2 = new String(bArr, this.f59419j, H11, C5919z.f59480a);
            this.f59419j += H11;
            return str2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final String w() throws IOException {
            int H11 = H();
            int i11 = this.f59419j;
            int i12 = this.f59417h;
            int i13 = i12 - i11;
            byte[] bArr = this.f59416g;
            if (H11 <= i13 && H11 > 0) {
                this.f59419j = i11 + H11;
            } else {
                if (H11 == 0) {
                    return "";
                }
                if (H11 < 0) {
                    throw A.g();
                }
                i11 = 0;
                if (H11 <= i12) {
                    L(H11);
                    this.f59419j = H11;
                } else {
                    bArr = C(H11);
                }
            }
            return q0.d(bArr, i11, H11);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int x() throws IOException {
            if (e()) {
                this.f59420k = 0;
                return 0;
            }
            int H11 = H();
            this.f59420k = H11;
            if ((H11 >>> 3) != 0) {
                return H11;
            }
            throw A.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final int y() throws IOException {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5904j
        public final long z() throws IOException {
            return I();
        }
    }

    AbstractC5904j(int i11) {
    }

    public static int b(int i11) {
        return (-(i11 & 1)) ^ (i11 >>> 1);
    }

    public static long c(long j11) {
        return (-(j11 & 1)) ^ (j11 >>> 1);
    }

    static AbstractC5904j f(byte[] bArr, int i11, int i12, boolean z11) {
        a aVar = new a(bArr, i11, i12, z11);
        try {
            aVar.h(i12);
            return aVar;
        } catch (A e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public abstract boolean A(int i11) throws IOException;

    public final void B() throws IOException {
        int x11;
        do {
            x11 = x();
            if (x11 == 0) {
                return;
            }
            int i11 = this.f59403a;
            int i12 = this.f59404b;
            if (i11 + i12 >= this.f59405c) {
                throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f59404b = i12 + 1;
            this.f59404b--;
        } while (A(x11));
    }

    public abstract void a(int i11) throws A;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void g(int i11);

    public abstract int h(int i11) throws A;

    public abstract boolean i() throws IOException;

    public abstract AbstractC5903i j() throws IOException;

    public abstract double k() throws IOException;

    public abstract int l() throws IOException;

    public abstract int m() throws IOException;

    public abstract long n() throws IOException;

    public abstract float o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract String v() throws IOException;

    public abstract String w() throws IOException;

    public abstract int x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;
}
