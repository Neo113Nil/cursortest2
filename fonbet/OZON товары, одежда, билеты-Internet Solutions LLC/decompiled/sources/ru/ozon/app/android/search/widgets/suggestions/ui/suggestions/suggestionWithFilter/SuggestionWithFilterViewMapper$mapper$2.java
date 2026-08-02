package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.suggestions.core.SuggestionWithFilterMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SuggestionWithFilterViewMapper$mapper$2 extends AbstractC7737t implements Function0<SuggestionWithFilterMapper> {
    final /* synthetic */ SuggestionWithFilterViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionWithFilterViewMapper$mapper$2(SuggestionWithFilterViewMapper suggestionWithFilterViewMapper) {
        super(0);
        this.this$0 = suggestionWithFilterViewMapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SuggestionWithFilterMapper invoke() {
        return this.this$0.component().getMapper();
    }
}
