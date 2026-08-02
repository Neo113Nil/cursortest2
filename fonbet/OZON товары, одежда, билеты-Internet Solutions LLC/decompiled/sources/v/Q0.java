package v;

import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.C5113q;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class Q0 {
    static void a(AbstractC5111p abstractC5111p, ArrayList arrayList) {
        if (abstractC5111p instanceof C5113q.a) {
            Iterator it = ((C5113q.a) abstractC5111p).e().iterator();
            while (it.hasNext()) {
                a((AbstractC5111p) it.next(), arrayList);
            }
        } else if (abstractC5111p instanceof P0) {
            arrayList.add(((P0) abstractC5111p).f());
        } else {
            arrayList.add(new O0(abstractC5111p));
        }
    }
}
