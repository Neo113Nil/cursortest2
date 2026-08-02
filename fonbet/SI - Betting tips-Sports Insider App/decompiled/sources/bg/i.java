package bg;

import androidx.core.view.e1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class i extends j implements Iterator, Continuation, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public int f3215a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3216b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f3217c;

    /* renamed from: d, reason: collision with root package name */
    public Continuation f3218d;

    @Override // bg.j
    public final void c(Object obj, mf.a frame) {
        this.f3216b = obj;
        this.f3215a = 3;
        this.f3218d = frame;
        lf.a aVar = lf.a.f20034a;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // bg.j
    public final Object d(Iterator it, e1 frame) {
        if (!it.hasNext()) {
            return Unit.f19194a;
        }
        this.f3217c = it;
        this.f3215a = 2;
        this.f3218d = frame;
        lf.a aVar = lf.a.f20034a;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException e() {
        int i5 = this.f3215a;
        if (i5 == 4) {
            return new NoSuchElementException();
        }
        if (i5 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f3215a);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f19227a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i5 = this.f3215a;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2 || i5 == 3) {
                        return true;
                    }
                    if (i5 == 4) {
                        return false;
                    }
                    throw e();
                }
                Iterator it = this.f3217c;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f3215a = 2;
                    return true;
                }
                this.f3217c = null;
            }
            this.f3215a = 5;
            Continuation continuation = this.f3218d;
            Intrinsics.checkNotNull(continuation);
            this.f3218d = null;
            Unit unit = Unit.f19194a;
            gf.o oVar = gf.q.f10031a;
            continuation.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f3215a;
        if (i5 == 0 || i5 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i5 == 2) {
            this.f3215a = 1;
            Iterator it = this.f3217c;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i5 != 3) {
            throw e();
        }
        this.f3215a = 0;
        Object obj = this.f3216b;
        this.f3216b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        h8.b.B(obj);
        this.f3215a = 4;
    }
}
