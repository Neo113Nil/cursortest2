package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57512b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f57511a = i11;
        this.f57512b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57511a) {
            case 0:
                AFd1hSDK.AFInAppEventParameterName((AFd1hSDK) this.f57512b);
                break;
            default:
                ((io.sentry.android.core.internal.util.a) this.f57512b).X();
                break;
        }
    }
}
