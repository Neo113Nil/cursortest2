package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.actionHandlers.RedirectWithPrefetchActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.app.android.search.databinding.ItemSuggestionsCellBinding;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.suggestions.ui.common.SuggestionsActionHandlerFactory;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/cell/SuggestionsCellViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SuggestionsCellViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SuggestionsCellViewHolder> {
    final /* synthetic */ SuggestionsCellViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestionsCellViewMapper$holderProducer$1(SuggestionsCellViewMapper suggestionsCellViewMapper) {
        super(2);
        this.this$0 = suggestionsCellViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SuggestionsCellViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final SuggestionsCellViewMapper suggestionsCellViewMapper = this.this$0;
        ActiveSearchBarViewModel activeSearchBarViewModel = (ActiveSearchBarViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.cell.SuggestionsCellViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActiveSearchBarViewModel activeSearchBarViewModel2 = SuggestionsCellViewMapper.this.component().getActiveSearchBarViewModelProvider().get();
                Intrinsics.g(activeSearchBarViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return activeSearchBarViewModel2;
            }
        }).a(ActiveSearchBarViewModel.class);
        ItemSuggestionsCellBinding bind = ItemSuggestionsCellBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        return new SuggestionsCellViewHolder(bind, new SuggestionsCellViewMapper$sam$ru_ozon_composer_analytics_tokenized_CustomParamsModifier$0(ActiveSearchBarViewModel.m980pageIdModifierUsgXMg$default(activeSearchBarViewModel, null, 1, null)), new SuggestionsActionHandlerFactory(refs, this.this$0.component().getCustomActionHandlersStoreFactory().create(RedirectWithPrefetchActionHandler.class, ComposerActionWithActionHandler.class)));
    }
}
