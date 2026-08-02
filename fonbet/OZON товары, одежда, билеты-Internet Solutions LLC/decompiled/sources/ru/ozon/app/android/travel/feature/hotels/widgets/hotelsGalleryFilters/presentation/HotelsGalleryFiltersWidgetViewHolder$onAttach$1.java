package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Be.AbstractC2635g;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersWidgetViewHolder$onAttach$1", f = "HotelsGalleryFiltersWidgetViewHolder.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryFiltersWidgetViewHolder$onAttach$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsGalleryFiltersWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFiltersWidgetViewHolder$onAttach$1(HotelsGalleryFiltersWidgetViewHolder hotelsGalleryFiltersWidgetViewHolder, d<? super HotelsGalleryFiltersWidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryFiltersWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsGalleryFiltersWidgetViewHolder$onAttach$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryFiltersViewModel hotelsGalleryFiltersViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            hotelsGalleryFiltersViewModel = this.this$0.viewModel;
            InterfaceC2395h a11 = C5427n.a(hotelsGalleryFiltersViewModel.getScrollState(), this.this$0.getLifecycle(), AbstractC5434v.b.STARTED);
            final HotelsGalleryFiltersWidgetViewHolder hotelsGalleryFiltersWidgetViewHolder = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersWidgetViewHolder$onAttach$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ScrollState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ScrollState scrollState, d<? super Unit> dVar) {
                    HotelsGalleryFiltersScrollStateSynchronizer hotelsGalleryFiltersScrollStateSynchronizer;
                    RecyclerView recyclerView;
                    hotelsGalleryFiltersScrollStateSynchronizer = HotelsGalleryFiltersWidgetViewHolder.this.scrollSynchronizer;
                    recyclerView = HotelsGalleryFiltersWidgetViewHolder.this.containerView;
                    hotelsGalleryFiltersScrollStateSynchronizer.restoreScrollState(recyclerView);
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
        return ((HotelsGalleryFiltersWidgetViewHolder$onAttach$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
