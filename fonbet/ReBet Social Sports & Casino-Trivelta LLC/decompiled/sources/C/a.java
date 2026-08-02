package C;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public List f1024a;

    /* renamed from: b, reason: collision with root package name */
    public int f1025b;

    @NotNull
    private Object[] content;

    /* renamed from: C.a$a, reason: collision with other inner class name */
    public static final class C0027a implements List, KMutableList {

        /* renamed from: a, reason: collision with root package name */
        public final a f1026a;

        public C0027a(a aVar) {
            this.f1026a = aVar;
        }

        public int a() {
            return this.f1026a.l();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f1026a.b(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f1026a.d(i10, collection);
        }

        public Object b(int i10) {
            C.b.c(this, i10);
            return this.f1026a.r(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f1026a.g();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1026a.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f1026a.i(collection);
        }

        @Override // java.util.List
        public Object get(int i10) {
            C.b.c(this, i10);
            return this.f1026a.k()[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f1026a.m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f1026a.n();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f1026a.o(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f1026a.q(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f1026a.s(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            C.b.c(this, i10);
            return this.f1026a.t(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            C.b.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f1026a.a(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f1026a.e(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f1026a.p(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }
    }

    public static final class b implements List, KMutableList {

        /* renamed from: a, reason: collision with root package name */
        public final List f1027a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1028b;

        /* renamed from: c, reason: collision with root package name */
        public int f1029c;

        public b(List list, int i10, int i11) {
            this.f1027a = list;
            this.f1028b = i10;
            this.f1029c = i11;
        }

        public int a() {
            return this.f1029c - this.f1028b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f1027a;
            int i10 = this.f1029c;
            this.f1029c = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f1027a.addAll(i10 + this.f1028b, collection);
            this.f1029c += collection.size();
            return collection.size() > 0;
        }

        public Object b(int i10) {
            C.b.c(this, i10);
            this.f1029c--;
            return this.f1027a.remove(i10 + this.f1028b);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f1029c - 1;
            int i11 = this.f1028b;
            if (i11 <= i10) {
                while (true) {
                    this.f1027a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f1029c = this.f1028b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f1029c;
            for (int i11 = this.f1028b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f1027a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            C.b.c(this, i10);
            return this.f1027a.get(i10 + this.f1028b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f1029c;
            for (int i11 = this.f1028b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f1027a.get(i11), obj)) {
                    return i11 - this.f1028b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f1029c == this.f1028b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f1029c - 1;
            int i11 = this.f1028b;
            if (i11 > i10) {
                return -1;
            }
            while (!Intrinsics.areEqual(this.f1027a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f1028b;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f1029c;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f1029c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f1029c;
            int i11 = i10 - 1;
            int i12 = this.f1028b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f1027a.get(i11))) {
                        this.f1027a.remove(i11);
                        this.f1029c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f1029c;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            C.b.c(this, i10);
            return this.f1027a.set(i10 + this.f1028b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            C.b.d(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f1027a.add(i10 + this.f1028b, obj);
            this.f1029c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f1029c;
            for (int i11 = this.f1028b; i11 < i10; i11++) {
                if (Intrinsics.areEqual(this.f1027a.get(i11), obj)) {
                    this.f1027a.remove(i11);
                    this.f1029c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return CollectionToArray.toArray(this, objArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f1027a.addAll(this.f1029c, collection);
            this.f1029c += collection.size();
            return collection.size() > 0;
        }
    }

    public static final class c implements ListIterator, KMutableListIterator {

        /* renamed from: a, reason: collision with root package name */
        public final List f1030a;

        /* renamed from: b, reason: collision with root package name */
        public int f1031b;

        public c(List list, int i10) {
            this.f1030a = list;
            this.f1031b = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f1030a.add(this.f1031b, obj);
            this.f1031b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f1031b < this.f1030a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f1031b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f1030a;
            int i10 = this.f1031b;
            this.f1031b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f1031b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f1031b - 1;
            this.f1031b = i10;
            return this.f1030a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f1031b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f1031b - 1;
            this.f1031b = i10;
            this.f1030a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f1030a.set(this.f1031b, obj);
        }
    }

    public a(Object[] objArr, int i10) {
        this.content = objArr;
        this.f1025b = i10;
    }

    public final void a(int i10, Object obj) {
        j(this.f1025b + 1);
        Object[] objArr = this.content;
        int i11 = this.f1025b;
        if (i10 != i11) {
            ArraysKt.copyInto(objArr, objArr, i10 + 1, i10, i11);
        }
        objArr[i10] = obj;
        this.f1025b++;
    }

    public final boolean b(Object obj) {
        j(this.f1025b + 1);
        Object[] objArr = this.content;
        int i10 = this.f1025b;
        objArr[i10] = obj;
        this.f1025b = i10 + 1;
        return true;
    }

    public final boolean c(int i10, a aVar) {
        if (aVar.n()) {
            return false;
        }
        j(this.f1025b + aVar.f1025b);
        Object[] objArr = this.content;
        int i11 = this.f1025b;
        if (i10 != i11) {
            ArraysKt.copyInto(objArr, objArr, aVar.f1025b + i10, i10, i11);
        }
        ArraysKt.copyInto(aVar.content, objArr, i10, 0, aVar.f1025b);
        this.f1025b += aVar.f1025b;
        return true;
    }

    public final boolean d(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        j(this.f1025b + collection.size());
        Object[] objArr = this.content;
        if (i10 != this.f1025b) {
            ArraysKt.copyInto(objArr, objArr, collection.size() + i10, i10, this.f1025b);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            objArr[i11 + i10] = obj;
            i11 = i12;
        }
        this.f1025b += collection.size();
        return true;
    }

    public final boolean e(Collection collection) {
        return d(this.f1025b, collection);
    }

    public final List f() {
        List list = this.f1024a;
        if (list != null) {
            return list;
        }
        C0027a c0027a = new C0027a(this);
        this.f1024a = c0027a;
        return c0027a;
    }

    public final void g() {
        Object[] objArr = this.content;
        int l10 = l();
        while (true) {
            l10--;
            if (-1 >= l10) {
                this.f1025b = 0;
                return;
            }
            objArr[l10] = null;
        }
    }

    public final boolean h(Object obj) {
        int l10 = l() - 1;
        if (l10 >= 0) {
            for (int i10 = 0; !Intrinsics.areEqual(k()[i10], obj); i10++) {
                if (i10 != l10) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!h(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void j(int i10) {
        Object[] objArr = this.content;
        if (objArr.length < i10) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i10, objArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final Object[] k() {
        return this.content;
    }

    public final int l() {
        return this.f1025b;
    }

    public final int m(Object obj) {
        int i10 = this.f1025b;
        if (i10 <= 0) {
            return -1;
        }
        Object[] objArr = this.content;
        int i11 = 0;
        while (!Intrinsics.areEqual(obj, objArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean n() {
        return this.f1025b == 0;
    }

    public final int o(Object obj) {
        int i10 = this.f1025b;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.content;
        while (!Intrinsics.areEqual(obj, objArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean p(Object obj) {
        int m10 = m(obj);
        if (m10 < 0) {
            return false;
        }
        r(m10);
        return true;
    }

    public final boolean q(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f1025b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p(it.next());
        }
        return i10 != this.f1025b;
    }

    public final Object r(int i10) {
        Object[] objArr = this.content;
        Object obj = objArr[i10];
        if (i10 != l() - 1) {
            ArraysKt.copyInto(objArr, objArr, i10, i10 + 1, this.f1025b);
        }
        int i11 = this.f1025b - 1;
        this.f1025b = i11;
        objArr[i11] = null;
        return obj;
    }

    public final boolean s(Collection collection) {
        int i10 = this.f1025b;
        for (int l10 = l() - 1; -1 < l10; l10--) {
            if (!collection.contains(k()[l10])) {
                r(l10);
            }
        }
        return i10 != this.f1025b;
    }

    public final Object t(int i10, Object obj) {
        Object[] objArr = this.content;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void u(Comparator comparator) {
        ArraysKt.sortWith(this.content, comparator, 0, this.f1025b);
    }
}
