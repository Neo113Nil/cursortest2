package ru.ozon.app.android.search.widgets.history.search.presentation;

import WZ.l;
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
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/history/search/presentation/HistoryViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class HistoryViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, HistoryViewHolder> {
    final /* synthetic */ HistoryViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HistoryViewMapper$holderProducer$1(HistoryViewMapper historyViewMapper) {
        super(2);
        this.this$0 = historyViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final HistoryViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        SearchUrlPrefetchService searchUrlPrefetchService = this.this$0.component().getSearchUrlPrefetchService();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        HistoryView historyView = (HistoryView) view;
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final HistoryViewMapper historyViewMapper = this.this$0;
        ActiveSearchBarViewModel activeSearchBarViewModel = (ActiveSearchBarViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ActiveSearchBarViewModel activeSearchBarViewModel2 = HistoryViewMapper.this.component().getActiveSearchBarViewModel();
                Intrinsics.g(activeSearchBarViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return activeSearchBarViewModel2;
            }
        }).a(ActiveSearchBarViewModel.class);
        B0 a12 = refs.getViewModelOwnerProvider().a();
        final HistoryViewMapper historyViewMapper2 = this.this$0;
        return new HistoryViewHolder(searchUrlPrefetchService, refs, historyView, activeSearchBarViewModel, (HistoryViewModel) new z0(a12, new z0.c() { // from class: ru.ozon.app.android.search.widgets.history.search.presentation.HistoryViewMapper$holderProducer$1$invoke$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                HistoryViewModel historyViewModel = HistoryViewMapper.this.component().getHistoryViewModel();
                Intrinsics.g(historyViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return historyViewModel;
            }
        }).a(HistoryViewModel.class), tokenizedAnalytics);
    }
}
