package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterSharedViewModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1", f = "SuggestionWithFilterViewHolder.kt", l = {229}, m = "emit")
/* loaded from: classes13.dex */
final class SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1(SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1.AnonymousClass1<? super T> anonymousClass1, d<? super SuggestionWithFilterViewHolder$subscribeOnOnboardingEvents$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.emit((SuggestionWithFilterSharedViewModel.PresentationEvents) null, (d<? super Unit>) this);
    }
}
