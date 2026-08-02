package com.vk.common.view.settings;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.vk.core.view.components.radio.VkRadioButton;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.too0;

/* compiled from: RadioButtonSettingsView.kt */
/* loaded from: classes17.dex */
public final class RadioButtonSettingsView extends FrameLayout implements Checkable, too0 {
    public static final int g = iah0.a(12);
    public final AppCompatRadioButton b;
    public final int c;
    public final dhr0 d;
    public final a e;
    public b f;

    /* compiled from: RadioButtonSettingsView.kt */
    public final class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RadioButtonSettingsView radioButtonSettingsView = RadioButtonSettingsView.this;
            b onCheckedChangeListener = radioButtonSettingsView.getOnCheckedChangeListener();
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.a(radioButtonSettingsView, z, true);
            }
        }
    }

    /* compiled from: RadioButtonSettingsView.kt */
    public interface b {
        void a(RadioButtonSettingsView radioButtonSettingsView, boolean z, boolean z2);
    }

    public RadioButtonSettingsView(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d.getClass();
        AppCompatRadioButton appCompatRadioButton = this.b;
        if (!(appCompatRadioButton instanceof VkRadioButton)) {
            dhr0.S(appCompatRadioButton);
        }
        appCompatRadioButton.setTextColor(dhr0.t.c(this.c));
    }

    public final b getOnCheckedChangeListener() {
        return this.f;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b.isChecked();
    }

    @Override // android.view.View
    public final boolean performClick() {
        this.b.performClick();
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        AppCompatRadioButton appCompatRadioButton = this.b;
        appCompatRadioButton.setOnCheckedChangeListener(null);
        appCompatRadioButton.setChecked(z);
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, appCompatRadioButton.isChecked(), false);
        }
        appCompatRadioButton.setOnCheckedChangeListener(this.e);
    }

    public final void setOnCheckedChangeListener(b bVar) {
        this.f = bVar;
    }

    public final void setRadioButtonTextPadding(int i) {
        f4m.x(i, this.b);
    }

    public final void setText(String str) {
        this.b.setText(str);
    }

    public final void setTextSize(int i) {
        this.b.setTextSize(0, i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        AppCompatRadioButton appCompatRadioButton = this.b;
        appCompatRadioButton.setChecked(!appCompatRadioButton.isChecked());
        b bVar = this.f;
        if (bVar != null) {
            bVar.a(this, appCompatRadioButton.isChecked(), false);
        }
    }

    public RadioButtonSettingsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public RadioButtonSettingsView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ RadioButtonSettingsView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public RadioButtonSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        dhr0 dhr0Var = dhr0.a;
        this.d = dhr0Var;
        a aVar = new a();
        this.e = aVar;
        AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(context, null);
        appCompatRadioButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        int i3 = g;
        appCompatRadioButton.setPadding(i3, 0, i3, 0);
        appCompatRadioButton.setClickable(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.y, i, i2);
        appCompatRadioButton.setTextSize(obtainStyledAttributes.getDimension(2, 16.0f));
        int i4 = R.attr.vk_ui_text_muted;
        appCompatRadioButton.setTextColor(obtainStyledAttributes.getColor(1, e3m.f(R.attr.vk_ui_text_muted, context)));
        appCompatRadioButton.setText(obtainStyledAttributes.getString(0));
        this.c = attributeSet != null ? dhr0.A("rbsv_textColor", attributeSet) : i4;
        obtainStyledAttributes.recycle();
        this.b = appCompatRadioButton;
        dhr0Var.getClass();
        dhr0.S(appCompatRadioButton);
        setClickable(true);
        addView(appCompatRadioButton);
        appCompatRadioButton.setOnCheckedChangeListener(aVar);
    }
}
