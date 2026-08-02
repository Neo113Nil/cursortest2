package androidx.credentials.playservices;

import android.os.CancellationSignal;
import androidx.credentials.playservices.controllers.CreateRestoreCredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import java.util.concurrent.Executor;
import t0.i;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements w7.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellationSignal f1483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f1484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f1485d;

    public /* synthetic */ b(CancellationSignal cancellationSignal, Executor executor, i iVar, int i5) {
        this.f1482a = i5;
        this.f1483b = cancellationSignal;
        this.f1484c = executor;
        this.f1485d = iVar;
    }

    @Override // w7.c
    public final void c(Exception exc) {
        switch (this.f1482a) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(this.f1483b, this.f1484c, this.f1485d, exc);
                break;
            case 1:
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$1(this.f1483b, this.f1484c, this.f1485d, exc);
                break;
            default:
                CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$1(this.f1483b, this.f1484c, this.f1485d, exc);
                break;
        }
    }
}
