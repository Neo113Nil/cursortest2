package androidx.credentials.playservices.controllers.GetSignInIntent;

import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f1528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1529c;

    public /* synthetic */ a(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, f fVar, int i5) {
        this.f1527a = i5;
        this.f1528b = credentialProviderGetSignInIntentController;
        this.f1529c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1527a) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$2.invoke$lambda$0(this.f1528b, this.f1529c);
                break;
            default:
                CredentialProviderGetSignInIntentController$handleResponse$5.invoke$lambda$0(this.f1528b, this.f1529c);
                break;
        }
    }
}
