package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᐣ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC0623 {
    f2058,
    f2057,
    f2056;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static EnumC0623 m384(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode == 3642) {
            if (str.equals(StringFog.decrypt("a4E=\n", "Ge1rthmckms=\n"))) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode != 96921) {
            if (hashCode == 109261 && str.equals(StringFog.decrypt("DjK0\n", "YF3axRBCHdk=\n"))) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(StringFog.decrypt("X39E\n", "PgsoPkJyFOM=\n"))) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return f2058;
        }
        if (c == 1) {
            return f2057;
        }
        if (c != 2) {
            return null;
        }
        return f2056;
    }
}
