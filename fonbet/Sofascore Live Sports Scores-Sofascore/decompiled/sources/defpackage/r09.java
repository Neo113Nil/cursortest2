package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r09 extends xa5 {
    public static final /* synthetic */ int m = 0;
    public final a08 e;
    public final int f;
    public final Paint g;
    public final Path h;
    public final Drawable i;
    public final Rect j;
    public final RectF k;
    public final float[] l;

    public r09(Context context, a08 a08Var, float f, ArrayList arrayList) {
        super(f, arrayList);
        Drawable drawable;
        this.e = a08Var;
        float u = ao2.u(8, context);
        this.f = context.getColor(R.color.surface_1);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.terrain_football));
        paint.setStyle(Paint.Style.FILL);
        this.g = paint;
        this.h = new Path();
        Drawable drawable2 = context.getDrawable(R.drawable.animation_goal);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.n_lv_1));
        }
        this.i = drawable;
        this.j = new Rect();
        this.k = new RectF();
        this.l = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, u, u, u, u};
    }

    @Override // defpackage.xa5
    public final void a(Canvas canvas, va5 va5Var, float f) {
        canvas.getClass();
        wa5 wa5Var = va5Var.a;
        float f2 = va5Var.c;
        int ordinal = wa5Var.ordinal();
        int F = ordinal != 0 ? ordinal != 1 ? 255 : rz8.F(f / f2) : rz8.E(f / f2);
        canvas.drawColor(this.f);
        a08 a08Var = this.e;
        RectF rectF = (RectF) a08Var.c;
        RectF rectF2 = (RectF) a08Var.c;
        float height = rectF.height();
        float width = rectF2.width();
        RectF rectF3 = this.k;
        rectF3.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height - (0.29891303f * height), width, height);
        Path path = this.h;
        path.reset();
        path.addRoundRect(rectF3, this.l, Path.Direction.CW);
        float b = wzb.b(rectF2.width() * 0.6838235f);
        float b2 = wzb.b(rectF2.height() * 0.5326087f);
        float f3 = (height + b2) / 2.0f;
        Rect rect = this.j;
        rz8.U(rect, (width - b) / 2.0f, (height - b2) / 2.0f, (width + b) / 2.0f, f3);
        Paint paint = this.g;
        paint.setAlpha(F);
        canvas.drawPath(path, paint);
        Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setAlpha(F);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }
}
