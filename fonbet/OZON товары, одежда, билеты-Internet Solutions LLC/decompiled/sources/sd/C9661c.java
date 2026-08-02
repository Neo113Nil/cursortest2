package sd;

import Sd.b;
import ae.EnumC5003e;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qd.s;
import rd.AbstractC9252f;

/* renamed from: sd.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9661c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f98561a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f98562b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f98563c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f98564d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final Sd.b f98565e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final Sd.c f98566f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Sd.b f98567g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.d, Sd.b> f98568h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.d, Sd.b> f98569i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.d, Sd.c> f98570j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.d, Sd.c> f98571k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.b, Sd.b> f98572l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.b, Sd.b> f98573m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private static final List<a> f98574n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f98575o = 0;

    /* renamed from: sd.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Sd.b f98576a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final Sd.b f98577b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Sd.b f98578c;

        public a(@NotNull Sd.b javaClass, @NotNull Sd.b kotlinReadOnly, @NotNull Sd.b kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.f98576a = javaClass;
            this.f98577b = kotlinReadOnly;
            this.f98578c = kotlinMutable;
        }

        @NotNull
        public final Sd.b a() {
            return this.f98576a;
        }

        @NotNull
        public final Sd.b b() {
            return this.f98577b;
        }

        @NotNull
        public final Sd.b c() {
            return this.f98578c;
        }

        @NotNull
        public final Sd.b d() {
            return this.f98576a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.d(this.f98576a, aVar.f98576a) && Intrinsics.d(this.f98577b, aVar.f98577b) && Intrinsics.d(this.f98578c, aVar.f98578c);
        }

        public final int hashCode() {
            return this.f98578c.hashCode() + ((this.f98577b.hashCode() + (this.f98576a.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f98576a + ", kotlinReadOnly=" + this.f98577b + ", kotlinMutable=" + this.f98578c + ')';
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        AbstractC9252f.a aVar = AbstractC9252f.a.f83305c;
        sb2.append(aVar.b());
        sb2.append('.');
        sb2.append(aVar.a());
        f98561a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        AbstractC9252f.b bVar = AbstractC9252f.b.f83306c;
        sb3.append(bVar.b());
        sb3.append('.');
        sb3.append(bVar.a());
        f98562b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        AbstractC9252f.d dVar = AbstractC9252f.d.f83308c;
        sb4.append(dVar.b());
        sb4.append('.');
        sb4.append(dVar.a());
        f98563c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        AbstractC9252f.c cVar = AbstractC9252f.c.f83307c;
        sb5.append(cVar.b());
        sb5.append('.');
        sb5.append(cVar.a());
        f98564d = sb5.toString();
        Sd.b b11 = b.a.b(new Sd.c("kotlin.jvm.functions.FunctionN"));
        f98565e = b11;
        f98566f = b11.a();
        f98567g = Sd.i.h();
        d(Class.class);
        f98568h = new HashMap<>();
        f98569i = new HashMap<>();
        f98570j = new HashMap<>();
        f98571k = new HashMap<>();
        f98572l = new HashMap<>();
        f98573m = new HashMap<>();
        Sd.b b12 = b.a.b(s.a.f81872B);
        a aVar2 = new a(d(Iterable.class), b12, new Sd.b(b12.f(), Sd.e.b(s.a.f81880J, b12.f()), false));
        Sd.b b13 = b.a.b(s.a.f81871A);
        a aVar3 = new a(d(Iterator.class), b13, new Sd.b(b13.f(), Sd.e.b(s.a.f81879I, b13.f()), false));
        Sd.b b14 = b.a.b(s.a.f81873C);
        a aVar4 = new a(d(Collection.class), b14, new Sd.b(b14.f(), Sd.e.b(s.a.f81881K, b14.f()), false));
        Sd.b b15 = b.a.b(s.a.f81874D);
        a aVar5 = new a(d(List.class), b15, new Sd.b(b15.f(), Sd.e.b(s.a.f81882L, b15.f()), false));
        Sd.b b16 = b.a.b(s.a.f81876F);
        a aVar6 = new a(d(Set.class), b16, new Sd.b(b16.f(), Sd.e.b(s.a.f81884N, b16.f()), false));
        Sd.b b17 = b.a.b(s.a.f81875E);
        a aVar7 = new a(d(ListIterator.class), b17, new Sd.b(b17.f(), Sd.e.b(s.a.f81883M, b17.f()), false));
        Sd.c cVar2 = s.a.f81877G;
        Sd.b b18 = b.a.b(cVar2);
        a aVar8 = new a(d(Map.class), b18, new Sd.b(b18.f(), Sd.e.b(s.a.f81885O, b18.f()), false));
        Sd.b b19 = b.a.b(cVar2);
        Sd.f g10 = s.a.f81878H.g();
        Intrinsics.checkNotNullExpressionValue(g10, "shortName(...)");
        Sd.b d11 = b19.d(g10);
        List<a> b02 = C7714v.b0(aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, new a(d(Map.Entry.class), d11, new Sd.b(d11.f(), Sd.e.b(s.a.f81886P, d11.f()), false)));
        f98574n = b02;
        c(Object.class, s.a.f81897a);
        c(String.class, s.a.f81906f);
        c(CharSequence.class, s.a.f81905e);
        b(Throwable.class, s.a.f81911k);
        c(Cloneable.class, s.a.f81901c);
        c(Number.class, s.a.f81909i);
        b(Comparable.class, s.a.f81912l);
        c(Enum.class, s.a.f81910j);
        b(Annotation.class, s.a.f81919s);
        for (a aVar9 : b02) {
            Sd.b a11 = aVar9.a();
            Sd.b b21 = aVar9.b();
            Sd.b c11 = aVar9.c();
            a(a11, b21);
            f98569i.put(c11.a().j(), a11);
            f98572l.put(c11, b21);
            f98573m.put(b21, c11);
            Sd.c a12 = b21.a();
            Sd.c a13 = c11.a();
            f98570j.put(c11.a().j(), a12);
            f98571k.put(a12.j(), a13);
        }
        for (EnumC5003e enumC5003e : EnumC5003e.values()) {
            Sd.c topLevelFqName = enumC5003e.h();
            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getWrapperFqName(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            Sd.b bVar2 = new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
            qd.p primitiveType = enumC5003e.g();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            Sd.c topLevelFqName2 = qd.s.f81865l.c(primitiveType.g());
            Intrinsics.checkNotNullExpressionValue(topLevelFqName2, "child(...)");
            Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
            Sd.c e12 = topLevelFqName2.e();
            a(bVar2, new Sd.b(e12, U7.d.a(e12, "parent(...)", topLevelFqName2, "shortName(...)")));
        }
        qd.d dVar2 = qd.d.f81829a;
        for (Sd.b bVar3 : qd.d.a()) {
            Sd.c topLevelFqName3 = new Sd.c("kotlin.jvm.internal." + bVar3.h().b() + "CompanionObject");
            Intrinsics.checkNotNullParameter(topLevelFqName3, "topLevelFqName");
            Sd.c e13 = topLevelFqName3.e();
            a(new Sd.b(e13, U7.d.a(e13, "parent(...)", topLevelFqName3, "shortName(...)")), bVar3.d(Sd.h.f26145b));
        }
        for (int i11 = 0; i11 < 23; i11++) {
            Sd.c topLevelFqName4 = new Sd.c(Ej.b.a(i11, "kotlin.jvm.functions.Function"));
            Intrinsics.checkNotNullParameter(topLevelFqName4, "topLevelFqName");
            Sd.c e14 = topLevelFqName4.e();
            Sd.b bVar4 = new Sd.b(e14, U7.d.a(e14, "parent(...)", topLevelFqName4, "shortName(...)"));
            Sd.f f7 = Sd.f.f("Function" + i11);
            Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
            a(bVar4, new Sd.b(qd.s.f81865l, f7));
            f98569i.put(new Sd.c(f98562b + i11).j(), f98567g);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            AbstractC9252f.c cVar3 = AbstractC9252f.c.f83307c;
            f98569i.put(new Sd.c((cVar3.b() + '.' + cVar3.a()) + i12).j(), f98567g);
        }
        Sd.c l11 = s.a.f81899b.l();
        Intrinsics.checkNotNullExpressionValue(l11, "toSafe(...)");
        f98569i.put(l11.j(), d(Void.class));
    }

    private static void a(Sd.b bVar, Sd.b bVar2) {
        f98568h.put(bVar.a().j(), bVar2);
        f98569i.put(bVar2.a().j(), bVar);
    }

    private static void b(Class cls, Sd.c topLevelFqName) {
        Sd.b d11 = d(cls);
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        Sd.c e11 = topLevelFqName.e();
        a(d11, new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)")));
    }

    private static void c(Class cls, Sd.d dVar) {
        Sd.c l11 = dVar.l();
        Intrinsics.checkNotNullExpressionValue(l11, "toSafe(...)");
        b(cls, l11);
    }

    private static Sd.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            Sd.c topLevelFqName = new Sd.c(cls.getCanonicalName());
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            Sd.c e11 = topLevelFqName.e();
            return new Sd.b(e11, U7.d.a(e11, "parent(...)", topLevelFqName, "shortName(...)"));
        }
        Sd.b d11 = d(declaringClass);
        Sd.f f7 = Sd.f.f(cls.getSimpleName());
        Intrinsics.checkNotNullExpressionValue(f7, "identifier(...)");
        return d11.d(f7);
    }

    @NotNull
    public static Sd.c e() {
        return f98566f;
    }

    @NotNull
    public static List f() {
        return f98574n;
    }

    private static boolean g(Sd.d dVar, String str) {
        Integer w02;
        String b11 = dVar.b();
        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
        if (kotlin.text.h.e0(b11, str, false)) {
            String substring = b11.substring(str.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (!kotlin.text.h.f0(substring, '0') && (w02 = kotlin.text.h.w0(substring)) != null && w02.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Sd.d dVar) {
        return f98570j.containsKey(dVar);
    }

    public static boolean i(Sd.d dVar) {
        return f98571k.containsKey(dVar);
    }

    public static Sd.b j(@NotNull Sd.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return f98568h.get(fqName.j());
    }

    public static Sd.b k(@NotNull Sd.d kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        return (g(kotlinFqName, f98561a) || g(kotlinFqName, f98563c)) ? f98565e : (g(kotlinFqName, f98562b) || g(kotlinFqName, f98564d)) ? f98567g : f98569i.get(kotlinFqName);
    }

    public static Sd.c l(Sd.d dVar) {
        return f98570j.get(dVar);
    }

    public static Sd.c m(Sd.d dVar) {
        return f98571k.get(dVar);
    }
}
