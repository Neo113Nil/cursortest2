package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2NewStateUpdateKey;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "newState", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.NotificationCarouselV2ViewHolder$onAttach$1", f = "NotificationCarouselV2ViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class NotificationCarouselV2ViewHolder$onAttach$1 extends j implements Function2<NotificationCarouselV2VO, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NotificationCarouselV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewHolder$onAttach$1(NotificationCarouselV2ViewHolder notificationCarouselV2ViewHolder, d<? super NotificationCarouselV2ViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = notificationCarouselV2ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        NotificationCarouselV2ViewHolder$onAttach$1 notificationCarouselV2ViewHolder$onAttach$1 = new NotificationCarouselV2ViewHolder$onAttach$1(this.this$0, dVar);
        notificationCarouselV2ViewHolder$onAttach$1.L$0 = obj;
        return notificationCarouselV2ViewHolder$onAttach$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        NotificationCarouselV2VO notificationCarouselV2VO = (NotificationCarouselV2VO) this.L$0;
        composerReferences = this.this$0.composerReferences;
        InterfaceC7851b controller = composerReferences.getController();
        NotificationCarouselV2VO notificationCarouselV2VO2 = (NotificationCarouselV2VO) this.this$0.getBoundData();
        controller.update(new NotificationCarouselV2NewStateUpdateKey(notificationCarouselV2VO2 != null ? new Long(notificationCarouselV2VO2.getId()) : null, notificationCarouselV2VO));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationCarouselV2VO notificationCarouselV2VO, d<? super Unit> dVar) {
        return ((NotificationCarouselV2ViewHolder$onAttach$1) create(notificationCarouselV2VO, dVar)).invokeSuspend(Unit.f71690a);
    }
}
