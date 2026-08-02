package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class AFc1aSDK {
    public final String[] getCurrencyIso4217Code;

    public AFc1aSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.getCurrencyIso4217Code = null;
            return;
        }
        Pattern compile = Pattern.compile("[\\w]{1,45}");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null && compile.matcher(str).matches()) {
                arrayList.add(str.toLowerCase(Locale.getDefault()));
            } else {
                AFLogger.afWarnLog("Invalid partner name: ".concat(String.valueOf(str)));
            }
        }
        if (arrayList.contains("all")) {
            this.getCurrencyIso4217Code = new String[]{"all"};
        } else if (!arrayList.isEmpty()) {
            this.getCurrencyIso4217Code = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.getCurrencyIso4217Code = null;
        }
    }
}
