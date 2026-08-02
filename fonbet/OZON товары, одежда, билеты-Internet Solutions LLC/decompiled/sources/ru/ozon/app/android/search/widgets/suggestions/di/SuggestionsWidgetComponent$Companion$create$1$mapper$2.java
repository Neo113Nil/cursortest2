package ru.ozon.app.android.search.widgets.suggestions.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.widgets.suggestions.core.SuggestionWithFilterMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/suggestions/core/SuggestionWithFilterMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SuggestionsWidgetComponent$Companion$create$1$mapper$2 extends AbstractC7737t implements Function0<SuggestionWithFilterMapper> {
    public static final SuggestionsWidgetComponent$Companion$create$1$mapper$2 INSTANCE = new SuggestionsWidgetComponent$Companion$create$1$mapper$2();

    SuggestionsWidgetComponent$Companion$create$1$mapper$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SuggestionWithFilterMapper invoke() {
        return new SuggestionWithFilterMapper();
    }
}
