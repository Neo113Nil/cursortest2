package kotlin.sequences;

import Sc.r;
import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/sequences/j;", "T", "Lkotlin/sequences/k;", "", "Lkotlin/coroutines/d;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class j<T> extends k<T> implements Iterator<T>, kotlin.coroutines.d<Unit>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    private int f71927a;

    /* renamed from: b, reason: collision with root package name */
    private T f71928b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator<? extends T> f71929c;

    /* renamed from: d, reason: collision with root package name */
    private kotlin.coroutines.d<? super Unit> f71930d;

    private final RuntimeException e() {
        int i11 = this.f71927a;
        if (i11 == 4) {
            return new NoSuchElementException();
        }
        if (i11 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f71927a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.sequences.k
    public final Wc.a b(Object obj, @NotNull kotlin.coroutines.jvm.internal.i frame) {
        this.f71928b = obj;
        this.f71927a = 3;
        this.f71930d = frame;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    @Override // kotlin.sequences.k
    public final Object c(@NotNull Iterator<? extends T> it, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        if (!it.hasNext()) {
            return Unit.f71690a;
        }
        this.f71929c = it;
        this.f71927a = 2;
        this.f71930d = frame;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f71771a;
    }

    public final void h(kotlin.coroutines.d<? super Unit> dVar) {
        this.f71930d = dVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i11 = this.f71927a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2 || i11 == 3) {
                        return true;
                    }
                    if (i11 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator<? extends T> it = this.f71929c;
                Intrinsics.f(it);
                if (it.hasNext()) {
                    this.f71927a = 2;
                    return true;
                }
                this.f71929c = null;
            }
            this.f71927a = 5;
            kotlin.coroutines.d<? super Unit> dVar = this.f71930d;
            Intrinsics.f(dVar);
            this.f71930d = null;
            r.Companion companion = Sc.r.INSTANCE;
            dVar.resumeWith(Unit.f71690a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i11 = this.f71927a;
        if (i11 == 0 || i11 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i11 == 2) {
            this.f71927a = 1;
            Iterator<? extends T> it = this.f71929c;
            Intrinsics.f(it);
            return it.next();
        }
        if (i11 != 3) {
            throw e();
        }
        this.f71927a = 0;
        T t2 = this.f71928b;
        this.f71928b = null;
        return t2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        Sc.s.b(obj);
        this.f71927a = 4;
    }
}
