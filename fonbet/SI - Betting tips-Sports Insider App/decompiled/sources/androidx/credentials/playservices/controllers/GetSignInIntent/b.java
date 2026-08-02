package androidx.credentials.playservices.controllers.GetSignInIntent;

import kotlin.jvm.internal.Ref;
import t0.q;
import u0.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderGetSignInIntentController f1531b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1532c;

    public /* synthetic */ b(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Object obj, int i5) {
        this.f1530a = i5;
        this.f1531b = credentialProviderGetSignInIntentController;
        this.f1532c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1530a) {
            case 0:
                CredentialProviderGetSignInIntentController$handleResponse$3.invoke$lambda$0(this.f1531b, (q) this.f1532c);
                break;
            case 1:
                CredentialProviderGetSignInIntentController$handleResponse$4.invoke$lambda$0(this.f1531b, (Ref.ObjectRef) this.f1532c);
                break;
            case 2:
                CredentialProviderGetSignInIntentController$handleResponse$6.invoke$lambda$0(this.f1531b, (g) this.f1532c);
                break;
            default:
                CredentialProviderGetSignInIntentController$invokePlayServices$1.invoke$lambda$0(this.f1531b, (Exception) this.f1532c);
                break;
        }
    }
}
