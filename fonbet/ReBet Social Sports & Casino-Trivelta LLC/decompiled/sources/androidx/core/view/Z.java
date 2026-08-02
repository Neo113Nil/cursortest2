package androidx.core.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes.dex */
public final class Z implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f19179a;

    /* renamed from: b, reason: collision with root package name */
    public final List f19180b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Iterator f19181c;

    public Z(Iterator it, Function1 function1) {
        this.f19179a = function1;
        this.f19181c = it;
    }

    public final void a(Object obj) {
        Iterator it = (Iterator) this.f19179a.invoke(obj);
        if (it != null && it.hasNext()) {
            this.f19180b.add(this.f19181c);
            this.f19181c = it;
        } else {
            while (!this.f19181c.hasNext() && !this.f19180b.isEmpty()) {
                this.f19181c = (Iterator) CollectionsKt.last(this.f19180b);
                CollectionsKt.removeLast(this.f19180b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19181c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f19181c.next();
        a(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
