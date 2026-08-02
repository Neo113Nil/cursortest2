package com.vk.channels.impl.donut;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.movika.sdk.base.observable.g;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.ah;
import xsna.b8g;
import xsna.ci0;
import xsna.e3m;
import xsna.gko;
import xsna.m4;
import xsna.qu;
import xsna.tlo0;
import xsna.tq;
import xsna.ulw;
import xsna.x7;

/* compiled from: ChannelDonutSupportView.kt */
/* loaded from: classes16.dex */
public final class c {
    public final View a;
    public final x7 b;
    public final Context c;
    public final VkPlaceholder d;
    public final ProgressBar e;
    public final VkFormField f;
    public final VkInputSelect g;
    public final VkFormField h;
    public final VkInputSelect i;
    public final VkButton j;
    public boolean k;

    public c(View view, ChannelDonutSupportFragment channelDonutSupportFragment, x7 x7Var) {
        this.a = view;
        this.b = x7Var;
        Context context = view.getContext();
        this.c = context;
        VkTopBar vkTopBar = (VkTopBar) view.findViewById(R.id.top_bar);
        VkPlaceholder vkPlaceholder = (VkPlaceholder) view.findViewById(R.id.placeholder);
        this.d = vkPlaceholder;
        this.e = (ProgressBar) view.findViewById(R.id.progress_bar);
        VkFormField vkFormField = (VkFormField) view.findViewById(R.id.name_container);
        this.f = vkFormField;
        VkInputSelect vkInputSelect = (VkInputSelect) view.findViewById(R.id.name_input);
        this.g = vkInputSelect;
        VkFormField vkFormField2 = (VkFormField) view.findViewById(R.id.price_container);
        this.h = vkFormField2;
        VkInputSelect vkInputSelect2 = (VkInputSelect) view.findViewById(R.id.price_input);
        this.i = vkInputSelect2;
        VkButton vkButton = (VkButton) view.findViewById(R.id.continue_btn);
        this.j = vkButton;
        vkTopBar.setBack(new VkTopBar.b(new ah(this, 10), tq.h(tlo0.Companion, R.string.back), null, null, null, 28));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.vkim_channels_donut_support_title), null, null, null, null, 30), null, null, null, 14));
        gko.b bVar = gko.Companion;
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_help_circle_outline_28), new tlo0.f(R.string.accessibility_more_info), new m4(this, 12), null, new b8g(e3m.f(R.attr.vk_ui_icon_accent, context)), null, 40), null, 6));
        vkPlaceholder.setTop(new VkPlaceholder.c.C0856c(new ulw(R.drawable.vk_icon_illustration_donut_calendar_120h), null, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new tlo0.f(R.string.vkim_channels_donut_support_ph_title), new tlo0.f(R.string.vkim_channels_donut_support_ph_subtitle), (com.vk.core.compose.component.semantics.a) null, 10));
        vkFormField.setLabel(context.getString(R.string.vkim_channels_donut_support_name_label));
        vkFormField.setCaption(context.getString(R.string.vkim_channels_donut_support_name_caption));
        vkInputSelect.setHint(context.getString(R.string.vkim_channels_donut_support_name_placeholder));
        vkFormField2.setLabel(context.getString(R.string.vkim_channels_donut_support_price_label));
        vkFormField2.setCaption(context.getString(R.string.vkim_channels_donut_support_price_caption));
        vkInputSelect2.setInputType(2);
        int i = 14;
        vkInputSelect.c(new g(this, i));
        vkInputSelect2.c(new qu(this, i));
        vkButton.setOnClickListener(new ci0(this, 3));
    }
}
