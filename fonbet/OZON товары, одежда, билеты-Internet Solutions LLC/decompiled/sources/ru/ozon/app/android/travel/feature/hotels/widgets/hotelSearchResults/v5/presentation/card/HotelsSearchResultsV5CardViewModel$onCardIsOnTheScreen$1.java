package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1", f = "HotelsSearchResultsV5CardViewModel.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ OnBoardingDTO $safeOnboarding;
    final /* synthetic */ HotelsSearchResultsV5CardVO $vo;
    int label;
    final /* synthetic */ HotelsSearchResultsV5CardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1(HotelsSearchResultsV5CardViewModel hotelsSearchResultsV5CardViewModel, HotelsSearchResultsV5CardVO hotelsSearchResultsV5CardVO, OnBoardingDTO onBoardingDTO, d<? super HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsSearchResultsV5CardViewModel;
        this.$vo = hotelsSearchResultsV5CardVO;
        this.$safeOnboarding = onBoardingDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1(this.this$0, this.$vo, this.$safeOnboarding, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            w0Var = this.this$0.onboardingSharedFlow;
            HotelsSearchResultsV5CardViewModel.OnboardingEvent onboardingEvent = new HotelsSearchResultsV5CardViewModel.OnboardingEvent(this.$vo.getId(), this.$safeOnboarding);
            this.label = 1;
            if (w0Var.emit(onboardingEvent, this) == aVar) {
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
        return ((HotelsSearchResultsV5CardViewModel$onCardIsOnTheScreen$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
