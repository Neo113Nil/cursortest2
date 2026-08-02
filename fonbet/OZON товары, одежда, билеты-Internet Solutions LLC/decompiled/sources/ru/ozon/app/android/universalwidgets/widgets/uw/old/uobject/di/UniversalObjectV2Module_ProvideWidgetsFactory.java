package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.UniversalWidgetFooterViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.core.UniversalObjectGrid2ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalGrid3TextInsideItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalGrid3TextOutsideItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneBannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemBannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.UniversalWidgetHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.navi.UniversalObjectNaviViewMapper;

/* loaded from: classes7.dex */
public final class UniversalObjectV2Module_ProvideWidgetsFactory implements e<Set<Widget2>> {
    public static Set<Widget2> provideWidgets(UniversalObjectV2Module universalObjectV2Module, UniversalObjectConfig universalObjectConfig, UniversalWidgetHeaderViewMapper universalWidgetHeaderViewMapper, HeaderViewMapper2 headerViewMapper2, UniversalObjectGrid2ViewMapper universalObjectGrid2ViewMapper, UniversalGrid3TextOutsideItemViewMapper universalGrid3TextOutsideItemViewMapper, UniversalGrid3TextInsideItemViewMapper universalGrid3TextInsideItemViewMapper, UniversalObjectGridOneViewMapper universalObjectGridOneViewMapper, UniversalObjectGridOneBannerViewMapper universalObjectGridOneBannerViewMapper, UniversalObjectGridOneSingleItemBannerViewMapper universalObjectGridOneSingleItemBannerViewMapper, UniversalObjectGridOneSingleItemViewMapper universalObjectGridOneSingleItemViewMapper, UniversalObjectNaviViewMapper universalObjectNaviViewMapper, UniversalWidgetFooterViewMapper universalWidgetFooterViewMapper) {
        Set<Widget2> provideWidgets = universalObjectV2Module.provideWidgets(universalObjectConfig, universalWidgetHeaderViewMapper, headerViewMapper2, universalObjectGrid2ViewMapper, universalGrid3TextOutsideItemViewMapper, universalGrid3TextInsideItemViewMapper, universalObjectGridOneViewMapper, universalObjectGridOneBannerViewMapper, universalObjectGridOneSingleItemBannerViewMapper, universalObjectGridOneSingleItemViewMapper, universalObjectNaviViewMapper, universalWidgetFooterViewMapper);
        j.d(provideWidgets);
        return provideWidgets;
    }
}
