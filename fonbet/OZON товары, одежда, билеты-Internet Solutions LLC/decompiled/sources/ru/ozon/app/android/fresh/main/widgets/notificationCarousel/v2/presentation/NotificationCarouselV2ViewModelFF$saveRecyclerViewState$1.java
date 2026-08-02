package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Ae.x0;
import Sc.s;
import Wc.a;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1", f = "NotificationCarouselV2ViewModelFF.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Parcelable $state;
    int label;
    final /* synthetic */ NotificationCarouselV2ViewModelFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1(NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF, Parcelable parcelable, d<? super NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationCarouselV2ViewModelFF;
        this.$state = parcelable;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1(this.this$0, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        NotificationCarouselV2VO copy$default;
        Object newState;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            x0Var = this.this$0._widgetUpdates;
            NotificationCarouselV2VO notificationCarouselV2VO = (NotificationCarouselV2VO) x0Var.getValue();
            if (notificationCarouselV2VO == null || (copy$default = NotificationCarouselV2VO.copy$default(notificationCarouselV2VO, 0L, null, 0L, null, null, this.$state, 31, null)) == null) {
                return Unit.f71690a;
            }
            NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF = this.this$0;
            this.label = 1;
            newState = notificationCarouselV2ViewModelFF.setNewState(copy$default, this);
            if (newState == aVar) {
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
        return ((NotificationCarouselV2ViewModelFF$saveRecyclerViewState$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
