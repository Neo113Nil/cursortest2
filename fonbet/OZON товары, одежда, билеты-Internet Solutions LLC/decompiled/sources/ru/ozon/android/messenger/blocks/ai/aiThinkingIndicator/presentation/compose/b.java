package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a f84079b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<Map<String, MessengerTrackingInfo>, Unit> f84080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a aVar, Function1 function1, int i11) {
        super(2);
        this.f84079b = aVar;
        this.f84080c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1);
        c.a(this.f84079b, this.f84080c, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
