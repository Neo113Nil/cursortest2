package com.vk.libvideo.design.view.movika;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.FontFamily;
import com.vk.typography.b;
import com.vkontakte.android.R;
import xsna.awt0;
import xsna.d3m;
import xsna.dhr0;
import xsna.e3m;
import xsna.esj0;
import xsna.f4m;
import xsna.iah0;
import xsna.m33;
import xsna.s3q0;
import xsna.uko;
import xsna.wz4;

/* compiled from: InteractiveDurationView.kt */
/* loaded from: classes2.dex */
public final class InteractiveDurationView extends LinearLayout {
    public final FontFamily b;
    public final float c;
    public Drawable d;
    public FrameLayout e;
    public TextView f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    public ImageView j;
    public boolean k;
    public boolean l;
    public boolean m;

    public InteractiveDurationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final void setIconWrapWidth(int i) {
        FrameLayout frameLayout = this.e;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i;
        }
        FrameLayout frameLayout2 = this.e;
        if (frameLayout2 != null) {
            frameLayout2.setLayoutParams(layoutParams);
        }
    }

    public final void a(boolean z, boolean z2) {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator startDelay;
        ViewPropertyAnimator duration2;
        boolean z3 = this.l;
        boolean z4 = this.k;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z4 != z) {
            this.k = z;
            ImageView imageView = this.i;
            if (imageView != null && (animate2 = imageView.animate()) != null) {
                ViewPropertyAnimator alpha = animate2.alpha(this.k ? 1.0f : 0.0f);
                if (alpha != null && (startDelay = alpha.setStartDelay(50L)) != null && (duration2 = startDelay.setDuration(300L)) != null) {
                    duration2.start();
                }
            }
            ImageView imageView2 = this.i;
            if (imageView2 != null) {
                imageView2.setSelected(this.k);
            }
        }
        if (this.l != z2) {
            this.l = z2;
            ImageView imageView3 = this.h;
            if (imageView3 != null && (animate = imageView3.animate()) != null) {
                if (this.l) {
                    f = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate.alpha(f);
                if (alpha2 != null) {
                    ViewPropertyAnimator startDelay2 = alpha2.setStartDelay(z3 ? 300 : 0);
                    if (startDelay2 != null && (duration = startDelay2.setDuration(300L)) != null) {
                        duration.start();
                    }
                }
            }
            ImageView imageView4 = this.h;
            if (imageView4 != null) {
                imageView4.setSelected(this.l);
            }
        }
        boolean z5 = z || z2;
        TextView textView = this.f;
        if (textView != null) {
            awt0.v(textView, !z5);
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            awt0.v(frameLayout, z5);
        }
        d();
        setIconWrapWidth(z5 ? iah0.a(12) : 0);
    }

    public final TextView b() {
        TextView textView = new TextView(getContext());
        b.k(textView, this.b, Float.valueOf(this.c), 4);
        textView.setMaxLines(1);
        textView.setGravity(16);
        textView.setTextColor(-1);
        return textView;
    }

    public final void c() {
        Drawable drawable;
        if (this.m) {
            return;
        }
        this.m = true;
        float f = 6;
        float f2 = 3;
        setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        dhr0.a.getClass();
        setBackgroundTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_accent_violet, dhr0.s())));
        this.e = new FrameLayout(getContext());
        new FrameLayout(getContext());
        this.f = b();
        this.g = b();
        this.h = new ImageView(getContext());
        this.i = new ImageView(getContext());
        this.j = new ImageView(getContext());
        setOrientation(0);
        setGravity(16);
        Drawable a = m33.a(R.drawable.vk_icon_hand_point_up_12, getContext());
        if (a != null) {
            ColorStateList valueOf = ColorStateList.valueOf(-1);
            uko.a aVar = uko.a;
            drawable = a.mutate();
            drawable.setTintList(valueOf);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            float f3 = 12;
            drawable.setBounds(0, 0, iah0.a(f3), iah0.a(f3));
        }
        this.d = drawable;
        float f4 = 12;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(f4), iah0.a(f4));
        layoutParams.gravity = 8388629;
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setContentDescription(null);
        }
        layoutParams.setMarginEnd(iah0.a(f2));
        ImageView imageView2 = this.j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(this.d);
        }
        addView(this.j, layoutParams);
        TextView textView = this.g;
        if (textView != null) {
            textView.setText(getContext().getText(R.string.video_interactive_badge));
        }
        addView(this.g);
        addView(this.f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, iah0.a(f4));
        layoutParams2.gravity = 16;
        addView(this.e, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(iah0.a(f4), iah0.a(f4));
        layoutParams3.gravity = 16;
        ImageView imageView3 = this.i;
        if (imageView3 != null) {
            imageView3.setContentDescription(null);
        }
        FrameLayout frameLayout = this.e;
        if (frameLayout != null) {
            frameLayout.addView(this.i, layoutParams3);
        }
        esj0 esj0Var = new esj0(getContext());
        ImageView imageView4 = this.i;
        if (imageView4 != null) {
            imageView4.setImageDrawable(esj0Var);
        }
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iah0.a(f4), iah0.a(f4));
        layoutParams4.gravity = 16;
        ImageView imageView5 = this.h;
        if (imageView5 != null) {
            imageView5.setContentDescription(null);
        }
        FrameLayout frameLayout2 = this.e;
        if (frameLayout2 != null) {
            frameLayout2.addView(this.h, layoutParams4);
        }
        wz4 wz4Var = new wz4(getContext());
        wz4Var.b.setColor(-1);
        wz4Var.l.set(new Rect(0, iah0.a(1), iah0.a(10), iah0.a(11)));
        ImageView imageView6 = this.h;
        if (imageView6 != null) {
            imageView6.setImageDrawable(wz4Var);
        }
        e();
    }

    public final void d() {
        TextView textView;
        TextView textView2 = this.g;
        if ((textView2 == null || textView2.getVisibility() != 0) && ((textView = this.f) == null || textView.getVisibility() != 0)) {
            ImageView imageView = this.j;
            if (imageView != null) {
                f4m.r(0, imageView);
            }
            float f = 3;
            setPadding(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(f));
            return;
        }
        ImageView imageView2 = this.j;
        if (imageView2 != null) {
            f4m.r(iah0.a(3), imageView2);
        }
        float f2 = 6;
        float f3 = 3;
        setPadding(iah0.a(f2), iah0.a(f3), iah0.a(f2), iah0.a(f3));
    }

    public final void e() {
        if (this.m) {
            d3m.b(this.h, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            d3m.b(this.i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            ImageView imageView2 = this.i;
            if (imageView2 != null) {
                imageView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            FrameLayout frameLayout = this.e;
            if ((frameLayout != null ? frameLayout.getWidth() : 0) > 0) {
                d3m.b(this.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
                setIconWrapWidth(0);
                FrameLayout frameLayout2 = this.e;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            }
            this.k = false;
            this.l = false;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public final void setDurationText(CharSequence charSequence) {
        Trace.beginSection("InteractiveDurationView.setDurationText");
        try {
            c();
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(charSequence);
            }
            s3q0 s3q0Var = s3q0.a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void setDurationVisible(boolean z) {
        c();
        TextView textView = this.f;
        if (textView != null) {
            awt0.v(textView, z);
        }
        d();
    }

    public final void setTextDescriptionVisible(boolean z) {
        c();
        TextView textView = this.g;
        if (textView != null) {
            awt0.v(textView, z);
        }
        d();
    }

    public InteractiveDurationView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.b = FontFamily.REGULAR;
        this.c = 12.0f;
    }
}
