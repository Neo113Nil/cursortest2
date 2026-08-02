package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import java.util.Map;

/* loaded from: classes.dex */
public final class L implements K {
    public static int a(int i10, Object obj, Object obj2) {
        J j10 = (J) obj;
        I i11 = (I) obj2;
        int i12 = 0;
        if (j10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j10.entrySet()) {
            i12 += i11.a(i10, entry.getKey(), entry.getValue());
        }
        return i12;
    }

    public static J b(Object obj, Object obj2) {
        J j10 = (J) obj;
        J j11 = (J) obj2;
        if (!j11.isEmpty()) {
            if (!j10.h()) {
                j10 = j10.k();
            }
            j10.j(j11);
        }
        return j10;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map forMapData(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public I.a forMapMetadata(Object obj) {
        return ((I) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Map forMutableMapData(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        return a(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public boolean isImmutable(Object obj) {
        return !((J) obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object mergeFrom(Object obj, Object obj2) {
        return b(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object newMapField(Object obj) {
        return J.d().k();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public Object toImmutable(Object obj) {
        ((J) obj).i();
        return obj;
    }
}
