package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class afe implements Iterator, eia {
    public final /* synthetic */ int a;
    public Object b;
    public final Map c;
    public int d;

    public /* synthetic */ afe(Object obj, int i, Map map) {
        this.a = i;
        this.b = obj;
        this.c = map;
    }

    public obb a() {
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        Object obj = this.c.get(this.b);
        if (obj == null) {
            throw new ConcurrentModificationException(mz1.n(new StringBuilder("Hash code of a key ("), this.b, ") has changed after it was added to the persistent map."));
        }
        obb obbVar = (obb) obj;
        this.d++;
        this.b = obbVar.c;
        return obbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Map map = this.c;
        switch (i) {
            case 0:
                if (this.d < map.size()) {
                    break;
                }
                break;
            case 1:
                if (this.d < map.size()) {
                    break;
                }
                break;
            default:
                if (this.d < map.size()) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i = this.a;
        Object obj = null;
        Map map = this.c;
        switch (i) {
            case 0:
                return a();
            case 1:
                if (hasNext()) {
                    obj = this.b;
                    this.d++;
                    Object obj2 = map.get(obj);
                    if (obj2 == null) {
                        throw new ConcurrentModificationException(lnb.m(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.b = ((pbb) obj2).b;
                } else {
                    yhk.d();
                }
                return obj;
            default:
                if (hasNext()) {
                    obj = this.b;
                    this.d++;
                    Object obj3 = map.get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException(lnb.m(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                    }
                    this.b = ((qbb) obj3).b;
                } else {
                    yhk.d();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
