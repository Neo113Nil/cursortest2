package ru.ozon.android.messenger.blocks.header;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;

/* loaded from: classes10.dex */
final class q extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f85319b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(s sVar) {
        super(2);
        this.f85319b = sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            s sVar = this.f85319b;
            if (sVar.g() == null && sVar.h() == null) {
                interfaceC3967k2.o(-503887577);
                l.a(null, sVar.b(), sVar.f(), 0.0f, 0.0f, 0L, 0L, interfaceC3967k2, IconDTO.$stable << 3);
                interfaceC3967k2.k();
            } else {
                interfaceC3967k2.o(-504179349);
                f.a(sVar.b(), null, sVar.g(), sVar.h(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, interfaceC3967k2, IconDTO.$stable | (Icon.$stable << 6));
                interfaceC3967k2.k();
            }
        }
        return Unit.f71690a;
    }
}
