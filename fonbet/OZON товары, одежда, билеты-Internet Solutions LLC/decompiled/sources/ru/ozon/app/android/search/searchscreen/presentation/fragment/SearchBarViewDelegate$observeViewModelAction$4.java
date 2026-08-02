package ru.ozon.app.android.search.searchscreen.presentation.fragment;

import Sc.s;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerFragmentController;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.utils.SearchByImageUtilsKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.searchscreen.presentation.fragment.SearchBarViewDelegate$observeViewModelAction$4", f = "SearchBarViewDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SearchBarViewDelegate$observeViewModelAction$4 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchBarViewDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewDelegate$observeViewModelAction$4(SearchBarViewDelegate searchBarViewDelegate, d<? super SearchBarViewDelegate$observeViewModelAction$4> dVar) {
        super(2, dVar);
        this.this$0 = searchBarViewDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchBarViewDelegate$observeViewModelAction$4(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerFragmentController composerFragmentController;
        SearchByImageViewModel searchByImageViewModel;
        View view;
        ActiveSearchBarVO correctedSearchBarVO;
        ComposerFragmentController composerFragmentController2;
        ActiveSearchBarVO correctedSearchBarVO2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        composerFragmentController = this.this$0.composer;
        ComponentCallbacksC5392m c11 = composerFragmentController.getReferences().getContainer().c();
        if (c11 != null && (view = c11.getView()) != null) {
            correctedSearchBarVO = this.this$0.getCorrectedSearchBarVO();
            ActiveSearchBarVO.SearchByImageVO searchByImage = correctedSearchBarVO.getSearchByImage();
            NotificationDTO errorNotification = searchByImage != null ? searchByImage.getErrorNotification() : null;
            composerFragmentController2 = this.this$0.composer;
            ComposerReferences references = composerFragmentController2.getReferences();
            correctedSearchBarVO2 = this.this$0.getCorrectedSearchBarVO();
            SearchByImageUtilsKt.showErrorNotification(view, errorNotification, references, new Long(correctedSearchBarVO2.getId()));
        }
        searchByImageViewModel = this.this$0.searchByImageViewModel;
        searchByImageViewModel.clearSubscribeStateFlow();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((SearchBarViewDelegate$observeViewModelAction$4) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
