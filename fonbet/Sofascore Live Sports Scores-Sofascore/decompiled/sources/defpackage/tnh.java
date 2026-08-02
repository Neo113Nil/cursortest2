package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tnh implements Set, jia {
    public final koh a;
    public final /* synthetic */ int b;

    public tnh(koh kohVar, int i) {
        this.b = i;
        this.a = kohVar;
    }

    private final boolean a(Collection collection) {
        cee ceeVar;
        int i;
        nnh h;
        boolean a;
        Set W0 = CollectionsKt.W0(collection);
        koh kohVar = this.a;
        boolean z = false;
        do {
            synchronized (zm2.i) {
                joh johVar = (joh) snh.f(kohVar.a);
                ceeVar = johVar.c;
                i = johVar.d;
                Unit unit = Unit.a;
            }
            ceeVar.getClass();
            gee h2 = ceeVar.h();
            Object it = kohVar.b.iterator();
            while (((n4) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((pdi) it).next();
                if (!W0.contains(entry.getKey())) {
                    h2.remove(entry.getKey());
                    z = true;
                }
            }
            Unit unit2 = Unit.a;
            cee g = h2.g();
            if (Intrinsics.c(g, ceeVar)) {
                break;
            }
            joh johVar2 = kohVar.a;
            synchronized (snh.c) {
                h = snh.h();
                a = koh.a((joh) snh.w(johVar2, kohVar, h), i, g);
            }
            snh.l(h, kohVar);
        } while (!a);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                zm2.M();
                throw null;
            case 1:
                zm2.M();
                throw null;
            default:
                zm2.M();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                zm2.M();
                throw null;
            case 1:
                zm2.M();
                throw null;
            default:
                zm2.M();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.b;
        koh kohVar = this.a;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof eia) && !(obj instanceof hia))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.c(kohVar.get(entry.getKey()), entry.getValue());
            case 1:
                return kohVar.containsKey(obj);
            default:
                return kohVar.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.b;
        koh kohVar = this.a;
        switch (i) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!kohVar.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!kohVar.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.b;
        koh kohVar = this.a;
        switch (i) {
            case 0:
                return new pdi(kohVar, ((xv9) kohVar.e().c.entrySet()).iterator(), 0);
            case 1:
                return new pdi(kohVar, ((xv9) kohVar.e().c.entrySet()).iterator(), 1);
            default:
                return new pdi(kohVar, ((xv9) kohVar.e().c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object obj2;
        int i = this.b;
        koh kohVar = this.a;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    if ((!(obj instanceof eia) || (obj instanceof hia)) && kohVar.remove(((Map.Entry) obj).getKey()) != null) {
                        break;
                    }
                }
                break;
            case 1:
                if (kohVar.remove(obj) != null) {
                    break;
                }
                break;
            default:
                Object it = kohVar.b.iterator();
                while (true) {
                    if (((n4) it).hasNext()) {
                        obj2 = ((pdi) it).next();
                        if (Intrinsics.c(((Map.Entry) obj2).getValue(), obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj2;
                if (entry != null) {
                    kohVar.remove(entry.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        cee ceeVar;
        int i;
        nnh h;
        boolean a;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                    break;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                    break;
                }
                break;
            default:
                Set W0 = CollectionsKt.W0(collection);
                koh kohVar = this.a;
                do {
                    synchronized (zm2.i) {
                        joh johVar = (joh) snh.f(kohVar.a);
                        ceeVar = johVar.c;
                        i = johVar.d;
                        Unit unit = Unit.a;
                    }
                    ceeVar.getClass();
                    gee h2 = ceeVar.h();
                    Object it3 = kohVar.b.iterator();
                    while (((n4) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((pdi) it3).next();
                        if (W0.contains(entry.getValue())) {
                            h2.remove(entry.getKey());
                            z = true;
                        }
                    }
                    Unit unit2 = Unit.a;
                    cee g = h2.g();
                    if (!Intrinsics.c(g, ceeVar)) {
                        joh johVar2 = kohVar.a;
                        synchronized (snh.c) {
                            h = snh.h();
                            a = koh.a((joh) snh.w(johVar2, kohVar, h), i, g);
                        }
                        snh.l(h, kohVar);
                    }
                    return z;
                } while (!a);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        cee ceeVar;
        int i;
        nnh h;
        boolean a;
        cee ceeVar2;
        int i2;
        nnh h2;
        boolean a2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int c = sub.c(k13.r(collection2, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                koh kohVar = this.a;
                do {
                    synchronized (zm2.i) {
                        joh johVar = (joh) snh.f(kohVar.a);
                        ceeVar = johVar.c;
                        i = johVar.d;
                        Unit unit = Unit.a;
                    }
                    ceeVar.getClass();
                    gee h3 = ceeVar.h();
                    Object it = kohVar.b.iterator();
                    while (((n4) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((pdi) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            h3.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    Unit unit2 = Unit.a;
                    cee g = h3.g();
                    if (!Intrinsics.c(g, ceeVar)) {
                        joh johVar2 = kohVar.a;
                        synchronized (snh.c) {
                            h = snh.h();
                            a = koh.a((joh) snh.w(johVar2, kohVar, h), i, g);
                        }
                        snh.l(h, kohVar);
                    }
                    return z;
                } while (!a);
                return z;
            case 1:
                return a(collection);
            default:
                Set W0 = CollectionsKt.W0(collection);
                koh kohVar2 = this.a;
                do {
                    synchronized (zm2.i) {
                        joh johVar3 = (joh) snh.f(kohVar2.a);
                        ceeVar2 = johVar3.c;
                        i2 = johVar3.d;
                        Unit unit3 = Unit.a;
                    }
                    ceeVar2.getClass();
                    gee h4 = ceeVar2.h();
                    Object it2 = kohVar2.b.iterator();
                    while (((n4) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((pdi) it2).next();
                        if (!W0.contains(entry3.getValue())) {
                            h4.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    Unit unit4 = Unit.a;
                    cee g2 = h4.g();
                    if (!Intrinsics.c(g2, ceeVar2)) {
                        joh johVar4 = kohVar2.a;
                        synchronized (snh.c) {
                            h2 = snh.h();
                            a2 = koh.a((joh) snh.w(johVar4, kohVar2, h2), i2, g2);
                        }
                        snh.l(h2, kohVar2);
                    }
                    return z;
                } while (!a2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return rfo.M(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return rfo.N(this, objArr);
    }
}
