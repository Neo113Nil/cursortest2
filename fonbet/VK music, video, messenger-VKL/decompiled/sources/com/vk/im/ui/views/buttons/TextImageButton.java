package com.vk.im.ui.views.buttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.omw;
import xsna.qcy;

/* compiled from: TextImageButton.kt */
/* loaded from: classes2.dex */
public final class TextImageButton extends ConstraintLayout {
    public final ImageView t;
    public final TextView u;
    public final Drawable v;

    public TextImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vkim_text_image_button, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.image_view);
        this.t = imageView;
        TextView textView = (TextView) inflate.findViewById(R.id.text_view);
        this.u = textView;
        textView.setMaxLines(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.E);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.v = drawable;
        omw.c(R.attr.vk_legacy_accent, drawable, imageView);
        textView.setText(obtainStyledAttributes.getText(1));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        int i = z ? R.attr.vk_legacy_accent : R.attr.vk_legacy_icon_secondary;
        Drawable drawable = this.v;
        ImageView imageView = this.t;
        omw.c(i, drawable, imageView);
        imageView.setEnabled(z);
        this.u.setEnabled(z);
    }
}
