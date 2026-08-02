package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qvh extends p41 {
    public final RectF D;
    public final ska E;
    public final float[] F;
    public final Path G;
    public final mla H;
    public gkk I;
    public gkk J;

    public qvh(gmb gmbVar, mla mlaVar) {
        super(gmbVar, mlaVar);
        this.D = new RectF();
        ska skaVar = new ska();
        this.E = skaVar;
        this.F = new float[8];
        this.G = new Path();
        this.H = mlaVar;
        skaVar.setAlpha(0);
        skaVar.setStyle(Paint.Style.FILL);
        skaVar.setColor(mlaVar.l);
    }

    @Override // defpackage.p41, defpackage.bja
    public final void d(wj9 wj9Var, Object obj) {
        super.d(wj9Var, obj);
        if (obj == nmb.I) {
            if (wj9Var == null) {
                this.I = null;
                return;
            } else {
                this.I = new gkk(wj9Var, null);
                return;
            }
        }
        if (obj == 1) {
            if (wj9Var != null) {
                this.J = new gkk(wj9Var, null);
                return;
            }
            this.J = null;
            this.E.setColor(this.H.l);
        }
    }

    @Override // defpackage.p41, defpackage.jb5
    public final void e(RectF rectF, Matrix matrix, boolean z) {
        super.e(rectF, matrix, z);
        mla mlaVar = this.H;
        float f = mlaVar.j;
        float f2 = mlaVar.k;
        RectF rectF2 = this.D;
        rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.p41
    public final void j(Canvas canvas, Matrix matrix, int i, uc5 uc5Var) {
        mla mlaVar = this.H;
        int alpha = Color.alpha(mlaVar.l);
        if (alpha == 0) {
            return;
        }
        gkk gkkVar = this.J;
        Integer num = gkkVar == null ? null : (Integer) gkkVar.e();
        ska skaVar = this.E;
        if (num != null) {
            skaVar.setColor(num.intValue());
        } else {
            skaVar.setColor(mlaVar.l);
        }
        int intValue = (int) ((((alpha / 255.0f) * (this.w.p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        skaVar.setAlpha(intValue);
        if (uc5Var == null) {
            skaVar.clearShadowLayer();
        } else if (Color.alpha(uc5Var.d) > 0) {
            skaVar.setShadowLayer(Math.max(uc5Var.a, Float.MIN_VALUE), uc5Var.b, uc5Var.c, uc5Var.d);
        } else {
            skaVar.clearShadowLayer();
        }
        gkk gkkVar2 = this.I;
        if (gkkVar2 != null) {
            skaVar.setColorFilter((ColorFilter) gkkVar2.e());
        }
        if (intValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = mlaVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = mlaVar.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, skaVar);
        }
    }
}
