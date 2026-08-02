package ru.ozon.android.messenger.framework.domain.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q> f88798a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f88799b;

    public a(@NotNull List<q> items, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f88798a = items;
        this.f88799b = z11;
    }

    @NotNull
    public static a a(@NotNull List items, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new a(items, z11);
    }

    @NotNull
    public final List<q> b() {
        return this.f88798a;
    }

    public final boolean c() {
        return this.f88799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f88798a, aVar.f88798a) && this.f88799b == aVar.f88799b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88799b) + (this.f88798a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "BlocksContainer(items=" + this.f88798a + ", isRemoteData=" + this.f88799b + ")";
    }
}
