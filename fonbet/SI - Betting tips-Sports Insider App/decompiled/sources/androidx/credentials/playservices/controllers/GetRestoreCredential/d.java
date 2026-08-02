package androidx.credentials.playservices.controllers.GetRestoreCredential;

import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController$invokePlayServices$1;
import kotlin.jvm.internal.Ref;
import t0.i;
import t0.q;
import u0.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1525b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1526c;

    public /* synthetic */ d(int i5, Object obj, Object obj2) {
        this.f1524a = i5;
        this.f1525b = obj;
        this.f1526c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1524a) {
            case 0:
                CredentialProviderGetDigitalCredentialController$handleResponse$4.invoke$lambda$0((CredentialProviderGetDigitalCredentialController) this.f1525b, (q) this.f1526c);
                break;
            case 1:
                ((i) this.f1525b).a((f) this.f1526c);
                break;
            case 2:
                ((i) this.f1525b).onResult((q) this.f1526c);
                break;
            case 3:
                CredentialProviderGetRestoreCredentialController$invokePlayServices$1.AnonymousClass2.invoke$lambda$0((i) this.f1525b, (Exception) this.f1526c);
                break;
            default:
                CredentialProviderGetRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0((i) this.f1525b, (Ref.ObjectRef) this.f1526c);
                break;
        }
    }
}
