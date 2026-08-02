package com.vk.libvideo.design.view.duration;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.R$styleable;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import xsna.bpn0;
import xsna.d3m;
import xsna.epx;
import xsna.esj0;
import xsna.ful0;
import xsna.iah0;
import xsna.sk7;
import xsna.wz4;

/* compiled from: DurationView.kt */
/* loaded from: classes2.dex */
public final class DurationView extends LinearLayout {
    public static final int r = iah0.a(18);
    public final bpn0 b;
    public final TextPaint c;
    public FrameLayout d;
    public CharSequence e;
    public boolean f;
    public float g;
    public ImageView h;
    public ImageView i;
    public boolean j;
    public boolean k;
    public boolean l;
    public ValueAnimator m;
    public boolean n;
    public FontFamily o;
    public float p;
    public boolean q;

    public DurationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static void a(int i, int i2, DurationView durationView, ValueAnimator valueAnimator) {
        durationView.setIconWrapWidth(i + ((int) (i2 * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.b.getValue();
    }

    private final void setIconWrapWidth(int i) {
        FrameLayout frameLayout = this.d;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        FrameLayout frameLayout2 = this.d;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams);
        }
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.n = true;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, iah0.a(14));
        layoutParams.gravity = 17;
        FrameLayout frameLayout = new FrameLayout(getContext());
        float f = 12;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams2.gravity = 8388629;
        float f2 = 4;
        layoutParams2.setMarginEnd(iah0.a(f2));
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setContentDescription(null);
        imageView.setImageDrawable(new esj0(imageView.getContext()));
        imageView.setSelected(true);
        this.h = imageView;
        frameLayout.addView(imageView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f));
        layoutParams3.gravity = 8388629;
        layoutParams3.setMarginEnd(iah0.a(f2));
        ImageView imageView2 = new ImageView(frameLayout.getContext());
        imageView2.setContentDescription(null);
        wz4 wz4Var = new wz4(imageView2.getContext());
        wz4Var.b.setColor(-1);
        wz4Var.l.set(new Rect(0, iah0.a(1), iah0.a(10), iah0.a(11)));
        imageView2.setImageDrawable(wz4Var);
        this.i = imageView2;
        frameLayout.addView(imageView2, layoutParams3);
        this.d = frameLayout;
        addView(frameLayout, layoutParams);
        if (!this.q) {
            GradientDrawable a = ful0.a(0);
            a.setCornerRadius(iah0.b(4.0f));
            a.setColor(getContext().getColor(R.color.vk_black_alpha35));
            setBackground(a);
            float f3 = 6;
            setPadding(Math.max(iah0.a(f3), getPaddingLeft()), iah0.a(2), Math.max(iah0.a(f3), getPaddingRight()), 0);
        }
        b.j(this.c, getContext(), this.o, Float.valueOf(this.p), 8);
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if ((r0 != null ? r0.getWidth() : 0) > 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        if (this.n) {
            ValueAnimator valueAnimator = this.m;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.cancel();
                this.m = null;
            }
            d3m.b(this.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            d3m.b(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            ImageView imageView = this.i;
            if (imageView != null) {
                imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                imageView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            if (!this.l) {
                FrameLayout frameLayout = this.d;
            }
            this.l = false;
            d3m.b(this.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            setIconWrapWidth(0);
            FrameLayout frameLayout2 = this.d;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
            this.j = false;
            this.k = false;
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        super.draw(canvas);
        boolean isEmpty = TextUtils.isEmpty(this.e);
        if (isEmpty) {
            canvas2 = canvas;
        } else {
            int width = (getWidth() - getPaddingRight()) - ((int) this.g);
            int height = getHeight() / 2;
            TextPaint textPaint = this.c;
            int ascent = height - (((int) (textPaint.ascent() + textPaint.descent())) / 2);
            CharSequence charSequence = this.e;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), width, ascent, textPaint);
        }
        if (this.f) {
            int save = canvas2.save();
            try {
                canvas2.translate(isEmpty ? getPaddingRight() : getPaddingRight() - iah0.a(1), getPaddingTop() + iah0.a(1));
                Drawable arrowDrawable = getArrowDrawable();
                if (arrowDrawable != null) {
                    arrowDrawable.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            } catch (Throwable th) {
                canvas2.restoreToCount(save);
                throw th;
            }
        }
    }

    public final ValueAnimator getAnimationResize() {
        return this.m;
    }

    public final boolean getStateShowIconWrap() {
        return this.l;
    }

    public final boolean getStateShowPlay() {
        return this.k;
    }

    public final boolean getStateShowProgress() {
        return this.j;
    }

    public final CharSequence getText() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Rect bounds;
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.d;
        int measuredWidth = (frameLayout2 == null || frameLayout2.getVisibility() != 0 || (frameLayout = this.d) == null) ? 0 : frameLayout.getMeasuredWidth();
        int i3 = (int) this.g;
        Drawable arrowDrawable = getArrowDrawable();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getPaddingRight() + getPaddingLeft() + measuredWidth + i3 + (this.f ? iah0.a(2) + ((arrowDrawable == null || (bounds = arrowDrawable.getBounds()) == null) ? 0 : bounds.width()) : 0), 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + r, 1073741824));
    }

    public final void setAnimationResize(ValueAnimator valueAnimator) {
        this.m = valueAnimator;
    }

    public final void setPlayIconVisibility(boolean z) {
        if (this.f != z) {
            this.f = z;
            b();
            requestLayout();
        }
    }

    public final void setSimpleView(boolean z) {
        FontFamily fontFamily = FontFamily.REGULAR;
        this.q = z;
        this.o = fontFamily;
        this.p = 11.0f;
    }

    public final void setStateShowIconWrap(boolean z) {
        this.l = z;
    }

    public final void setStateShowPlay(boolean z) {
        this.k = z;
    }

    public final void setStateShowProgress(boolean z) {
        this.j = z;
    }

    public final void setText(CharSequence charSequence) {
        try {
            Trace.beginSection("DurationView.setText");
            b();
            CharSequence charSequence2 = this.e;
            this.e = charSequence;
            float f = this.g;
            float measureText = this.c.measureText(charSequence, 0, charSequence.length());
            this.g = measureText;
            if (Math.abs(measureText - f) > iah0.a(1)) {
                requestLayout();
            } else if (!epx.f(charSequence2, this.e)) {
                invalidate();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 0) {
            b();
        }
        super.setVisibility(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DurationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.b = new bpn0(new sk7(context, 1));
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(-1);
        this.c = textPaint;
        this.e = "";
        FontFamily fontFamily = FontFamily.REGULAR;
        this.o = fontFamily;
        this.p = 12.0f;
        setOrientation(0);
        setGravity(16);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        this.o = obtainStyledAttributes.getInt(0, 1) != 0 ? FontFamily.MEDIUM : fontFamily;
        this.p = obtainStyledAttributes.getFloat(1, 12.0f);
        obtainStyledAttributes.recycle();
    }
}
