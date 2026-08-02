package g5;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6637j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f63857a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63859c;

    public C6637j(@NotNull String workSpecId, int i11, int i12) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f63857a = workSpecId;
        this.f63858b = i11;
        this.f63859c = i12;
    }

    public final int a() {
        return this.f63858b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6637j)) {
            return false;
        }
        C6637j c6637j = (C6637j) obj;
        return Intrinsics.d(this.f63857a, c6637j.f63857a) && this.f63858b == c6637j.f63858b && this.f63859c == c6637j.f63859c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63859c) + C2454a.a(this.f63858b, this.f63857a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f63857a);
        sb2.append(", generation=");
        sb2.append(this.f63858b);
        sb2.append(", systemId=");
        return Ek.a.d(sb2, this.f63859c, ')');
    }
}
