package com.vk.attachpicker.collages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.attachpicker.collages.CollageOnboardingBannerView;
import com.vk.attachpicker.collages.a;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import java.util.Map;
import xsna.fpf0;
import xsna.k7m;
import xsna.l7v;
import xsna.m7m;

/* compiled from: CollageOnboardingBannerView.kt */
/* loaded from: classes15.dex */
public final class CollageOnboardingBannerView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final VkText b;
    public final VkText c;
    public final VkImage d;

    public CollageOnboardingBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.collage_onboarding_view, this);
        this.b = (VkText) findViewById(R.id.title);
        this.c = (VkText) findViewById(R.id.subtitle);
        this.d = (VkImage) findViewById(R.id.background);
    }

    public final void setupWithHint(final HintId hintId) {
        final Map<String, String> map;
        final l7v b = ((InfoBridgeComponent) ((k7m) m7m.c(this)).a(fpf0.a(InfoBridgeComponent.class))).t().b();
        if (!b.a(hintId.getId())) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        Hint p = b.p(hintId.getId());
        if (p == null || (map = p.e) == null) {
            return;
        }
        String str = map.get("onboarding_banner_title");
        if (str == null) {
            str = "";
        }
        this.b.setText(str);
        String str2 = map.get("onboarding_banner_subtitle");
        this.c.setText(str2 != null ? str2 : "");
        this.d.o0(map.get("onboarding_banner_image"), null);
        setOnClickListener(new View.OnClickListener() { // from class: xsna.s1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CollageOnboardingBannerView.e;
                CollageOnboardingBannerView collageOnboardingBannerView = CollageOnboardingBannerView.this;
                Context context = collageOnboardingBannerView.getContext();
                Map map2 = map;
                String str3 = (String) map2.get("onboarding_video_button");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = (String) map2.get("onboarding_video");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = (String) map2.get("onboarding_video_text");
                new a.C0382a(context, str4, str5 != null ? str5 : "", str3).I0(null);
                collageOnboardingBannerView.setVisibility(8);
                b.b(hintId.getId());
            }
        });
        VkImageSimple vkImageSimple = (VkImageSimple) findViewById(R.id.close);
        vkImageSimple.setContentDescription(vkImageSimple.getContext().getString(R.string.close));
        vkImageSimple.setOnClickListener(new View.OnClickListener() { // from class: xsna.t1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = CollageOnboardingBannerView.e;
                h7v.this.b(hintId.getId());
                this.setVisibility(8);
            }
        });
    }
}
