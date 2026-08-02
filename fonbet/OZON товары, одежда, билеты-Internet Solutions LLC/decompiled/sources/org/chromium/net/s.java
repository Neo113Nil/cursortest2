package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
final class s extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final ProxyChangeListener f78957a;

    s(ProxyChangeListener proxyChangeListener) {
        this.f78957a = proxyChangeListener;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PROXY_CHANGE".equals(intent.getAction())) {
            this.f78957a.f(intent);
        }
    }
}
