package ru.ozon.app.android.returns.cancels.cancelReasons.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.returns.cancels.cancelReasons.core.SelectCancelReasonConfig;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.reasons.SelectCancelReasonsViewMapper;
import ru.ozon.app.android.returns.cancels.cancelReasons.presentation.sticky.SelectCancelReasonStickyViewMapper;

/* loaded from: classes7.dex */
public final class SelectCancelReasonModule_ProvideWidget$cancels_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$cancels_prodGoogleAllVendorsRelease(SelectCancelReasonModule selectCancelReasonModule, SelectCancelReasonConfig selectCancelReasonConfig, SelectCancelReasonsViewMapper selectCancelReasonsViewMapper, SelectCancelReasonStickyViewMapper selectCancelReasonStickyViewMapper) {
        Widget2 provideWidget$cancels_prodGoogleAllVendorsRelease = selectCancelReasonModule.provideWidget$cancels_prodGoogleAllVendorsRelease(selectCancelReasonConfig, selectCancelReasonsViewMapper, selectCancelReasonStickyViewMapper);
        j.d(provideWidget$cancels_prodGoogleAllVendorsRelease);
        return provideWidget$cancels_prodGoogleAllVendorsRelease;
    }
}
