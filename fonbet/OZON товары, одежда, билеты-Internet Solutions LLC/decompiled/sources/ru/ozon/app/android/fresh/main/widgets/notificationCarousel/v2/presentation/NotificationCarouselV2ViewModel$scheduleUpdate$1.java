package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import He.b;
import Sc.s;
import Wc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import ze.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewModel$scheduleUpdate$1", f = "NotificationCarouselV2ViewModel.kt", l = {42, 46, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewModel$scheduleUpdate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ NotificationCarouselV2VO $currentState;
    final /* synthetic */ l20.d $info;
    Object L$0;
    int label;
    final /* synthetic */ NotificationCarouselV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewModel$scheduleUpdate$1(NotificationCarouselV2ViewModel notificationCarouselV2ViewModel, NotificationCarouselV2VO notificationCarouselV2VO, l20.d dVar, d<? super NotificationCarouselV2ViewModel$scheduleUpdate$1> dVar2) {
        super(2, dVar2);
        this.this$0 = notificationCarouselV2ViewModel;
        this.$currentState = notificationCarouselV2VO;
        this.$info = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new NotificationCarouselV2ViewModel$scheduleUpdate$1(this.this$0, this.$currentState, this.$info, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r2.n(r5, r17) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r5 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (xe.Y.b(r7, r17) == r1) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        I i11;
        Object f7;
        h hVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i12 = this.label;
        if (i12 == 0) {
            s.b(obj);
            if (this.this$0.getShouldUpdateImmediately()) {
                this.this$0.setShouldUpdateImmediately(false);
            } else {
                long millis = TimeUnit.SECONDS.toMillis(this.$currentState.getUpdatePeriodSeconds());
                this.label = 1;
            }
        } else if (i12 == 1) {
            s.b(obj);
        } else {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            i11 = (I) this.L$0;
            s.b(obj);
            f7 = obj;
            NotificationCarouselV2VO notificationCarouselV2VO = (NotificationCarouselV2VO) f7;
            if (notificationCarouselV2VO == null && i11.f71783a) {
                notificationCarouselV2VO = NotificationCarouselV2VO.copy$default(this.$currentState, 0L, K.f71697a, 0L, null, null, null, 61, null);
            } else if (notificationCarouselV2VO == null) {
                notificationCarouselV2VO = this.$currentState;
            }
            hVar = this.this$0._widgetUpdates;
            this.L$0 = null;
            this.label = 3;
        }
        i11 = new I();
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1 notificationCarouselV2ViewModel$scheduleUpdate$1$result$1 = new NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1(this.this$0, this.$info, i11, null);
        this.L$0 = i11;
        this.label = 2;
        f7 = C10727i.f(bVar, notificationCarouselV2ViewModel$scheduleUpdate$1$result$1, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationCarouselV2ViewModel$scheduleUpdate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
