package ru.ozon.app.android.search.widgets.dialogSearchBar.presentation;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarViewHolder$onWidgetCreated$1", f = "DialogSearchBarViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchBarViewHolder$onWidgetCreated$1 extends j implements Function2<a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchBarViewHolder$onWidgetCreated$1(DialogSearchBarViewHolder dialogSearchBarViewHolder, d<? super DialogSearchBarViewHolder$onWidgetCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchBarViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchBarViewHolder$onWidgetCreated$1 dialogSearchBarViewHolder$onWidgetCreated$1 = new DialogSearchBarViewHolder$onWidgetCreated$1(this.this$0, dVar);
        dialogSearchBarViewHolder$onWidgetCreated$1.L$0 = obj;
        return dialogSearchBarViewHolder$onWidgetCreated$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((DialogSearchBarViewHolder$onWidgetCreated$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DialogSearchViewModel dialogSearchViewModel;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        if (((a) this.L$0) instanceof a.G) {
            dialogSearchViewModel = this.this$0.viewModel;
            dialogSearchViewModel.onSearchInputState(false);
        }
        return Unit.f71690a;
    }
}
