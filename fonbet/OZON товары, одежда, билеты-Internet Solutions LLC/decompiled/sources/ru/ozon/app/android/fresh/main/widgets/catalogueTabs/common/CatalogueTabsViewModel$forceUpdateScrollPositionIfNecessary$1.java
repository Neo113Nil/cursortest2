package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogTabsScrollState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1", f = "CatalogueTabsViewModel.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $newPosition;
    final /* synthetic */ int $offset;
    int label;
    final /* synthetic */ CatalogueTabsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1(CatalogueTabsViewModel catalogueTabsViewModel, int i11, int i12, d<? super CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1> dVar) {
        super(2, dVar);
        this.this$0 = catalogueTabsViewModel;
        this.$offset = i11;
        this.$newPosition = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1(this.this$0, this.$offset, this.$newPosition, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CatalogueTabsViewModel catalogueTabsViewModel = this.this$0;
            CatalogTabsScrollState.TransformScrolling transformScrolling = new CatalogTabsScrollState.TransformScrolling(this.$offset, this.$newPosition, true);
            this.label = 1;
            if (catalogueTabsViewModel.sendScrollState(transformScrolling, this) == aVar) {
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
        return ((CatalogueTabsViewModel$forceUpdateScrollPositionIfNecessary$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
