package com.vk.im.design.view.listitem;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import xsna.cyv;
import xsna.dyv;
import xsna.gko;
import xsna.iah0;
import xsna.jjc;
import xsna.n3i;
import xsna.tlo0;

/* compiled from: ImCallBubble.kt */
/* loaded from: classes2.dex */
public final class ImCallBubble extends LinearLayout {
    public static final /* synthetic */ int j = 0;
    public dyv b;
    public cyv c;
    public final View d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final VkButton i;

    public ImCallBubble(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.im_ui_internal_call_bubble, this);
        this.d = findViewById(R.id.im_ui_internal_call_bubble_root);
        this.e = (ImageView) findViewById(R.id.im_ui_internal_call_babble_middle_icon);
        this.f = (TextView) findViewById(R.id.im_ui_internal_call_babble_middle_title);
        this.g = (TextView) findViewById(R.id.im_ui_internal_call_babble_middle_subtitle);
        this.h = (TextView) findViewById(R.id.im_ui_internal_call_babble_middle_time);
        this.i = (VkButton) findViewById(R.id.im_ui_internal_call_babble_bottom_button);
    }

    @Override // android.view.View
    public final cyv getBottom() {
        return this.c;
    }

    public final dyv getMiddle() {
        return this.b;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.d.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    public final void setBottom(cyv cyvVar) {
        this.c = cyvVar;
        if (cyvVar != null) {
            CharSequence a = tlo0.b.a(cyvVar.a.a, getContext());
            VkButton vkButton = this.i;
            vkButton.setText(a);
            jjc.g(vkButton, new n3i(cyvVar, 28));
        }
    }

    public final void setButtonTextColor(int i) {
        this.i.setTextTint(ColorStateList.valueOf(i));
    }

    public final void setIconTintColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        ImageView imageView = this.e;
        imageView.setImageTintList(valueOf);
        Drawable background = imageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.mutate();
            gradientDrawable.setStroke((int) iah0.b(1.5f), i);
        }
    }

    public final void setMiddle(dyv dyvVar) {
        this.b = dyvVar;
        if (dyvVar != null) {
            gko gkoVar = (gko) dyvVar.a.c;
            this.e.setImageDrawable(gko.b(gkoVar.a, getContext()));
            this.f.setText(tlo0.b.a(dyvVar.b, getContext()));
            this.g.setText(tlo0.b.a(dyvVar.c, getContext()));
            this.h.setText(tlo0.b.a(dyvVar.d, getContext()));
        }
    }

    public final void setSubtitleTintColor(int i) {
        this.g.setTextColor(i);
    }

    public final void setTimeTextColor(int i) {
        this.h.setTextColor(i);
    }

    public final void setTitleTextColor(int i) {
        this.f.setTextColor(i);
    }
}
