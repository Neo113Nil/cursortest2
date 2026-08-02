package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky;

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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersScrollStateSynchronizer;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.ScrollState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3", f = "HotelsGalleryFiltersOverlayWidgetViewHolder.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HotelsGalleryFiltersOverlayWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3(HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder, d<? super HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryFiltersOverlayWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3(this.this$0, dVar);
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
            final HotelsGalleryFiltersOverlayWidgetViewHolder hotelsGalleryFiltersOverlayWidgetViewHolder = this.this$0;
            InterfaceC2397i interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.sticky.HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((ScrollState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(ScrollState scrollState, d<? super Unit> dVar) {
                    HotelsGalleryFiltersViewModel hotelsGalleryFiltersViewModel2;
                    HotelsGalleryFiltersScrollStateSynchronizer hotelsGalleryFiltersScrollStateSynchronizer;
                    RecyclerView recyclerView;
                    hotelsGalleryFiltersViewModel2 = HotelsGalleryFiltersOverlayWidgetViewHolder.this.viewModel;
                    if (!hotelsGalleryFiltersViewModel2.isRefreshing().getValue().booleanValue()) {
                        hotelsGalleryFiltersScrollStateSynchronizer = HotelsGalleryFiltersOverlayWidgetViewHolder.this.scrollSynchronizer;
                        recyclerView = HotelsGalleryFiltersOverlayWidgetViewHolder.this.containerView;
                        hotelsGalleryFiltersScrollStateSynchronizer.restoreScrollState(recyclerView);
                    }
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
        return ((HotelsGalleryFiltersOverlayWidgetViewHolder$addView$3) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
