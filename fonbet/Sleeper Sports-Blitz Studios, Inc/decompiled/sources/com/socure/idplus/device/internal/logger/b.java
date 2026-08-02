package com.socure.idplus.device.internal.logger;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class b {
    public static void a(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a aVar = a.f870a;
    }

    public static void b(String tag, String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        a aVar = a.f870a;
        Log.e(tag, msg);
    }
}
