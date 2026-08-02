package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.n;
import java.util.Iterator;
import java.util.Map;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes13.dex */
public final class c0 extends d0<Object, Object> {
    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public final void f() {
        if (!this.e) {
            for (int i = 0; i < this.c.size(); i++) {
                ((n.b) c(i).getKey()).getClass();
            }
            Iterator<Map.Entry<Object, Object>> it = d().iterator();
            while (it.hasNext()) {
                ((n.b) it.next().getKey()).getClass();
            }
        }
        super.f();
    }
}
