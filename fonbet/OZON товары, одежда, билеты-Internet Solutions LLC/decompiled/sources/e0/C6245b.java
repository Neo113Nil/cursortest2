package e0;

import C.A;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6245b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f61727a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f61728b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f61729c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f61730d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap f61731e;

    static {
        HashMap hashMap = new HashMap();
        f61727a = hashMap;
        HashMap hashMap2 = new HashMap();
        f61728b = hashMap2;
        HashMap hashMap3 = new HashMap();
        f61729c = hashMap3;
        HashMap hashMap4 = new HashMap();
        f61730d = hashMap4;
        HashMap hashMap5 = new HashMap();
        f61731e = hashMap5;
        hashMap.put(8, new HashSet(Collections.singletonList(8)));
        hashMap.put(10, new HashSet(Collections.singletonList(10)));
        hashMap.put(0, new HashSet(Arrays.asList(8, 10)));
        hashMap2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        hashMap2.put(1, new HashSet(Collections.singletonList(0)));
        hashMap2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        hashMap2.put(3, new HashSet(Collections.singletonList(1)));
        hashMap2.put(4, new HashSet(Collections.singletonList(2)));
        hashMap2.put(5, new HashSet(Collections.singletonList(3)));
        hashMap2.put(6, new HashSet(Collections.singletonList(4)));
        hashMap3.put(8, 8);
        hashMap3.put(10, 10);
        hashMap4.put(0, 1);
        hashMap4.put(1, 3);
        hashMap4.put(2, 4);
        hashMap4.put(3, 5);
        hashMap4.put(4, 6);
        HashMap hashMap6 = new HashMap();
        A a11 = A.f4076d;
        hashMap6.put(a11, 1);
        A a12 = A.f4077e;
        hashMap6.put(a12, 2);
        A a13 = A.f4078f;
        hashMap6.put(a13, 4096);
        A a14 = A.f4079g;
        hashMap6.put(a14, 8192);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(a11, 1);
        hashMap7.put(a12, 2);
        hashMap7.put(a13, 4096);
        hashMap7.put(a14, 8192);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(a11, 1);
        hashMap8.put(a12, 4);
        hashMap8.put(a13, 4096);
        hashMap8.put(a14, 16384);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(A.f4080h, 256);
        hashMap9.put(A.f4081i, Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE));
        hashMap5.put("video/hevc", hashMap6);
        hashMap5.put("video/av01", hashMap7);
        hashMap5.put("video/x-vnd.on2.vp9", hashMap8);
        hashMap5.put("video/dolby-vision", hashMap9);
    }

    public static int a(@NonNull String str, @NonNull A a11) {
        Integer num;
        Map map = (Map) f61731e.get(str);
        if (map == null || (num = (Integer) map.get(a11)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public static boolean b(@NonNull InterfaceC5086c0.c cVar, @NonNull A a11) {
        int b11 = cVar.b();
        Set set = (Set) f61727a.get(Integer.valueOf(a11.a()));
        if (set == null || !set.contains(Integer.valueOf(b11))) {
            return false;
        }
        int g10 = cVar.g();
        Set set2 = (Set) f61728b.get(Integer.valueOf(a11.b()));
        return set2 != null && set2.contains(Integer.valueOf(g10));
    }
}
