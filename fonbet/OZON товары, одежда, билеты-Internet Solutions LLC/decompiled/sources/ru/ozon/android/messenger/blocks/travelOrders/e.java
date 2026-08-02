package ru.ozon.android.messenger.blocks.travelOrders;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function1<Map<String, ? extends MessengerTrackingInfo>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f86510b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ru.ozon.android.messenger.framework.navigation.controller.a aVar) {
        super(1);
        this.f86510b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends MessengerTrackingInfo> map) {
        Map<String, ? extends MessengerTrackingInfo> it = map;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f86510b.s(it);
        return Unit.f71690a;
    }
}
