package fj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63598a;

    /* renamed from: b, reason: collision with root package name */
    private final T f63599b;

    /* renamed from: c, reason: collision with root package name */
    private final T f63600c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f63601d;

    public c(@NotNull String key, T t2, T t11, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f63598a = key;
        this.f63599b = t2;
        this.f63600c = t11;
        this.f63601d = z11;
    }

    public final T a() {
        return this.f63599b;
    }

    public final boolean b() {
        return this.f63601d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f63598a, cVar.f63598a) && Intrinsics.d(this.f63599b, cVar.f63599b) && Intrinsics.d(this.f63600c, cVar.f63600c) && this.f63601d == cVar.f63601d;
    }

    public final int hashCode() {
        int hashCode = this.f63598a.hashCode() * 31;
        T t2 = this.f63599b;
        int hashCode2 = (hashCode + (t2 == null ? 0 : t2.hashCode())) * 31;
        T t11 = this.f63600c;
        return Boolean.hashCode(this.f63601d) + ((hashCode2 + (t11 != null ? t11.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Configuration(key=" + this.f63598a + ", value=" + this.f63599b + ", defaultValue=" + this.f63600c + ", isChanged=" + this.f63601d + ")";
    }
}
