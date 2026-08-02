package ru.ozon.app.android.commonwidgets.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellListV2.core.CellListV2Config;
import ru.ozon.app.android.commonwidgets.widgets.error.data.ErrorConfig;
import ru.ozon.app.android.commonwidgets.widgets.error.presentation.ErrorViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.serviceCarousel.data.ServiceCarouselConfig;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

/* loaded from: classes6.dex */
public final class CommonWidgetsV2DiModule_ProvideWidget$widgets_prodGoogleAllVendorsReleaseFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease(CellListV2Config cellListV2Config, CellListV2ViewMapper cellListV2ViewMapper, ErrorConfig errorConfig, ErrorViewMapper errorViewMapper, ServiceCarouselConfig serviceCarouselConfig, ServiceCarouselViewMapper serviceCarouselViewMapper) {
        Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease = CommonWidgetsV2DiModule.INSTANCE.provideWidget$widgets_prodGoogleAllVendorsRelease(cellListV2Config, cellListV2ViewMapper, errorConfig, errorViewMapper, serviceCarouselConfig, serviceCarouselViewMapper);
        j.d(provideWidget$widgets_prodGoogleAllVendorsRelease);
        return provideWidget$widgets_prodGoogleAllVendorsRelease;
    }
}
