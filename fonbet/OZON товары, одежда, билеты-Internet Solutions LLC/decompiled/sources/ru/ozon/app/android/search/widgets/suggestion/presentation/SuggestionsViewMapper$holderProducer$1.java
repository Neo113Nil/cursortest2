package ru.ozon.app.android.search.widgets.suggestion.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/suggestion/presentation/SuggestionViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SuggestionsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SuggestionViewHolder> {
    final /* synthetic */ SuggestionsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionsViewMapper$holderProducer$1(SuggestionsViewMapper suggestionsViewMapper) {
        super(2);
        this.this$0 = suggestionsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SuggestionViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        HandlersInhibitor handlersInhibitor = this.this$0.component().getHandlersInhibitor();
        SearchUrlPrefetchService searchUrlPrefetchService = this.this$0.component().searchUrlPrefetchService();
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final SuggestionsViewMapper suggestionsViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.suggestion.presentation.SuggestionsViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActiveSearchBarViewModel activeSearchBarViewModel = SuggestionsViewMapper.this.component().viewModel().get();
                Intrinsics.g(activeSearchBarViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return activeSearchBarViewModel;
            }
        }).a(ActiveSearchBarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new SuggestionViewHolder(view, refs, handlersInhibitor, searchUrlPrefetchService, (ActiveSearchBarViewModel) a12);
    }
}
