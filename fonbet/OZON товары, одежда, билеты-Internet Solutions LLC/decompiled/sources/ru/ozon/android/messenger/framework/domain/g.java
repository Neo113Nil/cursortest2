package ru.ozon.android.messenger.framework.domain;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q> f88794a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<q> f88795b;

    public g(@NotNull List<q> pinned, @NotNull List<q> noUiItems) {
        Intrinsics.checkNotNullParameter(pinned, "pinned");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        this.f88794a = pinned;
        this.f88795b = noUiItems;
    }

    @NotNull
    public final List<q> a() {
        return this.f88795b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f88794a, gVar.f88794a) && Intrinsics.d(this.f88795b, gVar.f88795b);
    }

    public final int hashCode() {
        return this.f88795b.hashCode() + (this.f88794a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NoUiContainer(pinned=");
        sb2.append(this.f88794a);
        sb2.append(", noUiItems=");
        return C2618u.h(sb2, this.f88795b, ")");
    }
}
