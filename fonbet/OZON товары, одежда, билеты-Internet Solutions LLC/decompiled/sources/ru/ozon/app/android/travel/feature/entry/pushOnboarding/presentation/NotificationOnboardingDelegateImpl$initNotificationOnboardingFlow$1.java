package ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation;

import Sc.s;
import Wc.a;
import androidx.appcompat.app.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1", f = "NotificationOnboardingDelegate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ NotificationOnboardingDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1(NotificationOnboardingDelegateImpl notificationOnboardingDelegateImpl, d<? super NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationOnboardingDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationOnboardingViewModel notificationOnboardingViewModel;
        g gVar;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        notificationOnboardingViewModel = this.this$0.notificationOnboardingViewModel;
        gVar = this.this$0.activity;
        notificationOnboardingViewModel.checkOnboardingFlow(gVar);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationOnboardingDelegateImpl$initNotificationOnboardingFlow$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
