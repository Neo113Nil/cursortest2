package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ma9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Float e;
    public float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public ma9(float f, float f2, float f3, float f4, Float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final void a(Canvas canvas, Paint paint, Paint paint2, boolean z) {
        canvas.getClass();
        paint.getClass();
        paint2.getClass();
        float f = this.d;
        float f2 = this.b;
        float f3 = (f - f2) / 2.0f;
        paint2.setAlpha((int) ((1.0f - this.f) * 180.0f));
        float f4 = 40.0f * this.f;
        float f5 = this.c;
        float f6 = this.a;
        if (!z) {
            canvas.drawRect(f6 - f4, f2 - f4, f5 + f4, f + f4, paint2);
            canvas.drawRect(this.a, this.b, this.c, this.d, paint);
            return;
        }
        float f7 = f6 - f4;
        float f8 = f2 - f4;
        float f9 = f5 + f4;
        float f10 = f + f4;
        Float f11 = this.e;
        canvas.drawRoundRect(f7, f8, f9, f10, f11 != null ? f11.floatValue() : f3 * 3.0f, f11 != null ? f11.floatValue() : 3.0f * f3, paint2);
        float floatValue = f11 != null ? f11.floatValue() : f3;
        if (f11 != null) {
            f3 = f11.floatValue();
        }
        canvas.drawRoundRect(this.a, this.b, this.c, this.d, floatValue, f3, paint);
    }
}
