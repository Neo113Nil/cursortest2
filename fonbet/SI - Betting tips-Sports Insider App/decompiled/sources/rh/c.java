package rh;

import android.util.Log;
import gh.g0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArraySet f22518a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f22519b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = g0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(g0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(nh.h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(jh.e.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f22519b = n0.i(linkedHashMap);
    }

    public static void a(String loggerName, int i5, String message, Throwable th2) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = (String) f22519b.get(loggerName);
        if (str == null) {
            str = d0.z(23, loggerName);
        }
        if (Log.isLoggable(str, i5)) {
            if (th2 != null) {
                message = message + '\n' + Log.getStackTraceString(th2);
            }
            int length = message.length();
            int i10 = 0;
            while (i10 < length) {
                int F = StringsKt.F(message, '\n', i10, false, 4);
                if (F == -1) {
                    F = length;
                }
                while (true) {
                    min = Math.min(F, i10 + 4000);
                    String substring = message.substring(i10, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Log.println(i5, str, substring);
                    if (min >= F) {
                        break;
                    } else {
                        i10 = min;
                    }
                }
                i10 = min + 1;
            }
        }
    }

    public static void b(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f22518a.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(d.f22520a);
        }
    }
}
