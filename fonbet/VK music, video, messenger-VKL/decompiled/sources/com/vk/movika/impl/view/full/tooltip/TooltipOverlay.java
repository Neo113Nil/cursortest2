package com.vk.movika.impl.view.full.tooltip;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Pair;
import xsna.bwt0;
import xsna.d3m;
import xsna.n6p0;
import xsna.q2m0;
import xsna.q86;
import xsna.wrl0;
import xsna.y;

/* compiled from: TooltipOverlay.kt */
/* loaded from: classes3.dex */
public final class TooltipOverlay extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final long b;
    public a c;
    public final q86 d;
    public final Rect e;

    /* compiled from: TooltipOverlay.kt */
    public final class a {
        public final n6p0 a;
        public final b b;
        public final Rect c;
        public final q2m0 d;

        public a(n6p0 n6p0Var, b bVar, Rect rect, q2m0 q2m0Var) {
            this.a = n6p0Var;
            this.b = bVar;
            this.c = rect;
            this.d = q2m0Var;
        }
    }

    /* compiled from: TooltipOverlay.kt */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    public TooltipOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 3000L;
        this.d = new q86(this, 11);
        this.e = new Rect();
        new Rect();
    }

    public static Pair b(Pair pair, int i, int i2) {
        return (((Number) pair.i()).intValue() < i || ((Number) pair.j()).intValue() > i2) ? i2 - i < ((Number) pair.j()).intValue() - ((Number) pair.i()).intValue() ? new Pair(Integer.valueOf(i), Integer.valueOf(i2)) : ((Number) pair.i()).intValue() < i ? new Pair(Integer.valueOf(i), Integer.valueOf((((Number) pair.j()).intValue() + i) - ((Number) pair.i()).intValue())) : new Pair(Integer.valueOf((((Number) pair.i()).intValue() - ((Number) pair.j()).intValue()) + i2), Integer.valueOf(i2)) : pair;
    }

    public static void d(b bVar) {
        throw new IllegalArgumentException("Unsupported tooltipGravity and tooltipAlignGravity combination: " + bVar.a + ", " + bVar.b);
    }

    private final Handler getSafeHandler() {
        return getHandler();
    }

    public final void a(boolean z) {
        a aVar = this.c;
        if (aVar != null) {
            n6p0 n6p0Var = aVar.a;
            this.c = null;
            Handler safeHandler = getSafeHandler();
            if (safeHandler != null) {
                safeHandler.removeCallbacks(this.d);
            }
            if (z) {
                d3m.e(n6p0Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new y(8, this, aVar), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                return;
            }
            n6p0Var.clearAnimation();
            removeView(n6p0Var);
            aVar.d.invoke();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r0 != 8388613) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, Rect rect, b bVar, wrl0 wrl0Var, q2m0 q2m0Var) {
        Handler safeHandler;
        a(false);
        n6p0 n6p0Var = new n6p0(getContext());
        n6p0Var.setPointerMargin(bVar.c);
        n6p0Var.setText(str);
        int i = bVar.a;
        if (i != 3) {
            if (i != 5) {
                if (i == 48) {
                    i = 80;
                } else if (i == 80) {
                    i = 48;
                } else if (i != 8388611) {
                }
                n6p0Var.setPointerGravity(i);
                n6p0Var.setVisibility(4);
                n6p0Var.setContentDescription(str);
                n6p0Var.setAccessibilityLiveRegion(2);
                this.c = new a(n6p0Var, bVar, rect, q2m0Var);
                addView(n6p0Var, -2, -2);
                d3m.c(n6p0Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                safeHandler = getSafeHandler();
                if (safeHandler != null) {
                    safeHandler.postDelayed(this.d, this.b);
                }
                wrl0Var.invoke();
            }
            i = 3;
            n6p0Var.setPointerGravity(i);
            n6p0Var.setVisibility(4);
            n6p0Var.setContentDescription(str);
            n6p0Var.setAccessibilityLiveRegion(2);
            this.c = new a(n6p0Var, bVar, rect, q2m0Var);
            addView(n6p0Var, -2, -2);
            d3m.c(n6p0Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            safeHandler = getSafeHandler();
            if (safeHandler != null) {
            }
            wrl0Var.invoke();
        }
        i = 5;
        n6p0Var.setPointerGravity(i);
        n6p0Var.setVisibility(4);
        n6p0Var.setContentDescription(str);
        n6p0Var.setAccessibilityLiveRegion(2);
        this.c = new a(n6p0Var, bVar, rect, q2m0Var);
        addView(n6p0Var, -2, -2);
        d3m.c(n6p0Var, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        safeHandler = getSafeHandler();
        if (safeHandler != null) {
        }
        wrl0Var.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Pair pair;
        Pair pair2;
        Pair pair3;
        Pair pair4;
        a aVar = this.c;
        if (aVar == null) {
            return;
        }
        n6p0 n6p0Var = aVar.a;
        b bVar = aVar.b;
        int i5 = bVar.b;
        int i6 = bVar.a;
        Rect C = bwt0.C(this);
        Rect rect = aVar.c;
        int i7 = rect.left - C.left;
        Rect rect2 = this.e;
        rect2.left = i7;
        rect2.top = rect.top - C.top;
        rect2.right = rect.right - C.left;
        rect2.bottom = rect.bottom - C.top;
        if (i6 == 48 || i6 == 80) {
            int measuredWidth = n6p0Var.getMeasuredWidth();
            int measuredHeight = n6p0Var.getMeasuredHeight();
            int centerX = rect2.centerX();
            if (i6 == 48) {
                pair = new Pair(Integer.valueOf(rect2.top - measuredHeight), Integer.valueOf(rect2.top));
            } else {
                if (i6 != 80) {
                    d(bVar);
                    throw null;
                }
                pair = new Pair(Integer.valueOf(rect2.bottom), Integer.valueOf(rect2.bottom + measuredHeight));
            }
            Pair b2 = b(pair, getPaddingTop() + getTop(), getBottom() - getPaddingBottom());
            int intValue = ((Number) b2.d()).intValue();
            int intValue2 = ((Number) b2.g()).intValue();
            if (i5 != 1) {
                if (i5 != 3) {
                    if (i5 != 5) {
                        if (i5 != 8388611) {
                            if (i5 != 8388613) {
                                d(bVar);
                                throw null;
                            }
                        }
                    }
                    pair2 = new Pair(Integer.valueOf(rect2.right - measuredWidth), Integer.valueOf(rect2.right));
                }
                pair2 = new Pair(Integer.valueOf(rect2.left), Integer.valueOf(rect2.left + measuredWidth));
            } else {
                int i8 = measuredWidth / 2;
                pair2 = new Pair(Integer.valueOf(centerX - i8), Integer.valueOf(i8 + centerX));
            }
            Pair b3 = b(pair2, getPaddingLeft() + getLeft(), getRight() - getPaddingRight());
            int intValue3 = ((Number) b3.d()).intValue();
            int intValue4 = ((Number) b3.g()).intValue();
            n6p0Var.setPointerBias(centerX - intValue3);
            n6p0Var.layout(intValue3, intValue, intValue4, intValue2);
            return;
        }
        int measuredWidth2 = n6p0Var.getMeasuredWidth();
        int measuredHeight2 = n6p0Var.getMeasuredHeight();
        int centerY = rect2.centerY();
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 != 8388611) {
                    if (i6 != 8388613) {
                        d(bVar);
                        throw null;
                    }
                }
            }
            pair3 = new Pair(Integer.valueOf(rect2.right), Integer.valueOf(rect2.right + measuredWidth2));
            Pair b4 = b(pair3, getPaddingLeft() + getLeft(), getRight() - getPaddingRight());
            int intValue5 = ((Number) b4.d()).intValue();
            int intValue6 = ((Number) b4.g()).intValue();
            if (i5 != 16) {
                int i9 = measuredHeight2 / 2;
                pair4 = new Pair(Integer.valueOf(centerY - i9), Integer.valueOf(i9 + centerY));
            } else if (i5 == 48) {
                pair4 = new Pair(Integer.valueOf(rect2.top), Integer.valueOf(rect2.top + measuredHeight2));
            } else {
                if (i5 != 80) {
                    d(bVar);
                    throw null;
                }
                pair4 = new Pair(Integer.valueOf(rect2.bottom - measuredHeight2), Integer.valueOf(rect2.bottom));
            }
            Pair b5 = b(pair4, getPaddingTop() + getTop(), getBottom() - getPaddingBottom());
            int intValue7 = ((Number) b5.d()).intValue();
            int intValue8 = ((Number) b5.g()).intValue();
            n6p0Var.setPointerBias(centerY - intValue7);
            n6p0Var.layout(intValue5, intValue7, intValue6, intValue8);
        }
        pair3 = new Pair(Integer.valueOf(rect2.left - measuredWidth2), Integer.valueOf(rect2.left));
        Pair b42 = b(pair3, getPaddingLeft() + getLeft(), getRight() - getPaddingRight());
        int intValue52 = ((Number) b42.d()).intValue();
        int intValue62 = ((Number) b42.g()).intValue();
        if (i5 != 16) {
        }
        Pair b52 = b(pair4, getPaddingTop() + getTop(), getBottom() - getPaddingBottom());
        int intValue72 = ((Number) b52.d()).intValue();
        int intValue82 = ((Number) b52.g()).intValue();
        n6p0Var.setPointerBias(centerY - intValue72);
        n6p0Var.layout(intValue52, intValue72, intValue62, intValue82);
    }
}
