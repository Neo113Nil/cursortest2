package com.fyber.inneractive.sdk.protobuf;

import defpackage.ogj;
import defpackage.yhk;
import defpackage.zzl;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c4 extends z3 {
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        long j3;
        int i3;
        char charAt;
        long j4 = i;
        long j5 = i2 + j4;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            yhk.f(charSequence.charAt(length - 1), i + i2);
            return 0;
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            x3.c.a((Object) bArr, x3.f + j4, (byte) charAt);
            i4++;
            j4 = 1 + j4;
        }
        if (i4 == length) {
            return (int) j4;
        }
        while (i4 < length) {
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 >= 128 || j4 >= j5) {
                if (charAt2 >= 2048 || j4 > j5 - 2) {
                    j2 = j;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                        if (j4 > j5 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new b4(i4, length);
                            }
                            zzl.d(charAt2, j4);
                            return 0;
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char charAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                w3 w3Var = x3.c;
                                long j6 = x3.f;
                                w3Var.a((Object) bArr, j6 + j4, (byte) ((codePoint >>> 18) | 240));
                                w3Var.a((Object) bArr, j6 + j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j7 = j4 + 3;
                                w3Var.a((Object) bArr, j6 + j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 += 4;
                                w3Var.a((Object) bArr, j6 + j7, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new b4(i4 - 1, length);
                    }
                    w3 w3Var2 = x3.c;
                    long j8 = x3.f;
                    w3Var2.a((Object) bArr, j8 + j4, (byte) ((charAt2 >>> '\f') | 480));
                    w3Var2.a((Object) bArr, j8 + j4 + j2, (byte) (((charAt2 >>> 6) & 63) | 128));
                    w3Var2.a((Object) bArr, j8 + j4 + 2, (byte) ((charAt2 & '?') | 128));
                    j3 = j4 + 3;
                } else {
                    long j9 = j4 + j;
                    w3 w3Var3 = x3.c;
                    long j10 = x3.f;
                    j2 = j;
                    w3Var3.a((Object) bArr, j10 + j4, (byte) ((charAt2 >>> 6) | 960));
                    j4 += 2;
                    w3Var3.a((Object) bArr, j10 + j9, (byte) ((charAt2 & '?') | 128));
                }
                i4++;
                j = j2;
            } else {
                j3 = j4 + j;
                x3.c.a((Object) bArr, x3.f + j4, (byte) charAt2);
                j2 = j;
            }
            j4 = j3;
            i4++;
            j = j2;
        }
        return (int) j4;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i, int i2) {
        String str = null;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            yhk.p("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        long j = x3.c.a.getLong(byteBuffer, x3.g) + i;
        long j2 = i2 + j;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (j < j2) {
            byte a = x3.c.a(j);
            if (!y3.a(a)) {
                break;
            }
            j++;
            cArr[i3] = (char) a;
            i3++;
        }
        int i4 = i3;
        while (j < j2) {
            long j3 = j + 1;
            w3 w3Var = x3.c;
            byte a2 = w3Var.a(j);
            if (y3.a(a2)) {
                cArr[i4] = (char) a2;
                i4++;
                j = j3;
                while (j < j2) {
                    byte a3 = x3.c.a(j);
                    if (!y3.a(a3)) {
                        break;
                    }
                    j++;
                    cArr[i4] = (char) a3;
                    i4++;
                }
            } else if (a2 < -32) {
                if (j3 >= j2) {
                    zzl.j("Protocol message had invalid UTF-8.");
                    return str;
                }
                j += 2;
                y3.a(a2, w3Var.a(j3), cArr, i4);
                i4++;
            } else if (a2 < -16) {
                if (j3 >= j2 - 1) {
                    zzl.j("Protocol message had invalid UTF-8.");
                    return str;
                }
                long j4 = j + 2;
                j += 3;
                y3.a(a2, w3Var.a(j3), w3Var.a(j4), cArr, i4);
                i4++;
            } else {
                if (j3 >= j2 - 2) {
                    String str2 = str;
                    zzl.j("Protocol message had invalid UTF-8.");
                    return str2;
                }
                long j5 = j;
                y3.a(a2, w3Var.a(j3), w3Var.a(j + 2), w3Var.a(j5 + 3), cArr, i4);
                i4 += 2;
                str = str;
                j = j5 + 4;
            }
        }
        return new String(cArr, 0, i4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int c(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        byte b = 0;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            yhk.p("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return 0;
        }
        long j2 = i;
        int i4 = (int) (i2 - j2);
        long j3 = 1;
        if (i4 >= 16) {
            i3 = 0;
            long j4 = j2;
            while (true) {
                if (i3 >= i4) {
                    i3 = i4;
                    break;
                }
                long j5 = j4 + 1;
                if (x3.c.b(bArr, x3.f + j4) < 0) {
                    break;
                }
                i3++;
                j4 = j5;
            }
        } else {
            i3 = 0;
        }
        int i5 = i4 - i3;
        long j6 = j2 + i3;
        while (true) {
            byte b2 = b;
            while (true) {
                if (i5 <= 0) {
                    break;
                }
                long j7 = j6 + j3;
                byte b3 = x3.c.b(bArr, x3.f + j6);
                if (b3 < 0) {
                    b2 = b3;
                    j6 = j7;
                    break;
                }
                i5--;
                b2 = b3;
                j6 = j7;
            }
            if (i5 == 0) {
                return b;
            }
            int i6 = i5 - 1;
            if (b2 >= -32) {
                if (b2 >= -16) {
                    j = j3;
                    if (i6 < 3) {
                        return a(bArr, b2, j6, i6);
                    }
                    i5 -= 4;
                    long j8 = j6 + j;
                    w3 w3Var = x3.c;
                    long j9 = x3.f;
                    byte b4 = b;
                    long j10 = j6;
                    byte b5 = w3Var.b(bArr, j9 + j10);
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b2 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j11 = j10 + 2;
                    if (w3Var.b(bArr, j8 + j9) > -65) {
                        return -1;
                    }
                    long j12 = j10 + 3;
                    if (w3Var.b(bArr, j9 + j11) > -65) {
                        return -1;
                    }
                    b = b4;
                    j6 = j12;
                } else {
                    if (i6 < 2) {
                        return a(bArr, b2, j6, i6);
                    }
                    i5 -= 3;
                    long j13 = j6 + j3;
                    w3 w3Var2 = x3.c;
                    long j14 = x3.f;
                    j = j3;
                    byte b6 = w3Var2.b(bArr, j14 + j6);
                    if (b6 > -65) {
                        return -1;
                    }
                    if (b2 == -32 && b6 < -96) {
                        return -1;
                    }
                    if (b2 == -19 && b6 >= -96) {
                        return -1;
                    }
                    j6 += 2;
                    if (w3Var2.b(bArr, j14 + j13) > -65) {
                        return -1;
                    }
                }
                j3 = j;
            } else {
                if (i6 == 0) {
                    return b2;
                }
                i5 -= 2;
                if (b2 < -62) {
                    return -1;
                }
                long j15 = j6 + j3;
                if (x3.c.b(bArr, x3.f + j6) > -65) {
                    return -1;
                }
                j6 = j15;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i, int i2) {
        String str = null;
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = i;
            int i5 = 0;
            while (i4 < i3) {
                byte b = x3.c.b(bArr, x3.f + i4);
                if (!y3.a(b)) {
                    break;
                }
                i4++;
                cArr[i5] = (char) b;
                i5++;
            }
            int i6 = i5;
            while (i4 < i3) {
                int i7 = i4 + 1;
                w3 w3Var = x3.c;
                long j = x3.f;
                byte b2 = w3Var.b(bArr, i4 + j);
                if (y3.a(b2)) {
                    cArr[i6] = (char) b2;
                    i6++;
                    i4 = i7;
                    while (i4 < i3) {
                        byte b3 = x3.c.b(bArr, x3.f + i4);
                        if (!y3.a(b3)) {
                            break;
                        }
                        i4++;
                        cArr[i6] = (char) b3;
                        i6++;
                    }
                } else if (b2 < -32) {
                    if (i7 < i3) {
                        i4 += 2;
                        y3.a(b2, w3Var.b(bArr, j + i7), cArr, i6);
                        i6++;
                    } else {
                        zzl.j("Protocol message had invalid UTF-8.");
                        return str;
                    }
                } else if (b2 < -16) {
                    if (i7 < i3 - 1) {
                        int i8 = i4 + 2;
                        i4 += 3;
                        y3.a(b2, w3Var.b(bArr, i7 + j), w3Var.b(bArr, j + i8), cArr, i6);
                        i6++;
                    } else {
                        zzl.j("Protocol message had invalid UTF-8.");
                        return str;
                    }
                } else if (i7 < i3 - 2) {
                    y3.a(b2, w3Var.b(bArr, i7 + j), w3Var.b(bArr, i4 + 2 + j), w3Var.b(bArr, j + i4 + 3), cArr, i6);
                    i6 += 2;
                    str = str;
                    i4 += 4;
                } else {
                    String str2 = str;
                    zzl.j("Protocol message had invalid UTF-8.");
                    return str2;
                }
            }
            return new String(cArr, 0, i6);
        }
        yhk.p("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
        return null;
    }

    public static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            z3 z3Var = d4.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return d4.a(i, x3.c.b(bArr, x3.f + j));
        }
        if (i2 == 2) {
            w3 w3Var = x3.c;
            long j2 = x3.f;
            return d4.a(i, w3Var.b(bArr, j2 + j), w3Var.b(bArr, j + 1 + j2));
        }
        ogj.b();
        return 0;
    }
}
