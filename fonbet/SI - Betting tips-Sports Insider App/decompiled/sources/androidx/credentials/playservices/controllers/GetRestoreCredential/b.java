package androidx.credentials.playservices.controllers.GetRestoreCredential;

import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetDigitalCredentialController f1521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1522c;

    public /* synthetic */ b(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, f fVar, int i5) {
        this.f1520a = i5;
        this.f1521b = credentialProviderGetDigitalCredentialController;
        this.f1522c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1520a) {
            case 0:
                CredentialProviderGetDigitalCredentialController$handleResponse$2.invoke$lambda$0(this.f1521b, this.f1522c);
                break;
            default:
                CredentialProviderGetDigitalCredentialController$handleResponse$5.invoke$lambda$0(this.f1521b, this.f1522c);
                break;
        }
    }
}
