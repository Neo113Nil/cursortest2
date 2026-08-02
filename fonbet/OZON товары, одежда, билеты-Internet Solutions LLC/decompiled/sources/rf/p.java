package rf;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private int f83449a;

    /* renamed from: b, reason: collision with root package name */
    private long f83450b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f83451c;

    /* renamed from: d, reason: collision with root package name */
    private long f83452d;

    public p(int i11, long j11, long j12, boolean z11) {
        this.f83449a = i11;
        this.f83450b = j11;
        this.f83451c = z11;
        this.f83452d = j12;
    }

    public final boolean a() {
        return this.f83451c;
    }

    public final long b() {
        return this.f83452d;
    }

    public final long c() {
        return this.f83450b;
    }

    public final int d() {
        return this.f83449a;
    }

    public final boolean e() {
        return this.f83449a == 0 && this.f83450b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f83449a == pVar.f83449a && this.f83450b == pVar.f83450b && this.f83451c == pVar.f83451c && this.f83452d == pVar.f83452d;
    }

    public final int hashCode() {
        return (((((this.f83449a * 31) + ((int) this.f83450b)) * 31) + (!this.f83451c ? 1 : 0)) * 31) + ((int) this.f83452d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f83449a);
        sb2.append('/');
        sb2.append(this.f83450b);
        return sb2.toString();
    }
}
