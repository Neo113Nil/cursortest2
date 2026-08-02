package ru.ozon.app.android.account.orders.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.account.orders.commonBarcode.CommonBarcodeConfig;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewMapper;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewMapper;
import ru.ozon.app.android.account.orders.commonBarcodeV2.CommonBarcodeV2WidgetKt;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.core.OfflineFintechBannerConfig;
import ru.ozon.app.android.account.orders.emptyscreen.fintech.core.OfflineFintechBannerViewMapper;
import ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethConfig;
import ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethViewMapper;
import ru.ozon.app.android.account.orders.orderlist.v4.core.OrderListV4Kt;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.core.ShipmentWidgetV2Kt;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\n2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\nH\u0001¢\u0006\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/account/orders/di/OrdersCommonModule;", "", "<init>", "()V", "Lru/ozon/app/android/account/orders/commonBarcode/CommonBarcodeConfig;", "commonBarcodeConfig", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/rounded/CommonBarcodeViewMapper;", "commonBarcodeMapper", "Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewMapper;", "commonBarcodeFulWidthMapper", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideWidgets$cs_orders_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/account/orders/commonBarcode/CommonBarcodeConfig;Lru/ozon/app/android/account/orders/commonBarcode/presentation/rounded/CommonBarcodeViewMapper;Lru/ozon/app/android/account/orders/commonBarcode/presentation/fullwidth/CommonBarcodeFullWidthViewMapper;)Ljava/util/Set;", "provideWidgets", "Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethConfig;", "config", "Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethViewMapper;", "viewMapper", "provideCommonTeeth$cs_orders_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethConfig;Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethViewMapper;)Ljava/util/Set;", "provideCommonTeeth", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerConfig;", "Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerViewMapper;", "provideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerConfig;Lru/ozon/app/android/account/orders/emptyscreen/fintech/core/OfflineFintechBannerViewMapper;)Ljava/util/Set;", "provideOfflineFintechBanner", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "provideComposeWidgets$cs_orders_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideComposeWidgets", "provideWidgetFactory$cs_orders_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideWidgetFactory", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrdersCommonModule {
    @NotNull
    public final Set<Widget2> provideCommonTeeth$cs_orders_prodGoogleAllVendorsRelease(@NotNull InternalTeethConfig config, @NotNull InternalTeethViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return e0.h(new Widget2("csma", "internalTeeth", config, new ViewMapper2[]{viewMapper}));
    }

    @NotNull
    public final Set<i> provideComposeWidgets$cs_orders_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return e0.h(CommonBarcodeV2WidgetKt.CommonBarcodeV2Widget(jsonDeserializer));
    }

    @NotNull
    public final Set<Widget2> provideOfflineFintechBanner$cs_orders_prodGoogleAllVendorsRelease(@NotNull OfflineFintechBannerConfig config, @NotNull OfflineFintechBannerViewMapper viewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
        return e0.h(new Widget2("ozonfintech", "offlineBanner", config, new ViewMapper2[]{viewMapper}));
    }

    @NotNull
    public final Set<i> provideWidgetFactory$cs_orders_prodGoogleAllVendorsRelease() {
        i[] elements = {ShipmentWidgetV2Kt.shipmentWidgetV2(), OrderListV4Kt.orderListV4()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<Widget2> provideWidgets$cs_orders_prodGoogleAllVendorsRelease(@NotNull CommonBarcodeConfig commonBarcodeConfig, @NotNull CommonBarcodeViewMapper commonBarcodeMapper, @NotNull CommonBarcodeFullWidthViewMapper commonBarcodeFulWidthMapper) {
        Intrinsics.checkNotNullParameter(commonBarcodeConfig, "commonBarcodeConfig");
        Intrinsics.checkNotNullParameter(commonBarcodeMapper, "commonBarcodeMapper");
        Intrinsics.checkNotNullParameter(commonBarcodeFulWidthMapper, "commonBarcodeFulWidthMapper");
        return e0.h(new Widget2("csma", "commonBarcode", commonBarcodeConfig, new ViewMapper2[]{commonBarcodeMapper, commonBarcodeFulWidthMapper}));
    }
}
