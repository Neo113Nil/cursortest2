package com.bytedance.sdk.openadsdk.of;

import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class vh {
    public static int gm(gm gmVar) {
        byte[][] gm = gmVar.gm();
        int sf = gmVar.sf();
        int pcc = gmVar.pcc();
        int i = 0;
        for (int i2 = 0; i2 < pcc; i2++) {
            for (int i3 = 0; i3 < sf; i3++) {
                byte[] bArr = gm[i2];
                int i4 = i3 + 6;
                if (i4 < sf && bArr[i3] == 1 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 1 && bArr[i3 + 3] == 1 && bArr[i3 + 4] == 1 && bArr[i3 + 5] == 0 && bArr[i4] == 1 && (pcc(bArr, i3 - 4, i3) || pcc(bArr, i3 + 7, i3 + 11))) {
                    i++;
                }
                int i5 = i2 + 6;
                if (i5 < pcc && gm[i2][i3] == 1 && gm[i2 + 1][i3] == 0 && gm[i2 + 2][i3] == 1 && gm[i2 + 3][i3] == 1 && gm[i2 + 4][i3] == 1 && gm[i2 + 5][i3] == 0 && gm[i5][i3] == 1 && (pcc(gm, i3, i2 - 4, i2) || pcc(gm, i3, i2 + 7, i2 + 11))) {
                    i++;
                }
            }
        }
        return i * 40;
    }

    public static int oo(gm gmVar) {
        byte[][] gm = gmVar.gm();
        int sf = gmVar.sf();
        int pcc = gmVar.pcc();
        int i = 0;
        for (int i2 = 0; i2 < pcc; i2++) {
            byte[] bArr = gm[i2];
            for (int i3 = 0; i3 < sf; i3++) {
                if (bArr[i3] == 1) {
                    i++;
                }
            }
        }
        int sf2 = gmVar.sf() * gmVar.pcc();
        return ((Math.abs((i * 2) - sf2) * 10) / sf2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean pcc(int i, int i2, int i3) {
        int i4;
        switch (i) {
            case 0:
                i3 += i2;
                i4 = i3 & 1;
                return i4 != 0;
            case 1:
                i4 = i3 & 1;
                if (i4 != 0) {
                }
                break;
            case 2:
                i4 = i2 % 3;
                if (i4 != 0) {
                }
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                if (i4 != 0) {
                }
                break;
            case 4:
                i4 = ((i2 / 3) + (i3 / 2)) & 1;
                if (i4 != 0) {
                }
                break;
            case 5:
                int i5 = i3 * i2;
                i4 = (i5 & 1) + (i5 % 3);
                if (i4 != 0) {
                }
                break;
            case 6:
                int i6 = i3 * i2;
                i3 = (i6 % 3) + (i6 & 1);
                i4 = i3 & 1;
                if (i4 != 0) {
                }
                break;
            case 7:
                i4 = (((i3 * i2) % 3) + ((i3 + i2) & 1)) & 1;
                if (i4 != 0) {
                }
                break;
            default:
                a70.p("Invalid mask pattern: ".concat(String.valueOf(i)));
                return false;
        }
    }

    public static int sf(gm gmVar) {
        byte[][] gm = gmVar.gm();
        int sf = gmVar.sf();
        int pcc = gmVar.pcc();
        int i = 0;
        for (int i2 = 0; i2 < pcc - 1; i2++) {
            byte[] bArr = gm[i2];
            int i3 = 0;
            while (i3 < sf - 1) {
                byte b = bArr[i3];
                int i4 = i3 + 1;
                if (b == bArr[i4]) {
                    byte[] bArr2 = gm[i2 + 1];
                    if (b == bArr2[i3] && b == bArr2[i4]) {
                        i++;
                    }
                }
                i3 = i4;
            }
        }
        return i * 3;
    }

    private static boolean pcc(byte[] bArr, int i, int i2) {
        if (i < 0 || bArr.length < i2) {
            return false;
        }
        while (i < i2) {
            if (bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static boolean pcc(byte[][] bArr, int i, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static int pcc(gm gmVar) {
        return pcc(gmVar, true) + pcc(gmVar, false);
    }

    private static int pcc(gm gmVar, boolean z) {
        int pcc = z ? gmVar.pcc() : gmVar.sf();
        int sf = z ? gmVar.sf() : gmVar.pcc();
        byte[][] gm = gmVar.gm();
        int i = 0;
        for (int i2 = 0; i2 < pcc; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < sf; i4++) {
                byte b2 = z ? gm[i2][i4] : gm[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    i3 = 1;
                    b = b2;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 2) + i;
            }
        }
        return i;
    }
}
