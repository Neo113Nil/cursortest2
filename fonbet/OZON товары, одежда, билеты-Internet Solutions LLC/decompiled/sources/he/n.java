package he;

import Ad.C2379a;
import Bd.InterfaceC2627a;
import Nd.b;
import Pd.h;
import Vd.C4081b;
import ce.l;
import de.C6183b;
import fe.C6535n;
import fe.C6537p;
import fe.InterfaceC6543w;
import fe.N;
import fe.O;
import fe.P;
import fe.Z;
import ie.C7056e;
import ie.InterfaceC7060i;
import ie.InterfaceC7061j;
import ie.InterfaceC7062k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import je.AbstractC7370b;
import je.Y;
import je.s0;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7734p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9819J;
import td.C9858x;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9831W;
import td.InterfaceC9834Z;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.b0;
import td.c0;
import td.d0;
import td.g0;
import td.i0;
import td.n0;
import td.p0;
import ud.InterfaceC10030h;
import wd.AbstractC10516b;
import wd.C10528n;
import wd.C10534u;

/* loaded from: classes.dex */
public final class n extends AbstractC10516b implements InterfaceC9845k {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Nd.b f65432e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Pd.a f65433f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final d0 f65434g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Sd.b f65435h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final EnumC9812C f65436i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final AbstractC9850p f65437j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final EnumC9840f f65438k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final C6537p f65439l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final ce.m f65440m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private final b f65441n;

    /* renamed from: o, reason: collision with root package name */
    @NotNull
    private final b0<a> f65442o;

    /* renamed from: p, reason: collision with root package name */
    private final c f65443p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final InterfaceC9845k f65444q;

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k<InterfaceC9838d> f65445r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<Collection<InterfaceC9838d>> f65446s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k<InterfaceC9839e> f65447t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j<Collection<InterfaceC9839e>> f65448u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final InterfaceC7062k<n0<Y>> f65449v;

    /* renamed from: w, reason: collision with root package name */
    @NotNull
    private final N.a f65450w;

