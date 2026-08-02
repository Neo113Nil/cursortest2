package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class e {
    public static final byte[] a;
    public static final long[] b;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        bytes.getClass();
        a = bytes;
        b = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    public static final long a(x52 x52Var, gc2 gc2Var, long j, long j2, int i) {
        b1h b1hVar;
        long j3 = j;
        long j4 = j2;
        gc2Var.getClass();
        long j5 = i;
        yqo.x(gc2Var.h(), 0L, j5);
        if (i <= 0) {
            a70.p("byteCount == 0");
            return 0L;
        }
        if (j3 < 0) {
            ogj.h(vxd.l(j3, "fromIndex < 0: "));
            return 0L;
        }
        if (j3 > j4) {
            StringBuilder o = ljg.o("fromIndex > toIndex: ", j3, " > ");
            o.append(j4);
            throw new IllegalArgumentException(o.toString().toString());
        }
        long j6 = x52Var.b;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 == j4 || (b1hVar = x52Var.a) == null) {
            return -1L;
        }
        long j7 = 0;
        if (j6 - j3 < j3) {
            while (j6 > j3) {
                b1hVar = b1hVar.g;
                b1hVar.getClass();
                j6 -= b1hVar.c - b1hVar.b;
            }
            byte[] l = gc2Var.l();
            byte b2 = l[0];
            long min = Math.min(j4, (x52Var.b - j5) + 1);
            while (j6 < min) {
                byte[] bArr = b1hVar.a;
                int min2 = (int) Math.min(b1hVar.c, (b1hVar.b + min) - j6);
                for (int i2 = (int) ((b1hVar.b + j3) - j6); i2 < min2; i2++) {
                    if (bArr[i2] == b2 && b(b1hVar, i2 + 1, l, 1, i)) {
                        return (i2 - b1hVar.b) + j6;
                    }
                }
                j6 += b1hVar.c - b1hVar.b;
                b1hVar = b1hVar.f;
                b1hVar.getClass();
                j3 = j6;
            }
            return -1L;
        }
        while (true) {
            long j8 = j7 + (b1hVar.c - b1hVar.b);
            if (j8 > j3) {
                break;
            }
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j7 = j8;
        }
        byte[] l2 = gc2Var.l();
        byte b3 = l2[0];
        long min3 = Math.min(j4, (x52Var.b - j5) + 1);
        while (j7 < min3) {
            byte[] bArr2 = b1hVar.a;
            int min4 = (int) Math.min(b1hVar.c, (b1hVar.b + min3) - j7);
            for (int i3 = (int) ((b1hVar.b + j3) - j7); i3 < min4; i3++) {
                if (bArr2[i3] == b3 && b(b1hVar, i3 + 1, l2, 1, i)) {
                    return (i3 - b1hVar.b) + j7;
                }
            }
            j7 += b1hVar.c - b1hVar.b;
            b1hVar = b1hVar.f;
            b1hVar.getClass();
            j3 = j7;
        }
        return -1L;
    }

    public static final boolean b(b1h b1hVar, int i, byte[] bArr, int i2, int i3) {
        int i4 = b1hVar.c;
        byte[] bArr2 = b1hVar.a;
        while (i2 < i3) {
            if (i == i4) {
                b1hVar = b1hVar.f;
                b1hVar.getClass();
                byte[] bArr3 = b1hVar.a;
                bArr2 = bArr3;
                i = b1hVar.b;
                i4 = b1hVar.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String c(x52 x52Var, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (x52Var.t(j2) == 13) {
                String B0 = x52Var.B0(j2, Charsets.UTF_8);
                x52Var.skip(2L);
                return B0;
            }
        }
        String B02 = x52Var.B0(j, Charsets.UTF_8);
        x52Var.skip(1L);
        return B02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        return -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(x52 x52Var, wvd wvdVar, boolean z) {
        int i;
        int i2;
        int i3;
        b1h b1hVar;
        int i4;
        wvdVar.getClass();
        b1h b1hVar2 = x52Var.a;
        if (b1hVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = b1hVar2.a;
        int i5 = b1hVar2.b;
        int i6 = b1hVar2.c;
        int[] iArr = wvdVar.b;
        b1h b1hVar3 = b1hVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (b1hVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            b1hVar3 = b1hVar3.f;
                            b1hVar3.getClass();
                            int i16 = b1hVar3.b;
                            byte[] bArr2 = b1hVar3.a;
                            i2 = b1hVar3.c;
                            if (b1hVar3 == b1hVar2) {
                                i3 = i16;
                                bArr = bArr2;
                                b1hVar3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) != iArr[i11]) {
                    break loop0;
                }
                boolean z2 = i20 == i18;
                if (i19 == i6) {
                    b1hVar3.getClass();
                    b1h b1hVar4 = b1hVar3.f;
                    b1hVar4.getClass();
                    i3 = b1hVar4.b;
                    byte[] bArr3 = b1hVar4.a;
                    i4 = b1hVar4.c;
                    if (b1hVar4 != b1hVar2) {
                        b1hVar = b1hVar4;
                        bArr = bArr3;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr3;
                        b1hVar = null;
                    }
                } else {
                    b1hVar = b1hVar3;
                    i4 = i6;
                    i3 = i19;
                }
                if (z2) {
                    i = iArr[i20];
                    int i21 = i4;
                    b1hVar3 = b1hVar;
                    i2 = i21;
                    break;
                }
                i5 = i3;
                i6 = i4;
                b1hVar3 = b1hVar;
                i11 = i20;
            }
        }
        return i7;
    }
}
