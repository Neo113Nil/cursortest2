package m0;

import kd.C7665d;
import kotlin.jvm.internal.Intrinsics;
import m0.AbstractC8015t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d1<V extends AbstractC8015t> implements c1<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8019v f73694a;

    /* renamed from: b, reason: collision with root package name */
    private V f73695b;

    /* renamed from: c, reason: collision with root package name */
    private V f73696c;

    /* renamed from: d, reason: collision with root package name */
    private V f73697d;

    public static final class a implements InterfaceC8019v {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ I f73698a;

        a(I i11) {
            this.f73698a = i11;
        }

        @Override // m0.InterfaceC8019v
        @NotNull
        public final I get(int i11) {
            return this.f73698a;
        }
    }

    public d1(@NotNull InterfaceC8019v interfaceC8019v) {
        this.f73694a = interfaceC8019v;
    }

    @Override // m0.X0
    public final long b(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        C7665d it = kotlin.ranges.h.o(0, v11.b()).iterator();
        long j11 = 0;
        while (it.hasNext()) {
            int b11 = it.b();
            j11 = Math.max(j11, this.f73694a.get(b11).b(v11.a(b11), v12.a(b11), v13.a(b11)));
        }
        return j11;
    }

    @Override // m0.X0
    @NotNull
    public final V c(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        if (this.f73695b == null) {
            this.f73695b = (V) v11.c();
        }
        V v14 = this.f73695b;
        if (v14 == null) {
            Intrinsics.n("valueVector");
            throw null;
        }
        int b11 = v14.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v15 = this.f73695b;
            if (v15 == null) {
                Intrinsics.n("valueVector");
                throw null;
            }
            v15.e(this.f73694a.get(i11).c(v11.a(i11), v12.a(i11), v13.a(i11), j11), i11);
        }
        V v16 = this.f73695b;
        if (v16 != null) {
            return v16;
        }
        Intrinsics.n("valueVector");
        throw null;
    }

    @Override // m0.X0
    @NotNull
    public final V d(long j11, @NotNull V v11, @NotNull V v12, @NotNull V v13) {
        if (this.f73696c == null) {
            this.f73696c = (V) v13.c();
        }
        V v14 = this.f73696c;
        if (v14 == null) {
            Intrinsics.n("velocityVector");
            throw null;
        }
        int b11 = v14.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v15 = this.f73696c;
            if (v15 == null) {
                Intrinsics.n("velocityVector");
                throw null;
            }
            v15.e(this.f73694a.get(i11).d(v11.a(i11), v12.a(i11), v13.a(i11), j11), i11);
        }
        V v16 = this.f73696c;
        if (v16 != null) {
            return v16;
        }
        Intrinsics.n("velocityVector");
        throw null;
    }

    @Override // m0.X0
    @NotNull
    public final V e(@NotNull V v11, @NotNull V v12, @NotNull V v13) {
        if (this.f73697d == null) {
            this.f73697d = (V) v13.c();
        }
        V v14 = this.f73697d;
        if (v14 == null) {
            Intrinsics.n("endVelocityVector");
            throw null;
        }
        int b11 = v14.b();
        for (int i11 = 0; i11 < b11; i11++) {
            V v15 = this.f73697d;
            if (v15 == null) {
                Intrinsics.n("endVelocityVector");
                throw null;
            }
            v15.e(this.f73694a.get(i11).e(v11.a(i11), v12.a(i11), v13.a(i11)), i11);
        }
        V v16 = this.f73697d;
        if (v16 != null) {
            return v16;
        }
        Intrinsics.n("endVelocityVector");
        throw null;
    }

    public d1(@NotNull I i11) {
        this(new a(i11));
    }
}
