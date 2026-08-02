package ru.ozon.app.android.returns.cancels.cancelpostingsv2.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.core.CancelPostingsV2Config;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.annotation.CancelPostingsV2AnnotationViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.posting.CancelPostingsV2PostingViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.selectall.CancelPostingsV2SelectAllViewMapper;
import ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation.shipment.CancelPostingsV2ShipmentViewMapper;

/* loaded from: classes7.dex */
public final class CancelPostingsV2Module_Companion_ProvideCancelPostingsV2$cancels_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease(CancelPostingsV2Config cancelPostingsV2Config, CancelPostingsV2AnnotationViewMapper cancelPostingsV2AnnotationViewMapper, CancelPostingsV2SelectAllViewMapper cancelPostingsV2SelectAllViewMapper, CancelPostingsV2ShipmentViewMapper cancelPostingsV2ShipmentViewMapper, CancelPostingsV2MonopostingViewMapper cancelPostingsV2MonopostingViewMapper, CancelPostingsV2PostingViewMapper cancelPostingsV2PostingViewMapper, CancelPostingsV2ButtonViewMapper cancelPostingsV2ButtonViewMapper) {
        Widget2 provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease = CancelPostingsV2Module.INSTANCE.provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease(cancelPostingsV2Config, cancelPostingsV2AnnotationViewMapper, cancelPostingsV2SelectAllViewMapper, cancelPostingsV2ShipmentViewMapper, cancelPostingsV2MonopostingViewMapper, cancelPostingsV2PostingViewMapper, cancelPostingsV2ButtonViewMapper);
        j.d(provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease);
        return provideCancelPostingsV2$cancels_prodGoogleAllVendorsRelease;
    }
}
