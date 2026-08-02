package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lbh extends rbh {
    public final nbh c;

    public lbh(nbh nbhVar) {
        this.c = nbhVar;
    }

    @Override // defpackage.rbh
    public final void a(Matrix matrix, sah sahVar, int i, Canvas canvas) {
        RectF rectF = nbh.h;
        nbh nbhVar = this.c;
        float f = nbhVar.f;
        float f2 = nbhVar.g;
        RectF rectF2 = new RectF(nbhVar.b, nbhVar.c, nbhVar.d, nbhVar.e);
        Paint paint = (Paint) sahVar.e;
        boolean z = f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Path path = (Path) sahVar.h;
        int[] iArr = sah.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = sahVar.c;
            iArr[2] = sahVar.b;
            iArr[3] = sahVar.a;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = -i;
            rectF2.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = sahVar.a;
            iArr[2] = sahVar.b;
            iArr[3] = sahVar.c;
        }
        float width = rectF2.width() / 2.0f;
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float e = wt3.e(1.0f, f4, 2.0f, f4);
        float[] fArr = sah.l;
        fArr[1] = f4;
        fArr[2] = e;
        paint.setShader(new RadialGradient(rectF2.centerX(), rectF2.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF2.height() / rectF2.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, (Paint) sahVar.g);
        }
        canvas.drawArc(rectF2, f, f2, true, paint);
        canvas.restore();
    }
}
