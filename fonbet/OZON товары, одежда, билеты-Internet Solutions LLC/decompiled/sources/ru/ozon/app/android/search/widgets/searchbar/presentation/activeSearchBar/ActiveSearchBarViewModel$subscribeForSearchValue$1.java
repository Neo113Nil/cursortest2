package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel$subscribeForSearchValue$1", f = "ActiveSearchBarViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ActiveSearchBarViewModel$subscribeForSearchValue$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActiveSearchBarViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewModel$subscribeForSearchValue$1(ActiveSearchBarViewModel activeSearchBarViewModel, d<? super ActiveSearchBarViewModel$subscribeForSearchValue$1> dVar) {
        super(2, dVar);
        this.this$0 = activeSearchBarViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ActiveSearchBarViewModel$subscribeForSearchValue$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC2395h searchQueryFlow;
        x0 x0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            searchQueryFlow = this.this$0.getSearchQueryFlow();
            ActiveSearchBarViewModel activeSearchBarViewModel = this.this$0;
            x0Var = activeSearchBarViewModel._searchQuery;
            String str = (String) x0Var.getValue();
            if (str == null) {
                str = "";
            }
            InterfaceC2395h o11 = C2399j.o(C2399j.l(searchQueryFlow, activeSearchBarViewModel.getSearchDebounce(str)));
            final ActiveSearchBarViewModel activeSearchBarViewModel2 = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar.ActiveSearchBarViewModel$subscribeForSearchValue$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((String) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(String str2, d<? super Unit> dVar) {
                    String suggestionUrl;
                    x0 x0Var2;
                    if (ActiveSearchBarViewModel.this.isDialogSearch()) {
                        return Unit.f71690a;
                    }
                    suggestionUrl = ActiveSearchBarViewModel.this.getSuggestionUrl(str2);
                    x0Var2 = ActiveSearchBarViewModel.this._actionFlow;
                    Object emit = x0Var2.emit(new ActiveSearchBarViewModel.Action.SilentRefresh(suggestionUrl), dVar);
                    return emit == a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
                }
            };
            this.label = 1;
            if (o11.collect(interfaceC2397i, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ActiveSearchBarViewModel$subscribeForSearchValue$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
