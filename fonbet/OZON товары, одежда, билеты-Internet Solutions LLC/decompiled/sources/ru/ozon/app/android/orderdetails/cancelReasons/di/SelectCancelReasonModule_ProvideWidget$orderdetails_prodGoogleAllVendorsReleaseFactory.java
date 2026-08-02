package ru.ozon.app.android.orderdetails.cancelReasons.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.cancelReasons.core.SelectCancelReasonConfig;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;

/* loaded from: classes6.dex */
public final class SelectCancelReasonModule_ProvideWidget$orderdetails_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$orderdetails_prodGoogleAllVendorsRelease(SelectCancelReasonModule selectCancelReasonModule, SelectCancelReasonConfig selectCancelReasonConfig, SelectCancelReasonsViewMapper selectCancelReasonsViewMapper, SelectCancelReasonStickyViewMapper selectCancelReasonStickyViewMapper) {
        Widget2 provideWidget$orderdetails_prodGoogleAllVendorsRelease = selectCancelReasonModule.provideWidget$orderdetails_prodGoogleAllVendorsRelease(selectCancelReasonConfig, selectCancelReasonsViewMapper, selectCancelReasonStickyViewMapper);
        j.d(provideWidget$orderdetails_prodGoogleAllVendorsRelease);
        return provideWidget$orderdetails_prodGoogleAllVendorsRelease;
    }
}
