package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.κ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0354 extends AbstractC0475 {
    static {
        StringFog.decrypt("/eFm5BUqsQL8\n", "joQIgFBYw20=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m201(C1102 c1102, ArrayList arrayList) {
        boolean booleanValue;
        JSONObject jSONObject;
        String str = (String) AbstractC0475.m295(arrayList, 0, String.class);
        String str2 = c1102.m651() + StringFog.decrypt("xw==\n", "/R9HO6b3PoA=\n") + Integer.toHexString(str.hashCode());
        Throwable th = (Throwable) AbstractC0475.m295(arrayList, 1, Throwable.class);
        try {
            if (arrayList.size() <= 2) {
                AbstractC0356.m203(c1102.m651(), str, str2, th, null, null, true, false, false);
                return;
            }
            if (AbstractC0475.m294(arrayList, 2, JSONObject.class)) {
                JSONObject jSONObject2 = (JSONObject) AbstractC0475.m295(arrayList, 2, JSONObject.class);
                if (arrayList.size() > 3 && AbstractC0475.m294(arrayList, 3, Boolean.class)) {
                    r1 = ((Boolean) AbstractC0475.m295(arrayList, 3, Boolean.class)).booleanValue();
                }
                jSONObject = jSONObject2;
                booleanValue = r1;
            } else {
                booleanValue = AbstractC0475.m294(arrayList, 2, Boolean.class) ? ((Boolean) AbstractC0475.m295(arrayList, 2, Boolean.class)).booleanValue() : false;
                jSONObject = null;
            }
            AbstractC0356.m203(c1102.m651(), str, str2, th, null, jSONObject, true, false, booleanValue);
        } catch (Throwable unused) {
        }
    }
}
