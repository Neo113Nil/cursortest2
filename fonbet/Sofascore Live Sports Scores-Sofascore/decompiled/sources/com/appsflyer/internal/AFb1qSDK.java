package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.sofascore.model.mvvm.model.Season;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFb1qSDK {
    public final String[] AFKeystoreWrapper;

    public AFb1qSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.AFKeystoreWrapper = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str == null || !compile.matcher(str).matches()) {
                AFLogger.INSTANCE.w(LogTag.GENERAL, "Invalid partner name: ".concat(String.valueOf(str)));
            } else {
                arrayList.add(str.toLowerCase(Locale.ROOT));
            }
        }
        if (arrayList.contains(Season.YEAR_ALL_TIME)) {
            this.AFKeystoreWrapper = new String[]{Season.YEAR_ALL_TIME};
        } else if (arrayList.isEmpty()) {
            this.AFKeystoreWrapper = null;
        } else {
            this.AFKeystoreWrapper = (String[]) arrayList.toArray(new String[0]);
        }
    }
}
