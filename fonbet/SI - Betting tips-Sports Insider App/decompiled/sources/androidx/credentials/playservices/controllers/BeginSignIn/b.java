package androidx.credentials.playservices.controllers.BeginSignIn;

import kotlin.jvm.internal.Ref;
import t0.q;
import u0.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CredentialProviderBeginSignInController f1495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1496c;

    public /* synthetic */ b(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Object obj, int i5) {
        this.f1494a = i5;
        this.f1495b = credentialProviderBeginSignInController;
        this.f1496c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1494a) {
            case 0:
                CredentialProviderBeginSignInController$handleResponse$3.invoke$lambda$0(this.f1495b, (q) this.f1496c);
                break;
            case 1:
                CredentialProviderBeginSignInController$handleResponse$4.invoke$lambda$0(this.f1495b, (Ref.ObjectRef) this.f1496c);
                break;
            default:
                CredentialProviderBeginSignInController$handleResponse$6.invoke$lambda$0(this.f1495b, (g) this.f1496c);
                break;
        }
    }
}
