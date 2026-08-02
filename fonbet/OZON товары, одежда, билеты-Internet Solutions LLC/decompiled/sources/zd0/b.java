package zd0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd0.d;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C11110a f108861a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f108862b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final d.a f108863c;

    /* renamed from: d, reason: collision with root package name */
    private final long f108864d;

    /* renamed from: e, reason: collision with root package name */
    private final long f108865e;

    /* renamed from: f, reason: collision with root package name */
    private final long f108866f;

    /* renamed from: g, reason: collision with root package name */
    private final Ld0.c f108867g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C11110a f108868a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final f f108869b;

        /* renamed from: c, reason: collision with root package name */
        private Long f108870c;

        /* renamed from: d, reason: collision with root package name */
        private Long f108871d;

        /* renamed from: e, reason: collision with root package name */
        private Long f108872e;

        /* renamed from: f, reason: collision with root package name */
        private Ld0.c f108873f;

        public a(@NotNull Context context, @NotNull C11110a applicationInfo, @NotNull f networkConfig) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
            Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
            this.f108868a = applicationInfo;
            this.f108869b = networkConfig;
        }

        @NotNull
        public final b a() {
            d.a aVar = new d.a(0);
            Long l11 = this.f108871d;
            long longValue = l11 != null ? l11.longValue() : 20000L;
            Long l12 = this.f108870c;
            long longValue2 = l12 != null ? l12.longValue() : 2000L;
            Long l13 = this.f108872e;
            return new b(this.f108868a, this.f108869b, aVar, longValue2, longValue, l13 != null ? l13.longValue() : 30000L, this.f108873f);
        }

        @NotNull
        public final void b(long j11) {
            this.f108872e = Long.valueOf(j11);
        }

        @NotNull
        public final void c(long j11) {
            this.f108870c = Long.valueOf(j11);
        }

        @NotNull
        public final void d(long j11) {
            this.f108871d = Long.valueOf(j11);
        }

        @NotNull
        public final void e(@NotNull Ld0.c diStore) {
            Intrinsics.checkNotNullParameter(diStore, "diStore");
            this.f108873f = diStore;
        }
    }

    public b(C11110a c11110a, f fVar, d.a aVar, long j11, long j12, long j13, Ld0.c cVar) {
        this.f108861a = c11110a;
        this.f108862b = fVar;
        this.f108863c = aVar;
        this.f108864d = j11;
        this.f108865e = j12;
        this.f108866f = j13;
        this.f108867g = cVar;
    }

    @NotNull
    public final C11110a a() {
        return this.f108861a;
    }

    public final Ld0.c b() {
        return this.f108867g;
    }

    public final long c() {
        return this.f108866f;
    }

    public final long d() {
        return this.f108864d;
    }

    public final long e() {
        return this.f108865e;
    }

    @NotNull
    public final d f() {
        return this.f108863c;
    }

    @NotNull
    public final f g() {
        return this.f108862b;
    }
}
