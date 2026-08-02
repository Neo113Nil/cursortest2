package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class koh implements qdi, Map, iia {
    public joh a;
    public final tnh b;
    public final tnh c;
    public final tnh d;

    public koh() {
        cee ceeVar = cee.f;
        nnh h = snh.h();
        joh johVar = new joh(h.g(), ceeVar);
        if (!(h instanceof d09)) {
            johVar.b = new joh(1L, ceeVar);
        }
        this.a = johVar;
        this.b = new tnh(this, 0);
        this.c = new tnh(this, 1);
        this.d = new tnh(this, 2);
    }

    public static boolean a(joh johVar, int i, cee ceeVar) {
        boolean z;
        synchronized (zm2.i) {
            int i2 = johVar.d;
            if (i2 == i) {
                johVar.c = ceeVar;
                z = true;
                johVar.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.qdi
    public final void c(sdi sdiVar) {
        this.a = (joh) sdiVar;
    }

    @Override // java.util.Map
    public final void clear() {
        nnh h;
        cee ceeVar = ((joh) snh.f(this.a)).c;
        cee ceeVar2 = cee.f;
        if (ceeVar2 != ceeVar) {
            joh johVar = this.a;
            synchronized (snh.c) {
                h = snh.h();
                joh johVar2 = (joh) snh.w(johVar, this, h);
                synchronized (zm2.i) {
                    johVar2.c = ceeVar2;
                    johVar2.d++;
                }
            }
            snh.l(h, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return e().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return e().c.containsValue(obj);
    }

    @Override // defpackage.qdi
    public final sdi d() {
        return this.a;
    }

    public final joh e() {
        return (joh) snh.s(this.a, this);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return e().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return e().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        cee ceeVar;
        int i;
        Object put;
        nnh h;
        boolean a;
        do {
            synchronized (zm2.i) {
                joh johVar = (joh) snh.f(this.a);
                ceeVar = johVar.c;
                i = johVar.d;
                Unit unit = Unit.a;
            }
            ceeVar.getClass();
            gee h2 = ceeVar.h();
            put = h2.put(obj, obj2);
            cee g = h2.g();
            if (Intrinsics.c(g, ceeVar)) {
                break;
            }
            joh johVar2 = this.a;
            synchronized (snh.c) {
                h = snh.h();
                a = a((joh) snh.w(johVar2, this, h), i, g);
            }
            snh.l(h, this);
        } while (!a);
        return put;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        cee ceeVar;
        int i;
        nnh h;
        boolean a;
        do {
            synchronized (zm2.i) {
                joh johVar = (joh) snh.f(this.a);
                ceeVar = johVar.c;
                i = johVar.d;
                Unit unit = Unit.a;
            }
            ceeVar.getClass();
            gee h2 = ceeVar.h();
            h2.putAll(map);
            cee g = h2.g();
            if (Intrinsics.c(g, ceeVar)) {
                return;
            }
            joh johVar2 = this.a;
            synchronized (snh.c) {
                h = snh.h();
                a = a((joh) snh.w(johVar2, this, h), i, g);
            }
            snh.l(h, this);
        } while (!a);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        cee ceeVar;
        int i;
        V remove;
        nnh h;
        boolean a;
        do {
            synchronized (zm2.i) {
                joh johVar = (joh) snh.f(this.a);
                ceeVar = johVar.c;
                i = johVar.d;
                Unit unit = Unit.a;
            }
            ceeVar.getClass();
            gee h2 = ceeVar.h();
            remove = h2.remove(obj);
            cee g = h2.g();
            if (Intrinsics.c(g, ceeVar)) {
                break;
            }
            joh johVar2 = this.a;
            synchronized (snh.c) {
                h = snh.h();
                a = a((joh) snh.w(johVar2, this, h), i, g);
            }
            snh.l(h, this);
        } while (!a);
        return remove;
    }

    @Override // java.util.Map
    public final int size() {
        return e().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((joh) snh.f(this.a)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
