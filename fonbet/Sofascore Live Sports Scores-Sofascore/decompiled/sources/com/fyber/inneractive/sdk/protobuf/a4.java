package com.fyber.inneractive.sdk.protobuf;

import defpackage.ogj;
import defpackage.yhk;
import defpackage.zzl;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class a4 extends z3 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        return r10 + r7;
     */
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char charAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (charAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) charAt;
            i6++;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char charAt2 = charSequence.charAt(i6);
            if (charAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) charAt2;
                i7++;
            } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((charAt2 & '?') | 128);
            } else {
                if ((charAt2 >= 55296 && 57343 >= charAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new b4(i6, length);
                        }
                        ogj.d(charAt2, i7);
                        return 0;
                    }
                    int i9 = i6 + 1;
                    if (i9 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i9);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new b4(i6 - 1, length);
                }
                bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        return z3.a(byteBuffer, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094 A[RETURN] */
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    i = i3;
                } else {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i3 < i2 - 1) {
                            int i4 = i + 2;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                                i += 3;
                                if (bArr[i4] > -65) {
                                }
                            }
                            return -1;
                        }
                        int i5 = i2 - i3;
                        if (i5 == 0) {
                            if (b > -12) {
                                return -1;
                            }
                            return b;
                        }
                        if (i5 == 1) {
                            return d4.a(b, bArr[i3]);
                        }
                        if (i5 == 2) {
                            return d4.a(b, bArr[i3], bArr[i + 2]);
                        }
                        ogj.b();
                        return 0;
                    }
                    if (i3 < i2 - 2) {
                        int i6 = i + 2;
                        byte b3 = bArr[i3];
                        if (b3 <= -65) {
                            if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                                int i7 = i + 3;
                                if (bArr[i6] <= -65) {
                                    i += 4;
                                    if (bArr[i7] > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    int i8 = i2 - i3;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            return d4.a(b, bArr[i3]);
                        }
                        if (i8 == 2) {
                            return d4.a(b, bArr[i3], bArr[i + 2]);
                        }
                        ogj.b();
                        return 0;
                    }
                    if (b > -12) {
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i, int i2) {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!y3.a(b)) {
                    break;
                }
                i++;
                cArr[i4] = (char) b;
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (y3.a(b2)) {
                    cArr[i5] = (char) b2;
                    i5++;
                    i = i6;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (!y3.a(b3)) {
                            break;
                        }
                        i++;
                        cArr[i5] = (char) b3;
                        i5++;
                    }
                } else if (b2 < -32) {
                    if (i6 < i3) {
                        i += 2;
                        y3.a(b2, bArr[i6], cArr, i5);
                        i5++;
                    } else {
                        zzl.j("Protocol message had invalid UTF-8.");
                        return null;
                    }
                } else if (b2 < -16) {
                    if (i6 < i3 - 1) {
                        int i7 = i + 2;
                        i += 3;
                        y3.a(b2, bArr[i6], bArr[i7], cArr, i5);
                        i5++;
                    } else {
                        zzl.j("Protocol message had invalid UTF-8.");
                        return null;
                    }
                } else if (i6 < i3 - 2) {
                    byte b4 = bArr[i6];
                    int i8 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    y3.a(b2, b4, b5, bArr[i8], cArr, i5);
                    i5 += 2;
                } else {
                    zzl.j("Protocol message had invalid UTF-8.");
                    return null;
                }
            }
            return new String(cArr, 0, i5);
        }
        yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
        return null;
    }
}
