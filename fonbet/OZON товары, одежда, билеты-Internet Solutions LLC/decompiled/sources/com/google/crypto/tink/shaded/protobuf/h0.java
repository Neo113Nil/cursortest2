package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5913t;
import com.google.crypto.tink.shaded.protobuf.i0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class h0 extends i0<Object, Object> {
    @Override // com.google.crypto.tink.shaded.protobuf.i0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i0
    public final void r() {
        if (!q()) {
            for (int i11 = 0; i11 < n(); i11++) {
                ((C5913t.b) ((i0.c) m(i11)).getKey()).getClass();
            }
            Iterator it = o().iterator();
            while (it.hasNext()) {
                ((C5913t.b) ((Map.Entry) it.next()).getKey()).getClass();
            }
        }
        super.r();
    }
}
