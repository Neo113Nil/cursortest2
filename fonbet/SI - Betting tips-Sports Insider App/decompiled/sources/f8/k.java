package f8;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends t {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9514b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9515c;

    public k(Object obj) {
        super(0);
        this.f9515c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f9514b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9514b) {
            throw new NoSuchElementException();
        }
        this.f9514b = true;
        return this.f9515c;
    }
}
