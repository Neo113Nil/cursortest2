package ru.ozon.android.messenger.framework.presentation.ai;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.notification.g;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9429k extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9429k(C9413c c9413c) {
        super(0);
        this.f89629b = c9413c;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C9413c c9413c = this.f89629b;
        g.a aVar = c9413c.f89422f;
        if (aVar == null) {
            Intrinsics.n("noInternetNotificationPresenter");
            throw null;
        }
        ConstraintLayout constraintLayout = C9413c.y(c9413c).getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        NotificationLayoutManager asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(constraintLayout, null, 1, null);
        androidx.lifecycle.J viewLifecycleOwner = c9413c.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        aVar.a(asNotificationLayoutManager$default, viewLifecycleOwner);
        return Unit.f71690a;
    }
}
