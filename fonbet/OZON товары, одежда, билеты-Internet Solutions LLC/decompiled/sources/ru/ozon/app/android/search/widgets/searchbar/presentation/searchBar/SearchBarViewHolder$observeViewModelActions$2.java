package ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar;

import Sc.s;
import Wc.a;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarVO;
import ru.ozon.app.android.search.widgets.searchbar.presentation.searchByImage.SearchByImageViewModel;
import ru.ozon.app.android.search.widgets.utils.SearchByImageUtilsKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.searchBar.SearchBarViewHolder$observeViewModelActions$2", f = "SearchBarViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class SearchBarViewHolder$observeViewModelActions$2 extends j implements Function2<Unit, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ SearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarViewHolder$observeViewModelActions$2(SearchBarViewHolder searchBarViewHolder, d<? super SearchBarViewHolder$observeViewModelActions$2> dVar) {
        super(2, dVar);
        this.this$0 = searchBarViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SearchBarViewHolder$observeViewModelActions$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        SearchByImageViewModel searchByImageViewModel;
        View view;
        ComposerReferences composerReferences2;
        SearchBarVO.SearchByImageVO searchByImage;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        composerReferences = this.this$0.references;
        ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
        if (c11 != null && (view = c11.getView()) != null) {
            SearchBarVO boundData = this.this$0.getBoundData();
            NotificationDTO errorNotification = (boundData == null || (searchByImage = boundData.getSearchByImage()) == null) ? null : searchByImage.getErrorNotification();
            composerReferences2 = this.this$0.references;
            SearchBarVO boundData2 = this.this$0.getBoundData();
            SearchByImageUtilsKt.showErrorNotification(view, errorNotification, composerReferences2, boundData2 != null ? new Long(boundData2.getId()) : null);
        }
        searchByImageViewModel = this.this$0.searchByImageViewModel;
        searchByImageViewModel.clearSubscribeStateFlow();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, d<? super Unit> dVar) {
        return ((SearchBarViewHolder$observeViewModelActions$2) create(unit, dVar)).invokeSuspend(Unit.f71690a);
    }
}
