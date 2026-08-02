package com.sofascore.results.event.statistics.view.football;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.b6a;
import defpackage.joa;
import defpackage.llf;
import defpackage.nzd;
import defpackage.v9g;
import defpackage.wzb;
import defpackage.x31;
import defpackage.x6k;
import defpackage.y31;
import defpackage.yhk;
import defpackage.yid;
import defpackage.ypa;
import defpackage.ysa;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eR\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R2\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/sofascore/results/event/statistics/view/football/PESMFootballGoalmapView;", "Ly31;", "Landroid/graphics/drawable/Drawable;", "w", "Ljoa;", "getGloveDrawable", "()Landroid/graphics/drawable/Drawable;", "gloveDrawable", "Lkotlin/Function1;", "Lx31;", "", "A", "Lkotlin/jvm/functions/Function1;", "getOnShotSelectionChanged", "()Lkotlin/jvm/functions/Function1;", "setOnShotSelectionChanged", "(Lkotlin/jvm/functions/Function1;)V", "onShotSelectionChanged", "", "getGoalWidthScale", "()F", "goalWidthScale", "getScaledDpPerProviderUnit", "scaledDpPerProviderUnit", "getScaledGoalHalfWidthPx", "scaledGoalHalfWidthPx", "", "getScaledGoalHeightPx", "()I", "scaledGoalHeightPx", "x6k", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PESMFootballGoalmapView extends y31 {
    public static final /* synthetic */ int G = 0;

    /* renamed from: A, reason: from kotlin metadata */
    public Function1 onShotSelectionChanged;
    public final Paint B;
    public final Paint C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final float r;
    public final int s;
    public final float t;
    public final int u;
    public Point2D v;

    /* renamed from: w, reason: from kotlin metadata */
    public final joa gloveDrawable;
    public boolean x;
    public x6k y;
    public final Drawable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PESMFootballGoalmapView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.r = ao2.v(45, context);
        this.s = ao2.v(32, context);
        this.t = ao2.u(10, context);
        int color = context.getColor(R.color.graphics_dark);
        this.u = color;
        this.gloveDrawable = ypa.a(ysa.c, new nzd(context, 0));
        Drawable drawable = context.getDrawable(R.drawable.football_goalmap_goal_only);
        if (drawable != null) {
            v9g.K(drawable, context.getColor(R.color.neutral_default));
        } else {
            drawable = null;
        }
        this.z = drawable;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(context.getColor(R.color.neutral_default));
        this.B = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setColor(context.getColor(R.color.surface_2));
        this.C = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        paint3.setColor(context.getColor(R.color.on_color_secondary));
        this.D = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(style);
        paint4.setColor(context.getColor(R.color.on_color_primary));
        this.E = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setColor(color);
        paint5.setStrokeWidth(getDpToPx1());
        this.F = paint5;
    }

    private final Drawable getGloveDrawable() {
        return (Drawable) this.gloveDrawable.getValue();
    }

    private final float getGoalWidthScale() {
        return this.x ? 0.67499995f : 0.45f;
    }

    private final float getScaledDpPerProviderUnit() {
        return this.x ? 11.6379f : 7.7586f;
    }

    private final float getScaledGoalHalfWidthPx() {
        boolean z = this.x;
        float f = this.r;
        return z ? f * 1.5f : f;
    }

    private final int getScaledGoalHeightPx() {
        boolean z = this.x;
        int i = this.s;
        return z ? wzb.b(i * 1.5f) : i;
    }

    @Override // defpackage.y31
    public final void a(Canvas canvas) {
        canvas.getClass();
        Drawable drawable = this.z;
        if (drawable != null) {
            canvas.drawRect(drawable.getBounds(), this.C);
        }
        canvas.drawRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getHeight() - getDpToPx1(), getWidth(), getHeight(), this.B);
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // defpackage.y31
    public final void b(Canvas canvas, Point2D point2D, int i) {
        canvas.getClass();
        point2D.getClass();
        if (!this.x) {
            super.b(canvas, point2D, i);
            return;
        }
        Drawable ballIcon = getBallIcon();
        x31 selectedShot = getSelectedShot();
        boolean z = false;
        if (selectedShot != null && selectedShot.a == i) {
            z = true;
        }
        j(canvas, point2D, ballIcon, z, false);
    }

    @Override // defpackage.y31
    public final void c(Canvas canvas, Point2D point2D, boolean z, int i) {
        boolean z2;
        Canvas canvas2;
        Point2D point2D2;
        PESMFootballGoalmapView pESMFootballGoalmapView;
        canvas.getClass();
        point2D.getClass();
        if (!this.x || !z) {
            super.c(canvas, point2D, z, i);
            return;
        }
        Drawable gloveDrawable = getGloveDrawable();
        x31 selectedShot = getSelectedShot();
        boolean z3 = selectedShot != null && selectedShot.a == i;
        if (point2D.getX() < getWidth() / 2) {
            z2 = true;
            pESMFootballGoalmapView = this;
            canvas2 = canvas;
            point2D2 = point2D;
        } else {
            z2 = false;
            canvas2 = canvas;
            point2D2 = point2D;
            pESMFootballGoalmapView = this;
        }
        pESMFootballGoalmapView.j(canvas2, point2D2, gloveDrawable, z3, z2);
    }

    @Override // defpackage.y31
    public final void e(x31 x31Var) {
        if (getWidth() <= 0 || getHeight() <= 0 || x31Var == null) {
            return;
        }
        Point2D point2D = x31Var.d;
        float height = getHeight() - getDpToPx1();
        int width = getWidth();
        getContext().getClass();
        float G2 = ao2.G(width, r3) / getScaledDpPerProviderUnit();
        if (G2 > 100.0f) {
            G2 = 100.0f;
        }
        float f = (100.0f - G2) / 2.0f;
        float f2 = (100.0f - f) - f;
        float x = point2D.getX() - f;
        float y = point2D.getY();
        float width2 = getWidth() / G2;
        float f3 = height / 100.0f;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= x && x <= f2) {
            f4 = x * width2;
        } else if (x >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f4 = x > f2 ? getWidth() : getWidth() / 2.0f;
        }
        x31Var.e = new Point2D(llf.b(f4, getFieldPadding() + getDpToPx8(), (getWidth() - getDpToPx8()) - getFieldPadding()), llf.b((float) ((height * (-0.38523809523809516d)) + (y * f3 * 1.3852380952380952d)), getFieldPadding() + getDpToPx8(), getHeight() - getDpToPx8()));
    }

    @Override // defpackage.y31
    public final void g(int i, int i2) {
        int i3 = i / 2;
        int b = wzb.b(Math.min(i3 * getGoalWidthScale(), getScaledGoalHalfWidthPx()));
        Drawable drawable = this.z;
        if (drawable != null) {
            drawable.setBounds(new Rect(i3 - b, (i2 - ((int) getDpToPx1())) - getScaledGoalHeightPx(), i3 + b, i2 - ((int) getDpToPx1())));
        }
    }

    @Nullable
    public final Function1<x31, Unit> getOnShotSelectionChanged() {
        return this.onShotSelectionChanged;
    }

    public final void h() {
        x6k x6kVar = this.y;
        if (x6kVar != null) {
            ((ValueAnimator) x6kVar.d).cancel();
        }
        Point2D point2D = this.v;
        x31 selectedShot = getSelectedShot();
        Point2D point2D2 = selectedShot != null ? selectedShot.e : null;
        if (point2D == null || point2D2 == null) {
            return;
        }
        x6k x6kVar2 = new x6k(this, point2D, point2D2);
        ((ValueAnimator) x6kVar2.d).start();
        this.y = x6kVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Integer num) {
        List<x31> allShots = getAllShots();
        x31 x31Var = null;
        if (allShots != null) {
            Iterator<T> it = allShots.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((x31) next).a == num.intValue()) {
                    x31Var = next;
                    break;
                }
            }
            x31Var = x31Var;
        }
        setSelectedShot(x31Var);
        h();
        Function1 function1 = this.onShotSelectionChanged;
        if (function1 != null) {
            function1.invoke(getSelectedShot());
        }
    }

    public final void j(Canvas canvas, Point2D point2D, Drawable drawable, boolean z, boolean z2) {
        canvas.drawCircle(point2D.getX(), point2D.getY(), getDpToPx8(), z ? this.E : this.D);
        b6a.D(point2D, getBallIconRect(), getDpToPx16());
        if (drawable != null) {
            v9g.K(drawable, z ? getSelectedColor() : this.u);
        }
        if (drawable != null) {
            drawable.setBounds(getBallIconRect());
        }
        if (z2) {
            if (drawable != null) {
                v9g.C(drawable, canvas);
            }
        } else if (drawable != null) {
            drawable.draw(canvas);
        }
        if (z) {
            Point2D point2D2 = this.v;
            if (point2D2 == null) {
                point2D2 = Point2D.copy$default(point2D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3, null);
                this.v = point2D2;
            }
            canvas.drawCircle(point2D2.getX(), point2D2.getY(), this.t, this.F);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        x6k x6kVar = this.y;
        if (x6kVar != null) {
            ((ValueAnimator) x6kVar.d).cancel();
        }
        this.y = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.x) {
            List<x31> allShots = getAllShots();
            x31 x31Var = null;
            if (yid.m(allShots != null ? Integer.valueOf(allShots.size()) : null) >= 2) {
                if (motionEvent != null && motionEvent.getActionMasked() == 1) {
                    Point2D point2D = new Point2D(motionEvent.getX(), motionEvent.getY());
                    List<x31> allShots2 = getAllShots();
                    if (allShots2 != null) {
                        Iterator<T> it = allShots2.iterator();
                        if (!it.hasNext()) {
                            yhk.d();
                            return false;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            x31 x31Var2 = (x31) next;
                            double l = !Intrinsics.c(x31Var2, getSelectedShot()) ? b6a.l(point2D, x31Var2.e) : Double.MAX_VALUE;
                            do {
                                Object next2 = it.next();
                                x31 x31Var3 = (x31) next2;
                                double l2 = !Intrinsics.c(x31Var3, getSelectedShot()) ? b6a.l(point2D, x31Var3.e) : Double.MAX_VALUE;
                                if (Double.compare(l, l2) > 0) {
                                    next = next2;
                                    l = l2;
                                }
                            } while (it.hasNext());
                        }
                        x31 x31Var4 = (x31) next;
                        if (x31Var4 != null && !x31Var4.equals(getSelectedShot()) && b6a.l(x31Var4.e, point2D) < getDpToPx16()) {
                            x31Var = x31Var4;
                        }
                    }
                    if (x31Var != null) {
                        i(Integer.valueOf(x31Var.a));
                        super.performClick();
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setOnShotSelectionChanged(@Nullable Function1<? super x31, Unit> function1) {
        this.onShotSelectionChanged = function1;
    }
}
