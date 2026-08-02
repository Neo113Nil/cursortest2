package ru.ozon.android.messenger.blocks.floatbutton.ai;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.T;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f85163b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f85163b = gVar;
        this.f85164c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            float f7 = 20;
            androidx.compose.ui.e i11 = T.i(androidx.compose.ui.e.f40358c0, f7, f7, f7, 8);
            interfaceC3967k2.o(-993591433);
            g gVar = this.f85163b;
            boolean F11 = interfaceC3967k2.F(gVar);
            ru.ozon.android.messenger.framework.core.d dVar = this.f85164c;
            boolean F12 = F11 | interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(gVar, dVar);
                interfaceC3967k2.x(C11);
            }
            Function0 function0 = (Function0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-993586388);
            boolean F13 = interfaceC3967k2.F(dVar);
            Object C12 = interfaceC3967k2.C();
            if (F13 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(dVar);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            q.a(i11, gVar, function0, (Function2) C12, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
