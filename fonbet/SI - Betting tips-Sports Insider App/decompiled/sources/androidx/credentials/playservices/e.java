package androidx.credentials.playservices;

import java.io.Serializable;
import kotlin.jvm.internal.Ref;
import t0.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1538a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f1540c;

    public /* synthetic */ e(i iVar, Serializable serializable, int i5) {
        this.f1538a = i5;
        this.f1539b = iVar;
        this.f1540c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1538a) {
            case 0:
                CredentialProviderPlayServicesImpl$onClearCredential$3$1.invoke$lambda$0(this.f1539b, (Ref.ObjectRef) this.f1540c);
                break;
            default:
                CredentialProviderPlayServicesImpl$onClearCredential$5$1$1.invoke$lambda$0(this.f1539b, (Exception) this.f1540c);
                break;
        }
    }
}
