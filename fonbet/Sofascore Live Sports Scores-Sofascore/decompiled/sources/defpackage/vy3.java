package defpackage;

import android.credentials.ClearCredentialStateException;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vy3 implements OutcomeReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oy3 b;

    public vy3(sz8 sz8Var, wy3 wy3Var) {
        this.b = sz8Var;
    }

    public final void onError(Throwable th) {
        int i = this.a;
        oy3 oy3Var = this.b;
        switch (i) {
            case 0:
                ((ClearCredentialStateException) th).getClass();
                ((ny3) oy3Var).c(new fw2(null));
                break;
            default:
                GetCredentialException getCredentialException = (GetCredentialException) th;
                getCredentialException.getClass();
                String type = getCredentialException.getType();
                type.getClass();
                ((sz8) oy3Var).c(td4.x0(getCredentialException.getMessage(), type));
                break;
        }
    }

    public final void onResult(Object obj) {
        int i = this.a;
        oy3 oy3Var = this.b;
        switch (i) {
            case 0:
                ((ny3) oy3Var).onResult((Void) obj);
                break;
            default:
                GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
                getCredentialResponse.getClass();
                Credential credential = getCredentialResponse.getCredential();
                credential.getClass();
                String type = credential.getType();
                type.getClass();
                Bundle data = credential.getData();
                data.getClass();
                ((sz8) oy3Var).onResult(new gx8(o1j.v(data, type)));
                break;
        }
    }

    public vy3(ny3 ny3Var) {
        this.b = ny3Var;
    }
}
