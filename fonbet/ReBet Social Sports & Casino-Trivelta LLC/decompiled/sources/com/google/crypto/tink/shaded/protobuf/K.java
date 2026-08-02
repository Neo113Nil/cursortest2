package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class K implements J {
    public static int a(int i10, Object obj, Object obj2) {
        I i11 = (I) obj;
        android.support.v4.media.session.b.a(obj2);
        if (i11.isEmpty()) {
            return 0;
        }
        Iterator it = i11.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static I b(Object obj, Object obj2) {
        I i10 = (I) obj;
        I i11 = (I) obj2;
        if (!i11.isEmpty()) {
            if (!i10.h()) {
                i10 = i10.k();
            }
            i10.j(i11);
        }
        return i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Map forMapData(Object obj) {
        return (I) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public H.a forMapMetadata(Object obj) {
        android.support.v4.media.session.b.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Map forMutableMapData(Object obj) {
        return (I) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public boolean isImmutable(Object obj) {
        return !((I) obj).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object newMapField(Object obj) {
        return I.d().k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object toImmutable(Object obj) {
        ((I) obj).i();
        return obj;
    }
}
