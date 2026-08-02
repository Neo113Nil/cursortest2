package ee0;

import Ae.B0;
import Ae.C0;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.E0;
import De.C2862e;
import ge0.C6723a;
import ge0.C6724b;
import ge0.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.input.CounterView;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.Cluster;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.clustering.ClusterizingResult;
import we0.m;
import we0.s;
import we0.t;
import we0.u;
import we0.z;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe0.InterfaceC10766e;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC10766e f62186a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62187b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f62188c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C0 f62189d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final B0<InterfaceC6350a> f62190e;

    /* renamed from: f, reason: collision with root package name */
    private final Ne0.f f62191f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private HashMap<String, s> f62192g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private HashMap<String, u> f62193h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private HashSet<u> f62194i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private HashSet<s> f62195j;

    /* renamed from: k, reason: collision with root package name */
    private long f62196k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f62197l;

    /* renamed from: m, reason: collision with root package name */
    private Function0<Unit> f62198m;

    /* renamed from: n, reason: collision with root package name */
    private xe.B0 f62199n;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.clustercontroller.implementation.ClusterRenderer$clearAll$2", f = "ClusterRenderer.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {
        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Oe0.d i11;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            e eVar = e.this;
            InterfaceC10766e o11 = eVar.o();
            HashSet hashSet = eVar.f62194i;
            ArrayList arrayList = new ArrayList(C7714v.z(hashSet, 10));
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((u) it.next()).e());
            }
            o11.j(eVar.f62196k, arrayList);
            InterfaceC10766e o12 = eVar.o();
            HashSet hashSet2 = eVar.f62195j;
            ArrayList arrayList2 = new ArrayList(C7714v.z(hashSet2, 10));
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((s) it2.next()).d());
            }
            o12.j(eVar.f62196k, arrayList2);
            Ne0.f fVar = eVar.f62191f;
            if (fVar == null || (i11 = fVar.i()) == null) {
                return null;
            }
            i11.d(eVar.f62196k);
            return Unit.f71690a;
        }
    }

    public e(Function2 clusterView, InterfaceC10766e placemarkControllerForClusterizer, C2862e coroutineScope) {
        b clusterDisplayOptionsCache = new b(new c(clusterView));
        Intrinsics.checkNotNullParameter(clusterView, "clusterView");
        Intrinsics.checkNotNullParameter(placemarkControllerForClusterizer, "placemarkControllerForClusterizer");
        Intrinsics.checkNotNullParameter(clusterDisplayOptionsCache, "clusterDisplayOptionsCache");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f62186a = placemarkControllerForClusterizer;
        this.f62187b = CounterView.COUNTER_MAX_DEFAULT;
        this.f62188c = clusterDisplayOptionsCache;
        C0 b11 = E0.b(0, 0, null, 7);
        this.f62189d = b11;
        this.f62190e = C2399j.a(b11);
        this.f62191f = placemarkControllerForClusterizer instanceof Ne0.f ? (Ne0.f) placemarkControllerForClusterizer : null;
        this.f62192g = new HashMap<>();
        this.f62193h = new HashMap<>();
        this.f62194i = new HashSet<>();
        this.f62195j = new HashSet<>();
        this.f62196k = 200L;
        this.f62197l = true;
        this.f62199n = C2399j.C(new C2408n0(placemarkControllerForClusterizer.k(), new d(this, null)), coroutineScope);
    }

    private final Object i(HashMap hashMap, HashMap hashMap2, HashSet hashSet, HashSet hashSet2, boolean z11, ge0.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        C6723a c6723a;
        Collection collection;
        C6723a c6723a2;
        Collection collection2;
        Object r11;
        boolean z12 = hashSet2.size() + hashSet.size() > this.f62187b;
        if (z11) {
            c6723a = C6724b.a(this.f62194i, hashSet);
            collection = hashSet;
        } else if (z12) {
            c6723a = C6724b.b(hashSet, cVar);
            collection = c6723a.a();
        } else {
            K k11 = K.f71697a;
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!this.f62194i.contains((u) next)) {
                    arrayList.add(next);
                }
            }
            c6723a = new C6723a(k11, arrayList);
            collection = hashSet;
        }
        if (z11) {
            c6723a2 = C6724b.a(this.f62195j, hashSet2);
            collection2 = hashSet2;
        } else if (z12) {
            c6723a2 = C6724b.b(hashSet2, cVar);
            collection2 = c6723a2.a();
        } else {
            K k12 = K.f71697a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!this.f62195j.contains((s) next2)) {
                    arrayList2.add(next2);
                }
            }
            c6723a2 = new C6723a(k12, arrayList2);
            collection2 = hashSet2;
        }
        this.f62192g = hashMap2;
        this.f62193h = hashMap;
        HashSet<u> hashSet3 = collection instanceof HashSet ? (HashSet) collection : null;
        if (hashSet3 == null) {
            hashSet3 = C7714v.S0(collection);
        }
        this.f62194i = hashSet3;
        HashSet<s> hashSet4 = collection2 instanceof HashSet ? (HashSet) collection2 : null;
        if (hashSet4 == null) {
            hashSet4 = C7714v.S0(collection2);
        }
        this.f62195j = hashSet4;
        return (this.f62197l && (r11 = r(c6723a, c6723a2, cVar2)) == Wc.a.COROUTINE_SUSPENDED) ? r11 : Unit.f71690a;
    }

    private final Object r(C6723a c6723a, C6723a c6723a2, kotlin.coroutines.jvm.internal.c cVar) {
        Function0<Unit> function0;
        List a11 = c6723a2.a();
        ArrayList arrayList = new ArrayList(C7714v.z(a11, 10));
        Iterator it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).e());
        }
        if (c6723a.c() && c6723a2.c() && (function0 = this.f62198m) != null) {
            function0.invoke();
        }
        Ne0.f fVar = this.f62191f;
        if (fVar == null) {
            C10720e0 c10720e0 = C10720e0.f105451a;
            return C10727i.f(De.s.f6650a.x(), new g(this, c6723a, c6723a2, arrayList, null), cVar);
        }
        ArrayList h11 = fVar.i().h(c6723a.a());
        ArrayList h12 = fVar.i().h(arrayList);
        C10720e0 c10720e02 = C10720e0.f105451a;
        return C10727i.f(De.s.f6650a.x(), new f(this, c6723a, h11, c6723a2, h12, null), cVar);
    }

    private final s t(Cluster<u> cluster) {
        Collection<u> placemarks = cluster.getItems();
        Intrinsics.checkNotNullExpressionValue(placemarks, "getItems(...)");
        Intrinsics.checkNotNullParameter(placemarks, "placemarks");
        s.a pins = new s.a(placemarks);
        t b11 = this.f62188c.b(pins.hashCode(), pins);
        Intrinsics.checkNotNullParameter(pins, "pins");
        String a11 = Ej.b.a(pins.hashCode(), "cluster-");
        m mPosition = cluster.getMPosition();
        Intrinsics.checkNotNullExpressionValue(mPosition, "getPosition(...)");
        return new s(a11, mPosition, pins, b11);
    }

    public final void j() {
        this.f62198m = null;
    }

    public final Object k(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(De.s.f6650a.x(), new a(null), dVar);
    }

    public final Object l(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object c11;
        this.f62198m = null;
        this.f62188c.a();
        this.f62194i.clear();
        this.f62195j.clear();
        this.f62193h.clear();
        this.f62192g.clear();
        xe.B0 b02 = this.f62199n;
        return (b02 == null || (c11 = xe.E0.c(b02, dVar)) != Wc.a.COROUTINE_SUSPENDED) ? Unit.f71690a : c11;
    }

    @NotNull
    public final B0<InterfaceC6350a> m() {
        return this.f62190e;
    }

    @NotNull
    public final List<s> n() {
        Collection<s> values = this.f62192g.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        return C7714v.U0(values);
    }

    @NotNull
    public final InterfaceC10766e o() {
        return this.f62186a;
    }

    @NotNull
    public final ArrayList p(@NotNull we0.i renderArea) {
        Intrinsics.checkNotNullParameter(renderArea, "renderArea");
        ge0.c a11 = c.a.a(renderArea);
        List U02 = C7714v.U0(this.f62194i);
        ArrayList arrayList = new ArrayList();
        for (Object obj : U02) {
            if (a11.a(((u) obj).getPosition())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Object q(@NotNull we0.i iVar, @NotNull ClusterizingResult<u> clusterizingResult, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        ge0.c a11 = c.a.a(iVar);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (Cluster<u> cluster : clusterizingResult.getCalculatedClusters()) {
            s t2 = t(cluster);
            hashMap2.put(t2.d(), t2);
            m mPosition = cluster.getMPosition();
            Intrinsics.checkNotNullExpressionValue(mPosition, "getPosition(...)");
            if (a11.a(mPosition)) {
                hashSet2.add(t2);
            }
        }
        for (u uVar : clusterizingResult.getCalculatedClusterItems()) {
            hashMap.put(uVar.e(), uVar);
            if (a11.a(uVar.getPosition())) {
                hashSet.add(uVar);
            }
        }
        Object i11 = i(hashMap, hashMap2, hashSet, hashSet2, true, a11, (kotlin.coroutines.jvm.internal.c) dVar);
        return i11 == Wc.a.COROUTINE_SUSPENDED ? i11 : Unit.f71690a;
    }

    public final void s(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f62198m = callback;
    }

    public final Object u(@NotNull u uVar, @NotNull u uVar2, @NotNull kotlin.coroutines.d dVar) {
        if (this.f62193h.containsKey(uVar.e())) {
            this.f62193h.remove(uVar.e());
            this.f62193h.put(uVar2.e(), uVar2);
        }
        if (this.f62194i.contains(uVar)) {
            this.f62194i.remove(uVar);
            this.f62194i.add(uVar2);
            if (this.f62197l) {
                C10720e0 c10720e0 = C10720e0.f105451a;
                Object f7 = C10727i.f(De.s.f6650a.x(), new h(this, uVar2, null), dVar);
                return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
            }
        }
        return Unit.f71690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(@NotNull we0.i iVar, ClusterizingResult<u> clusterizingResult, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        HashMap hashMap;
        HashMap<String, s> hashMap2;
        Object i11;
        Set<Cluster<u>> calculatedClusters;
        Collection<u> calculatedClusterItems;
        ge0.c a11 = c.a.a(iVar);
        HashSet S02 = C7714v.S0(this.f62194i);
        HashSet S03 = C7714v.S0(this.f62195j);
        if (clusterizingResult == null || (calculatedClusterItems = clusterizingResult.getCalculatedClusterItems()) == null) {
            hashMap = this.f62193h;
        } else {
            hashMap = new HashMap();
            for (Object obj : calculatedClusterItems) {
                hashMap.put(((u) obj).e(), obj);
            }
            hashMap.putAll(this.f62193h);
        }
        HashMap hashMap3 = hashMap;
        if (clusterizingResult != null && (calculatedClusters = clusterizingResult.getCalculatedClusters()) != null) {
            hashMap2 = new HashMap<>(calculatedClusters.size());
            Iterator<T> it = calculatedClusters.iterator();
            while (it.hasNext()) {
                s t2 = t((Cluster) it.next());
                hashMap2.put(t2.d(), t2);
            }
            if (hashMap2.isEmpty()) {
                hashMap2 = null;
            }
            if (hashMap2 != null) {
                hashMap2.putAll(this.f62192g);
                HashMap<String, s> hashMap4 = hashMap2;
                Collection<u> values = hashMap3.values();
                Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                for (u uVar : values) {
                    if (a11.a(uVar.getPosition())) {
                        S02.add(uVar);
                    }
                }
                for (Map.Entry<String, s> entry : hashMap4.entrySet()) {
                    if (a11.a(entry.getValue().b())) {
                        S03.add(entry.getValue());
                    }
                }
                return ((S02.equals(this.f62194i) || !S03.equals(this.f62195j)) && (i11 = i(hashMap3, hashMap4, S02, S03, false, a11, (kotlin.coroutines.jvm.internal.c) dVar)) == Wc.a.COROUTINE_SUSPENDED) ? i11 : Unit.f71690a;
            }
        }
        hashMap2 = this.f62192g;
        HashMap<String, s> hashMap42 = hashMap2;
        Collection<u> values2 = hashMap3.values();
        Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
        while (r9.hasNext()) {
        }
        while (r9.hasNext()) {
        }
        if (S02.equals(this.f62194i)) {
        }
    }

    public final Object w(boolean z11, @NotNull kotlin.coroutines.jvm.internal.j jVar) {
        this.f62197l = z11;
        HashSet<u> hashSet = this.f62194i;
        ArrayList arrayList = new ArrayList(C7714v.z(hashSet, 10));
        for (u uVar : hashSet) {
            arrayList.add(u.a(uVar, null, z.a(uVar.d(), null, null, z11, 0.0f, 0.0f, 247), null, null, 1021));
        }
        HashSet<s> hashSet2 = this.f62195j;
        ArrayList arrayList2 = new ArrayList(C7714v.z(hashSet2, 10));
        for (s sVar : hashSet2) {
            arrayList2.add(s.a(sVar, t.a(sVar.c(), z11)));
        }
        K k11 = K.f71697a;
        Object r11 = r(new C6723a(k11, arrayList), new C6723a(k11, arrayList2), jVar);
        return r11 == Wc.a.COROUTINE_SUSPENDED ? r11 : Unit.f71690a;
    }
}
