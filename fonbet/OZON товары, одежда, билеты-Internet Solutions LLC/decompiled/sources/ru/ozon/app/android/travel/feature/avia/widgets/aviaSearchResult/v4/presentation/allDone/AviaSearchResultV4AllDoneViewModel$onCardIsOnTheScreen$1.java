package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone;

import Ae.w0;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.vo.AviaSearchResultV4AllDoneVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1", f = "AviaSearchResultV4AllDoneViewModel.kt", l = {DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ OnBoardingDTO $safeOnboarding;
    final /* synthetic */ AviaSearchResultV4AllDoneVO $vo;
    int label;
    final /* synthetic */ AviaSearchResultV4AllDoneViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1(AviaSearchResultV4AllDoneViewModel aviaSearchResultV4AllDoneViewModel, AviaSearchResultV4AllDoneVO aviaSearchResultV4AllDoneVO, OnBoardingDTO onBoardingDTO, d<? super AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1> dVar) {
        super(2, dVar);
        this.this$0 = aviaSearchResultV4AllDoneViewModel;
        this.$vo = aviaSearchResultV4AllDoneVO;
        this.$safeOnboarding = onBoardingDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1(this.this$0, this.$vo, this.$safeOnboarding, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (xe.Y.b(30, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                this.this$0.stopCalculateDelay();
                return Unit.f71690a;
            }
            s.b(obj);
        }
        w0Var = this.this$0.onboardingSharedFlow;
        AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding aviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding = new AviaSearchResultV4AllDoneViewModel$OnboardingEvent$Onboarding(this.$vo.getId(), this.$safeOnboarding);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AviaSearchResultV4AllDoneViewModel$onCardIsOnTheScreen$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
