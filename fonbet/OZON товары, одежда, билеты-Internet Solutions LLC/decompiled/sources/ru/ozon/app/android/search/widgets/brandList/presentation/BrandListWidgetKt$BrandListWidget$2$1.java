package ru.ozon.app.android.search.widgets.brandList.presentation;

import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import v0.I;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.search.widgets.brandList.presentation.BrandListWidgetKt$BrandListWidget$2$1", f = "BrandListWidget.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class BrandListWidgetKt$BrandListWidget$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ I $listState;
    final /* synthetic */ InterfaceC3978p0<String> $searchText$delegate;
    final /* synthetic */ BrandListViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BrandListWidgetKt$BrandListWidget$2$1(BrandListViewModel brandListViewModel, I i11, InterfaceC3978p0<String> interfaceC3978p0, d<? super BrandListWidgetKt$BrandListWidget$2$1> dVar) {
        super(2, dVar);
        this.$viewModel = brandListViewModel;
        this.$listState = i11;
        this.$searchText$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new BrandListWidgetKt$BrandListWidget$2$1(this.$viewModel, this.$listState, this.$searchText$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String BrandListWidget_Q4CkjMc$lambda$1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (!this.$viewModel.isSearchTextInitialized()) {
                BrandListWidget_Q4CkjMc$lambda$1 = BrandListWidgetKt.BrandListWidget_Q4CkjMc$lambda$1(this.$searchText$delegate);
                if (BrandListWidget_Q4CkjMc$lambda$1.length() == 0) {
                    I i12 = this.$listState;
                    this.label = 1;
                    int i13 = I.f101468y;
                    if (i12.k(0, 0, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$viewModel.setSearchTextInitialized(true);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((BrandListWidgetKt$BrandListWidget$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
