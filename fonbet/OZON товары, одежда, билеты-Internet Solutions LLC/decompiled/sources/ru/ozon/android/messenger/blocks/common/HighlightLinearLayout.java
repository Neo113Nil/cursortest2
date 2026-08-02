package ru.ozon.android.messenger.blocks.common;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import oU.g;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/android/messenger/blocks/common/HighlightLinearLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class HighlightLinearLayout extends LinearLayoutCompat {

    /* renamed from: e, reason: collision with root package name */
    private Drawable f84884e;

    /* renamed from: f, reason: collision with root package name */
    private int f84885f;

    /* renamed from: g, reason: collision with root package name */
    private ValueAnimator f84886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void h(HighlightLinearLayout highlightLinearLayout, ValueAnimator valueAnimator) {
        highlightLinearLayout.f84885f = ((Integer) Bi.a.b(valueAnimator, "valueAnimator", "null cannot be cast to non-null type kotlin.Int")).intValue();
        highlightLinearLayout.invalidate();
    }

    public static final void i(HighlightLinearLayout highlightLinearLayout) {
        highlightLinearLayout.f84884e = null;
        highlightLinearLayout.f84886g = null;
        highlightLinearLayout.f84885f = 0;
        highlightLinearLayout.setHasTransientState(false);
        highlightLinearLayout.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Drawable drawable = this.f84884e;
        if (drawable != null && this.f84885f > 0) {
            drawable.setState(getDrawableState());
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.setAlpha(this.f84885f);
            drawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void j(int i11) {
        Drawable newDrawable;
        Drawable mutate;
        int e11 = h.e(255, 0, 255);
        if (e11 == 0) {
            return;
        }
        ValueAnimator valueAnimator = this.f84886g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f84886g = null;
        this.f84884e = null;
        this.f84885f = 0;
        Drawable.ConstantState constantState = getBackground().getConstantState();
        if (constantState == null || (newDrawable = constantState.newDrawable()) == null || (mutate = newDrawable.mutate()) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.i(mutate, i11);
        mutate.setAlpha(255);
        this.f84884e = mutate;
        this.f84885f = e11;
        invalidate();
        setHasTransientState(true);
        ValueAnimator ofInt = ValueAnimator.ofInt(e11, 0);
        ofInt.setStartDelay(600L);
        ofInt.setDuration(700L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new g(this, 1));
        ofInt.addListener(new b(this));
        this.f84886g = ofInt;
        ofInt.start();
    }

    public final void k() {
        ValueAnimator valueAnimator = this.f84886g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f84884e = null;
        this.f84886g = null;
        this.f84885f = 0;
        setHasTransientState(false);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.f84886g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f84886g = null;
        setHasTransientState(false);
        super.onDetachedFromWindow();
    }
}
