package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;", "stickyState", "nonStickyState", "", "<anonymous>", "(LAe/i;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;Lru/ozon/app/android/fresh/main/widgets/catalogueTabs/common/CatalogTabsScrollState;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel$scrollState$1", f = "CatalogueTabsViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogueTabsViewModel$scrollState$1 extends j implements InterfaceC6512o<InterfaceC2397i<? super CatalogTabsScrollState>, CatalogTabsScrollState, CatalogTabsScrollState, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ CatalogueTabsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogueTabsViewModel$scrollState$1(CatalogueTabsViewModel catalogueTabsViewModel, d<? super CatalogueTabsViewModel$scrollState$1> dVar) {
        super(4, dVar);
        this.this$0 = catalogueTabsViewModel;
    }

    @Override // fd.InterfaceC6512o
    public final Object invoke(InterfaceC2397i<? super CatalogTabsScrollState> interfaceC2397i, CatalogTabsScrollState catalogTabsScrollState, CatalogTabsScrollState catalogTabsScrollState2, d<? super Unit> dVar) {
        CatalogueTabsViewModel$scrollState$1 catalogueTabsViewModel$scrollState$1 = new CatalogueTabsViewModel$scrollState$1(this.this$0, dVar);
        catalogueTabsViewModel$scrollState$1.L$0 = interfaceC2397i;
        catalogueTabsViewModel$scrollState$1.L$1 = catalogTabsScrollState;
        catalogueTabsViewModel$scrollState$1.L$2 = catalogTabsScrollState2;
        return catalogueTabsViewModel$scrollState$1.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object mergeStates;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.L$0;
            CatalogTabsScrollState catalogTabsScrollState = (CatalogTabsScrollState) this.L$1;
            CatalogTabsScrollState catalogTabsScrollState2 = (CatalogTabsScrollState) this.L$2;
            CatalogueTabsViewModel catalogueTabsViewModel = this.this$0;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            mergeStates = catalogueTabsViewModel.mergeStates(interfaceC2397i, catalogTabsScrollState, catalogTabsScrollState2, this);
            if (mergeStates == aVar) {
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
}
