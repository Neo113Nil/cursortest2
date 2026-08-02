package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nho implements Iterator {
    public final Iterator a;
    public Collection b = null;
    public Iterator c = vio.a;
    public final /* synthetic */ hjo d;

    public nho(hjo hjoVar) {
        this.d = hjoVar;
        this.a = hjoVar.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.b = collection;
            this.c = collection.iterator();
        }
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
        Collection collection = this.b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        hjo hjoVar = this.d;
        hjoVar.e--;
    }
}
