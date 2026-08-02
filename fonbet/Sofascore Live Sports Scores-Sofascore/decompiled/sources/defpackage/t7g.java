package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t7g extends awj {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final String e;

    public t7g(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            a70.p("All radii must be >= 0.");
            throw null;
        }
        this.e = duf.a.getOrCreateKotlinClass(t7g.class).getQualifiedName() + "-" + f + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + f2 + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + f3 + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + f4;
    }

    @Override // defpackage.awj
    public final String a() {
        return this.e;
    }

    @Override // defpackage.awj
    public final Bitmap b(Bitmap bitmap, kjh kjhVar) {
        long s;
        kjh kjhVar2 = kjh.c;
        if (Intrinsics.c(kjhVar, kjhVar2)) {
            s = t6a.s(bitmap.getWidth(), bitmap.getHeight());
        } else {
            a35 a35Var = kjhVar.a;
            a35 a35Var2 = kjhVar.b;
            if ((a35Var instanceof t25) && (a35Var2 instanceof t25)) {
                s = t6a.s(((t25) a35Var).a, ((t25) a35Var2).a);
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                a35 a35Var3 = kjhVar.a;
                double r = tol.r(width, height, a35Var3 instanceof t25 ? ((t25) a35Var3).a : Integer.MIN_VALUE, a35Var2 instanceof t25 ? ((t25) a35Var2).a : Integer.MIN_VALUE, jrg.a, kjhVar2);
                s = t6a.s(wzb.a(bitmap.getWidth() * r), wzb.a(r * bitmap.getHeight()));
            }
        }
        int i = (int) (s >> 32);
        int i2 = (int) (s & 4294967295L);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint I = yaa.I(bitmap, i, i2);
        float f = this.a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        if (f == f2 && f2 == f4 && f4 == f3) {
            canvas.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2, f, f, I);
            return createBitmap;
        }
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, i2);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, I);
        return createBitmap;
    }
}
