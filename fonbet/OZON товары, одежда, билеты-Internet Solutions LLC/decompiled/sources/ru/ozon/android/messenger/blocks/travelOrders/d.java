package ru.ozon.android.messenger.blocks.travelOrders;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f86509b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.android.messenger.framework.navigation.controller.a aVar) {
        super(1);
        this.f86509b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a aVar) {
        a item = aVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Map<String, MessengerTrackingInfo> e11 = item.e();
        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = this.f86509b;
        if (e11 != null) {
            aVar2.m(e11);
        }
        aVar2.q(ru.ozon.android.messenger.framework.navigation.action.b.c(item.a()));
        return Unit.f71690a;
    }
}
