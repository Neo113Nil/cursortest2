package fj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: fj0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6575b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g<?> f63597b;

    public C6575b(boolean z11, @NotNull g<?> configurationItem) {
        Intrinsics.checkNotNullParameter(configurationItem, "configurationItem");
        this.f63596a = z11;
        this.f63597b = configurationItem;
    }

    @NotNull
    public final g<?> a() {
        return this.f63597b;
    }

    public final boolean b() {
        return this.f63596a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6575b)) {
            return false;
        }
        C6575b c6575b = (C6575b) obj;
        return this.f63596a == c6575b.f63596a && Intrinsics.d(this.f63597b, c6575b.f63597b);
    }

    public final int hashCode() {
        return this.f63597b.hashCode() + (Boolean.hashCode(this.f63596a) * 31);
    }

    @NotNull
    public final String toString() {
        return "ConfigData(isChanged=" + this.f63596a + ", configurationItem=" + this.f63597b + ")";
    }
}
