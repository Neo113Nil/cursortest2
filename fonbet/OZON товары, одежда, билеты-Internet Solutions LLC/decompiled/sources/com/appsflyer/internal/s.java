package com.appsflyer.internal;

import io.sentry.ILogger;
import io.sentry.android.core.F;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f57522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f57523b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57524c;

    public /* synthetic */ s(int i11, Object obj, Object obj2) {
        this.f57522a = i11;
        this.f57523b = obj;
        this.f57524c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f57522a) {
            case 0:
                ((AFi1iSDK) this.f57523b).AFInAppEventParameterName((Runnable) this.f57524c);
                break;
            default:
                ((F) this.f57523b).k((ILogger) this.f57524c);
                break;
        }
    }
}
