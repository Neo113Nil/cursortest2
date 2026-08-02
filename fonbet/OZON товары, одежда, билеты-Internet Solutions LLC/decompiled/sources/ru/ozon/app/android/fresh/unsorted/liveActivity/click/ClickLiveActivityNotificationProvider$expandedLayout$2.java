package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.R$layout;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/RemoteViews;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClickLiveActivityNotificationProvider$expandedLayout$2 extends AbstractC7737t implements Function0<RemoteViews> {
    final /* synthetic */ ClickLiveActivityNotificationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickLiveActivityNotificationProvider$expandedLayout$2(ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider) {
        super(0);
        this.this$0 = clickLiveActivityNotificationProvider;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final RemoteViews invoke() {
        return new RemoteViews(this.this$0.context.getPackageName(), R$layout.click_notification_la_expanded);
    }
}
