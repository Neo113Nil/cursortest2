package ru.ozon.app.android.common.serviceCarousel.presentation;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.ui.serviceCarousel.databinding.WidgetServiceCarouselBinding;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1", f = "ServiceCarouselViewHolder.kt", l = {172}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ OnBoardingDTO $onboardingDTO;
    int label;
    final /* synthetic */ ServiceCarouselViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1(ServiceCarouselViewHolder serviceCarouselViewHolder, OnBoardingDTO onBoardingDTO, int i11, d<? super ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = serviceCarouselViewHolder;
        this.$onboardingDTO = onBoardingDTO;
        this.$itemIndex = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1(this.this$0, this.$onboardingDTO, this.$itemIndex, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WidgetServiceCarouselBinding widgetServiceCarouselBinding;
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ServiceCarouselViewHolder serviceCarouselViewHolder = this.this$0;
            widgetServiceCarouselBinding = serviceCarouselViewHolder.binding;
            RecyclerView rvItems = widgetServiceCarouselBinding.rvItems;
            Intrinsics.checkNotNullExpressionValue(rvItems, "rvItems");
            OnBoardingDTO onBoardingDTO = this.$onboardingDTO;
            int i12 = this.$itemIndex;
            this.label = 1;
            obj2 = serviceCarouselViewHolder.setupOnBoardingForItem(rvItems, onBoardingDTO, i12, this);
            if (obj2 == aVar) {
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
        return ((ServiceCarouselViewHolder$showCarouselOnboarding$1$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
