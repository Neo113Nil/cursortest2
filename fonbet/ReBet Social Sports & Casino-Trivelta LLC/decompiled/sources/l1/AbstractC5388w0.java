package l1;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import e1.AbstractC4151s;

/* renamed from: l1.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5388w0 {
    public static String a(String str, int i10) {
        if (i10 == -1) {
            return str;
        }
        return str + i10;
    }

    public static boolean b(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        return f10 == f11 && f11 == fArr[2];
    }

    public static boolean c(Gainmap gainmap, Gainmap gainmap2) {
        float[] gamma;
        float[] gamma2;
        float[] ratioMax;
        float[] ratioMax2;
        float[] ratioMin;
        float[] ratioMin2;
        float[] epsilonHdr;
        float[] epsilonHdr2;
        float[] epsilonSdr;
        float[] epsilonSdr2;
        float displayRatioForFullHdr;
        float displayRatioForFullHdr2;
        float minDisplayRatioForHdrTransition;
        float minDisplayRatioForHdrTransition2;
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        Bitmap gainmapContents3;
        Bitmap gainmapContents4;
        gamma = gainmap.getGamma();
        gamma2 = gainmap2.getGamma();
        if (gamma != gamma2) {
            return false;
        }
        ratioMax = gainmap.getRatioMax();
        ratioMax2 = gainmap2.getRatioMax();
        if (ratioMax != ratioMax2) {
            return false;
        }
        ratioMin = gainmap.getRatioMin();
        ratioMin2 = gainmap2.getRatioMin();
        if (ratioMin != ratioMin2) {
            return false;
        }
        epsilonHdr = gainmap.getEpsilonHdr();
        epsilonHdr2 = gainmap2.getEpsilonHdr();
        if (epsilonHdr != epsilonHdr2) {
            return false;
        }
        epsilonSdr = gainmap.getEpsilonSdr();
        epsilonSdr2 = gainmap2.getEpsilonSdr();
        if (epsilonSdr != epsilonSdr2) {
            return false;
        }
        displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
        displayRatioForFullHdr2 = gainmap2.getDisplayRatioForFullHdr();
        if (displayRatioForFullHdr != displayRatioForFullHdr2) {
            return false;
        }
        minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
        minDisplayRatioForHdrTransition2 = gainmap2.getMinDisplayRatioForHdrTransition();
        if (minDisplayRatioForHdrTransition != minDisplayRatioForHdrTransition2) {
            return false;
        }
        gainmapContents = gainmap.getGainmapContents();
        gainmapContents2 = gainmap2.getGainmapContents();
        if (gainmapContents != gainmapContents2) {
            return false;
        }
        gainmapContents3 = gainmap.getGainmapContents();
        int generationId = gainmapContents3.getGenerationId();
        gainmapContents4 = gainmap2.getGainmapContents();
        return generationId == gainmapContents4.getGenerationId();
    }

    public static float[] d(float[] fArr) {
        return new float[]{(float) Math.log(fArr[0]), (float) Math.log(fArr[1]), (float) Math.log(fArr[2])};
    }

    public static void e(e1.r rVar, Gainmap gainmap, int i10) {
        Bitmap gainmapContents;
        float[] gamma;
        float[] ratioMin;
        float[] ratioMax;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        float[] ratioMax2;
        float[] ratioMin2;
        gainmapContents = gainmap.getGainmapContents();
        int i11 = 0;
        int i12 = gainmapContents.getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        gamma = gainmap.getGamma();
        int i13 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        if (b(gamma)) {
            ratioMax2 = gainmap.getRatioMax();
            if (b(ratioMax2)) {
                ratioMin2 = gainmap.getRatioMin();
                if (b(ratioMin2)) {
                    i11 = 1;
                }
            }
        }
        rVar.r(a("uGainmapIsAlpha", i10), i12);
        rVar.r(a("uNoGamma", i10), i13);
        rVar.r(a("uSingleChannel", i10), i11);
        String a10 = a("uLogRatioMin", i10);
        ratioMin = gainmap.getRatioMin();
        rVar.p(a10, d(ratioMin));
        String a11 = a("uLogRatioMax", i10);
        ratioMax = gainmap.getRatioMax();
        rVar.p(a11, d(ratioMax));
        String a12 = a("uEpsilonSdr", i10);
        epsilonSdr = gainmap.getEpsilonSdr();
        rVar.p(a12, epsilonSdr);
        String a13 = a("uEpsilonHdr", i10);
        epsilonHdr = gainmap.getEpsilonHdr();
        rVar.p(a13, epsilonHdr);
        rVar.p(a("uGainmapGamma", i10), gamma);
        String a14 = a("uDisplayRatioHdr", i10);
        displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
        rVar.o(a14, displayRatioForFullHdr);
        String a15 = a("uDisplayRatioSdr", i10);
        minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
        rVar.o(a15, minDisplayRatioForHdrTransition);
        AbstractC4151s.d();
    }
}
