package com.vk.catalog2.common.ui.holders.group;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupChat;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.group.GroupChat;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import xsna.bwt0;
import xsna.c98;
import xsna.cpu;
import xsna.dhr0;
import xsna.e43;
import xsna.nik0;
import xsna.pvo0;
import xsna.xg5;

/* compiled from: GroupChatVh.kt */
/* loaded from: classes16.dex */
public final class GroupChatVh implements CatalogViewHolder, View.OnClickListener {
    public final int b;
    public final cpu c;
    public TextView d;
    public TextView e;
    public VKImageView f;
    public GroupChat g;

    public GroupChatVh(int i) {
        cpu a = xg5.a();
        this.b = i;
        this.c = a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String lowerCase;
        UIBlockGroupChat uIBlockGroupChat = uIBlock instanceof UIBlockGroupChat ? (UIBlockGroupChat) uIBlock : null;
        if (uIBlockGroupChat == null) {
            return;
        }
        GroupChat groupChat = uIBlockGroupChat.y;
        this.g = groupChat;
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(groupChat.c);
        GroupChat groupChat2 = this.g;
        if (groupChat2 == null) {
            lowerCase = "";
        } else {
            int i = groupChat2.f;
            if (i >= 2 && (System.currentTimeMillis() / 1000) - groupChat2.g <= TimeUnit.MINUTES.toMillis(30L)) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                String lowerCase2 = context.getResources().getQuantityString(R.plurals.group_chats_members_active, i, Integer.valueOf(i)).toLowerCase(Locale.ROOT);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lowerCase2);
                nik0.c(spannableStringBuilder, dhr0.t.c(R.attr.vk_ui_text_link), 0, lowerCase2.length());
                lowerCase = spannableStringBuilder;
            } else if (groupChat2.g > 0) {
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                lowerCase = context2.getResources().getString(R.string.group_chat_activity, pvo0.i(false, (int) groupChat2.g, false, false)).toLowerCase(Locale.ROOT);
            } else {
                Context context3 = e43.a;
                if (context3 == null) {
                    context3 = null;
                }
                Resources resources = context3.getResources();
                int i2 = groupChat2.i;
                lowerCase = resources.getQuantityString(R.plurals.group_chats_members, i2, Integer.valueOf(i2)).toLowerCase(Locale.ROOT);
            }
        }
        TextView textView2 = this.e;
        if (textView2 != null) {
            textView2.setText(lowerCase);
            bwt0.p0(textView2, lowerCase.length() > 0);
        }
        VKImageView vKImageView = this.f;
        (vKImageView != null ? vKImageView : null).s0(groupChat.d);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        textView.setMaxLines(2);
        this.d = textView;
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        this.f = (VKImageView) inflate.findViewById(R.id.icon);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        if (view == null || this.g == null) {
            return;
        }
        Context context = view.getContext();
        GroupChat groupChat = this.g;
        if (groupChat == null || (str = groupChat.e) == null) {
            return;
        }
        this.c.i(context, str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
