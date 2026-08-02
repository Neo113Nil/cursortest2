package ce;

import Bd.InterfaceC2627a;
import ce.o;
import ie.InterfaceC7061j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9836b;
import td.InterfaceC9839e;
import td.InterfaceC9845k;
import td.InterfaceC9857w;
import td.c0;
import te.C9865a;
import wd.AbstractC10516b;

/* loaded from: classes.dex */
public abstract class g extends m {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.m<Object>[] f57036d = {N.h(new E(N.b(g.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AbstractC10516b f57037b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC7061j f57038c;

    public g(@NotNull ie.o storageManager, @NotNull AbstractC10516b containingClass) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingClass, "containingClass");
        this.f57037b = containingClass;
        this.f57038c = storageManager.a(new e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.ArrayList] */
    static ArrayList h(g gVar) {
        Collection collection;
        List<InterfaceC9857w> i11 = gVar.i();
        List<InterfaceC9857w> list = i11;
        ArrayList arrayList = new ArrayList(3);
        Collection<je.N> o11 = gVar.f57037b.k().o();
        Intrinsics.checkNotNullExpressionValue(o11, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = o11.iterator();
        while (it.hasNext()) {
            C7714v.p(o.a.a(((je.N) it.next()).p(), null, 3), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof InterfaceC9836b) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            Sd.f name = ((InterfaceC9836b) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
            Sd.f fVar = (Sd.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                Boolean valueOf = Boolean.valueOf(((InterfaceC9836b) obj2) instanceof InterfaceC9857w);
                Object obj3 = linkedHashMap2.get(valueOf);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj3);
                }
                ((List) obj3).add(obj2);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                Vd.n nVar = Vd.n.f28546e;
                List list4 = list3;
                if (booleanValue) {
                    collection = new ArrayList();
                    for (Object obj4 : i11) {
                        if (Intrinsics.d(((InterfaceC9857w) obj4).getName(), fVar)) {
                            collection.add(obj4);
                        }
                    }
                } else {
                    collection = K.f71697a;
                }
                nVar.j(fVar, list4, collection, gVar.f57037b, new f(arrayList, gVar));
            }
        }
        return C7714v.p0(C9865a.b(arrayList), list);
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Collection b(@NotNull Sd.f name, @NotNull Bd.c location) {
        Collection collection;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) ie.n.a(this.f57038c, f57036d[0]);
        if (list.isEmpty()) {
            collection = K.f71697a;
        } else {
            te.h hVar = new te.h();
            for (Object obj : list) {
                if ((obj instanceof InterfaceC9831W) && Intrinsics.d(((InterfaceC9831W) obj).getName(), name)) {
                    hVar.add(obj);
                }
            }
            collection = hVar;
        }
        return collection;
    }

    @Override // ce.m, ce.o
    @NotNull
    public final Collection<InterfaceC9845k> e(@NotNull d kindFilter, @NotNull Function1<? super Sd.f, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(d.f57023m.m())) {
            return K.f71697a;
        }
        return (List) ie.n.a(this.f57038c, f57036d[0]);
    }

    @Override // ce.m, ce.l
    @NotNull
    public final Collection<c0> g(@NotNull Sd.f name, @NotNull InterfaceC2627a location) {
        Collection<c0> collection;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        List list = (List) ie.n.a(this.f57038c, f57036d[0]);
        if (list.isEmpty()) {
            collection = K.f71697a;
        } else {
            te.h hVar = new te.h();
            for (Object obj : list) {
                if ((obj instanceof c0) && Intrinsics.d(((c0) obj).getName(), name)) {
                    hVar.add(obj);
                }
            }
            collection = hVar;
        }
        return collection;
    }

    @NotNull
    protected abstract List<InterfaceC9857w> i();

    @NotNull
    protected final InterfaceC9839e j() {
        return this.f57037b;
    }
}
