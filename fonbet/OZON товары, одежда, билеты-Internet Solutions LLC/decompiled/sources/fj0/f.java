package fj0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class f implements g<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63604a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f63605b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63606c;

    public f(@NotNull String key, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f63604a = key;
        this.f63605b = z11;
        this.f63606c = z12;
    }

    @NotNull
    public final Boolean a() {
        return Boolean.valueOf(this.f63605b);
    }

    public final boolean b() {
        return this.f63606c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f63604a, fVar.f63604a) && this.f63605b == fVar.f63605b && this.f63606c == fVar.f63606c;
    }

    @Override // fj0.g
    @NotNull
    public final String getKey() {
        return this.f63604a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63606c) + C3532b.a(this.f63604a.hashCode() * 31, 31, this.f63605b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackerBooleanConfigurationItem(key=");
        sb2.append(this.f63604a);
        sb2.append(", value=");
        sb2.append(this.f63605b);
        sb2.append(", isDefault=");
        return Pk0.a.a(")", sb2, this.f63606c);
    }
}
