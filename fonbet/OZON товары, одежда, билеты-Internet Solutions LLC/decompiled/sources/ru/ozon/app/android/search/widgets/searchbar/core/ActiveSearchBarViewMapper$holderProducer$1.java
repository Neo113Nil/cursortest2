package ru.ozon.app.android.search.widgets.searchbar.core;

import WZ.l;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.common.SearchUrlPrefetchService;
import ru.ozon.app.android.commonvertical.sharedCarouselViewModel.SharedCarouselViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchSuggestionsFragment;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewHolder;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewModel;
import ru.ozon.app.android.search.widgets.tapTags.v3.presentation.TapTagsV3ViewModel;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarVO;", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class ActiveSearchBarViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, k<ActiveSearchBarVO>> {
    final /* synthetic */ ActiveSearchBarViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewMapper$holderProducer$1(ActiveSearchBarViewMapper activeSearchBarViewMapper) {
        super(2);
        this.this$0 = activeSearchBarViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<ActiveSearchBarVO> invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        ComponentCallbacksC5392m c11 = references.getContainer().c();
        if ((c11 != null ? c11.getParentFragment() : null) instanceof SearchSuggestionsFragment) {
            return new k<ActiveSearchBarVO>(new View(view.getContext())) { // from class: ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper$holderProducer$1.5
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // ru.ozon.composer.ui.widget.k
                public void bind(ActiveSearchBarVO item, d info) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    Intrinsics.checkNotNullParameter(info, "info");
                }
            };
        }
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        SearchUrlPrefetchService searchUrlPrefetchService = this.this$0.component().searchUrlPrefetchService();
        B0 b11 = references.getViewModelOwnerProvider().b();
        final ActiveSearchBarViewMapper activeSearchBarViewMapper = this.this$0;
        w0 a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SharedCarouselViewModel sharedCarouselViewModel = ActiveSearchBarViewMapper.this.component().sharedCarouselViewModel().get();
                Intrinsics.g(sharedCarouselViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return sharedCarouselViewModel;
            }
        }).a(SharedCarouselViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        SharedCarouselViewModel sharedCarouselViewModel = (SharedCarouselViewModel) a11;
        B0 a12 = references.getViewModelOwnerProvider().a();
        final ActiveSearchBarViewMapper activeSearchBarViewMapper2 = this.this$0;
        w0 a13 = new z0(a12, new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActiveSearchBarViewModel activeSearchBarViewModel = ActiveSearchBarViewMapper.this.component().viewModel().get();
                Intrinsics.g(activeSearchBarViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return activeSearchBarViewModel;
            }
        }).a(ActiveSearchBarViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a13, "viewModel(...)");
        ActiveSearchBarViewModel activeSearchBarViewModel = (ActiveSearchBarViewModel) a13;
        B0 a14 = references.getViewModelOwnerProvider().a();
        final ActiveSearchBarViewMapper activeSearchBarViewMapper3 = this.this$0;
        w0 a15 = new z0(a14, new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper$holderProducer$1$invoke$$inlined$viewModel$3
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TapTagsV2ViewModel tapTagsV2ViewModel = ActiveSearchBarViewMapper.this.component().tapTagsV2ViewModel().get();
                Intrinsics.g(tapTagsV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tapTagsV2ViewModel;
            }
        }).a(TapTagsV2ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a15, "viewModel(...)");
        TapTagsV2ViewModel tapTagsV2ViewModel = (TapTagsV2ViewModel) a15;
        B0 a16 = references.getViewModelOwnerProvider().a();
        final ActiveSearchBarViewMapper activeSearchBarViewMapper4 = this.this$0;
        w0 a17 = new z0(a16, new z0.c() { // from class: ru.ozon.app.android.search.widgets.searchbar.core.ActiveSearchBarViewMapper$holderProducer$1$invoke$$inlined$viewModel$4
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TapTagsV3ViewModel tapTagsV3ViewModel = ActiveSearchBarViewMapper.this.component().tapTagsV3ViewModel().get();
                Intrinsics.g(tapTagsV3ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tapTagsV3ViewModel;
            }
        }).a(TapTagsV3ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a17, "viewModel(...)");
        return new ActiveSearchBarViewHolder(view, references, tokenizedAnalytics, searchUrlPrefetchService, sharedCarouselViewModel, activeSearchBarViewModel, tapTagsV2ViewModel, (TapTagsV3ViewModel) a17);
    }
}
