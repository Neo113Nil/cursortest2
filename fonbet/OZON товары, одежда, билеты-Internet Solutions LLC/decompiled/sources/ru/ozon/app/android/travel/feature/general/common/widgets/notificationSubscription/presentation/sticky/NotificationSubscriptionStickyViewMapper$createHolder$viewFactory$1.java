package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.presentation.sticky;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view.NotificationSubscriptionView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/view/NotificationSubscriptionView;", "parent", "Landroid/widget/LinearLayout;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionStickyViewMapper$createHolder$viewFactory$1 extends AbstractC7737t implements Function1<LinearLayout, NotificationSubscriptionView> {
    public static final NotificationSubscriptionStickyViewMapper$createHolder$viewFactory$1 INSTANCE = new NotificationSubscriptionStickyViewMapper$createHolder$viewFactory$1();

    NotificationSubscriptionStickyViewMapper$createHolder$viewFactory$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final NotificationSubscriptionView invoke(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        NotificationSubscriptionView notificationSubscriptionView = new NotificationSubscriptionView(context);
        notificationSubscriptionView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return notificationSubscriptionView;
    }
}
