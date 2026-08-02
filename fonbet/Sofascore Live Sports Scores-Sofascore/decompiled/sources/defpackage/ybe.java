package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ybe extends xa5 {
    public static final /* synthetic */ int m = 0;
    public final a08 e;
    public final xbb f;
    public final float g;
    public final Point2D h;
    public final PointF i;
    public final PointF j;
    public final Paint k;
    public final Paint l;

    public ybe(Context context, a08 a08Var, xbb xbbVar, ArrayList arrayList) {
        super(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, arrayList);
        this.e = a08Var;
        this.f = xbbVar;
        float u = ao2.u(2, context);
        this.g = ao2.u(4, context);
        this.h = new Point2D(0, 0);
        this.i = new PointF();
        this.j = new PointF();
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.n_lv_1));
        paint.setStrokeWidth(u);
        paint.setStyle(Paint.Style.STROKE);
        this.k = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.surface_1));
        this.l = paint2;
    }

    @Override // defpackage.xa5
    public final void a(Canvas canvas, va5 va5Var, float f) {
        canvas.getClass();
        int ordinal = va5Var.a.ordinal();
        int i = 0;
        xbb xbbVar = this.f;
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            int i2 = (int) (f / 8.0f);
            int size = xbbVar.size() - 1;
            if (i2 > size) {
                i2 = size;
            }
            int i3 = i2 - 1;
            if (i3 >= 0) {
                while (true) {
                    int i4 = i + 1;
                    b(canvas, (Point2D) xbbVar.get(i), (Point2D) xbbVar.get(i4), 255);
                    if (i == i3) {
                        break;
                    } else {
                        i = i4;
                    }
                }
            }
            Point2D point2D = (Point2D) CollectionsKt.a0(i2 + 1, xbbVar);
            if (point2D != null) {
                Point2D point2D2 = (Point2D) xbbVar.get(i2);
                float c = mz1.c(i2, 8.0f, f, 3.0f);
                if (c > 1.0f) {
                    c = 1.0f;
                }
                Point2D point2D3 = this.h;
                rz8.T(point2D3, point2D2, point2D, c);
                b(canvas, point2D2, point2D3, 255);
                return;
            }
            return;
        }
        int F = rz8.F(f / va5Var.c);
        int i5 = b.i(xbbVar) - 1;
        if (i5 < 0) {
            return;
        }
        while (true) {
            int i6 = i + 1;
            b(canvas, (Point2D) xbbVar.get(i), (Point2D) xbbVar.get(i6), F);
            if (i == i5) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public final void b(Canvas canvas, Point2D point2D, Point2D point2D2, int i) {
        a08 a08Var = this.e;
        PointF pointF = this.i;
        a08.a(a08Var, point2D, pointF, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        PointF pointF2 = this.j;
        a08.a(a08Var, point2D2, pointF2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        Paint paint = this.k;
        paint.setAlpha(i);
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, paint);
        Paint paint2 = this.l;
        paint2.setAlpha(i);
        paint.setAlpha(i);
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = this.g;
        canvas.drawCircle(f, f2, f3, paint2);
        canvas.drawCircle(pointF.x, pointF.y, f3, paint);
    }
}
