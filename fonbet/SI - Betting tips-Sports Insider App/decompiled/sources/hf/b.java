package hf;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements ListIterator, KMutableListIterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10591a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f10592b;

    /* renamed from: c, reason: collision with root package name */
    public int f10593c;

    /* renamed from: d, reason: collision with root package name */
    public int f10594d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.collections.h f10595e;

    public b(e list, int i5) {
        int i10;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f10595e = list;
        this.f10592b = i5;
        this.f10593c = -1;
        i10 = ((AbstractList) list).modCount;
        this.f10594d = i10;
    }

    public void a() {
        int i5;
        i5 = ((AbstractList) ((c) this.f10595e).f10600e).modCount;
        if (i5 != this.f10594d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i5;
        int i10;
        switch (this.f10591a) {
            case 0:
                a();
                c cVar = (c) this.f10595e;
                int i11 = this.f10592b;
                this.f10592b = i11 + 1;
                cVar.add(i11, obj);
                this.f10593c = -1;
                i5 = ((AbstractList) cVar).modCount;
                this.f10594d = i5;
                break;
            default:
                c();
                e eVar = (e) this.f10595e;
                int i12 = this.f10592b;
                this.f10592b = i12 + 1;
                eVar.add(i12, obj);
                this.f10593c = -1;
                i10 = ((AbstractList) eVar).modCount;
                this.f10594d = i10;
                break;
        }
    }

    public void c() {
        int i5;
        i5 = ((AbstractList) ((e) this.f10595e)).modCount;
        if (i5 != this.f10594d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f10591a) {
            case 0:
                if (this.f10592b < ((c) this.f10595e).f10598c) {
                }
                break;
            default:
                if (this.f10592b < ((e) this.f10595e).f10604b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f10591a) {
            case 0:
                if (this.f10592b > 0) {
                }
                break;
            default:
                if (this.f10592b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f10591a) {
            case 0:
                a();
                int i5 = this.f10592b;
                c cVar = (c) this.f10595e;
                if (i5 >= cVar.f10598c) {
                    throw new NoSuchElementException();
                }
                this.f10592b = i5 + 1;
                this.f10593c = i5;
                return cVar.f10596a[cVar.f10597b + i5];
            default:
                c();
                int i10 = this.f10592b;
                e eVar = (e) this.f10595e;
                if (i10 >= eVar.f10604b) {
                    throw new NoSuchElementException();
                }
                this.f10592b = i10 + 1;
                this.f10593c = i10;
                return eVar.f10603a[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f10591a) {
        }
        return this.f10592b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f10591a) {
            case 0:
                a();
                int i5 = this.f10592b;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i5 - 1;
                this.f10592b = i10;
                this.f10593c = i10;
                c cVar = (c) this.f10595e;
                return cVar.f10596a[cVar.f10597b + i10];
            default:
                c();
                int i11 = this.f10592b;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f10592b = i12;
                this.f10593c = i12;
                return ((e) this.f10595e).f10603a[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i5;
        switch (this.f10591a) {
            case 0:
                i5 = this.f10592b;
                break;
            default:
                i5 = this.f10592b;
                break;
        }
        return i5 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i5;
        int i10;
        switch (this.f10591a) {
            case 0:
                c cVar = (c) this.f10595e;
                a();
                int i11 = this.f10593c;
                if (i11 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.c(i11);
                this.f10592b = this.f10593c;
                this.f10593c = -1;
                i5 = ((AbstractList) cVar).modCount;
                this.f10594d = i5;
                return;
            default:
                e eVar = (e) this.f10595e;
                c();
                int i12 = this.f10593c;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                eVar.c(i12);
                this.f10592b = this.f10593c;
                this.f10593c = -1;
                i10 = ((AbstractList) eVar).modCount;
                this.f10594d = i10;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f10591a) {
            case 0:
                a();
                int i5 = this.f10593c;
                if (i5 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f10595e).set(i5, obj);
                return;
            default:
                c();
                int i10 = this.f10593c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((e) this.f10595e).set(i10, obj);
                return;
        }
    }

    public b(c list, int i5) {
        int i10;
        Intrinsics.checkNotNullParameter(list, "list");
        this.f10595e = list;
        this.f10592b = i5;
        this.f10593c = -1;
        i10 = ((AbstractList) list).modCount;
        this.f10594d = i10;
    }
}
