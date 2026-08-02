package w0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;

/* renamed from: w0.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10393i implements AbstractC10611p.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<InterfaceC10402s, Integer, C10387c> f103271a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Object> f103272b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4912a f103273c;

    public C10393i(@NotNull Function2 function2, @NotNull Function1 function1, @NotNull C4912a c4912a) {
        this.f103271a = function2;
        this.f103272b = function1;
        this.f103273c = c4912a;
    }

    @NotNull
    public final InterfaceC6512o<InterfaceC10401q, Integer, InterfaceC3967k, Integer, Unit> a() {
        return this.f103273c;
    }

    @NotNull
    public final Function2<InterfaceC10402s, Integer, C10387c> b() {
        return this.f103271a;
    }

    @Override // x0.AbstractC10611p.a
    public final Function1<Integer, Object> getKey() {
        return null;
    }

    @Override // x0.AbstractC10611p.a
    @NotNull
    public final Function1<Integer, Object> getType() {
        return this.f103272b;
    }
}
