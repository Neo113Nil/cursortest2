package ru.ozon.app.android.returns.creation.widgets.orders.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.cscore.extendBackground.presentation.ExtendBackgroundViewMapper;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemViewMapper;
import ru.ozon.app.android.returns.creation.widgets.orders.core.ReturnCreationOrdersConfig;
import ru.ozon.app.android.returns.creation.widgets.orders.presentation.pagination.viewMapper.PaginationViewMapper;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper.OpenCloudViewMapper;

/* loaded from: classes7.dex */
public final class ReturnCreationOrdersWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$creation_prodGoogleAllVendorsRelease(ReturnCreationOrdersWidgetModule returnCreationOrdersWidgetModule, ReturnCreationOrdersConfig returnCreationOrdersConfig, OpenCloudViewMapper openCloudViewMapper, ReturnCreationGroupViewMapper returnCreationGroupViewMapper, ReturnCreationDeliveryViewMapper returnCreationDeliveryViewMapper, ReturnCreationItemViewMapper returnCreationItemViewMapper, PaginationViewMapper paginationViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2, ExtendBackgroundViewMapper extendBackgroundViewMapper) {
        Widget2 provideWidget$creation_prodGoogleAllVendorsRelease = returnCreationOrdersWidgetModule.provideWidget$creation_prodGoogleAllVendorsRelease(returnCreationOrdersConfig, openCloudViewMapper, returnCreationGroupViewMapper, returnCreationDeliveryViewMapper, returnCreationItemViewMapper, paginationViewMapper, commonIslandSeparatorViewMapper2, extendBackgroundViewMapper);
        j.d(provideWidget$creation_prodGoogleAllVendorsRelease);
        return provideWidget$creation_prodGoogleAllVendorsRelease;
    }
}
