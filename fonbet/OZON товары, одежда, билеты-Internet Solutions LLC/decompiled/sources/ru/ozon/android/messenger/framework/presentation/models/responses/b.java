package ru.ozon.android.messenger.framework.presentation.models.responses;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f91460a;

    /* renamed from: b, reason: collision with root package name */
    private final String f91461b;

    public b(@NotNull String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f91460a = title;
        this.f91461b = str;
    }

    public final String a() {
        return this.f91461b;
    }

    @NotNull
    public final String b() {
        return this.f91460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f91460a, bVar.f91460a) && Intrinsics.d(this.f91461b, bVar.f91461b);
    }

    public final int hashCode() {
        int hashCode = this.f91460a.hashCode() * 31;
        String str = this.f91461b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuItemActionResponseVO(title=");
        sb2.append(this.f91460a);
        sb2.append(", subtitle=");
        return o0.c(sb2, this.f91461b, ")");
    }
}
