package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ntb extends x6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ntb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ltb) obj).clear();
                break;
            case 1:
                ((fee) obj).clear();
                break;
            default:
                ((vee) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((ltb) obj2).containsKey(obj);
            case 1:
                return ((fee) obj2).containsKey(obj);
            default:
                return ((vee) obj2).d.containsKey(obj);
        }
    }

    @Override // defpackage.x6
    public final int d() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ltb) obj).i;
            case 1:
                return ((fee) obj).f;
            default:
                return ((vee) obj).d.d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ltb) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new itb((ltb) obj, 1);
            case 1:
                fee feeVar = (fee) obj;
                w0k[] w0kVarArr = new w0k[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    w0kVarArr[i2] = new x0k(1);
                }
                return new mee(feeVar, w0kVarArr);
            default:
                return new wee((vee) obj, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ltb ltbVar = (ltb) obj2;
                ltbVar.g();
                int k = ltbVar.k(obj);
                if (k >= 0) {
                    ltbVar.o(k);
                    break;
                }
                break;
            case 1:
                fee feeVar = (fee) obj2;
                if (feeVar.containsKey(obj)) {
                    feeVar.remove(obj);
                    break;
                }
                break;
            default:
                vee veeVar = (vee) obj2;
                if (veeVar.d.containsKey(obj)) {
                    veeVar.remove(obj);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((ltb) this.b).g();
                return super.removeAll(collection);
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((ltb) this.b).g();
                break;
        }
        return super.retainAll(collection);
    }
}
