package com.vk.im.ui.views.settings;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.bwt0;
import xsna.dhr0;
import xsna.iah0;
import xsna.qcy;
import xsna.too0;

/* compiled from: CheckboxSettingsView.kt */
/* loaded from: classes2.dex */
public final class CheckboxSettingsView extends LinearLayout implements too0 {
    public AppCompatImageView b;
    public TextView c;
    public CheckBox d;
    public final a e;
    public final dhr0 f;
    public Drawable g;

    /* compiled from: CheckboxSettingsView.kt */
    public final class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            CheckboxSettingsView.this.getOnCheckListener();
        }
    }

    /* compiled from: CheckboxSettingsView.kt */
    public interface b {
    }

    public CheckboxSettingsView(Context context) {
        super(context);
        this.e = new a();
        this.f = dhr0.a;
        a(context, null, 0, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        CheckBox checkBox = this.d;
        (checkBox != null ? checkBox : null).setButtonTintList(ColorStateList.valueOf(abg0Var.c(R.attr.vk_legacy_accent)));
        Drawable icon = getIcon();
        if (icon != null) {
            icon.setTint(abg0Var.c(R.attr.vk_legacy_accent));
        }
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        setOrientation(0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        float f = 28;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iah0.a(f), iah0.a(f));
        float f2 = 16;
        layoutParams.setMarginEnd(iah0.a(f2));
        layoutParams.gravity = 16;
        appCompatImageView.setLayoutParams(layoutParams);
        appCompatImageView.setContentDescription(null);
        appCompatImageView.setImportantForAccessibility(2);
        this.b = appCompatImageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setLayoutParams(layoutParams2);
        textView.setIncludeFontPadding(false);
        this.c = textView;
        CheckBox checkBox = new CheckBox(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(iah0.a(f2));
        layoutParams3.gravity = 16;
        checkBox.setMaxLines(1);
        checkBox.setEllipsize(truncateAt);
        checkBox.setLayoutParams(layoutParams3);
        checkBox.setIncludeFontPadding(false);
        this.f.getClass();
        dhr0.S(checkBox);
        this.d = checkBox;
        AppCompatImageView appCompatImageView2 = this.b;
        if (appCompatImageView2 == null) {
            appCompatImageView2 = null;
        }
        addView(appCompatImageView2);
        TextView textView2 = this.c;
        if (textView2 == null) {
            textView2 = null;
        }
        addView(textView2);
        CheckBox checkBox2 = this.d;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        addView(checkBox2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.c, i, i2);
        setIcon(obtainStyledAttributes.getDrawable(3));
        setIconSize(obtainStyledAttributes.getDimensionPixelSize(4, iah0.a(f)));
        if (obtainStyledAttributes.hasValue(5)) {
            AppCompatImageView appCompatImageView3 = this.b;
            if (appCompatImageView3 == null) {
                appCompatImageView3 = null;
            }
            bwt0.o0(appCompatImageView3, obtainStyledAttributes.getColor(5, -16777216));
        }
        String string = obtainStyledAttributes.getString(6);
        if (string == null) {
            string = "";
        }
        setTitle(string);
        TextView textView3 = this.c;
        if (textView3 == null) {
            textView3 = null;
        }
        int resourceId = obtainStyledAttributes.getResourceId(7, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView3.setTextAppearance(resourceId);
        setChecked(obtainStyledAttributes.getBoolean(2, false));
        setCheckboxSize(obtainStyledAttributes.getDimensionPixelSize(1, iah0.a(f)));
        if (obtainStyledAttributes.hasValue(0)) {
            setCheckboxDrawable(obtainStyledAttributes.getDrawable(0));
        }
        obtainStyledAttributes.recycle();
        CheckBox checkBox3 = this.d;
        (checkBox3 != null ? checkBox3 : null).setOnCheckedChangeListener(this.e);
        bwt0.i0(this, new com.vk.movika.sdk.base.observable.a(this, 24));
    }

    public final Drawable getCheckboxDrawable() {
        return this.g;
    }

    public final int getCheckboxSize() {
        CheckBox checkBox = this.d;
        if (checkBox == null) {
            checkBox = null;
        }
        return checkBox.getLayoutParams().width;
    }

    public final boolean getChecked() {
        CheckBox checkBox = this.d;
        if (checkBox == null) {
            checkBox = null;
        }
        return checkBox.isChecked();
    }

    public final Drawable getIcon() {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getDrawable();
    }

    public final int getIconSize() {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getLayoutParams().width;
    }

    public final b getOnCheckListener() {
        return null;
    }

    public final CharSequence getTitle() {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        return textView.getText();
    }

    public final void setCheckboxDrawable(Drawable drawable) {
        this.g = drawable;
        CheckBox checkBox = this.d;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.setButtonDrawable(drawable);
    }

    public final void setCheckboxSize(int i) {
        CheckBox checkBox = this.d;
        if (checkBox == null) {
            checkBox = null;
        }
        bwt0.m0(i, i, checkBox);
    }

    public final void setChecked(boolean z) {
        CheckBox checkBox = this.d;
        if (checkBox == null) {
            checkBox = null;
        }
        checkBox.setOnCheckedChangeListener(null);
        CheckBox checkBox2 = this.d;
        if (checkBox2 == null) {
            checkBox2 = null;
        }
        checkBox2.setChecked(z);
        CheckBox checkBox3 = this.d;
        (checkBox3 != null ? checkBox3 : null).setOnCheckedChangeListener(this.e);
    }

    public final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setImageDrawable(drawable);
        AppCompatImageView appCompatImageView2 = this.b;
        (appCompatImageView2 != null ? appCompatImageView2 : null).setVisibility(drawable == null ? 8 : 0);
    }

    public final void setIconSize(int i) {
        AppCompatImageView appCompatImageView = this.b;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        bwt0.m0(i, i, appCompatImageView);
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(charSequence);
    }

    public CheckboxSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new a();
        this.f = dhr0.a;
        a(context, attributeSet, 0, 0);
    }

    public CheckboxSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new a();
        this.f = dhr0.a;
        a(context, attributeSet, i, 0);
    }

    public CheckboxSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = new a();
        this.f = dhr0.a;
        a(context, attributeSet, i, i2);
    }

    public final void setOnCheckListener(b bVar) {
    }
}
