package ru.ozon.android.messenger.framework.presentation.ai;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nm0.C8612b;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.common.notification.j;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9431l extends AbstractC7737t implements Function1<Map<String, ? extends Object>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89632b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9431l(C9413c c9413c) {
        super(1);
        this.f89632b = c9413c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends Object> map) {
        String str;
        Map<String, ? extends Object> map2 = map;
        C9413c c9413c = this.f89632b;
        ViewGroup b11 = C8612b.b(c9413c);
        if (b11 != null && map2 != null && (str = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.TEXT.a(), map2)) != null) {
            Context context = b11.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ru.ozon.android.messenger.utils.c.f(context, str);
            String str2 = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.NOTIFICATION_TITLE.a(), map2);
            if (str2 != null) {
                String str3 = (String) ru.ozon.android.messenger.framework.navigation.action.b.b(d.c.NOTIFICATION_SUBTITLE.a(), map2);
                j.a aVar = c9413c.f89423g;
                if (aVar == null) {
                    Intrinsics.n("successNotificationPresenter");
                    throw null;
                }
                NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(b11, null, 1, null);
                androidx.lifecycle.J viewLifecycleOwner = c9413c.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                aVar.a(asNotificationLayoutManager$default, viewLifecycleOwner, str2, str3);
            }
        }
        return Unit.f71690a;
    }
}
