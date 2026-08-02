package androidx.credentials.playservices.controllers.CreatePassword;

import u0.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePasswordController f1499b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1500c;

    public /* synthetic */ a(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, Object obj, int i5) {
        this.f1498a = i5;
        this.f1499b = credentialProviderCreatePasswordController;
        this.f1500c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1498a) {
            case 0:
                CredentialProviderCreatePasswordController$handleResponse$2.invoke$lambda$0(this.f1499b, (c) this.f1500c);
                break;
            default:
                CredentialProviderCreatePasswordController$handleResponse$3.invoke$lambda$0(this.f1499b, (t0.c) this.f1500c);
                break;
        }
    }
}
