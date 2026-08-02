package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʈ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0287 {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m170(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (!z) {
                sb.append(StringFog.decrypt("LqM=\n", "AoPHab2h+fo=\n"));
            }
            if (obj instanceof String) {
                sb.append(StringFog.decrypt("lw==\n", "tZLX+26f22I=\n"));
                sb.append(obj);
                sb.append(StringFog.decrypt("fg==\n", "XJ3yXvP2N9A=\n"));
            } else {
                sb.append(obj);
            }
            i++;
            z = false;
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int hashCode() {
        return getClass().hashCode();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C1068 m171(C0950 c0950, C1102 c1102) {
        C1068 mo133 = mo133(c0950, c1102);
        if (mo133 == null) {
            return mo133;
        }
        Object obj = mo133.f3367;
        return obj instanceof AbstractC0287 ? ((AbstractC0287) obj).m171(c0950, c1102) : mo133;
    }

    /* renamed from: ﾒ */
    public abstract C1068 mo133(C0950 c0950, C1102 c1102);
}
