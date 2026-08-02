package ru.ozon.app.android.fresh.checkout.widgets.searchBankList.presentation;

import Sc.s;
import Wc.a;
import com.google.android.gms.actions.SearchIntents;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", SearchIntents.EXTRA_QUERY, "", "bankCells"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.checkout.widgets.searchBankList.presentation.SearchBankListViewModel$filteredBankCellsFlow$1", f = "SearchBankListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SearchBankListViewModel$filteredBankCellsFlow$1 extends j implements InterfaceC6511n<String, List<? extends CellDTO>, d<? super List<? extends CellDTO>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ SearchBankListViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBankListViewModel$filteredBankCellsFlow$1(SearchBankListViewModel searchBankListViewModel, d<? super SearchBankListViewModel$filteredBankCellsFlow$1> dVar) {
        super(3, dVar);
        this.this$0 = searchBankListViewModel;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Object invoke(String str, List<? extends CellDTO> list, d<? super List<? extends CellDTO>> dVar) {
        return invoke2(str, (List<CellDTO>) list, (d<? super List<CellDTO>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List filter;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        String str = (String) this.L$0;
        filter = this.this$0.filter((List) this.L$1, str);
        return filter;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, List<CellDTO> list, d<? super List<CellDTO>> dVar) {
        SearchBankListViewModel$filteredBankCellsFlow$1 searchBankListViewModel$filteredBankCellsFlow$1 = new SearchBankListViewModel$filteredBankCellsFlow$1(this.this$0, dVar);
        searchBankListViewModel$filteredBankCellsFlow$1.L$0 = str;
        searchBankListViewModel$filteredBankCellsFlow$1.L$1 = list;
        return searchBankListViewModel$filteredBankCellsFlow$1.invokeSuspend(Unit.f71690a);
    }
}
