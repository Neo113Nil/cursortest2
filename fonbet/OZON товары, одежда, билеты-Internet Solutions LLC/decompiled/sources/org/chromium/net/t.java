package org.chromium.net;

import android.content.Intent;
import android.net.ProxyInfo;
import android.os.Bundle;
import org.chromium.net.ProxyChangeListener;

/* loaded from: classes10.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProxyChangeListener.b f78958a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f78959b;

    public /* synthetic */ t(ProxyChangeListener.b bVar, Intent intent) {
        this.f78958a = bVar;
        this.f78959b = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProxyChangeListener.b bVar = this.f78958a;
        Bundle extras = this.f78959b.getExtras();
        ProxyChangeListener.this.d(extras == null ? null : ProxyChangeListener.a.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO")));
    }
}
