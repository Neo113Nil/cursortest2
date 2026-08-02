package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jee extends x6 {
    public final /* synthetic */ int a;
    public final w6 b;

    public /* synthetic */ jee(w6 w6Var, int i) {
        this.a = i;
        this.b = w6Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        w6 w6Var = this.b;
        switch (i) {
            case 0:
                ((fee) w6Var).clear();
                break;
            default:
                ((vee) w6Var).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.a;
        w6 w6Var = this.b;
        switch (i) {
            case 0:
                fee feeVar = (fee) w6Var;
                Object obj2 = feeVar.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                if (entry.getValue() != null || !feeVar.containsKey(entry.getKey())) {
                    return false;
                }
                break;
            default:
                vee veeVar = (vee) w6Var;
                Object obj3 = veeVar.get(entry.getKey());
                if (obj3 != null) {
                    return obj3.equals(entry.getValue());
                }
                if (entry.getValue() != null) {
                    return false;
                }
                if (!veeVar.d.containsKey(entry.getKey())) {
                    return false;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.x6
    public final int d() {
        int i = this.a;
        w6 w6Var = this.b;
        switch (i) {
            case 0:
                return ((fee) w6Var).f;
            default:
                return ((vee) w6Var).d.d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        w6 w6Var = this.b;
        switch (i) {
            case 0:
                return new lee((fee) w6Var);
            default:
                return new wee((vee) w6Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.a;
        w6 w6Var = this.b;
        switch (i) {
            case 0:
                return ((fee) w6Var).remove(entry.getKey(), entry.getValue());
            default:
                return ((vee) w6Var).remove(entry.getKey(), entry.getValue());
        }
    }
}
