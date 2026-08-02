package com.vk.clips.design.view.camera.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.flu;
import xsna.gko;
import xsna.gzs;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.x0;
import xsna.x7g;

/* compiled from: ModalPrivacySettingsErrorView.kt */
/* loaded from: classes16.dex */
public final class ModalPrivacySettingsErrorView extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public gzs<s3q0> b;

    public ModalPrivacySettingsErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6, 0);
        this.b = new x0(24);
        addView(vkPlaceholder);
        vkPlaceholder.setTop(new VkPlaceholder.c.b(new gko(R.drawable.vk_icon_globe_cross_outline_56), new x7g(R.attr.vk_ui_icon_secondary), null, 12));
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, tq.h(tlo0.Companion, R.string.error_network)), new VkPlaceholder.b.C0859b(14, new tlo0.f(R.string.error_description))));
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.retry), (gzs) new flu(this, 17), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Large, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, 284), null, null, null, 8));
    }

    public final void setRetryAction(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }
}
