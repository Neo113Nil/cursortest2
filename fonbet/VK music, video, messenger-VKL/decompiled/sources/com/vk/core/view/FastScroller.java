package com.vk.core.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;
import xsna.llq;
import xsna.m33;
import xsna.mlq;

/* loaded from: classes17.dex */
public class FastScroller extends View {
    public int b;
    public int c;
    public Paint d;
    public Drawable e;
    public int f;
    public RecyclerView g;
    public TextView h;
    public boolean i;
    public boolean j;
    public final a k;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            FastScroller fastScroller = FastScroller.this;
            if (fastScroller.j || fastScroller.getHeight() <= 0) {
                return;
            }
            int itemCount = recyclerView.getAdapter().getItemCount();
            int childCount = recyclerView.getChildCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0));
            fastScroller.setPosition(fastScroller.getHeight() * ((childAdapterPosition != 0 ? childCount + childAdapterPosition >= itemCount ? itemCount : childAdapterPosition : 0) / itemCount));
        }
    }

    public interface b {
        CharSequence f(int i);
    }

    public FastScroller(Context context) {
        super(context);
        this.b = -65536;
        this.c = iah0.a(1);
        this.e = null;
        this.f = 0;
        this.k = new a();
        b(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(float f) {
        int height = this.h.getHeight();
        int intrinsicHeight = this.e.getIntrinsicHeight();
        this.f = Math.min(Math.max(0, (int) (f - (intrinsicHeight / 2))), getHeight() - intrinsicHeight);
        this.h.setTranslationY(Math.min(Math.max(0, (int) (f - height)), (getHeight() - height) - r1));
        invalidate();
    }

    private void setRecyclerViewPosition(float f) {
        int itemCount;
        RecyclerView recyclerView = this.g;
        if (recyclerView == null || (itemCount = recyclerView.getAdapter().getItemCount()) == 0) {
            return;
        }
        int i = this.f;
        int min = Math.min(Math.max(0, (int) ((i == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.e.getIntrinsicHeight() + i >= getHeight() + (-5) ? 1.0f : f / getHeight()) * itemCount)), itemCount - 1);
        this.g.scrollToPosition(min);
        this.h.setText(((b) this.g.getAdapter()).f(min));
    }

    public final void b(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.e);
        this.b = obtainStyledAttributes.getColor(1, this.b);
        this.c = obtainStyledAttributes.getDimensionPixelSize(2, this.c);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.e = drawable;
        if (drawable == null) {
            Context context2 = getContext();
            e3m.a aVar = e3m.a;
            this.e = m33.a(R.drawable.fastscroller_section_indicator, context2);
        }
        this.e.setCallback(this);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(5);
        this.d = paint;
        paint.setColor(this.b);
    }

    @Override // android.view.View
    @TargetApi(21)
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.e;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.e.setState(getDrawableState());
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth();
        canvas.drawRect((width - this.c) >> 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, r1 + r2, getHeight(), this.d);
        int intrinsicWidth = this.e.getIntrinsicWidth();
        int intrinsicHeight = this.e.getIntrinsicHeight();
        int i = (width - intrinsicWidth) >> 1;
        int i2 = this.f;
        this.e.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        this.e.draw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            if (this.i) {
                this.i = false;
                this.h.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(new mlq(this)).setDuration(400L).start();
            }
            setPressed(false);
            this.j = false;
            return true;
        }
        if (!this.i) {
            this.i = true;
            this.h.animate().alpha(1.0f).setListener(new llq(this)).setDuration(400L).start();
        }
        setPressed(true);
        this.j = true;
        setPosition(motionEvent.getY() - getTop());
        setRecyclerViewPosition(motionEvent.getY() - getTop());
        return true;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e;
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -65536;
        this.c = iah0.a(1);
        this.e = null;
        this.f = 0;
        this.k = new a();
        b(context, attributeSet);
    }

    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -65536;
        this.c = iah0.a(1);
        this.e = null;
        this.f = 0;
        this.k = new a();
        b(context, attributeSet);
    }

    @TargetApi(21)
    public FastScroller(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = -65536;
        this.c = iah0.a(1);
        this.e = null;
        this.f = 0;
        this.k = new a();
        b(context, attributeSet);
    }
}
