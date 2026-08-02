package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2Repository;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1", f = "NotificationCarouselV2ViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1 extends j implements Function2<M, d<? super NotificationCarouselV2VO>, Object> {
    final /* synthetic */ l20.d $info;
    final /* synthetic */ I $wasWidgetUpdateSkipped;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCarouselV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1(NotificationCarouselV2ViewModel notificationCarouselV2ViewModel, l20.d dVar, I i11, d<? super NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1> dVar2) {
        super(2, dVar2);
        this.this$0 = notificationCarouselV2ViewModel;
        this.$info = dVar;
        this.$wasWidgetUpdateSkipped = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1 notificationCarouselV2ViewModel$scheduleUpdate$1$result$1 = new NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1(this.this$0, this.$info, this.$wasWidgetUpdateSkipped, dVar);
        notificationCarouselV2ViewModel$scheduleUpdate$1$result$1.L$0 = obj;
        return notificationCarouselV2ViewModel$scheduleUpdate$1$result$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        NotificationCarouselV2Repository notificationCarouselV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                NotificationCarouselV2ViewModel notificationCarouselV2ViewModel = this.this$0;
                l20.d dVar = this.$info;
                r.Companion companion = r.INSTANCE;
                notificationCarouselV2Repository = notificationCarouselV2ViewModel.repository;
                this.label = 1;
                obj = notificationCarouselV2Repository.requestAsyncUpdate(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (NotificationCarouselV2VO) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        I i12 = this.$wasWidgetUpdateSkipped;
        Throwable b11 = r.b(a11);
        if (b11 != null) {
            if (b11 instanceof Q00.a) {
                i12.f71783a = true;
            } else {
                Lm0.a.f17149a.e(b11);
            }
        }
        if (a11 instanceof r.b) {
            return null;
        }
        return a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super NotificationCarouselV2VO> dVar) {
        return ((NotificationCarouselV2ViewModel$scheduleUpdate$1$result$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
