package com.vk.core.tips;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.an10;
import xsna.b990;
import xsna.czo0;
import xsna.dgn;
import xsna.dzo0;
import xsna.f4p0;
import xsna.iah0;
import xsna.izs;
import xsna.m84;
import xsna.q1i0;
import xsna.qe9;
import xsna.tu80;

/* compiled from: TipAnchorView.kt */
/* loaded from: classes17.dex */
public final class TipAnchorView extends FrameLayout {
    public static final /* synthetic */ int m = 0;
    public f4p0 b;
    public int c;
    public q1i0 d;
    public float e;
    public int f;
    public final int g;
    public boolean h;
    public Tooltip.f i;
    public izs<? super Integer, ? extends Object> j;
    public final Handler k;
    public boolean l;

    public TipAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 80;
        this.f = 1000000;
        this.g = 1000000;
        this.k = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        q1i0 q1i0Var;
        int i7;
        int i8;
        int i9 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        f4p0 f4p0Var = this.b;
        if (f4p0Var == null) {
            f4p0Var = null;
        }
        RectF rectF = (RectF) f4p0Var.invoke();
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i10 = this.c;
        if (i10 == 3) {
            int b = an10.b(rectF.left) - measuredWidth;
            i5 = b < 0 ? 0 : b;
        } else if (i10 != 5) {
            i5 = ((int) rectF.centerX()) - (measuredWidth / 2);
            if (i5 + measuredWidth > i3 - getPaddingRight()) {
                i5 = (i3 - measuredWidth) - getPaddingRight();
            } else if (i5 < getPaddingLeft() + i) {
                i5 = getPaddingLeft() + i;
            }
        } else {
            i5 = an10.b(rectF.right);
        }
        int i11 = this.c;
        if (i11 == 3 || i11 == 5) {
            int measuredHeight2 = childAt.getMeasuredHeight();
            int b2 = an10.b(rectF.centerY() - (measuredHeight2 / 2.0f));
            if (b2 + measuredHeight2 > getBottom() - getPaddingBottom()) {
                b2 = (getBottom() - getPaddingBottom()) - measuredHeight2;
            } else {
                if (b2 < getPaddingTop() + getTop()) {
                    b2 = getPaddingTop() + getTop();
                }
            }
            int i12 = measuredHeight2 / 2;
            int i13 = b2 + i12;
            if (i13 + i12 > getMeasuredHeight()) {
                i6 = getMeasuredHeight() - i13;
            } else {
                if (i13 - i12 < 0) {
                    i6 = -i13;
                }
                q1i0 q1i0Var2 = this.d;
                q1i0Var = q1i0Var2 != null ? q1i0Var2 : null;
                i7 = -i9;
                if (q1i0Var.d != i7) {
                    q1i0Var.d = i7;
                    q1i0Var.onBoundsChange(q1i0Var.getBounds());
                    q1i0Var.invalidateSelf();
                }
                i8 = b2;
            }
            i9 = i6 + i12;
            q1i0 q1i0Var22 = this.d;
            if (q1i0Var22 != null) {
            }
            i7 = -i9;
            if (q1i0Var.d != i7) {
            }
            i8 = b2;
        } else {
            i8 = i11 != 48 ? (int) rectF.bottom : Math.max(((int) rectF.top) - measuredHeight, 0);
        }
        int i14 = measuredWidth + i5;
        int i15 = measuredHeight + i8;
        Tooltip.f fVar = this.i;
        if (fVar == null || !fVar.t || !this.l) {
            childAt.layout(i5, i8, i14, i15);
        }
        View findViewById = findViewById(R.id.outside_container);
        if (findViewById == null) {
            return;
        }
        int i16 = this.c;
        if (i16 == 3 || i16 == 5 || i16 == 48) {
            i15 = i8 - findViewById.getMeasuredHeight();
        }
        dgn.b(findViewById, i15, i5, i15, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x003b, code lost:
    
        if (r4 > r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x003d, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0047, code lost:
    
        if (r4 > r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012c, code lost:
    
        if (xsna.an10.b(r2.top) >= 0) goto L81;
     */
    @Override // android.widget.FrameLayout, android.view.View
    @SuppressLint({"RtlHardcoded"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int b;
        int i3;
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        f4p0 f4p0Var = this.b;
        if (f4p0Var == null) {
            f4p0Var = null;
        }
        RectF rectF = (RectF) f4p0Var.invoke();
        int i5 = this.c;
        if (i5 == 3) {
            b = an10.b(rectF.left);
            i3 = this.f;
        } else if (i5 != 5) {
            b = Math.min((int) (size * this.e), this.f);
        } else {
            b = size - an10.b(rectF.right);
            i3 = this.f;
        }
        int i6 = this.c;
        int min = (i6 == 3 || i6 == 5) ? Math.min((int) (size2 * this.e), this.g) : i6 != 48 ? Float.isNaN(rectF.bottom) ? 0 : size2 - an10.b(rectF.bottom) : an10.b(rectF.top);
        Tooltip.f fVar = this.i;
        Integer num = fVar != null ? fVar.f : null;
        if (num != null) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(num.intValue(), this.f), 1073741824);
        } else {
            int i7 = this.c;
            if (i7 == 3 || i7 == 5) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(b, Integer.MIN_VALUE);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((b - getPaddingLeft()) - getPaddingRight(), this.h ? 1073741824 : Integer.MIN_VALUE);
            }
        }
        int i8 = this.c;
        if (i8 == 3 || i8 == 5) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((min - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE);
        } else {
            Tooltip.f fVar2 = this.i;
            makeMeasureSpec2 = (fVar2 == null || !fVar2.s) ? View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        childAt.measure(makeMeasureSpec, makeMeasureSpec2);
        View findViewById = findViewById(R.id.outside_container);
        if (findViewById != null) {
            findViewById.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE));
        }
        setMeasuredDimension(size, size2);
        Tooltip.f fVar3 = this.i;
        if (fVar3 != null && fVar3.t) {
            if (an10.b(rectF.height()) != 0) {
                float f = rectF.bottom;
                if (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f <= size2) {
                    float f2 = rectF.right;
                    if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (f2 <= size) {
                            if (an10.b(rectF.left) >= 0) {
                            }
                        }
                    }
                }
            }
            this.l = true;
            izs<? super Integer, ? extends Object> izsVar = this.j;
            if (izsVar != null) {
                izsVar.invoke(6);
                return;
            }
            return;
        }
        Tooltip.f fVar4 = this.i;
        if (fVar4 != null && fVar4.s) {
            int i9 = this.c;
            if (i9 != 48) {
                if (i9 == 80 && rectF.left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF.right > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f3 = rectF.bottom;
                    if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (childAt.getMeasuredHeight() + an10.b(f3) > size2 && an10.b(rectF.top) - childAt.getMeasuredHeight() > 0) {
                            this.c = 48;
                            q1i0 q1i0Var = this.d;
                            if (q1i0Var == null) {
                                q1i0Var = null;
                            }
                            q1i0Var.b(80);
                        }
                    }
                }
            } else if (rectF.left > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF.top > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && rectF.right > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f4 = rectF.bottom;
                if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (childAt.getMeasuredHeight() + an10.b(f4) < size2 && an10.b(rectF.top) - childAt.getMeasuredHeight() < 0) {
                        this.c = 80;
                        q1i0 q1i0Var2 = this.d;
                        if (q1i0Var2 == null) {
                            q1i0Var2 = null;
                        }
                        q1i0Var2.b(48);
                    }
                }
            }
        }
        int i10 = this.c;
        if (i10 == 48 || i10 == 80) {
            if ((childAt.getMeasuredWidth() / 2) + ((int) rectF.centerX()) > getMeasuredWidth()) {
                i4 = (getMeasuredWidth() - ((int) rectF.centerX())) - (childAt.getMeasuredWidth() / 2);
            } else if (((int) rectF.centerX()) - (childAt.getMeasuredWidth() / 2) < 0) {
                i4 = (childAt.getMeasuredWidth() / 2) + (-((int) rectF.centerX()));
            }
            q1i0 q1i0Var3 = this.d;
            (q1i0Var3 != null ? q1i0Var3 : null).c(-i4);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        WeakReference<View> weakReference;
        View view;
        super.onSizeChanged(i, i2, i3, i4);
        Tooltip.f fVar = this.i;
        if (fVar == null || (weakReference = fVar.v) == null || (view = weakReference.get()) == null) {
            return;
        }
        b990 b990Var = new b990(this, 21);
        Handler handler = this.k;
        handler.removeCallbacksAndMessages(null);
        view.addOnAttachStateChangeListener(new dzo0(view, new tu80(handler, 29)));
        if (view.isAttachedToWindow()) {
            handler.postDelayed(new qe9(7, handler, b990Var), 100L);
        } else {
            view.addOnAttachStateChangeListener(new czo0(view, new m84(17, handler, b990Var)));
        }
    }

    public final void setDismissListener(izs<? super Integer, ? extends Object> izsVar) {
        this.j = izsVar;
    }

    public final void setTipScale(float f) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        f4p0 f4p0Var = this.b;
        if (f4p0Var == null) {
            f4p0Var = null;
        }
        RectF rectF = (RectF) f4p0Var.invoke();
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float right = (childAt.getRight() + childAt.getLeft()) / 2.0f;
        float bottom = (childAt.getBottom() + childAt.getTop()) / 2.0f;
        float f2 = (((right - centerX) * f) + centerX) - right;
        float f3 = (((bottom - centerY) * f) + centerY) - bottom;
        if (this.c == 48) {
            f3 += iah0.a(8);
        }
        childAt.setTranslationX(f2);
        childAt.setTranslationY(f3);
        childAt.setScaleX(f);
        childAt.setScaleY(f);
        childAt.invalidate();
    }
}
