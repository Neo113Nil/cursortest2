package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.core;

import android.annotation.SuppressLint;
import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.buttonwidget.core.ButtonV3ViewMapper;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.islandSeparator.core.CommonIslandSeparatorViewMapper2;
import ru.ozon.app.android.separator.core.SeparatorViewMapper;
import ru.ozon.app.android.widgets.plainText.core.PlainTextViewMapper2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/widgets/plainText/core/PlainTextViewMapper2;", "plainTextViewMapper2", "Lru/ozon/app/android/separator/core/SeparatorViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;", "islandSeparatorViewMapper", "Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "cellListV2ViewMapper", "Lru/ozon/app/android/common/buttonwidget/core/ButtonV3ViewMapper;", "buttonV3ViewMapper", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "ReviewStatusInfoComposeWidget", "(Lru/ozon/app/android/widgets/plainText/core/PlainTextViewMapper2;Lru/ozon/app/android/separator/core/SeparatorViewMapper;Lru/ozon/app/android/islandSeparator/core/CommonIslandSeparatorViewMapper2;Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;Lru/ozon/app/android/common/buttonwidget/core/ButtonV3ViewMapper;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewStatusInfoComposeWidgetKt {
    @SuppressLint({"RequiredDslCall"})
    @NotNull
    public static final i ReviewStatusInfoComposeWidget(@NotNull PlainTextViewMapper2 plainTextViewMapper2, @NotNull SeparatorViewMapper separatorViewMapper, @NotNull CommonIslandSeparatorViewMapper2 islandSeparatorViewMapper, @NotNull CellListV2ViewMapper cellListV2ViewMapper, @NotNull ButtonV3ViewMapper buttonV3ViewMapper, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(plainTextViewMapper2, "plainTextViewMapper2");
        Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
        Intrinsics.checkNotNullParameter(islandSeparatorViewMapper, "islandSeparatorViewMapper");
        Intrinsics.checkNotNullParameter(cellListV2ViewMapper, "cellListV2ViewMapper");
        Intrinsics.checkNotNullParameter(buttonV3ViewMapper, "buttonV3ViewMapper");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "reviewStatusInfo", null, new ReviewStatusInfoComposeWidgetKt$ReviewStatusInfoComposeWidget$1(plainTextViewMapper2, separatorViewMapper, islandSeparatorViewMapper, cellListV2ViewMapper, buttonV3ViewMapper, jsonDeserializer), 4, null);
    }
}
