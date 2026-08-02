package rf;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public String f22513a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bg.k f22515c;

    public o(bg.k kVar) {
        this.f22515c = kVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f22513a == null && !this.f22514b) {
            String readLine = ((BufferedReader) this.f22515c.f3220b).readLine();
            this.f22513a = readLine;
            if (readLine == null) {
                this.f22514b = true;
            }
        }
        return this.f22513a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f22513a;
        this.f22513a = null;
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
