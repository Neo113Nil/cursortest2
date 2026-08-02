package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.dialogsearchscreen.searchbar.common.PageRefreshState;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "refreshModel", "Lru/ozon/app/android/search/dialogsearchscreen/searchbar/common/PageRefreshState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$subscribePageRefreshModel$1", f = "DialogSearchTopFiltersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$subscribePageRefreshModel$1 extends j implements Function2<PageRefreshState, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$subscribePageRefreshModel$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, d<? super DialogSearchTopFiltersFragment$subscribePageRefreshModel$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchTopFiltersFragment$subscribePageRefreshModel$1 dialogSearchTopFiltersFragment$subscribePageRefreshModel$1 = new DialogSearchTopFiltersFragment$subscribePageRefreshModel$1(this.this$0, dVar);
        dialogSearchTopFiltersFragment$subscribePageRefreshModel$1.L$0 = obj;
        return dialogSearchTopFiltersFragment$subscribePageRefreshModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        DialogSearchTopFiltersFragment.refreshPage$default(this.this$0, (PageRefreshState) this.L$0, false, 2, null);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PageRefreshState pageRefreshState, d<? super Unit> dVar) {
        return ((DialogSearchTopFiltersFragment$subscribePageRefreshModel$1) create(pageRefreshState, dVar)).invokeSuspend(Unit.f71690a);
    }
}
