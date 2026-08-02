package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC2149y;
import java.util.List;

/* loaded from: classes.dex */
public final class E implements D {
    public static AbstractC2149y.b d(Object obj, long j10) {
        return (AbstractC2149y.b) p0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void a(Object obj, long j10) {
        d(obj, j10).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public void b(Object obj, Object obj2, long j10) {
        AbstractC2149y.b d10 = d(obj, j10);
        AbstractC2149y.b d11 = d(obj2, j10);
        int size = d10.size();
        int size2 = d11.size();
        if (size > 0 && size2 > 0) {
            if (!d10.isModifiable()) {
                d10 = d10.mutableCopyWithCapacity(size2 + size);
            }
            d10.addAll(d11);
        }
        if (size > 0) {
            d11 = d10;
        }
        p0.O(obj, j10, d11);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public List c(Object obj, long j10) {
        AbstractC2149y.b d10 = d(obj, j10);
        if (d10.isModifiable()) {
            return d10;
        }
        int size = d10.size();
        AbstractC2149y.b mutableCopyWithCapacity = d10.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        p0.O(obj, j10, mutableCopyWithCapacity);
        return mutableCopyWithCapacity;
    }
}
