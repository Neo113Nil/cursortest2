package kotlin.coroutines;

import Sc.r;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/coroutines/h;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/d;", "", "result", "Ljava/lang/Object;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h<T> implements d<T>, kotlin.coroutines.jvm.internal.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f71772b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<h<?>, Object> f71773c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<T> f71774a;
    private volatile Object result;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/coroutines/h$a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public h(@NotNull d delegate, Wc.a aVar) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f71774a = delegate;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        Wc.a aVar = Wc.a.UNDECIDED;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f71773c;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            if (J.d.f(atomicReferenceFieldUpdater, this, aVar, aVar2)) {
                return aVar2;
            }
            obj = this.result;
        }
        if (obj == Wc.a.RESUMED) {
            return Wc.a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof r.b) {
            throw ((r.b) obj).f26107a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final kotlin.coroutines.jvm.internal.d getCallerFrame() {
        d<T> dVar = this.f71774a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.d) {
            return (kotlin.coroutines.jvm.internal.d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public final CoroutineContext getContext() {
        return this.f71774a.getContext();
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            Wc.a aVar = Wc.a.UNDECIDED;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater = f71773c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<h<?>, Object> atomicReferenceFieldUpdater2 = f71773c;
            Wc.a aVar3 = Wc.a.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f71774a.resumeWith(obj);
            return;
        }
    }

    @NotNull
    public final String toString() {
        return "SafeContinuation for " + this.f71774a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@NotNull d<? super T> delegate) {
        this(delegate, Wc.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
