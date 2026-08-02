package h10;

import A00.a;
import A00.e;
import Bl0.C2645f;
import QZ.g;
import R00.b;
import Sc.o;
import T00.j;
import T00.m;
import WZ.l;
import a10.C4916d;
import f20.C6408c;
import g20.C6615a;
import i10.C6997c;
import i10.InterfaceC6995a;
import i10.h;
import i10.k;
import i10.l;
import i20.C7002a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import m20.InterfaceC8047b;
import org.jetbrains.annotations.NotNull;
import z00.C10970a;
import z00.f;
import z00.h;

/* renamed from: h10.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6782d<I extends C7854a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Collection<g> f64612a;

    /* renamed from: b, reason: collision with root package name */
    private final RZ.a f64613b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final I00.a<I> f64614c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<I> f64615d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final A00.b f64616e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<AbstractC6779a<I, ? extends InterfaceC6995a>> f64617f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final C2645f f64618g;

    public C6782d(@NotNull Collection interceptors, RZ.a aVar, @NotNull I00.a mapper, @NotNull h pageIssueFactory, @NotNull A00.b eventLoadingCallback, @NotNull List additionalStateReducers, @NotNull C2645f metricsTimeProvider) {
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(pageIssueFactory, "pageIssueFactory");
        Intrinsics.checkNotNullParameter(eventLoadingCallback, "eventLoadingCallback");
        Intrinsics.checkNotNullParameter(additionalStateReducers, "additionalStateReducers");
        Intrinsics.checkNotNullParameter(metricsTimeProvider, "metricsTimeProvider");
        this.f64612a = interceptors;
        this.f64613b = aVar;
        this.f64614c = mapper;
        this.f64615d = pageIssueFactory;
        this.f64616e = eventLoadingCallback;
        this.f64617f = additionalStateReducers;
        this.f64618g = metricsTimeProvider;
    }

    private final k.a<I> a(a.p pVar, C6997c<I> c6997c, k.a<I> aVar, Throwable th2) {
        m mVar;
        mVar = C6408c.f62493a;
        return k.a.b(aVar, null, null, this.f64614c.b(new j(mVar, this.f64615d.createIssue(pVar, c6997c, th2))), 3);
    }

    private static C6997c b(a.x xVar, C6997c c6997c) {
        k.a<I> e11 = c6997c.e();
        if (e11 != null) {
            List<I> a11 = e11.a();
            ArrayList i11 = i(a11, xVar.d());
            if (i11.size() != a11.size()) {
                e11 = k.a.b(e11, i11, null, null, 6);
            }
        }
        k.a<I> aVar = e11;
        k.b<I> h11 = c6997c.h();
        if (h11 != null) {
            List<I> a12 = h11.a();
            ArrayList items = i(a12, xVar.d());
            if (items.size() != a12.size()) {
                Intrinsics.checkNotNullParameter(items, "items");
                h11 = new k.b<>(items);
            }
        }
        return C6997c.c(c6997c, aVar, h11, null, null, null, null, false, false, 0L, null, null, null, 65532);
    }

    private final C6997c<I> c(A00.d<? extends C7854a> dVar, C6997c<I> c6997c) {
        i10.h a11;
        C7854a c7854a;
        l20.d c11;
        T00.a b11;
        List<I> a12;
        k.a<I> e11 = c6997c.e();
        ArrayList W02 = (e11 == null || (a12 = e11.a()) == null) ? null : C7714v.W0(a12);
        Integer d11 = (W02 == null || (c7854a = (C7854a) C7714v.Z(W02)) == null || (c11 = c7854a.c()) == null || (b11 = c11.b()) == null) ? null : b11.d();
        if (d11 != null && dVar.d().getF71843b() <= d11.intValue()) {
            ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.DEBUG;
            if (H00.b.c()) {
                H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", "Start replace pages " + dVar), "ComposerReducer", null, Boolean.TRUE);
            }
            ArrayList a13 = C7002a.a(c6997c.e().a(), dVar);
            if (a13 != null) {
                if (H00.b.c()) {
                    H00.b.b().e(cVar, Pk0.g.c(Thread.currentThread(), ": ", Ej.b.a(a13.size(), "returning new result list items.size - ")), "ComposerReducer", null, Boolean.TRUE);
                }
                List<P00.k<? extends C7854a>> e12 = dVar.e();
                P00.k kVar = (P00.k) C7714v.M(e12);
                boolean z11 = dVar.d().getF71842a() == 1;
                k.b<I> h11 = c6997c.h();
                RZ.a aVar = this.f64613b;
                l f7 = aVar != null ? aVar.f() : null;
                if (f7 != null) {
                    f7.a();
                }
                Iterator<T> it = e12.iterator();
                while (it.hasNext()) {
                    P00.k kVar2 = (P00.k) it.next();
                    l f11 = aVar != null ? aVar.f() : null;
                    if (f11 != null) {
                        f11.b(kVar2.b().d());
                        f11.c(kVar2.b().b());
                        f11.g(kVar2.b().c());
                    }
                }
                if (z11 && kVar != null) {
                    ru.ozon.android.ozonLogger.core.c cVar2 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                    if (H00.b.c()) {
                        H00.b.b().e(cVar2, Thread.currentThread() + ": Adding overlay items if not empty", "ComposerReducer", null, Boolean.TRUE);
                    }
                    h11 = new k.b<>(e(kVar));
                }
                k.b<I> bVar = h11;
                if (dVar.f() == null) {
                    a11 = c6997c.l();
                } else {
                    ru.ozon.android.ozonLogger.core.c cVar3 = ru.ozon.android.ozonLogger.core.c.DEBUG;
                    if (H00.b.c()) {
                        H00.b.b().e(cVar3, Pk0.g.c(Thread.currentThread(), ": ", "set scroll event " + dVar.f()), "ComposerReducer", null, Boolean.TRUE);
                    }
                    a11 = i10.h.a(c6997c.l(), null, null, null, null, new h.b(dVar.f()), 31);
                }
                i10.h hVar = a11;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = a13.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((C7854a) next).k() != ru.ozon.composer.ui.widget.c.f94864a) {
                        arrayList.add(next);
                    }
                }
                return C6997c.c(c6997c, new k.a(14, null, arrayList), bVar, null, hVar, null, null, false, false, 0L, null, null, null, 65524);
            }
            if (H00.b.c()) {
                H00.b.b().e(cVar, Thread.currentThread() + ": Replace pages event not executed", "ComposerReducer", null, Boolean.TRUE);
                return c6997c;
            }
        }
        return c6997c;
    }

    private static ArrayList d(P00.k kVar) {
        List<I> d11 = kVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d11) {
            if (((C7854a) obj).k() != ru.ozon.composer.ui.widget.c.f94864a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static ArrayList e(P00.k kVar) {
        List<I> d11 = kVar.d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d11) {
            if (((C7854a) obj).k() == ru.ozon.composer.ui.widget.c.f94864a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static k.b f(a.C2369j c2369j, List list, Set set) {
        ArrayList e11 = e(c2369j.b());
        HashSet hashSet = new HashSet();
        Iterator it = e11.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(((C7854a) it.next()).f()));
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C7854a c7854a = (C7854a) obj;
            if ((c7854a.d() instanceof E00.b) || (!hashSet.contains(Long.valueOf(c7854a.f())) && set.contains(c7854a.c().a()))) {
                arrayList.add(obj);
            }
        }
        return new k.b(C7714v.p0(j(arrayList), e11));
    }

    private static k.a h(C6997c c6997c) {
        I c11;
        k.a<I> e11 = c6997c.e();
        return ((e11 == null || (c11 = e11.c()) == null) ? null : c11.d()) instanceof g20.b ? k.a.b(e11, null, null, null, 11) : e11;
    }

    private static ArrayList i(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C7854a c7854a = (C7854a) obj;
            if (!set.contains(Long.valueOf(c7854a.f())) && !set.contains(c7854a.c().d())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private static ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7854a c7854a = (C7854a) it.next();
            l20.d c11 = c7854a.c();
            if (c11.c().l()) {
                arrayList2.add(c7854a);
            } else {
                arrayList2.add(c7854a.b(l20.b.a(c7854a.i(), null, new l20.d(c11.c().o(), c11.b()), null, 239)));
            }
        }
        return arrayList2;
    }

    private final List<I> k(k<I> kVar, a.M m11) {
        Object obj;
        Iterator<T> it = kVar.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C7854a c7854a = (C7854a) obj;
            if (c7854a.f() == m11.f().f() && c7854a.j() == m11.f().j() && Intrinsics.d(c7854a.c(), m11.f().c())) {
                break;
            }
        }
        C7854a c7854a2 = (C7854a) obj;
        if (c7854a2 == null) {
            return K.f71697a;
        }
        Map<String, List<C7854a>> g10 = c7854a2.g();
        String e11 = m11.e();
        List<C7854a> list = g10 != null ? g10.get(e11) : null;
        if (!(list instanceof List)) {
            list = null;
        }
        List<C7854a> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return K.f71697a;
        }
        ArrayList c11 = this.f64614c.c(m11.d(), list);
        if (c11 == null) {
            return K.f71697a;
        }
        Tc.d builder = new Tc.d();
        builder.putAll(g10);
        builder.put(e11, c11);
        Intrinsics.checkNotNullParameter(builder, "builder");
        Tc.d u11 = builder.u();
        List<I> a11 = kVar.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        for (I i11 : a11) {
            if (i11 == c7854a2) {
                i11 = i11.b(l20.b.a(i11.i(), null, null, u11, 191));
            }
            arrayList.add(i11);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x051b, code lost:
    
        if (r11.g() == true) goto L162;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C6997c<I> g(@NotNull A00.a event, @NotNull C6997c<I> state) {
        C6997c<I> c6997c;
        List<I> k11;
        List<I> items;
        ArrayList items2;
        ArrayList c11;
        boolean z11;
        i10.j jVar;
        List<I> list;
        k.b<I> bVar;
        f fVar;
        boolean z12;
        i10.f fVar2;
        boolean z13;
        boolean z14;
        l f7;
        a.o oVar;
        h.c cVar;
        List<String> list2;
        T00.a aVar;
        K k12;
        long currentTimeMillis;
        f.c cVar2;
        k.a aVar2;
        T00.a aVar3;
        List<I> list3;
        C6997c<I> c12;
        List<I> arrayList;
        T00.a m11;
        C6997c<I> c6997c2;
        List<I> a11;
        int i11;
        e b11;
        m mVar;
        List<I> a12;
        m mVar2;
        T00.a aVar4;
        C6997c c13;
        C6997c c6997c3;
        Object obj;
        Map<String, Object> g10;
        ConcurrentHashMap<String, Object> e11;
        i10.l a13;
        T00.a aVar5;
        l.a loaderType;
        e b12;
        e b13;
        boolean z15;
        h.c cVar3;
        T00.a aVar6;
        T00.a aVar7;
        C6782d<I> c6782d = this;
        RZ.a aVar8 = c6782d.f64613b;
        I00.a<I> aVar9 = c6782d.f64614c;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(state, "state");
        i10.j o11 = state.o();
        i10.h l11 = state.l();
        if (event instanceof a.H) {
            Intrinsics.g(event, "null cannot be cast to non-null type ru.ozon.composer.event.ComposerEvent.ShowInitialWidgets<I of ru.ozon.composer.reducer.ReducerImpl>");
            a.H h11 = (a.H) event;
            if (state.r()) {
                T00.a m12 = state.m();
                aVar7 = T00.a.f26425n;
                if (Intrinsics.d(m12, aVar7) && (!h11.d().isEmpty() || !h11.e().isEmpty())) {
                    c6997c = C6997c.c(state, new k.a(14, null, h11.d()), new k.b(h11.e()), i10.j.a(state.o(), null, i10.l.a(state.o().b(), false, false, 4), false, false, null, 29), null, null, null, false, false, 0L, null, null, null, 65528);
                    c6997c2 = c6997c;
                }
            }
            c6997c2 = state;
        } else {
            boolean z16 = event instanceof a.u;
            C2645f c2645f = c6782d.f64618g;
            if (z16) {
                a.u uVar = (a.u) event;
                if (uVar instanceof a.u.C0013a) {
                    Collection<g> collection = c6782d.f64612a;
                    i10.h l12 = state.l();
                    Iterator<T> it = collection.iterator();
                    i10.h hVar = l12;
                    while (it.hasNext()) {
                        hVar = ((g) it.next()).onInit(hVar);
                    }
                    boolean q11 = state.q();
                    h.c d11 = hVar.d();
                    if (d11 instanceof h.c.a) {
                        h.c.a aVar10 = (h.c.a) d11;
                        cVar3 = new h.c.a(B00.a.a(aVar10.f()), B00.a.a(aVar10.e()), B00.a.a(aVar10.f()), aVar10.d());
                        z15 = false;
                    } else {
                        z15 = q11;
                        cVar3 = d11;
                    }
                    i10.j a14 = i10.j.a(state.o(), null, i10.l.a(state.o().b(), true, false, 6), false, false, null, 28);
                    aVar6 = T00.a.f26425n;
                    c6997c3 = C6997c.c(state, null, null, a14, i10.h.a(hVar, cVar3, null, null, null, null, 62), aVar6, K.f71697a, z15, false, 0L, null, null, null, 57219);
                } else {
                    if (uVar instanceof a.u.b) {
                        a.u.b bVar2 = (a.u.b) uVar;
                        i10.j o12 = state.o();
                        i10.h l13 = state.l();
                        h.c d12 = l13.d();
                        if (bVar2.e() != null) {
                            d12 = new h.c.b(bVar2.e());
                        } else {
                            if (bVar2.j() != null) {
                                String a15 = B00.a.a(bVar2.j());
                                if (d12 instanceof h.c.a) {
                                    d12 = h.c.a.b((h.c.a) d12, a15, a15, a15, 8);
                                } else {
                                    obj = null;
                                    d12 = new h.c.a(a15, (String) null, (String) null, 14);
                                }
                            } else {
                                obj = null;
                                if (d12 instanceof h.c.a) {
                                    h.c.a aVar11 = (h.c.a) d12;
                                    d12 = h.c.a.b(aVar11, null, null, B00.a.a(aVar11.e()), 11);
                                }
                            }
                            Map<String, Object> f11 = bVar2.f();
                            h.a aVar12 = f11 == null ? new h.a(f11, i10.g.POST) : l13.b();
                            g10 = bVar2.g();
                            int i12 = a.u.b.f244j;
                            if (g10 == a.u.b.C0014a.a()) {
                                e11 = new ConcurrentHashMap<>();
                                Map<String, Object> g11 = bVar2.g();
                                if (g11 != null) {
                                    e11.putAll(g11);
                                }
                            } else {
                                e11 = l13.e();
                            }
                            h.b h12 = bVar2.h();
                            h.b c14 = (h12 != null || (b13 = h12.b()) == null) ? l13.c() : new h.b(b13);
                            boolean h13 = (c14 != null || (b12 = c14.b()) == null) ? false : b12.h();
                            if (bVar2.i()) {
                                i10.l b14 = o12.b();
                                h.b h14 = bVar2.h();
                                if (h14 == null || (loaderType = h14.a()) == null) {
                                    loaderType = o12.b().b();
                                }
                                b14.getClass();
                                Intrinsics.checkNotNullParameter(loaderType, "loaderType");
                                a13 = new i10.l(true, h13, loaderType);
                            } else {
                                a13 = i10.l.a(o12.b(), false, h13, 5);
                            }
                            i10.j a16 = i10.j.a(o12, null, a13, false, false, null, 28);
                            i10.h a17 = i10.h.a(l13, d12, null, e11, aVar12, c14, 10);
                            aVar5 = T00.a.f26425n;
                            c13 = C6997c.c(state, null, null, a16, a17, aVar5, K.f71697a, false, false, 0L, null, null, null, 57283);
                        }
                        obj = null;
                        Map<String, Object> f112 = bVar2.f();
                        if (f112 == null) {
                        }
                        g10 = bVar2.g();
                        int i122 = a.u.b.f244j;
                        if (g10 == a.u.b.C0014a.a()) {
                        }
                        h.b h122 = bVar2.h();
                        if (h122 != null) {
                        }
                        if (c14 != null) {
                        }
                        if (bVar2.i()) {
                        }
                        i10.j a162 = i10.j.a(o12, null, a13, false, false, null, 28);
                        i10.h a172 = i10.h.a(l13, d12, null, e11, aVar12, c14, 10);
                        aVar5 = T00.a.f26425n;
                        c13 = C6997c.c(state, null, null, a162, a172, aVar5, K.f71697a, false, false, 0L, null, null, null, 57283);
                    } else {
                        if (!(uVar instanceof a.u.c)) {
                            throw new o();
                        }
                        i10.j o13 = state.o();
                        i10.h l14 = state.l();
                        h.c b15 = l14.d() instanceof h.c.a ? h.c.a.b((h.c.a) l14.d(), null, null, B00.a.a(((h.c.a) l14.d()).e()), 11) : l14.d();
                        i10.j a18 = i10.j.a(o13, null, null, true, false, null, 26);
                        i10.h a19 = i10.h.a(l14, b15, null, null, null, null, 62);
                        aVar4 = T00.a.f26425n;
                        c13 = C6997c.c(state, null, null, a18, a19, aVar4, K.f71697a, false, false, 0L, null, null, null, 57283);
                    }
                    c6997c3 = c13;
                }
                c6997c = C6997c.c(c6997c3, null, null, null, null, null, null, false, true, 0L, null, null, new C6997c.b(System.nanoTime()), 32383);
            } else if (event instanceof a.r.C0012a) {
                k.a<I> e12 = state.e();
                if (e12 != null) {
                    mVar2 = g20.d.f63721a;
                    e12 = k.a.b(e12, null, null, aVar9.b(new j(mVar2, C6615a.f63718a)), 3);
                }
                c2645f.getClass();
                c6997c = C6997c.c(state, e12, null, null, null, null, null, false, true, 0L, null, null, new C6997c.b(System.nanoTime()), 24446);
            } else if (event instanceof a.r.b) {
                k.a<I> e13 = state.e();
                if (e13 == null || (a12 = e13.a()) == null) {
                    i11 = 0;
                } else {
                    Iterator<I> it2 = a12.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i13 = -1;
                            break;
                        }
                        T00.a b16 = it2.next().c().b();
                        if (Intrinsics.d(b16 != null ? b16.c() : null, ((a.r.b) event).f())) {
                            break;
                        }
                        i13++;
                    }
                    i11 = i13;
                }
                String j11 = l11.j();
                if (j11 == null) {
                    j11 = ((a.r.b) event).h();
                }
                k.a<I> e14 = state.e();
                a.r.b bVar3 = (a.r.b) event;
                if (bVar3.i()) {
                    e14 = e14 != null ? k.a.b(e14, C7714v.K0(state.e().a(), i11), null, null, 14) : null;
                    if (e14 != null) {
                        mVar = g20.d.f63721a;
                        e14 = k.a.b(e14, null, null, aVar9.b(new j(mVar, C6615a.f63718a)), 3);
                    }
                    e.a aVar13 = new e.a();
                    aVar13.g(i11);
                    aVar13.d(bVar3.e());
                    b11 = aVar13.b();
                } else {
                    bVar3.j(i11);
                    if (bVar3.g().h()) {
                        b11 = bVar3.g();
                    } else {
                        e g12 = bVar3.g();
                        g12.getClass();
                        e.a aVar14 = new e.a(g12);
                        aVar14.h();
                        b11 = aVar14.b();
                    }
                }
                i10.h a21 = i10.h.a(l11, new h.c.a(j11, j11, bVar3.h(), 8), null, null, null, new h.b(b11), 30);
                i10.l b17 = o11.b();
                l.a.b loaderType2 = new l.a.b(o11.b().b().b(), null, 2);
                b17.getClass();
                Intrinsics.checkNotNullParameter(loaderType2, "loaderType");
                c6997c = C6997c.c(state, e14, null, i10.j.a(o11, null, new i10.l(true, true, loaderType2), false, false, null, 29), a21, null, null, false, false, 0L, null, null, null, 65330);
            } else if (event instanceof a.w) {
                c6997c = C6997c.c(state, null, null, i10.j.a(o11, null, null, false, true, null, 23), null, null, null, false, true, 0L, null, null, null, 65403);
            } else {
                boolean z17 = event instanceof a.o;
                A00.b bVar4 = this.f64616e;
                if (z17) {
                    Intrinsics.g(event, "null cannot be cast to non-null type ru.ozon.composer.event.ComposerEvent.LoadCompleted<I of ru.ozon.composer.reducer.ReducerImpl>");
                    a.o oVar2 = (a.o) event;
                    P00.k<? extends C7854a> f12 = oVar2.f();
                    A00.a g13 = oVar2.g();
                    a.u.b bVar5 = g13 instanceof a.u.b ? (a.u.b) g13 : null;
                    if (bVar5 == null || !bVar5.i() || state.i().size() <= 2) {
                        String f13 = f12.f().f();
                        h.c d13 = state.l().d();
                        if (d13 instanceof h.c.a) {
                            d13 = h.c.a.b((h.c.a) d13, null, null, f13, 11);
                        }
                        List<String> i14 = state.i();
                        List<String> list4 = i14;
                        if (f13 != null) {
                            boolean d14 = Intrinsics.d(C7714v.Z(i14), f13);
                            list4 = i14;
                            if (!d14) {
                                ArrayList W02 = C7714v.W0(i14);
                                W02.add(f13);
                                list4 = W02;
                            }
                        }
                        i10.e d15 = state.o().d();
                        if (d15 != null) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        if (!(g13 instanceof a.u)) {
                            z14 = false;
                            boolean z18 = !z14;
                            T00.a f14 = f12.f();
                            String k13 = f12.g().h().k();
                            String e15 = oVar2.e();
                            S00.a e16 = f12.e();
                            a.C2369j<I> d16 = oVar2.d();
                            i10.e eVar = new i10.e(g13, f14, e15, e16, z14, z18, d16 == null ? d16.a() : null);
                            T00.a aVar15 = f14;
                            if (g13 instanceof a.u) {
                                WZ.l f15 = aVar8 != null ? aVar8.f() : null;
                                if (f15 != null) {
                                    f15.d();
                                }
                            }
                            f7 = aVar8 == null ? aVar8.f() : null;
                            if (f7 != null) {
                                f7.b(f12.b().d());
                                f7.c(f12.b().b());
                                f7.g(f12.b().c());
                            }
                            k.a<I> e17 = state.e();
                            k.b<I> h15 = state.h();
                            long f16 = state.f();
                            a.C2369j<I> d17 = oVar2.d();
                            if (g13 instanceof a.r.b) {
                                a.r.b bVar6 = (a.r.b) g13;
                                if (!bVar6.i()) {
                                    oVar = oVar2;
                                    if (bVar6.d() != -1) {
                                        List K02 = (e17 == null || (a11 = e17.a()) == null) ? null : C7714v.K0(a11, bVar6.d());
                                        if (K02 == null) {
                                            K02 = K.f71697a;
                                        }
                                        aVar2 = new k.a(6, k13, C7714v.p0(d(f12), K02));
                                        m11 = state.m();
                                        list2 = list4;
                                        currentTimeMillis = f16;
                                        aVar3 = m11;
                                        cVar2 = null;
                                        cVar = d13;
                                        bVar4.onLoadCompleted(g13, k13, f12);
                                        c12 = C6997c.c(state, aVar2, h15, i10.j.a(state.o(), cVar2, null, false, false, eVar, 6), i10.h.a(state.l(), cVar, null, null, null, null, 46), aVar3, list2, f13 == null, false, currentTimeMillis, null, null, null, 63232);
                                        c6997c2 = c12;
                                        c6782d = this;
                                    }
                                    if (g13 instanceof a.r) {
                                        if (e17 == null || (arrayList = e17.a()) == null) {
                                            arrayList = new ArrayList<>();
                                        }
                                        aVar2 = new k.a(6, k13, C7714v.p0(d(f12), arrayList));
                                        m11 = state.m();
                                        list2 = list4;
                                        currentTimeMillis = f16;
                                        aVar3 = m11;
                                        cVar2 = null;
                                        cVar = d13;
                                        bVar4.onLoadCompleted(g13, k13, f12);
                                        c12 = C6997c.c(state, aVar2, h15, i10.j.a(state.o(), cVar2, null, false, false, eVar, 6), i10.h.a(state.l(), cVar, null, null, null, null, 46), aVar3, list2, f13 == null, false, currentTimeMillis, null, null, null, 63232);
                                        c6997c2 = c12;
                                        c6782d = this;
                                    } else if (d17 != null) {
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        bVar4.onLoadCompleted(g13, k13, f12);
                                        k.a aVar16 = new k.a(14, null, j(d(d17.b())));
                                        if (h15 == null || (list3 = h15.a()) == null) {
                                            list3 = K.f71697a;
                                        }
                                        k.b f17 = f(d17, list3, state.g());
                                        i10.j o14 = state.o();
                                        a.C2369j<I> d18 = oVar.d();
                                        c12 = C6997c.c(state, aVar16, f17, i10.j.a(o14, null, null, false, false, i10.e.a(eVar, d18 != null ? d18.a() : null, 63), 6), i10.h.a(state.l(), d13, null, null, null, null, 46), aVar15, list4, true, false, currentTimeMillis2, null, null, null, 63232);
                                        c6997c2 = c12;
                                        c6782d = this;
                                    } else {
                                        cVar = d13;
                                        list2 = list4;
                                        k.a aVar17 = new k.a(6, k13, d(f12));
                                        Set<String> g14 = state.g();
                                        List<I> a22 = h15 != null ? h15.a() : null;
                                        ArrayList e18 = e(f12);
                                        HashSet hashSet = new HashSet();
                                        Iterator it3 = e18.iterator();
                                        while (it3.hasNext()) {
                                            hashSet.add(Long.valueOf(((C7854a) it3.next()).f()));
                                            aVar17 = aVar17;
                                        }
                                        k.a aVar18 = aVar17;
                                        if (a22 != null) {
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj2 : a22) {
                                                C7854a c7854a = (C7854a) obj2;
                                                T00.a aVar19 = aVar15;
                                                if (!hashSet.contains(Long.valueOf(c7854a.f())) && g14.contains(c7854a.c().a())) {
                                                    arrayList2.add(obj2);
                                                }
                                                aVar15 = aVar19;
                                            }
                                            aVar = aVar15;
                                            k12 = arrayList2;
                                        } else {
                                            aVar = aVar15;
                                            k12 = K.f71697a;
                                        }
                                        k.b<I> bVar7 = new k.b<>(C7714v.p0(k12, e18));
                                        f.c a23 = C10970a.a(f12);
                                        currentTimeMillis = System.currentTimeMillis();
                                        h15 = bVar7;
                                        cVar2 = a23;
                                        aVar2 = aVar18;
                                        aVar3 = aVar;
                                        bVar4.onLoadCompleted(g13, k13, f12);
                                        c12 = C6997c.c(state, aVar2, h15, i10.j.a(state.o(), cVar2, null, false, false, eVar, 6), i10.h.a(state.l(), cVar, null, null, null, null, 46), aVar3, list2, f13 == null, false, currentTimeMillis, null, null, null, 63232);
                                        c6997c2 = c12;
                                        c6782d = this;
                                    }
                                }
                            }
                            oVar = oVar2;
                            if (g13 instanceof a.r) {
                            }
                        }
                        z14 = z13;
                        boolean z182 = !z14;
                        T00.a f142 = f12.f();
                        String k132 = f12.g().h().k();
                        String e152 = oVar2.e();
                        S00.a e162 = f12.e();
                        a.C2369j<I> d162 = oVar2.d();
                        i10.e eVar2 = new i10.e(g13, f142, e152, e162, z14, z182, d162 == null ? d162.a() : null);
                        T00.a aVar152 = f142;
                        if (g13 instanceof a.u) {
                        }
                        if (aVar8 == null) {
                        }
                        if (f7 != null) {
                        }
                        k.a<I> e172 = state.e();
                        k.b<I> h152 = state.h();
                        long f162 = state.f();
                        a.C2369j<I> d172 = oVar2.d();
                        if (g13 instanceof a.r.b) {
                        }
                        oVar = oVar2;
                        if (g13 instanceof a.r) {
                        }
                    } else {
                        c6997c = C6997c.c(state, null, null, null, null, null, null, false, false, 0L, null, null, null, 65407);
                    }
                } else {
                    if (event instanceof a.p) {
                        a.p pVar = (a.p) event;
                        i10.j o15 = state.o();
                        i10.h l15 = state.l();
                        k.a<I> h16 = h(state);
                        k.b<I> h17 = state.h();
                        h.c d19 = l15.d();
                        List<String> i15 = state.i();
                        f c15 = o15.c();
                        boolean r11 = state.r();
                        Throwable f18 = pVar.f();
                        boolean z19 = f18 instanceof C4916d;
                        boolean z21 = r11;
                        z00.h<I> hVar2 = this.f64615d;
                        if (z19) {
                            C4916d c4916d = (C4916d) f18;
                            String a24 = c4916d.a();
                            String b18 = c4916d.b();
                            boolean s11 = state.s();
                            if (d19 instanceof h.c.a) {
                                h.c.a aVar20 = (h.c.a) d19;
                                jVar = o15;
                                if (!Intrinsics.d(aVar20.c(), b18)) {
                                    if (s11) {
                                        d19 = h.c.a.b(aVar20, null, null, b18, 11);
                                        List<String> i16 = state.i();
                                        String str = (String) C7714v.Z(i16);
                                        List<String> list5 = i16;
                                        if (str != null) {
                                            ArrayList W03 = C7714v.W0(i16);
                                            W03.remove(str);
                                            list5 = W03;
                                        }
                                        i15 = list5;
                                        z21 = false;
                                    }
                                    h.c.a aVar21 = (h.c.a) d19;
                                    String c16 = aVar21.c();
                                    if (c16 == null) {
                                        c16 = aVar21.f();
                                    }
                                    fVar2 = new i10.f(a24, c16, b18);
                                    bVar = h17;
                                    fVar = c15;
                                    z12 = z21;
                                    bVar4.onLoadFailed(pVar.g(), pVar.f());
                                    k.a b19 = h16 == null ? k.a.b(h16, null, null, null, 7) : null;
                                    i10.l loader = i10.l.a(jVar.b(), false, false, 4);
                                    Intrinsics.checkNotNullParameter(loader, "loader");
                                    c6782d = this;
                                    c6997c = C6997c.c(state, b19, bVar, new i10.j(fVar, loader, false, false, null), i10.h.a(l15, d19, null, null, null, null, 62), null, i15, false, z12, 0L, fVar2, null, null, 57168);
                                }
                            } else {
                                jVar = o15;
                            }
                            if (!s11) {
                                c15 = hVar2.createIssue(pVar, state, f18);
                            } else if (h16 != null) {
                                h16 = a(pVar, state, h16, f18);
                            }
                        } else {
                            jVar = o15;
                            a.C2369j<? extends C7854a> d21 = pVar.d();
                            if (d21 == null) {
                                d21 = null;
                            }
                            if (pVar.g() instanceof a.r) {
                                if (h16 != null) {
                                    h16 = a(pVar, state, h16, f18);
                                }
                            } else if (d21 != null) {
                                h16 = new k.a<>(14, null, j(d(d21.b())));
                                k.b<I> h18 = state.h();
                                if (h18 == null || (list = h18.a()) == null) {
                                    list = K.f71697a;
                                }
                                h17 = f(d21, list, M.f71699a);
                                c15 = null;
                            } else {
                                c15 = hVar2.createIssue(pVar, state, f18);
                            }
                            H00.c.d(f18, new C6781c(f18));
                            R00.b createIncident = hVar2.createIncident(pVar, state, f18);
                            if (!Intrinsics.d(createIncident, b.a.a())) {
                                TZ.a d22 = aVar8 != null ? aVar8.d() : null;
                                if (d22 != null) {
                                    d22.a(pVar.e(), createIncident);
                                }
                            }
                        }
                        bVar = h17;
                        fVar = c15;
                        z12 = z21;
                        fVar2 = null;
                        bVar4.onLoadFailed(pVar.g(), pVar.f());
                        if (h16 == null) {
                        }
                        i10.l loader2 = i10.l.a(jVar.b(), false, false, 4);
                        Intrinsics.checkNotNullParameter(loader2, "loader");
                        c6782d = this;
                        c6997c = C6997c.c(state, b19, bVar, new i10.j(fVar, loader2, false, false, null), i10.h.a(l15, d19, null, null, null, null, 62), null, i15, false, z12, 0L, fVar2, null, null, 57168);
                    } else {
                        c6782d = this;
                        if (event instanceof a.C2372m) {
                            i10.l b21 = o11.b();
                            if (((a.C2372m) event).d() || o11.f()) {
                                b21 = i10.l.a(b21, false, false, 4);
                            }
                            h.b c17 = l11.c();
                            e b22 = c17 != null ? c17.b() : null;
                            if (b22 != null) {
                                k.a<I> e19 = state.e();
                                if (!i10.d.a(e19) && b22.f().u0(e19.a()) != -1) {
                                    z11 = false;
                                    if (b21.c() && z11) {
                                        b21 = i10.l.a(b21, false, false, 4);
                                    }
                                    c6997c = C6997c.c(state, h(state), null, i10.j.a(o11, null, b21, false, false, null, 25), null, null, null, false, false, 0L, null, null, null, 65530);
                                }
                            }
                            z11 = true;
                            if (b21.c()) {
                                b21 = i10.l.a(b21, false, false, 4);
                            }
                            c6997c = C6997c.c(state, h(state), null, i10.j.a(o11, null, b21, false, false, null, 25), null, null, null, false, false, 0L, null, null, null, 65530);
                        } else if (Intrinsics.d(event, a.C2362c.f204a)) {
                            h.b c18 = l11.c();
                            i10.l b23 = o11.b();
                            if ((c18 != null ? c18.b() : null) != null) {
                                c18 = null;
                            } else {
                                b23 = i10.l.a(o11.b(), false, false, 4);
                            }
                            c6997c = C6997c.c(state, null, null, i10.j.a(o11, null, b23, false, false, null, 29), i10.h.a(l11, null, null, null, null, c18, 31), null, null, false, false, 0L, null, null, null, 65523);
                        } else if (event instanceof a.I) {
                            i10.l b24 = o11.b();
                            a.I i17 = (a.I) event;
                            boolean e21 = i17.e();
                            boolean z22 = i17.e() && o11.f();
                            l.a loaderType3 = i17.d();
                            if (loaderType3 == null) {
                                loaderType3 = o11.b().b();
                            }
                            b24.getClass();
                            Intrinsics.checkNotNullParameter(loaderType3, "loaderType");
                            c6997c = C6997c.c(state, null, null, i10.j.a(o11, null, new i10.l(e21, z22, loaderType3), false, false, null, 29), null, null, null, false, false, 0L, null, null, null, 65531);
                        } else if (event instanceof a.C2371l) {
                            a.C2371l c2371l = (a.C2371l) event;
                            List<C7854a> e22 = c2371l.e();
                            k.a<I> e23 = state.e();
                            if (e23 == null) {
                                Intrinsics.g(e22, "null cannot be cast to non-null type kotlin.collections.List<I of ru.ozon.composer.reducer.ReducerImpl>");
                                c6997c = C6997c.c(state, new k.a(14, null, e22), null, null, null, null, null, false, false, 0L, null, null, null, 65534);
                            } else {
                                List<I> a25 = e23.a();
                                int a26 = c2371l.d().a(a25);
                                WZ.l f19 = aVar8 != null ? aVar8.f() : null;
                                if (f19 != null) {
                                    HashMap hashMap = new HashMap();
                                    HashMap hashMap2 = new HashMap();
                                    for (C7854a c7854a2 : e22) {
                                        String j12 = c7854a2.c().c().j();
                                        if (j12 != null) {
                                            hashMap.put(Long.valueOf(c7854a2.f()), new RZ.c(j12));
                                        }
                                        T00.a b25 = c7854a2.c().b();
                                        RZ.b g15 = b25 != null ? b25.g() : null;
                                        if (g15 != null) {
                                            hashMap2.put(Long.valueOf(c7854a2.f()), g15);
                                        }
                                    }
                                    f19.b(hashMap);
                                    f19.c(hashMap2);
                                }
                                ArrayList W04 = C7714v.W0(a25);
                                Intrinsics.g(e22, "null cannot be cast to non-null type kotlin.collections.List<I of ru.ozon.composer.reducer.ReducerImpl>");
                                W04.addAll(a26, e22);
                                Unit unit = Unit.f71690a;
                                c6997c = C6997c.c(state, k.a.b(e23, W04, null, null, 14), null, null, null, null, null, false, false, 0L, null, null, null, 65534);
                            }
                        } else if (event instanceof a.x) {
                            c6997c = b((a.x) event, state);
                        } else if (event instanceof a.y) {
                            a.x.C0015a c0015a = new a.x.C0015a();
                            ((a.y) event).getClass();
                            c0015a.a(0L);
                            c6997c = b(c0015a.c(), state);
                        } else {
                            if (event instanceof a.z) {
                                a.x.C0015a c0015a2 = new a.x.C0015a();
                                ((a.z) event).getClass();
                                c0015a2.b(null);
                                throw null;
                            }
                            if (event instanceof a.J) {
                                a.J j13 = (a.J) event;
                                k.a<I> e24 = state.e();
                                if (e24 != null && (c11 = aVar9.c(j13.d(), e24.a())) != null) {
                                    e24 = k.a.b(e24, c11, new AtomicBoolean(j13.e()), null, 4);
                                }
                                k.b<I> h19 = state.h();
                                if (h19 != null && (items2 = aVar9.c(j13.d(), h19.a())) != null) {
                                    Intrinsics.checkNotNullParameter(items2, "items");
                                    h19 = new k.b<>(items2);
                                }
                                c6997c = C6997c.c(state, e24, h19, null, null, null, null, false, false, 0L, null, null, null, 65532);
                            } else if (event instanceof a.M) {
                                a.M m13 = (a.M) event;
                                InterfaceC8047b k14 = m13.f().k();
                                if (Intrinsics.d(k14, ru.ozon.composer.ui.widget.c.f94864a)) {
                                    k.b<I> h21 = state.h();
                                    if (h21 != null && (items = c6782d.k(h21, m13)) != null) {
                                        if (items.isEmpty()) {
                                            items = null;
                                        }
                                        if (items != null) {
                                            state.h().getClass();
                                            Intrinsics.checkNotNullParameter(items, "items");
                                            c6997c = C6997c.c(state, null, new k.b(items), null, null, null, null, false, false, 0L, null, null, null, 65533);
                                        }
                                    }
                                    c6997c = state;
                                } else {
                                    if (!Intrinsics.d(k14, InterfaceC8047b.a.f74254a)) {
                                        throw new IllegalArgumentException("type " + m13.f().k() + " not supported");
                                    }
                                    k.a<I> e25 = state.e();
                                    if (e25 != null && (k11 = c6782d.k(e25, m13)) != null) {
                                        if (k11.isEmpty()) {
                                            k11 = null;
                                        }
                                        if (k11 != null) {
                                            c6997c = C6997c.c(state, k.a.b(state.e(), k11, null, null, 14), null, null, null, null, null, false, false, 0L, null, null, null, 65534);
                                        }
                                    }
                                    c6997c = state;
                                }
                            } else if (event instanceof a.K) {
                                Intrinsics.g(event, "null cannot be cast to non-null type ru.ozon.composer.event.ComposerEvent.UpdateLocalItems<I of ru.ozon.composer.reducer.ReducerImpl>");
                                a.K k15 = (a.K) event;
                                k.a<I> e26 = state.e();
                                c6997c = C6997c.c(state, e26 != null ? k.a.b(e26, k15.d(), null, null, 6) : null, null, null, null, null, null, false, false, 0L, null, null, null, 65534);
                            } else if (event instanceof a.AbstractC2361b) {
                                a.AbstractC2361b abstractC2361b = (a.AbstractC2361b) event;
                                if (abstractC2361b instanceof a.E) {
                                    c6997c = C6997c.c(state, null, null, i10.j.a(o11, null, null, false, false, null, 15), null, null, null, false, false, 0L, null, null, null, 65531);
                                } else {
                                    if (abstractC2361b instanceof a.L) {
                                        i10.e d23 = o11.d();
                                        c6997c = C6997c.c(state, null, null, i10.j.a(o11, null, null, false, false, d23 != null ? i10.e.a(d23, null, 95) : null, 15), null, null, null, false, false, 0L, null, null, null, 65531);
                                    }
                                    c6997c2 = state;
                                }
                            } else if (event instanceof a.G) {
                                c6997c = C6997c.c(state, null, null, i10.j.a(o11, ((a.G) event).d(), null, false, false, null, 14), null, null, null, false, false, 0L, null, null, null, 57339);
                            } else if (event instanceof a.C2368i) {
                                k.a<I> e27 = state.e();
                                c6997c = C6997c.c(state, e27 != null ? k.a.b(e27, null, null, null, 7) : null, null, null, null, null, null, false, false, 0L, null, null, null, 65534);
                            } else if (event instanceof a.C2370k) {
                                c6997c = C6997c.c(state, null, null, null, null, null, null, false, false, 0L, null, null, null, 57343);
                            } else {
                                c6997c = state;
                                if (event instanceof A00.d) {
                                    c6997c = c6782d.c((A00.d) event, c6997c);
                                } else {
                                    boolean z23 = event instanceof a.t;
                                }
                            }
                        }
                    }
                    c6997c2 = c6997c;
                }
            }
            c6782d = this;
            c6997c2 = c6997c;
        }
        List<AbstractC6779a<I, ? extends InterfaceC6995a>> list6 = c6782d.f64617f;
        if (!list6.isEmpty()) {
            LinkedHashMap linkedHashMap = null;
            for (AbstractC6779a<I, ? extends InterfaceC6995a> abstractC6779a : list6) {
                InterfaceC6995a c19 = abstractC6779a.c(event, c6997c2);
                if (c19 != null) {
                    LinkedHashMap u11 = linkedHashMap == null ? U.u(c6997c2.d()) : linkedHashMap;
                    u11.put(abstractC6779a.b(), c19);
                    linkedHashMap = u11;
                }
            }
            if (linkedHashMap != null) {
                return C6997c.c(c6997c2, null, null, null, null, null, null, false, false, 0L, null, linkedHashMap, null, 49151);
            }
        }
        return c6997c2;
    }
}
