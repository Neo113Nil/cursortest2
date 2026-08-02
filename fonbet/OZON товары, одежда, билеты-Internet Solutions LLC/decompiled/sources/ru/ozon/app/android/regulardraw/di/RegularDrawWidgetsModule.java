package ru.ozon.app.android.regulardraw.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.regulardraw.widgets.daily.core.compose.DailyRewardsWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.EntryBannerWidgetConfig;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.multi.EntryBannerWidgetMultiViewMapper;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.core.single.EntryBannerWidgetSingleViewMapper;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v2.core.EntryBannerWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryInformation.core.LotteryInformationWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.lotteryResult.core.LotteryResultWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core.MainDrawMajorScreenConfig;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.core.MainDrawMajorScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskBackgroundImage.core.MorkovskBackgroundImageConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskBackgroundImage.core.MorkovskBackgroundImageViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.core.compose.MorkovskMenuWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core.MorkovskTabbarConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core.MorkovskTabbarViewMapper;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.core.MorkovskTabBarWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.core.WelcomeScreenConfig;
import ru.ozon.app.android.regulardraw.widgets.morkovskWelcomeScreen.core.WelcomeScreenViewMapper;
import ru.ozon.app.android.regulardraw.widgets.navbar.core.MorkovskNavBarConfig;
import ru.ozon.app.android.regulardraw.widgets.navbar.core.MorkovskNavBarViewMapper;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.core.MorkovskOnboardingInfoConfig;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v1.core.MorkovskOnboardingInfoViewMapper;
import ru.ozon.app.android.regulardraw.widgets.onboardingInfo.v2.core.LotteryOnboardingInfoWidgetKt;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.core.WarningTooltipConfig;
import ru.ozon.app.android.regulardraw.widgets.warningTooltip.core.WarningTooltipViewMapper;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u009d\u0001\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0001¢\u0006\u0004\b(\u0010)J!\u00101\u001a\b\u0012\u0004\u0012\u00020.0&2\n\u0010-\u001a\u00060+j\u0002`,H\u0001¢\u0006\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/regulardraw/di/RegularDrawWidgetsModule;", "", "<init>", "()V", "Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/core/MorkovskBackgroundImageConfig;", "morkovskBackgroundImageConfig", "Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/core/MorkovskBackgroundImageViewMapper;", "morkovskBackgroundImageViewMapper", "Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavBarConfig;", "morkovskNavBarConfig", "Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavBarViewMapper;", "carrotNavBarViewMapper", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenConfig;", "mainDrawMajorScreenConfig", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenViewMapper;", "mainDrawMajorScreenViewMapper", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarConfig;", "morkovskTabbarConfig", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarViewMapper;", "morkovskTabbarViewMapper", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/EntryBannerWidgetConfig;", "entryBannerWidgetConfig", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/single/EntryBannerWidgetSingleViewMapper;", "entryBannerWidgetSingleViewMapper", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/multi/EntryBannerWidgetMultiViewMapper;", "entryBannerWidgetMultiViewMapper", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/core/WelcomeScreenConfig;", "morkovskWelcomeScreenConfig", "Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/core/WelcomeScreenViewMapper;", "morkovskWelcomeScreenViewMapper", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/core/MorkovskOnboardingInfoConfig;", "morkovskOnboardingInfoConfig", "Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/core/MorkovskOnboardingInfoViewMapper;", "morkovskOnboardingInfoViewMapper", "Lru/ozon/app/android/regulardraw/widgets/warningTooltip/core/WarningTooltipConfig;", "warningTooltipConfig", "Lru/ozon/app/android/regulardraw/widgets/warningTooltip/core/WarningTooltipViewMapper;", "warningTooltipViewMapper", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/core/MorkovskBackgroundImageConfig;Lru/ozon/app/android/regulardraw/widgets/morkovskBackgroundImage/core/MorkovskBackgroundImageViewMapper;Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavBarConfig;Lru/ozon/app/android/regulardraw/widgets/navbar/core/MorkovskNavBarViewMapper;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenConfig;Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/core/MainDrawMajorScreenViewMapper;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarConfig;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarViewMapper;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/EntryBannerWidgetConfig;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/single/EntryBannerWidgetSingleViewMapper;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/core/multi/EntryBannerWidgetMultiViewMapper;Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/core/WelcomeScreenConfig;Lru/ozon/app/android/regulardraw/widgets/morkovskWelcomeScreen/core/WelcomeScreenViewMapper;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/core/MorkovskOnboardingInfoConfig;Lru/ozon/app/android/regulardraw/widgets/onboardingInfo/v1/core/MorkovskOnboardingInfoViewMapper;Lru/ozon/app/android/regulardraw/widgets/warningTooltip/core/WarningTooltipConfig;Lru/ozon/app/android/regulardraw/widgets/warningTooltip/core/WarningTooltipViewMapper;)Ljava/util/Set;", "provideRegularDrawWidgets", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideComposeWidgets$regulardraw_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegularDrawWidgetsModule {

    @NotNull
    public static final RegularDrawWidgetsModule INSTANCE = new RegularDrawWidgetsModule();

    private RegularDrawWidgetsModule() {
    }

    @NotNull
    public static final Set<Widget2> provideRegularDrawWidgets$regulardraw_prodGoogleAllVendorsRelease(@NotNull MorkovskBackgroundImageConfig morkovskBackgroundImageConfig, @NotNull MorkovskBackgroundImageViewMapper morkovskBackgroundImageViewMapper, @NotNull MorkovskNavBarConfig morkovskNavBarConfig, @NotNull MorkovskNavBarViewMapper carrotNavBarViewMapper, @NotNull MainDrawMajorScreenConfig mainDrawMajorScreenConfig, @NotNull MainDrawMajorScreenViewMapper mainDrawMajorScreenViewMapper, @NotNull MorkovskTabbarConfig morkovskTabbarConfig, @NotNull MorkovskTabbarViewMapper morkovskTabbarViewMapper, @NotNull EntryBannerWidgetConfig entryBannerWidgetConfig, @NotNull EntryBannerWidgetSingleViewMapper entryBannerWidgetSingleViewMapper, @NotNull EntryBannerWidgetMultiViewMapper entryBannerWidgetMultiViewMapper, @NotNull WelcomeScreenConfig morkovskWelcomeScreenConfig, @NotNull WelcomeScreenViewMapper morkovskWelcomeScreenViewMapper, @NotNull MorkovskOnboardingInfoConfig morkovskOnboardingInfoConfig, @NotNull MorkovskOnboardingInfoViewMapper morkovskOnboardingInfoViewMapper, @NotNull WarningTooltipConfig warningTooltipConfig, @NotNull WarningTooltipViewMapper warningTooltipViewMapper) {
        Intrinsics.checkNotNullParameter(morkovskBackgroundImageConfig, "morkovskBackgroundImageConfig");
        Intrinsics.checkNotNullParameter(morkovskBackgroundImageViewMapper, "morkovskBackgroundImageViewMapper");
        Intrinsics.checkNotNullParameter(morkovskNavBarConfig, "morkovskNavBarConfig");
        Intrinsics.checkNotNullParameter(carrotNavBarViewMapper, "carrotNavBarViewMapper");
        Intrinsics.checkNotNullParameter(mainDrawMajorScreenConfig, "mainDrawMajorScreenConfig");
        Intrinsics.checkNotNullParameter(mainDrawMajorScreenViewMapper, "mainDrawMajorScreenViewMapper");
        Intrinsics.checkNotNullParameter(morkovskTabbarConfig, "morkovskTabbarConfig");
        Intrinsics.checkNotNullParameter(morkovskTabbarViewMapper, "morkovskTabbarViewMapper");
        Intrinsics.checkNotNullParameter(entryBannerWidgetConfig, "entryBannerWidgetConfig");
        Intrinsics.checkNotNullParameter(entryBannerWidgetSingleViewMapper, "entryBannerWidgetSingleViewMapper");
        Intrinsics.checkNotNullParameter(entryBannerWidgetMultiViewMapper, "entryBannerWidgetMultiViewMapper");
        Intrinsics.checkNotNullParameter(morkovskWelcomeScreenConfig, "morkovskWelcomeScreenConfig");
        Intrinsics.checkNotNullParameter(morkovskWelcomeScreenViewMapper, "morkovskWelcomeScreenViewMapper");
        Intrinsics.checkNotNullParameter(morkovskOnboardingInfoConfig, "morkovskOnboardingInfoConfig");
        Intrinsics.checkNotNullParameter(morkovskOnboardingInfoViewMapper, "morkovskOnboardingInfoViewMapper");
        Intrinsics.checkNotNullParameter(warningTooltipConfig, "warningTooltipConfig");
        Intrinsics.checkNotNullParameter(warningTooltipViewMapper, "warningTooltipViewMapper");
        Widget2[] elements = {new Widget2("regulardraw", "pageBackground", morkovskBackgroundImageConfig, new ViewMapper2[]{morkovskBackgroundImageViewMapper}), new Widget2("regulardraw", "navBar", morkovskNavBarConfig, new ViewMapper2[]{carrotNavBarViewMapper}), new Widget2("regulardraw", "mainDrawMajorScreen", mainDrawMajorScreenConfig, new ViewMapper2[]{mainDrawMajorScreenViewMapper}), new Widget2("regulardraw", "tabbar", morkovskTabbarConfig, new ViewMapper2[]{morkovskTabbarViewMapper}), new Widget2("regulardraw", "entryBannerWidget", entryBannerWidgetConfig, new ViewMapper2[]{entryBannerWidgetSingleViewMapper, entryBannerWidgetMultiViewMapper}), new Widget2("regulardraw", "onboardingIntro", morkovskWelcomeScreenConfig, new ViewMapper2[]{morkovskWelcomeScreenViewMapper}), new Widget2("regulardraw", "onboarding", morkovskOnboardingInfoConfig, new ViewMapper2[]{morkovskOnboardingInfoViewMapper}), new Widget2("regulardraw", "warningTooltip", warningTooltipConfig, new ViewMapper2[]{warningTooltipViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<i> provideComposeWidgets$regulardraw_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {LotteryInformationWidgetKt.LotteryInformationWidget(jsonDeserializer), LotteryResultWidgetKt.LotteryResultWidget(jsonDeserializer), MorkovskMenuWidgetKt.MorkovskMenuWidget(jsonDeserializer), MorkovskTabBarWidgetKt.MorkovskTabBarWidget(jsonDeserializer), EntryBannerWidgetKt.EntryBannerWidget(jsonDeserializer), DailyRewardsWidgetKt.DailyRewardsWidget(jsonDeserializer), LotteryOnboardingInfoWidgetKt.LotteryOnboardingInfoWidget(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
