package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public final class c0 extends d0<m.b<Object>, Object> {
    @Override // androidx.datastore.preferences.protobuf.d0
    public final void f() {
        if (!this.d) {
            for (int i = 0; i < this.b.size(); i++) {
                c(i).getKey().getClass();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((m.b) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.f();
    }

    @Override // androidx.datastore.preferences.protobuf.d0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
