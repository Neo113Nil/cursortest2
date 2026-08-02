package n20;

import kotlin.jvm.internal.Intrinsics;
import m20.InterfaceC8046a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n20.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C8426f<M extends InterfaceC8046a<?, ? extends l20.c>> {

    /* renamed from: a, reason: collision with root package name */
    private final int f76362a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final M f76363b;

    public C8426f(int i11, @NotNull M mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f76362a = i11;
        this.f76363b = mapper;
    }

    public final int a() {
        return this.f76362a;
    }

    @NotNull
    public final M b() {
        return this.f76363b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8426f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.composer.widget.store.KeyedViewMapper<*>");
        return this.f76362a == ((C8426f) obj).f76362a;
    }

    public final int hashCode() {
        return this.f76362a;
    }

    @NotNull
    public final String toString() {
        return "KeyedViewMapper(key=" + this.f76362a + ", mapper=" + this.f76363b + ")";
    }
}
