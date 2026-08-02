package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi;

import Ae.C2399j;
import Ae.M0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.HotelsSearchResultsV5LoadingWidgetViewModel;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiVO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2", f = "HotelsSearchResultsV5LoadingNoUiWidgetViewHolder.kt", l = {202}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ M0<Boolean> $freezeLayoutStateFlow;
    final /* synthetic */ HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState $state;
    int label;
    final /* synthetic */ HotelsSearchResultsV5LoadingNoUiWidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isFreezed"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2$1", f = "HotelsSearchResultsV5LoadingNoUiWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.loading.noUi.HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Boolean> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Boolean.valueOf(!this.Z$0);
        }

        public final Object invoke(boolean z11, d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2(M0<Boolean> m02, HotelsSearchResultsV5LoadingNoUiVO.State.RefreshState refreshState, HotelsSearchResultsV5LoadingNoUiWidgetViewHolder hotelsSearchResultsV5LoadingNoUiWidgetViewHolder, d<? super HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2> dVar) {
        super(2, dVar);
        this.$freezeLayoutStateFlow = m02;
        this.$state = refreshState;
        this.this$0 = hotelsSearchResultsV5LoadingNoUiWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2(this.$freezeLayoutStateFlow, this.$state, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsSearchResultsV5LoadingWidgetViewModel hotelsSearchResultsV5LoadingWidgetViewModel;
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M0<Boolean> m02 = this.$freezeLayoutStateFlow;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (C2399j.v(m02, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        AtomAction refreshAction = this.$state.getRefreshAction();
        if (refreshAction != null) {
            function1 = this.this$0.processedActionHandler;
            function1.invoke(refreshAction);
        }
        hotelsSearchResultsV5LoadingWidgetViewModel = this.this$0.loadingWidgetViewModel;
        hotelsSearchResultsV5LoadingWidgetViewModel.cancelJobs();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsSearchResultsV5LoadingNoUiWidgetViewHolder$handleRefreshState$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
