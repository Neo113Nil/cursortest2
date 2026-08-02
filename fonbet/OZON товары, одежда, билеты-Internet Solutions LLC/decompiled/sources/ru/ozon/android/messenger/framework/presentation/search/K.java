package ru.ozon.android.messenger.framework.presentation.search;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f91597b;

    public K(@NotNull String query, @NotNull String selectedGroup) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(selectedGroup, "selectedGroup");
        this.f91596a = query;
        this.f91597b = selectedGroup;
    }

    @NotNull
    public final String a() {
        return this.f91596a;
    }

    @NotNull
    public final String b() {
        return this.f91597b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k11 = (K) obj;
        return Intrinsics.d(this.f91596a, k11.f91596a) && Intrinsics.d(this.f91597b, k11.f91597b);
    }

    public final int hashCode() {
        return this.f91597b.hashCode() + (this.f91596a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchKey(query=");
        sb2.append(this.f91596a);
        sb2.append(", selectedGroup=");
        return o0.c(sb2, this.f91597b, ")");
    }
}
