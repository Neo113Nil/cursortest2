package com.sofascore.results.main.tutorial;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.U3;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ao2;
import defpackage.f5p;
import defpackage.i5h;
import defpackage.ma9;
import defpackage.p6;
import defpackage.tsk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001R(\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/sofascore/results/main/tutorial/PulsatingFrameLayout;", "Landroid/widget/FrameLayout;", "Lma9;", U3.i.X, "e", "Lma9;", "setHighlightedArea", "(Lma9;)V", "highlightedArea", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PulsatingFrameLayout extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public ValueAnimator a;
    public final int b;
    public final Paint c;
    public final Paint d;

    /* renamed from: e, reason: from kotlin metadata */
    public ma9 highlightedArea;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulsatingFrameLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        this.b = ao2.s(12, context);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.d = paint2;
        setLayerType(1, null);
        setWillNotDraw(false);
    }

    private final void setHighlightedArea(ma9 ma9Var) {
        this.highlightedArea = ma9Var;
        invalidate();
    }

    public final void a() {
        View view = (View) i5h.j(new tsk(this));
        if (view == null) {
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        setHighlightedArea(f5p.u(iArr, iArr2, getWidth(), view.getWidth(), view.getHeight(), this.b, false, null));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1000L);
        ofFloat.addUpdateListener(new p6(7, this, ofFloat));
        ofFloat.start();
        this.a = ofFloat;
    }

    public final void b() {
        setHighlightedArea(null);
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.a = null;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        ma9 ma9Var = this.highlightedArea;
        if (ma9Var != null) {
            ma9Var.a(canvas, this.d, this.c, true);
        }
    }
}
