package ru.ozon.android.messenger.framework.presentation.models.responses;

import Kk.C3532b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<q> f91512a;

    /* renamed from: b, reason: collision with root package name */
    private final q f91513b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f91514c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f91515d;

    public k(@NotNull List<q> items, q qVar, boolean z11, @NotNull String nextPageCursor) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextPageCursor, "nextPageCursor");
        this.f91512a = items;
        this.f91513b = qVar;
        this.f91514c = z11;
        this.f91515d = nextPageCursor;
    }

    public final boolean a() {
        return this.f91514c;
    }

    @NotNull
    public final List<q> b() {
        return this.f91512a;
    }

    @NotNull
    public final String c() {
        return this.f91515d;
    }

    public final q d() {
        return this.f91513b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f91512a, kVar.f91512a) && Intrinsics.d(this.f91513b, kVar.f91513b) && this.f91514c == kVar.f91514c && Intrinsics.d(this.f91515d, kVar.f91515d);
    }

    public final int hashCode() {
        int hashCode = this.f91512a.hashCode() * 31;
        q qVar = this.f91513b;
        return this.f91515d.hashCode() + C3532b.a((hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31, 31, this.f91514c);
    }

    @NotNull
    public final String toString() {
        return "SearchResponseVO(items=" + this.f91512a + ", noUiItem=" + this.f91513b + ", hasItemsAfter=" + this.f91514c + ", nextPageCursor=" + this.f91515d + ")";
    }
}
