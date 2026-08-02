package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* loaded from: classes4.dex */
public class L6 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (Exception e) {
            C2556n4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}
