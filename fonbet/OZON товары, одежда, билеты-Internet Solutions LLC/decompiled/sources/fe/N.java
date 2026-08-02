package fe;

import Nd.b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.d0;

/* loaded from: classes.dex */
public abstract class N {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pd.c f63167a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Pd.g f63168b;

    /* renamed from: c, reason: collision with root package name */
    private final d0 f63169c;

    public static final class a extends N {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Nd.b f63170d;

        /* renamed from: e, reason: collision with root package name */
        private final a f63171e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final Sd.b f63172f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final b.c f63173g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f63174h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Nd.b classProto, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, d0 d0Var, a aVar) {
            super(nameResolver, typeTable, d0Var);
            Intrinsics.checkNotNullParameter(classProto, "classProto");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f63170d = classProto;
            this.f63171e = aVar;
            this.f63172f = L.a(nameResolver, classProto.u0());
            b.c c11 = Pd.b.f22233f.c(classProto.t0());
            this.f63173g = c11 == null ? b.c.CLASS : c11;
            Boolean d11 = Pd.b.f22234g.d(classProto.t0());
            Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
            this.f63174h = d11.booleanValue();
            Intrinsics.checkNotNullExpressionValue(Pd.b.f22235h.d(classProto.t0()), "get(...)");
        }

        @Override // fe.N
        @NotNull
        public final Sd.c a() {
            return this.f63172f.a();
        }

        @NotNull
        public final Sd.b e() {
            return this.f63172f;
        }

        @NotNull
        public final Nd.b f() {
            return this.f63170d;
        }

        @NotNull
        public final b.c g() {
            return this.f63173g;
        }

        public final a h() {
            return this.f63171e;
        }

        public final boolean i() {
            return this.f63174h;
        }
    }

    public static final class b extends N {

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final Sd.c f63175d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Sd.c fqName, @NotNull Pd.c nameResolver, @NotNull Pd.g typeTable, he.v vVar) {
            super(nameResolver, typeTable, vVar);
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f63175d = fqName;
        }

        @Override // fe.N
        @NotNull
        public final Sd.c a() {
            return this.f63175d;
        }
    }

    public N(Pd.c cVar, Pd.g gVar, d0 d0Var) {
        this.f63167a = cVar;
        this.f63168b = gVar;
        this.f63169c = d0Var;
    }

    @NotNull
    public abstract Sd.c a();

    @NotNull
    public final Pd.c b() {
        return this.f63167a;
    }

    public final d0 c() {
        return this.f63169c;
    }

    @NotNull
    public final Pd.g d() {
        return this.f63168b;
    }

    @NotNull
    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
