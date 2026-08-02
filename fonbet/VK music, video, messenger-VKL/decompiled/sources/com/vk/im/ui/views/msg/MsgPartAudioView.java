package com.vk.im.ui.views.msg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.typography.a;
import com.vk.ui.R$styleable;
import java.lang.reflect.Field;
import me.zhanghai.android.materialprogressbar.IndeterminateHorizontalProgressDrawable;
import xsna.bq00;
import xsna.bwt0;
import xsna.dgn;
import xsna.gz80;
import xsna.hux0;
import xsna.iah0;
import xsna.l8g;
import xsna.rf2;
import xsna.s3q0;

/* compiled from: MsgPartAudioView.kt */
/* loaded from: classes2.dex */
public final class MsgPartAudioView extends ViewGroup implements hux0 {
    public static final /* synthetic */ int z = 0;
    public final AppCompatImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final AppCompatSeekBar f;
    public TimeAndStatusView g;
    public int h;
    public int i;
    public Drawable j;
    public String k;
    public Drawable l;
    public String m;
    public ForegroundColorSpan n;
    public AbsoluteSizeSpan o;
    public TypefaceSpan p;
    public ForegroundColorSpan q;
    public AbsoluteSizeSpan r;
    public TypefaceSpan s;
    public final int t;
    public final int u;
    public final SpannableStringBuilder v;
    public Drawable w;
    public int x;
    public boolean y;

    /* compiled from: MsgPartAudioView.kt */
    public interface a {
    }

