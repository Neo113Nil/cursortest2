package androidx.credentials.playservices;

import t0.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1537b;

    public /* synthetic */ d(i iVar, int i5) {
        this.f1536a = i5;
        this.f1537b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1536a) {
            case 0:
                CredentialProviderPlayServicesImpl$onClearCredential$1.invoke$lambda$0(this.f1537b);
                break;
            case 1:
                this.f1537b.onResult(null);
                break;
            case 2:
                this.f1537b.onResult(null);
                break;
            case 3:
                CredentialProviderPlayServicesImpl$onCreateCredential$1.invoke$lambda$0(this.f1537b);
                break;
            case 4:
                CredentialProviderPlayServicesImpl$onGetCredential$1.invoke$lambda$0(this.f1537b);
                break;
            case 5:
                CredentialProviderPlayServicesImpl$onGetCredential$2.invoke$lambda$0(this.f1537b);
                break;
            default:
                CredentialProviderPlayServicesImpl$onGetCredential$3.invoke$lambda$0(this.f1537b);
                break;
        }
    }
}
