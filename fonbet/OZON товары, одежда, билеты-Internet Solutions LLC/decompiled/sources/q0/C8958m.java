package q0;

import B0.K;
import S0.InterfaceC3967k;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8958m extends AbstractC7737t implements InterfaceC6511n<C8950e, InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K f81325b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f81326c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f81327d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8958m(K k11, boolean z11, androidx.compose.ui.e eVar, Function0 function0) {
        super(3);
        this.f81325b = k11;
        this.f81326c = z11;
        this.f81327d = eVar;
        this.f81328e = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // fd.InterfaceC6511n
    public final Unit invoke(C8950e c8950e, InterfaceC3967k interfaceC3967k, Integer num) {
        C8950e c8950e2 = c8950e;
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= interfaceC3967k2.n(c8950e2) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            String str = (String) this.f81325b.invoke(interfaceC3967k2, 0);
            if (kotlin.text.h.K(str)) {
                throw new IllegalStateException("Label must not be blank");
            }
            ?? r42 = this.f81328e;
            C8969x.b(str, this.f81326c, c8950e2, this.f81327d, r42, interfaceC3967k2, (intValue << 6) & 896);
        }
        return Unit.f71690a;
    }
}
