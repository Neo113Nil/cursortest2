package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/entry/pushOnboarding/presentation/NotificationOnboardingViewModel$OnboardingStartAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegateImpl$observeViewModel$1", f = "NotificationOnboardingDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class NotificationOnboardingDelegateImpl$observeViewModel$1 extends j implements Function2<NotificationOnboardingViewModel.OnboardingStartAction, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationOnboardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOnboardingDelegateImpl$observeViewModel$1(NotificationOnboardingDelegateImpl notificationOnboardingDelegateImpl, d<? super NotificationOnboardingDelegateImpl$observeViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationOnboardingDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationOnboardingDelegateImpl$observeViewModel$1 notificationOnboardingDelegateImpl$observeViewModel$1 = new NotificationOnboardingDelegateImpl$observeViewModel$1(this.this$0, dVar);
        notificationOnboardingDelegateImpl$observeViewModel$1.L$0 = obj;
        return notificationOnboardingDelegateImpl$observeViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        NotificationOnboardingViewModel.OnboardingStartAction onboardingStartAction = (NotificationOnboardingViewModel.OnboardingStartAction) this.L$0;
        if (onboardingStartAction instanceof NotificationOnboardingViewModel.OnboardingStartAction.ShowOnboarding) {
            this.this$0.showOnboarding();
        } else if (!(onboardingStartAction instanceof NotificationOnboardingViewModel.OnboardingStartAction.None)) {
            throw new o();
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationOnboardingViewModel.OnboardingStartAction onboardingStartAction, d<? super Unit> dVar) {
        return ((NotificationOnboardingDelegateImpl$observeViewModel$1) create(onboardingStartAction, dVar)).invokeSuspend(Unit.f71690a);
    }
}
