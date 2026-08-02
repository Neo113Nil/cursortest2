package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import j10.InterfaceC7238a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.scroll.CatalogTabsV2ScrollHelper;
import ru.ozon.composer.ui.widget.l;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel$scrollToWidget$3", f = "CatalogueTabsViewModel.kt", l = {153}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogueTabsViewModel$scrollToWidget$3 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ InterfaceC7238a<l> $composerStore;
    final /* synthetic */ RecyclerView $recyclerView;
    final /* synthetic */ int $stableOffsetPx;
    final /* synthetic */ int $widgetScrollKey;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogueTabsViewModel$scrollToWidget$3(int i11, RecyclerView recyclerView, int i12, InterfaceC7851b interfaceC7851b, InterfaceC7238a<l> interfaceC7238a, d<? super CatalogueTabsViewModel$scrollToWidget$3> dVar) {
        super(2, dVar);
        this.$widgetScrollKey = i11;
        this.$recyclerView = recyclerView;
        this.$stableOffsetPx = i12;
        this.$composerController = interfaceC7851b;
        this.$composerStore = interfaceC7238a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogueTabsViewModel$scrollToWidget$3(this.$widgetScrollKey, this.$recyclerView, this.$stableOffsetPx, this.$composerController, this.$composerStore, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            CatalogTabsV2ScrollHelper catalogTabsV2ScrollHelper = CatalogTabsV2ScrollHelper.INSTANCE;
            int i12 = this.$widgetScrollKey;
            RecyclerView recyclerView = this.$recyclerView;
            int i13 = this.$stableOffsetPx;
            InterfaceC7851b interfaceC7851b = this.$composerController;
            InterfaceC7238a<l> interfaceC7238a = this.$composerStore;
            this.label = 1;
            if (catalogTabsV2ScrollHelper.scrollToWidgetWithPagination(i12, recyclerView, i13, interfaceC7851b, interfaceC7238a, this) == aVar) {
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
        return ((CatalogueTabsViewModel$scrollToWidget$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
