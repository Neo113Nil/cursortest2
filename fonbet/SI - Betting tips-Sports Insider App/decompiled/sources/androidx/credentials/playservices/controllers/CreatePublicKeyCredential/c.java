package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f1509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f1510c;

    public /* synthetic */ c(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2, int i5) {
        this.f1508a = i5;
        this.f1509b = credentialProviderCreatePublicKeyCredentialController;
        this.f1510c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1508a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$7.invoke$lambda$0(this.f1509b, this.f1510c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$2.invoke$lambda$0(this.f1509b, this.f1510c);
                break;
        }
    }
}
