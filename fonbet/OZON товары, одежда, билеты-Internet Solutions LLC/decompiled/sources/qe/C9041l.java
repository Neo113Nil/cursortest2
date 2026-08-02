package qe;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qe.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9041l extends AbstractC9032c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9041l f81962a = new C9041l(0);

    /* renamed from: qe.l$a */
    public static final class a implements Iterator, InterfaceC6712a {
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // qe.AbstractC9032c
    public final void b(int i11, Object obj) {
        Void value = (Void) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // qe.AbstractC9032c
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        return null;
    }

    @Override // qe.AbstractC9032c
    public final int getSize() {
        return 0;
    }

    @Override // qe.AbstractC9032c, java.lang.Iterable
    @NotNull
    public final Iterator iterator() {
        return new a();
    }
}
