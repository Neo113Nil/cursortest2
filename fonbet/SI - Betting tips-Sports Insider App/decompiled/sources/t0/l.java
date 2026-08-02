package t0;

import android.credentials.ClearCredentialStateException;
import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import oi.w;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23731a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f23732b;

    public l(w wVar, m mVar) {
        this.f23732b = wVar;
    }

    public final void onError(Throwable th2) {
        switch (this.f23731a) {
            case 0:
                Intrinsics.checkNotNullParameter((ClearCredentialStateException) th2, "error");
                Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
                ((w) this.f23732b).a(new u0.a(null));
                break;
            default:
                GetCredentialException error = (GetCredentialException) th2;
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                w wVar = (w) this.f23732b;
                Intrinsics.checkNotNullParameter(error, "error");
                String type = error.getType();
                Intrinsics.checkNotNullExpressionValue(type, "error.type");
                wVar.a(m4.g.A(error.getMessage(), type));
                break;
        }
    }

    public final void onResult(Object obj) {
        switch (this.f23731a) {
            case 0:
                Log.i("CredManProvService", "Clear result returned from framework: ");
                ((w) this.f23732b).onResult((Void) obj);
                break;
            default:
                GetCredentialResponse response = (GetCredentialResponse) obj;
                Intrinsics.checkNotNullParameter(response, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                w wVar = (w) this.f23732b;
                Intrinsics.checkNotNullParameter(response, "response");
                Credential credential = response.getCredential();
                Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
                String type = credential.getType();
                Intrinsics.checkNotNullExpressionValue(type, "credential.type");
                Bundle data = credential.getData();
                Intrinsics.checkNotNullExpressionValue(data, "credential.data");
                wVar.onResult(new q(rh.g.f(data, type)));
                break;
        }
    }

    public l(w wVar) {
        this.f23732b = wVar;
    }
}
