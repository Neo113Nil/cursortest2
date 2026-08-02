package ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.reflect.h;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a f84067b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.a aVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f84067b = aVar;
        this.f84068c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            ru.ozon.android.messenger.framework.navigation.controller.a c11 = this.f84068c.c();
            interfaceC3967k2.o(-2041385115);
            boolean F11 = interfaceC3967k2.F(c11);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(1, c11, ru.ozon.android.messenger.framework.navigation.controller.a.class, "handleViewEvent", "handleViewEvent(Ljava/util/Map;)V", 0);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            ru.ozon.android.messenger.blocks.ai.aiThinkingIndicator.presentation.compose.c.a(this.f84067b, (Function1) ((h) C11), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
