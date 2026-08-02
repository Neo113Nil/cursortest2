package ru.ozon.app.android.returns.creation.widgets.itemsList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.delivery.viewMapper.ReturnCreationDeliveryViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.group.viewMapper.ReturnCreationGroupViewMapper;
import ru.ozon.app.android.returns.creation.molecule.returnCreationDeliveryGroup.presentation.product.viewMapper.ReturnCreationItemViewMapper;
import ru.ozon.app.android.returns.creation.widgets.itemsList.core.ReturnCreationItemsListConfig;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/itemsList/di/ReturnCreationOrderWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/creation/widgets/itemsList/core/ReturnCreationItemsListConfig;", "returnCreationGroupViewMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/group/viewMapper/ReturnCreationGroupViewMapper;", "returnCreationDeliveryViewMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/delivery/viewMapper/ReturnCreationDeliveryViewMapper;", "returnCreationItemViewMapper", "Lru/ozon/app/android/returns/creation/molecule/returnCreationDeliveryGroup/presentation/product/viewMapper/ReturnCreationItemViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "provideWidget$creation_prodGoogleAllVendorsRelease", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationOrderWidgetModule {
    @NotNull
    public final Widget2 provideWidget$creation_prodGoogleAllVendorsRelease(@NotNull ReturnCreationItemsListConfig config, @NotNull ReturnCreationGroupViewMapper returnCreationGroupViewMapper, @NotNull ReturnCreationDeliveryViewMapper returnCreationDeliveryViewMapper, @NotNull ReturnCreationItemViewMapper returnCreationItemViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(returnCreationGroupViewMapper, "returnCreationGroupViewMapper");
        Intrinsics.checkNotNullParameter(returnCreationDeliveryViewMapper, "returnCreationDeliveryViewMapper");
        Intrinsics.checkNotNullParameter(returnCreationItemViewMapper, "returnCreationItemViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return new Widget2("rms", "returnCreationItemsList", config, new ViewMapper2[]{returnCreationGroupViewMapper, returnCreationDeliveryViewMapper, returnCreationItemViewMapper, islandSeparatorViewMapper});
    }
}
