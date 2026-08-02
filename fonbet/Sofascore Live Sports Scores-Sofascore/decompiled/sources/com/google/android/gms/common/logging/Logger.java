package com.google.android.gms.common.logging;

import android.util.Log;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class Logger {
    public final String a;
    public final String b;
    public final int c;

    public Logger(String str, String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.b = sb;
        this.a = str;
        new GmsLogger(str, null);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public final void a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        this.b.concat(str);
    }
}
