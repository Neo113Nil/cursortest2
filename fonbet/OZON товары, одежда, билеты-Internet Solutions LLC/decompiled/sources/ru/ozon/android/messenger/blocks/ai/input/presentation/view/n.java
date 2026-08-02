package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.presentation.ai.K0;

/* loaded from: classes10.dex */
final class n extends AbstractC7737t implements Function2<Map<String, ? extends MessengerTrackingInfo>, ru.ozon.android.messenger.framework.navigation.action.a, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f84281b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.navigation.controller.a f84282c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K0 f84283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(o oVar, ru.ozon.android.messenger.framework.navigation.controller.a aVar, K0 k02) {
        super(2);
        this.f84281b = oVar;
        this.f84282c = aVar;
        this.f84283d = k02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Map<String, ? extends MessengerTrackingInfo> map, ru.ozon.android.messenger.framework.navigation.action.a aVar) {
        Map<String, ? extends MessengerTrackingInfo> trackingInfo = map;
        ru.ozon.android.messenger.framework.navigation.action.a action = aVar;
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f84281b.j0(this.f84282c, this.f84283d, trackingInfo, action);
        return Unit.f71690a;
    }
}
