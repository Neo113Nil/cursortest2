package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class NotificationCarouselV2ViewHolderFF$subscribeToWidgetUpdates$1 extends C7719a implements Function2<NotificationCarouselV2VO, d<? super Unit>, Object> {
    NotificationCarouselV2ViewHolderFF$subscribeToWidgetUpdates$1(Object obj) {
        super(2, obj, NotificationCarouselV2ViewHolderFF.class, "bind", "bind(Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NotificationCarouselV2VO notificationCarouselV2VO, d<? super Unit> dVar) {
        Object subscribeToWidgetUpdates$bind;
        subscribeToWidgetUpdates$bind = NotificationCarouselV2ViewHolderFF.subscribeToWidgetUpdates$bind((NotificationCarouselV2ViewHolderFF) this.receiver, notificationCarouselV2VO, dVar);
        return subscribeToWidgetUpdates$bind;
    }
}
