package ru.ozon.android.messenger.blocks.ai.aiEmptyState;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final /* synthetic */ class b extends C7735q implements Function1<Map<String, ? extends MessengerTrackingInfo>, Unit> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends MessengerTrackingInfo> map) {
        ((ru.ozon.android.messenger.framework.navigation.controller.a) this.receiver).s(map);
        return Unit.f71690a;
    }
}
