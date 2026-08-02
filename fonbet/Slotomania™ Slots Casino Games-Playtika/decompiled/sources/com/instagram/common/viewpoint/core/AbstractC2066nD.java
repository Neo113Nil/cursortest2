package com.instagram.common.viewpoint.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;

/* renamed from: com.facebook.ads.redexgen.X.nD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2066nD extends AbstractC0744Ew {
    public static String[] A01 = {"LN1kZ6lR3vZBqqrviA4uTSOzBGS9o2bO", "mUQPITaRnEXTrG2Wr7xIAnPzPHhU6DS3", "avW0I4bwWNzzQZleeOInYpLZY9PTle7", "LGUT8ZIo3joumZn9NybI7JCchk0DSCTG", "S4WFRdtC0lcE2afHWARgiwpUU5tNPmtd", "SbOYlLigHNVPkFHrMvYK7wwtNeL", "2fmBOvz22OTh8nUuYBKjoVDFU", "lR30iWlIbuozJgbVtB9O9DOed4NJenPq"};
    public C0736Eo A00;

    public abstract Pair<C05777s[], InterfaceC2067nE[]> A0d(C0736Eo c0736Eo, int[][][] iArr, int[] iArr2, C2103no c2103no, Timeline timeline) throws AD;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Y(InterfaceC05747p[] interfaceC05747pArr, C2218pg c2218pg, int[] iArr, boolean z) throws AD {
        int length = interfaceC05747pArr.length;
        int formatSupportLevel = 0;
        int i = 1;
        for (int i2 = 0; i2 < bestRendererIndex; i2++) {
            InterfaceC05747p interfaceC05747p = interfaceC05747pArr[i2];
            int i3 = 0;
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = interfaceC05747p.AKM(c2218pg.A08(bestFormatSupportLevel));
                i3 = Math.max(i3, AbstractC05677i.A03(bestRendererIndex));
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

    public static int[] A0Z(InterfaceC05747p interfaceC05747p, C2218pg c2218pg) throws AD {
        int[] iArr = new int[c2218pg.A01];
        for (int i = 0; i < c2218pg.A01; i++) {
            iArr[i] = interfaceC05747p.AKM(c2218pg.A08(i));
        }
        return iArr;
    }

    public static int[] A0a(InterfaceC05747p[] interfaceC05747pArr) throws AD {
        int[] iArr = new int[interfaceC05747pArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int AKO = interfaceC05747pArr[i].AKO();
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

    @Override // com.instagram.common.viewpoint.core.AbstractC0744Ew
    public final C0745Ex A0b(InterfaceC05747p[] interfaceC05747pArr, C2085nW c2085nW, C2103no c2103no, Timeline timeline) throws AD {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[interfaceC05747pArr.length + 1];
        C2218pg[][] c2218pgArr = new C2218pg[interfaceC05747pArr.length + 1][];
        int[][][] iArr2 = new int[interfaceC05747pArr.length + 1][][];
        for (int i = 0; i < c2218pgArr.length; i++) {
            c2218pgArr[i] = new C2218pg[c2085nW.A01];
            iArr2[i] = new int[c2085nW.A01][];
        }
        int[] A0a = A0a(interfaceC05747pArr);
        for (int i2 = 0; i2 < c2085nW.A01; i2++) {
            C2218pg A05 = c2085nW.A05(i2);
            int groupIndex = A0Y(interfaceC05747pArr, A05, iArr, A05.A02 == 5);
            if (groupIndex == interfaceC05747pArr.length) {
                rendererTrackGroupCounts = new int[A05.A01];
            } else {
                rendererTrackGroupCounts = A0Z(interfaceC05747pArr[groupIndex], A05);
            }
            int i3 = iArr[groupIndex];
            c2218pgArr[groupIndex][i3] = A05;
            iArr2[groupIndex][i3] = rendererTrackGroupCounts;
            iArr[groupIndex] = iArr[groupIndex] + 1;
        }
        C2085nW[] c2085nWArr = new C2085nW[interfaceC05747pArr.length];
        String[] strArr = new String[interfaceC05747pArr.length];
        int[] iArr3 = new int[interfaceC05747pArr.length];
        int i4 = 0;
        while (true) {
            int length = interfaceC05747pArr.length;
            String[] strArr2 = A01;
            if (strArr2[4].charAt(23) == strArr2[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A01;
            strArr3[4] = "hppY0P6sht5kF7is4RCKyMBKsFUVAoRB";
            strArr3[1] = "XeHPWbHBeoBDFVDQc4DbmKa9NYqMdrJh";
            if (i4 < length) {
                int i5 = iArr[i4];
                c2085nWArr[i4] = new C2085nW((C2218pg[]) C5C.A1I(c2218pgArr[i4], i5));
                iArr2[i4] = (int[][]) C5C.A1I(iArr2[i4], i5);
                strArr[i4] = interfaceC05747pArr[i4].getName();
                iArr3[i4] = interfaceC05747pArr[i4].A9N();
                i4++;
            } else {
                C0736Eo c0736Eo = new C0736Eo(strArr, iArr3, c2085nWArr, A0a, iArr2, new C2085nW((C2218pg[]) C5C.A1I(c2218pgArr[interfaceC05747pArr.length], iArr[interfaceC05747pArr.length])));
                Pair<C05777s[], InterfaceC2067nE[]> A0d = A0d(c0736Eo, iArr2, A0a, c2103no, timeline);
                return new C0745Ex((C05777s[]) A0d.first, (InterfaceC2067nE[]) A0d.second, AbstractC0741Et.A00(c0736Eo, (InterfaceC0738Eq[]) A0d.second), c0736Eo);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC0744Ew
    public final void A0c(Object obj) {
        this.A00 = (C0736Eo) obj;
    }
}
