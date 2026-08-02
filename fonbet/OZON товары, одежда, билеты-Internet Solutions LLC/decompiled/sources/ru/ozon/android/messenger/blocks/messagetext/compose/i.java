package ru.ozon.android.messenger.blocks.messagetext.compose;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function2<ru.ozon.android.messenger.framework.navigation.action.a, Map<String, ? extends MessengerTrackingInfo>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f85839b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ru.ozon.android.messenger.framework.navigation.action.a aVar, Map<String, ? extends MessengerTrackingInfo> map) {
        Map<String, ? extends MessengerTrackingInfo> map2 = map;
        Intrinsics.checkNotNullParameter(aVar, "<unused var>");
        if (map2 != null) {
            this.f85839b.c().m(map2);
        }
        return Unit.f71690a;
    }
}
