package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "model", "Lru/ozon/app/android/search/widgets/dialogSearchBar/presentation/DialogSearchBarVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$subscribeSearchBarModel$1", f = "DialogSearchTopFiltersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$subscribeSearchBarModel$1 extends j implements Function2<DialogSearchBarVO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$subscribeSearchBarModel$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, d<? super DialogSearchTopFiltersFragment$subscribeSearchBarModel$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchTopFiltersFragment$subscribeSearchBarModel$1 dialogSearchTopFiltersFragment$subscribeSearchBarModel$1 = new DialogSearchTopFiltersFragment$subscribeSearchBarModel$1(this.this$0, dVar);
        dialogSearchTopFiltersFragment$subscribeSearchBarModel$1.L$0 = obj;
        return dialogSearchTopFiltersFragment$subscribeSearchBarModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DialogSearchBarVO dialogSearchBarVO = (DialogSearchBarVO) this.L$0;
        this.this$0.updateSearchBar(dialogSearchBarVO);
        this.this$0.trackViewEvent(dialogSearchBarVO.getWidgetRefresh().getTracking());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DialogSearchBarVO dialogSearchBarVO, d<? super Unit> dVar) {
        return ((DialogSearchTopFiltersFragment$subscribeSearchBarModel$1) create(dialogSearchBarVO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
