package com.vk.im.engine.models;

import java.util.Map;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.jgp;

/* compiled from: PerformanceMetricsConfig.kt */
/* loaded from: classes2.dex */
public final class d {
    public static final d d = new d(ConnectivityTracker.DEFAULT_UPLINK_BITRATE, jgp.b, false);
    public final boolean a;
    public final double b;
    public final Object c;

    /* compiled from: PerformanceMetricsConfig.kt */
    public static final class a {
        public static void a() {
            d dVar = d.d;
        }
    }

    public d(double d2, Map map, boolean z) {
        this.a = z;
        this.b = d2;
        this.c = map;
    }
}
