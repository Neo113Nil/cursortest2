package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uc5 {
    public float a;
    public float b;
    public float c;
    public int d;
    public float[] e = null;

    public uc5(uc5 uc5Var) {
        this.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = 0;
        this.a = uc5Var.a;
        this.b = uc5Var.b;
        this.c = uc5Var.c;
        this.d = uc5Var.d;
    }

    public final void a(int i, ska skaVar) {
        int alpha = Color.alpha(this.d);
        int c = pkc.c(i);
        Matrix matrix = vik.a;
        int i2 = (int) ((((alpha / 255.0f) * c) / 255.0f) * 255.0f);
        if (i2 <= 0) {
            skaVar.clearShadowLayer();
        } else {
            skaVar.setShadowLayer(Math.max(this.a, Float.MIN_VALUE), this.b, this.c, Color.argb(i2, Color.red(this.d), Color.green(this.d), Color.blue(this.d)));
        }
    }

    public final void b(int i) {
        this.d = Color.argb(Math.round((pkc.c(i) * Color.alpha(this.d)) / 255.0f), Color.red(this.d), Color.green(this.d), Color.blue(this.d));
    }

    public final void c(Matrix matrix) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = new float[2];
            this.e = fArr;
        }
        fArr[0] = this.b;
        fArr[1] = this.c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.e;
        this.b = fArr2[0];
        this.c = fArr2[1];
        this.a = matrix.mapRadius(this.a);
    }
}
