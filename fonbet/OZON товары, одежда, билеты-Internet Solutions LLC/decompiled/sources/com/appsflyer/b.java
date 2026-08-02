package com.appsflyer;

import com.appsflyer.internal.AFg1hSDK;
import com.google.firebase.installations.c;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57360b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f57359a = i11;
        this.f57360b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57359a) {
            case 0:
                AFLogger.AFKeystoreWrapper((AFg1hSDK[]) this.f57360b);
                break;
            default:
                c.c((c) this.f57360b);
                break;
        }
    }
}