    public MsgPartAudioView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static void b(int i, int i2, View view) {
        if (!bwt0.K(view)) {
            view = null;
        }
        if (view != null) {
            dgn.b(view, i2, i, i2, view.getMeasuredWidth() + i);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void a() {
        Drawable drawable;
        String str;
        if (this.y) {
            drawable = this.l;
            str = this.m;
        } else {
            drawable = this.j;
            str = this.k;
        }
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        AppCompatImageView appCompatImageView2 = this.b;
        (appCompatImageView2 != null ? appCompatImageView2 : null).setContentDescription(str);
    }

    public final void c(CharacterStyle characterStyle, CharacterStyle characterStyle2) {
        SpannableStringBuilder spannableStringBuilder = this.v;
        int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
        int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
        spannableStringBuilder.removeSpan(characterStyle);
        spannableStringBuilder.setSpan(characterStyle2, spanStart, spanEnd, 0);
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(spannableStringBuilder);
        TextView textView2 = this.e;
        (textView2 == null ? null : textView2).setSelected(bwt0.K(textView2 != null ? textView2 : null));
    }

    public final String getIconPauseContentDescription() {
        return this.m;
    }

    public final String getIconPlayContentDescription() {
        return this.k;
    }

    @Override // xsna.hux0
    public TimeAndStatusView getTimeAndStatusView() {
        TimeAndStatusView timeAndStatusView = this.g;
        if (timeAndStatusView != null) {
            return timeAndStatusView;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.layout(paddingLeft, paddingTop, appCompatImageView.getMeasuredWidth() + paddingLeft, appCompatImageView.getMeasuredHeight() + paddingTop);
        AppCompatImageView appCompatImageView2 = this.b;
        if (appCompatImageView2 == null) {
            appCompatImageView2 = null;
        }
        int right = appCompatImageView2.getRight() + this.t;
        int i5 = this.x + paddingTop;
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        b(right, paddingTop, textView);
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        b(right, i5, textView2);
        TextView textView3 = this.e;
        if (textView3 == null) {
            textView3 = null;
        }
        b(right, paddingTop, textView3);
        AppCompatSeekBar appCompatSeekBar = this.f;
        if (appCompatSeekBar == null) {
            appCompatSeekBar = null;
        }
        b(right, i5, appCompatSeekBar);
        b(measuredWidth - getTimeAndStatusView().getMeasuredWidth(), measuredHeight - getTimeAndStatusView().getMeasuredHeight(), getTimeAndStatusView());
        AppCompatSeekBar appCompatSeekBar2 = this.f;
        if (appCompatSeekBar2 == null) {
            appCompatSeekBar2 = null;
        }
        if (appCompatSeekBar2.getVisibility() != 8) {
            Drawable drawable = this.w;
            if (drawable == null) {
                drawable = null;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            AppCompatSeekBar appCompatSeekBar3 = this.f;
            if (appCompatSeekBar3 == null) {
                appCompatSeekBar3 = null;
            }
            float f = 4;
            int a2 = iah0.a(f) + i5;
            AppCompatSeekBar appCompatSeekBar4 = this.f;
            appCompatSeekBar3.layout(right, a2, (appCompatSeekBar4 != null ? appCompatSeekBar4 : null).getMeasuredWidth() + right, iah0.a(f) + iah0.a(f) + i5 + intrinsicHeight);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.measure(makeMeasureSpec, makeMeasureSpec2);
        if (getTimeAndStatusView().getVisibility() != 8) {
            getTimeAndStatusView().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            i3 = getTimeAndStatusView().getMeasuredWidth() + this.u;
        } else {
            i3 = 0;
        }
        int i4 = size - paddingRight;
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((i4 - this.h) - this.t, 1073741824);
        int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(((i4 - this.h) - this.t) - i3, 1073741824);
        int makeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.measure(makeMeasureSpec3, makeMeasureSpec4);
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.measure(makeMeasureSpec5, makeMeasureSpec6);
        TextView textView3 = this.e;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.measure(makeMeasureSpec3, makeMeasureSpec4);
        AppCompatSeekBar appCompatSeekBar = this.f;
        if (appCompatSeekBar == null) {
            appCompatSeekBar = null;
        }
        appCompatSeekBar.measure(makeMeasureSpec5, makeMeasureSpec6);
        TextView textView4 = this.c;
        if (textView4 == null) {
            textView4 = null;
        }
        int measuredHeight = textView4.getMeasuredHeight();
        TextView textView5 = this.e;
        if (textView5 == null) {
            textView5 = null;
        }
        this.x = Math.max(measuredHeight, textView5.getMeasuredHeight());
        TextView textView6 = this.d;
        if (textView6 == null) {
            textView6 = null;
        }
        int measuredHeight2 = textView6.getMeasuredHeight();
        AppCompatSeekBar appCompatSeekBar2 = this.f;
        setMeasuredDimension(paddingRight + size, Math.max(this.i, this.x + Math.max(measuredHeight2, (appCompatSeekBar2 != null ? appCompatSeekBar2 : null).getMeasuredHeight())) + paddingBottom);
    }

    public final void setArtistFontFamily(String str) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTypeface(a.C1933a.c(getContext(), str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24).a);
        TypefaceSpan typefaceSpan = new TypefaceSpan(str);
        CharacterStyle characterStyle = this.p;
        if (characterStyle != null) {
            c(characterStyle, typefaceSpan);
        }
        this.p = typefaceSpan;
    }

    public final void setArtistTextColor(int i) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        CharacterStyle characterStyle = this.n;
        if (characterStyle != null) {
            c(characterStyle, foregroundColorSpan);
        }
        this.n = foregroundColorSpan;
    }

    public final void setArtistTextSize(int i) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setTextSize(0, i);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(i, false);
        CharacterStyle characterStyle = this.o;
        if (characterStyle != null) {
            c(characterStyle, absoluteSizeSpan);
        }
        this.o = absoluteSizeSpan;
    }

    public final void setIconHeight(int i) {
        this.i = i;
        requestLayout();
        invalidate();
    }

    public final void setIconPauseContentDescription(String str) {
        this.m = str;
        a();
    }

    public final void setIconPauseSrc(Drawable drawable) {
        this.l = drawable;
        a();
    }

    public final void setIconPlayContentDescription(String str) {
        this.k = str;
        a();
    }

    public final void setIconPlaySrc(Drawable drawable) {
        this.j = drawable;
        a();
    }

    public final void setIconTint(int i) {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setIconWidth(int i) {
        this.h = i;
        requestLayout();
        invalidate();
    }

    public final void setPlaying(boolean z2) {
        this.y = z2;
        a();
        TextView textView = this.e;
        (textView == null ? null : textView).setSelected(bwt0.K(textView != null ? textView : null));
    }

    public final void setProgressBarTint(int i) {
        AppCompatSeekBar appCompatSeekBar = this.f;
        if (appCompatSeekBar == null) {
            appCompatSeekBar = null;
        }
        appCompatSeekBar.setProgressTintList(ColorStateList.valueOf(i));
        AppCompatSeekBar appCompatSeekBar2 = this.f;
        if (appCompatSeekBar2 == null) {
            appCompatSeekBar2 = null;
        }
        appCompatSeekBar2.setIndeterminateTintList(ColorStateList.valueOf(i));
        AppCompatSeekBar appCompatSeekBar3 = this.f;
        if (appCompatSeekBar3 == null) {
            appCompatSeekBar3 = null;
        }
        appCompatSeekBar3.setBackgroundTintList(ColorStateList.valueOf(i));
        int g = l8g.g(i, ((i >> 24) & 255) / 2);
        AppCompatSeekBar appCompatSeekBar4 = this.f;
        if (appCompatSeekBar4 == null) {
            appCompatSeekBar4 = null;
        }
        appCompatSeekBar4.setProgressBackgroundTintList(ColorStateList.valueOf(g));
        AppCompatSeekBar appCompatSeekBar5 = this.f;
        (appCompatSeekBar5 != null ? appCompatSeekBar5 : null).setSecondaryProgressTintList(ColorStateList.valueOf(g));
    }

    public final void setSeekBarProgressDrawable(Drawable drawable) {
        AppCompatSeekBar appCompatSeekBar = this.f;
        if (appCompatSeekBar == null) {
            appCompatSeekBar = null;
        }
        appCompatSeekBar.setProgressDrawable(drawable);
    }

    public final void setSeekBarProgressThumb(Drawable drawable) {
        this.w = drawable;
        AppCompatSeekBar appCompatSeekBar = this.f;
        if (appCompatSeekBar == null) {
            appCompatSeekBar = null;
        }
        if (appCompatSeekBar.isIndeterminate()) {
            return;
        }
        AppCompatSeekBar appCompatSeekBar2 = this.f;
        if (appCompatSeekBar2 == null) {
            appCompatSeekBar2 = null;
        }
        Drawable drawable2 = this.w;
        if (drawable2 == null) {
            drawable2 = null;
        }
        appCompatSeekBar2.setThumb(drawable2);
        AppCompatSeekBar appCompatSeekBar3 = this.f;
        (appCompatSeekBar3 != null ? appCompatSeekBar3 : null).setThumbOffset(iah0.a(6));
    }

    public final void setShowSeekBar(boolean z2) {
        if (z2) {
            TextView textView = this.c;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView2 = this.d;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.e;
            if (textView3 == null) {
                textView3 = null;
            }
            textView3.setVisibility(0);
            AppCompatSeekBar appCompatSeekBar = this.f;
            if (appCompatSeekBar == null) {
                appCompatSeekBar = null;
            }
            appCompatSeekBar.setVisibility(0);
        } else {
            TextView textView4 = this.c;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setVisibility(0);
            TextView textView5 = this.d;
            if (textView5 == null) {
                textView5 = null;
            }
            textView5.setVisibility(0);
            TextView textView6 = this.e;
            if (textView6 == null) {
                textView6 = null;
            }
            textView6.setVisibility(8);
            AppCompatSeekBar appCompatSeekBar2 = this.f;
            if (appCompatSeekBar2 == null) {
                appCompatSeekBar2 = null;
            }
            appCompatSeekBar2.setVisibility(8);
        }
        TextView textView7 = this.e;
        (textView7 == null ? null : textView7).setSelected(bwt0.K(textView7 != null ? textView7 : null));
    }

    public final void setThumbTint(int i) {
        AppCompatSeekBar appCompatSeekBar = this.f;
        if (appCompatSeekBar == null) {
            appCompatSeekBar = null;
        }
        appCompatSeekBar.setThumbTintList(ColorStateList.valueOf(i));
    }

    public void setTimeAndStatusView(TimeAndStatusView timeAndStatusView) {
        this.g = timeAndStatusView;
    }

    public final void setTimeTextAppearance(int i) {
        getTimeAndStatusView().setTimeTextAppearance(i);
    }

    public final void setTimeTextColor(int i) {
        getTimeAndStatusView().setTimeTextColor(i);
    }

    public final void setTimeTranslation(int i) {
        getTimeAndStatusView().setTranslationY(i);
    }

    public final void setTrackFontFamily(String str) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTypeface(a.C1933a.c(getContext(), str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24).a);
        TypefaceSpan typefaceSpan = new TypefaceSpan(str);
        CharacterStyle characterStyle = this.s;
        if (characterStyle != null) {
            c(characterStyle, typefaceSpan);
        }
        this.s = typefaceSpan;
    }

    public final void setTrackTextColor(int i) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
        CharacterStyle characterStyle = this.q;
        if (characterStyle != null) {
            c(characterStyle, foregroundColorSpan);
        }
        this.q = foregroundColorSpan;
    }

    public final void setTrackTextSize(int i) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setTextSize(0, i);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(i, false);
        CharacterStyle characterStyle = this.r;
        if (characterStyle != null) {
            c(characterStyle, absoluteSizeSpan);
        }
        this.r = absoluteSizeSpan;
    }

