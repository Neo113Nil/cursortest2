package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9417e extends AbstractC7737t implements Function2<Map<String, ? extends MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89598b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9417e(C9413c c9413c) {
        super(2);
        this.f89598b = c9413c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Map<String, ? extends MessengerTrackingInfo> map, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        Map<String, ? extends MessengerTrackingInfo> map2 = map;
        ru.ozon.android.messenger.framework.navigation.action.a action = aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        C9413c c9413c = this.f89598b;
        if (map2 != null) {
            ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = c9413c.f89420d;
            if (aVar2 == 0) {
                Intrinsics.n("controller");
                throw null;
            }
            aVar2.m(map2);
        }
        ru.ozon.android.messenger.framework.navigation.controller.a aVar3 = c9413c.f89420d;
        if (aVar3 != null) {
            aVar3.q(action);
            return Unit.f71690a;
        }
        Intrinsics.n("controller");
        throw null;
    }
}
