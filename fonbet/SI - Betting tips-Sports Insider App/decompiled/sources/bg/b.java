package bg;

import java.util.Iterator;
import kotlin.collections.IndexedValue;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3198a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f3199b;

    /* renamed from: c, reason: collision with root package name */
    public int f3200c;

    public b(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f3199b = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f3198a) {
            case 0:
                break;
            default:
                return this.f3199b.hasNext();
        }
        while (true) {
            int i5 = this.f3200c;
            it = this.f3199b;
            if (i5 > 0 && it.hasNext()) {
                it.next();
                this.f3200c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f3198a) {
            case 0:
                break;
            default:
                int i5 = this.f3200c;
                this.f3200c = i5 + 1;
                if (i5 >= 0) {
                    return new IndexedValue(i5, this.f3199b.next());
                }
                u.j();
                throw null;
        }
        while (true) {
            int i10 = this.f3200c;
            it = this.f3199b;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f3200c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3198a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(c cVar) {
        this.f3199b = cVar.f3201a.iterator();
        this.f3200c = cVar.f3202b;
    }
}
