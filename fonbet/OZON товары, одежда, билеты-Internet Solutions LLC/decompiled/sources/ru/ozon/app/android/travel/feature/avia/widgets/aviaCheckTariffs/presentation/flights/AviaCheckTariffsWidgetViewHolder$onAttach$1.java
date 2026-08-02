package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights;

import Sc.s;
import android.os.Parcelable;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsVO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsWidgetViewHolder$onAttach$1;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.adapter.AviaCheckTariffsAdapter;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "content", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/flights/AviaCheckTariffsVO$Content;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsWidgetViewHolder$onAttach$1", f = "AviaCheckTariffsWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaCheckTariffsWidgetViewHolder$onAttach$1 extends j implements Function2<AviaCheckTariffsVO.Content, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AviaCheckTariffsWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsWidgetViewHolder$onAttach$1$1", f = "AviaCheckTariffsWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsWidgetViewHolder$onAttach$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AviaCheckTariffsVO.Content $content;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AviaCheckTariffsWidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AviaCheckTariffsWidgetViewHolder aviaCheckTariffsWidgetViewHolder, AviaCheckTariffsVO.Content content, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = aviaCheckTariffsWidgetViewHolder;
            this.$content = content;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(AviaCheckTariffsVO.Content content, AviaCheckTariffsWidgetViewHolder aviaCheckTariffsWidgetViewHolder, M m11) {
            AviaCheckTariffsViewModel aviaCheckTariffsViewModel;
            int i11;
            LinearLayoutManager linearLayoutManager;
            int i12;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            AviaCheckTariffsViewModel aviaCheckTariffsViewModel2;
            LinearLayoutManager linearLayoutManager2;
            Parcelable lastVisiblePosition = content.getLastVisiblePosition();
            if (lastVisiblePosition != null) {
                linearLayoutManager2 = aviaCheckTariffsWidgetViewHolder.linearLayoutManager;
                linearLayoutManager2.onRestoreInstanceState(lastVisiblePosition);
                return;
            }
            aviaCheckTariffsViewModel = aviaCheckTariffsWidgetViewHolder.viewModel;
            if (aviaCheckTariffsViewModel.getIsFirstScrollEnabled()) {
                i11 = aviaCheckTariffsWidgetViewHolder.lastSelectedCardIndex;
                if (i11 != content.getSelectedTariffInd()) {
                    linearLayoutManager = aviaCheckTariffsWidgetViewHolder.linearLayoutManager;
                    int selectedTariffInd = content.getSelectedTariffInd();
                    i12 = aviaCheckTariffsWidgetViewHolder.scrollOffset;
                    linearLayoutManager.scrollToPositionWithOffset(selectedTariffInd, i12);
                    recyclerView = aviaCheckTariffsWidgetViewHolder.recyclerView;
                    if (recyclerView == null || recyclerView.getItemAnimator() == null) {
                        recyclerView2 = aviaCheckTariffsWidgetViewHolder.recyclerView;
                        if (recyclerView2 != null) {
                            recyclerView2.setItemAnimator(new h());
                        }
                        Unit unit = Unit.f71690a;
                    }
                    aviaCheckTariffsViewModel2 = aviaCheckTariffsWidgetViewHolder.viewModel;
                    aviaCheckTariffsViewModel2.setFirstScrollEnabled(false);
                }
            }
            aviaCheckTariffsWidgetViewHolder.lastSelectedCardIndex = content.getSelectedTariffInd();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$content, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AviaCheckTariffsAdapter aviaCheckTariffsAdapter;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            final M m11 = (M) this.L$0;
            aviaCheckTariffsAdapter = this.this$0.tariffsAdapter;
            List<AviaCheckTariffsVO.TariffItem> tariffs = this.$content.getTariffs();
            final AviaCheckTariffsVO.Content content = this.$content;
            final AviaCheckTariffsWidgetViewHolder aviaCheckTariffsWidgetViewHolder = this.this$0;
            aviaCheckTariffsAdapter.submitList(tariffs, new Runnable() { // from class: ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.a
                @Override // java.lang.Runnable
                public final void run() {
                    AviaCheckTariffsWidgetViewHolder$onAttach$1.AnonymousClass1.invokeSuspend$lambda$2(AviaCheckTariffsVO.Content.this, aviaCheckTariffsWidgetViewHolder, m11);
                }
            });
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaCheckTariffsWidgetViewHolder$onAttach$1(AviaCheckTariffsWidgetViewHolder aviaCheckTariffsWidgetViewHolder, d<? super AviaCheckTariffsWidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaCheckTariffsWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AviaCheckTariffsWidgetViewHolder$onAttach$1 aviaCheckTariffsWidgetViewHolder$onAttach$1 = new AviaCheckTariffsWidgetViewHolder$onAttach$1(this.this$0, dVar);
        aviaCheckTariffsWidgetViewHolder$onAttach$1.L$0 = obj;
        return aviaCheckTariffsWidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AviaCheckTariffsVO.Content content = (AviaCheckTariffsVO.Content) this.L$0;
        this.this$0.cancelJob();
        AviaCheckTariffsWidgetViewHolder aviaCheckTariffsWidgetViewHolder = this.this$0;
        aviaCheckTariffsWidgetViewHolder.job = C10727i.c(K.a(aviaCheckTariffsWidgetViewHolder), null, null, new AnonymousClass1(this.this$0, content, null), 3);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AviaCheckTariffsVO.Content content, d<? super Unit> dVar) {
        return ((AviaCheckTariffsWidgetViewHolder$onAttach$1) create(content, dVar)).invokeSuspend(Unit.f71690a);
    }
}
