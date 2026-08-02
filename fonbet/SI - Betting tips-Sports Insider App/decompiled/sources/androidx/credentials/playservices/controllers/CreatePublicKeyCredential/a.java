package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1504c;

    public /* synthetic */ a(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Object obj, int i5) {
        this.f1502a = i5;
        this.f1503b = credentialProviderCreatePublicKeyCredentialController;
        this.f1504c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1502a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$2.invoke$lambda$0(this.f1503b, (u0.c) this.f1504c);
                break;
            case 1:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$4.invoke$lambda$0(this.f1503b, (u0.c) this.f1504c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$5.invoke$lambda$0(this.f1503b, (t0.c) this.f1504c);
                break;
        }
    }
}
