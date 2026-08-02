package com.vk.feed.design.view.newsfeed.list;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import xsna.ati;
import xsna.epx;
import xsna.eui;
import xsna.u3r;
import xsna.usi;
import xsna.wwr;

/* compiled from: FeedRecyclerView.kt */
/* loaded from: classes18.dex */
public final class FeedRecyclerView extends RecyclerView {
    public View.OnTouchListener b;
    public View.OnTouchListener c;
    public final eui d;
    public final ati e;
    public final usi f;
    public int g;
    public u3r h;
    public final PointF i;
    public final wwr j;

    public FeedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.c;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final RecyclerView.e0 findViewHolderForAdapterPosition(int i) {
        try {
            return super.findViewHolderForAdapterPosition(i);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        boolean z = view instanceof EditText;
        wwr wwrVar = this.j;
        if (!z) {
            wwrVar.getClass();
        } else {
            if (wwrVar.a.isInLayout()) {
                return null;
            }
            if (!wwrVar.d) {
                wwrVar.d = true;
                wwrVar.b = 0;
                wwrVar.c = 0;
            }
        }
        try {
            return super.focusSearch(view, i);
        } finally {
            if (wwrVar.d) {
                int i2 = wwrVar.b;
                if (i2 != 0 || wwrVar.c != 0) {
                    wwrVar.a.scrollBy(-i2, -wwrVar.c);
                }
                wwrVar.d = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final RecyclerView.e0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent.equals(this)) {
            return super.getChildViewHolder(view);
        }
        return null;
    }

    public final PointF getLastTouchPoint() {
        return this.i;
    }

    public final int getTotalScrollDy() {
        return this.g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f.detach();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        u3r u3rVar = this.h;
        return u3rVar != null && u3rVar.a(this, motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            this.i.set(motionEvent.getX(), motionEvent.getY());
        }
        View.OnTouchListener onTouchListener = this.c;
        if (epx.f(onTouchListener != null ? Boolean.valueOf(onTouchListener.onTouch(this, motionEvent)) : null, Boolean.TRUE)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void onScrolled(int i, int i2) {
        super.onScrolled(i, i2);
        wwr wwrVar = this.j;
        if (!wwrVar.d) {
            this.g += i2;
        } else {
            wwrVar.b += i;
            wwrVar.c += i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.d.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.b;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            Log.e("FeedRecyclerView", e.toString());
            return false;
        }
    }

    public final void setDisclaimerTouchHelper(u3r u3rVar) {
        this.h = u3rVar;
    }

    public final void setDisplayItemsRippleEffectTouchListener(View.OnTouchListener onTouchListener) {
        this.b = onTouchListener;
    }

    public final void setOverlayComponentTouchListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        if (this.j.d) {
            scrollBy(i, i2);
        } else {
            super.smoothScrollBy(i, i2, interpolator);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.e.c(drawable);
    }

    public FeedRecyclerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.d = new eui();
        this.e = new ati();
        this.f = new usi();
        this.i = new PointF();
        this.j = new wwr(this);
    }
}
