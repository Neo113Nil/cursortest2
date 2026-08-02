package androidx.credentials.playservices.controllers.BeginSignIn;

import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderBeginSignInController f1492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f1493c;

    public /* synthetic */ a(CredentialProviderBeginSignInController credentialProviderBeginSignInController, f fVar, int i5) {
        this.f1491a = i5;
        this.f1492b = credentialProviderBeginSignInController;
        this.f1493c = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1491a) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$2.invoke$lambda$0(this.f1492b, this.f1493c);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$5.invoke$lambda$0(this.f1492b, this.f1493c);
                break;
        }
    }
}
