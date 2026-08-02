package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class An implements Cn {
    @Override // io.appmetrica.analytics.impl.Cn
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}
