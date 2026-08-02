package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.httpflags.HttpFlagsLoader;
import org.chromium.net.httpflags.ResolvedFlags;
import org.chromium.net.impl.CronetLogger;

/* loaded from: classes10.dex */
public final class HttpFlagsForImpl {
    public static ResolvedFlags getHttpFlags(Context context, CronetLogger.CronetSource source) {
        return HttpFlagsLoader.getHttpFlags(context, ImplVersion.getCronetVersion(), false, CronetManifest.isAppOptedInForTelemetry(context, source));
    }
}
