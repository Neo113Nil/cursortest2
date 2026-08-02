package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xee implements Iterator, eia {
    public Object a;
    public final vee b;
    public Object c = k03.d;
    public boolean d;
    public int e;
    public int f;

    public xee(Object obj, vee veeVar) {
        this.a = obj;
        this.b = veeVar;
        this.e = veeVar.d.e;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final obb next() {
        fee feeVar = this.b.d;
        if (feeVar.e != this.e) {
            a70.o();
            return null;
        }
        if (!hasNext()) {
            yhk.d();
            return null;
        }
        Object obj = this.a;
        this.c = obj;
        this.d = true;
        this.f++;
        Object obj2 = feeVar.get(obj);
        if (obj2 == null) {
            throw new ConcurrentModificationException(mz1.n(new StringBuilder("Hash code of a key ("), this.a, ") has changed after it was added to the persistent map."));
        }
        obb obbVar = (obb) obj2;
        this.a = obbVar.c;
        return obbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f < this.b.d.d();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            zzl.s();
            return;
        }
        Object obj = this.c;
        vee veeVar = this.b;
        i5k.c(veeVar).remove(obj);
        this.c = null;
        this.d = false;
        this.e = veeVar.d.e;
        this.f--;
    }
}
