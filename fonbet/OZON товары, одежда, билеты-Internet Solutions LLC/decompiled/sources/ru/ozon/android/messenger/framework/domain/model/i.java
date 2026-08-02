package ru.ozon.android.messenger.framework.domain.model;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q> f88848a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<q> f88849b;

    public i(@NotNull List<q> pinnedItems, @NotNull List<q> items) {
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f88848a = pinnedItems;
        this.f88849b = items;
    }

    public static i a(i iVar, List items) {
        List<q> pinnedItems = iVar.f88848a;
        Intrinsics.checkNotNullParameter(pinnedItems, "pinnedItems");
        Intrinsics.checkNotNullParameter(items, "items");
        return new i(pinnedItems, items);
    }

    @NotNull
    public final List<q> b() {
        return this.f88849b;
    }

    @NotNull
    public final List<q> c() {
        return this.f88848a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f88848a, iVar.f88848a) && Intrinsics.d(this.f88849b, iVar.f88849b);
    }

    public final int hashCode() {
        return this.f88849b.hashCode() + (this.f88848a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SupplementaryContainer(pinnedItems=");
        sb2.append(this.f88848a);
        sb2.append(", items=");
        return C2618u.h(sb2, this.f88849b, ")");
    }
}
