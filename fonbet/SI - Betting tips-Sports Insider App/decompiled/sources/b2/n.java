package b2;

import b6.p;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;
import s.o;
import y1.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f3019a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3020b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f3021c;

    public n(p pVar) {
        this.f3021c = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3019a + 1 < ((o) this.f3021c.f3080c).g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f3020b = true;
        o oVar = (o) this.f3021c.f3080c;
        int i5 = this.f3019a + 1;
        this.f3019a = i5;
        return (b0) oVar.h(i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f3020b) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        o oVar = (o) this.f3021c.f3080c;
        ((b0) oVar.h(this.f3019a)).f25535c = null;
        int i5 = this.f3019a;
        Object[] objArr = oVar.f22578c;
        Object obj = objArr[i5];
        Object obj2 = s.k.f22566c;
        if (obj != obj2) {
            objArr[i5] = obj2;
            oVar.f22576a = true;
        }
        this.f3019a = i5 - 1;
        this.f3020b = false;
    }
}
