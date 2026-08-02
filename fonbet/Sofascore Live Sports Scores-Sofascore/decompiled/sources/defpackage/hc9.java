package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hc9 implements ListIterator, eia {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;

    public hc9(SnapshotStateList snapshotStateList, int i) {
        this.a = 3;
        this.e = snapshotStateList;
        this.b = i - 1;
        this.c = -1;
        this.d = j72.C(snapshotStateList);
    }

    public void a() {
        int i;
        i = ((AbstractList) ((vbb) this.e).e).modCount;
        if (i == this.d) {
            return;
        }
        a70.o();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        int i2;
        int i3 = this.a;
        Object obj2 = this.e;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                vbb vbbVar = (vbb) obj2;
                int i4 = this.b;
                this.b = i4 + 1;
                vbbVar.add(i4, obj);
                this.c = -1;
                i = ((AbstractList) vbbVar).modCount;
                this.d = i;
                return;
            case 2:
                c();
                xbb xbbVar = (xbb) obj2;
                int i5 = this.b;
                this.b = i5 + 1;
                xbbVar.add(i5, obj);
                this.c = -1;
                i2 = ((AbstractList) xbbVar).modCount;
                this.d = i2;
                return;
            default:
                d();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                snapshotStateList.add(this.b + 1, obj);
                this.c = -1;
                this.b++;
                this.d = j72.C(snapshotStateList);
                return;
        }
    }

    public void c() {
        int i;
        i = ((AbstractList) ((xbb) this.e)).modCount;
        if (i == this.d) {
            return;
        }
        a70.o();
    }

    public void d() {
        if (j72.C((SnapshotStateList) this.e) == this.d) {
            return;
        }
        a70.o();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                if (this.b < this.d) {
                    break;
                }
                break;
            case 1:
                if (this.b < ((vbb) obj).c) {
                    break;
                }
                break;
            case 2:
                if (this.b < ((xbb) obj).b) {
                    break;
                }
                break;
            default:
                if (this.b < ((SnapshotStateList) obj).size() - 1) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > this.c) {
                }
                break;
            case 1:
                if (this.b > 0) {
                }
                break;
            case 2:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                l0d l0dVar = ((jc9) obj).a;
                int i2 = this.b;
                this.b = i2 + 1;
                Object f = l0dVar.f(i2);
                f.getClass();
                return (wtc) f;
            case 1:
                a();
                int i3 = this.b;
                vbb vbbVar = (vbb) obj;
                if (i3 >= vbbVar.c) {
                    yhk.d();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                return vbbVar.a[vbbVar.b + i3];
            case 2:
                c();
                int i4 = this.b;
                xbb xbbVar = (xbb) obj;
                if (i4 >= xbbVar.b) {
                    yhk.d();
                    return null;
                }
                this.b = i4 + 1;
                this.c = i4;
                return xbbVar.a[i4];
            default:
                d();
                int i5 = this.b + 1;
                this.c = i5;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                j72.K(i5, snapshotStateList.size());
                Object obj2 = snapshotStateList.get(i5);
                this.b = i5;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return this.b - this.c;
            case 1:
                return this.b;
            case 2:
                return this.b;
            default:
                return this.b + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                l0d l0dVar = ((jc9) obj).a;
                int i2 = this.b - 1;
                this.b = i2;
                Object f = l0dVar.f(i2);
                f.getClass();
                return (wtc) f;
            case 1:
                a();
                int i3 = this.b;
                if (i3 <= 0) {
                    yhk.d();
                    return null;
                }
                int i4 = i3 - 1;
                this.b = i4;
                this.c = i4;
                vbb vbbVar = (vbb) obj;
                return vbbVar.a[vbbVar.b + i4];
            case 2:
                c();
                int i5 = this.b;
                if (i5 <= 0) {
                    yhk.d();
                    return null;
                }
                int i6 = i5 - 1;
                this.b = i6;
                this.c = i6;
                return ((xbb) obj).a[i6];
            default:
                d();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                j72.K(this.b, snapshotStateList.size());
                int i7 = this.b;
                this.c = i7;
                this.b--;
                return snapshotStateList.get(i7);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                return (this.b - this.c) - 1;
            case 1:
                i = this.b;
                break;
            case 2:
                i = this.b;
                break;
            default:
                return this.b;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i;
        int i2;
        int i3 = this.a;
        Object obj = this.e;
        switch (i3) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                vbb vbbVar = (vbb) obj;
                a();
                int i4 = this.c;
                if (i4 == -1) {
                    a70.r("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                vbbVar.removeAt(i4);
                this.b = this.c;
                this.c = -1;
                i = ((AbstractList) vbbVar).modCount;
                this.d = i;
                return;
            case 2:
                xbb xbbVar = (xbb) obj;
                c();
                int i5 = this.c;
                if (i5 == -1) {
                    a70.r("Call next() or previous() before removing element from the iterator.");
                    return;
                }
                xbbVar.removeAt(i5);
                this.b = this.c;
                this.c = -1;
                i2 = ((AbstractList) xbbVar).modCount;
                this.d = i2;
                return;
            default:
                d();
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                snapshotStateList.remove(this.c);
                this.b--;
                this.c = -1;
                this.d = j72.C(snapshotStateList);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i2 = this.c;
                if (i2 != -1) {
                    ((vbb) obj2).set(i2, obj);
                    return;
                } else {
                    a70.r("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                c();
                int i3 = this.c;
                if (i3 != -1) {
                    ((xbb) obj2).set(i3, obj);
                    return;
                } else {
                    a70.r("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                d();
                int i4 = this.c;
                if (i4 < 0) {
                    a70.r("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                } else {
                    snapshotStateList.set(i4, obj);
                    this.d = j72.C(snapshotStateList);
                    return;
                }
        }
    }

    public hc9(xbb xbbVar, int i) {
        int i2;
        this.a = 2;
        this.e = xbbVar;
        this.b = i;
        this.c = -1;
        i2 = ((AbstractList) xbbVar).modCount;
        this.d = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hc9(jc9 jc9Var, int i, int i2) {
        this(jc9Var, (i2 & 1) != 0 ? 0 : i, 0, jc9Var.a.b);
        this.a = 0;
    }

    public hc9(jc9 jc9Var, int i, int i2, int i3) {
        this.a = 0;
        this.e = jc9Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public hc9(vbb vbbVar, int i) {
        int i2;
        this.a = 1;
        this.e = vbbVar;
        this.b = i;
        this.c = -1;
        i2 = ((AbstractList) vbbVar).modCount;
        this.d = i2;
    }
}
