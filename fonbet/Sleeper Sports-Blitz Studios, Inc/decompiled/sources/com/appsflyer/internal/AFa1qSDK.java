package com.appsflyer.internal;

import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class AFa1qSDK {
    public static Date getMonetizationNetwork(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            return simpleDateFormat.parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
