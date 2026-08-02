package kotlin.collections;

import java.io.File;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public int f19197a;

    /* renamed from: b, reason: collision with root package name */
    public File f19198b;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i5 = this.f19197a;
        if (i5 == 0) {
            this.f19197a = 3;
            a();
            return this.f19197a == 1;
        }
        if (i5 == 1) {
            return true;
        }
        if (i5 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f19197a;
        if (i5 == 1) {
            this.f19197a = 0;
            return this.f19198b;
        }
        if (i5 != 2) {
            this.f19197a = 3;
            a();
            if (this.f19197a == 1) {
                this.f19197a = 0;
                return this.f19198b;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
