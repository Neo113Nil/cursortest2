package ru.ozon.android.messenger.framework.presentation.search;

import C.o0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9525e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91719a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f91720b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<J> f91721c;

    /* renamed from: d, reason: collision with root package name */
    private final String f91722d;

    public C9525e() {
        this(null, 15);
    }

    public static C9525e a(C9525e c9525e, String searchQuery, List noUiItems, List searchItems, String str, int i11) {
        if ((i11 & 1) != 0) {
            searchQuery = c9525e.f91719a;
        }
        if ((i11 & 2) != 0) {
            noUiItems = c9525e.f91720b;
        }
        if ((i11 & 4) != 0) {
            searchItems = c9525e.f91721c;
        }
        if ((i11 & 8) != 0) {
            str = c9525e.f91722d;
        }
        c9525e.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(searchItems, "searchItems");
        return new C9525e(searchQuery, noUiItems, searchItems, str);
    }

    public final String b() {
        return this.f91722d;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> c() {
        return this.f91720b;
    }

    @NotNull
    public final List<J> d() {
        return this.f91721c;
    }

    @NotNull
    public final String e() {
        return this.f91719a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9525e)) {
            return false;
        }
        C9525e c9525e = (C9525e) obj;
        return Intrinsics.d(this.f91719a, c9525e.f91719a) && Intrinsics.d(this.f91720b, c9525e.f91720b) && Intrinsics.d(this.f91721c, c9525e.f91721c) && Intrinsics.d(this.f91722d, c9525e.f91722d);
    }

    public final int hashCode() {
        int b11 = G.g.b(G.g.b(this.f91719a.hashCode() * 31, 31, this.f91720b), 31, this.f91721c);
        String str = this.f91722d;
        return b11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChatSearchState(searchQuery=");
        sb2.append(this.f91719a);
        sb2.append(", noUiItems=");
        sb2.append(this.f91720b);
        sb2.append(", searchItems=");
        sb2.append(this.f91721c);
        sb2.append(", cursor=");
        return o0.c(sb2, this.f91722d, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9525e(@NotNull String searchQuery, @NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> noUiItems, @NotNull List<? extends J> searchItems, String str) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(searchItems, "searchItems");
        this.f91719a = searchQuery;
        this.f91720b = noUiItems;
        this.f91721c = searchItems;
        this.f91722d = str;
    }

    public C9525e(List list, int i11) {
        this("", (i11 & 2) != 0 ? kotlin.collections.K.f71697a : list, kotlin.collections.K.f71697a, null);
    }
}
