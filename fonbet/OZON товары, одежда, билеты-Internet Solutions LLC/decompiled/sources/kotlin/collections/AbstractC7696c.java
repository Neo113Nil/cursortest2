package kotlin.collections;

import Am.C2438a;
import B0.A0;
import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b'\u0018\u0000 \u0006*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lkotlin/collections/c;", "E", "Lkotlin/collections/a;", "", "<init>", "()V", "a", "b", "c", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7696c<E> extends AbstractC7694a<E> implements List<E> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/c$a;", "", "", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(int i11, int i12) {
            if (i11 < 0 || i11 >= i12) {
                throw new IndexOutOfBoundsException(A0.a(i11, i12, "index: ", ", size: "));
            }
        }

        public static void b(int i11, int i12) {
            if (i11 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException(A0.a(i11, i12, "index: ", ", size: "));
            }
        }

        public static void c(int i11, int i12, int i13) {
            if (i11 < 0 || i12 > i13) {
                StringBuilder a11 = C2438a.a("fromIndex: ", i11, ", toIndex: ", ", size: ", i12);
                a11.append(i13);
                throw new IndexOutOfBoundsException(a11.toString());
            }
            if (i11 > i12) {
                throw new IllegalArgumentException(A0.a(i11, i12, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int d(int i11, int i12) {
            int i13 = i11 + (i11 >> 1);
            if (i13 - i12 < 0) {
                i13 = i12;
            }
            return i13 - 2147483639 > 0 ? i12 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i13;
        }
    }

    /* renamed from: kotlin.collections.c$b */
    private class b implements Iterator<E>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private int f71713a;

        public b() {
        }

        protected final int b() {
            return this.f71713a;
        }

        protected final void c(int i11) {
            this.f71713a = i11;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f71713a < AbstractC7696c.this.getSize();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i11 = this.f71713a;
            this.f71713a = i11 + 1;
            return AbstractC7696c.this.get(i11);
        }

        public int nextIndex() {
            return b();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    /* loaded from: classes10.dex */
    private class C1185c extends AbstractC7696c<E>.b implements ListIterator<E> {
        public C1185c(int i11) {
            super();
            Companion companion = AbstractC7696c.INSTANCE;
            int size = AbstractC7696c.this.getSize();
            companion.getClass();
            Companion.b(i11, size);
            c(i11);
        }

        @Override // java.util.ListIterator
        public final void add(E e11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            c(b() - 1);
            return AbstractC7696c.this.get(b());
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.c$d */
    /* loaded from: classes10.dex */
    private static final class d<E> extends AbstractC7696c<E> implements RandomAccess {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC7696c<E> f71716b;

        /* renamed from: c, reason: collision with root package name */
        private final int f71717c;

        /* renamed from: d, reason: collision with root package name */
        private int f71718d;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@NotNull AbstractC7696c<? extends E> list, int i11, int i12) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f71716b = list;
            this.f71717c = i11;
            Companion companion = AbstractC7696c.INSTANCE;
            int size = list.getSize();
            companion.getClass();
            Companion.c(i11, i12, size);
            this.f71718d = i12 - i11;
        }

        @Override // java.util.List
        public final E get(int i11) {
            Companion companion = AbstractC7696c.INSTANCE;
            int i12 = this.f71718d;
            companion.getClass();
            Companion.a(i11, i12);
            return this.f71716b.get(this.f71717c + i11);
        }

        @Override // kotlin.collections.AbstractC7694a
        public final int getSize() {
            return this.f71718d;
        }
    }

    protected AbstractC7696c() {
    }

    @Override // java.util.List
    public final void add(int i11, E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Intrinsics.checkNotNullParameter(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.d(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(this, "c");
        Iterator<E> it = iterator();
        int i11 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i11 = (i11 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i11;
    }

    public int indexOf(E e11) {
        Iterator<E> it = iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (Intrinsics.d(it.next(), e11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e11) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.d(listIterator.previous(), e11)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new C1185c(0);
    }

    @Override // java.util.List
    public final E remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i11, E e11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List<E> subList(int i11, int i12) {
        return new d(this, i11, i12);
    }

    @NotNull
    public ListIterator<E> listIterator(int i11) {
        return new C1185c(i11);
    }
}
