package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewHolder", f = "SuggestionWithFilterViewHolder.kt", l = {243}, m = "showOnboardingWithDebounce")
/* loaded from: classes13.dex */
final class SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuggestionWithFilterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1(SuggestionWithFilterViewHolder suggestionWithFilterViewHolder, d<? super SuggestionWithFilterViewHolder$showOnboardingWithDebounce$1> dVar) {
        super(dVar);
        this.this$0 = suggestionWithFilterViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Object showOnboardingWithDebounce;
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        showOnboardingWithDebounce = this.this$0.showOnboardingWithDebounce(this);
        return showOnboardingWithDebounce;
    }
}
