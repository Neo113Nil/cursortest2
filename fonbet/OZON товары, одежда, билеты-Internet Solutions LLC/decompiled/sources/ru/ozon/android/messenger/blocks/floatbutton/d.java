package ru.ozon.android.messenger.blocks.floatbutton;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f85210b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f85211c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, ru.ozon.android.messenger.framework.core.d dVar) {
        super(2);
        this.f85210b = fVar;
        this.f85211c = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            f fVar = this.f85210b;
            IconDTO d11 = fVar.d();
            TextDTO e11 = fVar.e();
            String b11 = fVar.b();
            Integer c11 = fVar.c();
            interfaceC3967k2.o(-1880858630);
            boolean F11 = interfaceC3967k2.F(fVar);
            ru.ozon.android.messenger.framework.core.d dVar = this.f85211c;
            boolean F12 = F11 | interfaceC3967k2.F(dVar);
            Object C11 = interfaceC3967k2.C();
            if (F12 || C11 == InterfaceC3967k.a.a()) {
                C11 = new b(fVar, dVar);
                interfaceC3967k2.x(C11);
            }
            Function0 function0 = (Function0) C11;
            interfaceC3967k2.k();
            interfaceC3967k2.o(-1880849425);
            boolean F13 = interfaceC3967k2.F(fVar) | interfaceC3967k2.F(dVar);
            Object C12 = interfaceC3967k2.C();
            if (F13 || C12 == InterfaceC3967k.a.a()) {
                C12 = new c(fVar, dVar);
                interfaceC3967k2.x(C12);
            }
            interfaceC3967k2.k();
            l.a(null, d11, b11, c11, e11, function0, (Function0) C12, interfaceC3967k2, IconDTO.$stable << 3);
        }
        return Unit.f71690a;
    }
}
