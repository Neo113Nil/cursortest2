package kf;

import gf.p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements Continuation, mf.d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final e f19075b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19076c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final Continuation f19077a;

    @Nullable
    private volatile Object result;

    public f(Continuation delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        lf.a aVar = lf.a.f20035b;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19077a = delegate;
        this.result = aVar;
    }

    public final Object b() {
        Object obj = this.result;
        lf.a aVar = lf.a.f20035b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19076c;
            lf.a aVar2 = lf.a.f20034a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return lf.a.f20034a;
        }
        if (obj == lf.a.f20036c) {
            return lf.a.f20034a;
        }
        if (obj instanceof p) {
            throw ((p) obj).f10030a;
        }
        return obj;
    }

    @Override // mf.d
    public final mf.d getCallerFrame() {
        Continuation continuation = this.f19077a;
        if (continuation instanceof mf.d) {
            return (mf.d) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f19077a.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            lf.a aVar = lf.a.f20035b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19076c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            lf.a aVar2 = lf.a.f20034a;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f19076c;
            lf.a aVar3 = lf.a.f20036c;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f19077a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f19077a;
    }
}
