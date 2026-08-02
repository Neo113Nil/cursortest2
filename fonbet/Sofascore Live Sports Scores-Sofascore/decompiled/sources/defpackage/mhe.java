package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mhe extends xa5 {
    public static final /* synthetic */ int r = 0;
    public final RectF e;
    public final RectF f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final Drawable k;
    public final Drawable l;
    public final RectF m;
    public final Rect n;
    public final Rect o;
    public final Paint p;
    public final Paint q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mhe(Context context, RectF rectF, RectF rectF2, ArrayList arrayList, float f, float f2) {
        super(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, arrayList);
        Drawable drawable;
        Drawable mutate;
        rectF.getClass();
        rectF2.getClass();
        this.e = rectF;
        this.f = rectF2;
        this.g = f;
        this.h = f2;
        ao2.u(2, context);
        float u = ao2.u(8, context);
        this.i = u;
        this.j = wzb.b(u);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_football_terran_horizontal_lines_only);
        Drawable drawable3 = null;
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(context.getColor(R.color.surface_1));
        }
        this.k = drawable;
        Drawable drawable4 = context.getDrawable(R.drawable.ic_sofascore_logomark);
        if (drawable4 != null && (mutate = drawable4.mutate()) != null) {
            mutate.setTint(context.getColor(R.color.n_lv_5));
            drawable3 = mutate;
        }
        this.l = drawable3;
        this.m = new RectF();
        this.n = new Rect();
        this.o = v9g.z(drawable3);
        Paint paint = new Paint(1);
        paint.setColor(context.getColor(R.color.terrain_football));
        paint.setStyle(Paint.Style.FILL);
        this.p = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.n_lv_5));
        this.q = paint2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062 A[LOOP:0: B:8:0x005d->B:10:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, va5 va5Var, float f) {
        int E;
        float f2;
        int i;
        Drawable drawable;
        Drawable drawable2;
        canvas.getClass();
        wa5 wa5Var = va5Var.a;
        float f3 = va5Var.c;
        int ordinal = wa5Var.ordinal();
        if (ordinal == 0) {
            E = rz8.E(f / f3);
        } else {
            if (ordinal == 1) {
                float f4 = f / f3;
                E = rz8.F(f4);
                f2 = f4 * 100.0f;
                RectF rectF = this.e;
                float width = rectF.width();
                float height = rectF.height();
                RectF rectF2 = this.f;
                float height2 = (rectF2.height() * f2) / 100.0f;
                rectF.offsetTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height2);
                Paint paint = this.p;
                paint.setAlpha(E);
                float f5 = this.g;
                canvas.drawRoundRect(rectF, f5, f5, paint);
                float width2 = rectF2.width() / 8.0f;
                float height3 = rectF2.height();
                RectF rectF3 = this.m;
                rectF3.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width2, height3);
                rectF3.offsetTo(rectF2.left, rectF2.top + height2);
                for (i = 0; i < 4; i++) {
                    canvas.drawRect(rectF3, this.q);
                    rectF3.offset(2.0f * width2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                float f6 = this.h;
                Rect rect = this.n;
                float f7 = this.i;
                rz8.U(rect, f6, f7, width - f6, height - this.j);
                drawable = this.k;
                if (drawable != null) {
                    drawable.setAlpha(E);
                    rect.offsetTo(rect.left, wzb.b(f7 + height2));
                    drawable.setBounds(rect);
                    drawable.draw(canvas);
                }
                drawable2 = this.l;
                float intrinsicWidth = drawable2 != null ? drawable2.getIntrinsicWidth() : 0;
                Rect rect2 = this.o;
                rect2.getClass();
                rect2.offsetTo(wzb.b((width - intrinsicWidth) / 2.0f), wzb.b((height - intrinsicWidth) / 2.0f));
                if (drawable2 == null) {
                    drawable2.setAlpha(E);
                    rect2.offsetTo(rect2.left, wzb.b(((height - rect2.height()) / 2.0f) + height2));
                    drawable2.setBounds(rect2);
                    drawable2.draw(canvas);
                    return;
                }
                return;
            }
            E = 255;
        }
        f2 = 0.0f;
        RectF rectF4 = this.e;
        float width3 = rectF4.width();
        float height4 = rectF4.height();
        RectF rectF22 = this.f;
        float height22 = (rectF22.height() * f2) / 100.0f;
        rectF4.offsetTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, height22);
        Paint paint2 = this.p;
        paint2.setAlpha(E);
        float f52 = this.g;
        canvas.drawRoundRect(rectF4, f52, f52, paint2);
        float width22 = rectF22.width() / 8.0f;
        float height32 = rectF22.height();
        RectF rectF32 = this.m;
        rectF32.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width22, height32);
        rectF32.offsetTo(rectF22.left, rectF22.top + height22);
        while (i < 4) {
        }
        float f62 = this.h;
        Rect rect3 = this.n;
        float f72 = this.i;
        rz8.U(rect3, f62, f72, width3 - f62, height4 - this.j);
        drawable = this.k;
        if (drawable != null) {
        }
        drawable2 = this.l;
        float intrinsicWidth2 = drawable2 != null ? drawable2.getIntrinsicWidth() : 0;
        Rect rect22 = this.o;
        rect22.getClass();
        rect22.offsetTo(wzb.b((width3 - intrinsicWidth2) / 2.0f), wzb.b((height4 - intrinsicWidth2) / 2.0f));
        if (drawable2 == null) {
        }
    }
}
