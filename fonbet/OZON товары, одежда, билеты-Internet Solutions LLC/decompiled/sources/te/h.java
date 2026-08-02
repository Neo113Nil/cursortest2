package te;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private int f99451a;

    /* renamed from: b, reason: collision with root package name */
    private Object f99452b;

    /* loaded from: classes10.dex */
    private static class a<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private static final a f99453a = new a();

        public static <T> a<T> a() {
            return f99453a;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes10.dex */
    private class b extends c<E> {

        /* renamed from: b, reason: collision with root package name */
        private final int f99454b;

        public b() {
            this.f99454b = ((AbstractList) h.this).modCount;
        }

        @Override // te.h.c
        protected final void a() {
            h hVar = h.this;
            int i11 = ((AbstractList) hVar).modCount;
            int i12 = this.f99454b;
            if (i11 == i12) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((AbstractList) hVar).modCount + "; expected: " + i12);
        }

        @Override // java.util.Iterator
        public final void remove() {
            a();
            h.this.clear();
        }
    }

    /* loaded from: classes10.dex */
    private static abstract class c<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f99456a;

        protected abstract void a();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f99456a;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f99456a) {
                throw new NoSuchElementException();
            }
            this.f99456a = true;
            a();
            return (T) h.this.f99452b;
        }
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i11 == 2 || i11 == 3) {
            objArr[1] = "iterator";
        } else if (i11 == 5 || i11 == 6 || i11 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e11) {
        int i11 = this.f99451a;
        if (i11 == 0) {
            this.f99452b = e11;
        } else if (i11 == 1) {
            this.f99452b = new Object[]{this.f99452b, e11};
        } else {
            Object[] objArr = (Object[]) this.f99452b;
            int length = objArr.length;
            if (i11 >= length) {
                int a11 = U7.i.a(length, 3, 2, 1);
                int i12 = i11 + 1;
                if (a11 < i12) {
                    a11 = i12;
                }
                Object[] objArr2 = new Object[a11];
                this.f99452b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f99451a] = e11;
        }
        this.f99451a++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f99452b = null;
        this.f99451a = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i11) {
        int i12;
        if (i11 >= 0 && i11 < (i12 = this.f99451a)) {
            return i12 == 1 ? (E) this.f99452b : (E) ((Object[]) this.f99452b)[i11];
        }
        StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
        f7.append(this.f99451a);
        throw new IndexOutOfBoundsException(f7.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public final Iterator<E> iterator() {
        int i11 = this.f99451a;
        if (i11 == 0) {
            return a.a();
        }
        if (i11 == 1) {
            return new b();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i11) {
        int i12;
        E e11;
        if (i11 < 0 || i11 >= (i12 = this.f99451a)) {
            StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
            f7.append(this.f99451a);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 == 1) {
            e11 = (E) this.f99452b;
            this.f99452b = null;
        } else {
            Object[] objArr = (Object[]) this.f99452b;
            Object obj = objArr[i11];
            if (i12 == 2) {
                this.f99452b = objArr[1 - i11];
            } else {
                int i13 = (i12 - i11) - 1;
                if (i13 > 0) {
                    System.arraycopy(objArr, i11 + 1, objArr, i11, i13);
                }
                objArr[this.f99451a - 1] = null;
            }
            e11 = (E) obj;
        }
        this.f99451a--;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i11, E e11) {
        int i12;
        if (i11 < 0 || i11 >= (i12 = this.f99451a)) {
            StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
            f7.append(this.f99451a);
            throw new IndexOutOfBoundsException(f7.toString());
        }
        if (i12 == 1) {
            E e12 = (E) this.f99452b;
            this.f99452b = e11;
            return e12;
        }
        Object[] objArr = (Object[]) this.f99452b;
        E e13 = (E) objArr[i11];
        objArr[i11] = e11;
        return e13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f99451a;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super E> comparator) {
        int i11 = this.f99451a;
        if (i11 >= 2) {
            Arrays.sort((Object[]) this.f99452b, 0, i11, comparator);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public final <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            a(4);
            throw null;
        }
        int length = tArr.length;
        int i11 = this.f99451a;
        if (i11 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f99452b;
                return tArr2;
            }
            tArr[0] = this.f99452b;
        } else {
            if (length < i11) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f99452b, i11, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                a(6);
                throw null;
            }
            if (i11 != 0) {
                System.arraycopy(this.f99452b, 0, tArr, 0, i11);
            }
        }
        int i12 = this.f99451a;
        if (length > i12) {
            tArr[i12] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i11, E e11) {
        int i12;
        if (i11 >= 0 && i11 <= (i12 = this.f99451a)) {
            if (i12 == 0) {
                this.f99452b = e11;
            } else if (i12 == 1 && i11 == 0) {
                this.f99452b = new Object[]{e11, this.f99452b};
            } else {
                Object[] objArr = new Object[i12 + 1];
                if (i12 == 1) {
                    objArr[0] = this.f99452b;
                } else {
                    Object[] objArr2 = (Object[]) this.f99452b;
                    System.arraycopy(objArr2, 0, objArr, 0, i11);
                    System.arraycopy(objArr2, i11, objArr, i11 + 1, this.f99451a - i11);
                }
                objArr[i11] = e11;
                this.f99452b = objArr;
            }
            this.f99451a++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder f7 = P4.f.f(i11, "Index: ", ", Size: ");
        f7.append(this.f99451a);
        throw new IndexOutOfBoundsException(f7.toString());
    }
}
