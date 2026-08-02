package m0;

import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class e1<V extends AbstractC8015t> implements a1<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final l0.l0 f73701a;

    /* renamed from: b, reason: collision with root package name */
    private V f73702b;

    /* renamed from: c, reason: collision with root package name */
    private V f73703c;

    /* renamed from: d, reason: collision with root package name */
    private V f73704d;

    /* renamed from: e, reason: collision with root package name */
    private final float f73705e = 0.0f;

    public e1(@NotNull l0.l0 l0Var) {
        this.f73701a = l0Var;
    }

    @Override // m0.a1
    public final float a() {
        return this.f73705e;
    }

    @Override // m0.a1
    @NotNull
    public final V b(long j11, @NotNull V v11, @NotNull V v12) {
        if (this.f73702b == null) {
            this.f73702b = (V) v11.c();
        }
        V v13 = this.f73702b;
        if (v13 == null) {
            Intrinsics.n("valueVector");
            throw null;
        }
        int b11 = v13.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v14 = this.f73702b;
            if (v14 == null) {
                Intrinsics.n("valueVector");
                throw null;
            }
            v14.e(this.f73701a.c(v11.a(i11), v12.a(i11), j11), i11);
        }
        V v15 = this.f73702b;
        if (v15 != null) {
            return v15;
        }
        Intrinsics.n("valueVector");
        throw null;
    }

    @Override // m0.a1
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12) {
        if (this.f73703c == null) {
            this.f73703c = (V) v11.c();
        }
        V v13 = this.f73703c;
        if (v13 == null) {
            Intrinsics.n("velocityVector");
            throw null;
        }
        int b11 = v13.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v14 = this.f73703c;
            if (v14 == null) {
                Intrinsics.n("velocityVector");
                throw null;
            }
            v11.getClass();
            v14.e(this.f73701a.d(v12.a(i11), j11), i11);
        }
        V v15 = this.f73703c;
        if (v15 != null) {
            return v15;
        }
        Intrinsics.n("velocityVector");
        throw null;
    }

    public final long d(@NotNull V v11, @NotNull V v12) {
        if (this.f73703c == null) {
            this.f73703c = (V) v11.c();
        }
        V v13 = this.f73703c;
        if (v13 == null) {
            Intrinsics.n("velocityVector");
            throw null;
        }
        int b11 = v13.b();
        long j11 = 0;
        for (int i11 = 0; i11 < b11; i11++) {
            v11.getClass();
            j11 = Math.max(j11, this.f73701a.a(v12.a(i11)));
        }
        return j11;
    }

    @NotNull
    public final V e(@NotNull V v11, @NotNull V v12) {
        if (this.f73704d == null) {
            this.f73704d = (V) v11.c();
        }
        V v13 = this.f73704d;
        if (v13 == null) {
            Intrinsics.n("targetVector");
            throw null;
        }
        int b11 = v13.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v14 = this.f73704d;
            if (v14 == null) {
                Intrinsics.n("targetVector");
                throw null;
            }
            v14.e(this.f73701a.b(v11.a(i11), v12.a(i11)), i11);
        }
        V v15 = this.f73704d;
        if (v15 != null) {
            return v15;
        }
        Intrinsics.n("targetVector");
        throw null;
    }
}
