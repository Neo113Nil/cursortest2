package le;

import Sc.InterfaceC4008j;
import java.util.Collection;
import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9814E;
import td.InterfaceC9815F;
import td.InterfaceC9827S;
import td.InterfaceC9845k;
import td.InterfaceC9847m;
import ud.InterfaceC10030h;

/* renamed from: le.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7942e implements InterfaceC9815F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C7942e f73250a = new C7942e();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Sd.f f73251b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final K f73252c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f73253d;

    static {
        Sd.f i11 = Sd.f.i(EnumC7939b.ERROR_MODULE.a());
        Intrinsics.checkNotNullExpressionValue(i11, "special(...)");
        f73251b = i11;
        f73252c = K.f71697a;
        f73253d = Sc.k.b(C7941d.f73249a);
    }

    @Override // td.InterfaceC9815F
    public final boolean D0(@NotNull InterfaceC9815F targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // td.InterfaceC9815F
    public final <T> T F(@NotNull C9814E<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final List<InterfaceC9815F> Q() {
        return f73252c;
    }

    @Override // td.InterfaceC9845k
    public final <R, D> R X(@NotNull InterfaceC9847m<R, D> visitor, D d11) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // td.InterfaceC9845k
    @NotNull
    /* renamed from: a */
    public final InterfaceC9845k n0() {
        return this;
    }

    @Override // td.InterfaceC9845k
    public final InterfaceC9845k d() {
        return null;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return InterfaceC10030h.a.b();
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final Sd.f getName() {
        return f73251b;
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final Collection<Sd.c> j(@NotNull Sd.c fqName, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return K.f71697a;
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final qd.m n() {
        return (qd.m) f73253d.getValue();
    }

    @Override // td.InterfaceC9815F
    @NotNull
    public final InterfaceC9827S v(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }
}
