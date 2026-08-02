package ru.ozon.app.android.search.widgets.expandableCells.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellsConfig;
import ru.ozon.app.android.search.widgets.expandableCells.core.TileGrid2SkeletonViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.TileScrollSkeletonViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/di/ExpandableCellsModule;", "", "<init>", "()V", "provideExpandableCellsWidget3", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "expandableCellsConfig", "Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellsConfig;", "expandableCellViewMapper", "Lru/ozon/app/android/search/widgets/expandableCells/core/ExpandableCellViewMapper;", "tileGrid2SkeletonViewMapper", "Lru/ozon/app/android/search/widgets/expandableCells/core/TileGrid2SkeletonViewMapper;", "tileScrollSkeletonViewMapper", "Lru/ozon/app/android/search/widgets/expandableCells/core/TileScrollSkeletonViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExpandableCellsModule {

    @NotNull
    public static final ExpandableCellsModule INSTANCE = new ExpandableCellsModule();

    private ExpandableCellsModule() {
    }

    @NotNull
    public final Widget2 provideExpandableCellsWidget3(@NotNull ExpandableCellsConfig expandableCellsConfig, @NotNull ExpandableCellViewMapper expandableCellViewMapper, @NotNull TileGrid2SkeletonViewMapper tileGrid2SkeletonViewMapper, @NotNull TileScrollSkeletonViewMapper tileScrollSkeletonViewMapper) {
        Intrinsics.checkNotNullParameter(expandableCellsConfig, "expandableCellsConfig");
        Intrinsics.checkNotNullParameter(expandableCellViewMapper, "expandableCellViewMapper");
        Intrinsics.checkNotNullParameter(tileGrid2SkeletonViewMapper, "tileGrid2SkeletonViewMapper");
        Intrinsics.checkNotNullParameter(tileScrollSkeletonViewMapper, "tileScrollSkeletonViewMapper");
        return new Widget2("catalog", "expandableCells", expandableCellsConfig, new ViewMapper2[]{expandableCellViewMapper, tileGrid2SkeletonViewMapper, tileScrollSkeletonViewMapper});
    }
}
