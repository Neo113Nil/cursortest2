package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import java.text.DecimalFormat;
import xsna.fo8;

/* loaded from: classes12.dex */
public final class d {
    public final String a;
    public final String b;
    public final String c;

    public d(String str, String str2, String str3) {
        String a;
        this.c = "";
        this.a = str;
        this.b = str2;
        h hVar = new h(str3);
        if (hVar.a == null) {
            a = "N/A";
        } else {
            double longValue = r11.longValue() / 1024.0d;
            double d = longValue / 1024.0d;
            double d2 = d / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            a = d > 850.0d ? fo8.a(decimalFormat.format(d2), " GB") : longValue > 850.0d ? fo8.a(decimalFormat.format(d), " MB") : hVar.a.longValue() > 850 ? fo8.a(decimalFormat.format(longValue), " kB") : fo8.a(decimalFormat.format(hVar.a), " bytes");
        }
        this.c = a;
    }
}
