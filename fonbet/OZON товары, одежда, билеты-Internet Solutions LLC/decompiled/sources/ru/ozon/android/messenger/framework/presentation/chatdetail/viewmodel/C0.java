package ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f89970a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f89971b;

    public C0(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> items, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f89970a = items;
        this.f89971b = z11;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> a() {
        return this.f89970a;
    }

    public final boolean b() {
        return this.f89971b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        return Intrinsics.d(this.f89970a, c02.f89970a) && this.f89971b == c02.f89971b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f89971b) + (this.f89970a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "WidgetsContainer(items=" + this.f89970a + ", isRemoteData=" + this.f89971b + ")";
    }
}
