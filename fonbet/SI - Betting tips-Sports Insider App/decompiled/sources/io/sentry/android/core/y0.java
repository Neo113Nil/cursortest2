package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15892b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15893c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15894d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15895e;

    /* renamed from: f, reason: collision with root package name */
    public final String f15896f;

    public y0(NetworkCapabilities networkCapabilities, n0 n0Var, long j) {
        y4.a.C(networkCapabilities, "NetworkCapabilities is required");
        y4.a.C(n0Var, "BuildInfoProvider is required");
        this.f15891a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f15892b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f15893c = signalStrength > -100 ? signalStrength : 0;
        this.f15895e = networkCapabilities.hasTransport(4);
        String w10 = io.sentry.android.core.internal.util.c.w(networkCapabilities);
        this.f15896f = w10 == null ? "" : w10;
        this.f15894d = j;
    }
}
