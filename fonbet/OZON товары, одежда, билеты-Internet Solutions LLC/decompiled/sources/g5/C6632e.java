package g5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6632e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63853a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f63854b;

    public C6632e(@NotNull String key, Long l11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f63853a = key;
        this.f63854b = l11;
    }

    @NotNull
    public final String a() {
        return this.f63853a;
    }

    public final Long b() {
        return this.f63854b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6632e)) {
            return false;
        }
        C6632e c6632e = (C6632e) obj;
        return Intrinsics.d(this.f63853a, c6632e.f63853a) && Intrinsics.d(this.f63854b, c6632e.f63854b);
    }

    public final int hashCode() {
        int hashCode = this.f63853a.hashCode() * 31;
        Long l11 = this.f63854b;
        return hashCode + (l11 == null ? 0 : l11.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Preference(key=" + this.f63853a + ", value=" + this.f63854b + ')';
    }
}
