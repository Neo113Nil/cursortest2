package x;

import C.A;
import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x.c;

/* loaded from: classes8.dex */
final class d implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private final DynamicRangeProfiles f104642a;

    d(@NonNull Object obj) {
        this.f104642a = (DynamicRangeProfiles) obj;
    }

    @NonNull
    private static Set<A> d(@NonNull Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            A b11 = C10571a.b(longValue);
            x2.i.e(b11, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(b11);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // x.c.a
    @NonNull
    public final Set<A> a() {
        return d(this.f104642a.getSupportedProfiles());
    }

    @Override // x.c.a
    public final DynamicRangeProfiles b() {
        return this.f104642a;
    }

    @Override // x.c.a
    @NonNull
    public final Set<A> c(@NonNull A a11) {
        Long a12 = C10571a.a(a11, this.f104642a);
        x2.i.a("DynamicRange is not supported: " + a11, a12 != null);
        return d(this.f104642a.getProfileCaptureRequestConstraints(a12.longValue()));
    }
}
