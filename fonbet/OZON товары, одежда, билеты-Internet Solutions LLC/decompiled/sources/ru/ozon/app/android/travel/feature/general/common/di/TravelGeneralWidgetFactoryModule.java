package ru.ozon.app.android.travel.feature.general.common.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderComposeFactoryKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.BonusExpirationRemainderViewFactoryKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.ButtonWithInformationV2WidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.contentHider.ContentHiderWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.disclaimer.v2.data.DisclaimerV2WidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.iconChooser.presentation.IconChooserWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.landingNavBar.v1.LandingNavBarWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.LoadingProgressBarWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.NavBarOnboardingWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.NotificationSubscriptionWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.presentation.NotificationSubscriptionBannerV3WidgetFactoryKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSwitcher.NotificationSwitcherWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.offlineTravelMode.OfflineTravelModelWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsBalance.StarsBalanceWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.starsTile.StarsTileWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.themeChooser.presentation.ThemeChooserWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.TimeoutAndActionV2WidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v1.TotalPriceWithButtonWidgetKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.TotalPriceWithButtonV2WidgetKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/di/TravelGeneralWidgetFactoryModule;", "", "<init>", "()V", "", "Ln20/i;", "provideWidgets$common_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgets", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "provideComposeWidgets$common_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelGeneralWidgetFactoryModule {
    @NotNull
    public final Set<i> provideComposeWidgets$common_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {DisclaimerV2WidgetKt.disclaimerV2Widget(jsonDeserializer), ThemeChooserWidgetKt.ThemeChooserWidgetFactory(jsonDeserializer), IconChooserWidgetKt.IconChooserWidgetFactory(jsonDeserializer), NotificationSwitcherWidgetKt.NotificationSwitcherWidget(jsonDeserializer), LoadingProgressBarWidgetKt.LoadingProgressBarWidget(jsonDeserializer), BonusExpirationRemainderComposeFactoryKt.BonusExpirationRemainderComposeFactory(jsonDeserializer)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<i> provideWidgets$common_prodGoogleAllVendorsRelease() {
        i[] elements = {TimeoutAndActionV2WidgetKt.TimeoutAndActionV2Widget(), NavBarOnboardingWidgetKt.NavBarOnboardingWidget(), ContentHiderWidgetKt.ContentHiderWidget(), TotalPriceWithButtonWidgetKt.TotalPriceWithButtonWidget(), TotalPriceWithButtonV2WidgetKt.TotalPriceWithButtonV2Widget(), ButtonWithInformationV2WidgetKt.ButtonWithInformationV2Widget(), NotificationSubscriptionWidgetKt.NotificationSubscriptionWidget(), NotificationSubscriptionBannerV3WidgetFactoryKt.NotificationSubscriptionBannerV3WidgetFactory(), StarsTileWidgetKt.StarsTileWidget(), StarsBalanceWidgetKt.StarsBalanceWidget(), LandingNavBarWidgetKt.LandingNavBarWidget(), OfflineTravelModelWidgetKt.OfflineTravelModelWidget(), BonusExpirationRemainderViewFactoryKt.BonusExpirationRemainderViewFactory()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
