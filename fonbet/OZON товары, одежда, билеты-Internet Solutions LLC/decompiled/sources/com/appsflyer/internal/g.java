package com.appsflyer.internal;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57510b;

    public /* synthetic */ g(Object obj, int i11) {
        this.f57509a = i11;
        this.f57510b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57509a) {
            case 0:
                AFd1hSDK.AFInAppEventType((AFd1hSDK) this.f57510b);
                break;
            case 1:
                FirebaseMessaging.c((FirebaseMessaging) this.f57510b);
                break;
            default:
                ((io.sentry.android.core.internal.modules.a) this.f57510b).a();
                break;
        }
    }
}
