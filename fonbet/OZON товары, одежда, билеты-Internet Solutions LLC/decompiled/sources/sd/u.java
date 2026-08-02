package sd;

import Gd.C3070B;
import Gd.C3085o;
import Ld.C;
import Ld.D;
import Vd.n;
import ce.l;
import he.C6926H;
import ie.C7056e;
import ie.InterfaceC7052a;
import ie.InterfaceC7059h;
import ie.InterfaceC7061j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import je.F0;
import je.U;
import je.Y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import sd.C9660b;
import sd.C9669k;
import td.C9813D;
import td.C9819J;
import td.C9851q;
import td.C9852r;
import td.C9856v;
import td.EnumC9812C;
import td.EnumC9840f;
import td.InterfaceC9815F;
import td.InterfaceC9836b;
import td.InterfaceC9838d;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.c0;
import td.p0;
import ud.C10029g;
import ud.C10034l;
import ud.InterfaceC10030h;
import vd.C10307d;
import vd.InterfaceC10304a;
import vd.InterfaceC10306c;
import wd.C10530p;
import wd.L;

/* loaded from: classes.dex */
public final class u implements InterfaceC10304a, InterfaceC10306c {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f98610h = {N.h(new E(N.b(u.class), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), N.h(new E(N.b(u.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), N.h(new E(N.b(u.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f98611a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f98612b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Y f98613c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f98614d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC7052a<Sd.c, InterfaceC9839e> f98615e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f98616f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC7059h<Pair<String, String>, InterfaceC10030h> f98617g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes10.dex */
    static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a DEPRECATED_LIST_METHODS;
        public static final a DROP;
        public static final a HIDDEN;
        public static final a NOT_CONSIDERED;
        public static final a VISIBLE;

        static {
            a aVar = new a("HIDDEN", 0);
            HIDDEN = aVar;
            a aVar2 = new a("VISIBLE", 1);
            VISIBLE = aVar2;
            a aVar3 = new a("DEPRECATED_LIST_METHODS", 2);
            DEPRECATED_LIST_METHODS = aVar3;
            a aVar4 = new a("NOT_CONSIDERED", 3);
            NOT_CONSIDERED = aVar4;
            a aVar5 = new a("DROP", 4);
            DROP = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* loaded from: classes10.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98618a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f98618a = iArr;
        }
    }

    public u(@NotNull L moduleDescriptor, @NotNull C7056e storageManager, @NotNull Function0 settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f98611a = moduleDescriptor;
        this.f98612b = storageManager.a(settingsComputation);
        C10530p c10530p = new C10530p(new v(moduleDescriptor, new Sd.c("java.io")), Sd.f.f("Serializable"), EnumC9812C.ABSTRACT, EnumC9840f.INTERFACE, C7714v.a0(new U(storageManager, new o(this))), storageManager);
        c10530p.F0(l.b.f57046b, M.f71699a, null);
        Y q11 = c10530p.q();
        Intrinsics.checkNotNullExpressionValue(q11, "getDefaultType(...)");
        this.f98613c = q11;
        this.f98614d = storageManager.a(new l(this, storageManager));
        this.f98615e = storageManager.h();
        this.f98616f = storageManager.a(new m(this));
        this.f98617g = storageManager.d(new n(this));
    }

    static Y f(u uVar, C7056e c7056e) {
        Sd.b bVar;
        InterfaceC9815F a11 = uVar.l().a();
        C9665g.f98582d.getClass();
        bVar = C9665g.f98586h;
        return C9856v.c(a11, bVar, new C9819J(c7056e, uVar.l().a())).q();
    }

    static InterfaceC10030h g(u uVar) {
        C10034l a11;
        a11 = C10029g.a(uVar.f98611a.n(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", "", "WARNING");
        return InterfaceC10030h.a.a(C7714v.a0(a11));
    }

    static InterfaceC10030h h(u uVar, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.a();
        String str2 = (String) pair.b();
        return InterfaceC10030h.a.a(C7714v.a0(C10029g.a(uVar.f98611a.n(), V.e.a("'", str, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str2, "()' stdlib extension instead"), str2 + "()", "HIDDEN")));
    }

    static Y i(u uVar) {
        Y i11 = uVar.f98611a.n().i();
        Intrinsics.checkNotNullExpressionValue(i11, "getAnyType(...)");
        return i11;
    }

    static ArrayList j(u uVar, InterfaceC9839e interfaceC9839e) {
        Collection<je.N> o11 = interfaceC9839e.k().o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = o11.iterator();
        while (it.hasNext()) {
            InterfaceC9842h p11 = ((je.N) it.next()).H0().p();
            C3085o c3085o = null;
            InterfaceC9842h n02 = p11 != null ? p11.n0() : null;
            InterfaceC9839e interfaceC9839e2 = n02 instanceof InterfaceC9839e ? (InterfaceC9839e) n02 : null;
            if (interfaceC9839e2 != null && (c3085o = uVar.k(interfaceC9839e2)) == null) {
                c3085o = interfaceC9839e2;
            }
            if (c3085o != null) {
                arrayList.add(c3085o);
            }
        }
        return arrayList;
    }

    private final C3085o k(InterfaceC9839e interfaceC9839e) {
        Sd.c a11;
        if (qd.m.Q(interfaceC9839e) || !qd.m.k0(interfaceC9839e)) {
            return null;
        }
        Sd.d h11 = Zd.e.h(interfaceC9839e);
        if (!h11.f()) {
            return null;
        }
        int i11 = C9661c.f98575o;
        Sd.b k11 = C9661c.k(h11);
        if (k11 == null || (a11 = k11.a()) == null) {
            return null;
        }
        InterfaceC9839e b11 = C9851q.b(l().a(), a11, Bd.c.FROM_BUILTINS);
        if (b11 instanceof C3085o) {
            return (C3085o) b11;
        }
        return null;
    }

    private final C9669k.b l() {
        return (C9669k.b) ie.n.a(this.f98612b, f98610h[0]);
    }

    @Override // vd.InterfaceC10304a
    @NotNull
    public final Collection<je.N> a(@NotNull InterfaceC9839e classDescriptor) {
        boolean z11 = false;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Sd.d fqName = Zd.e.h(classDescriptor);
        int i11 = z.f98630h;
        boolean h11 = z.h(fqName);
        Y y11 = this.f98613c;
        if (h11) {
            return C7714v.b0((Y) ie.n.a(this.f98614d, f98610h[1]), y11);
        }
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (z.h(fqName)) {
            z11 = true;
        } else {
            int i12 = C9661c.f98575o;
            Sd.b k11 = C9661c.k(fqName);
            if (k11 != null) {
                try {
                    z11 = Serializable.class.isAssignableFrom(Class.forName(k11.a().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return z11 ? C7714v.a0(y11) : K.f71697a;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x024c A[SYNTHETIC] */
    @Override // vd.InterfaceC10304a
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<c0> b(@NotNull Sd.f name, @NotNull InterfaceC9839e mutable) {
        Sd.f fVar;
        List h11;
        Iterable<c0> iterable;
        boolean booleanValue;
        Sd.f fVar2;
        Sd.f fVar3;
        InterfaceC10030h invoke;
        Sd.f fVar4;
        boolean z11 = false;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mutable, "classDescriptor");
        fVar = C9659a.f98558e;
        boolean d11 = Intrinsics.d(name, fVar);
        kotlin.reflect.m<Object>[] mVarArr = f98610h;
        if (d11 && (mutable instanceof he.n) && qd.m.T(mutable)) {
            he.n nVar = (he.n) mutable;
            List<Nd.h> v02 = nVar.Q0().v0();
            Intrinsics.checkNotNullExpressionValue(v02, "getFunctionList(...)");
            List<Nd.h> list = v02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Sd.f b11 = fe.L.b(nVar.P0().g(), ((Nd.h) it.next()).X());
                    fVar4 = C9659a.f98558e;
                    if (b11.equals(fVar4)) {
                        return K.f71697a;
                    }
                }
            }
            InterfaceC9857w.a<? extends InterfaceC9857w> U10 = ((c0) C7714v.A0(((Y) ie.n.a(this.f98614d, mVarArr[1])).p().g(name, Bd.c.FROM_BUILTINS))).U();
            U10.q(nVar);
            U10.n(C9852r.f99403e);
            U10.e(nVar.q());
            U10.h(nVar.W());
            InterfaceC9857w build = U10.build();
            Intrinsics.f(build);
            return C7714v.a0((c0) build);
        }
        l().getClass();
        p pVar = new p(name);
        C3085o k11 = k(mutable);
        if (k11 == null) {
            iterable = K.f71697a;
        } else {
            Sd.c fqName = Zd.e.g(k11);
            int i11 = C9660b.f98560g;
            qd.m builtIns = C9660b.a.a();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            InterfaceC9839e b12 = C9662d.b(fqName, builtIns);
            if (b12 == null) {
                h11 = M.f71699a;
            } else {
                int i12 = C9661c.f98575o;
                Sd.c m11 = C9661c.m(Zd.e.h(b12));
                h11 = m11 == null ? e0.h(b12) : C7714v.b0(b12, builtIns.o(m11));
            }
            Iterable iterable2 = h11;
            InterfaceC9839e interfaceC9839e = (InterfaceC9839e) C7714v.Y(iterable2);
            if (interfaceC9839e == null) {
                iterable = K.f71697a;
            } else {
                int i13 = te.i.f99457c;
                ArrayList set = new ArrayList(C7714v.z(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    set.add(Zd.e.g((InterfaceC9839e) it2.next()));
                }
                Intrinsics.checkNotNullParameter(set, "set");
                te.i iVar = new te.i();
                iVar.addAll(set);
                Intrinsics.checkNotNullParameter(mutable, "mutable");
                int i14 = C9661c.f98575o;
                boolean h12 = C9661c.h(Vd.i.k(mutable));
                ce.l I11 = ((InterfaceC9839e) this.f98615e.a(Zd.e.g(k11), new q(k11, interfaceC9839e))).I();
                Intrinsics.checkNotNullExpressionValue(I11, "getUnsubstitutedMemberScope(...)");
                Iterable iterable3 = (Iterable) pVar.invoke(I11);
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable3) {
                    c0 c0Var = (c0) obj;
                    if (c0Var.getKind() == InterfaceC9836b.a.DECLARATION && c0Var.getVisibility().a().c() && !qd.m.Z(c0Var)) {
                        Collection<? extends InterfaceC9836b> o11 = c0Var.o();
                        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
                        Collection<? extends InterfaceC9836b> collection = o11;
                        if (!(collection instanceof Collection) || !collection.isEmpty()) {
                            Iterator<T> it3 = collection.iterator();
                            while (it3.hasNext()) {
                                InterfaceC9845k d12 = ((InterfaceC9857w) it3.next()).d();
                                Intrinsics.checkNotNullExpressionValue(d12, "getContainingDeclaration(...)");
                                if (iVar.contains(Zd.e.g(d12))) {
                                    break;
                                }
                            }
                        }
                        InterfaceC9845k d13 = c0Var.d();
                        Intrinsics.g(d13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        String a11 = D.a(c0Var, 3);
                        int i15 = z.f98630h;
                        if (z.e().contains(C.a((InterfaceC9839e) d13, a11)) ^ h12) {
                            booleanValue = true;
                        } else {
                            Boolean d14 = te.b.d(C7714v.a0(c0Var), r.f98607a, new s(this));
                            Intrinsics.checkNotNullExpressionValue(d14, "ifAny(...)");
                            booleanValue = d14.booleanValue();
                        }
                        if (!booleanValue) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (z11) {
                        arrayList.add(obj);
                    }
                    z11 = false;
                }
                iterable = arrayList;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (c0 c0Var2 : iterable) {
            InterfaceC9845k d15 = c0Var2.d();
            Intrinsics.g(d15, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            InterfaceC9857w b22 = c0Var2.b2(C9658A.a((InterfaceC9839e) d15, mutable).c());
            Intrinsics.g(b22, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            InterfaceC9857w.a<? extends InterfaceC9857w> U11 = ((c0) b22).U();
            U11.q(mutable);
            U11.h(mutable.W());
            U11.d();
            InterfaceC9845k d16 = c0Var2.d();
            Intrinsics.g(d16, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object b13 = te.b.b(C7714v.a0((InterfaceC9839e) d16), new t(this), new w(D.a(c0Var2, 3), new kotlin.jvm.internal.M()));
            Intrinsics.checkNotNullExpressionValue(b13, "dfs(...)");
            int i16 = b.f98618a[((a) b13).ordinal()];
            c0 c0Var3 = null;
            if (i16 != 1) {
                if (i16 == 2) {
                    Sd.f name2 = c0Var2.getName();
                    fVar2 = x.f98621a;
                    boolean d17 = Intrinsics.d(name2, fVar2);
                    InterfaceC7059h<Pair<String, String>, InterfaceC10030h> interfaceC7059h = this.f98617g;
                    if (d17) {
                        invoke = interfaceC7059h.invoke(new Pair(c0Var2.getName().b(), "first"));
                    } else {
                        fVar3 = x.f98622b;
                        if (!Intrinsics.d(name2, fVar3)) {
                            throw new IllegalStateException(("Unexpected name: " + c0Var2.getName()).toString());
                        }
                        invoke = interfaceC7059h.invoke(new Pair(c0Var2.getName().b(), "last"));
                    }
                    U11.m(invoke);
                } else if (i16 != 3) {
                    if (i16 != 4) {
                        if (i16 != 5) {
                            throw new Sc.o();
                        }
                        Unit unit = Unit.f71690a;
                    }
                    if (c0Var3 != null) {
                        arrayList2.add(c0Var3);
                    }
                } else {
                    U11.m((InterfaceC10030h) ie.n.a(this.f98616f, mVarArr[2]));
                }
                InterfaceC9857w build2 = U11.build();
                Intrinsics.f(build2);
                c0Var3 = (c0) build2;
                if (c0Var3 != null) {
                }
            } else {
                if (!C9813D.a(mutable)) {
                    U11.j();
                    InterfaceC9857w build22 = U11.build();
                    Intrinsics.f(build22);
                    c0Var3 = (c0) build22;
                }
                if (c0Var3 != null) {
                }
            }
        }
        return arrayList2;
    }

    @Override // vd.InterfaceC10304a
    @NotNull
    public final Collection c(@NotNull he.n classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != EnumC9840f.CLASS) {
            return K.f71697a;
        }
        l().getClass();
        C3085o k11 = k(classDescriptor);
        if (k11 == null) {
            return K.f71697a;
        }
        Sd.c g10 = Zd.e.g(k11);
        int i11 = C9660b.f98560g;
        InterfaceC9839e b11 = C9662d.b(g10, C9660b.a.a());
        if (b11 == null) {
            return K.f71697a;
        }
        F0 c11 = C9658A.a(b11, k11).c();
        List<InterfaceC9838d> l11 = k11.l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : l11) {
            InterfaceC9838d interfaceC9838d = (InterfaceC9838d) obj;
            if (interfaceC9838d.getVisibility().a().c()) {
                Collection<InterfaceC9838d> l12 = b11.l();
                Intrinsics.checkNotNullExpressionValue(l12, "getConstructors(...)");
                Collection<InterfaceC9838d> collection = l12;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (InterfaceC9838d interfaceC9838d2 : collection) {
                        Intrinsics.f(interfaceC9838d2);
                        if (Vd.n.l(interfaceC9838d2, interfaceC9838d.b2(c11)) == n.c.a.OVERRIDABLE) {
                            break;
                        }
                    }
                }
                if (interfaceC9838d.f().size() == 1) {
                    List<p0> f7 = interfaceC9838d.f();
                    Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
                    InterfaceC9842h p11 = ((p0) C7714v.B0(f7)).getType().H0().p();
                    if (Intrinsics.d(p11 != null ? Zd.e.h(p11) : null, Zd.e.h(classDescriptor))) {
                    }
                }
                if (!qd.m.Z(interfaceC9838d)) {
                    int i12 = z.f98630h;
                    if (!z.c().contains(C.a(k11, D.a(interfaceC9838d, 3)))) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC9838d interfaceC9838d3 = (InterfaceC9838d) it.next();
            InterfaceC9857w.a<? extends InterfaceC9857w> U10 = interfaceC9838d3.U();
            U10.q(classDescriptor);
            U10.e(classDescriptor.q());
            U10.d();
            U10.p(c11.h());
            int i13 = z.f98630h;
            if (!z.f().contains(C.a(k11, D.a(interfaceC9838d3, 3)))) {
                U10.m((InterfaceC10030h) ie.n.a(this.f98616f, f98610h[2]));
            }
            InterfaceC9857w build = U10.build();
            Intrinsics.g(build, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((InterfaceC9838d) build);
        }
        return arrayList2;
    }

    @Override // vd.InterfaceC10306c
    public final boolean d(@NotNull InterfaceC9839e classDescriptor, @NotNull C6926H functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        C3085o k11 = k(classDescriptor);
        if (k11 == null || !functionDescriptor.getAnnotations().K0(C10307d.a())) {
            return true;
        }
        l().getClass();
        String a11 = D.a(functionDescriptor, 3);
        C3070B O02 = k11.O0();
        Sd.f name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection<c0> g10 = O02.g(name, Bd.c.FROM_BUILTINS);
        if ((g10 instanceof Collection) && g10.isEmpty()) {
            return false;
        }
        Iterator<T> it = g10.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(D.a((c0) it.next(), 3), a11)) {
                return true;
            }
        }
        return false;
    }

    @Override // vd.InterfaceC10304a
    public final Collection e(InterfaceC9839e classDescriptor) {
        Set<Sd.f> set;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        l().getClass();
        C3085o k11 = k(classDescriptor);
        if (k11 == null || (set = k11.O0().a()) == null) {
            set = M.f71699a;
        }
        return set;
    }
}
