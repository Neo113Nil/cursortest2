package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes3.dex */
public abstract class q0 {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix a(RectF rectF, RectF rectF2, String str, int i10) {
        double d10;
        double d11;
        double d12;
        double d13 = rectF.left;
        double d14 = rectF.top;
        double width = rectF.width();
        double height = rectF.height();
        double d15 = rectF2.left;
        double d16 = rectF2.top;
        double width2 = rectF2.width();
        double height2 = rectF2.height();
        double d17 = width2 / width;
        double d18 = height2 / height;
        double d19 = d15 - (d13 * d17);
        double d20 = d16 - (d14 * d18);
        if (i10 == 2) {
            d17 = Math.min(d17, d18);
            if (d17 > 1.0d) {
                d10 = d19 - (((width2 / d17) - width) / 2.0d);
                d12 = (height2 / d17) - height;
            } else {
                d10 = d19 - ((width2 - (width * d17)) / 2.0d);
                d12 = height2 - (height * d17);
            }
            d11 = d20 - (d12 / 2.0d);
            d18 = d17;
        } else {
            if (str.equals(ViewProps.NONE) || i10 != 0) {
                if (!str.equals(ViewProps.NONE) && i10 == 1) {
                    d17 = Math.max(d17, d18);
                }
                double d21 = d15 - (d13 * d17);
                double d22 = d16 - (d14 * d18);
                if (str.contains("xMid")) {
                    d21 += (width2 - (width * d17)) / 2.0d;
                }
                if (str.contains("xMax")) {
                    d21 += width2 - (width * d17);
                }
                d10 = d21;
                if (str.contains("YMid")) {
                    d22 += (height2 - (height * d18)) / 2.0d;
                }
                d11 = d22;
                if (str.contains("YMax")) {
                    d11 += height2 - (height * d18);
                }
            } else {
                d17 = Math.min(d17, d18);
            }
            d18 = d17;
            double d212 = d15 - (d13 * d17);
            double d222 = d16 - (d14 * d18);
            if (str.contains("xMid")) {
            }
            if (str.contains("xMax")) {
            }
            d10 = d212;
            if (str.contains("YMid")) {
            }
            d11 = d222;
            if (str.contains("YMax")) {
            }
        }
        double d23 = d10;
        double d24 = d11;
        Matrix matrix = new Matrix();
        matrix.postTranslate((float) d23, (float) d24);
        matrix.preScale((float) d17, (float) d18);
        return matrix;
    }
}
