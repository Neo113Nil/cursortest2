package com.google.android.material.color.utilities;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class Blend {
    private Blend() {
    }

    public static int cam16Ucs(int i5, int i10, double d10) {
        Cam16 fromInt = Cam16.fromInt(i5);
        Cam16 fromInt2 = Cam16.fromInt(i10);
        double jstar = fromInt.getJstar();
        double astar = fromInt.getAstar();
        double bstar = fromInt.getBstar();
        return Cam16.fromUcs(((fromInt2.getJstar() - jstar) * d10) + jstar, ((fromInt2.getAstar() - astar) * d10) + astar, ((fromInt2.getBstar() - bstar) * d10) + bstar).toInt();
    }

    public static int harmonize(int i5, int i10) {
        Hct fromInt = Hct.fromInt(i5);
        Hct fromInt2 = Hct.fromInt(i10);
        double min = Math.min(MathUtils.differenceDegrees(fromInt.getHue(), fromInt2.getHue()) * 0.5d, 15.0d);
        return Hct.from(MathUtils.sanitizeDegreesDouble((MathUtils.rotationDirection(fromInt.getHue(), fromInt2.getHue()) * min) + fromInt.getHue()), fromInt.getChroma(), fromInt.getTone()).toInt();
    }

    public static int hctHue(int i5, int i10, double d10) {
        return Hct.from(Cam16.fromInt(cam16Ucs(i5, i10, d10)).getHue(), Cam16.fromInt(i5).getChroma(), ColorUtils.lstarFromArgb(i5)).toInt();
    }
}
