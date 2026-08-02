package com.vk.feed.design.view.newsfeed.banner.middle;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.feed.design.view.newsfeed.banner.VkFeedLegoBanner;
import com.vk.feed.design.view.newsfeed.banner.a;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.e3m;
import xsna.ey2;
import xsna.f4m;
import xsna.n8g;
import xsna.tlo0;
import xsna.too0;

/* compiled from: VkFeedLegoBannerMiddleView.kt */
/* loaded from: classes18.dex */
public final class VkFeedLegoBannerMiddleView extends LinearLayout implements too0 {
    public VkFeedLegoBanner.BackgroundMode b;
    public final VkFadeText c;
    public final VkFadeText d;
    public final VkFadeText e;
    public final VkButton f;

    public VkFeedLegoBannerMiddleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = VkFeedLegoBanner.BackgroundMode.Light;
        LayoutInflater.from(context).inflate(R.layout.feed_lego_banner_middle, (ViewGroup) this, true);
        VkFadeText vkFadeText = (VkFadeText) findViewById(R.id.feed_lego_banner_title);
        this.c = vkFadeText;
        VkFadeText vkFadeText2 = (VkFadeText) findViewById(R.id.feed_lego_banner_subtitle);
        this.d = vkFadeText2;
        VkFadeText vkFadeText3 = (VkFadeText) findViewById(R.id.feed_lego_banner_description);
        this.e = vkFadeText3;
        this.f = (VkButton) findViewById(R.id.feed_lego_banner_button);
        setOrientation(1);
        int g = e3m.g(R.attr.vk_ui_typography_text, context);
        f4m.j(vkFadeText);
        vkFadeText.setTextAppearance(g);
        vkFadeText.setFade(true);
        vkFadeText.setIncludeFontPadding(true);
        int g2 = e3m.g(R.attr.vk_ui_typography_footnote, context);
        f4m.j(vkFadeText2);
        vkFadeText2.setTextAppearance(g2);
        vkFadeText2.setFade(true);
        vkFadeText2.setIncludeFontPadding(true);
        int g3 = e3m.g(R.attr.vk_ui_typography_footnote, context);
        f4m.j(vkFadeText3);
        vkFadeText3.setTextAppearance(g3);
        vkFadeText3.setFade(true);
        vkFadeText3.setIncludeFontPadding(true);
        a();
    }

    private final void setButton(VkFeedLegoBanner.c cVar) {
        throw null;
    }

    private final void setDescription(VkFeedLegoBanner.d.a aVar) {
        if (!(aVar instanceof VkFeedLegoBanner.d.a.C1042a)) {
            throw new NoWhenBranchMatchedException();
        }
        throw null;
    }

    private final void setSubtitle(tlo0 tlo0Var) {
        ey2.i(this.d, tlo0Var.a(getContext()));
    }

    private final void setTitle(tlo0 tlo0Var) {
        ey2.i(this.c, tlo0Var.a(getContext()));
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
        this.f.Ng();
    }

    public final void a() {
        this.c.setTextColor(e3m.f(a.a(this.b), getContext()));
        this.d.setTextColor(n8g.l(e3m.f(a.a(this.b), getContext()), an10.b(Color.alpha(r0) * 0.54f)));
        this.e.setTextColor(n8g.l(e3m.f(a.a(this.b), getContext()), an10.b(Color.alpha(r0) * 0.54f)));
    }
}
