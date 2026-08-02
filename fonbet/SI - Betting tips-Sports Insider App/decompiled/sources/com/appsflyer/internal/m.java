package com.appsflyer.internal;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AFj1pSDK f4176b;

    public /* synthetic */ m(AFj1pSDK aFj1pSDK, int i5) {
        this.f4175a = i5;
        this.f4176b = aFj1pSDK;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4175a) {
            case 0:
                this.f4176b.component4();
                break;
            case 1:
                this.f4176b.component2();
                break;
            default:
                this.f4176b.component1();
                break;
        }
    }
}
