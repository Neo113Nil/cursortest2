package com.appsflyer.internal;

import com.appsflyer.internal.AFd1xSDK;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements AFd1xSDK.AFa1vSDK, AFf1mSDK, w7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4158a;

    public /* synthetic */ c(Object obj) {
        this.f4158a = obj;
    }

    @Override // com.appsflyer.internal.AFd1xSDK.AFa1vSDK
    public void onConfigurationChanged(boolean z5) {
        ((AFa1ySDK) this.f4158a).getMediationNetwork(z5);
    }

    @Override // com.appsflyer.internal.AFf1mSDK
    public void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
        ((AFa1ySDK) this.f4158a).AFAdRevenueData(aFf1pSDK);
    }

    @Override // w7.d
    public void onSuccess(Object obj) {
        AFb1cSDK.getMonetizationNetwork((AFb1cSDK) this.f4158a, (q5.a) obj);
    }
}
