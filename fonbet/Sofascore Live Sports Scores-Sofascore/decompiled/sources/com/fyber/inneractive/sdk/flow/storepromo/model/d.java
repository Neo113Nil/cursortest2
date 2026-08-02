package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.h;
import defpackage.dmi;
import java.text.DecimalFormat;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d {
    public final String a;
    public final String b;
    public final String c;

    public d(String str, String str2, String str3) {
        String y;
        this.c = "";
        this.a = str;
        this.b = str2;
        h hVar = new h(str3);
        if (hVar.a == null) {
            y = "N/A";
        } else {
            double longValue = r11.longValue() / 1024.0d;
            double d = longValue / 1024.0d;
            double d2 = d / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            y = d > 850.0d ? dmi.y(decimalFormat.format(d2), " GB") : longValue > 850.0d ? dmi.y(decimalFormat.format(d), " MB") : hVar.a.longValue() > 850 ? dmi.y(decimalFormat.format(longValue), " kB") : dmi.y(decimalFormat.format(hVar.a), " bytes");
        }
        this.c = y;
    }
}
