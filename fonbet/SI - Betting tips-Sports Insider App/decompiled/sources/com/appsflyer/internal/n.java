package com.appsflyer.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1sSDK f4178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f4179c;

    public /* synthetic */ n(AFj1sSDK aFj1sSDK, Runnable runnable, int i5) {
        this.f4177a = i5;
        this.f4178b = aFj1sSDK;
        this.f4179c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4177a) {
            case 0:
                this.f4178b.areAllFieldsValid(this.f4179c);
                break;
            case 1:
                this.f4178b.getMonetizationNetwork(this.f4179c);
                break;
            case 2:
                this.f4178b.AFAdRevenueData(this.f4179c);
                break;
            default:
                this.f4178b.getRevenue(this.f4179c);
                break;
        }
    }
}
