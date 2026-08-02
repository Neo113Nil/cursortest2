package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class dio extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ fio b;

    public /* synthetic */ dio(fio fioVar, int i) {
        this.a = i;
        this.b = fioVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        fio fioVar = this.b;
        switch (i) {
            case 0:
                fioVar.clear();
                break;
            default:
                fioVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        fio fioVar = this.b;
        switch (i) {
            case 0:
                Map j = fioVar.j();
                if (j != null) {
                    return j.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int n = fioVar.n(entry.getKey());
                    if (n != -1 && Objects.equals(fioVar.h()[n], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return fioVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        fio fioVar = this.b;
        switch (i) {
            case 0:
                Map j = fioVar.j();
                return j != null ? j.entrySet().iterator() : new cio(fioVar, 1);
            default:
                Map j2 = fioVar.j();
                return j2 != null ? j2.keySet().iterator() : new cio(fioVar, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        fio fioVar = this.b;
        switch (i) {
            case 0:
                Map j = fioVar.j();
                if (j == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!fioVar.i()) {
                            int l = fioVar.l();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = fioVar.a;
                            Objects.requireNonNull(obj2);
                            int P = w1a.P(key, value, l, obj2, fioVar.d(), fioVar.g(), fioVar.h());
                            if (P != -1) {
                                fioVar.k(P, l);
                                fioVar.f--;
                                fioVar.e += 32;
                                break;
                            }
                        }
                    }
                    break;
                } else {
                    break;
                }
            default:
                Map j2 = fioVar.j();
                if (j2 == null) {
                    if (fioVar.o(obj) == fio.j) {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        fio fioVar = this.b;
        switch (i) {
        }
        return fioVar.size();
    }
}
