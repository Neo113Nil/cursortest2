package org.chromium.net;

import android.net.NetworkCapabilities;

/* loaded from: classes6.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final NetworkCapabilities f78956a;

    p(NetworkCapabilities networkCapabilities) {
        this.f78956a = networkCapabilities;
    }

    public final boolean a(int i11) {
        NetworkCapabilities networkCapabilities = this.f78956a;
        return networkCapabilities != null ? networkCapabilities.hasCapability(i11) : i11 >= 0 && i11 < 64 && (1 << i11) != 0;
    }

    public final boolean b(int i11) {
        NetworkCapabilities networkCapabilities = this.f78956a;
        return networkCapabilities != null ? networkCapabilities.hasTransport(i11) : i11 >= 0 && i11 < 64 && ((long) (1 << i11)) != 0;
    }
}
