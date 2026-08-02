package v0;

import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import x0.AbstractC10611p;
import x0.Z;

/* renamed from: v0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10173m extends AbstractC10611p<C10169i> implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Z<C10169i> f101551a = new Z<>();

    public C10173m(@NotNull Function1<? super G, Unit> function1) {
        function1.invoke(this);
    }

    @Override // v0.G
    public final void a(int i11, Function1 function1, @NotNull Function1 function12, @NotNull C4912a c4912a) {
        this.f101551a.a(i11, new C10169i(function1, function12, c4912a));
    }

    @Override // v0.G
    public final void d(Object obj, @NotNull C4912a c4912a) {
        this.f101551a.a(1, new C10169i(obj != null ? new C10170j(obj) : null, new C10171k(1), new C4912a(true, -1010194746, new C10172l(c4912a))));
    }

    @Override // x0.AbstractC10611p
    public final Z g() {
        return this.f101551a;
    }
}
