package com.vk.feed.design.view.newsfeed.debug;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: VkFeedDebugInfoView.kt */
/* loaded from: classes18.dex */
public final class VkFeedDebugInfoView extends LinearLayout {
    public final VkText b;
    public final VkText c;

    public VkFeedDebugInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.pds_debug_info, (ViewGroup) this, true);
        this.b = (VkText) findViewById(R.id.pds_debug_info_label);
        this.c = (VkText) findViewById(R.id.pds_debug_info_description);
        setOrientation(1);
    }

    public final CharSequence getDescriptionText() {
        return this.c.getText();
    }

    public final CharSequence getLabelText() {
        return this.b.getText();
    }

    public final void setDescriptionText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setDescriptionVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 8);
    }

    public final void setLabelText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnDescriptionClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final void setOnLabelClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }
}
