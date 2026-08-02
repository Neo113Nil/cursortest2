package te;

import gd.InterfaceC6712a;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC7701h;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.internal.C7721c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i<T> extends AbstractC7701h<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f99457c = 0;

    /* renamed from: a, reason: collision with root package name */
    private Object f99458a;

    /* renamed from: b, reason: collision with root package name */
    private int f99459b;

    /* loaded from: classes10.dex */
    private static final class a<T> implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Iterator<T> f99460a;

        public a(@NotNull T[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f99460a = C7721c.a(array);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f99460a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return this.f99460a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static final class b<T> implements Iterator<T>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        private final T f99461a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f99462b = true;

        public b(T t2) {
            this.f99461a = t2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f99462b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f99462b) {
                throw new NoSuchElementException();
            }
            this.f99462b = false;
            return this.f99461a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t2) {
        Object[] objArr;
        if (getSize() == 0) {
            this.f99458a = t2;
        } else if (getSize() == 1) {
            if (Intrinsics.d(this.f99458a, t2)) {
                return false;
            }
            this.f99458a = new Object[]{this.f99458a, t2};
        } else if (getSize() < 5) {
            Object obj = this.f99458a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr2 = (Object[]) obj;
            if (C7705l.m(objArr2, t2)) {
                return false;
            }
            if (getSize() == 4) {
                ?? b11 = e0.b(Arrays.copyOf(objArr2, objArr2.length));
                b11.add(t2);
                objArr = b11;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, getSize() + 1);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                copyOf[copyOf.length - 1] = t2;
                objArr = copyOf;
            }
            this.f99458a = objArr;
        } else {
            Object obj2 = this.f99458a;
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!U.f(obj2).add(t2)) {
                return false;
            }
        }
        this.f99459b = getSize() + 1;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f99458a = null;
        this.f99459b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (getSize() == 0) {
            return false;
        }
        if (getSize() == 1) {
            return Intrinsics.d(this.f99458a, obj);
        }
        if (getSize() < 5) {
            Object obj2 = this.f99458a;
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C7705l.m((Object[]) obj2, obj);
        }
        Object obj3 = this.f99458a;
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // kotlin.collections.AbstractC7701h
    public final int getSize() {
        return this.f99459b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<T> iterator() {
        int i11 = this.f99459b;
        if (i11 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i11 == 1) {
            return new b(this.f99458a);
        }
        if (i11 < 5) {
            Object obj = this.f99458a;
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f99458a;
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return U.f(obj2).iterator();
    }
}
