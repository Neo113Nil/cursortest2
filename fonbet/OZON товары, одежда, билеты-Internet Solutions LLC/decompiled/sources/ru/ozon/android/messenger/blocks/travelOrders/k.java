package ru.ozon.android.messenger.blocks.travelOrders;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import v0.InterfaceC10165e;

/* loaded from: classes10.dex */
public final class k extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f86528b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f86529c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ p f86530d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function1 f86531e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List list, float f7, p pVar, Function1 function1) {
        super(4);
        this.f86528b = list;
        this.f86529c = f7;
        this.f86530d = pVar;
        this.f86531e = function1;
    }

    @Override // fd.InterfaceC6512o
    public final Unit invoke(InterfaceC10165e interfaceC10165e, Integer num, InterfaceC3967k interfaceC3967k, Integer num2) {
        int i11;
        InterfaceC10165e interfaceC10165e2 = interfaceC10165e;
        int intValue = num.intValue();
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i11 = (interfaceC3967k2.n(interfaceC10165e2) ? 4 : 2) | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i11 |= interfaceC3967k2.r(intValue) ? 32 : 16;
        }
        if ((i11 & 147) == 146 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            a aVar = (a) this.f86528b.get(intValue);
            interfaceC3967k2.o(-45782439);
            p pVar = this.f86530d;
            String a11 = pVar.a();
            CornerRadius b11 = pVar.b();
            interfaceC3967k2.o(-1109848399);
            Function1 function1 = this.f86531e;
            boolean n11 = interfaceC3967k2.n(function1) | interfaceC3967k2.F(aVar);
            Object C11 = interfaceC3967k2.C();
            if (n11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new h(function1, aVar);
                interfaceC3967k2.x(C11);
            }
            interfaceC3967k2.k();
            n.c(aVar, this.f86529c, a11, b11, (Function0) C11, interfaceC3967k2, 0);
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
