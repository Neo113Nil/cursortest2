package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.y;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes12.dex */
public final class y0 extends z0<y.b<Object>, Object> {
    @Override // androidx.health.platform.client.proto.z0
    public final void f() {
        if (!this.d) {
            for (int i = 0; i < this.b.size(); i++) {
                c(i).getKey().getClass();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((y.b) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.f();
    }

    @Override // androidx.health.platform.client.proto.z0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
