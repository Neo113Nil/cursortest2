package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.commentary.SegmentEventType;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m09 extends xa5 {
    public static final /* synthetic */ int t = 0;
    public final a08 e;
    public final Point2D f;
    public final SegmentEventType g;
    public final float h;
    public final Drawable i;
    public final Rect j;
    public final Drawable k;
    public final Rect l;
    public final Point2D m;
    public final Point2D n;
    public final DecelerateInterpolator o;
    public final PointF p;
    public final TextPaint q;
    public final String r;
    public final Rect s;

    public m09(Context context, a08 a08Var, float f, ArrayList arrayList, Point2D point2D, Point2D point2D2, Point2D point2D3, SegmentEventType segmentEventType) {
        super(f, arrayList);
        Drawable drawable;
        TextPaint textPaint;
        float abs;
        float f2;
        float abs2;
        Typeface typeface;
        this.e = a08Var;
        this.f = point2D;
        this.g = segmentEventType;
        this.h = ao2.u(20, context);
        Drawable drawable2 = context.getDrawable(R.drawable.ic_ball_football_full_layered);
        if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
            drawable = null;
        } else {
            int i = segmentEventType == null ? -1 : l09.a[segmentEventType.ordinal()];
            v9g.M(drawable, R.id.background, context.getColor((i == 1 || i == 2) ? R.color.error : R.color.graphics_dark));
        }
        this.i = drawable;
        this.j = v9g.z(drawable);
        SegmentEventType segmentEventType2 = SegmentEventType.SAVED_PENALTY;
        Boolean valueOf = Boolean.valueOf(segmentEventType == segmentEventType2);
        Boolean bool = Boolean.TRUE;
        Drawable d0 = valueOf.equals(bool) ? td4.d0(R.drawable.ic_football_glove, context) : null;
        this.k = d0;
        this.l = Boolean.valueOf(segmentEventType == segmentEventType2).equals(bool) ? v9g.z(d0) : null;
        this.n = new Point2D(0, 0);
        this.o = new DecelerateInterpolator(2.5f);
        this.p = new PointF();
        if (Boolean.valueOf(b(segmentEventType)).equals(bool)) {
            textPaint = new TextPaint();
            textPaint.setColor(context.getColor(R.color.n_lv_1));
            textPaint.setTextSize(ao2.H(16, context));
            try {
                typeface = z1g.a(R.font.sofascore_sans_bold, context);
            } catch (Exception unused) {
                typeface = Typeface.DEFAULT;
            }
            textPaint.setTypeface(typeface);
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else {
            textPaint = null;
        }
        this.q = textPaint;
        Boolean valueOf2 = Boolean.valueOf(b(this.g));
        Boolean bool2 = Boolean.TRUE;
        this.r = valueOf2.equals(bool2) ? context.getString(R.string.commentary_goal) : null;
        this.s = Boolean.valueOf(b(this.g)).equals(bool2) ? new Rect() : null;
        float x = point2D3.getX() - point2D2.getX();
        float signum = (Math.abs(x) < 0.1f ? Math.signum(x) * 0.1f : x) * 1.4782609f;
        float y = point2D3.getY() - point2D2.getY();
        if (point2D2.getX() < 10.0f) {
            abs = point2D2.getY();
            abs2 = Math.abs(signum);
        } else {
            if (point2D2.getX() <= 90.0f) {
                abs = ((y * 10.0f) / Math.abs(signum)) + point2D2.getY();
                abs = signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 100.0f - abs : abs;
                f2 = 1.0f;
                this.m = new Point2D(((abs - 40.0f) / 20.0f) * 100.0f, (f2 * 40.0f) + 100.0f);
            }
            abs = 100.0f - point2D2.getY();
            abs2 = Math.abs(signum);
        }
        f2 = abs2 / 10.0f;
        this.m = new Point2D(((abs - 40.0f) / 20.0f) * 100.0f, (f2 * 40.0f) + 100.0f);
    }

    public static boolean b(SegmentEventType segmentEventType) {
        return (segmentEventType == SegmentEventType.MISSED_PENALTY || segmentEventType == SegmentEventType.SAVED_PENALTY) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.xa5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, va5 va5Var, float f) {
        int F;
        Point2D point2D;
        int i;
        SegmentEventType segmentEventType;
        boolean b;
        PointF pointF;
        Drawable drawable;
        Drawable drawable2;
        Rect rect;
        TextPaint textPaint;
        String str;
        Rect rect2;
        canvas.getClass();
        float f2 = f / va5Var.c;
        int ordinal = va5Var.a.ordinal();
        float f3 = 1.0f;
        Point2D point2D2 = this.f;
        if (ordinal != 1) {
            F = 255;
            if (ordinal == 2) {
                float interpolation = this.o.getInterpolation(f2);
                Point2D point2D3 = this.m;
                point2D = this.n;
                rz8.T(point2D, point2D3, point2D2, interpolation);
                f3 = 1.0f + ((1.0f - interpolation) * 4.0f);
                F = rz8.E(f2);
                i = 255;
                segmentEventType = this.g;
                b = b(segmentEventType);
                pointF = this.p;
                if (b && F > 0 && (textPaint = this.q) != null && (str = this.r) != null && (rect2 = this.s) != null) {
                    textPaint.getTextBounds(str, 0, str.length(), rect2);
                    a08 a08Var = this.e;
                    pointF.set(((RectF) a08Var.c).width() / 2.0f, (textPaint.getTextSize() / 2.0f) + (((((RectF) a08Var.c).height() * 86.0f) / 4.0f) / 184.0f));
                    rz8.y(rect2, pointF, rect2.width(), rect2.height());
                    textPaint.setAlpha(F);
                    canvas.drawText(str, rect2.left, rect2.top, textPaint);
                }
                if (segmentEventType == SegmentEventType.SAVED_PENALTY && (drawable2 = this.k) != null && (rect = this.l) != null) {
                    c(pointF, point2D2);
                    float f4 = point2D2.getX() > 50.0f ? 0.15f : 0.85f;
                    float f5 = point2D2.getY() <= 70.0f ? 0.15f : 0.85f;
                    int width = rect.width();
                    int height = rect.height();
                    float f6 = width;
                    float f7 = pointF.x - (f4 * f6);
                    float f8 = height;
                    float f9 = pointF.y - (f5 * f8);
                    rz8.U(rect, f7, f9, f6 + f7, f8 + f9);
                    drawable2.setBounds(rect);
                    drawable2.setAlpha(F);
                    if (point2D2.getX() > 50.0f) {
                        v9g.C(drawable2, canvas);
                    } else {
                        drawable2.draw(canvas);
                    }
                }
                drawable = this.i;
                if (drawable == null) {
                    int b2 = wzb.b(this.h * f3);
                    Rect rect3 = this.j;
                    rect3.set(0, 0, b2, b2);
                    c(pointF, point2D);
                    rz8.y(rect3, pointF, rect3.width(), rect3.height());
                    drawable.setAlpha(i);
                    drawable.setBounds(rect3);
                    drawable.draw(canvas);
                    return;
                }
                return;
            }
        } else {
            F = rz8.F(f2);
        }
        point2D = point2D2;
        i = F;
        segmentEventType = this.g;
        b = b(segmentEventType);
        pointF = this.p;
        if (b) {
            textPaint.getTextBounds(str, 0, str.length(), rect2);
            a08 a08Var2 = this.e;
            pointF.set(((RectF) a08Var2.c).width() / 2.0f, (textPaint.getTextSize() / 2.0f) + (((((RectF) a08Var2.c).height() * 86.0f) / 4.0f) / 184.0f));
            rz8.y(rect2, pointF, rect2.width(), rect2.height());
            textPaint.setAlpha(F);
            canvas.drawText(str, rect2.left, rect2.top, textPaint);
        }
        if (segmentEventType == SegmentEventType.SAVED_PENALTY) {
            c(pointF, point2D2);
            if (point2D2.getX() > 50.0f) {
            }
            if (point2D2.getY() <= 70.0f) {
            }
            int width2 = rect.width();
            int height2 = rect.height();
            float f62 = width2;
            float f72 = pointF.x - (f4 * f62);
            float f82 = height2;
            float f92 = pointF.y - (f5 * f82);
            rz8.U(rect, f72, f92, f62 + f72, f82 + f92);
            drawable2.setBounds(rect);
            drawable2.setAlpha(F);
            if (point2D2.getX() > 50.0f) {
            }
        }
        drawable = this.i;
        if (drawable == null) {
        }
    }

    public final void c(PointF pointF, Point2D point2D) {
        a08 a08Var = this.e;
        float width = ((RectF) a08Var.c).width() / 2.0f;
        float x = ((((point2D.getX() - 25.0f) / 50.0f) * 100.0f) / 100.0f) - 0.5f;
        RectF rectF = (RectF) a08Var.c;
        float b = wzb.b(rectF.width() * 0.6838235f) - (rectF.width() * 0.05882353f);
        float f = this.h / 2.0f;
        pointF.set(me4.b(b, f, x, width), (((wzb.b(rectF.height() * 0.5326087f) - (rectF.height() * 0.08695652f)) - f) * (((((point2D.getY() - 40.0f) / 60.0f) * 100.0f) / 100.0f) - 0.5f)) + (rectF.height() / 2.0f));
    }
}
