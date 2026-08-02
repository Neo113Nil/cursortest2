package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "cellListV2ViewMapper", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "islandSeparatorViewMapper", "Ln20/i;", "TopAuthorCounterComposeWidget", "(Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;Lru/ozon/app/android/separator/core/SeparatorViewMapper;Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;)Ln20/i;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TopAuthorCounterComposeWidgetKt {
    @NotNull
    public static final i TopAuthorCounterComposeWidget(@NotNull CellListV2ViewMapper cellListV2ViewMapper, @NotNull SeparatorViewMapper separatorViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper) {
        Intrinsics.checkNotNullParameter(cellListV2ViewMapper, "cellListV2ViewMapper");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        return C6020f.b("rpProduct", "topAuthorCounter", null, new TopAuthorCounterComposeWidgetKt$TopAuthorCounterComposeWidget$1(separatorViewMapper, islandSeparatorViewMapper, cellListV2ViewMapper), 4, null);
    }
}
