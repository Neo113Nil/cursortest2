package com.vk.im.ui.views.msg.bubble;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.FluidHorizontalLayout;
import com.vk.im.ui.R$styleable;
import com.vk.im.ui.views.msg.bubble.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.btm;
import xsna.bwt0;
import xsna.mg;
import xsna.msy;
import xsna.nrr;
import xsna.orr;
import xsna.prr;
import xsna.qrr;

/* compiled from: FloatingBubbleFluidLayout.kt */
/* loaded from: classes2.dex */
public final class FloatingBubbleFluidLayout extends FluidHorizontalLayout {
    public static final /* synthetic */ int j = 0;
    public final LinkedHashSet g;
    public View h;
    public final Object i;

    public FloatingBubbleFluidLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new LinkedHashSet();
        this.i = msy.a(LazyThreadSafetyMode.NONE, new mg(12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Paint getCutOutPaint() {
        return (Paint) this.i.getValue();
    }

    public static int h(View view) {
        if (view == null || !bwt0.K(view)) {
            return 0;
        }
        int i = ((qrr) view.getLayoutParams()).h;
        if (i == prr.Center.h()) {
            return bwt0.u0(view) / 2;
        }
        if (i == prr.Out.h()) {
            return bwt0.u0(view);
        }
        throw new IllegalStateException("Unknown floating fit type");
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout
    public final int b() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                qrr qrrVar = (qrr) childAt.getLayoutParams();
                if (!qrrVar.f) {
                    i = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar).rightMargin + i;
                }
            }
        }
        return i;
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qrr;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        int save;
        if (view != null && bwt0.K(view)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            qrr qrrVar = layoutParams instanceof qrr ? (qrr) layoutParams : null;
            if (qrrVar != null ? qrrVar.f : false) {
                qrr qrrVar2 = (qrr) view.getLayoutParams();
                View view2 = this.f;
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float translationX = view2 != null ? view2.getTranslationX() : 0.0f;
                View view3 = this.f;
                if (view3 != null) {
                    f = view3.getTranslationY();
                }
                int i = qrrVar2.i;
                if (i == orr.RECT.h()) {
                    save = canvas.save();
                    canvas.translate(translationX, f);
                    try {
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), getCutOutPaint());
                    } finally {
                    }
                } else if (i == orr.ROUND_RECT.h()) {
                    float f2 = qrrVar2.j;
                    save = canvas.save();
                    canvas.translate(translationX, f);
                    try {
                        canvas.drawRoundRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), f2, f2, getCutOutPaint());
                        canvas.restoreToCount(save);
                    } finally {
                    }
                } else if (i == orr.CIRCLE.h()) {
                    save = canvas.save();
                    canvas.translate(translationX, f);
                    try {
                        canvas.drawOval(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), getCutOutPaint());
                        canvas.restoreToCount(save);
                    } finally {
                    }
                }
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        qrr qrrVar = new qrr(0, 0);
        qrrVar.g = a.BOTTOM_LEFT.h();
        qrrVar.h = prr.Center.h();
        qrrVar.i = orr.NONE.h();
        return qrrVar;
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        qrr qrrVar = new qrr(context, attributeSet);
        a aVar = a.BOTTOM_LEFT;
        qrrVar.g = aVar.h();
        prr prrVar = prr.Center;
        qrrVar.h = prrVar.h();
        orr orrVar = orr.NONE;
        qrrVar.i = orrVar.h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c);
            qrrVar.f = obtainStyledAttributes.getBoolean(4, false);
            qrrVar.g = obtainStyledAttributes.getInt(3, aVar.h());
            qrrVar.h = obtainStyledAttributes.getInt(2, prrVar.h());
            qrrVar.i = obtainStyledAttributes.getInt(0, orrVar.h());
            qrrVar.j = obtainStyledAttributes.getDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            obtainStyledAttributes.recycle();
        }
        return qrrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int paddingLeft;
        int b;
        int i5;
        int i6;
        View c;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int paddingLeft2 = this.c == 0 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        if (this.c == 0) {
            measuredWidth = getMeasuredWidth();
            paddingLeft = getPaddingRight();
        } else {
            measuredWidth = getMeasuredWidth();
            paddingLeft = getPaddingLeft();
        }
        int i12 = measuredWidth - paddingLeft;
        int measuredHeight = (getMeasuredHeight() - getPaddingBottom()) - h(this.h);
        int childCount = getChildCount();
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(this.b, layoutDirection);
        int i13 = 5;
        if (absoluteGravity != 1) {
            if (absoluteGravity == 5) {
                b = i12 - b();
            } else if (absoluteGravity != 17) {
                b = paddingLeft2;
            }
            i5 = i12 - paddingLeft2;
            i6 = this.d + this.e;
            if (i5 < i6) {
                i12 += i6 - i5;
            }
            c = c();
            i7 = 0;
            while (i7 < childCount) {
                View d = d(i7, this.c);
                qrr qrrVar = (qrr) d.getLayoutParams();
                if (!qrrVar.f && d.getVisibility() != 8) {
                    int marginStart = this.c == 0 ? qrrVar.getMarginStart() : qrrVar.getMarginEnd();
                    int marginEnd = this.c == 0 ? qrrVar.getMarginEnd() : qrrVar.getMarginStart();
                    if ((Gravity.getAbsoluteGravity(qrrVar.d, layoutDirection) & 7) == i13) {
                        int i14 = i12 - marginEnd;
                        i8 = i14 - d.getMeasuredWidth();
                        int i15 = ((ViewGroup.MarginLayoutParams) qrrVar).topMargin + paddingTop;
                        i10 = i14;
                        i11 = measuredHeight - ((ViewGroup.MarginLayoutParams) qrrVar).bottomMargin;
                        i12 = i8 - marginStart;
                        i9 = i15;
                    } else {
                        i8 = b + marginStart;
                        int i16 = ((ViewGroup.MarginLayoutParams) qrrVar).topMargin + paddingTop;
                        int measuredWidth2 = d.getMeasuredWidth() + i8;
                        i9 = i16;
                        i10 = measuredWidth2;
                        i11 = measuredHeight - ((ViewGroup.MarginLayoutParams) qrrVar).bottomMargin;
                        b = marginEnd + measuredWidth2;
                    }
                    int i17 = i8;
                    if (qrrVar.e) {
                        int i18 = i10;
                        if (c != null) {
                            int measuredHeight2 = d.getMeasuredHeight();
                            int bottom = c.getBottom() - ((ViewGroup.MarginLayoutParams) qrrVar).bottomMargin;
                            d.layout(i17, bottom - measuredHeight2, i18, bottom);
                        } else {
                            FluidHorizontalLayout.g(d, qrrVar, i17, i9, i18, i11);
                        }
                    } else {
                        FluidHorizontalLayout.g(d, qrrVar, i17, i9, i10, i11);
                    }
                }
                i7++;
                i13 = 5;
            }
            View view = this.h;
            if (c == null && view != null && bwt0.K(view)) {
                qrr qrrVar2 = (qrr) view.getLayoutParams();
                a.C1183a c1183a = a.Companion;
                int i19 = qrrVar2.g;
                int layoutDirection2 = getLayoutDirection();
                c1183a.getClass();
                if (i19 == a.BOTTOM_START.h()) {
                    i19 = (layoutDirection2 == 1 ? a.BOTTOM_RIGHT : a.BOTTOM_LEFT).h();
                } else if (i19 == a.BOTTOM_END.h()) {
                    i19 = (layoutDirection2 == 1 ? a.BOTTOM_LEFT : a.BOTTOM_RIGHT).h();
                }
                int i20 = qrrVar2.h == prr.Center.h() ? -(view.getMeasuredHeight() / 2) : 0;
                MsgBubbleView msgBubbleView = (MsgBubbleView) c;
                bpn0 bpn0Var = new bpn0(new btm(c, 6));
                bpn0 bpn0Var2 = new bpn0(new nrr(c, 0));
                int bottom2 = (msgBubbleView.getBottom() - (msgBubbleView.getBubbleStyle().f ? msgBubbleView.getStylePadding().bottom : msgBubbleView.getBubbleDrawablePadding().bottom)) + i20;
                int i21 = ((ViewGroup.MarginLayoutParams) qrrVar2).topMargin + bottom2;
                int measuredHeight3 = view.getMeasuredHeight() + bottom2 + ((ViewGroup.MarginLayoutParams) qrrVar2).topMargin;
                if (i19 == a.BOTTOM_LEFT.h()) {
                    view.layout(((Number) bpn0Var.getValue()).intValue() + ((ViewGroup.MarginLayoutParams) qrrVar2).leftMargin, i21, view.getMeasuredWidth() + ((Number) bpn0Var.getValue()).intValue() + ((ViewGroup.MarginLayoutParams) qrrVar2).leftMargin, measuredHeight3);
                    return;
                } else if (i19 == a.BOTTOM_RIGHT.h()) {
                    view.layout((((Number) bpn0Var2.getValue()).intValue() - ((ViewGroup.MarginLayoutParams) qrrVar2).rightMargin) - view.getMeasuredWidth(), i21, ((Number) bpn0Var2.getValue()).intValue() - ((ViewGroup.MarginLayoutParams) qrrVar2).rightMargin, measuredHeight3);
                    return;
                } else {
                    if (i19 == a.BOTTOM_CENTER.h()) {
                        view.layout(((((Number) bpn0Var2.getValue()).intValue() + ((Number) bpn0Var.getValue()).intValue()) / 2) - (view.getMeasuredWidth() / 2), i21, (view.getMeasuredWidth() / 2) + ((((Number) bpn0Var2.getValue()).intValue() + ((Number) bpn0Var.getValue()).intValue()) / 2), measuredHeight3);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        b = ((i12 - paddingLeft2) / 2) - (b() / 2);
        i5 = i12 - paddingLeft2;
        i6 = this.d + this.e;
        if (i5 < i6) {
        }
        c = c();
        i7 = 0;
        while (i7 < childCount) {
        }
        View view2 = this.h;
        if (c == null) {
        }
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View view;
        View view2;
        int i3;
        int i4;
        FloatingBubbleFluidLayout floatingBubbleFluidLayout;
        View view3;
        int i5;
        int i6;
        int i7;
        int i8;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i9;
        int i10;
        int i11;
        int measuredWidth;
        int max;
        FloatingBubbleFluidLayout floatingBubbleFluidLayout2 = this;
        floatingBubbleFluidLayout2.a();
        int paddingRight = floatingBubbleFluidLayout2.getPaddingRight() + floatingBubbleFluidLayout2.getPaddingLeft();
        int paddingBottom = floatingBubbleFluidLayout2.getPaddingBottom() + floatingBubbleFluidLayout2.getPaddingTop();
        int suggestedMinimumWidth = floatingBubbleFluidLayout2.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = floatingBubbleFluidLayout2.getSuggestedMinimumHeight();
        int childCount = floatingBubbleFluidLayout2.getChildCount();
        View c = floatingBubbleFluidLayout2.c();
        floatingBubbleFluidLayout2.f = c;
        int childCount2 = floatingBubbleFluidLayout2.getChildCount();
        int i12 = 0;
        while (true) {
            if (i12 >= childCount2) {
                view = null;
                break;
            }
            ViewGroup.LayoutParams layoutParams = floatingBubbleFluidLayout2.getChildAt(i12).getLayoutParams();
            qrr qrrVar = layoutParams instanceof qrr ? (qrr) layoutParams : null;
            if (qrrVar != null ? qrrVar.f : false) {
                view = floatingBubbleFluidLayout2.getChildAt(i12);
                break;
            }
            i12++;
        }
        floatingBubbleFluidLayout2.h = view;
        ViewGroup.LayoutParams layoutParams2 = c != null ? c.getLayoutParams() : null;
        qrr qrrVar2 = layoutParams2 instanceof qrr ? (qrr) layoutParams2 : null;
        boolean z = qrrVar2 != null ? qrrVar2.b : false;
        int size = View.MeasureSpec.getSize(i);
        if (c == null || !z) {
            view2 = c;
            i3 = 0;
            i4 = 0;
        } else {
            floatingBubbleFluidLayout2.measureChildWithMargins(c, i, 0, i2, 0);
            view2 = c;
            qrr qrrVar3 = (qrr) view2.getLayoutParams();
            i3 = view2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar3).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar3).rightMargin;
            i4 = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qrrVar3).topMargin + ((ViewGroup.MarginLayoutParams) qrrVar3).bottomMargin;
        }
        LinkedHashSet linkedHashSet = floatingBubbleFluidLayout2.g;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            bwt0.p0((View) it.next(), true);
        }
        int i13 = i3;
        int i14 = 0;
        int i15 = 0;
        while (i14 < childCount) {
            int i16 = i14;
            View childAt = floatingBubbleFluidLayout2.getChildAt(i16);
            qrr qrrVar4 = (qrr) childAt.getLayoutParams();
            if (qrrVar4.f || qrrVar4.a || childAt.getVisibility() == 8) {
                i9 = i16;
                i10 = i4;
                i11 = paddingRight;
            } else {
                i10 = i4;
                i9 = i16;
                i11 = paddingRight;
                floatingBubbleFluidLayout2.measureChildWithMargins(childAt, i, 0, i2, 0);
                if (qrrVar4.b) {
                    i15 = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar4).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar4).rightMargin + i15;
                } else {
                    if (!z) {
                        measuredWidth = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar4).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar4).rightMargin + i13;
                        max = Math.max(i10, childAt.getMeasuredHeight());
                    } else if (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar4).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar4).rightMargin + i13 <= size || !qrrVar4.c) {
                        measuredWidth = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar4).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar4).rightMargin + i13;
                        max = Math.max(i10, childAt.getMeasuredHeight());
                    } else {
                        bwt0.p0(childAt, false);
                        linkedHashSet.add(childAt);
                    }
                    i13 = measuredWidth;
                    i4 = max;
                    i14 = i9 + 1;
                    floatingBubbleFluidLayout2 = this;
                    paddingRight = i11;
                }
            }
            i4 = i10;
            i14 = i9 + 1;
            floatingBubbleFluidLayout2 = this;
            paddingRight = i11;
        }
        int i17 = i4;
        int i18 = paddingRight;
        if (view2 == null || z) {
            floatingBubbleFluidLayout = this;
            view3 = view2;
            i5 = i13;
            i6 = i17;
        } else {
            qrr qrrVar5 = (qrr) view2.getLayoutParams();
            floatingBubbleFluidLayout = this;
            view3 = view2;
            int i19 = i13;
            floatingBubbleFluidLayout.measureChildWithMargins(view3, i, i19, i2, 0);
            i5 = view3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) qrrVar5).leftMargin + ((ViewGroup.MarginLayoutParams) qrrVar5).rightMargin + i19;
            i6 = ((ViewGroup.MarginLayoutParams) qrrVar5).bottomMargin + view3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) qrrVar5).topMargin;
        }
        int i20 = i5 + i15;
        View view4 = floatingBubbleFluidLayout.h;
        if (view4 != null && bwt0.K(view4)) {
            int v0 = bwt0.v0(view3);
            MsgBubbleView msgBubbleView = (MsgBubbleView) view3;
            if (msgBubbleView.getBubbleStyle().f) {
                i7 = msgBubbleView.getStylePadding().left;
                i8 = msgBubbleView.getStylePadding().right;
            } else {
                i7 = msgBubbleView.getBubbleDrawablePadding().left;
                i8 = msgBubbleView.getBubbleDrawablePadding().right;
            }
            int i21 = v0 - (i7 + i8);
            int i22 = view4.getLayoutParams().width;
            if (i22 == -2) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i21 - bwt0.N(view4)) - bwt0.O(view4), Integer.MIN_VALUE);
            } else if (i22 != -1) {
                makeMeasureSpec = bwt0.O(view4) + (bwt0.N(view4) + view4.getLayoutParams().width) > i21 ? View.MeasureSpec.makeMeasureSpec((i21 - bwt0.N(view4)) - bwt0.O(view4), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(view4.getLayoutParams().width, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((i21 - bwt0.N(view4)) - bwt0.O(view4), 1073741824);
            }
            int i23 = view4.getLayoutParams().height;
            if (i23 == -2) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                if (i23 == -1) {
                    throw new IllegalArgumentException("Illegal height measure spec for floating view");
                }
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(view4.getLayoutParams().height, 1073741824);
            }
            view4.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        floatingBubbleFluidLayout.setMeasuredDimension(FluidHorizontalLayout.e(i, suggestedMinimumWidth, i18 + i20), FluidHorizontalLayout.e(i2, suggestedMinimumHeight, h(floatingBubbleFluidLayout.h) + i6 + paddingBottom));
    }

    @Override // com.vk.core.tool.view.FluidHorizontalLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new FluidHorizontalLayout.a(layoutParams);
    }
}
