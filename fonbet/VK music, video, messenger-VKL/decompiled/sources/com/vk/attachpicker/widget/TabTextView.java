package com.vk.attachpicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import xsna.abg0;
import xsna.dhr0;
import xsna.too0;

/* loaded from: classes15.dex */
public class TabTextView extends AppCompatTextView implements too0 {
    public int b;
    public int c;

    public TabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        abg0 abg0Var = dhr0.t;
        this.b = abg0Var.c(R.attr.vk_ui_text_subhead);
        this.c = abg0Var.c(R.attr.vk_ui_text_accent_themed);
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.b = abg0Var.c(R.attr.vk_ui_text_subhead);
        this.c = abg0Var.c(R.attr.vk_ui_text_accent_themed);
        invalidate();
    }
}
