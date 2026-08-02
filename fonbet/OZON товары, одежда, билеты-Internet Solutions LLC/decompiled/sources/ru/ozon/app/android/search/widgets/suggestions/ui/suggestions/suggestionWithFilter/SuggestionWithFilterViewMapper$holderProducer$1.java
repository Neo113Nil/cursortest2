package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import Vg.d;
import WZ.l;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.search.databinding.SuggestFilterItemsBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/SuggestionWithFilterViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SuggestionWithFilterViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SuggestionWithFilterViewHolder> {
    final /* synthetic */ SuggestionWithFilterViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionWithFilterViewMapper$holderProducer$1(SuggestionWithFilterViewMapper suggestionWithFilterViewMapper) {
        super(2);
        this.this$0 = suggestionWithFilterViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SuggestionWithFilterViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        HandlersInhibitor handlersInhibitor = this.this$0.component().getHandlersInhibitor();
        SuggestFilterItemsBinding bind = SuggestFilterItemsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        h viewModelOwnerProvider = composerReferences.getViewModelOwnerProvider();
        final SuggestionWithFilterViewMapper suggestionWithFilterViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter.SuggestionWithFilterViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SuggestionWithFilterSharedViewModel suggestionWithFilterSharedViewModel = SuggestionWithFilterViewMapper.this.component().getSuggestionWithFilterSharedViewModelProvider().get();
                Intrinsics.g(suggestionWithFilterSharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return suggestionWithFilterSharedViewModel;
            }
        }).a(SuggestionWithFilterSharedViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new SuggestionWithFilterViewHolder(composerReferences, handlersInhibitor, bind, customActionHandlersStoreFactory, tokenizedAnalytics, (SuggestionWithFilterSharedViewModel) a11);
    }
}
