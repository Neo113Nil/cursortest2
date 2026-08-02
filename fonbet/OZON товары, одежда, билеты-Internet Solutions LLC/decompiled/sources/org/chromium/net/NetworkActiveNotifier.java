package org.chromium.net;

import android.net.ConnectivityManager;
import internal.org.jni_zero.CalledByNative;

/* loaded from: classes6.dex */
public final class NetworkActiveNotifier implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f78627a = (ConnectivityManager) org.chromium.base.e.b().getSystemService("connectivity");

    /* renamed from: b, reason: collision with root package name */
    private final long f78628b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78629c;

    private NetworkActiveNotifier(long j11) {
        this.f78628b = j11;
    }

    @CalledByNative
    public static NetworkActiveNotifier build(long j11) {
        return new NetworkActiveNotifier(j11);
    }

    @CalledByNative
    public final void disableNotifications() {
        this.f78629c = false;
        this.f78627a.removeDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public final void enableNotifications() {
        this.f78629c = true;
        this.f78627a.addDefaultNetworkActiveListener(this);
    }

    @CalledByNative
    public final void fakeDefaultNetworkActive() {
        if (this.f78629c) {
            onNetworkActive();
        }
    }

    @CalledByNative
    public final boolean isDefaultNetworkActive() {
        return this.f78627a.isDefaultNetworkActive();
    }

    @Override // android.net.ConnectivityManager.OnNetworkActiveListener
    public final void onNetworkActive() {
        o.a().b(this.f78628b);
    }
}
