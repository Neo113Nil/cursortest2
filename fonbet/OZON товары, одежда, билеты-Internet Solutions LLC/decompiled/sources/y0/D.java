package y0;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;

/* loaded from: classes8.dex */
final class D extends AbstractC10611p<C10811s> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6512o<O, Integer, InterfaceC3967k, Integer, Unit> f105640a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1<Integer, Object> f105641b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x0.Z f105642c;

    /* JADX WARN: Multi-variable type inference failed */
    public D(@NotNull InterfaceC6512o<? super O, ? super Integer, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o, Function1<? super Integer, ? extends Object> function1, int i11) {
        this.f105640a = interfaceC6512o;
        this.f105641b = function1;
        x0.Z z11 = new x0.Z();
        z11.a(i11, new C10811s(function1, interfaceC6512o));
        this.f105642c = z11;
    }

    @Override // x0.AbstractC10611p
    @NotNull
    public final x0.Z g() {
        return this.f105642c;
    }
}
