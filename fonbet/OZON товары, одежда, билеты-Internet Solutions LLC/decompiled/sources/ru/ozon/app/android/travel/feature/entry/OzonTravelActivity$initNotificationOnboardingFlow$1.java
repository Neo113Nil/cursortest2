package ru.ozon.app.android.travel.feature.entry;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.entry.pushOnboarding.presentation.NotificationOnboardingDelegate;
import xe.M;
import xe.Y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.entry.OzonTravelActivity$initNotificationOnboardingFlow$1", f = "OzonTravelActivity.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OzonTravelActivity$initNotificationOnboardingFlow$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ OzonTravelActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OzonTravelActivity$initNotificationOnboardingFlow$1(OzonTravelActivity ozonTravelActivity, d<? super OzonTravelActivity$initNotificationOnboardingFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = ozonTravelActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OzonTravelActivity$initNotificationOnboardingFlow$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NotificationOnboardingDelegate notificationOnboardingDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.label = 1;
            if (Y.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        notificationOnboardingDelegate = this.this$0.notificationOnboardingDelegate;
        if (notificationOnboardingDelegate != null) {
            notificationOnboardingDelegate.initNotificationOnboardingFlow();
            return Unit.f71690a;
        }
        Intrinsics.n("notificationOnboardingDelegate");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OzonTravelActivity$initNotificationOnboardingFlow$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
