package rf;

import java.math.BigInteger;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import rf.j;
import rf.n;
import sf.C9684j;

/* renamed from: rf.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9263b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final rf.j<Boolean> f83365a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final rf.j<Long> f83366b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final rf.j<BigInteger> f83367c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final rf.j<rf.k> f83368d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final rf.j<C9684j> f83369e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final rf.j<Unit> f83370f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final rf.j<String> f83371g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final rf.j<String> f83372h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final rf.j<String> f83373i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final rf.j<String> f83374j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final rf.j<Long> f83375k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final rf.j<Long> f83376l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final a f83377m;

    /* renamed from: n, reason: collision with root package name */
    private static final List<Pair<kotlin.reflect.d<? extends Object>, rf.n<? extends Object>>> f83378n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f83379o = 0;

    /* renamed from: rf.b$a */
    public static final class a implements rf.n<rf.g> {
        @Override // rf.n
        @NotNull
        public final rf.j a(long j11, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return n.a.a(this, name, j11);
        }

        @Override // rf.n
        public final void b(r writer, rf.g gVar) {
            rf.g value = gVar;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.f("ANY", value.d(), value.c(), new C9262a(writer, value));
        }

        @Override // rf.n
        public final boolean c(@NotNull p header) {
            Intrinsics.checkNotNullParameter(header, "header");
            return true;
        }

        @Override // rf.n
        public final rf.g d(q reader) {
            p pVar;
            long j11;
            boolean z11;
            long j12;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            long i11;
            Intrinsics.checkNotNullParameter(reader, "reader");
            if (reader.l() == null) {
                throw new ProtocolException("expected a value");
            }
            pVar = reader.f83460g;
            Intrinsics.f(pVar);
            reader.f83460g = null;
            j11 = reader.f83456c;
            z11 = reader.f83459f;
            if (pVar.b() != -1) {
                i11 = reader.i();
                j12 = pVar.b() + i11;
            } else {
                j12 = -1;
            }
            if (j11 != -1 && j12 > j11) {
                throw new ProtocolException("enclosed object too large");
            }
            reader.f83456c = j12;
            reader.f83459f = pVar.a();
            arrayList = reader.f83458e;
            arrayList.add("ANY");
            try {
                return new rf.g(pVar.d(), pVar.c(), pVar.a(), pVar.b(), reader.s());
            } finally {
                reader.f83460g = null;
                reader.f83456c = j11;
                reader.f83459f = z11;
                arrayList2 = reader.f83458e;
                arrayList3 = reader.f83458e;
                arrayList2.remove(arrayList3.size() - 1);
            }
        }
    }

    /* renamed from: rf.b$b, reason: collision with other inner class name */
    public static final class C1420b implements j.a<rf.k> {
        @Override // rf.j.a
        public final rf.k a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.n();
        }

        @Override // rf.j.a
        public final void b(r writer, rf.k kVar) {
            rf.k value = kVar;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.h(value);
        }
    }

    /* renamed from: rf.b$c */
    public static final class c implements j.a<Boolean> {
        @Override // rf.j.a
        public final Boolean a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Boolean.valueOf(reader.o());
        }

        @Override // rf.j.a
        public final void b(r writer, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.i(booleanValue);
        }
    }

    /* renamed from: rf.b$d */
    public static final class d implements j.a<Long> {
        @Override // rf.j.a
        public final Long a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String string = reader.t();
            int i11 = C9263b.f83379o;
            Intrinsics.checkNotNullParameter(string, "string");
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            try {
                Date parsed = simpleDateFormat.parse(string);
                Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
                return Long.valueOf(parsed.getTime());
            } catch (ParseException unused) {
                throw new ProtocolException("Failed to parse GeneralizedTime ".concat(string));
            }
        }

        @Override // rf.j.a
        public final void b(r writer, Long l11) {
            long longValue = l11.longValue();
            Intrinsics.checkNotNullParameter(writer, "writer");
            int i11 = C9263b.f83379o;
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            String format = simpleDateFormat.format(Long.valueOf(longValue));
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(date)");
            writer.m(format);
        }
    }

    /* renamed from: rf.b$e */
    public static final class e implements j.a<String> {
        @Override // rf.j.a
        public final String a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.t();
        }

        @Override // rf.j.a
        public final void b(r writer, String str) {
            String value = str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.m(value);
        }
    }

    /* renamed from: rf.b$f */
    public static final class f implements j.a<BigInteger> {
        @Override // rf.j.a
        public final BigInteger a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.m();
        }

        @Override // rf.j.a
        public final void b(r writer, BigInteger bigInteger) {
            BigInteger value = bigInteger;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.g(value);
        }
    }

    /* renamed from: rf.b$g */
    public static final class g implements j.a<Long> {
        @Override // rf.j.a
        public final Long a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return Long.valueOf(reader.p());
        }

        @Override // rf.j.a
        public final void b(r writer, Long l11) {
            long longValue = l11.longValue();
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.j(longValue);
        }
    }

    /* renamed from: rf.b$h */
    public static final class h implements j.a<Unit> {
        @Override // rf.j.a
        public final Unit a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return null;
        }

        @Override // rf.j.a
        public final void b(r writer, Unit unit) {
            Intrinsics.checkNotNullParameter(writer, "writer");
        }
    }

    /* renamed from: rf.b$i */
    public static final class i implements j.a<String> {
        @Override // rf.j.a
        public final String a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.q();
        }

        @Override // rf.j.a
        public final void b(r writer, String str) {
            String value = str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.k(value);
        }
    }

    /* renamed from: rf.b$j */
    public static final class j implements j.a<C9684j> {
        @Override // rf.j.a
        public final C9684j a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.r();
        }

        @Override // rf.j.a
        public final void b(r writer, C9684j c9684j) {
            C9684j value = c9684j;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.l(value);
        }
    }

    /* renamed from: rf.b$k */
    public static final class k implements j.a<String> {
        @Override // rf.j.a
        public final String a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.t();
        }

        @Override // rf.j.a
        public final void b(r writer, String str) {
            String value = str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.m(value);
        }
    }

    /* renamed from: rf.b$l */
    public static final class l implements j.a<Long> {
        @Override // rf.j.a
        public final Long a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            String string = reader.t();
            int i11 = C9263b.f83379o;
            Intrinsics.checkNotNullParameter(string, "string");
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
            try {
                Date parsed = simpleDateFormat.parse(string);
                Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
                return Long.valueOf(parsed.getTime());
            } catch (ParseException unused) {
                throw new ProtocolException("Failed to parse UTCTime ".concat(string));
            }
        }

        @Override // rf.j.a
        public final void b(r writer, Long l11) {
            long longValue = l11.longValue();
            Intrinsics.checkNotNullParameter(writer, "writer");
            int i11 = C9263b.f83379o;
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
            simpleDateFormat.setTimeZone(timeZone);
            simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
            String format = simpleDateFormat.format(Long.valueOf(longValue));
            Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(date)");
            writer.m(format);
        }
    }

    /* renamed from: rf.b$m */
    public static final class m implements j.a<String> {
        @Override // rf.j.a
        public final String a(q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.t();
        }

        @Override // rf.j.a
        public final void b(r writer, String str) {
            String value = str;
            Intrinsics.checkNotNullParameter(writer, "writer");
            Intrinsics.checkNotNullParameter(value, "value");
            writer.m(value);
        }
    }

    /* renamed from: rf.b$n */
    public static final class n implements j.a<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ rf.n[] f83380a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f83381b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC7737t f83382c;

        /* renamed from: rf.b$n$a */
        static final class a extends AbstractC7737t implements Function0<Object> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ q f83384c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar) {
                super(0);
                this.f83384c = qVar;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                n nVar;
                q qVar;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    int size = arrayList.size();
                    nVar = n.this;
                    rf.n[] nVarArr = nVar.f83380a;
                    int length = nVarArr.length;
                    qVar = this.f83384c;
                    if (size >= length) {
                        break;
                    }
                    arrayList.add(nVarArr[arrayList.size()].d(qVar));
                }
                if (qVar.l() == null) {
                    return nVar.f83381b.invoke(arrayList);
                }
                throw new ProtocolException("unexpected " + qVar.l() + " at " + qVar);
            }
        }

        /* renamed from: rf.b$n$b, reason: collision with other inner class name */
        static final class C1421b extends AbstractC7737t implements Function0<Unit> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ List f83386c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ r f83387d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1421b(List list, r rVar) {
                super(0);
                this.f83386c = list;
                this.f83387d = rVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                List list = this.f83386c;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    rf.n nVar = n.this.f83380a[i11];
                    if (nVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                    }
                    nVar.b(this.f83387d, list.get(i11));
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        n(rf.n[] nVarArr, Function1 function1, Function1 function12) {
            this.f83380a = nVarArr;
            this.f83381b = (AbstractC7737t) function1;
            this.f83382c = (AbstractC7737t) function12;
        }

        @Override // rf.j.a
        public final Object a(@NotNull q reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            return reader.w(new a(reader));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
        @Override // rf.j.a
        public final void b(@NotNull r writer, Object obj) {
            Intrinsics.checkNotNullParameter(writer, "writer");
            writer.e(new C1421b((List) this.f83382c.invoke(obj), writer));
        }
    }

    static {
        rf.j<Boolean> jVar = new rf.j<>("BOOLEAN", 0, 1L, new c(), false, null, false);
        f83365a = jVar;
        f83366b = new rf.j<>("INTEGER", 0, 2L, new g(), false, null, false);
        rf.j<BigInteger> jVar2 = new rf.j<>("INTEGER", 0, 2L, new f(), false, null, false);
        f83367c = jVar2;
        rf.j<rf.k> jVar3 = new rf.j<>("BIT STRING", 0, 3L, new C1420b(), false, null, false);
        f83368d = jVar3;
        rf.j<C9684j> jVar4 = new rf.j<>("OCTET STRING", 0, 4L, new j(), false, null, false);
        f83369e = jVar4;
        rf.j<Unit> jVar5 = new rf.j<>("NULL", 0, 5L, new h(), false, null, false);
        f83370f = jVar5;
        rf.j<String> jVar6 = new rf.j<>("OBJECT IDENTIFIER", 0, 6L, new i(), false, null, false);
        f83371g = jVar6;
        rf.j<String> jVar7 = new rf.j<>("UTF8", 0, 12L, new m(), false, null, false);
        f83372h = jVar7;
        rf.j<String> jVar8 = new rf.j<>("PRINTABLE STRING", 0, 19L, new k(), false, null, false);
        f83373i = jVar8;
        rf.j<String> jVar9 = new rf.j<>("IA5 STRING", 0, 22L, new e(), false, null, false);
        f83374j = jVar9;
        rf.j<Long> jVar10 = new rf.j<>("UTC TIME", 0, 23L, new l(), false, null, false);
        f83375k = jVar10;
        rf.j<Long> jVar11 = new rf.j<>("GENERALIZED TIME", 0, 24L, new d(), false, null, false);
        f83376l = jVar11;
        a aVar = new a();
        f83377m = aVar;
        f83378n = C7714v.b0(new Pair(N.b(Boolean.TYPE), jVar), new Pair(N.b(BigInteger.class), jVar2), new Pair(N.b(rf.k.class), jVar3), new Pair(N.b(C9684j.class), jVar4), new Pair(N.b(Unit.class), jVar5), new Pair(N.b(Void.class), jVar6), new Pair(N.b(Void.class), jVar7), new Pair(N.b(String.class), jVar8), new Pair(N.b(Void.class), jVar9), new Pair(N.b(Void.class), jVar10), new Pair(N.b(Long.TYPE), jVar11), new Pair(N.b(rf.g.class), aVar));
    }

    @NotNull
    public static a a() {
        return f83377m;
    }

    @NotNull
    public static rf.j b() {
        return f83368d;
    }

    @NotNull
    public static rf.j c() {
        return f83365a;
    }

    @NotNull
    public static rf.j d() {
        return f83376l;
    }

    @NotNull
    public static rf.j e() {
        return f83374j;
    }

    @NotNull
    public static rf.j f() {
        return f83367c;
    }

    @NotNull
    public static rf.j g() {
        return f83366b;
    }

    @NotNull
    public static rf.j h() {
        return f83370f;
    }

    @NotNull
    public static rf.j i() {
        return f83371g;
    }

    @NotNull
    public static rf.j j() {
        return f83369e;
    }

    @NotNull
    public static rf.j k() {
        return f83373i;
    }

    @NotNull
    public static rf.j l() {
        return f83375k;
    }

    @NotNull
    public static rf.j m() {
        return f83372h;
    }

    @NotNull
    public static rf.j n(@NotNull String name, @NotNull rf.n[] members, @NotNull Function1 decompose, @NotNull Function1 construct) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(members, "members");
        Intrinsics.checkNotNullParameter(decompose, "decompose");
        Intrinsics.checkNotNullParameter(construct, "construct");
        return new rf.j(name, 0, 16L, new n(members, construct, decompose), false, null, false);
    }
}
