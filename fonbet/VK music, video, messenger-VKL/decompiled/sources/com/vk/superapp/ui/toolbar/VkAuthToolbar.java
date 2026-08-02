package com.vk.superapp.ui.toolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.R$styleable;
import com.vkontakte.android.R;
import defpackage.j0;
import xsna.epx;
import xsna.f4m;
import xsna.hn2;
import xsna.hnj;
import xsna.izs;
import xsna.s3q0;
import xsna.tkc;
import xsna.v3o;
import xsna.x9;

/* compiled from: VkAuthToolbar.kt */
/* loaded from: classes11.dex */
public final class VkAuthToolbar extends ViewGroup {
    public static final /* synthetic */ int k = 0;
    public int b;
    public final int c;
    public final AppCompatImageButton d;
    public final AppCompatImageButton e;
    public final AppCompatTextView f;
    public final AppCompatImageView g;
    public final Integer h;
    public final Integer i;
    public final Integer j;

    /* compiled from: VkAuthToolbar.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public static final int a(int... iArr) {
            int i = VkAuthToolbar.k;
            if (iArr.length == 0) {
                return 0;
            }
            int i2 = iArr[0];
            for (int i3 : iArr) {
                i2 = Math.max(i2, i3);
            }
            return i2;
        }
    }

    public VkAuthToolbar(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, R.attr.toolbarStyle);
        ViewGroup.LayoutParams layoutParams = null;
        AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
        this.d = appCompatImageButton;
        AppCompatImageButton appCompatImageButton2 = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
        this.e = appCompatImageButton2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setContentDescription(appCompatImageView.getContext().getString(R.string.vk_toolbar_vkid_logo_talkback));
        this.g = appCompatImageView;
        appCompatImageView.setId(R.id.vk_toolbar_picture);
        addView(appCompatImageButton);
        addView(appCompatImageButton2);
        addView(appCompatTextView);
        appCompatTextView.setSingleLine();
        appCompatTextView.setIncludeFontPadding(false);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, R.attr.toolbarStyle, 0);
        try {
            String string = obtainStyledAttributes.getString(3);
            if (string == null) {
                string = "";
            }
            setTitle(string);
            int resourceId = obtainStyledAttributes.getResourceId(4, R.style.VkAuth_ToolbarTitleTextAppearance);
            String string2 = obtainStyledAttributes.getString(1);
            String string3 = obtainStyledAttributes.getString(5);
            this.h = obtainStyledAttributes.hasValue(10) ? Integer.valueOf(obtainStyledAttributes.getColor(10, 0)) : null;
            setPicture(obtainStyledAttributes.getDrawable(9));
            this.i = obtainStyledAttributes.hasValue(8) ? Integer.valueOf(obtainStyledAttributes.getColor(8, 0)) : null;
            this.j = obtainStyledAttributes.hasValue(7) ? Integer.valueOf(obtainStyledAttributes.getColor(7, 0)) : null;
            setNavigationIcon(obtainStyledAttributes.getDrawable(2));
            setActionIcon(obtainStyledAttributes.getDrawable(6));
            float dimension = obtainStyledAttributes.getDimension(11, -1.0f);
            float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
            if (dimension > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && dimension2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                layoutParams = new ViewGroup.LayoutParams((int) dimension2, (int) dimension);
            }
            setTitlePriority(obtainStyledAttributes.getInt(13, 0));
            this.c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
            addView(appCompatImageView, layoutParams == null ? generateDefaultLayoutParams() : layoutParams);
            setTitleTextAppearance(resourceId);
            setNavigationContentDescription(string2);
            setActionContentDescription(string3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        if (view.getVisibility() == 8) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int a2 = j0.a(i3, i, measuredWidth, 2, i);
        int a3 = j0.a(i4, i2, measuredHeight, 2, i2);
        view.layout(a2, a3, measuredWidth + a2, measuredHeight + a3);
    }

    public final void b() {
        Drawable actionIcon = getActionIcon();
        AppCompatImageButton appCompatImageButton = this.e;
        appCompatImageButton.setVisibility((actionIcon == null || !appCompatImageButton.isClickable()) ? 4 : 0);
    }

    public final void c() {
        Drawable navigationIcon = getNavigationIcon();
        AppCompatImageButton appCompatImageButton = this.d;
        appCompatImageButton.setVisibility((navigationIcon == null || !appCompatImageButton.isClickable()) ? 4 : 0);
    }

    public final void d() {
        CharSequence title = getTitle();
        Drawable picture = getPicture();
        if (title.length() == 0 && picture == null) {
            return;
        }
        int i = this.b;
        AppCompatImageView appCompatImageView = this.g;
        AppCompatTextView appCompatTextView = this.f;
        if (i == 2) {
            appCompatTextView.setVisibility(4);
            appCompatImageView.setVisibility(4);
        } else if (i == 0 ? getTitle().length() <= 0 : i == 1 && getPicture() != null) {
            f4m.j(appCompatTextView);
            appCompatImageView.setVisibility(0);
        } else {
            appCompatTextView.setVisibility(0);
            f4m.j(appCompatImageView);
        }
    }

    public final Drawable getActionIcon() {
        return this.e.getDrawable();
    }

    public final Drawable getNavigationIcon() {
        return this.d.getDrawable();
    }

    public final Drawable getPicture() {
        return this.g.getDrawable();
    }

    public final CharSequence getTitle() {
        return this.f.getText();
    }

    public final int getTitlePriority() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        int i3;
        if (!(view instanceof AppCompatImageButton) || (!epx.f(view, this.d) && !epx.f(view, this.e))) {
            super.measureChild(view, i, i2);
            return;
        }
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) view;
        ViewGroup.LayoutParams layoutParams = appCompatImageButton.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), layoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && (i3 = this.c) >= 0) {
            if (mode != 0) {
                i3 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i3);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        appCompatImageButton.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        AppCompatImageButton appCompatImageButton = this.d;
        int measuredWidth = appCompatImageButton.getMeasuredWidth();
        int measuredHeight = appCompatImageButton.getMeasuredHeight();
        int i5 = paddingBottom - paddingTop;
        int b = x9.b(i5, measuredHeight, 2, paddingTop);
        appCompatImageButton.layout(paddingLeft, b, paddingLeft + measuredWidth, measuredHeight + b);
        AppCompatImageButton appCompatImageButton2 = this.e;
        int measuredWidth2 = appCompatImageButton2.getMeasuredWidth();
        int measuredHeight2 = appCompatImageButton2.getMeasuredHeight();
        int b2 = x9.b(i5, measuredHeight2, 2, paddingTop);
        appCompatImageButton2.layout(paddingRight - measuredWidth2, b2, paddingRight, measuredHeight2 + b2);
        AppCompatTextView appCompatTextView = this.f;
        a(appCompatTextView, paddingLeft, paddingTop, paddingRight, paddingBottom);
        a(this.g, paddingLeft, paddingTop, paddingRight, paddingBottom);
        int a2 = a.a(measuredWidth, measuredWidth2);
        appCompatTextView.setPadding(a2, 0, a2, 0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        AppCompatImageButton appCompatImageButton = this.d;
        int measuredWidth = appCompatImageButton.getMeasuredWidth();
        AppCompatImageButton appCompatImageButton2 = this.e;
        int measuredWidth2 = appCompatImageButton2.getMeasuredWidth() + measuredWidth;
        AppCompatTextView appCompatTextView = this.f;
        int measuredWidth3 = appCompatTextView.getMeasuredWidth();
        AppCompatImageView appCompatImageView = this.g;
        setMeasuredDimension(View.resolveSize(a.a(suggestedMinimumWidth, a.a(measuredWidth3, appCompatImageView.getMeasuredWidth()) + measuredWidth2), i), View.resolveSize(a.a(getSuggestedMinimumHeight(), appCompatImageButton.getMeasuredHeight(), appCompatImageButton2.getMeasuredHeight(), appCompatTextView.getMeasuredHeight(), appCompatImageView.getMeasuredHeight()), i2));
    }

    public final void setActionContentDescription(CharSequence charSequence) {
        this.e.setContentDescription(charSequence);
    }

    public final void setActionIcon(Drawable drawable) {
        this.e.setImageDrawable(drawable);
        b();
        Integer num = this.j;
        if (num != null) {
            int intValue = num.intValue();
            Drawable actionIcon = getActionIcon();
            if (actionIcon != null) {
                actionIcon.mutate();
                actionIcon.setTint(intValue);
            }
        }
    }

    public final void setActionIconVisible(boolean z) {
        this.e.setVisibility(z ? 0 : 4);
    }

    public final void setActionOnClickListener(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        b();
    }

    public final void setNavigationContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
    }

    public final void setNavigationIcon(Drawable drawable) {
        this.d.setImageDrawable(drawable);
        c();
        Integer num = this.i;
        if (num != null) {
            int intValue = num.intValue();
            Drawable navigationIcon = getNavigationIcon();
            if (navigationIcon != null) {
                navigationIcon.mutate();
                navigationIcon.setTint(intValue);
            }
        }
    }

    public final void setNavigationIconVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 4);
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.d.setOnClickListener(onClickListener);
        c();
    }

    public final void setPicture(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        d();
        Integer num = this.h;
        if (num != null) {
            int intValue = num.intValue();
            Drawable picture = getPicture();
            if (picture != null) {
                picture.mutate();
                picture.setTint(intValue);
            }
        }
    }

    public final void setPictureOnClickListener(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f.setText(charSequence);
        d();
    }

    public final void setTitlePriority(int i) {
        this.b = i;
        d();
    }

    public final void setTitleTextAppearance(int i) {
        if (i != 0) {
            this.f.setTextAppearance(i);
        }
    }

    public final void setPictureOnClickListener(izs<? super View, s3q0> izsVar) {
        this.g.setOnClickListener(new v3o(izsVar, 10));
    }

    public final void setActionOnClickListener(izs<? super View, s3q0> izsVar) {
        this.e.setOnClickListener(new tkc(izsVar, 8));
        b();
    }

    public final void setNavigationOnClickListener(izs<? super View, s3q0> izsVar) {
        this.d.setOnClickListener(new hn2(izsVar, 13));
        c();
    }

    public static /* synthetic */ void getTitlePriority$annotations() {
    }
}
