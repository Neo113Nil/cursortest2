package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u7g implements cwj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public u7g(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a70.p("All radii must be >= 0.");
            throw null;
        }
        this.e = u7g.class.getName() + '-' + f + ',' + f2 + ',' + f3 + ',' + f4;
    }

    @Override // defpackage.cwj
    public final Bitmap a(Bitmap bitmap, jjh jjhVar) {
        Pair pair;
        Paint paint = new Paint(3);
        if (Intrinsics.c(jjhVar, jjh.c)) {
            pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            s02 s02Var = jjhVar.a;
            s02 s02Var2 = jjhVar.b;
            if ((s02Var instanceof u25) && (s02Var2 instanceof u25)) {
                pair = new Pair(Integer.valueOf(((u25) s02Var).j), Integer.valueOf(((u25) s02Var2).j));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                s02 s02Var3 = jjhVar.a;
                double u = ktm.u(width, height, s02Var3 instanceof u25 ? ((u25) s02Var3).j : Integer.MIN_VALUE, s02Var2 instanceof u25 ? ((u25) s02Var2).j : Integer.MIN_VALUE, 1);
                pair = new Pair(Integer.valueOf(wzb.a(bitmap.getWidth() * u)), Integer.valueOf(wzb.a(u * bitmap.getHeight())));
            }
        }
        int intValue = ((Number) pair.a).intValue();
        int intValue2 = ((Number) pair.b).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, config);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float u2 = (float) ktm.u(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, 1);
        matrix.setTranslate(mz1.c(u2, bitmap.getWidth(), intValue, 2.0f), mz1.c(u2, bitmap.getHeight(), intValue2, 2.0f));
        matrix.preScale(u2, u2);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    @Override // defpackage.cwj
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7g)) {
            return false;
        }
        u7g u7gVar = (u7g) obj;
        return this.a == u7gVar.a && this.b == u7gVar.b && this.c == u7gVar.c && this.d == u7gVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + fc6.a(this.c, fc6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
