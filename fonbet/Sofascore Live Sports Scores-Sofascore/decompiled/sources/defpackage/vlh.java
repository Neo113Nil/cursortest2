package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class vlh implements Iterator {
    public int a;
    public Iterator b;
    public final /* synthetic */ tlh c;

    public vlh(tlh tlhVar) {
        this.c = tlhVar;
        this.a = tlhVar.b.size();
    }

    public final Iterator a() {
        Iterator it = this.b;
        if (it != null) {
            return it;
        }
        Iterator it2 = this.c.f.entrySet().iterator();
        this.b = it2;
        return it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        return (i > 0 && i <= this.c.b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.c.b;
        int i = this.a - 1;
        this.a = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
