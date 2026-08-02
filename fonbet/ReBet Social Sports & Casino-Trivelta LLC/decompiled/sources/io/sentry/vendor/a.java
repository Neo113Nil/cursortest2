package io.sentry.vendor;

import java.io.UnsupportedEncodingException;
import kotlin.UByte;
import kotlin.io.encoding.Base64;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0771a {

        /* renamed from: a, reason: collision with root package name */
        public int f52836a;
        public byte[] output;
    }

    public static class b extends AbstractC0771a {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private final int[] alphabet;

        /* renamed from: b, reason: collision with root package name */
        public int f52837b;

        /* renamed from: c, reason: collision with root package name */
        public int f52838c;

        public b(int i10, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i10 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.f52837b = 0;
            this.f52838c = 0;
        }

        public boolean a(byte[] bArr, int i10, int i11, boolean z10) {
            int i12 = this.f52837b;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f52838c;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & UByte.MAX_VALUE] << 18) | (iArr[bArr[i18 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bArr[i18 + 2] & UByte.MAX_VALUE] << 6) | iArr[bArr[i18 + 3] & UByte.MAX_VALUE]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & UByte.MAX_VALUE];
                if (i17 != 0) {
                    if (i17 == 1) {
                        if (i21 < 0) {
                            if (i21 != -1) {
                                this.f52837b = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 == 2) {
                        if (i21 < 0) {
                            if (i21 == -2) {
                                bArr2[i15] = (byte) (i16 >> 4);
                                i15++;
                                i17 = 4;
                            } else if (i21 != -1) {
                                this.f52837b = 6;
                                return false;
                            }
                        }
                        i21 |= i16 << 6;
                    } else if (i17 != 3) {
                        if (i17 != 4) {
                            if (i17 == 5 && i21 != -1) {
                                this.f52837b = 6;
                                return false;
                            }
                        } else if (i21 == -2) {
                            i17++;
                        } else if (i21 != -1) {
                            this.f52837b = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        int i22 = i21 | (i16 << 6);
                        bArr2[i15 + 2] = (byte) i22;
                        bArr2[i15 + 1] = (byte) (i22 >> 8);
                        bArr2[i15] = (byte) (i22 >> 16);
                        i15 += 3;
                        i16 = i22;
                        i17 = 0;
                    } else if (i21 == -2) {
                        bArr2[i15 + 1] = (byte) (i16 >> 2);
                        bArr2[i15] = (byte) (i16 >> 10);
                        i15 += 2;
                        i17 = 5;
                    } else if (i21 != -1) {
                        this.f52837b = 6;
                        return false;
                    }
                    i17++;
                    i16 = i21;
                } else {
                    if (i21 < 0) {
                        if (i21 != -1) {
                            this.f52837b = 6;
                            return false;
                        }
                    }
                    i17++;
                    i16 = i21;
                }
                i18 = i20;
            }
            if (!z10) {
                this.f52837b = i17;
                this.f52838c = i16;
                this.f52836a = i15;
                return true;
            }
            if (i17 == 1) {
                this.f52837b = 6;
                return false;
            }
            if (i17 == 2) {
                bArr2[i15] = (byte) (i16 >> 4);
                i15++;
            } else if (i17 == 3) {
                int i23 = i15 + 1;
                bArr2[i15] = (byte) (i16 >> 10);
                i15 += 2;
                bArr2[i23] = (byte) (i16 >> 2);
            } else if (i17 == 4) {
                this.f52837b = 6;
                return false;
            }
            this.f52837b = i17;
            this.f52836a = i15;
            return true;
        }
    }

    public static class c extends AbstractC0771a {
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        private final byte[] alphabet;

        /* renamed from: b, reason: collision with root package name */
        public int f52839b;

        /* renamed from: c, reason: collision with root package name */
        public int f52840c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f52841d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f52842e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f52843f;
        private final byte[] tail;

        public c(int i10, byte[] bArr) {
            this.output = bArr;
            this.f52841d = (i10 & 1) == 0;
            boolean z10 = (i10 & 2) == 0;
            this.f52842e = z10;
            this.f52843f = (i10 & 4) != 0;
            this.alphabet = (i10 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.f52839b = 0;
            this.f52840c = z10 ? 19 : -1;
        }

        public boolean a(byte[] bArr, int i10, int i11, boolean z10) {
            int i12;
            int i13;
            int i14;
            int i15;
            byte b10;
            byte b11;
            byte b12;
            int i16;
            int i17;
            byte[] bArr2 = this.alphabet;
            byte[] bArr3 = this.output;
            int i18 = this.f52840c;
            int i19 = i11 + i10;
            int i20 = this.f52839b;
            char c10 = 2;
            int i21 = 0;
            if (i20 != 1) {
                if (i20 == 2 && (i17 = i10 + 1) <= i19) {
                    byte[] bArr4 = this.tail;
                    i13 = ((bArr4[1] & UByte.MAX_VALUE) << 8) | ((bArr4[0] & UByte.MAX_VALUE) << 16) | (bArr[i10] & UByte.MAX_VALUE);
                    this.f52839b = 0;
                    i12 = i17;
                }
                i12 = i10;
                i13 = -1;
            } else {
                if (i10 + 2 <= i19) {
                    i12 = i10 + 2;
                    i13 = (bArr[i10 + 1] & UByte.MAX_VALUE) | ((this.tail[0] & UByte.MAX_VALUE) << 16) | ((bArr[i10] & UByte.MAX_VALUE) << 8);
                    this.f52839b = 0;
                }
                i12 = i10;
                i13 = -1;
            }
            if (i13 != -1) {
                bArr3[0] = bArr2[(i13 >> 18) & 63];
                bArr3[1] = bArr2[(i13 >> 12) & 63];
                bArr3[2] = bArr2[(i13 >> 6) & 63];
                bArr3[3] = bArr2[i13 & 63];
                i18--;
                if (i18 == 0) {
                    if (this.f52843f) {
                        bArr3[4] = 13;
                        i16 = 5;
                    } else {
                        i16 = 4;
                    }
                    i14 = i16 + 1;
                    bArr3[i16] = 10;
                    i18 = 19;
                } else {
                    i14 = 4;
                }
            } else {
                i14 = 0;
            }
            while (true) {
                int i22 = i12 + 3;
                if (i22 > i19) {
                    break;
                }
                char c11 = c10;
                int i23 = ((bArr[i12 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i12] & UByte.MAX_VALUE) << 16) | (bArr[i12 + 2] & UByte.MAX_VALUE);
                bArr3[i14] = bArr2[(i23 >> 18) & 63];
                bArr3[i14 + 1] = bArr2[(i23 >> 12) & 63];
                bArr3[i14 + 2] = bArr2[(i23 >> 6) & 63];
                bArr3[i14 + 3] = bArr2[i23 & 63];
                int i24 = i14 + 4;
                i18--;
                if (i18 == 0) {
                    if (this.f52843f) {
                        bArr3[i24] = 13;
                        i24 = i14 + 5;
                    }
                    i14 = i24 + 1;
                    bArr3[i24] = 10;
                    c10 = c11;
                    i18 = 19;
                    i12 = i22;
                } else {
                    i14 = i24;
                    i12 = i22;
                    c10 = c11;
                }
            }
            if (z10) {
                int i25 = this.f52839b;
                if (i12 - i25 == i19 - 1) {
                    if (i25 > 0) {
                        b12 = this.tail[0];
                        i21 = 1;
                    } else {
                        b12 = bArr[i12];
                    }
                    int i26 = (b12 & UByte.MAX_VALUE) << 4;
                    this.f52839b = i25 - i21;
                    bArr3[i14] = bArr2[(i26 >> 6) & 63];
                    int i27 = i14 + 2;
                    bArr3[i14 + 1] = bArr2[i26 & 63];
                    if (this.f52841d) {
                        bArr3[i27] = Base64.padSymbol;
                        i27 = i14 + 4;
                        bArr3[i14 + 3] = Base64.padSymbol;
                    }
                    if (this.f52842e) {
                        if (this.f52843f) {
                            bArr3[i27] = 13;
                            i27++;
                        }
                        i15 = i27 + 1;
                        bArr3[i27] = 10;
                        i14 = i15;
                    } else {
                        i14 = i27;
                    }
                } else if (i12 - i25 == i19 - 2) {
                    if (i25 > 1) {
                        b10 = this.tail[0];
                        i21 = 1;
                    } else {
                        byte b13 = bArr[i12];
                        i12++;
                        b10 = b13;
                    }
                    int i28 = (b10 & UByte.MAX_VALUE) << 10;
                    if (i25 > 0) {
                        b11 = this.tail[i21];
                        i21++;
                    } else {
                        b11 = bArr[i12];
                    }
                    int i29 = i28 | ((b11 & UByte.MAX_VALUE) << 2);
                    this.f52839b = i25 - i21;
                    bArr3[i14] = bArr2[(i29 >> 12) & 63];
                    bArr3[i14 + 1] = bArr2[(i29 >> 6) & 63];
                    int i30 = i14 + 3;
                    bArr3[i14 + 2] = bArr2[i29 & 63];
                    if (this.f52841d) {
                        bArr3[i30] = Base64.padSymbol;
                        i30 = i14 + 4;
                    }
                    if (this.f52842e) {
                        if (this.f52843f) {
                            bArr3[i30] = 13;
                            i30++;
                        }
                        i15 = i30 + 1;
                        bArr3[i30] = 10;
                        i14 = i15;
                    } else {
                        i14 = i30;
                    }
                } else if (this.f52842e && i14 > 0 && i18 != 19) {
                    if (this.f52843f) {
                        bArr3[i14] = 13;
                        i14++;
                    }
                    i15 = i14 + 1;
                    bArr3[i14] = 10;
                    i14 = i15;
                }
            } else if (i12 == i19 - 1) {
                byte[] bArr5 = this.tail;
                int i31 = this.f52839b;
                this.f52839b = i31 + 1;
                bArr5[i31] = bArr[i12];
            } else if (i12 == i19 - 2) {
                byte[] bArr6 = this.tail;
                int i32 = this.f52839b;
                int i33 = i32 + 1;
                this.f52839b = i33;
                bArr6[i32] = bArr[i12];
                this.f52839b = i32 + 2;
                bArr6[i33] = bArr[i12 + 1];
            }
            this.f52836a = i14;
            this.f52840c = i18;
            return true;
        }
    }

    public static byte[] a(String str, int i10) {
        return b(str.getBytes(), i10);
    }

    public static byte[] b(byte[] bArr, int i10) {
        return c(bArr, 0, bArr.length, i10);
    }

    public static byte[] c(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[(i11 * 3) / 4]);
        if (!bVar.a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = bVar.f52836a;
        byte[] bArr2 = bVar.output;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    public static byte[] d(byte[] bArr, int i10) {
        return e(bArr, 0, bArr.length, i10);
    }

    public static byte[] e(byte[] bArr, int i10, int i11, int i12) {
        c cVar = new c(i12, null);
        int i13 = (i11 / 3) * 4;
        if (!cVar.f52841d) {
            int i14 = i11 % 3;
            if (i14 == 1) {
                i13 += 2;
            } else if (i14 == 2) {
                i13 += 3;
            }
        } else if (i11 % 3 > 0) {
            i13 += 4;
        }
        if (cVar.f52842e && i11 > 0) {
            i13 += (((i11 - 1) / 57) + 1) * (cVar.f52843f ? 2 : 1);
        }
        cVar.output = new byte[i13];
        cVar.a(bArr, i10, i11, true);
        return cVar.output;
    }

    public static String f(byte[] bArr, int i10) {
        try {
            return new String(d(bArr, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
