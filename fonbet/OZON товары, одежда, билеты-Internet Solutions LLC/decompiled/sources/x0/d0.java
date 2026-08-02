package x0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.collection.K<Object> f104732a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.K<Object> f104733b;

    /* renamed from: c, reason: collision with root package name */
    private long f104734c;

    /* renamed from: d, reason: collision with root package name */
    private long f104735d;

    public d0() {
        int i11 = androidx.collection.U.f38655a;
        this.f104732a = new androidx.collection.K<>(6);
        this.f104733b = new androidx.collection.K<>(6);
    }

    public static final long a(d0 d0Var, long j11, long j12) {
        d0Var.getClass();
        if (j12 == 0) {
            return j11;
        }
        long j13 = 4;
        return (j11 / j13) + ((j12 / j13) * 3);
    }

    public final long d() {
        return this.f104734c;
    }

    @NotNull
    public final androidx.collection.K<Object> e() {
        return this.f104732a;
    }

    public final long f() {
        return this.f104735d;
    }

    @NotNull
    public final androidx.collection.K<Object> g() {
        return this.f104733b;
    }
}
