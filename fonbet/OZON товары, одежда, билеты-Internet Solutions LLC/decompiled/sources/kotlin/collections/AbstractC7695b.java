package kotlin.collections;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/b;", "T", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.collections.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7695b<T> implements Iterator<T>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f71707a;

    /* renamed from: b, reason: collision with root package name */
    private T f71708b;

    protected abstract void b();

    protected final void c() {
        this.f71707a = 2;
    }

    protected final void e(T t2) {
        this.f71708b = t2;
        this.f71707a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i11 = this.f71707a;
        if (i11 == 0) {
            this.f71707a = 3;
            b();
            return this.f71707a == 1;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final T next() {
        int i11 = this.f71707a;
        if (i11 == 1) {
            this.f71707a = 0;
            return this.f71708b;
        }
        if (i11 != 2) {
            this.f71707a = 3;
            b();
            if (this.f71707a == 1) {
                this.f71707a = 0;
                return this.f71708b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
