package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bd10;
import xsna.bwt0;
import xsna.gzs;
import xsna.s3q0;

/* compiled from: VoipActionSectionPlaceholder.kt */
/* loaded from: classes7.dex */
public final class VoipActionSectionPlaceholder extends ConstraintLayout {
    public static final /* synthetic */ int w = 0;
    public final TextView t;
    public final TextView u;
    public final TextView v;

    public VoipActionSectionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.voip_action_section_placeholder, this);
        setBackgroundResource(R.drawable.bg_gray_800_corner10);
        this.t = (TextView) findViewById(R.id.title);
        TextView textView = (TextView) findViewById(R.id.description);
        this.u = textView;
        this.v = (TextView) findViewById(R.id.button);
        textView.setMinLines(0);
        textView.setMaxLines(Integer.MAX_VALUE);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.h, 0, 0);
        setTitle(obtainStyledAttributes.getString(2));
        setDescription(obtainStyledAttributes.getString(1));
        String string = obtainStyledAttributes.getString(0);
        setButton(string == null ? "" : string);
        obtainStyledAttributes.recycle();
    }

    public final void setButton(CharSequence charSequence) {
        this.v.setText(charSequence);
    }

    public final void setButtonClickListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.v, new bd10(2, gzsVar));
    }

    public final void setDescription(CharSequence charSequence) {
        boolean z = charSequence != null;
        TextView textView = this.u;
        bwt0.p0(textView, z);
        textView.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        boolean z = charSequence != null;
        TextView textView = this.t;
        bwt0.p0(textView, z);
        textView.setText(charSequence);
    }

    public final void setButton(int i) {
        setButton(getContext().getString(i));
    }

    public final void setDescription(int i) {
        setDescription(getContext().getString(i));
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }
}