    public MsgPartAudioView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public MsgPartAudioView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ MsgPartAudioView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public MsgPartAudioView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        getResources().getDisplayMetrics();
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        this.b = appCompatImageView;
        addView(appCompatImageView);
        TextView textView = new TextView(getContext());
        this.c = textView;
        textView.setSingleLine(true);
        TextView textView2 = this.c;
        textView2 = textView2 == null ? null : textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        View view = this.c;
        addView(view == null ? null : view);
        TextView textView3 = new TextView(getContext());
        this.d = textView3;
        textView3.setSingleLine(true);
        TextView textView4 = this.d;
        (textView4 == null ? null : textView4).setEllipsize(truncateAt);
        View view2 = this.d;
        addView(view2 == null ? null : view2);
        TextView textView5 = new TextView(getContext());
        this.e = textView5;
        textView5.setSingleLine(true);
        TextView textView6 = this.e;
        (textView6 == null ? null : textView6).setEllipsize(TextUtils.TruncateAt.MARQUEE);
        TextView textView7 = this.e;
        float f = 10;
        (textView7 == null ? null : textView7).setFadingEdgeLength(iah0.a(f));
        TextView textView8 = this.e;
        (textView8 == null ? null : textView8).setHorizontalFadingEdgeEnabled(true);
        View view3 = this.e;
        addView(view3 == null ? null : view3);
        setTimeAndStatusView(new TimeAndStatusView(getContext(), null, 0, 14, 0));
        getTimeAndStatusView().setImportantForAccessibility(2);
        addView(getTimeAndStatusView());
        AppCompatSeekBar appCompatSeekBar = new AppCompatSeekBar(getContext());
        this.f = appCompatSeekBar;
        appCompatSeekBar.setFocusableInTouchMode(false);
        AppCompatSeekBar appCompatSeekBar2 = this.f;
        (appCompatSeekBar2 == null ? null : appCompatSeekBar2).setFocusable(false);
        AppCompatSeekBar appCompatSeekBar3 = this.f;
        (appCompatSeekBar3 == null ? null : appCompatSeekBar3).setBackground(null);
        AppCompatSeekBar appCompatSeekBar4 = this.f;
        (appCompatSeekBar4 == null ? null : appCompatSeekBar4).setMax(1000);
        AppCompatSeekBar appCompatSeekBar5 = this.f;
        (appCompatSeekBar5 == null ? null : appCompatSeekBar5).setLayerType(1, null);
        AppCompatSeekBar appCompatSeekBar6 = this.f;
        float f2 = 6;
        (appCompatSeekBar6 == null ? null : appCompatSeekBar6).setPadding(iah0.a(f2), 0, iah0.a(f2), 0);
        AppCompatSeekBar appCompatSeekBar7 = this.f;
        (appCompatSeekBar7 == null ? null : appCompatSeekBar7).setMinimumHeight(iah0.a(5));
        AppCompatSeekBar appCompatSeekBar8 = this.f;
        (appCompatSeekBar8 == null ? null : appCompatSeekBar8).setVisibility(8);
        AppCompatSeekBar appCompatSeekBar9 = this.f;
        (appCompatSeekBar9 == null ? null : appCompatSeekBar9).setClipToOutline(false);
        if (!gz80.a(29)) {
            try {
                Field declaredField = ProgressBar.class.getDeclaredField("mMaxHeight");
                declaredField.setAccessible(true);
                AppCompatSeekBar appCompatSeekBar10 = this.f;
                float f3 = 4;
                declaredField.set(appCompatSeekBar10 == null ? null : appCompatSeekBar10, Integer.valueOf(iah0.a(f3)));
                Field declaredField2 = ProgressBar.class.getDeclaredField("mMinHeight");
                declaredField2.setAccessible(true);
                AppCompatSeekBar appCompatSeekBar11 = this.f;
                declaredField2.set(appCompatSeekBar11 == null ? null : appCompatSeekBar11, Integer.valueOf(iah0.a(f3)));
                s3q0 s3q0Var = s3q0.a;
            } catch (Exception e) {
                Log.e("MsgPartAudioView", "Cannot set height of seekBarView", e);
            }
        } else {
            AppCompatSeekBar appCompatSeekBar12 = this.f;
            float f4 = 4;
            (appCompatSeekBar12 == null ? null : appCompatSeekBar12).setMaxHeight(iah0.a(f4));
            AppCompatSeekBar appCompatSeekBar13 = this.f;
            (appCompatSeekBar13 == null ? null : appCompatSeekBar13).setMinHeight(iah0.a(f4));
        }
        float f5 = getContext().getResources().getDisplayMetrics().density < 2.0f ? 1.5f : -2.0f;
        rf2 rf2Var = new rf2(new Drawable[]{new IndeterminateHorizontalProgressDrawable(getContext())});
        rf2Var.setLayerInset(0, 0, iah0.a(f5), 0, iah0.a(f5));
        AppCompatSeekBar appCompatSeekBar14 = this.f;
        (appCompatSeekBar14 == null ? null : appCompatSeekBar14).setIndeterminateDrawable(rf2Var);
        View view4 = this.f;
        addView(view4 == null ? null : view4);
        getTimeAndStatusView().setImportantForAccessibility(2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.p, i, i2);
        float f6 = 40;
        int i3 = 9;
        setIconWidth(obtainStyledAttributes.getDimensionPixelSize(9, iah0.a(f6)));
        setIconHeight(obtainStyledAttributes.getDimensionPixelSize(3, iah0.a(f6)));
        setIconPlaySrc(obtainStyledAttributes.getDrawable(6));
        setIconPlayContentDescription(obtainStyledAttributes.getString(7));
        setIconPauseSrc(obtainStyledAttributes.getDrawable(4));
        setIconPauseContentDescription(obtainStyledAttributes.getString(5));
        setIconTint(obtainStyledAttributes.getColor(8, -1));
        setArtistTextColor(obtainStyledAttributes.getColor(1, -16777216));
        float f7 = 12;
        setArtistTextSize(obtainStyledAttributes.getDimensionPixelSize(2, (int) iah0.y(f7)));
        setArtistFontFamily(obtainStyledAttributes.getString(0));
        setTrackTextColor(obtainStyledAttributes.getColor(16, -16777216));
        setTrackTextSize(obtainStyledAttributes.getDimensionPixelSize(17, (int) iah0.y(f7)));
        setTrackFontFamily(obtainStyledAttributes.getString(15));
        setSeekBarProgressThumb(obtainStyledAttributes.getDrawable(11));
        setSeekBarProgressDrawable(obtainStyledAttributes.getDrawable(10));
        setTimeTextAppearance(obtainStyledAttributes.getResourceId(13, 0));
        setTimeTranslation(obtainStyledAttributes.getDimensionPixelSize(14, iah0.a(0)));
        this.t = iah0.a(f);
        this.u = iah0.a(8);
        obtainStyledAttributes.recycle();
        AppCompatImageView appCompatImageView2 = this.b;
        bwt0.i0(appCompatImageView2 == null ? null : appCompatImageView2, new bq00(this, i3));
        AppCompatSeekBar appCompatSeekBar15 = this.f;
        (appCompatSeekBar15 != null ? appCompatSeekBar15 : null).setOnSeekBarChangeListener(new com.vk.im.ui.views.msg.a(this));
        setShowSeekBar(false);
        this.v = new SpannableStringBuilder();
        new b();
    }

    @Override // xsna.hux0
    public final void X3() {
    }

    /* compiled from: MsgPartAudioView.kt */
    public static final class b extends Drawable {
        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicHeight() {
            return 1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicWidth() {
            return 1;
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            return -2;
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public final void setEventListener(a aVar) {
    }
}
