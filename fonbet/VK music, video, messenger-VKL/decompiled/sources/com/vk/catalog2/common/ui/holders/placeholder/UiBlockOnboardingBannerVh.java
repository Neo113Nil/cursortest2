package com.vk.catalog2.common.ui.holders.placeholder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.tool.onboarding.VkOnboarding$GraffitiAlignment;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.CommonOnboardingStat$TypeOnboardingEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoChildProfileViews;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import kotlin.LazyThreadSafetyMode;
import xsna.a5f;
import xsna.ahn;
import xsna.b6m;
import xsna.bjc;
import xsna.bvt0;
import xsna.bwt0;
import xsna.cmi;
import xsna.dz2;
import xsna.e43;
import xsna.f4m;
import xsna.fnj;
import xsna.g7v0;
import xsna.iah0;
import xsna.itg0;
import xsna.j5g;
import xsna.lwf0;
import xsna.msy;
import xsna.q3a;
import xsna.rsg0;
import xsna.s3q0;
import xsna.tft0;
import xsna.wy0;
import xsna.yfb;
import xsna.zqf0;

/* compiled from: UiBlockOnboardingBannerVh.kt */
/* loaded from: classes16.dex */
public final class UiBlockOnboardingBannerVh implements CatalogViewHolder {
    public static final SchemeStat$EventItem f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.ONBOARDING, null, null, null, null, null, 62, null);
    public static final CommonOnboardingStat$TypeOnboardingEvent.OnboardingType g = CommonOnboardingStat$TypeOnboardingEvent.OnboardingType.BANNER;
    public final q3a b;
    public final PlaceholderCatalogViewStyle.Style c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new zqf0(5));
    public VkOnboardingBanner e;

    /* compiled from: UiBlockOnboardingBannerVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlaceholderCatalogViewStyle.Style.values().length];
            try {
                iArr[PlaceholderCatalogViewStyle.Style.VKVideoBanner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlaceholderCatalogViewStyle.Style.VkVideoKidsBanner.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlaceholderCatalogViewStyle.Style.VkVideoMusicBanner.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UiBlockOnboardingBannerVh(q3a q3aVar, PlaceholderCatalogViewStyle.Style style) {
        this.b = q3aVar;
        this.c = style;
    }

    public static bjc a(MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.EventType eventType) {
        UiTracker uiTracker = UiTracker.a;
        return new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks(eventType, null, MobileOfficialAppsVideoStat$TypeVideoChildProfileClicks.ObjectValue.FOR_KIDS_VIDEO_FOR_YOU, 2, null), 2));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ArrayList<UIBlockAction> arrayList;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        UIBlockAction uIBlockAction = (uIBlockPlaceholder == null || (arrayList = uIBlockPlaceholder.G) == null) ? null : (UIBlockAction) j5g.a0(arrayList);
        UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockAction instanceof UIBlockActionSwitchSection ? (UIBlockActionSwitchSection) uIBlockAction : null;
        if (uIBlockActionSwitchSection == null) {
            return;
        }
        VkOnboardingBanner vkOnboardingBanner = this.e;
        VkOnboardingBanner vkOnboardingBanner2 = vkOnboardingBanner != null ? vkOnboardingBanner : null;
        vkOnboardingBanner2.setTag("VK_ONBOARDING_BANNER_TEST_TAG");
        bwt0.p0(vkOnboardingBanner2, true);
        UIBlockPlaceholder uIBlockPlaceholder2 = (UIBlockPlaceholder) uIBlock;
        vkOnboardingBanner2.setTitle(uIBlockPlaceholder2.A);
        vkOnboardingBanner2.setOnButtonClick(new a5f(this, uIBlock, uIBlockActionSwitchSection, 4));
        vkOnboardingBanner2.setOnClick(vkOnboardingBanner2.getOnButtonClick());
        vkOnboardingBanner2.setButtonText(uIBlockActionSwitchSection.z);
        vkOnboardingBanner2.setOnDismiss(new wy0(this, uIBlock, uIBlockActionSwitchSection, 3));
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                UiTracker uiTracker = UiTracker.a;
                new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BANNER, null, null, null, null, null, 62, null), "0", "0", null, new MobileOfficialAppsVideoStat$TypeVideoChildProfileViews(MobileOfficialAppsVideoStat$TypeVideoChildProfileViews.EventType.SHOW_BANNER, MobileOfficialAppsVideoStat$TypeVideoChildProfileViews.ObjectValue.FOR_KIDS_VIDEO_FOR_YOU), 8)).q();
                return;
            } else if (i != 3) {
                s3q0 s3q0Var = s3q0.a;
                return;
            }
        }
        UiTracker uiTracker2 = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        CommonOnboardingStat$TypeOnboardingEvent.EventType eventType = CommonOnboardingStat$TypeOnboardingEvent.EventType.VIEW;
        String str = uIBlockPlaceholder2.q;
        if (str == null) {
            str = "";
        }
        new bvt0(c, SchemeStat$TypeView.a.b(f, "", "", null, new CommonOnboardingStat$TypeOnboardingEvent(g, eventType, str, -1, null, null, null, null, PsExtractor.VIDEO_STREAM_MASK, null), 8)).q();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(UIBlockPlaceholder uIBlockPlaceholder, UIBlockActionSwitchSection uIBlockActionSwitchSection) {
        this.b.b(new lwf0(Collections.singletonList(uIBlockPlaceholder.b)), false);
        VkOnboardingBanner vkOnboardingBanner = this.e;
        if (vkOnboardingBanner == null) {
            vkOnboardingBanner = null;
        }
        vkOnboardingBanner.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vkOnboardingBanner.setClickable(false);
        f4m.n(0, vkOnboardingBanner);
        dz2 x = yfb.x(((tft0) this.d.getValue()).h(uIBlockActionSwitchSection.b));
        ahn.D(x);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        x.K("device_id", b6m.b(context));
        itg0.i(7, rsg0.y0(x, null, null, 3), null, null, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkOnboardingBanner vkOnboardingBanner = new VkOnboardingBanner(layoutInflater.getContext(), null, 6);
        this.e = vkOnboardingBanner;
        Context context = vkOnboardingBanner.getContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(context)) {
            int dimensionPixelSize = vkOnboardingBanner.getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_label_horizontal_margin);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            vkOnboardingBanner.setLayoutParams(marginLayoutParams);
        }
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            VideoFeatures videoFeatures = VideoFeatures.VIDEO_MOVIES_AND_SERIALS_PROMO;
            videoFeatures.getClass();
            if (!b.A.a(videoFeatures)) {
                return layoutInflater.inflate(R.layout.catalog_empty_view, viewGroup, false);
            }
            vkOnboardingBanner.setGraffiti(g7v0.b.b);
            vkOnboardingBanner.setColor(VkOnboarding$TintColor.Azure);
        } else if (i == 2) {
            vkOnboardingBanner.setGraffiti(new g7v0.c(cmi.a));
        } else {
            if (i != 3) {
                return layoutInflater.inflate(R.layout.catalog_empty_view, viewGroup, false);
            }
            vkOnboardingBanner.setGraffiti(new g7v0.c(cmi.b));
            vkOnboardingBanner.setGraffitiAlignment(VkOnboarding$GraffitiAlignment.End);
        }
        float f2 = 12;
        vkOnboardingBanner.setPadding(iah0.a(f2), iah0.a(8), iah0.a(f2), 0);
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
