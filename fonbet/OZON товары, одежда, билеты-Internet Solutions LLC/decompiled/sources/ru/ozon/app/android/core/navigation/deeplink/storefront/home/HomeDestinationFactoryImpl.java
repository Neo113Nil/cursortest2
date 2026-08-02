package ru.ozon.app.android.core.navigation.deeplink.storefront.home;

import Tc.j;
import android.content.Context;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.C8880a;
import pZ.f;
import ru.ozon.app.android.barcodecache.wearable.pageConfigurator.HomeBarcodeOnWearableDeviceConfigurator;
import ru.ozon.app.android.cabinet.cache.configurator.OrderCacheConfigurator;
import ru.ozon.app.android.common.productselectormobile.util.AutopickerResultConfigurator;
import ru.ozon.app.android.composer.initialwidgets.EmptyInitialWidgetProvider;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.cscore.orderTracking.configurators.updater.MainOrderTrackingV4UpdaterConfigurator;
import ru.ozon.app.android.cscore.orderlist.configurators.RefreshAfterTimeChangeConfigurator;
import ru.ozon.app.android.fresh.feature.entry.OzonFreshActivity;
import ru.ozon.app.android.payment.ui.configurators.orderDetails.OrderPayConfigurator;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.rateItems.ReviewSuccessConfigurator;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.SubmitCachedReviewConfigurator;
import ru.ozon.app.android.select.feature.entry.OzonSelectActivity;
import ru.ozon.app.android.storefront.configurators.SharedViewPoolSizeSetterConfigurator;
import ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory;
import ru.ozon.app.android.tabbar.R$id;
import ru.ozon.app.android.travel.feature.entry.OzonTravelActivity;
import ru.ozon.app.android.ui.start.AppHostActivity;
import ru.ozon.app.android.ui.start.HomePageConfigurator;
import ru.ozon.app.android.universalwidgets.failedExternalLinkRetry.configurator.home.FailedExternalPageRetryNotificationConfigurator;
import ru.ozon.app.android.utils.ContextUtilsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/storefront/home/HomeDestinationFactoryImpl;", "Lru/ozon/app/android/storefront/deeplinkhandlers/home/HomeDestinationFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "", "redirectDeeplink", "LpZ/a;", "createActivityDestination", "(Landroid/content/Context;Ljava/lang/String;)LpZ/a;", "deeplink", "", "failedExternalLinkRetryEnabled", "LpZ/f;", "createFragmentDestination", "(Ljava/lang/String;Z)LpZ/f;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeDestinationFactoryImpl implements HomeDestinationFactory {
    @Override // ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory
    @NotNull
    public C8880a createActivityDestination(@NotNull Context context, String redirectDeeplink) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C8880a(ContextUtilsKt.isOzonSelectApplication(context) ? OzonSelectActivity.INSTANCE.createIntent(context, redirectDeeplink) : ContextUtilsKt.isOzonTravelApplication(context) ? OzonTravelActivity.INSTANCE.createIntent(context, redirectDeeplink) : ContextUtilsKt.isOzonFreshApplication(context) ? OzonFreshActivity.INSTANCE.createIntent(context, redirectDeeplink) : AppHostActivity.INSTANCE.createIntent(context, redirectDeeplink));
    }

    @Override // ru.ozon.app.android.storefront.deeplinkhandlers.home.HomeDestinationFactory
    @NotNull
    public f createFragmentDestination(@NotNull String deeplink, boolean failedExternalLinkRetryEnabled) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        j builder = new j();
        builder.add(SharedViewPoolSizeSetterConfigurator.class);
        builder.add(HomePageConfigurator.class);
        builder.add(CreateAndPayConfigurator.class);
        builder.add(OrderPayConfigurator.class);
        builder.add(MainOrderTrackingV4UpdaterConfigurator.class);
        builder.add(RefreshAfterTimeChangeConfigurator.class);
        builder.add(OrderCacheConfigurator.class);
        builder.add(ReviewSuccessConfigurator.class);
        builder.add(AutopickerResultConfigurator.class);
        builder.add(SubmitCachedReviewConfigurator.class);
        builder.add(HomeBarcodeOnWearableDeviceConfigurator.class);
        if (failedExternalLinkRetryEnabled) {
            builder.add(FailedExternalPageRetryNotificationConfigurator.class);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        j b11 = builder.b();
        return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), new ComposerScreenConfig.ToolbarConfig(null, 0, 2, null), false, null, true, false, false, false, null, false, false, false, b11, null, null, null, false, new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(0L, null, 2)), null, null, false, false, null, EmptyInitialWidgetProvider.class, 8253420, null), deeplink, R$id.menu_main, null, false, true, null, 88, null);
    }
}
