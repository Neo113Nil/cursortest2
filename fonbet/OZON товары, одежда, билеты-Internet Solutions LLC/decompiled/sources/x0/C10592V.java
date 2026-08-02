package x0;

import S0.InterfaceC3967k;
import a1.C4912a;
import b1.C5511n;
import b1.InterfaceC5505h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: x0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C10592V extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10586O f104703b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f104704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C10592V(C10586O c10586o, C4912a c4912a) {
        super(2);
        this.f104703b = c10586o;
        this.f104704c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            InterfaceC5505h a11 = C5511n.a(interfaceC3967k2);
            C10586O c10586o = this.f104703b;
            c10586o.h(a11);
            this.f104704c.invoke(c10586o, interfaceC3967k2, 0);
        }
        return Unit.f71690a;
    }
}
