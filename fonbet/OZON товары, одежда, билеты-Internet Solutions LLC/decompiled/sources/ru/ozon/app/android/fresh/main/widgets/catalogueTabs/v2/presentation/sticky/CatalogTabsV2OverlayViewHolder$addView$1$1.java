package ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.catalogueTabs.common.CatalogueTabsViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewHolder$addView$1$1", f = "CatalogTabsV2OverlayViewHolder.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CatalogTabsV2OverlayViewHolder$addView$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ J $viewLifecycleOwner;
    int label;
    final /* synthetic */ CatalogTabsV2OverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogTabsV2OverlayViewHolder$addView$1$1(CatalogTabsV2OverlayViewHolder catalogTabsV2OverlayViewHolder, J j11, d<? super CatalogTabsV2OverlayViewHolder$addView$1$1> dVar) {
        super(2, dVar);
        this.this$0 = catalogTabsV2OverlayViewHolder;
        this.$viewLifecycleOwner = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new CatalogTabsV2OverlayViewHolder$addView$1$1(this.this$0, this.$viewLifecycleOwner, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CatalogueTabsViewModel catalogueTabsViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            catalogueTabsViewModel = this.this$0.catalogTabsViewModel;
            InterfaceC2395h a11 = C5427n.a(catalogueTabsViewModel.getStickyVisibleState(), this.$viewLifecycleOwner.getLifecycle(), AbstractC5434v.b.STARTED);
            final CatalogTabsV2OverlayViewHolder catalogTabsV2OverlayViewHolder = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogueTabs.v2.presentation.sticky.CatalogTabsV2OverlayViewHolder$addView$1$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), (d<? super Unit>) dVar);
                }

                public final Object emit(boolean z11, d<? super Unit> dVar) {
                    CatalogTabsV2StickyAnimator stickyAnimator;
                    stickyAnimator = CatalogTabsV2OverlayViewHolder.this.getStickyAnimator();
                    stickyAnimator.setTargetVisibility(z11, true);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (((AbstractC2635g) a11).collect(interfaceC2397i, this) == aVar) {
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
        return ((CatalogTabsV2OverlayViewHolder$addView$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
