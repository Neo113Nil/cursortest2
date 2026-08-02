package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mbh extends rbh {
    public final obh c;
    public final float d;
    public final float e;

    public mbh(obh obhVar, float f, float f2) {
        this.c = obhVar;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.rbh
    public final void a(Matrix matrix, sah sahVar, int i, Canvas canvas) {
        obh obhVar = this.c;
        float f = obhVar.c;
        float f2 = this.e;
        float f3 = obhVar.b;
        float f4 = this.d;
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) Math.hypot(f - f2, f3 - f4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        sahVar.getClass();
        rectF.bottom += i;
        rectF.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -i);
        int i2 = sahVar.c;
        int[] iArr = sah.i;
        iArr[0] = i2;
        iArr[1] = sahVar.b;
        iArr[2] = sahVar.a;
        Paint paint = (Paint) sahVar.f;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, sah.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        obh obhVar = this.c;
        return (float) Math.toDegrees(Math.atan((obhVar.c - this.e) / (obhVar.b - this.d)));
    }
}
