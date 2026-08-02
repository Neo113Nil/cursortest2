package bg;

import androidx.core.view.g0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class f implements Iterator, KMappedMarker {

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f3205b;

    /* renamed from: d, reason: collision with root package name */
    public Object f3207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Sequence f3208e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3204a = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f3206c = -1;

    public f(g gVar) {
        this.f3208e = gVar;
        this.f3205b = new g0(gVar.f3209a);
    }

    public void a() {
        Object next;
        g gVar = (g) this.f3208e;
        do {
            Iterator it = this.f3205b;
            if (!it.hasNext()) {
                this.f3206c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) gVar.f3211c.invoke(next)).booleanValue() != gVar.f3210b);
        this.f3207d = next;
        this.f3206c = 1;
    }

    public void c() {
        Iterator it = this.f3205b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((r) this.f3208e).f3225c.invoke(next)).booleanValue()) {
                this.f3206c = 1;
                this.f3207d = next;
                return;
            }
        }
        this.f3206c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3204a) {
            case 0:
                if (this.f3206c == -1) {
                    a();
                }
                if (this.f3206c == 1) {
                }
                break;
            default:
                if (this.f3206c == -1) {
                    c();
                }
                if (this.f3206c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3204a) {
            case 0:
                if (this.f3206c == -1) {
                    a();
                }
                if (this.f3206c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f3207d;
                this.f3207d = null;
                this.f3206c = -1;
                return obj;
            default:
                if (this.f3206c == -1) {
                    c();
                }
                if (this.f3206c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.f3207d;
                this.f3207d = null;
                this.f3206c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3204a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(r rVar) {
        this.f3208e = rVar;
        this.f3205b = ((Sequence) rVar.f3224b).iterator();
    }
}
