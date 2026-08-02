package ru.ozon.android.messenger.framework.presentation.search.composable;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class s extends AbstractC7737t implements Function1<Map<String, ? extends MessengerTrackingInfo>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f91696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f91696b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends MessengerTrackingInfo> map) {
        ru.ozon.android.messenger.framework.navigation.controller.a c11;
        Map<String, ? extends MessengerTrackingInfo> trackingInfo = map;
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        ru.ozon.android.messenger.framework.core.d dVar = this.f91696b;
        if (dVar != null && (c11 = dVar.c()) != 0) {
            c11.s(trackingInfo);
        }
        return Unit.f71690a;
    }
}
