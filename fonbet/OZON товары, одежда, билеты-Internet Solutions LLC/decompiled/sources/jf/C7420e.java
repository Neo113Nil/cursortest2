package jf;

import E0.C2942q;
import We.E;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: jf.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7420e {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f69982a = new CopyOnWriteArraySet<>();

    /* renamed from: b, reason: collision with root package name */
    private static final Map<String, String> f69983b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f69984c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = E.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = E.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = gf.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = bf.e.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f69983b = U.t(linkedHashMap);
    }

    public static void a(int i11, @NotNull String loggerName, @NotNull String message, Throwable th2) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = f69983b.get(loggerName);
        if (str == null) {
            str = kotlin.text.h.q0(23, loggerName);
        }
        if (Log.isLoggable(str, i11)) {
            if (th2 != null) {
                StringBuilder e11 = C2942q.e(message, "\n");
                e11.append(Log.getStackTraceString(th2));
                message = e11.toString();
            }
            int length = message.length();
            int i12 = 0;
            while (i12 < length) {
                int I11 = kotlin.text.h.I('\n', i12, 4, message);
                if (I11 == -1) {
                    I11 = length;
                }
                while (true) {
                    min = Math.min(I11, i12 + 4000);
                    String substring = message.substring(i12, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i11, str, substring);
                    if (min >= I11) {
                        break;
                    } else {
                        i12 = min;
                    }
                }
                i12 = min + 1;
            }
        }
    }

    public static void b() {
        for (Map.Entry<String, String> entry : f69983b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f69982a.add(logger)) {
                Intrinsics.checkNotNullExpressionValue(logger, "logger");
                logger.setUseParentHandlers(false);
                logger.setLevel(Log.isLoggable(value, 3) ? Level.FINE : Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING);
                logger.addHandler(f.f69985a);
            }
        }
    }
}
