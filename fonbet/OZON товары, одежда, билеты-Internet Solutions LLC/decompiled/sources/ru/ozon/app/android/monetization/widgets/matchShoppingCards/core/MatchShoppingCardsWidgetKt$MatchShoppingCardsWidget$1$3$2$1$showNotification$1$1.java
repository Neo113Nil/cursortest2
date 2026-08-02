package ru.ozon.app.android.monetization.widgets.matchShoppingCards.core;

import Tg.b;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "notification", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$showNotification$1$1 extends AbstractC7737t implements Function1<NotificationDTO, Unit> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ C4911f $container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MatchShoppingCardsWidgetKt$MatchShoppingCardsWidget$1$3$2$1$showNotification$1$1(C4911f c4911f, Function1<? super b, Unit> function1) {
        super(1);
        this.$container = c4911f;
        this.$actionHandler = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NotificationDTO notificationDTO) {
        invoke2(notificationDTO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NotificationDTO notification) {
        ViewGroup rootView;
        NotificationLayoutManager asNotificationLayoutManager$default;
        Intrinsics.checkNotNullParameter(notification, "notification");
        r a11 = this.$container.a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(rootView, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.$container.e(), this.$actionHandler).show();
    }
}
