package ru.ozon.app.android.cml.delivery.widgets.cellList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.widgets.cellList.data.CmlCellListConfig;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.buttons.viewMapper.ButtonsViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.cellList.viewMapper.CellListViewMapper;
import ru.ozon.app.android.cml.delivery.widgets.cellList.presentation.header.viewMapper.HeaderViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/di/CmlCellListModule;", "", "<init>", "()V", "provideCmlCellListWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/cml/delivery/widgets/cellList/data/CmlCellListConfig;", "headerViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/header/viewMapper/HeaderViewMapper;", "cellListViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/cellList/viewMapper/CellListViewMapper;", "buttonsViewMapper", "Lru/ozon/app/android/cml/delivery/widgets/cellList/presentation/buttons/viewMapper/ButtonsViewMapper;", "islandSeparatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "separatorViewMapper", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlCellListModule {

    @NotNull
    public static final CmlCellListModule INSTANCE = new CmlCellListModule();

    private CmlCellListModule() {
    }

    @NotNull
    public final Widget2 provideCmlCellListWidget(@NotNull CmlCellListConfig config, @NotNull HeaderViewMapper headerViewMapper, @NotNull CellListViewMapper cellListViewMapper, @NotNull ButtonsViewMapper buttonsViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper, @NotNull SeparatorViewMapper separatorViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(cellListViewMapper, "cellListViewMapper");
        Intrinsics.checkNotNullParameter(buttonsViewMapper, "buttonsViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        return new Widget2("cml", "cellList", config, new ViewMapper2[]{headerViewMapper, cellListViewMapper, buttonsViewMapper, islandSeparatorViewMapper, separatorViewMapper});
    }
}
