package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class v implements u {
    @Override // androidx.datastore.preferences.protobuf.u
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.j()) {
                mapFieldLite = mapFieldLite.l();
            }
            mapFieldLite.i();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final t.a<?, ?> b(Object obj) {
        return ((t) obj).a;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final Object c(Object obj) {
        ((MapFieldLite) obj).k();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final MapFieldLite f() {
        return MapFieldLite.b.l();
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final int g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        t tVar = (t) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            tVar.getClass();
            int n = CodedOutputStream.n(i);
            int a = t.a(tVar.a, key, value);
            i2 += CodedOutputStream.o(a) + a + n;
        }
        return i2;
    }

    @Override // androidx.datastore.preferences.protobuf.u
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).j();
    }
}
