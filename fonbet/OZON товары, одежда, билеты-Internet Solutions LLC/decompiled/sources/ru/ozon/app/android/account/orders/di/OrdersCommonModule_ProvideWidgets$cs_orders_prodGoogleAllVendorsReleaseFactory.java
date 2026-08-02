package ru.ozon.app.android.account.orders.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.account.orders.commonBarcode.CommonBarcodeConfig;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewMapper;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.rounded.CommonBarcodeViewMapper;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class OrdersCommonModule_ProvideWidgets$cs_orders_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets$cs_orders_prodGoogleAllVendorsRelease(OrdersCommonModule ordersCommonModule, CommonBarcodeConfig commonBarcodeConfig, CommonBarcodeViewMapper commonBarcodeViewMapper, CommonBarcodeFullWidthViewMapper commonBarcodeFullWidthViewMapper) {
        Set<Widget2> provideWidgets$cs_orders_prodGoogleAllVendorsRelease = ordersCommonModule.provideWidgets$cs_orders_prodGoogleAllVendorsRelease(commonBarcodeConfig, commonBarcodeViewMapper, commonBarcodeFullWidthViewMapper);
        j.d(provideWidgets$cs_orders_prodGoogleAllVendorsRelease);
        return provideWidgets$cs_orders_prodGoogleAllVendorsRelease;
    }
}
