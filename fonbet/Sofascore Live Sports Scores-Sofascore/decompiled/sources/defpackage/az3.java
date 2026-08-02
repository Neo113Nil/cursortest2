package defpackage;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class az3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy3 b;

    public /* synthetic */ az3(oy3 oy3Var, int i) {
        this.a = i;
        this.b = oy3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        oy3 oy3Var = this.b;
        switch (i) {
            case 0:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(oy3Var);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(oy3Var);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(oy3Var);
                break;
            case 3:
                oy3Var.onResult(null);
                break;
            case 4:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(oy3Var);
                break;
            case 5:
                oy3Var.onResult(null);
                break;
            case 6:
                oy3Var.onResult(null);
                break;
            case 7:
                oy3Var.c(new dx8("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 3));
                break;
            default:
                oy3Var.c(new dx8("No provider data returned.", 3));
                break;
        }
    }
}
