package ru.ozon.app.android.search.widgets.expandableCells.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.ExpandableCellsConfig;
import ru.ozon.app.android.search.widgets.expandableCells.core.TileGrid2SkeletonViewMapper;
import ru.ozon.app.android.search.widgets.expandableCells.core.TileScrollSkeletonViewMapper;

/* loaded from: classes7.dex */
public final class ExpandableCellsModule_ProvideExpandableCellsWidget3Factory implements e<Widget2> {
    public static Widget2 provideExpandableCellsWidget3(ExpandableCellsConfig expandableCellsConfig, ExpandableCellViewMapper expandableCellViewMapper, TileGrid2SkeletonViewMapper tileGrid2SkeletonViewMapper, TileScrollSkeletonViewMapper tileScrollSkeletonViewMapper) {
        Widget2 provideExpandableCellsWidget3 = ExpandableCellsModule.INSTANCE.provideExpandableCellsWidget3(expandableCellsConfig, expandableCellViewMapper, tileGrid2SkeletonViewMapper, tileScrollSkeletonViewMapper);
        j.d(provideExpandableCellsWidget3);
        return provideExpandableCellsWidget3;
    }
}
