package com.bytedance.adsdk.sf.wh;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.gm.sf.gbb;
import defpackage.me4;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static final PointF pcc = new PointF();

    public static boolean gm(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static void pcc(gbb gbbVar, Path path) {
        Path path2;
        path.reset();
        PointF pcc2 = gbbVar.pcc();
        path.moveTo(pcc2.x, pcc2.y);
        pcc.set(pcc2.x, pcc2.y);
        int i = 0;
        while (i < gbbVar.gm().size()) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gbbVar.gm().get(i);
            PointF pcc3 = pccVar.pcc();
            PointF sf = pccVar.sf();
            PointF gm = pccVar.gm();
            PointF pointF = pcc;
            if (pcc3.equals(pointF) && sf.equals(gm)) {
                path.lineTo(gm.x, gm.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pcc3.x, pcc3.y, sf.x, sf.y, gm.x, gm.y);
            }
            pointF.set(gm.x, gm.y);
            i++;
            path = path2;
        }
        Path path3 = path;
        if (gbbVar.sf()) {
            path3.close();
        }
    }

    private static int sf(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static float sf(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static PointF pcc(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int pcc(int i, int i2, float f) {
        return (int) ((f * (i2 - i)) + i);
    }

    public static float pcc(float f, float f2, float f3) {
        return me4.b(f2, f, f3, f);
    }

    public static int pcc(float f, float f2) {
        return pcc((int) f, (int) f2);
    }

    private static int pcc(int i, int i2) {
        return i - (i2 * sf(i, i2));
    }

    public static int pcc(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
