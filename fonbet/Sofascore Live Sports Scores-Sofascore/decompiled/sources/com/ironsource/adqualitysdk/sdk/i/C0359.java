package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.τ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0359 extends AbstractC0475 {
    static {
        StringFog.decrypt("RCFvgnyLp1VH\n", "I0Qbzxn/zzo=\n");
        StringFog.decrypt("XCFqxaXunzVfNw==\n", "O0QeiMCa91o=\n");
        StringFog.decrypt("Ef39yoWMjm4G5/fPtYylSQfm9M+Umw==\n", "co+Yq/Hpwws=\n");
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m210(ArrayList arrayList) {
        C0460 c0460 = (C0460) AbstractC0475.m295(arrayList, 1, C0460.class);
        return arrayList.get(0) instanceof Class ? AbstractC0453.m275((Class) AbstractC0475.m295(arrayList, 0, Class.class), c0460) : AbstractC0453.m275(AbstractC0475.m295(arrayList, 0, Object.class).getClass(), c0460);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m212(ArrayList arrayList) {
        C0460 c0460 = (C0460) AbstractC0475.m295(arrayList, 1, C0460.class);
        if (arrayList.get(0) instanceof Class) {
            ArrayList m275 = AbstractC0453.m275((Class) AbstractC0475.m295(arrayList, 0, Class.class), c0460);
            if (m275.isEmpty()) {
                return null;
            }
            return (Method) m275.get(0);
        }
        ArrayList m2752 = AbstractC0453.m275(AbstractC0475.m295(arrayList, 0, Object.class).getClass(), c0460);
        if (m2752.isEmpty()) {
            return null;
        }
        return (Method) m2752.get(0);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C0476 m211() {
        return new C0476();
    }
}
