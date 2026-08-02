package fj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h implements g<Integer> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63607a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63608b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63609c;

    public h(@NotNull String key, int i11, boolean z11) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f63607a = key;
        this.f63608b = i11;
        this.f63609c = z11;
    }

    @NotNull
    public final Integer a() {
        return Integer.valueOf(this.f63608b);
    }

    public final boolean b() {
        return this.f63609c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f63607a, hVar.f63607a) && this.f63608b == hVar.f63608b && this.f63609c == hVar.f63609c;
    }

    @Override // fj0.g
    @NotNull
    public final String getKey() {
        return this.f63607a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63609c) + (((this.f63607a.hashCode() * 31) + this.f63608b) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerIntConfigurationItem(key=");
        sb2.append(this.f63607a);
        sb2.append(", value=");
        sb2.append(this.f63608b);
        sb2.append(", isDefault=");
        return Pk0.a.a(")", sb2, this.f63609c);
    }
}
