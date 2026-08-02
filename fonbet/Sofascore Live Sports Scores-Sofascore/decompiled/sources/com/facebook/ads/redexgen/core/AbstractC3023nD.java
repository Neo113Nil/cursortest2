package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3023nD extends AbstractC1701Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C1693Eo A00;

    public abstract Pair<C15347s[], InterfaceC3024nE[]> A0d(C1693Eo c1693Eo, int[][][] iArr, int[] iArr2, C3060no c3060no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC15317p[] interfaceC15317pArr, C3175pg c3175pg, int[] iArr, boolean z) throws AD {
        int length = interfaceC15317pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC15317p interfaceC15317p = interfaceC15317pArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC15317p.AKM(c3175pg.A08(bestFormatSupportLevel));
                i3 = Math.max(i3, AbstractC15247i.A03(bestRendererIndex));
            }
            int bestRendererIndex2 = iArr[i2];
            int bestRendererIndex3 = bestRendererIndex2 == 0 ? 1 : 0;
            if (i3 > formatSupportLevel || (i3 == formatSupportLevel && z && i == 0 && bestRendererIndex3 != 0)) {
                length = i2;
                formatSupportLevel = i3;
                i = bestRendererIndex3;
            }
        }
        return length;
    }

    public static int[] A0Z(InterfaceC15317p interfaceC15317p, C3175pg c3175pg) throws AD {
        int[] iArr = new int[c3175pg.A01];
        for (int i = 0; i < c3175pg.A01; i++) {
            iArr[i] = interfaceC15317p.AKM(c3175pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC15317p[] interfaceC15317pArr) throws AD {
        int[] iArr = new int[interfaceC15317pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC15317pArr[i].AKO();
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[1];
            int i2 = str.charAt(23);
            if (i2 == str2.charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "1ViYEGUZxGRCVXLKV1NACncyCaxKGcLE";
            strArr2[1] = "WZkUCc71MckdncxFpAml539B1oxWjr0A";
            iArr[i] = AKO;
        }
        return iArr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1701Ew
    public final C1702Ex A0b(InterfaceC15317p[] interfaceC15317pArr, C3042nW c3042nW, C3060no c3060no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC15317pArr.length + 1];
        C3175pg[][] c3175pgArr = new C3175pg[interfaceC15317pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC15317pArr.length + 1][][];
        for (int i = 0; i < c3175pgArr.length; i++) {
            c3175pgArr[i] = new C3175pg[c3042nW.A01];
            iArr2[i] = new int[c3042nW.A01][];
        }
        int[] A0a = A0a(interfaceC15317pArr);
        for (int i2 = 0; i2 < c3042nW.A01; i2++) {
            C3175pg A05 = c3042nW.A05(i2);
            int groupIndex = A0Y(interfaceC15317pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC15317pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC15317pArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c3175pgArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C3042nW[] c3042nWArr = new C3042nW[interfaceC15317pArr.length];
        String[] strArr = new String[interfaceC15317pArr.length];
        int[] iArr3 = new int[interfaceC15317pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC15317pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c3042nWArr[i4] = new C3042nW((C3175pg[]) C5C.A1I(c3175pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC15317pArr[i4].getName();
                iArr3[i4] = interfaceC15317pArr[i4].A9N();
                i4++;
            } else {
                C1693Eo c1693Eo = new C1693Eo(strArr, iArr3, c3042nWArr, A0a, iArr2, new C3042nW((C3175pg[]) C5C.A1I(c3175pgArr[interfaceC15317pArr.length], iArr[interfaceC15317pArr.length])));
                Pair<C15347s[], InterfaceC3024nE[]> A0d = A0d(c1693Eo, iArr2, A0a, c3060no, timeline);
                return new C1702Ex((C15347s[]) A0d.first, (InterfaceC3024nE[]) A0d.second, AbstractC1698Et.A00(c1693Eo, (InterfaceC1695Eq[]) A0d.second), c1693Eo);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1701Ew
    public final void A0c(Object obj) {
        this.A00 = (C1693Eo) obj;
    }
}
