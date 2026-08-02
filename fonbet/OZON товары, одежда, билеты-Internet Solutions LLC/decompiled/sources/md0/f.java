package md0;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f74748a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f74749b;

    public f(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f74748a = key;
        this.f74749b = value;
    }

    @NotNull
    public final String a() {
        return this.f74748a;
    }

    @NotNull
    public final String b() {
        return this.f74749b;
    }

    @NotNull
    public final String c() {
        return this.f74748a;
    }

    @NotNull
    public final String d() {
        return this.f74749b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f74748a, fVar.f74748a) && Intrinsics.d(this.f74749b, fVar.f74749b);
    }

    public final int hashCode() {
        return this.f74749b.hashCode() + (this.f74748a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PreferenceEntry(key=");
        sb2.append(this.f74748a);
        sb2.append(", value=");
        return o0.c(sb2, this.f74749b, ")");
    }
}
