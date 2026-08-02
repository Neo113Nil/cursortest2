package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.databinding.FragmentDialogSearchCoordinatorBinding;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "newQuery", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.withTopFilters.DialogSearchTopFiltersFragment$subscribeTapTagQuery$1", f = "DialogSearchTopFiltersFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$subscribeTapTagQuery$1 extends j implements Function2<String, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$subscribeTapTagQuery$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment, d<? super DialogSearchTopFiltersFragment$subscribeTapTagQuery$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DialogSearchTopFiltersFragment$subscribeTapTagQuery$1 dialogSearchTopFiltersFragment$subscribeTapTagQuery$1 = new DialogSearchTopFiltersFragment$subscribeTapTagQuery$1(this.this$0, dVar);
        dialogSearchTopFiltersFragment$subscribeTapTagQuery$1.L$0 = obj;
        return dialogSearchTopFiltersFragment$subscribeTapTagQuery$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentDialogSearchCoordinatorBinding binding;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = (String) this.L$0;
        this.this$0.disableFilterButtons(true);
        if (str != null && str.length() != 0) {
            DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment = this.this$0;
            binding = dialogSearchTopFiltersFragment.getBinding();
            dialogSearchTopFiltersFragment.setTextWithSelection(binding.dialogSearchBarView.getSearchInput(), str);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, d<? super Unit> dVar) {
        return ((DialogSearchTopFiltersFragment$subscribeTapTagQuery$1) create(str, dVar)).invokeSuspend(Unit.f71690a);
    }
}
