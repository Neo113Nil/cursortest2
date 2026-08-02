package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ty1 extends awj {
    public final float a;
    public final float b;
    public final int c;

    public ty1(int i, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        double d = f;
        if (0.0d > d || d > 25.0d) {
            a70.p("radius must be in [0, 25].");
            throw null;
        }
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        a70.p("sampling must be > 0.");
        throw null;
    }

    @Override // defpackage.awj
    public final String a() {
        StringBuilder sb = new StringBuilder(ty1.class.getName());
        sb.append("-");
        sb.append(this.a);
        sb.append("-");
        sb.append(this.b);
        return me4.g(this.c, "-", sb);
    }

    @Override // defpackage.awj
    public final Bitmap b(Bitmap bitmap, kjh kjhVar) {
        Paint paint = new Paint(3);
        float width = bitmap.getWidth();
        float f = this.b;
        int i = (int) (width / f);
        int height = (int) (bitmap.getHeight() / f);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, height, config);
        createBitmap.getClass();
        Canvas canvas = new Canvas(createBitmap);
        float f2 = 1.0f / f;
        canvas.scale(f2, f2);
        int i2 = this.c;
        canvas.drawARGB(Color.alpha(i2), Color.red(i2), Color.green(i2), Color.blue(i2));
        canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
        Bitmap j = kik.j(createBitmap, (int) this.a);
        j.getClass();
        return j;
    }

    @Override // defpackage.awj
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty1)) {
            return false;
        }
        ty1 ty1Var = (ty1) obj;
        return this.a == ty1Var.a && this.b == ty1Var.b && this.c == ty1Var.c;
    }

    @Override // defpackage.awj
    public final int hashCode() {
        return Integer.hashCode(this.c) + fc6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.awj
    public final String toString() {
        StringBuilder sb = new StringBuilder("BlurTransformation(radius=");
        sb.append(this.a);
        sb.append(", sampling=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return fc6.h(this.c, ")", sb);
    }

    public /* synthetic */ ty1(float f, float f2, int i, int i2) {
        this((i2 & 4) != 0 ? Color.parseColor("#FFFFFFFF") : i, (i2 & 1) != 0 ? 10.0f : f, (i2 & 2) != 0 ? 1.0f : f2);
    }
}
