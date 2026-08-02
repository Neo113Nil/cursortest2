package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vda extends xa5 {
    public static final /* synthetic */ int w = 0;
    public final a08 e;
    public final Point2D f;
    public final Point2D g;
    public final Point2D h;
    public final boolean i;
    public final boolean j;
    public final Drawable k;
    public final Rect l;
    public final boolean m;
    public final int n;
    public final float o;
    public final Rect p;
    public final float q;
    public final PointF r;
    public PointF s;
    public final PointF t;
    public final PointF u;
    public RectF v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vda(Context context, a08 a08Var, float f, ArrayList arrayList, Point2D point2D, Point2D point2D2, Point2D point2D3, boolean z, boolean z2, Drawable drawable, Rect rect, boolean z3) {
        super(f, arrayList);
        point2D.getClass();
        rect.getClass();
        this.e = a08Var;
        this.f = point2D;
        this.g = point2D2;
        this.h = point2D3;
        this.i = z;
        this.j = z2;
        this.k = drawable;
        this.l = rect;
        this.m = z3;
        int s = ao2.s(1, context);
        this.n = s;
        float u = ao2.u(8, context);
        this.o = u;
        this.p = new Rect(0, 0, ao2.s(28, context), ao2.s(32, context));
        this.q = u + r4.height() + s;
        this.r = new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.t = new PointF();
        this.u = new PointF();
    }

    @Override // defpackage.xa5
    public final void a(Canvas canvas, va5 va5Var, float f) {
        int E;
        canvas.getClass();
        Drawable drawable = this.k;
        if (drawable != null) {
            RectF rectF = this.v;
            a08 a08Var = this.e;
            boolean c = Intrinsics.c(rectF, (RectF) a08Var.d);
            PointF pointF = this.r;
            if (!c) {
                this.v = new RectF((RectF) a08Var.d);
                Point2D point2D = this.h;
                Point2D point2D2 = this.f;
                Point2D point2D3 = this.g;
                c(point2D2, this.i, point2D3 != null ? b(point2D2, point2D3) : point2D != null ? b(point2D2, point2D) : false, pointF);
                if (point2D != null) {
                    boolean b = b(point2D, point2D2);
                    PointF pointF2 = this.s;
                    if (pointF2 == null) {
                        pointF2 = new PointF();
                        this.s = pointF2;
                        Unit unit = Unit.a;
                    }
                    c(point2D, this.j, b, pointF2);
                }
            }
            wa5 wa5Var = va5Var.a;
            float f2 = va5Var.c;
            int ordinal = wa5Var.ordinal();
            if (ordinal == 0) {
                E = rz8.E(f / f2);
            } else if (ordinal != 1) {
                E = 255;
                if (ordinal == 2) {
                    PointF pointF3 = this.s;
                    if (pointF3 != null) {
                        float f3 = f / 3.0f;
                        if (f3 > 1.0f) {
                            f3 = 1.0f;
                        }
                        PointF pointF4 = this.t;
                        pointF4.getClass();
                        pointF.getClass();
                        float f4 = pointF3.x;
                        float f5 = pointF.x;
                        float b2 = me4.b(f4, f5, f3, f5);
                        float f6 = pointF3.y;
                        float f7 = pointF.y;
                        pointF4.set(b2, me4.b(f6, f7, f3, f7));
                        pointF = pointF4;
                    }
                } else if (ordinal != 3) {
                    if (ordinal != 4) {
                        ilg.c();
                        return;
                    } else {
                        PointF pointF5 = this.s;
                        if (pointF5 != null) {
                            pointF = pointF5;
                        }
                    }
                }
            } else {
                E = rz8.F(f / f2);
            }
            drawable.setAlpha(E);
            float f8 = pointF.x;
            float f9 = pointF.y;
            Rect rect = this.p;
            rect.getClass();
            rect.offsetTo(wzb.b(f8), wzb.b(f9));
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final boolean b(Point2D point2D, Point2D point2D2) {
        if (this.m) {
            point2D2.getClass();
            point2D.getClass();
            float y = point2D.getY() - point2D2.getY();
            float abs = Math.abs(point2D.getX() - point2D2.getX());
            return y / (abs >= 0.01f ? abs : 0.01f) > 1.4782609f;
        }
        point2D.getClass();
        point2D2.getClass();
        float y2 = point2D2.getY() - point2D.getY();
        float abs2 = Math.abs(point2D2.getX() - point2D.getX());
        return y2 / (abs2 >= 0.01f ? abs2 : 0.01f) > 1.4782609f;
    }

    public final void c(Point2D point2D, boolean z, boolean z2, PointF pointF) {
        a08 a08Var = this.e;
        PointF pointF2 = this.u;
        a08.a(a08Var, point2D, pointF2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        float height = ((RectF) a08Var.c).height();
        float f = this.q;
        float f2 = height - f;
        float f3 = pointF2.x;
        Rect rect = this.p;
        float width = f3 - (rect.width() / 2);
        Rect rect2 = this.l;
        int height2 = z ? rect2.height() : 0;
        float f4 = pointF2.y;
        float f5 = height2;
        boolean z3 = f4 < f + f5;
        boolean z4 = f4 > f2 - f5;
        int i = this.n;
        float f6 = this.o;
        float height3 = pointF2.y + ((z3 || (z2 && !z4)) ? f6 + f5 + i : ((-f6) - i) - rect.height());
        if (z) {
            rect2.offsetTo(wzb.b(pointF2.x - (rect2.width() / 2)), wzb.b(height3 - f5));
        }
        pointF.set(width, height3);
    }
}
