package ru.ozon.app.android.favorites.ui.actionhandler;

import W10.c;
import android.content.Intent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.favorites.ui.notification.NotificationBundle;
import ru.ozon.uni.atoms.data.notification.NotificationModelWrapper;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/content/Intent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FavoriteListAddActionHandlerImpl$showNotificationAndDismissIfNeeded$1 extends AbstractC7737t implements Function1<Intent, Unit> {
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    final /* synthetic */ NotificationModelWrapper $notification;
    final /* synthetic */ Map<String, String> $payloads;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FavoriteListAddActionHandlerImpl$showNotificationAndDismissIfNeeded$1(NotificationModelWrapper notificationModelWrapper, Map<String, String> map, CustomActionHandler.HandlerReferences handlerReferences) {
        super(1);
        this.$notification = notificationModelWrapper;
        this.$payloads = map;
        this.$handlerRefs = handlerReferences;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Intent intent) {
        invoke2(intent);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Intent sendResultToTargetFragment) {
        Intrinsics.checkNotNullParameter(sendResultToTargetFragment, "$this$sendResultToTargetFragment");
        NotificationModelWrapper notificationModelWrapper = this.$notification;
        if (notificationModelWrapper == null) {
            return;
        }
        Map<String, String> map = this.$payloads;
        Long voId = this.$handlerRefs.getVoId();
        c trackingData = this.$handlerRefs.getTrackingData();
        if (trackingData == null) {
            trackingData = new c(null, null, null);
        }
        sendResultToTargetFragment.putExtra("bundle", new NotificationBundle(notificationModelWrapper, map, voId, trackingData));
    }
}
