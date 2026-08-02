package y0;

import S0.InterfaceC3967k;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;

/* renamed from: y0.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10811s implements AbstractC10611p.a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<Integer, Object> f105852a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC6512o<O, Integer, InterfaceC3967k, Integer, Unit> f105853b;

    /* JADX WARN: Multi-variable type inference failed */
    public C10811s(Function1<? super Integer, ? extends Object> function1, @NotNull InterfaceC6512o<? super O, ? super Integer, ? super InterfaceC3967k, ? super Integer, Unit> interfaceC6512o) {
        this.f105852a = function1;
        this.f105853b = interfaceC6512o;
    }

    @NotNull
    public final InterfaceC6512o<O, Integer, InterfaceC3967k, Integer, Unit> a() {
        return this.f105853b;
    }

    @Override // x0.AbstractC10611p.a
    public final Function1<Integer, Object> getKey() {
        return this.f105852a;
    }
}
