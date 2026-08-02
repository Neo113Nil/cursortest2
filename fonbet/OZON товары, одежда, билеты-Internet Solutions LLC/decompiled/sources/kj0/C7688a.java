package kj0;

import Ve.Om;
import fj0.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: kj0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7688a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f71664a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f71665b;

    public C7688a(@NotNull ArrayList configurations, boolean z11) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f71664a = z11;
        this.f71665b = configurations;
    }

    @NotNull
    public final List<g<?>> a() {
        return this.f71665b;
    }

    public final boolean b() {
        return this.f71664a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7688a)) {
            return false;
        }
        C7688a c7688a = (C7688a) obj;
        return this.f71664a == c7688a.f71664a && this.f71665b.equals(c7688a.f71665b);
    }

    public final int hashCode() {
        return this.f71665b.hashCode() + (Boolean.hashCode(this.f71664a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigsData(isChangedConfigs=");
        sb2.append(this.f71664a);
        sb2.append(", configurations=");
        return Om.a(")", sb2, this.f71665b);
    }
}
