package v5;

import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: v5.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10244r {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C10244r f102276b = new C10244r(U.c());

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Class<?>, Object> f102277a;

    public /* synthetic */ C10244r(Map map, int i11) {
        this(map);
    }

    @NotNull
    public final Map<Class<?>, Object> a() {
        return this.f102277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10244r) {
            return Intrinsics.d(this.f102277a, ((C10244r) obj).f102277a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f102277a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "Tags(tags=" + this.f102277a + ')';
    }

    private C10244r(Map<Class<?>, ? extends Object> map) {
        this.f102277a = map;
    }
}
