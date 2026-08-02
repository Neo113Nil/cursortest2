package com.vk.catalog2.common.ui.holders.placeholder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.Map;
import xsna.bwt0;
import xsna.cn70;
import xsna.fpb;
import xsna.g7v0;
import xsna.l7v;
import xsna.q3a;
import xsna.qdz;
import xsna.wvw;
import xsna.xxf0;

/* compiled from: OnboardingBannerVh.kt */
/* loaded from: classes16.dex */
public final class OnboardingBannerVh implements CatalogViewHolder {
    public final HintId b;
    public final q3a c;
    public final wvw d;
    public final qdz e;
    public VkOnboardingBanner f;

    /* compiled from: OnboardingBannerVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HintId.values().length];
            try {
                iArr[HintId.INFO_CJM_MONETIZATION_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OnboardingBannerVh(HintId hintId, q3a q3aVar, wvw wvwVar, qdz qdzVar) {
        this.b = hintId;
        this.c = q3aVar;
        this.d = wvwVar;
        this.e = qdzVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Map<String, String> map;
        Map<String, String> map2;
        l7v b = this.d.b();
        HintId hintId = this.b;
        Hint p = b.p(hintId.getId());
        boolean m = b.m(hintId);
        String str = (p == null || (map2 = p.e) == null) ? null : map2.get("title");
        String str2 = (p == null || (map = p.e) == null) ? null : map.get("button_text");
        if (!m || str == null || str2 == null) {
            VkOnboardingBanner vkOnboardingBanner = this.f;
            bwt0.p0(vkOnboardingBanner != null ? vkOnboardingBanner : null, false);
            this.c.b(new xxf0(uIBlock.Fb()), false);
            return;
        }
        fpb fpbVar = new fpb(b, this, uIBlock, 2);
        com.vk.voip.a aVar = new com.vk.voip.a(20, this, fpbVar);
        VkOnboardingBanner vkOnboardingBanner2 = this.f;
        VkOnboardingBanner vkOnboardingBanner3 = vkOnboardingBanner2 != null ? vkOnboardingBanner2 : null;
        bwt0.p0(vkOnboardingBanner3, true);
        vkOnboardingBanner3.setTitle(str);
        vkOnboardingBanner3.setGraffiti(g7v0.f.b);
        vkOnboardingBanner3.setColor(VkOnboarding$TintColor.Azure);
        vkOnboardingBanner3.setOnButtonClick(aVar);
        vkOnboardingBanner3.setOnClick(aVar);
        vkOnboardingBanner3.setButtonText(str2);
        vkOnboardingBanner3.setOnDismiss(fpbVar);
        vkOnboardingBanner3.setPadding(cn70.b(12), cn70.b(8), cn70.b(12), 0);
        vkOnboardingBanner3.setBannerBottomPaddingDp(24);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkOnboardingBanner vkOnboardingBanner = new VkOnboardingBanner(layoutInflater.getContext(), null, 6);
        this.f = vkOnboardingBanner;
        return vkOnboardingBanner;
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
