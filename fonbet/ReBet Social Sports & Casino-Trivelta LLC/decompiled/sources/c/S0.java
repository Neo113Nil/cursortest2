package c;

import com.surt.guardian.GuardianSDK;
import com.surt.guardian.utils.Logger;
import kotlin.ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class S0 {

    /* renamed from: a, reason: collision with root package name */
    public static C2438e f26495a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f26496b = "1.0.0";

    public static void a(C2438e c2438e) {
        Intrinsics.checkNotNullParameter(GuardianSDK.VERSION, "version");
        f26495a = c2438e;
        f26496b = GuardianSDK.VERSION;
    }

    public static void b(String context, Throwable error) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.f41582a.b("ErrorReporter", "[" + context + "] " + error.getMessage(), error);
        try {
            C2438e c2438e = f26495a;
            if (c2438e != null) {
                String sdkVersion = f26496b;
                Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
                Intrinsics.checkNotNullParameter(error, "error");
                c2438e.d("sdk_error", sdkVersion, error.getMessage(), ExceptionsKt.stackTraceToString(error), MapsKt.mapOf(TuplesKt.to("context", context)));
            }
        } catch (Exception e10) {
            Logger.f41582a.a("ErrorReporter", "Telemetry reporting failed: " + e10.getMessage());
        }
    }
}
