package com.vk.attachpicker.fragment.gallery;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.iah0;
import xsna.izs;
import xsna.j5n;
import xsna.m33;
import xsna.nlq;
import xsna.ot;
import xsna.plq;
import xsna.rlq;
import xsna.rqi;
import xsna.v7;
import xsna.xwk;
import xsna.zv4;

/* compiled from: FastScroller.kt */
/* loaded from: classes15.dex */
public final class FastScroller extends FrameLayout {
    public static final /* synthetic */ int v = 0;
    public final int b;
    public final Paint c;
    public final Drawable d;
    public int e;
    public RecyclerView f;
    public TextView g;
    public boolean h;
    public boolean i;
    public boolean j;
    public a k;
    public final Handler l;
    public int m;
    public int n;
    public final Rect o;
    public boolean p;
    public izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> q;
    public izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> r;
    public izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> s;
    public izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> t;
    public final plq u;

    /* compiled from: FastScroller.kt */
    public interface a {
        String f(int i);
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = iah0.a(1);
        this.c = rqi.b(5, 0);
        this.l = new Handler(Looper.getMainLooper());
        this.o = new Rect();
        this.q = new v7(29);
        this.s = new j5n(3);
        this.t = new ot(22);
        this.u = new plq(this);
        Drawable a2 = m33.a(R.drawable.fastscroller_handle, context);
        if (a2 != null) {
            a2.setCallback(this);
        } else {
            a2 = null;
        }
        this.d = a2;
        setWillNotDraw(false);
    }

    public static void a(FastScroller fastScroller) {
        RecyclerView recyclerView = fastScroller.f;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            fastScroller.e();
            if (!fastScroller.j) {
                fastScroller.setPositionFromScroll(computeVerticalScrollOffset);
            }
            fastScroller.setRecyclerViewPosition(computeVerticalScrollOffset);
        }
    }

    private final void setPosition(float f) {
        Drawable drawable;
        TextView textView = this.g;
        if (textView == null || (drawable = this.d) == null) {
            return;
        }
        int height = textView.getHeight();
        int b = xwk.b((int) (f - (r1 / 2)), 0, getHeight() - drawable.getIntrinsicHeight());
        this.e = b;
        textView.setTranslationY(((r1 - height) / 2.0f) + b);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPositionFromScroll(float f) {
        Drawable drawable;
        TextView textView = this.g;
        if (textView == null || (drawable = this.d) == null) {
            return;
        }
        int height = textView.getHeight();
        int height2 = getHeight() - drawable.getIntrinsicHeight();
        int b = xwk.b((int) ((height2 * (f / (this.m - this.n))) - (r1 / 2)), 0, height2);
        this.e = b;
        textView.setTranslationY(((r1 - height) / 2.0f) + b);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            if (itemCount != 0) {
                int b = xwk.b((int) ((f / (this.m - this.n)) * itemCount), 0, itemCount - 1);
                a aVar = this.k;
                if (aVar == null) {
                    Object adapter2 = recyclerView.getAdapter();
                    aVar = adapter2 instanceof a ? (a) adapter2 : null;
                    if (aVar == null) {
                        return;
                    }
                }
                String f2 = aVar.f(b);
                TextView textView = this.g;
                if (textView != null) {
                    if (TextUtils.isEmpty(f2)) {
                        textView.setVisibility(4);
                        return;
                    }
                    if (this.h || this.i) {
                        textView.setVisibility(0);
                    }
                    this.l.post(new zv4(4, textView, f2));
                }
            }
        }
    }

    public final void d(float f) {
        RecyclerView recyclerView = this.f;
        Drawable drawable = this.d;
        if (drawable == null || recyclerView == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        e();
        int i = this.e;
        if (i == 0) {
            recyclerView.scrollToPosition(0);
        } else {
            recyclerView.scrollToPosition(xwk.b((int) ((drawable.getIntrinsicHeight() + i >= getHeight() ? 1.0f : f / getHeight()) * itemCount), 0, itemCount - 1));
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                gridLayoutManager.z = (adapter != null ? adapter.getItemCount() : 0) < 500;
            }
            this.m = recyclerView.computeVerticalScrollRange();
            int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            this.n = computeVerticalScrollExtent;
            setVisibility(this.m != computeVerticalScrollExtent ? 0 : 8);
        }
    }

    public final izs<ViewPropertyAnimator, ViewPropertyAnimator> getHidePopupAnimator() {
        return this.s;
    }

    public final izs<ViewPropertyAnimator, ViewPropertyAnimator> getHidePopupShortAnimator() {
        return this.t;
    }

    public final izs<ViewPropertyAnimator, ViewPropertyAnimator> getShowPopupAnimator() {
        return this.q;
    }

    public final izs<ViewPropertyAnimator, ViewPropertyAnimator> getShowPopupShortAnimator() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.l.removeCallbacksAndMessages(null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        if (this.p) {
            canvas.drawRect(width - (this.b / 2), 0, r1 + r2, getHeight(), this.c);
            Drawable drawable = this.d;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = width - intrinsicWidth;
                int i2 = this.e;
                drawable.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
                drawable.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
    
        if (r0 != 3) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (isPressed()) {
                        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        setPosition(motionEvent.getY());
                        d(motionEvent.getY());
                        return true;
                    }
                }
            }
            for (ViewParent parent2 = getParent(); parent2 != null; parent2 = parent2.getParent()) {
                parent2.requestDisallowInterceptTouchEvent(false);
            }
            if (this.h) {
                this.h = false;
                this.i = false;
                TextView textView = this.g;
                if (textView != null) {
                    this.s.invoke(textView.animate()).setListener(new nlq(textView, this)).start();
                }
            }
            setPressed(false);
            this.j = false;
            return true;
        }
        TextView textView2 = this.g;
        Rect rect = this.o;
        if (textView2 != null) {
            textView2.getGlobalVisibleRect(rect);
        }
        int i = this.e;
        Drawable drawable = this.d;
        int intrinsicHeight = i + (drawable != null ? drawable.getIntrinsicHeight() : 0);
        TextView textView3 = this.g;
        if (textView3 != null && textView3.getVisibility() == 0 && ((motionEvent.getX() > getWidth() - cn70.b(44) && motionEvent.getY() > this.e && motionEvent.getY() < intrinsicHeight) || rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()))) {
            for (ViewParent parent3 = getParent(); parent3 != null; parent3 = parent3.getParent()) {
                parent3.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.h) {
                this.h = true;
                TextView textView4 = this.g;
                if (textView4 != null) {
                    this.q.invoke(textView4.animate()).setListener(new rlq(textView4, this)).start();
                }
            }
            setPressed(true);
            this.j = true;
            setPosition(motionEvent.getY());
            d(motionEvent.getY());
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setExternalProvider(a aVar) {
        this.k = aVar;
    }

    public final void setHidePopupAnimator(izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> izsVar) {
        this.s = izsVar;
    }

    public final void setHidePopupShortAnimator(izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> izsVar) {
        this.t = izsVar;
    }

    public final void setShowPopupAnimator(izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> izsVar) {
        this.q = izsVar;
    }

    public final void setShowPopupShortAnimator(izs<? super ViewPropertyAnimator, ? extends ViewPropertyAnimator> izsVar) {
        this.r = izsVar;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.d;
    }
}
