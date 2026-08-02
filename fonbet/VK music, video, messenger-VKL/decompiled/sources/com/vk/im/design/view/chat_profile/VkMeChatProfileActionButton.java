package com.vk.im.design.view.chat_profile;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.qcy;
import xsna.too0;

/* compiled from: VkMeChatProfileActionButton.kt */
/* loaded from: classes2.dex */
public final class VkMeChatProfileActionButton extends ConstraintLayout implements too0 {
    public final VkImage t;
    public final VkText u;

    public VkMeChatProfileActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.vkim_chat_profile_action_button, (ViewGroup) this, true);
        this.t = (VkImage) inflate.findViewById(R.id.chat_profile_action_icon);
        VkText vkText = (VkText) inflate.findViewById(R.id.chat_profile_action_title);
        this.u = vkText;
        vkText.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.u.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
    }

    public final void setIcon(Drawable drawable) {
        this.t.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.u.setText(charSequence);
    }

    public final void setTint(int i) {
        this.t.setImageTintList(ColorStateList.valueOf(i));
    }
}
