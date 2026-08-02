package x1;

import k1.C7459e;
import org.jetbrains.annotations.NotNull;

/* renamed from: x1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10631f {

    /* renamed from: a, reason: collision with root package name */
    private final long f104870a;

    /* renamed from: b, reason: collision with root package name */
    private final long f104871b;

    /* renamed from: c, reason: collision with root package name */
    private long f104872c;

    public C10631f(long j11, long j12, long j13) {
        this.f104870a = j11;
        this.f104871b = j12;
        this.f104872c = j13;
    }

    public final long a() {
        return this.f104872c;
    }

    public final long b() {
        return this.f104871b;
    }

    public final long c() {
        return this.f104870a;
    }

    @NotNull
    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f104870a + ", position=" + ((Object) C7459e.m(this.f104871b)) + ')';
    }
}
