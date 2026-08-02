package com.appsflyer;

import com.appsflyer.internal.AFh1ySDK;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFh1ySDK[] f4129b;

    public /* synthetic */ a(AFh1ySDK[] aFh1ySDKArr, int i5) {
        this.f4128a = i5;
        this.f4129b = aFh1ySDKArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4128a) {
            case 0:
                AFLogger.getMediationNetwork(this.f4129b);
                break;
            default:
                AFLogger.getCurrencyIso4217Code(this.f4129b);
                break;
        }
    }
}
