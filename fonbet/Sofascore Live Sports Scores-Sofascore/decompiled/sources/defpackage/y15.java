package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@x8d("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly15;", "Ly8d;", "Lx15;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y15 extends y8d {
    @Override // defpackage.y8d
    public final s6d a() {
        tc3 tc3Var = bd3.a;
        return new x15(this);
    }

    @Override // defpackage.y8d
    public final void d(List list, u7d u7dVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().h((d6d) it.next());
        }
    }

    @Override // defpackage.y8d
    public final void i(d6d d6dVar, boolean z) {
        b().f(d6dVar, z);
        int b0 = CollectionsKt.b0((Iterable) b().f.a.getValue(), d6dVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.a.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            d6d d6dVar2 = (d6d) obj;
            if (i > b0) {
                b().c(d6dVar2);
            }
            i = i2;
        }
    }
}
