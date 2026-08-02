package ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.delegate.FavoriteEntityViewHolderDelegate;
import ru.ozon.app.android.minifyLink.presentation.MinifyLinkViewModel;
import ru.ozon.app.android.search.widgets.searchResult.header.di.SearchResultHeaderComponent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/searchResult/header/headerView/presentation/SearchResultHeaderViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SearchResultHeaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SearchResultHeaderViewHolder> {
    final /* synthetic */ SearchResultHeaderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchResultHeaderViewMapper$holderProducer$1(SearchResultHeaderViewMapper searchResultHeaderViewMapper) {
        super(2);
        this.this$0 = searchResultHeaderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final SearchResultHeaderViewHolder invoke(View view, ComposerReferences composerReferences) {
        SearchResultHeaderComponent searchResultHeaderComponent;
        SearchResultHeaderComponent searchResultHeaderComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final SearchResultHeaderViewMapper searchResultHeaderViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchResult.header.headerView.presentation.SearchResultHeaderViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                SearchResultHeaderComponent searchResultHeaderComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                searchResultHeaderComponent3 = SearchResultHeaderViewMapper.this.component;
                MinifyLinkViewModel minifyLinkViewModel = searchResultHeaderComponent3.getViewModelProvider().get();
                Intrinsics.g(minifyLinkViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return minifyLinkViewModel;
            }
        }).a(MinifyLinkViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        MinifyLinkViewModel minifyLinkViewModel = (MinifyLinkViewModel) a12;
        searchResultHeaderComponent = this.this$0.component;
        FavoriteEntityViewHolderDelegate favoriteEntityViewHolderDelegate = new FavoriteEntityViewHolderDelegate(view, searchResultHeaderComponent.getFavoriteEntityInteractor(), composerReferences);
        searchResultHeaderComponent2 = this.this$0.component;
        return new SearchResultHeaderViewHolder(view, minifyLinkViewModel, favoriteEntityViewHolderDelegate, composerReferences, searchResultHeaderComponent2.getTokenizedAnalytics());
    }
}
