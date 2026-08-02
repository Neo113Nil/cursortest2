package androidx.health.platform.client.proto;

import androidx.health.platform.client.proto.f0;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes12.dex */
public final class h0 implements g0 {
    @Override // androidx.health.platform.client.proto.g0
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

    @Override // androidx.health.platform.client.proto.g0
    public final f0.a<?, ?> b(Object obj) {
        return ((f0) obj).a;
    }

    @Override // androidx.health.platform.client.proto.g0
    public final Object c(Object obj) {
        ((MapFieldLite) obj).k();
        return obj;
    }

    @Override // androidx.health.platform.client.proto.g0
    public final MapFieldLite d(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.health.platform.client.proto.g0
    public final MapFieldLite e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.health.platform.client.proto.g0
    public final MapFieldLite f() {
        return MapFieldLite.b.l();
    }

    @Override // androidx.health.platform.client.proto.g0
    public final int g(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        f0 f0Var = (f0) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            f0Var.getClass();
            int y = CodedOutputStream.y(i);
            int a = f0.a(f0Var.a, key, value);
            i2 += CodedOutputStream.z(a) + a + y;
        }
        return i2;
    }

    @Override // androidx.health.platform.client.proto.g0
    public final boolean h(Object obj) {
        return !((MapFieldLite) obj).j();
    }
}
