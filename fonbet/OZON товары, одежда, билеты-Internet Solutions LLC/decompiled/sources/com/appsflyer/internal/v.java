package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57532c;

    public /* synthetic */ v(int i11, Object obj, Object obj2) {
        this.f57530a = i11;
        this.f57531b = obj;
        this.f57532c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57530a) {
            case 0:
                AFi1mSDK.AFInAppEventType((AFi1mSDK) this.f57531b, (Context) this.f57532c);
                break;
            default:
                io.sentry.cache.l.A((io.sentry.cache.l) this.f57531b, (Runnable) this.f57532c);
                break;
        }
    }
}
