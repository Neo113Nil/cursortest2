package ru.ozon.android.messenger.blocks.dangerousText;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f85008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f f85009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(e eVar, f fVar) {
        super(2);
        this.f85008b = eVar;
        this.f85009c = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            e eVar = this.f85008b;
            boolean b11 = eVar.b();
            IconDTO c11 = eVar.c();
            TextDTO d11 = eVar.d();
            ButtonV3DTO a11 = eVar.a();
            interfaceC3967k2.o(2122528132);
            f fVar = this.f85009c;
            boolean F11 = interfaceC3967k2.F(fVar) | interfaceC3967k2.F(eVar);
            Object C11 = interfaceC3967k2.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new g(eVar, fVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            c.b(b11, c11, d11, a11, (Function1) C11, interfaceC3967k2, IconDTO.$stable << 3);
        }
        return Unit.f71690a;
    }
}
