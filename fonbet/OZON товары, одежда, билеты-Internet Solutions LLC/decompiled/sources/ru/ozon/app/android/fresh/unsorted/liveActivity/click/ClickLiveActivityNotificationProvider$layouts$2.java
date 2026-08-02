package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroid/widget/RemoteViews;", "invoke", "()[Landroid/widget/RemoteViews;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClickLiveActivityNotificationProvider$layouts$2 extends AbstractC7737t implements Function0<RemoteViews[]> {
    final /* synthetic */ ClickLiveActivityNotificationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickLiveActivityNotificationProvider$layouts$2(ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider) {
        super(0);
        this.this$0 = clickLiveActivityNotificationProvider;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RemoteViews[] invoke() {
        RemoteViews collapsedLayout;
        RemoteViews expandedLayout;
        collapsedLayout = this.this$0.getCollapsedLayout();
        expandedLayout = this.this$0.getExpandedLayout();
        return new RemoteViews[]{collapsedLayout, expandedLayout};
    }
}
