package ru.ozon.app.android.ugc.core.widgets.rowList.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.pdp.utils.CellExtKt;
import ru.ozon.app.android.ugc.core.widgets.rowList.presentation.RowListItemVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Ln20/i;", "RowListComposeWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "", "authorId", "", "isSelected", "updateIfAuthorMatches", "(Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;Ljava/lang/String;Z)Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RowListComposeWidgetKt {
    @NotNull
    public static final i RowListComposeWidget(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        return C6020f.b("rpProduct", "rowList", null, new RowListComposeWidgetKt$RowListComposeWidget$1(jsonDeserializer), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RowListItemVO updateIfAuthorMatches(RowListItemVO rowListItemVO, String str, boolean z11) {
        return Intrinsics.d(CellExtKt.getRightBlockParam(rowListItemVO.getNormal(), "authorId"), str) ? RowListItemVO.copy$default(rowListItemVO, 0L, z11, null, null, null, 29, null) : rowListItemVO;
    }
}
