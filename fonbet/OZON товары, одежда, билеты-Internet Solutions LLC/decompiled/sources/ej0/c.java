package ej0;

import P0.p2;
import P0.u2;
import P0.v2;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes3.dex */
final class c extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f62373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(String str) {
        super(2);
        this.f62373b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            p2.b(this.f62373b, null, 0L, 0L, 0L, null, 0L, 2, false, 1, 0, ((u2) interfaceC3967k2.m(v2.a())).n(), interfaceC3967k2, 0, 3120, 55294);
        }
        return Unit.f71690a;
    }
}
