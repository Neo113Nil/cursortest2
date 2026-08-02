package rf;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import rf.n;
import sf.C9684j;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final rf.j<rf.i> f83417a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final rf.j<String> f83418b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final rf.j<C9684j> f83419c;

    /* renamed from: d, reason: collision with root package name */
    private static final rf.j<List<Pair<rf.n<?>, Object>>> f83420d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final rf.j<List<List<rf.h>>> f83421e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final rf.j<rf.u> f83422f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final rf.j<v> f83423g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final rf.j<rf.l> f83424h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f83425i = 0;

    static final class a extends AbstractC7737t implements Function1<rf.f, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f83426b = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.f fVar) {
            rf.f it = fVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(it.a(), it.b());
        }
    }

    static final class b extends AbstractC7737t implements Function1<List<?>, rf.f> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f83427b = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.f invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj != null) {
                return new rf.f((String) obj, it.get(1));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    static final class c extends AbstractC7737t implements Function1<Object, rf.n<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f83428b = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.n<?> invoke(Object obj) {
            if (Intrinsics.d(obj, "1.2.840.113549.1.1.11")) {
                int i11 = C9263b.f83379o;
                return C9263b.h();
            }
            if (Intrinsics.d(obj, "1.2.840.113549.1.1.1")) {
                int i12 = C9263b.f83379o;
                return C9263b.h();
            }
            if (!Intrinsics.d(obj, "1.2.840.10045.2.1")) {
                return null;
            }
            int i13 = C9263b.f83379o;
            return C9263b.i();
        }
    }

    static final class d extends AbstractC7737t implements Function1<rf.h, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final d f83429b = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.h hVar) {
            rf.h it = hVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(it.a(), it.b());
        }
    }

    static final class e extends AbstractC7737t implements Function1<List<?>, rf.h> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f83430b = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.h invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj != null) {
                return new rf.h((String) obj, it.get(1));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    static final class f extends AbstractC7737t implements Function1<rf.i, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f83431b = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.i iVar) {
            rf.i it = iVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(Boolean.valueOf(it.a()), it.b());
        }
    }

    static final class g extends AbstractC7737t implements Function1<List<?>, rf.i> {

        /* renamed from: b, reason: collision with root package name */
        public static final g f83432b = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.i invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj != null) {
                return new rf.i(((Boolean) obj).booleanValue(), (Long) it.get(1));
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }

    static final class h extends AbstractC7737t implements Function1<rf.l, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final h f83433b = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.l lVar) {
            rf.l it = lVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(it.c(), it.a(), it.b());
        }
    }

    static final class i extends AbstractC7737t implements Function1<List<?>, rf.l> {

        /* renamed from: b, reason: collision with root package name */
        public static final i f83434b = new i(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.l invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.TbsCertificate");
            }
            v vVar = (v) obj;
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            rf.f fVar = (rf.f) obj2;
            Object obj3 = it.get(2);
            if (obj3 != null) {
                return new rf.l(vVar, fVar, (rf.k) obj3);
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
        }
    }

    static final class j extends AbstractC7737t implements Function1<rf.s, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final j f83435b = new j(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.s sVar) {
            rf.s it = sVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(it.b(), Boolean.valueOf(it.a()), it.c());
        }
    }

    static final class k extends AbstractC7737t implements Function1<List<?>, rf.s> {

        /* renamed from: b, reason: collision with root package name */
        public static final k f83436b = new k(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.s invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            String str = (String) obj;
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
            return new rf.s(it.get(2), str, ((Boolean) obj2).booleanValue());
        }
    }

    static final class l extends AbstractC7737t implements Function1<Object, rf.n<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final l f83437b = new l(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.n<?> invoke(Object obj) {
            if (Intrinsics.d(obj, "2.5.29.17")) {
                return m.f83420d;
            }
            if (Intrinsics.d(obj, "2.5.29.19")) {
                return m.f83417a;
            }
            return null;
        }
    }

    /* renamed from: rf.m$m, reason: collision with other inner class name */
    static final class C1422m extends AbstractC7737t implements Function1<rf.t, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final C1422m f83438b = new C1422m(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.t tVar) {
            rf.t it = tVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(Long.valueOf(it.c()), it.a(), it.b());
        }
    }

    static final class n extends AbstractC7737t implements Function1<List<?>, rf.t> {

        /* renamed from: b, reason: collision with root package name */
        public static final n f83439b = new n(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.t invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long longValue = ((Long) obj).longValue();
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            rf.f fVar = (rf.f) obj2;
            Object obj3 = it.get(2);
            if (obj3 != null) {
                return new rf.t(longValue, fVar, (C9684j) obj3);
            }
            throw new NullPointerException("null cannot be cast to non-null type okio.ByteString");
        }
    }

    static final class o extends AbstractC7737t implements Function1<rf.u, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final o f83440b = new o(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(rf.u uVar) {
            rf.u it = uVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(it.a(), it.b());
        }
    }

    static final class p extends AbstractC7737t implements Function1<List<?>, rf.u> {

        /* renamed from: b, reason: collision with root package name */
        public static final p f83441b = new p(1);

        @Override // kotlin.jvm.functions.Function1
        public final rf.u invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            rf.f fVar = (rf.f) obj;
            Object obj2 = it.get(1);
            if (obj2 != null) {
                return new rf.u(fVar, (rf.k) obj2);
            }
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.BitString");
        }
    }

    static final class q extends AbstractC7737t implements Function1<v, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final q f83442b = new q(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(v vVar) {
            v it = vVar;
            Intrinsics.checkNotNullParameter(it, "it");
            Long valueOf = Long.valueOf(it.k());
            BigInteger d11 = it.d();
            rf.f e11 = it.e();
            int i11 = m.f83425i;
            return C7714v.b0(valueOf, d11, e11, new Pair(m.f(), it.b()), it.j(), new Pair(m.f(), it.g()), it.h(), it.c(), it.i(), it.a());
        }
    }

    static final class r extends AbstractC7737t implements Function1<List<?>, v> {

        /* renamed from: b, reason: collision with root package name */
        public static final r f83443b = new r(1);

        @Override // kotlin.jvm.functions.Function1
        public final v invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long longValue = ((Long) obj).longValue();
            Object obj2 = it.get(1);
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.math.BigInteger");
            }
            BigInteger bigInteger = (BigInteger) obj2;
            Object obj3 = it.get(2);
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.AlgorithmIdentifier");
            }
            rf.f fVar = (rf.f) obj3;
            Object obj4 = it.get(3);
            if (obj4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
            }
            Object f7 = ((Pair) obj4).f();
            if (f7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
            }
            List list2 = (List) f7;
            Object obj5 = it.get(4);
            if (obj5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.Validity");
            }
            w wVar = (w) obj5;
            Object obj6 = it.get(5);
            if (obj6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Pair<*, *>");
            }
            Object f11 = ((Pair) obj6).f();
            if (f11 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<okhttp3.tls.internal.der.AttributeTypeAndValue>>");
            }
            List list3 = (List) f11;
            Object obj7 = it.get(6);
            if (obj7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.SubjectPublicKeyInfo");
            }
            rf.u uVar = (rf.u) obj7;
            rf.k kVar = (rf.k) it.get(7);
            rf.k kVar2 = (rf.k) it.get(8);
            Object obj8 = it.get(9);
            if (obj8 != null) {
                return new v(longValue, bigInteger, fVar, list2, wVar, list3, uVar, kVar, kVar2, (List) obj8);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<okhttp3.tls.internal.der.Extension>");
        }
    }

    public static final class s implements rf.n<Long> {
        @Override // rf.n
        @NotNull
        public final rf.j a(long j11, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return n.a.a(this, name, j11);
        }

        @Override // rf.n
        public final void b(rf.r writer, Long l11) {
            long longValue = l11.longValue();
            Intrinsics.checkNotNullParameter(writer, "writer");
            if (-631152000000L <= longValue && 2524608000000L > longValue) {
                int i11 = C9263b.f83379o;
                C9263b.l().b(writer, Long.valueOf(longValue));
            } else {
                int i12 = C9263b.f83379o;
                C9263b.d().b(writer, Long.valueOf(longValue));
            }
        }

        @Override // rf.n
        public final boolean c(@NotNull rf.p header) {
            Intrinsics.checkNotNullParameter(header, "header");
            int i11 = C9263b.f83379o;
            return C9263b.l().c(header) || C9263b.d().c(header);
        }

        @Override // rf.n
        public final Long d(rf.q reader) {
            long longValue;
            Intrinsics.checkNotNullParameter(reader, "reader");
            rf.p l11 = reader.l();
            if (l11 == null) {
                throw new ProtocolException("expected time but was exhausted at " + reader);
            }
            int d11 = l11.d();
            int i11 = C9263b.f83379o;
            if (d11 == C9263b.l().h() && l11.c() == C9263b.l().g()) {
                longValue = ((Number) C9263b.l().d(reader)).longValue();
            } else {
                if (l11.d() != C9263b.d().h() || l11.c() != C9263b.d().g()) {
                    throw new ProtocolException("expected time but was " + l11 + " at " + reader);
                }
                longValue = ((Number) C9263b.d().d(reader)).longValue();
            }
            return Long.valueOf(longValue);
        }
    }

    static final class t extends AbstractC7737t implements Function1<w, List<?>> {

        /* renamed from: b, reason: collision with root package name */
        public static final t f83444b = new t(1);

        @Override // kotlin.jvm.functions.Function1
        public final List<?> invoke(w wVar) {
            w it = wVar;
            Intrinsics.checkNotNullParameter(it, "it");
            return C7714v.b0(Long.valueOf(it.b()), Long.valueOf(it.a()));
        }
    }

    static final class u extends AbstractC7737t implements Function1<List<?>, w> {

        /* renamed from: b, reason: collision with root package name */
        public static final u f83445b = new u(1);

        @Override // kotlin.jvm.functions.Function1
        public final w invoke(List<?> list) {
            List<?> it = list;
            Intrinsics.checkNotNullParameter(it, "it");
            Object obj = it.get(0);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            long longValue = ((Long) obj).longValue();
            Object obj2 = it.get(1);
            if (obj2 != null) {
                return new w(longValue, ((Long) obj2).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
    }

    static {
        rf.j<List<Pair<rf.n<?>, Object>>> a11;
        rf.j<List<List<rf.h>>> a12;
        rf.j a13;
        s sVar = new s();
        int i11 = C9263b.f83379o;
        rf.j n11 = C9263b.n("Validity", new rf.n[]{sVar, sVar}, t.f83444b, u.f83445b);
        c chooser = c.f83428b;
        Intrinsics.checkNotNullParameter(chooser, "chooser");
        C9266e c9266e = new C9266e(chooser);
        rf.j i12 = C9263b.i();
        i12.getClass();
        rf.j n12 = C9263b.n("AlgorithmIdentifier", new rf.n[]{rf.j.f(i12, 0L, null, 63), c9266e}, a.f83426b, b.f83427b);
        rf.j c11 = C9263b.c();
        Boolean bool = Boolean.FALSE;
        f83417a = C9263b.n("BasicConstraints", new rf.n[]{c11.i(bool), C9263b.g().i(null)}, f.f83431b, g.f83432b);
        rf.j<String> j11 = rf.j.j(C9263b.e(), 2L);
        f83418b = j11;
        rf.j<C9684j> j12 = rf.j.j(C9263b.j(), 7L);
        f83419c = j12;
        rf.n[] choices = {j11, j12, C9263b.a()};
        Intrinsics.checkNotNullParameter(choices, "choices");
        a11 = new C9265d(choices).a(16L, "SEQUENCE OF");
        f83420d = a11;
        l chooser2 = l.f83437b;
        Intrinsics.checkNotNullParameter(chooser2, "chooser");
        rf.j c12 = n.a.c(new C9266e(chooser2), C9263b.j().h(), C9263b.j().g(), bool);
        rf.j i13 = C9263b.i();
        i13.getClass();
        rf.j n13 = C9263b.n("Extension", new rf.n[]{rf.j.f(i13, 0L, null, 63), C9263b.c().i(bool), c12}, j.f83435b, k.f83436b);
        rf.j i14 = C9263b.i();
        Pair[] choices2 = {new Pair(N.b(String.class), C9263b.m()), new Pair(N.b(Void.class), C9263b.k()), new Pair(N.b(rf.g.class), C9263b.a())};
        Intrinsics.checkNotNullParameter(choices2, "choices");
        rf.j n14 = C9263b.n("AttributeTypeAndValue", new rf.n[]{i14, new C9264c(choices2)}, d.f83429b, e.f83430b);
        Intrinsics.checkNotNullParameter("SET OF", AppMeasurementSdk.ConditionalUserProperty.NAME);
        a12 = n.a.a(n14, "SET OF", 17L).a(16L, "SEQUENCE OF");
        f83421e = a12;
        rf.n[] choices3 = {a12};
        Intrinsics.checkNotNullParameter(choices3, "choices");
        C9265d c9265d = new C9265d(choices3);
        rf.j<rf.u> n15 = C9263b.n("SubjectPublicKeyInfo", new rf.n[]{n12, C9263b.b()}, o.f83440b, p.f83441b);
        f83422f = n15;
        rf.j g10 = C9263b.g();
        g10.getClass();
        rf.j i15 = n.a.c(g10, UserVerificationMethods.USER_VERIFY_PATTERN, 0L, null).i(0L);
        rf.j f7 = C9263b.f();
        rf.j i16 = rf.j.j(C9263b.b(), 1L).i(null);
        rf.j i17 = rf.j.j(C9263b.b(), 2L).i(null);
        a13 = n13.a(16L, "SEQUENCE OF");
        rf.j<v> n16 = C9263b.n("TBSCertificate", new rf.n[]{i15, f7, n12, c9265d, n11, c9265d, n15, i16, i17, n.a.c(a13, UserVerificationMethods.USER_VERIFY_PATTERN, 3L, null).i(K.f71697a)}, q.f83442b, r.f83443b);
        f83423g = n16;
        f83424h = C9263b.n("Certificate", new rf.n[]{n16, n12, C9263b.b()}, h.f83433b, i.f83434b);
        C9263b.n("PrivateKeyInfo", new rf.n[]{C9263b.g(), n12, C9263b.j()}, C1422m.f83438b, n.f83439b);
    }

    @NotNull
    public static rf.j c() {
        return f83424h;
    }

    @NotNull
    public static rf.j d() {
        return f83418b;
    }

    @NotNull
    public static rf.j e() {
        return f83419c;
    }

    @NotNull
    public static rf.j f() {
        return f83421e;
    }

    @NotNull
    public static rf.j g() {
        return f83422f;
    }

    @NotNull
    public static rf.j h() {
        return f83423g;
    }
}
