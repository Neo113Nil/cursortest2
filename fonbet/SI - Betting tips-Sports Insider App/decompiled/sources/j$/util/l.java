package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class l implements Iterator, y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17752a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f17753b;

    public l(m mVar) {
        this.f17753b = mVar.f17756a.iterator();
    }

    public l(s sVar) {
        this.f17753b = sVar.f17756a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17752a) {
        }
        return this.f17753b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17752a) {
            case 0:
                return this.f17753b.next();
            default:
                return new q((Map.Entry) this.f17753b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17752a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.y
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f17752a) {
            case 0:
                Iterator$EL.forEachRemaining(this.f17753b, consumer);
                break;
            default:
                Iterator$EL.forEachRemaining(this.f17753b, new p(0, consumer));
                break;
        }
    }
}
