package com.vk.auth.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.vk.auth.common.R$styleable;
import com.vk.auth.ui.VkAuthExtendedEditText;
import com.vkontakte.android.R;
import xsna.acu0;
import xsna.dbg0;
import xsna.e3m;
import xsna.f4m;
import xsna.gz80;
import xsna.hnj;
import xsna.iut0;
import xsna.krv0;
import xsna.m33;
import xsna.myc0;
import xsna.oa01;
import xsna.x0v;

/* compiled from: VkAuthExtendedEditText.kt */
/* loaded from: classes.dex */
public class VkAuthExtendedEditText extends FrameLayout {
    public static final int l = (int) Math.ceil(Resources.getSystem().getDisplayMetrics().density * 44);
    public final VkAuthErrorStatedEditText b;
    public final AppCompatImageButton c;
    public final LinearLayout d;
    public final ColorStateList e;
    public final ColorDrawable f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public VkAuthExtendedEditText(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        Drawable drawable;
        ColorStateList valueOf = ColorStateList.valueOf(krv0.m(R.attr.vk_ui_icon_secondary, context));
        this.e = valueOf;
        this.f = new ColorDrawable();
        this.k = R.drawable.vk_icon_cancel_24;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(21, R.layout.vk_auth_error_stated_edit_text);
            int resourceId2 = obtainStyledAttributes.getResourceId(20, R.id.vk_auth_error_stated_edit_text);
            String string = obtainStyledAttributes.getString(6);
            int resourceId3 = obtainStyledAttributes.getResourceId(18, R.id.vk_auth_error_stated_action_button);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(19);
            String string2 = obtainStyledAttributes.getString(17);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(23, l);
            int i = obtainStyledAttributes.getInt(12, 0);
            int i2 = obtainStyledAttributes.getInt(3, 16);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(15, 0);
            this.g = dimensionPixelSize2;
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(14, 0);
            this.h = dimensionPixelSize3;
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.i = dimensionPixelSize4;
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.j = dimensionPixelSize5;
            int i3 = obtainStyledAttributes.getInt(11, 131073);
            int i4 = obtainStyledAttributes.getInt(8, 1);
            int i5 = obtainStyledAttributes.getInt(7, 1);
            int i6 = obtainStyledAttributes.getInt(10, -1);
            int resourceId4 = obtainStyledAttributes.getResourceId(13, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            boolean z = obtainStyledAttributes.getBoolean(9, false);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(2);
            int resourceId5 = obtainStyledAttributes.getResourceId(22, 0);
            boolean z2 = obtainStyledAttributes.getBoolean(16, false);
            obtainStyledAttributes.recycle();
            VkAuthErrorStatedEditText vkAuthErrorStatedEditText = (VkAuthErrorStatedEditText) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) this, false);
            this.b = vkAuthErrorStatedEditText;
            vkAuthErrorStatedEditText.setId(resourceId2);
            vkAuthErrorStatedEditText.setPadding(dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize5);
            vkAuthErrorStatedEditText.setGravity(i2);
            vkAuthErrorStatedEditText.setHint(string);
            vkAuthErrorStatedEditText.setInputType(i3);
            vkAuthErrorStatedEditText.setMaxLines(i5);
            vkAuthErrorStatedEditText.setLines(i4);
            vkAuthErrorStatedEditText.setIncludeFontPadding(z);
            if (resourceId5 != 0) {
                setEditTextTextAppearance(resourceId5);
            }
            vkAuthErrorStatedEditText.setTextColor(colorStateList);
            vkAuthErrorStatedEditText.setHintTextColor(colorStateList2);
            if (resourceId4 != 0) {
                vkAuthErrorStatedEditText.setTypeface(dbg0.a(resourceId4, getContext()));
            }
            if (dimensionPixelSize6 != 0) {
                vkAuthErrorStatedEditText.setTextSize(0, dimensionPixelSize6);
            }
            if (i6 != -1) {
                vkAuthErrorStatedEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i6)});
            }
            if (i != 0) {
                vkAuthErrorStatedEditText.setImeOptions(i);
            }
            vkAuthErrorStatedEditText.setBackground(getBackground());
            addView(vkAuthErrorStatedEditText, new FrameLayout.LayoutParams(-1, -1, 16));
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(context, null);
            this.c = appCompatImageButton;
            appCompatImageButton.setId(resourceId3);
            if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                drawable.setTintList(valueOf);
            }
            if (drawable != null) {
                appCompatImageButton.setImageDrawable(drawable);
                appCompatImageButton.setVisibility(0);
            } else {
                f4m.j(appCompatImageButton);
            }
            appCompatImageButton.setContentDescription(string2);
            e3m.a aVar = e3m.a;
            appCompatImageButton.setBackground(m33.a(R.drawable.vk_ripple_circle_highlight, context));
            appCompatImageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.addView(appCompatImageButton, dimensionPixelSize, dimensionPixelSize);
            this.d = linearLayout;
            addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 8388629));
            if (z2) {
                oa01.a(vkAuthErrorStatedEditText, new x0v(this, 2));
                appCompatImageButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.ybu0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        VkAuthExtendedEditText.this.b.setText("");
                    }
                });
                vkAuthErrorStatedEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.zbu0
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z3) {
                        int i7 = VkAuthExtendedEditText.l;
                        VkAuthExtendedEditText.this.a(z3);
                    }
                });
            }
            iut0.q(vkAuthErrorStatedEditText, new acu0());
            setBackground(null);
            setPadding(0, 0, 0, 0);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setEditTextTextAppearance(int i) {
        if (gz80.a(23)) {
            this.b.setTextAppearance(i);
        }
    }

    public final void a(boolean z) {
        Drawable drawable;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.b;
        boolean f = myc0.f(vkAuthErrorStatedEditText.getText());
        int i = this.j;
        int i2 = this.i;
        int i3 = this.h;
        AppCompatImageButton appCompatImageButton = this.c;
        if (!f || !vkAuthErrorStatedEditText.isEnabled() || !z) {
            f4m.j(appCompatImageButton);
            appCompatImageButton.setContentDescription("");
            vkAuthErrorStatedEditText.setPadding(i3, i2, this.g, i);
            return;
        }
        Context context = getContext();
        e3m.a aVar = e3m.a;
        Drawable a = m33.a(this.k, context);
        if (a == null || (drawable = a.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTintList(this.e);
        }
        if (drawable != null) {
            appCompatImageButton.setImageDrawable(drawable);
            appCompatImageButton.setVisibility(0);
        } else {
            f4m.j(appCompatImageButton);
        }
        appCompatImageButton.setContentDescription(getContext().getString(R.string.vk_clear_input));
        vkAuthErrorStatedEditText.setPadding(i3, i2, 0, i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth = this.d.getMeasuredWidth();
        ColorDrawable colorDrawable = this.f;
        colorDrawable.setBounds(0, 0, measuredWidth, 1);
        this.b.setCompoundDrawablesRelative(null, null, colorDrawable, null);
        super.onMeasure(i, i2);
    }

    public final void setErrorState(boolean z) {
        this.b.setErrorState(z);
    }

    public final void setOnActionButtonClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }
}
