package com.vk.clips.design.view.live.chat;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import xsna.e43;
import xsna.f4m;
import xsna.his0;
import xsna.iah0;

/* compiled from: ChatChangeVisibilityView.kt */
/* loaded from: classes16.dex */
public final class ChatChangeVisibilityView extends VkText {
    public ChatChangeVisibilityView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setTextColor(e43.a.getColor(R.color.vk_white));
        setGravity(16);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        setCompoundDrawablePadding(iah0.a(4));
        f4m.x(iah0.a(8), this);
        setText(getContext().getString(R.string.live_chat_hide));
        his0.v(this, R.drawable.vk_icon_cancel_24, R.color.vk_white);
    }
}
