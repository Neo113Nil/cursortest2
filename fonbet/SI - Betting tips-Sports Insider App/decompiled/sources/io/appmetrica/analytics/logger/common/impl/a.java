package io.appmetrica.analytics.logger.common.impl;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import v.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {
    public static String a(String str, String str2, Object... objArr) {
        StringBuilder c2 = f.c(str, " ");
        if (str2 == null) {
            str2 = "";
        } else if (objArr != null && objArr.length != 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (Throwable th2) {
                StringBuilder p10 = d9.e.p("Attention!!! Invalid log format. See exception details above. Message: ", str2, "; arguments: ");
                p10.append(Arrays.toString(objArr));
                str2 = p10.toString();
                Log.e("[LogMessageConstructor]", str2, th2);
            }
        }
        Locale locale = Locale.US;
        c2.append("[" + Thread.currentThread().getId() + "-" + Thread.currentThread().getName() + "] " + str2);
        return c2.toString();
    }
}
