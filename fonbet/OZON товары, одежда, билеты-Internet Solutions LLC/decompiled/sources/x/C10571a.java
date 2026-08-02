package x;

import C.A;
import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C10571a {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap f104639a;

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f104640b;

    static {
        A a11;
        HashMap hashMap = new HashMap();
        f104639a = hashMap;
        HashMap hashMap2 = new HashMap();
        f104640b = hashMap2;
        A a12 = A.f4076d;
        hashMap.put(1L, a12);
        hashMap2.put(a12, Collections.singletonList(1L));
        hashMap.put(2L, A.f4077e);
        hashMap2.put((A) hashMap.get(2L), Collections.singletonList(2L));
        A a13 = A.f4078f;
        hashMap.put(4L, a13);
        hashMap2.put(a13, Collections.singletonList(4L));
        A a14 = A.f4079g;
        hashMap.put(8L, a14);
        hashMap2.put(a14, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            a11 = A.f4080h;
            if (!hasNext) {
                break;
            }
            f104639a.put((Long) it.next(), a11);
        }
        f104640b.put(a11, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            A a15 = A.f4081i;
            if (!hasNext2) {
                f104640b.put(a15, asList2);
                return;
            } else {
                f104639a.put((Long) it2.next(), a15);
            }
        }
    }

    public static Long a(@NonNull A a11, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f104640b.get(a11);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l11 : list) {
            if (supportedProfiles.contains(l11)) {
                return l11;
            }
        }
        return null;
    }

    public static A b(long j11) {
        return (A) f104639a.get(Long.valueOf(j11));
    }
}
