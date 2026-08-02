package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    static abstract class AbstractC1122a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f68616a;
    }

    static class b extends AbstractC1122a {

        /* renamed from: i, reason: collision with root package name */
        private static final byte[] f68617i = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f68618b;

        /* renamed from: c, reason: collision with root package name */
        int f68619c;

        /* renamed from: d, reason: collision with root package name */
        private int f68620d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f68621e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f68622f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f68623g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f68624h;

        public b() {
            this.f68616a = null;
            this.f68621e = false;
            this.f68622f = false;
            this.f68623g = false;
            this.f68624h = f68617i;
            this.f68618b = new byte[2];
            this.f68619c = 0;
            this.f68620d = -1;
        }

        public final void a(int i11, byte[] bArr) {
            int i12;
            int i13;
            int i14;
            byte b11;
            byte b12;
            byte b13;
            int i15;
            byte[] bArr2 = this.f68616a;
            int i16 = this.f68620d;
            int i17 = this.f68619c;
            byte[] bArr3 = this.f68618b;
            char c11 = 2;
            int i18 = 1;
            int i19 = 0;
            if (i17 != 1) {
                if (i17 == 2 && 1 <= i11) {
                    i12 = ((bArr3[0] & 255) << 16) | ((bArr3[1] & 255) << 8) | (bArr[0] & 255);
                    this.f68619c = 0;
                    i13 = 1;
                }
                i12 = -1;
                i13 = 0;
            } else {
                if (2 <= i11) {
                    i12 = ((bArr3[0] & 255) << 16) | ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                    this.f68619c = 0;
                    i13 = 2;
                }
                i12 = -1;
                i13 = 0;
            }
            byte[] bArr4 = this.f68624h;
            boolean z11 = this.f68623g;
            if (i12 != -1) {
                bArr2[0] = bArr4[(i12 >> 18) & 63];
                bArr2[1] = bArr4[(i12 >> 12) & 63];
                bArr2[2] = bArr4[(i12 >> 6) & 63];
                bArr2[3] = bArr4[i12 & 63];
                i16--;
                if (i16 == 0) {
                    if (z11) {
                        bArr2[4] = 13;
                        i15 = 5;
                    } else {
                        i15 = 4;
                    }
                    i14 = i15 + 1;
                    bArr2[i15] = 10;
                    i16 = 19;
                } else {
                    i14 = 4;
                }
            } else {
                i14 = 0;
            }
            while (true) {
                int i21 = i13 + 3;
                if (i21 > i11) {
                    break;
                }
                char c12 = c11;
                int i22 = i19;
                int i23 = ((bArr[i13] & 255) << 16) | ((bArr[i13 + 1] & 255) << 8) | (bArr[i13 + 2] & 255);
                bArr2[i14] = bArr4[(i23 >> 18) & 63];
                bArr2[i14 + 1] = bArr4[(i23 >> 12) & 63];
                bArr2[i14 + 2] = bArr4[(i23 >> 6) & 63];
                bArr2[i14 + 3] = bArr4[i23 & 63];
                int i24 = i14 + 4;
                i16--;
                if (i16 == 0) {
                    if (z11) {
                        bArr2[i24] = 13;
                        i24 = i14 + 5;
                    }
                    i14 = i24 + 1;
                    bArr2[i24] = 10;
                    i13 = i21;
                    i16 = 19;
                } else {
                    i13 = i21;
                    i14 = i24;
                }
                c11 = c12;
                i19 = i22;
            }
            int i25 = i19;
            int i26 = this.f68619c;
            int i27 = i13 - i26;
            int i28 = i11 - 1;
            boolean z12 = this.f68621e;
            boolean z13 = this.f68622f;
            if (i27 == i28) {
                if (i26 > 0) {
                    b13 = bArr3[i25];
                } else {
                    b13 = bArr[i13];
                    i18 = i25;
                }
                int i29 = (b13 & 255) << 4;
                this.f68619c = i26 - i18;
                bArr2[i14] = bArr4[(i29 >> 6) & 63];
                int i31 = i14 + 2;
                bArr2[i14 + 1] = bArr4[i29 & 63];
                if (z12) {
                    bArr2[i31] = 61;
                    i31 = i14 + 4;
                    bArr2[i14 + 3] = 61;
                }
                if (z13) {
                    if (z11) {
                        bArr2[i31] = 13;
                        i31++;
                    }
                    bArr2[i31] = 10;
                }
            } else if (i27 == i11 - 2) {
                if (i26 > 1) {
                    b11 = bArr3[i25];
                } else {
                    byte b14 = bArr[i13];
                    i13++;
                    b11 = b14;
                    i18 = i25;
                }
                int i32 = (b11 & 255) << 10;
                if (i26 > 0) {
                    b12 = bArr3[i18];
                    i18++;
                } else {
                    b12 = bArr[i13];
                }
                int i33 = i32 | ((b12 & 255) << 2);
                this.f68619c = i26 - i18;
                bArr2[i14] = bArr4[(i33 >> 12) & 63];
                bArr2[i14 + 1] = bArr4[(i33 >> 6) & 63];
                int i34 = i14 + 3;
                bArr2[i14 + 2] = bArr4[i33 & 63];
                if (z12) {
                    bArr2[i34] = 61;
                    i34 = i14 + 4;
                }
                if (z13) {
                    if (z11) {
                        bArr2[i34] = 13;
                        i34++;
                    }
                    bArr2[i34] = 10;
                }
            } else if (z13 && i14 > 0 && i16 != 19) {
                if (z11) {
                    bArr2[i14] = 13;
                    i14++;
                }
                bArr2[i14] = 10;
            }
            this.f68620d = i16;
        }
    }

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            b bVar = new b();
            int i11 = (length / 3) * 4;
            int i12 = length % 3;
            if (i12 == 1) {
                i11 += 2;
            } else if (i12 == 2) {
                i11 += 3;
            }
            bVar.f68616a = new byte[i11];
            bVar.a(length, bArr);
            return new String(bVar.f68616a, "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}
