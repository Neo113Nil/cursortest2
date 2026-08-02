package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.c2;
import io.sentry.g1;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f17158a = Charset.forName("UTF-8");

    public static long a(g1 g1Var, ILogger iLogger, c2 c2Var) {
        try {
            c cVar = new c();
            g1Var.a(c2Var, cVar);
            return cVar.f17157a;
        } catch (Throwable th2) {
            iLogger.e(b5.ERROR, "Could not calculate size of serializable", th2);
            return 0L;
        }
    }

    public static HashMap b(Calendar calendar) {
        HashMap hashMap = new HashMap();
        hashMap.put("year", Integer.valueOf(calendar.get(1)));
        hashMap.put("month", Integer.valueOf(calendar.get(2)));
        hashMap.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        hashMap.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        hashMap.put("minute", Integer.valueOf(calendar.get(12)));
        hashMap.put("second", Integer.valueOf(calendar.get(13)));
        return hashMap;
    }
}
