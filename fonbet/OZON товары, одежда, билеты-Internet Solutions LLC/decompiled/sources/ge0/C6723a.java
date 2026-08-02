package ge0;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ge0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6723a<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f64292a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<T> f64293b;

    /* JADX WARN: Multi-variable type inference failed */
    public C6723a(@NotNull List<String> itemsToDelete, @NotNull List<? extends T> itemsToAdd) {
        Intrinsics.checkNotNullParameter(itemsToDelete, "itemsToDelete");
        Intrinsics.checkNotNullParameter(itemsToAdd, "itemsToAdd");
        this.f64292a = itemsToDelete;
        this.f64293b = itemsToAdd;
    }

    @NotNull
    public final List<T> a() {
        return this.f64293b;
    }

    @NotNull
    public final List<String> b() {
        return this.f64292a;
    }

    public final boolean c() {
        return this.f64293b.isEmpty() && this.f64292a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6723a)) {
            return false;
        }
        C6723a c6723a = (C6723a) obj;
        return Intrinsics.d(this.f64292a, c6723a.f64292a) && Intrinsics.d(this.f64293b, c6723a.f64293b);
    }

    public final int hashCode() {
        return this.f64293b.hashCode() + (this.f64292a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DiffPair(itemsToDelete=");
        sb2.append(this.f64292a);
        sb2.append(", itemsToAdd=");
        return C2618u.h(sb2, this.f64293b, ")");
    }
}
