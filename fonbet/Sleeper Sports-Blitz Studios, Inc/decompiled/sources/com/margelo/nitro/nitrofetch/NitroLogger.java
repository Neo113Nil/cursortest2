package com.margelo.nitro.nitrofetch;

import android.util.Log;
import com.nimbusds.jose.jwk.JWKParameterNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NitroLogger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\"\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eJ\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/margelo/nitro/nitrofetch/NitroLogger;", "", "<init>", "()V", "enabled", "", "d", "", "tag", "", "msg", "i", "w", "t", "", JWKParameterNames.RSA_EXPONENT, "react-native-nitro-fetch_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroLogger {
    public static final NitroLogger INSTANCE = new NitroLogger();
    public static boolean enabled;

    private NitroLogger() {
    }

    public final void d(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (enabled) {
            Log.d(tag, msg);
        }
    }

    public final void i(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (enabled) {
            Log.i(tag, msg);
        }
    }

    public static /* synthetic */ void w$default(NitroLogger nitroLogger, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        nitroLogger.w(str, str2, th);
    }

    public final void w(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (enabled) {
            Log.w(tag, msg, t);
        }
    }

    public static /* synthetic */ void e$default(NitroLogger nitroLogger, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            th = null;
        }
        nitroLogger.e(str, str2, th);
    }

    public final void e(String tag, String msg, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (enabled) {
            Log.e(tag, msg, t);
        }
    }
}
