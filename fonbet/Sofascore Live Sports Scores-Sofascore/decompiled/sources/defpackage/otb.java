package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class otb extends u6 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ otb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // defpackage.u6
    public final int c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ltb) obj).i;
            case 1:
                return ((fee) obj).f;
            case 2:
                return ((gee) obj).f;
            default:
                return ((vee) obj).d.d();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
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
            case 2:
                ((gee) obj).clear();
                break;
            default:
                ((vee) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((ltb) obj2).containsValue(obj);
            case 1:
                return ((fee) obj2).containsValue(obj);
            case 2:
                return ((gee) obj2).containsValue(obj);
            default:
                return ((vee) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ltb) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new itb((ltb) obj, 2);
            case 1:
                fee feeVar = (fee) obj;
                w0k[] w0kVarArr = new w0k[8];
                while (i2 < 8) {
                    w0kVarArr[i2] = new x0k(2);
                    i2++;
                }
                return new mee(feeVar, w0kVarArr);
            case 2:
                gee geeVar = (gee) obj;
                w0k[] w0kVarArr2 = new w0k[8];
                while (i2 < 8) {
                    w0kVarArr2[i2] = new y0k(2);
                    i2++;
                }
                return new nee(geeVar, w0kVarArr2);
            default:
                return new wee((vee) obj, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                ltb ltbVar = (ltb) this.b;
                ltbVar.g();
                int l = ltbVar.l(obj);
                if (l < 0) {
                    return false;
                }
                ltbVar.o(l);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((ltb) this.b).g();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
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
