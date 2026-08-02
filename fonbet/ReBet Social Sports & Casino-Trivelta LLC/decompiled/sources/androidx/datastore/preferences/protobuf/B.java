package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class B implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f19420a;

    public B(Iterator it) {
        this.f19420a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f19420a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f19420a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f19420a.remove();
    }
}
