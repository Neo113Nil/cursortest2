package androidx.credentials.playservices.controllers.CreateRestoreCredential;

import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController$invokePlayServices$1;
import kotlin.jvm.internal.Ref;
import t0.c;
import t0.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f1516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1517c;

    public /* synthetic */ b(i iVar, Object obj, int i5) {
        this.f1515a = i5;
        this.f1516b = iVar;
        this.f1517c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1515a) {
            case 0:
                this.f1516b.onResult((c) this.f1517c);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController$invokePlayServices$1.AnonymousClass2.invoke$lambda$0(this.f1516b, (Exception) this.f1517c);
                break;
            default:
                CredentialProviderCreateRestoreCredentialController$invokePlayServices$2$1.invoke$lambda$0(this.f1516b, (Ref.ObjectRef) this.f1517c);
                break;
        }
    }
}
