package com.vk.core.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.libuilight.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.x3e0;

/* compiled from: ProgressButton.kt */
/* loaded from: classes17.dex */
public final class ProgressButton extends FrameLayout implements x3e0 {
    public final TextView b;
    public final ProgressBar c;

    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.vk_progress_button, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.text);
        this.b = textView;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.pb_loading);
        this.c = progressBar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        if (obtainStyledAttributes.hasValue(2)) {
            textView.setText(obtainStyledAttributes.getText(2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            textView.setTextColor(obtainStyledAttributes.getColorStateList(1));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            textView.setTextSize(0, obtainStyledAttributes.getDimensionPixelSize(0, 16));
        }
        if (obtainStyledAttributes.hasValue(3)) {
            progressBar.setIndeterminateTintList(obtainStyledAttributes.getColorStateList(3));
        }
        if (obtainStyledAttributes.getBoolean(4, true)) {
            setPadding(getResources().getDimensionPixelSize(R.dimen.vk_ui_button_padding_left), getResources().getDimensionPixelSize(R.dimen.vk_ui_button_padding_top), getResources().getDimensionPixelSize(R.dimen.vk_ui_button_padding_right), getResources().getDimensionPixelSize(R.dimen.vk_ui_button_padding_bottom));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // xsna.x3e0
    public final void S(boolean z) {
        this.b.setVisibility(z ? 4 : 0);
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setIndeterminateTint(int i) {
        this.c.setIndeterminateTintList(e3m.c(i, getContext()));
    }

    public final void setText(int i) {
        this.b.setText(i);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
