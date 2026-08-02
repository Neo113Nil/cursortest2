package ru.ozon.android.messenger.blocks.ai.header;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.reflect.h;
import ru.ozon.android.messenger.blocks.ai.header.presentation.compose.o;

/* loaded from: classes10.dex */
final class e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.blocks.ai.header.presentation.a f84110b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f84111c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f84112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar, g gVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f84110b = aVar;
        this.f84111c = gVar;
        this.f84112d = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            interfaceC3967k2.o(2112673230);
            g gVar = this.f84111c;
            boolean F11 = interfaceC3967k2.F(gVar);
            ru.ozon.android.messenger.framework.core.d dVar = this.f84112d;
            boolean F12 = F11 | interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(gVar, dVar);
                interfaceC3967k2.x(C11);
            }
            Function2 function2 = (Function2) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(2112682900);
            boolean F13 = interfaceC3967k2.F(dVar);
            Object C12 = interfaceC3967k2.C();
            if (F13 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(dVar);
                interfaceC3967k2.x(C12);
            }
            Function1 function1 = (Function1) C12;
            interfaceC3967k2.k();
            Object c11 = dVar.c();
            interfaceC3967k2.o(2112687247);
            boolean F14 = interfaceC3967k2.F(c11);
            Object C13 = interfaceC3967k2.C();
            if (F14 || C13 == InterfaceC3967k.a.a()) {
                Object dVar2 = new d(1, c11, ru.ozon.android.messenger.framework.navigation.controller.a.class, "handleViewEvent", "handleViewEvent(Ljava/util/Map;)V", 0);
                interfaceC3967k2.x(dVar2);
                C13 = dVar2;
            }
            interfaceC3967k2.k();
            o.a(this.f84110b, null, function2, function1, (Function1) ((h) C13), interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
