package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll;

import Sc.s;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper$waitForLoadedItems$2", f = "CatalogTabsV2ScrollHelper.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogTabsV2ScrollHelper$waitForLoadedItems$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ RecyclerView.g<?> $currentAdapter;
    final /* synthetic */ int $minCount;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2ScrollHelper$waitForLoadedItems$2(RecyclerView.g<?> gVar, int i11, d<? super CatalogTabsV2ScrollHelper$waitForLoadedItems$2> dVar) {
        super(2, dVar);
        this.$currentAdapter = gVar;
        this.$minCount = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogTabsV2ScrollHelper$waitForLoadedItems$2(this.$currentAdapter, this.$minCount, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        while (this.$currentAdapter.getCardsCount() < this.$minCount) {
            this.label = 1;
            if (Y.b(16L, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CatalogTabsV2ScrollHelper$waitForLoadedItems$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
