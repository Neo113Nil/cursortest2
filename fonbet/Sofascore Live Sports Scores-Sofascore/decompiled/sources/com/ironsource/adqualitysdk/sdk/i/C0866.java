package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵥ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0866 extends AbstractC0475 {
    static {
        StringFog.decrypt("pza2gkJvPe++PrSQWWU=\n", "0VPE8SsAU6w=\n");
        StringFog.decrypt("RORFbo+HzOlR6F9IkA==\n", "I4ExL+Prn50=\n");
        StringFog.decrypt("OyP7Rwp/VuE7I/dLB2dn7Dk1\n", "XEaPBmYTBIQ=\n");
        StringFog.decrypt("vxWbaa1ieSSKFYhKvF1rJLsY\n", "2HDvL8QQClA=\n");
        StringFog.decrypt("bPJih0oD2H1o8Ve4UAD+dlb1V7RNFA==\n", "BYEl3SNzmxI=\n");
        StringFog.decrypt("2Bmb8cqoi5PPD7/Ezqiqgs4Vlvk=\n", "vHz4nqfY+fY=\n");
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static int m523(ArrayList arrayList) {
        return AbstractC1067.m635((String) AbstractC0475.m295(arrayList, 0, String.class), (String) AbstractC0475.m295(arrayList, 1, String.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static boolean m524(ArrayList arrayList) {
        return AbstractC1067.m634((String) AbstractC0475.m295(arrayList, 0, String.class));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m525(ArrayList arrayList) {
        String str = (String) AbstractC0475.m295(arrayList, 0, String.class);
        boolean booleanValue = arrayList.size() > 2 ? ((Boolean) AbstractC0475.m295(arrayList, 2, Boolean.class)).booleanValue() : true;
        if (arrayList.get(1) instanceof String) {
            return AbstractC1067.m637(str, (String) AbstractC0475.m295(arrayList, 1, String.class), booleanValue);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC0475.m295(arrayList, 1, List.class));
        for (int i = 0; i < jSONArray.length(); i++) {
            String m637 = AbstractC1067.m637(str, jSONArray.optString(i), booleanValue);
            if (m637 != null) {
                return m637;
            }
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m526(ArrayList arrayList) {
        Object m295 = AbstractC0475.m295(arrayList, 0, Object.class);
        List list = (List) AbstractC0475.m295(arrayList, 1, List.class);
        int intValue = ((Integer) AbstractC0475.m295(arrayList, 2, Integer.class)).intValue();
        C1050 c1050 = C0267.m139().f487;
        c1050.getClass();
        C1052 c1052 = new C1052();
        C1091 c1091 = new C1091();
        C1103 c1103 = c1091.f3400;
        c1103.f3471 = -1;
        c1103.f3470 = -1;
        c1103.f3469 = -1;
        c1103.f3473 = -1;
        c1091.f3399 = c1052;
        c1091.f3398 = null;
        c1103.f3477 = list;
        c1103.f3476 = intValue;
        c1103.f3479 = C1052.class;
        c1103.f3478 = null;
        C1087 c1087 = new C1087(c1091);
        c1087.f3391 = true;
        c1050.m625(m295, c1087, 0, (C1179) null);
        return new ArrayList(c1087.f3390);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static ArrayList m527(ArrayList arrayList) {
        String str = (String) AbstractC0475.m295(arrayList, 0, String.class);
        if (arrayList.get(1) instanceof String) {
            return AbstractC1067.m633(str, (String) AbstractC0475.m295(arrayList, 1, String.class), false);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC0475.m295(arrayList, 1, List.class));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList2.addAll(AbstractC1067.m633(str, jSONArray.optString(i), false));
        }
        return arrayList2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m528(ArrayList arrayList) {
        return AbstractC1067.m636((String) AbstractC0475.m295(arrayList, 0, String.class));
    }
}
