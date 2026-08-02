package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ll extends HashMap {
    public Ll() {
        put(Jl.UNKNOWN, StartupParamsCallback.Reason.UNKNOWN);
        put(Jl.NETWORK, StartupParamsCallback.Reason.NETWORK);
        put(Jl.PARSE, StartupParamsCallback.Reason.INVALID_RESPONSE);
    }
}
