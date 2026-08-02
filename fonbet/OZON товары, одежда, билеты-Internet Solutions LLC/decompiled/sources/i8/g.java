package i8;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f66094a = Charset.forName("UTF-8");

    static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f66095a;

        /* renamed from: b, reason: collision with root package name */
        public int f66096b;
    }

    static class b extends a {

        /* renamed from: f, reason: collision with root package name */
        private static final int[] f66097f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c, reason: collision with root package name */
        private int f66098c;

        /* renamed from: d, reason: collision with root package name */
        private int f66099d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f66100e;

        public b(byte[] bArr) {
            this.f66095a = bArr;
            this.f66100e = f66097f;
            this.f66098c = 0;
            this.f66099d = 0;
        }

        public final boolean a(int i11, byte[] bArr) {
            int i12 = this.f66098c;
            if (i12 == 6) {
                return false;
            }
            int i13 = this.f66099d;
            byte[] bArr2 = this.f66095a;
            int i14 = 0;
            int i15 = 0;
            while (i14 < i11) {
                int[] iArr = this.f66100e;
                if (i12 == 0) {
                    while (true) {
                        int i16 = i14 + 4;
                        if (i16 > i11 || (i13 = (iArr[bArr[i14] & 255] << 18) | (iArr[bArr[i14 + 1] & 255] << 12) | (iArr[bArr[i14 + 2] & 255] << 6) | iArr[bArr[i14 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i13;
                        bArr2[i15 + 1] = (byte) (i13 >> 8);
                        bArr2[i15] = (byte) (i13 >> 16);
                        i15 += 3;
                        i14 = i16;
                    }
                    if (i14 >= i11) {
                        break;
                    }
                }
                int i17 = i14 + 1;
                int i18 = iArr[bArr[i14] & 255];
                if (i12 != 0) {
                    if (i12 == 1) {
                        if (i18 < 0) {
                            if (i18 != -1) {
                                this.f66098c = 6;
                                return false;
                            }
                        }
                        i13 = (i13 << 6) | i18;
                    } else if (i12 == 2) {
                        if (i18 < 0) {
                            if (i18 == -2) {
                                bArr2[i15] = (byte) (i13 >> 4);
                                i15++;
                                i12 = 4;
                            } else if (i18 != -1) {
                                this.f66098c = 6;
                                return false;
                            }
                        }
                        i13 = (i13 << 6) | i18;
                    } else if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5 && i18 != -1) {
                                this.f66098c = 6;
                                return false;
                            }
                        } else if (i18 != -2) {
                            if (i18 != -1) {
                                this.f66098c = 6;
                                return false;
                            }
                        }
                    } else if (i18 >= 0) {
                        int i19 = (i13 << 6) | i18;
                        bArr2[i15 + 2] = (byte) i19;
                        bArr2[i15 + 1] = (byte) (i19 >> 8);
                        bArr2[i15] = (byte) (i19 >> 16);
                        i15 += 3;
                        i13 = i19;
                        i12 = 0;
                    } else if (i18 == -2) {
                        bArr2[i15 + 1] = (byte) (i13 >> 2);
                        bArr2[i15] = (byte) (i13 >> 10);
                        i15 += 2;
                        i12 = 5;
                    } else if (i18 != -1) {
                        this.f66098c = 6;
                        return false;
                    }
                    i12++;
                } else if (i18 >= 0) {
                    i12++;
                    i13 = i18;
                } else if (i18 != -1) {
                    this.f66098c = 6;
                    return false;
                }
                i14 = i17;
            }
            if (i12 == 1) {
                this.f66098c = 6;
                return false;
            }
            if (i12 == 2) {
                bArr2[i15] = (byte) (i13 >> 4);
                i15++;
            } else if (i12 == 3) {
                int i21 = i15 + 1;
                bArr2[i15] = (byte) (i13 >> 10);
                i15 += 2;
                bArr2[i21] = (byte) (i13 >> 2);
            } else if (i12 == 4) {
                this.f66098c = 6;
                return false;
            }
            this.f66098c = i12;
            this.f66096b = i15;
            return true;
        }
    }

    static class c extends a {

        /* renamed from: j, reason: collision with root package name */
        private static final byte[] f66101j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f66102c;

        /* renamed from: d, reason: collision with root package name */
        int f66103d;

        /* renamed from: e, reason: collision with root package name */
        private int f66104e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f66105f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f66106g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f66107h;

        /* renamed from: i, reason: collision with root package name */
        private final byte[] f66108i;

        public c() {
            this.f66095a = null;
            this.f66105f = true;
            this.f66106g = false;
            this.f66107h = false;
            this.f66108i = f66101j;
            this.f66102c = new byte[2];
            this.f66103d = 0;
            this.f66104e = -1;
        }

        public final boolean a(int i11, byte[] bArr) {
            int i12;
            int i13;
            int i14;
            int i15;
            byte b11;
            int i16;
            byte b12;
            byte b13;
            int i17;
            int i18;
            byte[] bArr2 = this.f66095a;
            int i19 = this.f66104e;
            int i21 = this.f66103d;
            byte[] bArr3 = this.f66102c;
            char c11 = 2;
            int i22 = 0;
            if (i21 != 1) {
                if (i21 == 2 && 1 <= i11) {
                    i12 = ((bArr3[0] & 255) << 16) | ((bArr3[1] & 255) << 8) | (bArr[0] & 255);
                    this.f66103d = 0;
                    i13 = 1;
                }
                i12 = -1;
                i13 = 0;
            } else {
                if (2 <= i11) {
                    i12 = ((bArr3[0] & 255) << 16) | ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                    this.f66103d = 0;
                    i13 = 2;
                }
                i12 = -1;
                i13 = 0;
            }
            byte[] bArr4 = this.f66108i;
            boolean z11 = this.f66107h;
            if (i12 != -1) {
                bArr2[0] = bArr4[(i12 >> 18) & 63];
                bArr2[1] = bArr4[(i12 >> 12) & 63];
                bArr2[2] = bArr4[(i12 >> 6) & 63];
                bArr2[3] = bArr4[i12 & 63];
                i19--;
                if (i19 == 0) {
                    if (z11) {
                        bArr2[4] = 13;
                        i18 = 5;
                    } else {
                        i18 = 4;
                    }
                    i14 = i18 + 1;
                    bArr2[i18] = 10;
                    i19 = 19;
                } else {
                    i14 = 4;
                }
            } else {
                i14 = 0;
            }
            while (true) {
                int i23 = i13 + 3;
                if (i23 > i11) {
                    break;
                }
                char c12 = c11;
                int i24 = i22;
                int i25 = ((bArr[i13] & 255) << 16) | ((bArr[i13 + 1] & 255) << 8) | (bArr[i13 + 2] & 255);
                bArr2[i14] = bArr4[(i25 >> 18) & 63];
                bArr2[i14 + 1] = bArr4[(i25 >> 12) & 63];
                bArr2[i14 + 2] = bArr4[(i25 >> 6) & 63];
                bArr2[i14 + 3] = bArr4[i25 & 63];
                int i26 = i14 + 4;
                i19--;
                if (i19 == 0) {
                    if (z11) {
                        bArr2[i26] = 13;
                        i26 = i14 + 5;
                    }
                    i14 = i26 + 1;
                    bArr2[i26] = 10;
                    i13 = i23;
                    i19 = 19;
                } else {
                    i13 = i23;
                    i14 = i26;
                }
                c11 = c12;
                i22 = i24;
            }
            int i27 = i22;
            int i28 = this.f66103d;
            int i29 = i13 - i28;
            int i31 = i11 - 1;
            boolean z12 = this.f66105f;
            boolean z13 = this.f66106g;
            if (i29 == i31) {
                if (i28 > 0) {
                    b13 = bArr3[i27];
                    i17 = 1;
                } else {
                    b13 = bArr[i13];
                    i17 = i27;
                }
                int i32 = (b13 & 255) << 4;
                this.f66103d = i28 - i17;
                bArr2[i14] = bArr4[(i32 >> 6) & 63];
                int i33 = i14 + 2;
                bArr2[i14 + 1] = bArr4[i32 & 63];
                if (z12) {
                    bArr2[i33] = 61;
                    i33 = i14 + 4;
                    bArr2[i14 + 3] = 61;
                }
                if (z13) {
                    if (z11) {
                        bArr2[i33] = 13;
                        i33++;
                    }
                    i15 = i33 + 1;
                    bArr2[i33] = 10;
                    i14 = i15;
                } else {
                    i14 = i33;
                }
            } else if (i29 == i11 - 2) {
                if (i28 > 1) {
                    b11 = bArr3[i27];
                    i16 = 1;
                } else {
                    byte b14 = bArr[i13];
                    i13++;
                    b11 = b14;
                    i16 = i27;
                }
                int i34 = (b11 & 255) << 10;
                if (i28 > 0) {
                    b12 = bArr3[i16];
                    i16++;
                } else {
                    b12 = bArr[i13];
                }
                int i35 = i34 | ((b12 & 255) << 2);
                this.f66103d = i28 - i16;
                bArr2[i14] = bArr4[(i35 >> 12) & 63];
                bArr2[i14 + 1] = bArr4[(i35 >> 6) & 63];
                int i36 = i14 + 3;
                bArr2[i14 + 2] = bArr4[i35 & 63];
                if (z12) {
                    bArr2[i36] = 61;
                    i36 = i14 + 4;
                }
                if (z13) {
                    if (z11) {
                        bArr2[i36] = 13;
                        i36++;
                    }
                    i15 = i36 + 1;
                    bArr2[i36] = 10;
                    i14 = i15;
                } else {
                    i14 = i36;
                }
            } else if (z13 && i14 > 0 && i19 != 19) {
                if (z11) {
                    bArr2[i14] = 13;
                    i14++;
                }
                i15 = i14 + 1;
                bArr2[i14] = 10;
                i14 = i15;
            }
            this.f66096b = i14;
            this.f66104e = i19;
            return true;
        }
    }

    public static byte[] a(String str) {
        byte[] bytes = str.getBytes(f66094a);
        int length = bytes.length;
        b bVar = new b(new byte[(length * 3) / 4]);
        if (!bVar.a(length, bytes)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i11 = bVar.f66096b;
        byte[] bArr = bVar.f66095a;
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public static String b(byte[] bArr) {
        try {
            int length = bArr.length;
            c cVar = new c();
            int i11 = (length / 3) * 4;
            if (length % 3 > 0) {
                i11 += 4;
            }
            cVar.f66095a = new byte[i11];
            cVar.a(length, bArr);
            return new String(cVar.f66095a, "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}
