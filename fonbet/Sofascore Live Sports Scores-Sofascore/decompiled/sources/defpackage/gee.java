package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class gee extends w6 implements Map, iia {
    public cee a;
    public ug5 b = new ug5();
    public v0k c;
    public Object d;
    public int e;
    public int f;

    public gee(cee ceeVar) {
        this.a = ceeVar;
        this.c = ceeVar.d;
        this.f = ceeVar.e;
    }

    @Override // defpackage.w6
    public final Set a() {
        return new kee(0, this);
    }

    @Override // defpackage.w6
    public final Set c() {
        return new kee(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = v0k.e;
        h(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.w6
    public final int d() {
        return this.f;
    }

    @Override // defpackage.w6
    public final Collection e() {
        return new otb(this, 2);
    }

    /* renamed from: f */
    public cee g() {
        v0k v0kVar = this.c;
        cee ceeVar = this.a;
        if (v0kVar != ceeVar.d) {
            this.b = new ug5();
            ceeVar = new cee(this.c, this.f);
        }
        this.a = ceeVar;
        return ceeVar;
    }

    public /* bridge */ cee g() {
        return g();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final void h(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        cee ceeVar = null;
        cee ceeVar2 = map instanceof cee ? (cee) map : null;
        if (ceeVar2 == null) {
            gee geeVar = map instanceof gee ? (gee) map : null;
            if (geeVar != null) {
                ceeVar = geeVar.g();
            }
        } else {
            ceeVar = ceeVar2;
        }
        if (ceeVar == null) {
            super.putAll(map);
            return;
        }
        hx4 hx4Var = new hx4();
        hx4Var.a = 0;
        int i = this.f;
        this.c = this.c.m(ceeVar.d, 0, hx4Var, this);
        int i2 = (ceeVar.e + i) - hx4Var.a;
        if (i != i2) {
            h(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f;
        v0k o = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (o == null) {
            o = v0k.e;
        }
        this.c = o;
        return i != this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        v0k n = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n == null) {
            n = v0k.e;
        }
        this.c = n;
        return this.d;
    }
}
