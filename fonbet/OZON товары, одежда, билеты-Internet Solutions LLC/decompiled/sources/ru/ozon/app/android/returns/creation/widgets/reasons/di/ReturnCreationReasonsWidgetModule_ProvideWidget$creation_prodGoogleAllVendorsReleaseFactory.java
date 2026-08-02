package ru.ozon.app.android.returns.creation.widgets.reasons.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.core.ReturnCreationReasonsConfig;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.button.viewMapper.AddMoreButtonWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewMapper.HeaderWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper.ReasonWidgetViewMapper;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper.OpenCloudViewMapper;

/* loaded from: classes7.dex */
public final class ReturnCreationReasonsWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$creation_prodGoogleAllVendorsRelease(ReturnCreationReasonsWidgetModule returnCreationReasonsWidgetModule, ReturnCreationReasonsConfig returnCreationReasonsConfig, OpenCloudViewMapper openCloudViewMapper, ItemWidgetViewMapper itemWidgetViewMapper, HeaderWidgetViewMapper headerWidgetViewMapper, ReasonWidgetViewMapper reasonWidgetViewMapper, AddMoreButtonWidgetViewMapper addMoreButtonWidgetViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, StickyBottomEarsWidgetMapper stickyBottomEarsWidgetMapper) {
        Widget2 provideWidget$creation_prodGoogleAllVendorsRelease = returnCreationReasonsWidgetModule.provideWidget$creation_prodGoogleAllVendorsRelease(returnCreationReasonsConfig, openCloudViewMapper, itemWidgetViewMapper, headerWidgetViewMapper, reasonWidgetViewMapper, addMoreButtonWidgetViewMapper, commonIslandSeparatorViewMapper2, stickyBottomEarsWidgetMapper);
        j.d(provideWidget$creation_prodGoogleAllVendorsRelease);
        return provideWidget$creation_prodGoogleAllVendorsRelease;
    }
}
