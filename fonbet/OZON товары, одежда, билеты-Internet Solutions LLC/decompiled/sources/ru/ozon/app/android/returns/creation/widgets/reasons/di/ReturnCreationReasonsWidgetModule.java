package ru.ozon.app.android.returns.creation.widgets.reasons.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.itemInfo.presentation.sticky.ItemWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.core.ReturnCreationReasonsConfig;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.button.viewMapper.AddMoreButtonWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.header.viewMapper.HeaderWidgetViewMapper;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper.ReasonWidgetViewMapper;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;
import ru.ozon.app.android.returns.ui.molecules.opencloud.presentation.viewMapper.OpenCloudViewMapper;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/returns/creation/widgets/reasons/core/ReturnCreationReasonsConfig;", "openCloudViewMapper", "Lru/ozon/app/android/returns/ui/molecules/opencloud/presentation/viewMapper/OpenCloudViewMapper;", "itemWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/itemInfo/presentation/sticky/ItemWidgetViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/header/viewMapper/HeaderWidgetViewMapper;", "reasonWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonWidgetViewMapper;", "addMoreButtonWidgetViewMapper", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/button/viewMapper/AddMoreButtonWidgetViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "stickyBottomEarsWidgetMapper", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewMapper/StickyBottomEarsWidgetMapper;", "provideWidget$creation_prodGoogleAllVendorsRelease", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnCreationReasonsWidgetModule {
    @NotNull
    public final Widget2 provideWidget$creation_prodGoogleAllVendorsRelease(@NotNull ReturnCreationReasonsConfig config, @NotNull OpenCloudViewMapper openCloudViewMapper, @NotNull ItemWidgetViewMapper itemWidgetViewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper, @NotNull ReasonWidgetViewMapper reasonWidgetViewMapper, @NotNull AddMoreButtonWidgetViewMapper addMoreButtonWidgetViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper, @NotNull StickyBottomEarsWidgetMapper stickyBottomEarsWidgetMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openCloudViewMapper, "openCloudViewMapper");
        Intrinsics.checkNotNullParameter(itemWidgetViewMapper, "itemWidgetViewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        Intrinsics.checkNotNullParameter(reasonWidgetViewMapper, "reasonWidgetViewMapper");
        Intrinsics.checkNotNullParameter(addMoreButtonWidgetViewMapper, "addMoreButtonWidgetViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(stickyBottomEarsWidgetMapper, "stickyBottomEarsWidgetMapper");
        return new Widget2("rms", "returnCreationReasons", config, new ViewMapper2[]{openCloudViewMapper, itemWidgetViewMapper, headerWidgetViewMapper, reasonWidgetViewMapper, addMoreButtonWidgetViewMapper, islandSeparatorViewMapper, stickyBottomEarsWidgetMapper});
    }
}
