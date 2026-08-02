package e2;

import B1.E;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: e2.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6266j implements E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6260d f61832a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<C6259c, Unit> f61833b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f61834c;

    /* JADX WARN: Multi-variable type inference failed */
    public C6266j(@NotNull C6260d c6260d, @NotNull Function1<? super C6259c, Unit> function1) {
        this.f61832a = c6260d;
        this.f61833b = function1;
        this.f61834c = c6260d.a();
    }

    @NotNull
    public final Function1<C6259c, Unit> a() {
        return this.f61833b;
    }

    @NotNull
    public final C6260d b() {
        return this.f61832a;
    }

    @Override // B1.E
    @NotNull
    public final Object e1() {
        return this.f61834c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6266j)) {
            return false;
        }
        C6266j c6266j = (C6266j) obj;
        return Intrinsics.d(this.f61832a.a(), c6266j.f61832a.a()) && this.f61833b == c6266j.f61833b;
    }

    public final int hashCode() {
        return this.f61833b.hashCode() + (this.f61832a.a().hashCode() * 31);
    }
}
