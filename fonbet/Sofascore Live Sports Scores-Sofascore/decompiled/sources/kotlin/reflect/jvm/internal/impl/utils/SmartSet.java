package kotlin.reflect.jvm.internal.impl.utils;

import defpackage.eia;
import defpackage.i5k;
import defpackage.ph0;
import defpackage.r4;
import defpackage.sub;
import defpackage.yhk;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SmartSet<T> extends AbstractSet<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private Object data;
    private int size;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class ArrayIterator<T> implements Iterator<T>, eia {

        @NotNull
        private final Iterator<T> arrayIterator;

        public ArrayIterator(@NotNull T[] tArr) {
            tArr.getClass();
            this.arrayIterator = new r4(tArr);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.arrayIterator.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.arrayIterator.next();
        }

        @Override // java.util.Iterator
        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class SingletonIterator<T> implements Iterator<T>, eia {
        private final T element;
        private boolean hasNext = true;

        public SingletonIterator(T t) {
            this.element = t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.hasNext) {
                this.hasNext = false;
                return this.element;
            }
            yhk.d();
            return null;
        }

        @Override // java.util.Iterator
        @NotNull
        public Void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ SmartSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public static final <T> SmartSet<T> create() {
        return Companion.create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.HashSet, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        Object[] objArr;
        if (size() == 0) {
            this.data = t;
        } else if (size() != 1) {
            int size = size();
            Object obj = this.data;
            if (size < 5) {
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                if (ph0.v(objArr2, t)) {
                    return false;
                }
                if (size() == 4) {
                    Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
                    ?? linkedHashSet = new LinkedHashSet(sub.c(copyOf.length));
                    ph0.S(copyOf, linkedHashSet);
                    linkedHashSet.add(t);
                    objArr = linkedHashSet;
                } else {
                    Object[] copyOf2 = Arrays.copyOf(objArr2, size() + 1);
                    copyOf2[copyOf2.length - 1] = t;
                    objArr = copyOf2;
                }
                this.data = objArr;
            } else {
                obj.getClass();
                if (!i5k.d(obj).add(t)) {
                    return false;
                }
            }
        } else {
            if (Intrinsics.c(this.data, t)) {
                return false;
            }
            this.data = new Object[]{this.data, t};
        }
        setSize(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.data = null;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.c(this.data, obj);
        }
        int size = size();
        Object obj2 = this.data;
        if (size < 5) {
            obj2.getClass();
            return ph0.v((Object[]) obj2, obj);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new SingletonIterator(this.data);
        }
        int size = size();
        Object obj = this.data;
        if (size < 5) {
            obj.getClass();
            return new ArrayIterator((Object[]) obj);
        }
        obj.getClass();
        return i5k.d(obj).iterator();
    }

    public void setSize(int i) {
        this.size = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> SmartSet<T> create(@NotNull Collection<? extends T> collection) {
            collection.getClass();
            SmartSet<T> smartSet = new SmartSet<>(null);
            smartSet.addAll(collection);
            return smartSet;
        }

        private Companion() {
        }

        @NotNull
        public final <T> SmartSet<T> create() {
            return new SmartSet<>(null);
        }
    }

    private SmartSet() {
    }
}
