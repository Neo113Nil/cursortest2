package g5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: g5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6643p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f63864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63865b;

    public C6643p(@NotNull String workSpecId, int i11) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f63864a = workSpecId;
        this.f63865b = i11;
    }

    public final int a() {
        return this.f63865b;
    }

    @NotNull
    public final String b() {
        return this.f63864a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6643p)) {
            return false;
        }
        C6643p c6643p = (C6643p) obj;
        return Intrinsics.d(this.f63864a, c6643p.f63864a) && this.f63865b == c6643p.f63865b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63865b) + (this.f63864a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f63864a);
        sb2.append(", generation=");
        return Ek.a.d(sb2, this.f63865b, ')');
    }
}
