package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class N implements M {
    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final L a() {
        return L.e().m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final L forMapData(Object obj) {
        return (L) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final void forMapMetadata(Object obj) {
        ((K) obj).getClass();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final L forMutableMapData(Object obj) {
        return (L) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final int getSerializedSize(int i11, Object obj, Object obj2) {
        L l11 = (L) obj;
        K k11 = (K) obj2;
        if (l11.isEmpty()) {
            return 0;
        }
        Iterator it = l11.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        k11.getClass();
        K.a(i11);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final boolean isImmutable(Object obj) {
        return !((L) obj).i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final L mergeFrom(Object obj, Object obj2) {
        L l11 = (L) obj;
        L l12 = (L) obj2;
        if (!l12.isEmpty()) {
            if (!l11.i()) {
                l11 = l11.m();
            }
            l11.l(l12);
        }
        return l11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public final Object toImmutable(Object obj) {
        ((L) obj).j();
        return obj;
    }
}
