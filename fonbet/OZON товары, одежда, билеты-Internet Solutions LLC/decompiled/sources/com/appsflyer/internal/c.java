package com.appsflyer.internal;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements AFf1cSDK {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f57505a;

    public /* synthetic */ c(Object obj) {
        this.f57505a = obj;
    }

    @Override // com.appsflyer.internal.AFf1cSDK
    public void onRemoteConfigUpdateFinished(AFf1gSDK aFf1gSDK) {
        ((AFb1tSDK) this.f57505a).AFKeystoreWrapper(aFf1gSDK);
    }
}
