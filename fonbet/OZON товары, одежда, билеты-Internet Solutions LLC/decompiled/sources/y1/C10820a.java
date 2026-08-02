package y1;

import F3.G;
import org.jetbrains.annotations.NotNull;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10820a {

    /* renamed from: a, reason: collision with root package name */
    private long f105898a;

    /* renamed from: b, reason: collision with root package name */
    private float f105899b;

    public C10820a(float f7, long j11) {
        this.f105898a = j11;
        this.f105899b = f7;
    }

    public final float a() {
        return this.f105899b;
    }

    public final long b() {
        return this.f105898a;
    }

    public final void c(float f7) {
        this.f105899b = f7;
    }

    public final void d(long j11) {
        this.f105898a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10820a)) {
            return false;
        }
        C10820a c10820a = (C10820a) obj;
        return this.f105898a == c10820a.f105898a && Float.compare(this.f105899b, c10820a.f105899b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f105899b) + (Long.hashCode(this.f105898a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataPointAtTime(time=");
        sb2.append(this.f105898a);
        sb2.append(", dataPoint=");
        return G.a(sb2, this.f105899b, ')');
    }
}
