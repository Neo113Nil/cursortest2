package ru.ozon.app.android.search.widgets.suggestions.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.suggestions.data.SuggestionsDTO;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterVO;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterVOKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionWithFilter;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/suggestions/data/SuggestionsDTO$SuggestionWithFilter;Ll20/d;)Ljava/util/List;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SuggestionWithFilterMapper implements Function2<SuggestionsDTO.SuggestionWithFilter, d, List<? extends SuggestionWithFilterVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SuggestionWithFilterVO> invoke(@NotNull SuggestionsDTO.SuggestionWithFilter state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        TextDTO title = state.getFilter().getTitle();
        StringBuilder sb2 = new StringBuilder(String.valueOf(title != null ? title.getText() : null));
        for (BadgeDTO badgeDTO : state.getFilter().getValues()) {
            sb2.append(",");
            sb2.append(badgeDTO.getText());
        }
        return C7714v.a0(SuggestionWithFilterVOKt.toVo$default(state, sb2.toString().hashCode(), null, state.getIslandColor(), 2, null));
    }
}
