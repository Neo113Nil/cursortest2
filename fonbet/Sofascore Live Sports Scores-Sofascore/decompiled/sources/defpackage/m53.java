package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class m53 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ o53 b;

    public /* synthetic */ m53(o53 o53Var, int i) {
        this.a = i;
        this.b = o53Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        o53 o53Var = this.b;
        switch (i) {
            case 0:
                o53Var.clear();
                break;
            default:
                o53Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        o53 o53Var = this.b;
        switch (i) {
            case 0:
                Map g = o53Var.g();
                if (g != null) {
                    return g.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int i2 = o53Var.i(entry.getKey());
                    if (i2 != -1 && sha.r(o53Var.p()[i2], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return o53Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        o53 o53Var = this.b;
        switch (i) {
            case 0:
                Map g = o53Var.g();
                return g != null ? g.entrySet().iterator() : new l53(o53Var, 1);
            default:
                Map g2 = o53Var.g();
                return g2 != null ? g2.keySet().iterator() : new l53(o53Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        o53 o53Var = this.b;
        switch (i) {
            case 0:
                Map g = o53Var.g();
                if (g == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!o53Var.l()) {
                            int h = o53Var.h();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = o53Var.a;
                            Objects.requireNonNull(obj2);
                            int Z = s02.Z(key, value, h, obj2, o53Var.n(), o53Var.o(), o53Var.p());
                            if (Z != -1) {
                                o53Var.k(Z, h);
                                o53Var.f--;
                                o53Var.e += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map g2 = o53Var.g();
                if (g2 == null) {
                    if (o53Var.m(obj) != o53.j) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        o53 o53Var = this.b;
        switch (i) {
        }
        return o53Var.size();
    }
}
