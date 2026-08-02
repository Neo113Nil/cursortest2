package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.network.cache.ForceNetworkRefreshParameters;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/search/widgets/searchbar/presentation/activeSearchBar/ActiveSearchBarViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$observeViewModelAction$1", f = "SearchBarViewDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchBarViewDelegate$observeViewModelAction$1 extends j implements Function2<ActiveSearchBarViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchBarViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewDelegate$observeViewModelAction$1(SearchBarViewDelegate searchBarViewDelegate, d<? super SearchBarViewDelegate$observeViewModelAction$1> dVar) {
        super(2, dVar);
        this.this$0 = searchBarViewDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        SearchBarViewDelegate$observeViewModelAction$1 searchBarViewDelegate$observeViewModelAction$1 = new SearchBarViewDelegate$observeViewModelAction$1(this.this$0, dVar);
        searchBarViewDelegate$observeViewModelAction$1.L$0 = obj;
        return searchBarViewDelegate$observeViewModelAction$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean areLinksNotSame;
        ComposerFragmentController composerFragmentController;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ActiveSearchBarViewModel.Action action = (ActiveSearchBarViewModel.Action) this.L$0;
        if (action instanceof ActiveSearchBarViewModel.Action.SilentRefresh) {
            ActiveSearchBarViewModel.Action.SilentRefresh silentRefresh = (ActiveSearchBarViewModel.Action.SilentRefresh) action;
            areLinksNotSame = this.this$0.areLinksNotSame(silentRefresh.getUrl());
            if (areLinksNotSame) {
                composerFragmentController = this.this$0.composer;
                InterfaceC7851b.a.e(composerFragmentController.getReferences().getController(), silentRefresh.getUrl(), null, ForceNetworkRefreshParameters.INSTANCE, 2);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActiveSearchBarViewModel.Action action, d<? super Unit> dVar) {
        return ((SearchBarViewDelegate$observeViewModelAction$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
