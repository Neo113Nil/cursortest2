package ru.ozon.app.android.search.dialogsearchscreen;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.search.widgets.dialogSearchBar.presentation.DialogSearchBarVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$subscribeSearchValue$1", f = "DialogSearchViewModel.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class DialogSearchViewModel$subscribeSearchValue$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ DialogSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchViewModel$subscribeSearchValue$1(DialogSearchViewModel dialogSearchViewModel, d<? super DialogSearchViewModel$subscribeSearchValue$1> dVar) {
        super(2, dVar);
        this.this$0 = dialogSearchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DialogSearchViewModel$subscribeSearchValue$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z11;
        DialogSearchBarVO.RefreshInfoVO refreshInfoVO;
        long longValue;
        Long debounceMs;
        InterfaceC2395h searchQueryFlow;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            z11 = this.this$0.wasTextChangedByTapTag;
            if (z11) {
                longValue = 0;
            } else {
                refreshInfoVO = this.this$0.widgetRefreshModel;
                longValue = (refreshInfoVO == null || (debounceMs = refreshInfoVO.getDebounceMs()) == null) ? 300L : debounceMs.longValue();
            }
            searchQueryFlow = this.this$0.getSearchQueryFlow();
            InterfaceC2395h o11 = C2399j.o(C2399j.l(searchQueryFlow, longValue));
            final DialogSearchViewModel dialogSearchViewModel = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.search.dialogsearchscreen.DialogSearchViewModel$subscribeSearchValue$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((String) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(String str, d<? super Unit> dVar) {
                    DialogSearchViewModel.this.handleSearchValue(str);
                    return Unit.f71690a;
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
        return ((DialogSearchViewModel$subscribeSearchValue$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
