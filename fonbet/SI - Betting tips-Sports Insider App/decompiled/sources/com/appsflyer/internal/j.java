package com.appsflyer.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFd1wSDK f4168b;

    public /* synthetic */ j(AFd1wSDK aFd1wSDK, int i5) {
        this.f4167a = i5;
        this.f4168b = aFd1wSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4167a) {
            case 0:
                AFd1wSDK.getMonetizationNetwork(this.f4168b);
                break;
            case 1:
                AFd1wSDK.getMediationNetwork(this.f4168b);
                break;
            default:
                AFd1wSDK.getRevenue(this.f4168b);
                break;
        }
    }
}
