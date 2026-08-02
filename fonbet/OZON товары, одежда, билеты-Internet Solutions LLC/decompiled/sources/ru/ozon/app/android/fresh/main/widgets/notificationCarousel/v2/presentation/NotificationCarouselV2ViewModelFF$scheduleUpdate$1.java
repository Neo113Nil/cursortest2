package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2Repository;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewModelFF$scheduleUpdate$1", f = "NotificationCarouselV2ViewModelFF.kt", l = {59, 60, 62}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewModelFF$scheduleUpdate$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ l20.d $info;
    final /* synthetic */ long $updatePeriodSeconds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCarouselV2ViewModelFF this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewModelFF$scheduleUpdate$1(long j11, NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF, l20.d dVar, d<? super NotificationCarouselV2ViewModelFF$scheduleUpdate$1> dVar2) {
        super(2, dVar2);
        this.$updatePeriodSeconds = j11;
        this.this$0 = notificationCarouselV2ViewModelFF;
        this.$info = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationCarouselV2ViewModelFF$scheduleUpdate$1 notificationCarouselV2ViewModelFF$scheduleUpdate$1 = new NotificationCarouselV2ViewModelFF$scheduleUpdate$1(this.$updatePeriodSeconds, this.this$0, this.$info, dVar);
        notificationCarouselV2ViewModelFF$scheduleUpdate$1.L$0 = obj;
        return notificationCarouselV2ViewModelFF$scheduleUpdate$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
    
        if (xe.Y.b(r5, r7) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF;
        NotificationCarouselV2VO notificationCarouselV2VO;
        Object newState;
        Object obj2;
        Throwable b11;
        NotificationCarouselV2Repository notificationCarouselV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            long millis = TimeUnit.SECONDS.toMillis(this.$updatePeriodSeconds);
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.L$0;
                    s.b(obj);
                    a11 = obj2;
                    NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF2 = this.this$0;
                    l20.d dVar = this.$info;
                    long j11 = this.$updatePeriodSeconds;
                    b11 = r.b(a11);
                    if (b11 != null) {
                        Lm0.a.f17149a.e(b11);
                        notificationCarouselV2ViewModelFF2.scheduleUpdate(dVar, j11);
                    }
                    return Unit.f71690a;
                }
                s.b(obj);
                a11 = (NotificationCarouselV2VO) obj;
                r.Companion companion2 = r.INSTANCE;
                notificationCarouselV2ViewModelFF = this.this$0;
                if (!(a11 instanceof r.b) && (notificationCarouselV2VO = (NotificationCarouselV2VO) a11) != null) {
                    this.L$0 = a11;
                    this.label = 3;
                    newState = notificationCarouselV2ViewModelFF.setNewState(notificationCarouselV2VO, this);
                    if (newState != aVar) {
                        obj2 = a11;
                        a11 = obj2;
                    }
                    return aVar;
                }
                NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF22 = this.this$0;
                l20.d dVar2 = this.$info;
                long j112 = this.$updatePeriodSeconds;
                b11 = r.b(a11);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF3 = this.this$0;
        l20.d dVar3 = this.$info;
        r.Companion companion3 = r.INSTANCE;
        notificationCarouselV2Repository = notificationCarouselV2ViewModelFF3.repository;
        this.L$0 = null;
        this.label = 2;
        obj = notificationCarouselV2Repository.requestAsyncUpdate(dVar3, this);
        if (obj == aVar) {
            return aVar;
        }
        a11 = (NotificationCarouselV2VO) obj;
        r.Companion companion22 = r.INSTANCE;
        notificationCarouselV2ViewModelFF = this.this$0;
        if (!(a11 instanceof r.b)) {
            this.L$0 = a11;
            this.label = 3;
            newState = notificationCarouselV2ViewModelFF.setNewState(notificationCarouselV2VO, this);
            if (newState != aVar) {
            }
            return aVar;
        }
        NotificationCarouselV2ViewModelFF notificationCarouselV2ViewModelFF222 = this.this$0;
        l20.d dVar22 = this.$info;
        long j1122 = this.$updatePeriodSeconds;
        b11 = r.b(a11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((NotificationCarouselV2ViewModelFF$scheduleUpdate$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
