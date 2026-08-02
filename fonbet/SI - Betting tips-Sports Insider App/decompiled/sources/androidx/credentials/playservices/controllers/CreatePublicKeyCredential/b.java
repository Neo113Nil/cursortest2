package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderCreatePublicKeyCredentialController f1506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JSONException f1507c;

    public /* synthetic */ b(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException, int i5) {
        this.f1505a = i5;
        this.f1506b = credentialProviderCreatePublicKeyCredentialController;
        this.f1507c = jSONException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1505a) {
            case 0:
                CredentialProviderCreatePublicKeyCredentialController$handleResponse$6.invoke$lambda$0(this.f1506b, this.f1507c);
                break;
            default:
                CredentialProviderCreatePublicKeyCredentialController$invokePlayServices$1.invoke$lambda$0(this.f1506b, this.f1507c);
                break;
        }
    }
}
