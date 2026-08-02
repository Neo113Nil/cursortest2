package com.vk.superapp.browser.internal.ui.menu.action;

import com.vk.external.miniapp.net.personal.BannerType;
import com.vk.superapp.browser.internal.ui.banner.PersonalBannerView;

/* compiled from: PersonalBannerViewHolder.kt */
/* loaded from: classes6.dex */
public final class g implements PersonalBannerView.a {
    public final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    @Override // com.vk.superapp.browser.internal.ui.banner.PersonalBannerView.a
    public final void a(String str) {
        this.a.l.b(str);
    }

    @Override // com.vk.superapp.browser.internal.ui.banner.PersonalBannerView.a
    public final void b(BannerType bannerType) {
        this.a.l.a(bannerType);
    }
}
