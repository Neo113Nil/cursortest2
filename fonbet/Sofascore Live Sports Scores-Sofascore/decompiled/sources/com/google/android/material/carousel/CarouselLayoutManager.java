package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.o;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.ffb;
import defpackage.hrf;
import defpackage.k65;
import defpackage.ljg;
import defpackage.nl2;
import defpackage.ol2;
import defpackage.pjf;
import defpackage.prf;
import defpackage.qh0;
import defpackage.qrf;
import defpackage.r8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends n implements prf {
    public final qh0 a;
    public ffb b;
    public final View.OnLayoutChangeListener c;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new k65();
        this.c = new r8(this, 1);
        this.a = new qh0(5);
        requestLayout();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pjf.f);
            obtainStyledAttributes.getInt(0, 0);
            requestLayout();
            setOrientation(obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean canScrollHorizontally() {
        return e();
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean canScrollVertically() {
        return !e();
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeHorizontalScrollExtent(qrf qrfVar) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeHorizontalScrollOffset(qrf qrfVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeHorizontalScrollRange(qrf qrfVar) {
        return 0;
    }

    @Override // defpackage.prf
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeVerticalScrollExtent(qrf qrfVar) {
        getChildCount();
        return 0;
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeVerticalScrollOffset(qrf qrfVar) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.n
    public final int computeVerticalScrollRange(qrf qrfVar) {
        return 0;
    }

    public final float d(float f, float f2) {
        return f() ? f - f2 : f + f2;
    }

    public final boolean e() {
        return this.b.b == 0;
    }

    public final boolean f() {
        return e() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.n
    public final hrf generateDefaultLayoutParams() {
        return new hrf(-2, -2);
    }

    @Override // androidx.recyclerview.widget.n
    public final void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        rect.centerY();
        if (e()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public final void measureChildWithMargins(View view, int i, int i2) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // androidx.recyclerview.widget.n
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        Context context = recyclerView.getContext();
        qh0 qh0Var = this.a;
        float f = qh0Var.a;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = context.getResources().getDimension(com.sofascore.results.R.dimen.m3_carousel_small_item_size_min);
        }
        qh0Var.a = f;
        float f2 = qh0Var.b;
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = context.getResources().getDimension(com.sofascore.results.R.dimen.m3_carousel_small_item_size_max);
        }
        qh0Var.b = f2;
        requestLayout();
        recyclerView.addOnLayoutChangeListener(this.c);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onDetachedFromWindow(RecyclerView recyclerView, o oVar) {
        onDetachedFromWindow(recyclerView);
        recyclerView.removeOnLayoutChangeListener(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0027, code lost:
    
        if (r6 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0031, code lost:
    
        if (f() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0035, code lost:
    
        if (r6 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003e, code lost:
    
        if (f() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, o oVar, qrf qrfVar) {
        char c;
        if (getChildCount() == 0) {
            return null;
        }
        int i2 = this.b.b;
        if (i != 1) {
            if (i != 2) {
                if (i == 17) {
                    if (i2 == 0) {
                    }
                    c = 0;
                } else if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                        }
                        c = 0;
                    } else {
                        if (i2 == 0) {
                        }
                        c = 0;
                    }
                }
                if (c == 0) {
                    return null;
                }
                if (c == 65535) {
                    if (getPosition(view) == 0) {
                        return null;
                    }
                    int position = getPosition(getChildAt(0)) - 1;
                    if (position < 0 || position >= getItemCount()) {
                        return getChildAt(f() ? getChildCount() - 1 : 0);
                    }
                    this.b.m();
                    throw null;
                }
                if (getPosition(view) == getItemCount() - 1) {
                    return null;
                }
                int position2 = getPosition(getChildAt(getChildCount() - 1)) + 1;
                if (position2 < 0 || position2 >= getItemCount()) {
                    return getChildAt(f() ? 0 : getChildCount() - 1);
                }
                this.b.m();
                throw null;
            }
            c = 1;
            if (c == 0) {
            }
        }
        c = 65535;
        if (c == 0) {
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsChanged(RecyclerView recyclerView) {
        super.onItemsChanged(recyclerView);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        getItemCount();
    }

    @Override // androidx.recyclerview.widget.n
    public final void onLayoutChildren(o oVar, qrf qrfVar) {
        if (qrfVar.b() > 0) {
            if ((e() ? getWidth() : getHeight()) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f();
                measureChildWithMargins(oVar.d(0), 0, 0);
                throw null;
            }
        }
        removeAndRecycleAllViews(oVar);
    }

    @Override // androidx.recyclerview.widget.n
    public final void onLayoutCompleted(qrf qrfVar) {
        if (getChildCount() == 0) {
            return;
        }
        getPosition(getChildAt(0));
    }

    @Override // androidx.recyclerview.widget.n
    public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.n
    public final int scrollHorizontallyBy(int i, o oVar, qrf qrfVar) {
        if (!e() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(oVar.d(0), 0, 0);
        throw null;
    }

    @Override // androidx.recyclerview.widget.n
    public final int scrollVerticallyBy(int i, o oVar, qrf qrfVar) {
        if (!canScrollVertically() || getChildCount() == 0 || i == 0) {
            return 0;
        }
        measureChildWithMargins(oVar.d(0), 0, 0);
        throw null;
    }

    public final void setOrientation(int i) {
        ol2 ol2Var;
        if (i != 0 && i != 1) {
            a70.p(ljg.j(i, "invalid orientation:"));
            return;
        }
        assertNotInLayoutOrScroll(null);
        ffb ffbVar = this.b;
        if (ffbVar == null || i != ffbVar.b) {
            if (i == 0) {
                ol2Var = new ol2(this, 1);
            } else {
                if (i != 1) {
                    a70.p("invalid orientation");
                    return;
                }
                ol2Var = new ol2(this, 0);
            }
            this.b = ol2Var;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.n
    public final void smoothScrollToPosition(RecyclerView recyclerView, qrf qrfVar, int i) {
        nl2 nl2Var = new nl2(this, recyclerView.getContext());
        nl2Var.setTargetPosition(i);
        startSmoothScroll(nl2Var);
    }

    @Override // androidx.recyclerview.widget.n
    public final void scrollToPosition(int i) {
    }

    public CarouselLayoutManager() {
        qh0 qh0Var = new qh0(5);
        new k65();
        this.c = new r8(this, 1);
        this.a = qh0Var;
        requestLayout();
        setOrientation(0);
    }
}
