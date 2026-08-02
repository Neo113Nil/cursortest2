package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ر, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0475 {
    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m294(List list, int i, Class cls) {
        Object obj = list.get(i);
        return obj == null || cls.isAssignableFrom(obj.getClass());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m295(List list, int i, Class cls) {
        Object obj = list.get(i);
        if (obj == null || cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        throw new ClassCastException(StringFog.decrypt("s1JcsJuP2YmRQEb+\n", "8DMy3vT7+eo=\n") + obj.getClass().getName() + StringFog.decrypt("ZXds7Q==\n", "RQMDzeuC84E=\n") + cls.getName());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static List m296(List list, int i) {
        return (list.size() <= i || !m294(list, i, List.class)) ? new ArrayList() : (List) m295(list, i, List.class);
    }
}
