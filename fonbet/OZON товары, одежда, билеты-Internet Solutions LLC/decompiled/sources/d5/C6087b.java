package d5;

import B4.V;
import org.jetbrains.annotations.NotNull;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6087b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f61163a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f61164b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f61165c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f61166d;

    public C6087b(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f61163a = z11;
        this.f61164b = z12;
        this.f61165c = z13;
        this.f61166d = z14;
    }

    public final boolean a() {
        return this.f61163a;
    }

    public final boolean b() {
        return this.f61165c;
    }

    public final boolean c() {
        return this.f61166d;
    }

    public final boolean d() {
        return this.f61164b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6087b)) {
            return false;
        }
        C6087b c6087b = (C6087b) obj;
        return this.f61163a == c6087b.f61163a && this.f61164b == c6087b.f61164b && this.f61165c == c6087b.f61165c && this.f61166d == c6087b.f61166d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z11 = this.f61163a;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = i11 * 31;
        boolean z12 = this.f61164b;
        int i13 = z12;
        if (z12 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z13 = this.f61165c;
        int i15 = z13;
        if (z13 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z14 = this.f61166d;
        return i16 + (z14 ? 1 : z14 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f61163a);
        sb2.append(", isValidated=");
        sb2.append(this.f61164b);
        sb2.append(", isMetered=");
        sb2.append(this.f61165c);
        sb2.append(", isNotRoaming=");
        return V.d(sb2, this.f61166d, ')');
    }
}
