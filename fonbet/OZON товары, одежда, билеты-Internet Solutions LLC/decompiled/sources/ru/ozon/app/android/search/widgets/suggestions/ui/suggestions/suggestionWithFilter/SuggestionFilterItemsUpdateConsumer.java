package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import A00.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterVO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionFilterItemsUpdateConsumer;", "Lkotlin/Function2;", "LA00/a$J$a;", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "<init>", "()V", "oldVO", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/LayoutManagerStateSaveUpdate;", "update", "processLayoutManagerStateUpdate", "(Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/LayoutManagerStateSaveUpdate;)Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;)Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionFilterItemsUpdateConsumer implements Function2<a.J.InterfaceC0007a, SuggestionWithFilterVO, SuggestionWithFilterVO> {
    private final SuggestionWithFilterVO processLayoutManagerStateUpdate(SuggestionWithFilterVO oldVO, LayoutManagerStateSaveUpdate update) {
        long id2 = oldVO.getId();
        Long id3 = update.getId();
        return (id3 != null && id2 == id3.longValue()) ? SuggestionWithFilterVO.copy$default(oldVO, 0L, null, SuggestionWithFilterVO.SuggestionFilterItemsVO.copy$default(oldVO.getFilterItems(), null, null, null, null, update.getLayoutManagerState(), 15, null), null, 11, null) : oldVO;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public SuggestionWithFilterVO invoke(@NotNull a.J.InterfaceC0007a update, @NotNull SuggestionWithFilterVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return update instanceof LayoutManagerStateSaveUpdate ? processLayoutManagerStateUpdate(oldVO, (LayoutManagerStateSaveUpdate) update) : oldVO;
    }
}
