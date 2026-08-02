package v0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;

/* renamed from: v0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10169i implements AbstractC10611p.a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1<Integer, Object> f101546a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Object> f101547b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C4912a f101548c;

    public C10169i(Function1 function1, @NotNull Function1 function12, @NotNull C4912a c4912a) {
        this.f101546a = function1;
        this.f101547b = function12;
        this.f101548c = c4912a;
    }

    @NotNull
    public final InterfaceC6512o<InterfaceC10165e, Integer, InterfaceC3967k, Integer, Unit> a() {
        return this.f101548c;
    }

    @Override // x0.AbstractC10611p.a
    public final Function1<Integer, Object> getKey() {
        return this.f101546a;
    }

    @Override // x0.AbstractC10611p.a
    @NotNull
    public final Function1<Integer, Object> getType() {
        return this.f101547b;
    }
}
