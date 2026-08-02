package ru.ozon.app.android.returns.creation.widgets.itemsList.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemViewMapper;
import ru.ozon.app.android.returns.creation.widgets.itemsList.core.ReturnCreationItemsListConfig;

/* loaded from: classes7.dex */
public final class ReturnCreationOrderWidgetModule_ProvideWidget$creation_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideWidget$creation_prodGoogleAllVendorsRelease(ReturnCreationOrderWidgetModule returnCreationOrderWidgetModule, ReturnCreationItemsListConfig returnCreationItemsListConfig, ReturnCreationGroupViewMapper returnCreationGroupViewMapper, ReturnCreationDeliveryViewMapper returnCreationDeliveryViewMapper, ReturnCreationItemViewMapper returnCreationItemViewMapper, CommonIslandSeparatorViewMapper2 commonIslandSeparatorViewMapper2) {
        Widget2 provideWidget$creation_prodGoogleAllVendorsRelease = returnCreationOrderWidgetModule.provideWidget$creation_prodGoogleAllVendorsRelease(returnCreationItemsListConfig, returnCreationGroupViewMapper, returnCreationDeliveryViewMapper, returnCreationItemViewMapper, commonIslandSeparatorViewMapper2);
        j.d(provideWidget$creation_prodGoogleAllVendorsRelease);
        return provideWidget$creation_prodGoogleAllVendorsRelease;
    }
}
