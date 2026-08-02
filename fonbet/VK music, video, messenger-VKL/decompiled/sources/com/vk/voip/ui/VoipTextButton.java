package com.vk.voip.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c98;
import xsna.cn70;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: VoipTextButton.kt */
/* loaded from: classes7.dex */
public final class VoipTextButton extends LinearLayout {
    public final ImageView b;
    public gzs<s3q0> c;
    public final Drawable d;
    public final Drawable e;
    public boolean f;

    public VoipTextButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.voip_button_with_text, (ViewGroup) this, true);
        TextView textView = (TextView) findViewById(R.id.tv);
        ImageView imageView = (ImageView) findViewById(R.id.btn);
        this.b = imageView;
        imageView.setOnClickListener(new c98(this, 20));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.n, 0, 0);
        String string = obtainStyledAttributes.getString(1);
        this.d = obtainStyledAttributes.getDrawable(0);
        this.e = obtainStyledAttributes.getDrawable(5);
        boolean z = obtainStyledAttributes.getBoolean(2, false);
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (obtainStyledAttributes.hasValue(4)) {
            int color = obtainStyledAttributes.getColor(4, -16777216);
            if (drawable != null) {
                drawable.setTint(color);
            }
        }
        obtainStyledAttributes.recycle();
        textView.setText(string);
        int b = cn70.b(z ? 68 : 72);
        bwt0.m0(b, b, imageView);
        imageView.setImageDrawable(drawable);
        if (this.f) {
            imageView.setBackground(this.e);
            imageView.setImageAlpha(150);
        } else {
            imageView.setBackground(this.d);
            imageView.setImageAlpha(255);
        }
    }

    public final gzs<s3q0> getOnButtonClickCallback() {
        return this.c;
    }

    public final void setInactive(boolean z) {
        if (this.f != z) {
            this.f = z;
            ImageView imageView = this.b;
            if (z) {
                imageView.setBackground(this.e);
                imageView.setImageAlpha(150);
            } else {
                imageView.setBackground(this.d);
                imageView.setImageAlpha(255);
            }
        }
    }

    public final void setOnButtonClickCallback(gzs<s3q0> gzsVar) {
        this.c = gzsVar;
    }
}
