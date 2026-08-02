package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class abe extends xa5 {
    public static final /* synthetic */ int q = 0;
    public final a08 e;
    public final Point2D f;
    public final Drawable g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final Rect m;
    public final PointF n;
    public final Paint o;
    public final Paint p;

    public abe(Context context, a08 a08Var, float f, ArrayList arrayList, Point2D point2D, Drawable drawable) {
        super(f, arrayList);
        this.e = a08Var;
        this.f = point2D;
        this.g = drawable;
        float u = ao2.u(16, context);
        this.h = u;
        float f2 = u * 0.75f;
        this.i = f2;
        this.j = f2 / 2.0f;
        float u2 = ao2.u(8, context);
        this.k = u2;
        this.l = u2 / 2.0f;
        this.m = v9g.z(drawable);
        this.n = new PointF();
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.surface_1));
        this.o = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.n_lv_1));
        paint2.setStrokeWidth(ao2.u(2, context));
        paint2.setStyle(Paint.Style.STROKE);
        this.p = paint2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, va5 va5Var, float f) {
        int E;
        float f2;
        float f3;
        Drawable drawable;
        canvas.getClass();
        float f4 = f / va5Var.c;
        int ordinal = va5Var.a.ordinal();
        float f5 = this.h;
        if (ordinal != 0) {
            float f6 = this.l;
            f3 = this.k;
            float f7 = this.i;
            E = 255;
            if (ordinal == 1) {
                float f8 = this.j;
                float f9 = 1.0f - f4;
                f5 = ((f7 - f8) * f9) + f8;
                f3 = me4.b(f3, f6, f9, f6);
                f2 = 0.0f;
            } else if (ordinal == 2) {
                float f10 = 1.0f - f4;
                float f11 = ((f5 - f7) * f10) + f7;
                float f12 = f10 * (-f5);
                f3 = me4.b(f3, f6, f4, f6);
                f5 = f11;
                f2 = f12;
            } else if (ordinal == 3) {
                f2 = -f5;
            } else if (ordinal != 4) {
                ilg.c();
                return;
            } else {
                f2 = 0.0f;
                f5 = f7;
            }
            Point2D point2D = this.f;
            a08 a08Var = this.e;
            PointF pointF = this.n;
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                a08.a(a08Var, point2D, pointF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                int alpha = getAlpha();
                Paint paint = this.o;
                paint.setAlpha(alpha);
                int alpha2 = getAlpha();
                Paint paint2 = this.p;
                paint2.setAlpha(alpha2);
                canvas.drawCircle(pointF.x, pointF.y, f3, paint);
                canvas.drawCircle(pointF.x, pointF.y, f3, paint2);
            }
            int b = wzb.b(f5);
            drawable = this.g;
            if (drawable == null) {
                a08.a(a08Var, point2D, pointF, f2, 4);
                Rect rect = this.m;
                rz8.y(rect, pointF, b, b);
                drawable.setAlpha(E);
                drawable.setBounds(rect);
                drawable.draw(canvas);
                return;
            }
            return;
        }
        E = rz8.E(f4);
        f2 = (-f5) - ((1.0f - f4) * f5);
        f3 = 0.0f;
        Point2D point2D2 = this.f;
        a08 a08Var2 = this.e;
        PointF pointF2 = this.n;
        if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        int b2 = wzb.b(f5);
        drawable = this.g;
        if (drawable == null) {
        }
    }
}
