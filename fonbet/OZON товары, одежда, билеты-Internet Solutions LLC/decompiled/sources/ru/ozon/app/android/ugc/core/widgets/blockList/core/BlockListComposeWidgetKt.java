package ru.ozon.app.android.ugc.core.widgets.blockList.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "cellListV2ViewMapper", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "BlockListComposeWidget", "(Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BlockListComposeWidgetKt {
    @NotNull
    public static final i BlockListComposeWidget(@NotNull CellListV2ViewMapper cellListV2ViewMapper, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(cellListV2ViewMapper, "cellListV2ViewMapper");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "blockList", null, new BlockListComposeWidgetKt$BlockListComposeWidget$1(cellListV2ViewMapper, jsonDeserializer), 4, null);
    }
}
