package com.vk.feed.tool.view.newsfeed.error;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import xsna.atm;
import xsna.ee;
import xsna.gzs;
import xsna.tlo0;
import xsna.too0;
import xsna.tq;

/* compiled from: FeedErrorPlaceholder.kt */
/* loaded from: classes18.dex */
public final class FeedErrorPlaceholder extends ee implements too0 {
    public static final /* synthetic */ int e = 0;
    public final VkPlaceholder d;

    public FeedErrorPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        VkPlaceholder vkPlaceholder = new VkPlaceholder(context, null, 6, 0);
        vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, tq.h(tlo0.Companion, R.string.feed_network_error))));
        vkPlaceholder.setBottom(new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) new tlo0.f(R.string.feed_network_error_retry), (gzs) new atm(this, 5), (VkPlaceholder.a.C0857a.C0858a) null, (VkPlaceholder.a.C0857a.C0858a) null, (VkButton.Size) null, (VkButton.Mode) null, (VkButton.Appearance) null, false, IronSourceError.ERROR_CODE_INIT_FAILED), null, null, null, 14));
        vkPlaceholder.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.d = vkPlaceholder;
        addView(vkPlaceholder);
    }

    @Override // xsna.too0
    public final void Ng() {
        this.d.Ng();
    }

    @Override // xsna.ee
    public final void b() {
    }

    @Override // xsna.ee
    public void setActionTitle(int i) {
    }

    @Override // xsna.ee
    public void setMessage(CharSequence charSequence) {
    }

    @Override // xsna.ee
    public void setRetryBtnVisible(boolean z) {
    }
}
