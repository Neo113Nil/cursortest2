package x0;

import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10617v extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC10620y f104790b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f104791c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f104792d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10617v(int i11, Object obj, InterfaceC10620y interfaceC10620y) {
        super(2);
        this.f104790b = interfaceC10620y;
        this.f104791c = i11;
        this.f104792d = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            this.f104790b.f(this.f104791c, this.f104792d, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
