package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation;

import Ae.w0;
import Ae.x0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel;
import xe.C10721f;
import xe.C10727i;
import xe.M;
import xe.U;
import ze.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v2.presentation.NotificationSubscriptionBannerViewModel$subscribe$1", f = "NotificationSubscriptionBannerViewModel.kt", l = {171, 173}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerViewModel$subscribe$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ NotificationSubscriptionBannerVO $safeItemVo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationSubscriptionBannerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerViewModel$subscribe$1(NotificationSubscriptionBannerViewModel notificationSubscriptionBannerViewModel, NotificationSubscriptionBannerVO notificationSubscriptionBannerVO, d<? super NotificationSubscriptionBannerViewModel$subscribe$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationSubscriptionBannerViewModel;
        this.$safeItemVo = notificationSubscriptionBannerVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationSubscriptionBannerViewModel$subscribe$1 notificationSubscriptionBannerViewModel$subscribe$1 = new NotificationSubscriptionBannerViewModel$subscribe$1(this.this$0, this.$safeItemVo, dVar);
        notificationSubscriptionBannerViewModel$subscribe$1.L$0 = obj;
        return notificationSubscriptionBannerViewModel$subscribe$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r11.emit(r0, r10) == r3) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x0 x0Var;
        Object value;
        boolean z11;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (p e11) {
            Lm0.a.f17149a.e(e11);
        }
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            U[] uArr = {C10727i.a(m11, null, null, new NotificationSubscriptionBannerViewModel$subscribe$1$emailSubscription$1(this.$safeItemVo, this.this$0, null), 3), C10727i.a(m11, null, null, new NotificationSubscriptionBannerViewModel$subscribe$1$notificationSubscription$1(this.$safeItemVo, this.this$0, null), 3)};
            this.label = 1;
            if (C10721f.b(uArr, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        x0Var = this.this$0.widgetStateFlow;
        NotificationSubscriptionBannerVO notificationSubscriptionBannerVO = this.$safeItemVo;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, new NotificationSubscriptionBannerViewModel.WidgetState(notificationSubscriptionBannerVO.getSubscriptionCompletedButton(), false, 2, null)));
        z11 = this.this$0.isWidgetRemoved;
        if (z11) {
            w0Var = this.this$0.viewEffects;
            NotificationSubscriptionBannerViewModel.ViewEffect.ShowNotification showNotification = new NotificationSubscriptionBannerViewModel.ViewEffect.ShowNotification(this.$safeItemVo.getSubscriptionCompletedNotification());
            this.label = 2;
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationSubscriptionBannerViewModel$subscribe$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
