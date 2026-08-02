package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.data.NotificationCarouselV2RepositoryImpl", f = "NotificationCarouselV2RepositoryImpl.kt", l = {14}, m = "requestAsyncUpdate")
/* loaded from: classes12.dex */
final class NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationCarouselV2RepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1(NotificationCarouselV2RepositoryImpl notificationCarouselV2RepositoryImpl, d<? super NotificationCarouselV2RepositoryImpl$requestAsyncUpdate$1> dVar) {
        super(dVar);
        this.this$0 = notificationCarouselV2RepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= LinearLayoutManager.INVALID_OFFSET;
        return this.this$0.requestAsyncUpdate(null, this);
    }
}
