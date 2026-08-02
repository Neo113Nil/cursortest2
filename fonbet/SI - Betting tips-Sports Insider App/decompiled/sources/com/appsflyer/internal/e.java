package com.appsflyer.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4162b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f4161a = i5;
        this.f4162b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4161a) {
            case 0:
                AFb1iSDK.getMediationNetwork((AFb1iSDK) this.f4162b);
                break;
            case 1:
                AFa1ySDK.getMediationNetwork((AFd1zSDK) this.f4162b);
                break;
            default:
                ((AFd1kSDK) this.f4162b).AFAdRevenueData();
                break;
        }
    }
}
