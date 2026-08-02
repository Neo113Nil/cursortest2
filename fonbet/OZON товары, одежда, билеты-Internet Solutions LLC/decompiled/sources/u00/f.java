package u00;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import s00.C9576a;
import s00.C9577b;
import s00.C9579d;
import t00.AbstractC9720b;
import v0.InterfaceC10165e;

/* loaded from: classes3.dex */
public final class f extends AbstractC7737t implements InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f99700b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f99701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List list, l lVar) {
        super(4);
        this.f99700b = list;
        this.f99701c = lVar;
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
            AbstractC9720b abstractC9720b = (AbstractC9720b) this.f99700b.get(intValue);
            interfaceC3967k2.o(798734413);
            boolean z11 = abstractC9720b instanceof AbstractC9720b.C2174b;
            l lVar = this.f99701c;
            if (z11) {
                interfaceC3967k2.o(-112779167);
                C9577b.a((AbstractC9720b.C2174b) abstractC9720b, l.y(lVar), interfaceC3967k2, 0);
                interfaceC3967k2.k();
            } else if (abstractC9720b instanceof AbstractC9720b.d) {
                interfaceC3967k2.o(-112775520);
                C9579d.a((AbstractC9720b.d) abstractC9720b, l.y(lVar), interfaceC3967k2, 0);
                interfaceC3967k2.k();
            } else {
                if (!(abstractC9720b instanceof AbstractC9720b.a)) {
                    throw U7.l.c(interfaceC3967k2, -112781706);
                }
                interfaceC3967k2.o(-112771618);
                C9576a.a((AbstractC9720b.a) abstractC9720b, interfaceC3967k2, 0);
                interfaceC3967k2.k();
            }
            interfaceC3967k2.k();
        }
        return Unit.f71690a;
    }
}
