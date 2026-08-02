package bg;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public Object f3212a;

    /* renamed from: b, reason: collision with root package name */
    public int f3213b = -2;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f3214c;

    public h(r rVar) {
        this.f3214c = rVar;
    }

    public final void a() {
        Object invoke;
        int i5 = this.f3213b;
        r rVar = this.f3214c;
        if (i5 == -2) {
            invoke = ((Function0) rVar.f3224b).invoke();
        } else {
            Function1 function1 = rVar.f3225c;
            Object obj = this.f3212a;
            Intrinsics.checkNotNull(obj);
            invoke = function1.invoke(obj);
        }
        this.f3212a = invoke;
        this.f3213b = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3213b < 0) {
            a();
        }
        return this.f3213b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f3213b < 0) {
            a();
        }
        if (this.f3213b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f3212a;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f3213b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