    /* renamed from: x, reason: collision with root package name */
    @NotNull
    private final InterfaceC10030h f65451x;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends z {

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final ke.h f65452g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j<Collection<InterfaceC9845k>> f65453h;

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j<Collection<je.N>> f65454i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ n f65455j;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(@NotNull n nVar, ke.h kotlinTypeRefiner) {
            super(r2, r3, r4, r5, new C6940j(r1));
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f65455j = nVar;
            C6537p P02 = nVar.P0();
            List<Nd.h> v02 = nVar.Q0().v0();
            Intrinsics.checkNotNullExpressionValue(v02, "getFunctionList(...)");
            List<Nd.m> G02 = nVar.Q0().G0();
            Intrinsics.checkNotNullExpressionValue(G02, "getPropertyList(...)");
            List<Nd.q> K02 = nVar.Q0().K0();
            Intrinsics.checkNotNullExpressionValue(K02, "getTypeAliasList(...)");
            List<Integer> F02 = nVar.Q0().F0();
            Intrinsics.checkNotNullExpressionValue(F02, "getNestedClassNameList(...)");
            List<Integer> list = F02;
            Pd.c g10 = nVar.P0().g();
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fe.L.b(g10, ((Number) it.next()).intValue()));
            }
            this.f65452g = kotlinTypeRefiner;
            this.f65453h = ((C7056e) n().h()).a(new C6941k(this));
            this.f65454i = ((C7056e) n().h()).a(new C6942l(this));
        }

        static Collection u(a aVar) {
            return aVar.f65452g.e(aVar.f65455j);
        }

        private final void v(Sd.f fVar, ArrayList arrayList, ArrayList arrayList2) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            n().c().n().a().j(fVar, arrayList, arrayList3, this.f65455j, new m(arrayList2));
        }

        @Override // he.z, ce.m, ce.l
        @NotNull
        public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            w(name, location);
            return super.b(name, location);
        }

        @Override // he.z, ce.m, ce.o
        public final InterfaceC9842h d(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
            InterfaceC9839e c11;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            w(name, location);
            c cVar = this.f65455j.f65443p;
            return (cVar == null || (c11 = cVar.c(name)) == null) ? super.d(name, location) : c11;
        }

        @Override // ce.m, ce.o
        @NotNull
        public final Collection<InterfaceC9845k> e(@NotNull ce.d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
            Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            return this.f65453h.invoke();
        }

        @Override // he.z, ce.m, ce.l
        @NotNull
        public final Collection<c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            w(name, location);
            return super.g(name, location);
        }

        @Override // he.z
        protected final void i(@NotNull ArrayList result, @NotNull Function1 nameFilter) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
            c cVar = this.f65455j.f65443p;
            RandomAccess b11 = cVar != null ? cVar.b() : null;
            if (b11 == null) {
                b11 = kotlin.collections.K.f71697a;
            }
            result.addAll(b11);
        }

        @Override // he.z
        protected final void k(@NotNull Sd.f name, @NotNull ArrayList functions) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(functions, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator<je.N> it = this.f65454i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().p().g(name, Bd.c.FOR_ALREADY_TRACKED));
            }
            functions.addAll(n().c().c().b(name, this.f65455j));
            v(name, arrayList, functions);
        }

        @Override // he.z
        protected final void l(@NotNull Sd.f name, @NotNull ArrayList descriptors) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator<je.N> it = this.f65454i.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().p().b(name, Bd.c.FOR_ALREADY_TRACKED));
            }
            v(name, arrayList, descriptors);
        }

        @Override // he.z
        @NotNull
        protected final Sd.b m(@NotNull Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f65455j.f65435h.d(name);
        }

        @Override // he.z
        protected final Set<Sd.f> p() {
            List<je.N> o11 = this.f65455j.f65441n.o();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = o11.iterator();
            while (it.hasNext()) {
                Set<Sd.f> f7 = ((je.N) it.next()).p().f();
                if (f7 == null) {
                    return null;
                }
                C7714v.p(f7, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // he.z
        @NotNull
        protected final Set<Sd.f> q() {
            n nVar = this.f65455j;
            List<je.N> o11 = nVar.f65441n.o();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = o11.iterator();
            while (it.hasNext()) {
                C7714v.p(((je.N) it.next()).p().a(), linkedHashSet);
            }
            linkedHashSet.addAll(n().c().c().e(nVar));
            return linkedHashSet;
        }

        @Override // he.z
        @NotNull
        protected final Set<Sd.f> r() {
            List<je.N> o11 = this.f65455j.f65441n.o();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = o11.iterator();
            while (it.hasNext()) {
                C7714v.p(((je.N) it.next()).p().c(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // he.z
        protected final boolean t(@NotNull C6926H function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return n().c().t().d(this.f65455j, function);
        }

        public final void w(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            C2379a.a(n().c().p(), location, this.f65455j, name);
        }
    }

    private final class b extends AbstractC7370b {

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j<List<i0>> f65456c;

        public b() {
            super(n.this.P0().h());
            this.f65456c = ((C7056e) n.this.P0().h()).a(new o(n.this));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        @Override // je.AbstractC7394n
        @NotNull
        protected final Collection<je.N> d() {
            String b11;
            Sd.c a11;
            n nVar = n.this;
            Nd.b Q02 = nVar.Q0();
            Pd.g typeTable = nVar.P0().j();
            Intrinsics.checkNotNullParameter(Q02, "<this>");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            List<Nd.p> J02 = Q02.J0();
            boolean isEmpty = J02.isEmpty();
            ?? r32 = J02;
            if (isEmpty) {
                r32 = 0;
            }
            if (r32 == 0) {
                List<Integer> I02 = Q02.I0();
                Intrinsics.checkNotNullExpressionValue(I02, "getSupertypeIdList(...)");
                List<Integer> list = I02;
                r32 = new ArrayList(C7714v.z(list, 10));
                for (Integer num : list) {
                    Intrinsics.f(num);
                    r32.add(typeTable.a(num.intValue()));
                }
            }
            Iterable iterable = (Iterable) r32;
            ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(nVar.P0().i().k((Nd.p) it.next()));
            }
            ArrayList p02 = C7714v.p0(nVar.P0().c().c().a(nVar), arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = p02.iterator();
            while (it2.hasNext()) {
                InterfaceC9842h p11 = ((je.N) it2.next()).H0().p();
                C9819J.b bVar = p11 instanceof C9819J.b ? (C9819J.b) p11 : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC6543w j11 = nVar.P0().c().j();
                ArrayList arrayList3 = new ArrayList(C7714v.z(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    C9819J.b bVar2 = (C9819J.b) it3.next();
                    Sd.b f7 = Zd.e.f(bVar2);
                    if (f7 == null || (a11 = f7.a()) == null || (b11 = a11.b()) == null) {
                        b11 = bVar2.getName().b();
                        Intrinsics.checkNotNullExpressionValue(b11, "asString(...)");
                    }
                    arrayList3.add(b11);
                }
                j11.a(nVar, arrayList3);
            }
            return C7714v.U0(p02);
        }

        @Override // je.AbstractC7394n
        @NotNull
        protected final g0 g() {
            return g0.a.f99394a;
        }

        @Override // je.s0
        @NotNull
        public final List<i0> getParameters() {
            return this.f65456c.invoke();
        }

        @Override // je.AbstractC7370b
        /* renamed from: l */
        public final InterfaceC9839e p() {
            return n.this;
        }

        @Override // je.AbstractC7370b, je.s0
        public final InterfaceC9842h p() {
            return n.this;
        }

        @Override // je.s0
        public final boolean q() {
            return true;
        }

        @NotNull
        public final String toString() {
            String fVar = n.this.getName().toString();
            Intrinsics.checkNotNullExpressionValue(fVar, "toString(...)");
            return fVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    final class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final LinkedHashMap f65458a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC7060i<Sd.f, InterfaceC9839e> f65459b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final InterfaceC7061j<Set<Sd.f>> f65460c;

        public c() {
            List<Nd.f> s02 = n.this.Q0().s0();
            Intrinsics.checkNotNullExpressionValue(s02, "getEnumEntryList(...)");
            List<Nd.f> list = s02;
            int h11 = U.h(C7714v.z(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (Object obj : list) {
                linkedHashMap.put(fe.L.b(n.this.P0().g(), ((Nd.f) obj).B()), obj);
            }
            this.f65458a = linkedHashMap;
            this.f65459b = ((C7056e) n.this.P0().h()).j(new p(this, n.this));
            this.f65460c = ((C7056e) n.this.P0().h()).a(new q(this));
        }

        static C10534u a(c cVar, n nVar, Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            Nd.f fVar = (Nd.f) cVar.f65458a.get(name);
            if (fVar == null) {
                return null;
            }
            return C10534u.G0(nVar.P0().h(), nVar, name, cVar.f65460c, new C6931a(nVar.P0().h(), new r(nVar, fVar)), d0.f99392a);
        }

        @NotNull
        public final ArrayList b() {
            Set keySet = this.f65458a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                InterfaceC9839e c11 = c((Sd.f) it.next());
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            return arrayList;
        }

        public final InterfaceC9839e c(@NotNull Sd.f name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return this.f65459b.invoke(name);
        }
    }

    /* synthetic */ class d extends C7734p implements Function1<ke.h, a> {
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke(ke.h p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return new a((n) this.receiver, p02);
        }

        @Override // kotlin.jvm.internal.AbstractC7724f, kotlin.reflect.c
        public final String getName() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final kotlin.reflect.g getOwner() {
            return kotlin.jvm.internal.N.b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC7724f
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull C6537p outerContext, @NotNull Nd.b classProto, @NotNull Pd.c nameResolver, @NotNull Pd.a metadataVersion, @NotNull d0 sourceElement) {
        super(outerContext.h(), fe.L.a(nameResolver, classProto.u0()).h());
        EnumC9840f enumC9840f;
        ce.m mVar;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f65432e = classProto;
        this.f65433f = metadataVersion;
        this.f65434g = sourceElement;
        this.f65435h = fe.L.a(nameResolver, classProto.u0());
        this.f65436i = O.a(Pd.b.f22232e.c(classProto.t0()));
        this.f65437j = P.a(Pd.b.f22231d.c(classProto.t0()));
        b.c c11 = Pd.b.f22233f.c(classProto.t0());
        switch (c11 == null ? -1 : O.a.f63178b[c11.ordinal()]) {
            case 1:
                enumC9840f = EnumC9840f.CLASS;
                break;
            case 2:
                enumC9840f = EnumC9840f.INTERFACE;
                break;
            case 3:
                enumC9840f = EnumC9840f.ENUM_CLASS;
                break;
            case 4:
                enumC9840f = EnumC9840f.ENUM_ENTRY;
                break;
            case 5:
                enumC9840f = EnumC9840f.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                enumC9840f = EnumC9840f.OBJECT;
                break;
            default:
                enumC9840f = EnumC9840f.CLASS;
                break;
        }
        this.f65438k = enumC9840f;
        List<Nd.r> L02 = classProto.L0();
        Intrinsics.checkNotNullExpressionValue(L02, "getTypeParameterList(...)");
        Nd.s M02 = classProto.M0();
        Intrinsics.checkNotNullExpressionValue(M02, "getTypeTable(...)");
        Pd.g gVar = new Pd.g(M02);
        int i11 = Pd.h.f22262c;
        Nd.v N02 = classProto.N0();
        Intrinsics.checkNotNullExpressionValue(N02, "getVersionRequirementTable(...)");
        C6537p a11 = outerContext.a(this, L02, nameResolver, gVar, h.a.a(N02), metadataVersion);
        this.f65439l = a11;
        Boolean d11 = Pd.b.f22240m.d(classProto.t0());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        boolean booleanValue = d11.booleanValue();
        EnumC9840f enumC9840f2 = EnumC9840f.ENUM_CLASS;
        if (enumC9840f == enumC9840f2) {
            mVar = new ce.r(a11.h(), this, booleanValue || Intrinsics.d(a11.c().i().a(), Boolean.TRUE));
        } else {
            mVar = l.b.f57046b;
        }
        this.f65440m = mVar;
        this.f65441n = new b();
        b0.a aVar = b0.f99383e;
        ie.o storageManager = a11.h();
        ke.h kotlinTypeRefinerForOwnerModule = a11.c().n().b();
        d scopeFactory = new d(1, this);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.f65442o = new b0<>(this, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule);
        this.f65443p = enumC9840f == enumC9840f2 ? new c() : null;
        InterfaceC9845k e11 = outerContext.e();
        this.f65444q = e11;
        this.f65445r = ((C7056e) a11.h()).b(new C6934d(this));
        this.f65446s = ((C7056e) a11.h()).a(new C6935e(this));
        this.f65447t = ((C7056e) a11.h()).b(new C6936f(this));
        this.f65448u = ((C7056e) a11.h()).a(new C6937g(this));
        this.f65449v = ((C7056e) a11.h()).b(new C6938h(this));
        Pd.c g10 = a11.g();
        Pd.g j11 = a11.j();
        n nVar = e11 instanceof n ? (n) e11 : null;
        this.f65450w = new N.a(classProto, g10, j11, sourceElement, nVar != null ? nVar.f65450w : null);
        this.f65451x = !Pd.b.f22230c.d(classProto.t0()).booleanValue() ? InterfaceC10030h.a.b() : new C6930L(a11.h(), new C6939i(this));
    }

    static C10528n J0(n nVar) {
        Object obj;
        if (nVar.f65438k.a()) {
            C10528n j11 = Vd.h.j(nVar);
            j11.W0(nVar.q());
            return j11;
        }
        List<Nd.c> o02 = nVar.f65432e.o0();
        Intrinsics.checkNotNullExpressionValue(o02, "getConstructorList(...)");
        Iterator<T> it = o02.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!Pd.b.f22241n.d(((Nd.c) obj).F()).booleanValue()) {
                break;
            }
        }
        Nd.c cVar = (Nd.c) obj;
        if (cVar != null) {
            return nVar.f65439l.f().l(cVar, true);
        }
        return null;
    }

    static ArrayList K0(n nVar) {
        List<Nd.c> o02 = nVar.f65432e.o0();
        Intrinsics.checkNotNullExpressionValue(o02, "getConstructorList(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : o02) {
            Boolean d11 = Pd.b.f22241n.d(((Nd.c) obj).F());
            Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
            if (d11.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C6537p c6537p = nVar.f65439l;
            if (!hasNext) {
                return C7714v.p0(c6537p.c().c().c(nVar), C7714v.p0(C7714v.c0(nVar.z()), arrayList2));
            }
            Nd.c cVar = (Nd.c) it.next();
            fe.K f7 = c6537p.f();
            Intrinsics.f(cVar);
            arrayList2.add(f7.l(cVar, false));
        }
    }

    static InterfaceC9839e L0(n nVar) {
        Nd.b bVar = nVar.f65432e;
        if (!bVar.O0()) {
            return null;
        }
        InterfaceC9842h d11 = nVar.R0().d(fe.L.b(nVar.f65439l.g(), bVar.n0()), Bd.c.FROM_DESERIALIZATION);
        if (d11 instanceof InterfaceC9839e) {
            return (InterfaceC9839e) d11;
        }
        return null;
    }

    static Collection M0(n nVar) {
        if (nVar.f65436i != EnumC9812C.SEALED) {
            return kotlin.collections.K.f71697a;
        }
        List<Integer> H02 = nVar.f65432e.H0();
        Intrinsics.f(H02);
        if (H02.isEmpty()) {
            return C4081b.E0(nVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : H02) {
            C6537p c6537p = nVar.f65439l;
            C6535n c11 = c6537p.c();
            Pd.c g10 = c6537p.g();
            Intrinsics.f(num);
            InterfaceC9839e b11 = c11.b(fe.L.a(g10, num.intValue()));
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        return arrayList;
    }

    static n0 N0(n nVar) {
        if (!nVar.isInline() && !nVar.s()) {
            return null;
        }
        C6537p c6537p = nVar.f65439l;
        n0 a11 = Z.a(nVar.f65432e, c6537p.g(), c6537p.j(), new s(c6537p.i()), new t(nVar));
        if (a11 != null) {
            return a11;
        }
        if (nVar.f65433f.c(1, 5, 1)) {
            return null;
        }
        InterfaceC9838d z11 = nVar.z();
        if (z11 == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + nVar).toString());
        }
        List<p0> f7 = z11.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        Sd.f name = ((p0) C7714v.K(f7)).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Y U02 = nVar.U0(name);
        if (U02 != null) {
            return new C9858x(name, U02);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + nVar).toString());
    }

    static List O0(n nVar) {
        return C7714v.U0(nVar.f65439l.c().d().a(nVar.f65450w));
    }

    private final a R0() {
        return this.f65442o.b(this.f65439l.c().n().b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Y U0(Sd.f fVar) {
        Iterator it = R0().b(fVar, Bd.c.FROM_DESERIALIZATION).iterator();
        boolean z11 = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((InterfaceC9831W) next).d0() == null) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj = next;
                }
            }
        }
        InterfaceC9831W interfaceC9831W = (InterfaceC9831W) obj;
        return (Y) (interfaceC9831W != null ? interfaceC9831W.getType() : null);
    }

    @Override // td.InterfaceC9839e
    public final boolean E0() {
        Boolean d11 = Pd.b.f22235h.d(this.f65432e.t0());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }

    @NotNull
    public final C6537p P0() {
        return this.f65439l;
    }

    @NotNull
    public final Nd.b Q0() {
        return this.f65432e;
    }

    @NotNull
    public final Pd.a S0() {
        return this.f65433f;
    }

    @NotNull
    public final N.a T0() {
        return this.f65450w;
    }

    @Override // wd.G
    @NotNull
    protected final ce.l V(@NotNull ke.h kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f65442o.b(kotlinTypeRefiner);
    }

    public final boolean V0(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return R0().o().contains(name);
    }

    @Override // td.InterfaceC9845k
    @NotNull
    public final InterfaceC9845k d() {
        return this.f65444q;
    }

    @Override // td.InterfaceC9848n
    @NotNull
    public final d0 e() {
        return this.f65434g;
    }

    @Override // td.InterfaceC9839e
    public final n0<Y> e0() {
        return this.f65449v.invoke();
    }

    @Override // td.InterfaceC9843i
    public final boolean g() {
        Boolean d11 = Pd.b.f22234g.d(this.f65432e.t0());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }

    @Override // td.InterfaceC9811B
    public final boolean g0() {
        return false;
    }

    @Override // ud.InterfaceC10023a
    @NotNull
    public final InterfaceC10030h getAnnotations() {
        return this.f65451x;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final EnumC9840f getKind() {
        return this.f65438k;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B, td.InterfaceC9849o
    @NotNull
    public final AbstractC9853s getVisibility() {
        return this.f65437j;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9811B
    @NotNull
    public final EnumC9812C h() {
        return this.f65436i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // wd.AbstractC10516b, td.InterfaceC9839e
    @NotNull
    public final List<InterfaceC9834Z> h0() {
        C6537p c6537p = this.f65439l;
        Pd.g typeTable = c6537p.j();
        Nd.b bVar = this.f65432e;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<Nd.p> q02 = bVar.q0();
        boolean isEmpty = q02.isEmpty();
        ?? r32 = q02;
        if (isEmpty) {
            r32 = 0;
        }
        if (r32 == 0) {
            List<Integer> p02 = bVar.p0();
            Intrinsics.checkNotNullExpressionValue(p02, "getContextReceiverTypeIdList(...)");
            List<Integer> list = p02;
            r32 = new ArrayList(C7714v.z(list, 10));
            for (Integer num : list) {
                Intrinsics.f(num);
                r32.add(typeTable.a(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) r32;
        ArrayList arrayList = new ArrayList(C7714v.z(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new wd.U(W(), new C6183b(this, c6537p.i().k((Nd.p) it.next()), null), InterfaceC10030h.a.b()));
        }
        return arrayList;
    }

    @Override // td.InterfaceC9811B
    public final boolean isExternal() {
        Boolean d11 = Pd.b.f22236i.d(this.f65432e.t0());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }

    @Override // td.InterfaceC9839e
    public final boolean isInline() {
        return Pd.b.f22238k.d(this.f65432e.t0()).booleanValue() && this.f65433f.e();
    }

    @Override // td.InterfaceC9839e
    public final boolean j0() {
        return Pd.b.f22233f.c(this.f65432e.t0()) == b.c.COMPANION_OBJECT;
    }

    @Override // td.InterfaceC9842h
    @NotNull
    public final s0 k() {
        return this.f65441n;
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9838d> l() {
        return this.f65446s.invoke();
    }

    @Override // td.InterfaceC9839e
    public final boolean l0() {
        Boolean d11 = Pd.b.f22239l.d(this.f65432e.t0());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }

    @Override // td.InterfaceC9839e
    @NotNull
    public final Collection<InterfaceC9839e> m() {
        return this.f65448u.invoke();
    }

    @Override // td.InterfaceC9811B
    public final boolean p0() {
        Boolean d11 = Pd.b.f22237j.d(this.f65432e.t0());
        Intrinsics.checkNotNullExpressionValue(d11, "get(...)");
        return d11.booleanValue();
    }

    @Override // td.InterfaceC9839e
    public final ce.l q0() {
        return this.f65440m;
    }

    @Override // td.InterfaceC9839e, td.InterfaceC9843i
    @NotNull
    public final List<i0> r() {
        return this.f65439l.i().f();
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9839e r0() {
        return this.f65447t.invoke();
    }

    @Override // td.InterfaceC9839e
    public final boolean s() {
        return Pd.b.f22238k.d(this.f65432e.t0()).booleanValue() && this.f65433f.c(1, 4, 2);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(p0() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // td.InterfaceC9839e
    public final InterfaceC9838d z() {
        return this.f65445r.invoke();
    }
}
