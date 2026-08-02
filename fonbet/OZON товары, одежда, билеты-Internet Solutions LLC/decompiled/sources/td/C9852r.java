package td;

import de.InterfaceC6188g;
import de.InterfaceC6189h;
import de.InterfaceC6190i;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.Set;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.InterfaceC9044o;
import td.r0;
import te.C9865a;

/* renamed from: td.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9852r {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99399a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99400b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99401c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99402d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99403e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99404f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99405g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99406h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public static final AbstractC9853s f99407i;

    /* renamed from: j, reason: collision with root package name */
    public static final Set<AbstractC9853s> f99408j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<AbstractC9853s, Integer> f99409k;

    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC9853s f99410l;

    /* renamed from: m, reason: collision with root package name */
    private static final InterfaceC6188g f99411m;

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC6188g f99412n;

    /* renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final InterfaceC6188g f99413o;

    /* renamed from: p, reason: collision with root package name */
    @NotNull
    private static final InterfaceC9044o f99414p;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private static final HashMap f99415q;

    /* renamed from: td.r$a */
    static class a implements InterfaceC6188g {
        @Override // de.InterfaceC6188g
        @NotNull
        public final je.N getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: td.r$b */
    static class b implements InterfaceC6188g {
        @Override // de.InterfaceC6188g
        @NotNull
        public final je.N getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: td.r$c */
    static class c implements InterfaceC6188g {
        @Override // de.InterfaceC6188g
        @NotNull
        public final je.N getType() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* renamed from: td.r$d */
    static class d extends AbstractC9850p {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [td.k, td.o] */
        /* JADX WARN: Type inference failed for: r4v6, types: [td.k] */
        /* JADX WARN: Type inference failed for: r4v7, types: [td.k] */
        /* JADX WARN: Type inference failed for: r4v9, types: [td.k] */
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
            }
            if (Vd.i.D(interfaceC9849o) && Vd.i.h(interfaceC9845k) != e0.f99393a) {
                return C9852r.f(interfaceC9849o, interfaceC9845k);
            }
            if (interfaceC9849o instanceof InterfaceC9844j) {
                ((InterfaceC9844j) interfaceC9849o).d();
            }
            while (interfaceC9849o != 0) {
                interfaceC9849o = interfaceC9849o.d();
                if (((interfaceC9849o instanceof InterfaceC9839e) && !Vd.i.s(interfaceC9849o)) || (interfaceC9849o instanceof InterfaceC9820K)) {
                    break;
                }
            }
            if (interfaceC9849o == 0) {
                return false;
            }
            while (interfaceC9845k != null) {
                if (interfaceC9849o == interfaceC9845k) {
                    return true;
                }
                if (interfaceC9845k instanceof InterfaceC9820K) {
                    return (interfaceC9849o instanceof InterfaceC9820K) && interfaceC9849o.c().equals(((InterfaceC9820K) interfaceC9845k).c()) && Vd.i.e(interfaceC9845k).equals(Vd.i.e(interfaceC9849o));
                }
                interfaceC9845k = interfaceC9845k.d();
            }
            return false;
        }
    }

    /* renamed from: td.r$e */
    static class e extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            InterfaceC9845k n11;
            if (interfaceC9845k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
            }
            if (!C9852r.f99399a.c(interfaceC6188g, interfaceC9849o, interfaceC9845k)) {
                return false;
            }
            if (interfaceC6188g == C9852r.f99412n) {
                return true;
            }
            if (interfaceC6188g == C9852r.f99411m || (n11 = Vd.i.n(interfaceC9849o, InterfaceC9839e.class, true)) == null || !(interfaceC6188g instanceof InterfaceC6190i)) {
                return false;
            }
            return ((InterfaceC6190i) interfaceC6188g).i().n0().equals(n11.n0());
        }
    }

    /* renamed from: td.r$f */
    static class f extends AbstractC9850p {
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
        
            if (je.C7357B.a(r0) == false) goto L45;
         */
        @Override // td.AbstractC9853s
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            InterfaceC9839e interfaceC9839e;
            if (interfaceC9845k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
            }
            InterfaceC9839e interfaceC9839e2 = (InterfaceC9839e) Vd.i.n(interfaceC9849o, InterfaceC9839e.class, true);
            InterfaceC9839e interfaceC9839e3 = (InterfaceC9839e) Vd.i.n(interfaceC9845k, InterfaceC9839e.class, false);
            if (interfaceC9839e3 != null) {
                if (interfaceC9839e2 == null || !Vd.i.s(interfaceC9839e2) || (interfaceC9839e = (InterfaceC9839e) Vd.i.n(interfaceC9839e2, InterfaceC9839e.class, true)) == null || !Vd.i.B(interfaceC9839e3, interfaceC9839e)) {
                    InterfaceC9849o G11 = Vd.i.G(interfaceC9849o);
                    InterfaceC9839e interfaceC9839e4 = (InterfaceC9839e) Vd.i.n(G11, InterfaceC9839e.class, true);
                    if (interfaceC9839e4 != null) {
                        if (Vd.i.B(interfaceC9839e3, interfaceC9839e4) && interfaceC6188g != C9852r.f99413o) {
                            if ((G11 instanceof InterfaceC9836b) && !(G11 instanceof InterfaceC9844j) && interfaceC6188g != C9852r.f99412n) {
                                if (interfaceC6188g != C9852r.f99411m && interfaceC6188g != null) {
                                    if (!(interfaceC6188g instanceof InterfaceC6189h)) {
                                        ((b) interfaceC6188g).getType();
                                        throw null;
                                    }
                                    je.N b11 = ((InterfaceC6189h) interfaceC6188g).b();
                                    if (!Vd.i.C(b11, interfaceC9839e3)) {
                                    }
                                }
                            }
                        }
                        return c(interfaceC6188g, interfaceC9849o, interfaceC9839e3.d());
                    }
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: td.r$g */
    static class g extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
            }
            if (!Vd.i.e(interfaceC9845k).D0(Vd.i.e(interfaceC9849o))) {
                return false;
            }
            C9852r.f99414p.a(interfaceC9849o, interfaceC9845k);
            return true;
        }
    }

    /* renamed from: td.r$h */
    static class h extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k != null) {
                return true;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
        }
    }

    /* renamed from: td.r$i */
    static class i extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* renamed from: td.r$j */
    static class j extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* renamed from: td.r$k */
    static class k extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
        }
    }

    /* renamed from: td.r$l */
    static class l extends AbstractC9850p {
        @Override // td.AbstractC9853s
        public final boolean c(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
            if (interfaceC9845k != null) {
                return false;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
        }
    }

    static {
        d dVar = new d(r0.e.f99422c);
        f99399a = dVar;
        e eVar = new e(r0.f.f99423c);
        f99400b = eVar;
        f fVar = new f(r0.g.f99424c);
        f99401c = fVar;
        g gVar = new g(r0.b.f99419c);
        f99402d = gVar;
        h hVar = new h(r0.h.f99425c);
        f99403e = hVar;
        i iVar = new i(r0.d.f99421c);
        f99404f = iVar;
        j jVar = new j(r0.a.f99418c);
        f99405g = jVar;
        k kVar = new k(r0.c.f99420c);
        f99406h = kVar;
        l lVar = new l(r0.i.f99426c);
        f99407i = lVar;
        AbstractC9853s[] elements = {dVar, eVar, gVar, iVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f99408j = Collections.unmodifiableSet(C7705l.j0(elements));
        HashMap c11 = C9865a.c(4);
        c11.put(eVar, 0);
        c11.put(dVar, 0);
        c11.put(gVar, 1);
        c11.put(fVar, 1);
        c11.put(hVar, 2);
        f99409k = Collections.unmodifiableMap(c11);
        f99410l = hVar;
        f99411m = new a();
        f99412n = new b();
        f99413o = new c();
        try {
            Iterator it = Arrays.asList(new InterfaceC9044o[0]).iterator();
            f99414p = it.hasNext() ? (InterfaceC9044o) it.next() : InterfaceC9044o.a.f81967a;
            f99415q = new HashMap();
            i(dVar);
            i(eVar);
            i(fVar);
            i(gVar);
            i(hVar);
            i(iVar);
            i(jVar);
            i(kVar);
            i(lVar);
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void a(int i11) {
        String str = i11 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 16 ? 3 : 2];
        if (i11 != 1 && i11 != 3 && i11 != 5 && i11 != 7) {
            switch (i11) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i11 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i11) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i11 != 16) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "from";
        if (i11 == 16) {
        }
        switch (i11) {
        }
        String format2 = String.format(str, objArr);
        if (i11 != 16) {
        }
    }

    public static Integer d(@NotNull AbstractC9853s visibility, @NotNull AbstractC9853s visibility2) {
        if (visibility == null) {
            a(12);
            throw null;
        }
        if (visibility2 == null) {
            a(13);
            throw null;
        }
        Intrinsics.checkNotNullParameter(visibility2, "visibility");
        Integer a11 = visibility.a().a(visibility2.a());
        if (a11 != null) {
            return a11;
        }
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Integer a12 = visibility2.a().a(visibility.a());
        if (a12 != null) {
            return Integer.valueOf(-a12.intValue());
        }
        return null;
    }

    public static InterfaceC9849o e(InterfaceC6188g interfaceC6188g, @NotNull InterfaceC9836b interfaceC9836b, @NotNull InterfaceC9845k interfaceC9845k) {
        InterfaceC9849o e11;
        if (interfaceC9836b == null) {
            a(8);
            throw null;
        }
        if (interfaceC9845k == null) {
            a(9);
            throw null;
        }
        for (InterfaceC9849o interfaceC9849o = (InterfaceC9849o) interfaceC9836b.n0(); interfaceC9849o != null && interfaceC9849o.getVisibility() != f99404f; interfaceC9849o = (InterfaceC9849o) Vd.i.n(interfaceC9849o, InterfaceC9849o.class, true)) {
            if (!interfaceC9849o.getVisibility().c(interfaceC6188g, interfaceC9849o, interfaceC9845k)) {
                return interfaceC9849o;
            }
        }
        if (!(interfaceC9836b instanceof wd.X) || (e11 = e(interfaceC6188g, ((wd.X) interfaceC9836b).E(), interfaceC9845k)) == null) {
            return null;
        }
        return e11;
    }

    public static boolean f(@NotNull InterfaceC9849o interfaceC9849o, @NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9845k == null) {
            a(7);
            throw null;
        }
        e0 h11 = Vd.i.h(interfaceC9845k);
        if (h11 != e0.f99393a) {
            return h11.equals(Vd.i.h(interfaceC9849o));
        }
        return false;
    }

    public static boolean g(@NotNull AbstractC9853s abstractC9853s) {
        if (abstractC9853s != null) {
            return abstractC9853s == f99399a || abstractC9853s == f99400b;
        }
        a(14);
        throw null;
    }

    public static boolean h(@NotNull InterfaceC9836b interfaceC9836b, @NotNull InterfaceC9845k interfaceC9845k) {
        if (interfaceC9836b == null) {
            a(2);
            throw null;
        }
        if (interfaceC9845k != null) {
            return e(f99412n, interfaceC9836b, interfaceC9845k) == null;
        }
        a(3);
        throw null;
    }

    private static void i(AbstractC9850p abstractC9850p) {
        f99415q.put(abstractC9850p.a(), abstractC9850p);
    }

    @NotNull
    public static AbstractC9853s j(@NotNull s0 s0Var) {
        if (s0Var == null) {
            a(15);
            throw null;
        }
        AbstractC9853s abstractC9853s = (AbstractC9853s) f99415q.get(s0Var);
        if (abstractC9853s != null) {
            return abstractC9853s;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + s0Var);
    }
}
