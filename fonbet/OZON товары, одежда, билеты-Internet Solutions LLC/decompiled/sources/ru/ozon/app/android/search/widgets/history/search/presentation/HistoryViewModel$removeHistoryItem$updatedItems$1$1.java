package ru.ozon.app.android.search.widgets.history.search.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.widgets.history.search.presentation.HistoryItem;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryItem;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class HistoryViewModel$removeHistoryItem$updatedItems$1$1 extends AbstractC7737t implements Function1<HistoryItem, Boolean> {
    final /* synthetic */ Map<String, String> $params;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewModel$removeHistoryItem$updatedItems$1$1(Map<String, String> map) {
        super(1);
        this.$params = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(HistoryItem it) {
        TagButtonDTO tagButton;
        CommonControlSettings closeControlSettings;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, String> map = null;
        HistoryItem.TagButtonVO tagButtonVO = it instanceof HistoryItem.TagButtonVO ? (HistoryItem.TagButtonVO) it : null;
        if (tagButtonVO != null && (tagButton = tagButtonVO.getTagButton()) != null && (closeControlSettings = tagButton.getCloseControlSettings()) != null && (action = closeControlSettings.getAction()) != null) {
            map = action.getParams();
        }
        return Boolean.valueOf(Intrinsics.d(map, this.$params));
    }
}
