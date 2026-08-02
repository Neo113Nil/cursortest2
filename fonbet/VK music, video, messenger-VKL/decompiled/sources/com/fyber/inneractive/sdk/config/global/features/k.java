package com.fyber.inneractive.sdk.config.global.features;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class k extends i {
    public k() {
        super("load_timeouts");
    }

    public static String a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        Iterator it = Arrays.asList(strArr).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(BundleUtil.UNDERLINE_TAG);
            }
        }
        return sb.toString();
    }

    public static boolean d(String str) {
        return UnitDisplayType.INTERSTITIAL.name().equalsIgnoreCase(str) || UnitDisplayType.REWARDED.name().equalsIgnoreCase(str);
    }

    public static String e(String str) {
        return TextUtils.isEmpty(str) ? "all_mediators" : str.toLowerCase(Locale.US);
    }

    public final int b(String str, String str2) {
        String a = a(str, "bidding", "global_timeout", e(str2));
        String a2 = a(str, "bidding", "global_timeout", "all_mediators");
        int i = d(str) ? 30000 : 10000;
        Integer a3 = a(a(str, "global_timeout", "all_mediators"));
        if (a3 != null) {
            i = a3.intValue();
        }
        Integer a4 = a(a2);
        if (a4 != null) {
            i = a4.intValue();
        }
        Integer a5 = a(a);
        return a5 != null ? a5.intValue() : i;
    }

    public final int c(String str, String str2) {
        String a = a(str, "global_timeout", e(str2));
        String a2 = a(str, "global_timeout", "all_mediators");
        int i = d(str) ? 30000 : 10000;
        Integer a3 = a(a(str, "global_timeout", "all_mediators"));
        if (a3 != null) {
            i = a3.intValue();
        }
        Integer a4 = a(a2);
        if (a4 != null) {
            i = a4.intValue();
        }
        Integer a5 = a(a);
        return a5 != null ? a5.intValue() : i;
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.i
    public final i b() {
        k kVar = new k();
        a(kVar);
        return kVar;
    }
}
