package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class AFb1qSDK {
    public final String[] getRevenue;

    public AFb1qSDK(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            this.getRevenue = null;
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
        if (arrayList.contains(TtmlNode.COMBINE_ALL)) {
            this.getRevenue = new String[]{TtmlNode.COMBINE_ALL};
        } else if (!arrayList.isEmpty()) {
            this.getRevenue = (String[]) arrayList.toArray(new String[0]);
        } else {
            this.getRevenue = null;
        }
    }
}
