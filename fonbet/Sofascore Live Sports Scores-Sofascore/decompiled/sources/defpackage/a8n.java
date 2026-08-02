package defpackage;

import com.google.android.gms.internal.measurement.zzae;
import com.google.android.gms.internal.measurement.zzas;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a8n implements Iterator {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public final Iterator c;

    public /* synthetic */ a8n(Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b.hasNext()) {
                    return true;
                }
                return this.c.hasNext();
            default:
                return this.b.hasNext() || this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Iterator it = this.c;
        Iterator it2 = this.b;
        switch (i) {
            case 0:
                if (it2.hasNext()) {
                    return new zzas(((Integer) it2.next()).toString());
                }
                if (it.hasNext()) {
                    return new zzas((String) it.next());
                }
                yhk.d();
                return null;
            default:
                return it2.hasNext() ? it2.next() : it.next();
        }
    }

    public a8n(zzae zzaeVar, Iterator it, Iterator it2) {
        this.b = it;
        this.c = it2;
    }
}
