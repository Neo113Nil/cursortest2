package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import Lm0.a;
import android.widget.RemoteViews;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.R$drawable;
import ru.ozon.app.android.fresh.unsorted.R$id;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ClickLiveActivityNotificationProvider$setImage$bitmap$1 extends AbstractC7737t implements Function1<Exception, Unit> {
    final /* synthetic */ ClickLiveActivityNotificationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickLiveActivityNotificationProvider$setImage$bitmap$1(ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider) {
        super(1);
        this.this$0 = clickLiveActivityNotificationProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        invoke2(exc);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        RemoteViews[] layouts;
        a.f17149a.e(exc);
        layouts = this.this$0.getLayouts();
        for (RemoteViews remoteViews : layouts) {
            remoteViews.setImageViewResource(R$id.image, R$drawable.click_image);
        }
    }
}
