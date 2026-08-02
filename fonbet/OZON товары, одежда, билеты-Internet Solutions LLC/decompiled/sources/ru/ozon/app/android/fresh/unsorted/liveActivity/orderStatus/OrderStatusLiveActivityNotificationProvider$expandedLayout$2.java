package ru.ozon.app.android.fresh.unsorted.liveActivity.orderStatus;

import android.content.Context;
import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.R$layout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/RemoteViews;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OrderStatusLiveActivityNotificationProvider$expandedLayout$2 extends AbstractC7737t implements Function0<RemoteViews> {
    final /* synthetic */ OrderStatusLiveActivityNotificationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderStatusLiveActivityNotificationProvider$expandedLayout$2(OrderStatusLiveActivityNotificationProvider orderStatusLiveActivityNotificationProvider) {
        super(0);
        this.this$0 = orderStatusLiveActivityNotificationProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RemoteViews invoke() {
        Context context;
        context = this.this$0.context;
        return new RemoteViews(context.getPackageName(), R$layout.notification_la_expanded);
    }
}
