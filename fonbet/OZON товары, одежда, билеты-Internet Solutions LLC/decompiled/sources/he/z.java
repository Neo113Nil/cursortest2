package he;

import Bd.InterfaceC2627a;
import Td.AbstractC4045a;
import fe.C6537p;
import ie.C7056e;
import ie.InterfaceC7059h;
import ie.InterfaceC7060i;
import ie.InterfaceC7061j;
import ie.InterfaceC7062k;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9842h;
import td.c0;
import td.h0;
import te.C9865a;

/* loaded from: classes.dex */
public abstract class z extends ce.m {

    /* renamed from: f, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f65470f = {N.h(new kotlin.jvm.internal.E(N.b(z.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), N.h(new kotlin.jvm.internal.E(N.b(z.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6537p f65471b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f65472c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f65473d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k f65474e;

    private interface a {
        @NotNull
        Set<Sd.f> a();

        @NotNull
        Collection b(@NotNull Sd.f fVar, @NotNull Bd.c cVar);

        @NotNull
        Set<Sd.f> c();

        void d(@NotNull ArrayList arrayList, @NotNull ce.d dVar, @NotNull Function1 function1, @NotNull Bd.c cVar);

        @NotNull
        Set<Sd.f> e();

        @NotNull
        Collection f(@NotNull Sd.f fVar, @NotNull Bd.c cVar);

        h0 g(@NotNull Sd.f fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements a {

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.m<Object>[] f65475j = {N.h(new kotlin.jvm.internal.E(N.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), N.h(new kotlin.jvm.internal.E(N.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f65476a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f65477b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Object f65478c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final InterfaceC7059h<Sd.f, Collection<c0>> f65479d;

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final InterfaceC7059h<Sd.f, Collection<InterfaceC9831W>> f65480e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final InterfaceC7060i<Sd.f, h0> f65481f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j f65482g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j f65483h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z f65484i;

        public static final class a implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Td.b f65485a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteArrayInputStream f65486b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z f65487c;

            public a(Td.b bVar, ByteArrayInputStream byteArrayInputStream, z zVar) {
                this.f65485a = bVar;
                this.f65486b = byteArrayInputStream;
                this.f65487c = zVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Td.f k11 = this.f65487c.n().c().k();
                return this.f65485a.c(this.f65486b, k11);
            }
        }

        public b(@NotNull z zVar, @NotNull List<Nd.h> functionList, @NotNull List<Nd.m> propertyList, List<Nd.q> typeAliasList) {
            Intrinsics.checkNotNullParameter(functionList, "functionList");
            Intrinsics.checkNotNullParameter(propertyList, "propertyList");
            Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
            this.f65484i = zVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                Sd.f b11 = fe.L.b(zVar.n().g(), ((Nd.h) ((Td.p) obj)).X());
                Object obj2 = linkedHashMap.get(b11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b11, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f65476a = m(linkedHashMap);
            z zVar2 = this.f65484i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                Sd.f b12 = fe.L.b(zVar2.n().g(), ((Nd.m) ((Td.p) obj3)).W());
                Object obj4 = linkedHashMap2.get(b12);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b12, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f65477b = m(linkedHashMap2);
            this.f65484i.n().c().g().getClass();
            z zVar3 = this.f65484i;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj5 : typeAliasList) {
                Sd.f b13 = fe.L.b(zVar3.n().g(), ((Nd.q) ((Td.p) obj5)).Q());
                Object obj6 = linkedHashMap3.get(b13);
                if (obj6 == null) {
                    obj6 = new ArrayList();
                    linkedHashMap3.put(b13, obj6);
                }
                ((List) obj6).add(obj5);
            }
            this.f65478c = m(linkedHashMap3);
            this.f65479d = ((C7056e) this.f65484i.n().h()).d(new C6919A(this));
            this.f65480e = ((C7056e) this.f65484i.n().h()).d(new C6920B(this));
            this.f65481f = ((C7056e) this.f65484i.n().h()).j(new C6921C(this));
            this.f65482g = ((C7056e) this.f65484i.n().h()).a(new C6922D(this, this.f65484i));
            this.f65483h = ((C7056e) this.f65484i.n().h()).a(new C6923E(this, this.f65484i));
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static Collection h(b bVar, Sd.f it) {
            Collection<Nd.h> collection;
            Intrinsics.checkNotNullParameter(it, "it");
            LinkedHashMap linkedHashMap = bVar.f65476a;
            Td.r<Nd.h> PARSER = Nd.h.f19192v;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            byte[] bArr = (byte[]) linkedHashMap.get(it);
            z zVar = bVar.f65484i;
            if (bArr != null) {
                List C11 = kotlin.sequences.l.C(kotlin.sequences.l.p(new a((Td.b) PARSER, new ByteArrayInputStream(bArr), zVar)));
                if (C11 != null) {
                    collection = C11;
                    ArrayList arrayList = new ArrayList(collection.size());
                    for (Nd.h hVar : collection) {
                        fe.K f7 = zVar.n().f();
                        Intrinsics.f(hVar);
                        C6926H m11 = f7.m(hVar);
                        if (!zVar.t(m11)) {
                            m11 = null;
                        }
                        if (m11 != null) {
                            arrayList.add(m11);
                        }
                    }
                    zVar.k(it, arrayList);
                    return C9865a.b(arrayList);
                }
            }
            collection = kotlin.collections.K.f71697a;
            ArrayList arrayList2 = new ArrayList(collection.size());
            while (r0.hasNext()) {
            }
            zVar.k(it, arrayList2);
            return C9865a.b(arrayList2);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0049 A[LOOP:0: B:7:0x0043->B:9:0x0049, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        static Collection i(b bVar, Sd.f it) {
            Collection<Nd.m> collection;
            Intrinsics.checkNotNullParameter(it, "it");
            LinkedHashMap linkedHashMap = bVar.f65477b;
            Td.r<Nd.m> PARSER = Nd.m.f19260v;
            Intrinsics.checkNotNullExpressionValue(PARSER, "PARSER");
            byte[] bArr = (byte[]) linkedHashMap.get(it);
            z zVar = bVar.f65484i;
            if (bArr != null) {
                List C11 = kotlin.sequences.l.C(kotlin.sequences.l.p(new a((Td.b) PARSER, new ByteArrayInputStream(bArr), zVar)));
                if (C11 != null) {
                    collection = C11;
                    ArrayList arrayList = new ArrayList(collection.size());
                    for (Nd.m mVar : collection) {
                        fe.K f7 = zVar.n().f();
                        Intrinsics.f(mVar);
                        arrayList.add(f7.n(mVar));
                    }
                    zVar.l(it, arrayList);
                    return C9865a.b(arrayList);
                }
            }
            collection = kotlin.collections.K.f71697a;
            ArrayList arrayList2 = new ArrayList(collection.size());
            while (r0.hasNext()) {
            }
            zVar.l(it, arrayList2);
            return C9865a.b(arrayList2);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
        static C6927I j(b bVar, Sd.f it) {
            Intrinsics.checkNotNullParameter(it, "it");
            byte[] bArr = (byte[]) bVar.f65478c.get(it);
            if (bArr == null) {
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            z zVar = bVar.f65484i;
            Nd.q qVar = (Nd.q) ((Td.b) Nd.q.f19373p).c(byteArrayInputStream, zVar.n().c().k());
            if (qVar == null) {
                return null;
            }
            return zVar.n().f().o(qVar);
        }

        static LinkedHashSet k(b bVar, z zVar) {
            return e0.f(bVar.f65476a.keySet(), zVar.q());
        }

        static LinkedHashSet l(b bVar, z zVar) {
            return e0.f(bVar.f65477b.keySet(), zVar.r());
        }

        private static LinkedHashMap m(LinkedHashMap linkedHashMap) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<AbstractC4045a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
                for (AbstractC4045a abstractC4045a : iterable) {
                    int serializedSize = abstractC4045a.getSerializedSize();
                    int f7 = Td.e.f(serializedSize) + serializedSize;
                    if (f7 > 4096) {
                        f7 = 4096;
                    }
                    Td.e j11 = Td.e.j(byteArrayOutputStream, f7);
                    j11.v(serializedSize);
                    abstractC4045a.a(j11);
                    j11.i();
                    arrayList.add(Unit.f71690a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // he.z.a
        @NotNull
        public final Set<Sd.f> a() {
            return (Set) ie.n.a(this.f65482g, f65475j[0]);
        }

        @Override // he.z.a
        @NotNull
        public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !c().contains(name) ? kotlin.collections.K.f71697a : this.f65480e.invoke(name);
        }

        @Override // he.z.a
        @NotNull
        public final Set<Sd.f> c() {
            return (Set) ie.n.a(this.f65483h, f65475j[1]);
        }

        @Override // he.z.a
        public final void d(@NotNull ArrayList result, @NotNull ce.d kindFilter, @NotNull Function1 nameFilter, @NotNull Bd.c location) {
            int i11;
            int i12;
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            Intrinsics.checkNotNullParameter(location, "location");
            i11 = ce.d.f57019i;
            boolean a11 = kindFilter.a(i11);
            Vd.l INSTANCE = Vd.l.f28544a;
            if (a11) {
                Set<Sd.f> c11 = c();
                ArrayList arrayList = new ArrayList();
                for (Sd.f fVar : c11) {
                    if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                        arrayList.addAll(b(fVar, location));
                    }
                }
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                C7714v.G0(INSTANCE, arrayList);
                result.addAll(arrayList);
            }
            i12 = ce.d.f57018h;
            if (kindFilter.a(i12)) {
                Set<Sd.f> a12 = a();
                ArrayList arrayList2 = new ArrayList();
                for (Sd.f fVar2 : a12) {
                    if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                        arrayList2.addAll(f(fVar2, location));
                    }
                }
                Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
                C7714v.G0(INSTANCE, arrayList2);
                result.addAll(arrayList2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // he.z.a
        @NotNull
        public final Set<Sd.f> e() {
            return this.f65478c.keySet();
        }

        @Override // he.z.a
        @NotNull
        public final Collection f(@NotNull Sd.f name, @NotNull Bd.c location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            return !a().contains(name) ? kotlin.collections.K.f71697a : this.f65479d.invoke(name);
        }

        @Override // he.z.a
        public final h0 g(@NotNull Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f65481f.invoke(name);
        }
    }

    protected z(@NotNull C6537p c11, @NotNull List<Nd.h> functionList, @NotNull List<Nd.m> propertyList, @NotNull List<Nd.q> typeAliasList, @NotNull Function0<? extends Collection<Sd.f>> classNames) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f65471b = c11;
        c11.c().g().getClass();
        this.f65472c = new b(this, functionList, propertyList, typeAliasList);
        this.f65473d = ((C7056e) c11.h()).a(new x(classNames));
        this.f65474e = ((C7056e) c11.h()).b(new y(this));
    }

    static LinkedHashSet h(z zVar) {
        Set<Sd.f> p11 = zVar.p();
        if (p11 == null) {
            return null;
        }
        return e0.f(e0.f(zVar.o(), zVar.f65472c.e()), p11);
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> a() {
        return this.f65472c.a();
    }

    @Override // ce.m, ce.l
    @NotNull
    public Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f65472c.b(name, location);
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Set<Sd.f> c() {
        return this.f65472c.c();
    }

    @Override // ce.m, ce.o
    public InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (s(name)) {
            return this.f65471b.c().b(m(name));
        }
        a aVar = this.f65472c;
        if (aVar.e().contains(name)) {
            return aVar.g(name);
        }
        return null;
    }

    @Override // ce.m, ce.l
    public final Set<Sd.f> f() {
        kotlin.reflect.m<Object> p11 = f65470f[1];
        InterfaceC7062k interfaceC7062k = this.f65474e;
        Intrinsics.checkNotNullParameter(interfaceC7062k, "<this>");
        Intrinsics.checkNotNullParameter(p11, "p");
        return (Set) interfaceC7062k.invoke();
    }

    @Override // ce.m, ce.l
    @NotNull
    public Collection<c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f65472c.f(name, (Bd.c) location);
    }

    protected abstract void i(@NotNull ArrayList arrayList, @NotNull Function1 function1);

    @NotNull
    protected final Collection j(@NotNull ce.d kindFilter, @NotNull Function1 nameFilter, @NotNull Bd.c location) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList arrayList = new ArrayList(0);
        i11 = ce.d.f57015e;
        if (kindFilter.a(i11)) {
            i(arrayList, nameFilter);
        }
        a aVar = this.f65472c;
        aVar.d(arrayList, kindFilter, nameFilter, location);
        i12 = ce.d.f57021k;
        if (kindFilter.a(i12)) {
            for (Sd.f fVar : o()) {
                if (((Boolean) nameFilter.invoke(fVar)).booleanValue()) {
                    C9865a.a(arrayList, this.f65471b.c().b(m(fVar)));
                }
            }
        }
        i13 = ce.d.f57016f;
        if (kindFilter.a(i13)) {
            for (Sd.f fVar2 : aVar.e()) {
                if (((Boolean) nameFilter.invoke(fVar2)).booleanValue()) {
                    C9865a.a(arrayList, aVar.g(fVar2));
                }
            }
        }
        return C9865a.b(arrayList);
    }

    protected void k(@NotNull Sd.f name, @NotNull ArrayList functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    protected void l(@NotNull Sd.f name, @NotNull ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    @NotNull
    protected abstract Sd.b m(@NotNull Sd.f fVar);

    @NotNull
    protected final C6537p n() {
        return this.f65471b;
    }

    @NotNull
    public final Set<Sd.f> o() {
        return (Set) ie.n.a(this.f65473d, f65470f[0]);
    }

    protected abstract Set<Sd.f> p();

    @NotNull
    protected abstract Set<Sd.f> q();

    @NotNull
    protected abstract Set<Sd.f> r();

    protected boolean s(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return o().contains(name);
    }

    protected boolean t(@NotNull C6926H function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
