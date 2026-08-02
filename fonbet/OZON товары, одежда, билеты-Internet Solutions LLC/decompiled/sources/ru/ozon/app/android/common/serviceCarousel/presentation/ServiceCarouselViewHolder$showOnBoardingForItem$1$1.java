package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showOnBoardingForItem$1$1", f = "ServiceCarouselViewHolder.kt", l = {m.e.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ServiceCarouselViewHolder$showOnBoardingForItem$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ OnBoardingDTO $onboardingDTO;
    final /* synthetic */ RecyclerView $this_showOnBoardingForItem;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewHolder$showOnBoardingForItem$1$1(RecyclerView recyclerView, int i11, OnBoardingDTO onBoardingDTO, d<? super ServiceCarouselViewHolder$showOnBoardingForItem$1$1> dVar) {
        super(2, dVar);
        this.$this_showOnBoardingForItem = recyclerView;
        this.$itemIndex = i11;
        this.$onboardingDTO = onBoardingDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ServiceCarouselViewHolder$showOnBoardingForItem$1$1(this.$this_showOnBoardingForItem, this.$itemIndex, this.$onboardingDTO, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            RecyclerView.C childViewHolder = this.$this_showOnBoardingForItem.getChildViewHolder(this.$this_showOnBoardingForItem.getChildAt(this.$itemIndex));
            ServiceCarouselItemViewHolder serviceCarouselItemViewHolder = childViewHolder instanceof ServiceCarouselItemViewHolder ? (ServiceCarouselItemViewHolder) childViewHolder : null;
            if (serviceCarouselItemViewHolder != null) {
                OnBoardingDTO onBoardingDTO = this.$onboardingDTO;
                this.label = 1;
                if (serviceCarouselItemViewHolder.showOnBoardingForItem(onBoardingDTO, this) == aVar) {
                    return aVar;
                }
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
        return ((ServiceCarouselViewHolder$showOnBoardingForItem$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
