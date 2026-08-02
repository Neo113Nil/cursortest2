package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mz7 extends xa5 {
    public static final /* synthetic */ int k = 0;
    public final a08 e;
    public final xbb f;
    public final Drawable g;
    public final Rect h;
    public final Point2D i;
    public final PointF j;

    public mz7(Context context, a08 a08Var, xbb xbbVar, ArrayList arrayList) {
        super(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, arrayList);
        this.e = a08Var;
        this.f = xbbVar;
        Drawable drawable = context.getDrawable(R.drawable.ic_ball_football_full_16);
        this.g = drawable;
        this.h = v9g.z(drawable);
        this.i = new Point2D(0, 0);
        this.j = new PointF();
    }

    @Override // defpackage.xa5
    public final void a(Canvas canvas, va5 va5Var, float f) {
        canvas.getClass();
        int ordinal = va5Var.a.ordinal();
        xbb xbbVar = this.f;
        if (ordinal == 1) {
            b(canvas, (Point2D) CollectionsKt.h0(xbbVar), rz8.F(f / va5Var.c));
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                return;
            }
            b(canvas, (Point2D) CollectionsKt.Y(xbbVar), 255);
            return;
        }
        int i = (int) (f / 8.0f);
        Point2D point2D = (Point2D) CollectionsKt.a0(i + 1, xbbVar);
        if (point2D == null) {
            b(canvas, (Point2D) CollectionsKt.h0(xbbVar), 255);
            return;
        }
        Point2D point2D2 = (Point2D) xbbVar.get(i);
        float c = mz1.c(i, 8.0f, f, 3.0f);
        if (c > 1.0f) {
            c = 1.0f;
        }
        Point2D point2D3 = this.i;
        rz8.T(point2D3, point2D2, point2D, c);
        b(canvas, point2D3, 255);
    }

    public final void b(Canvas canvas, Point2D point2D, int i) {
        Drawable drawable = this.g;
        if (drawable != null) {
            a08 a08Var = this.e;
            PointF pointF = this.j;
            a08.a(a08Var, point2D, pointF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
            Rect rect = this.h;
            rz8.y(rect, pointF, rect.width(), rect.height());
            drawable.setBounds(rect);
            drawable.setAlpha(i);
            drawable.draw(canvas);
        }
    }
}
