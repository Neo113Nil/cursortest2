package f7;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.transition.n0;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.measurement.y3;
import e6.h0;
import e6.s;
import g6.v;
import org.json.JSONException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.internal.play_billing.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9471f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9472g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 2);
        this.f9471f = 3;
        this.f9472g = revocationBoundService;
    }

    @Override // com.google.android.gms.internal.play_billing.e
    public final boolean R(int i5, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        String e7;
        int i10 = this.f9471f;
        Object obj = this.f9472g;
        switch (i10) {
            case 0:
                if (i5 == 1) {
                    Status status = (Status) l.a(parcel, Status.CREATOR);
                    SavePasswordResult savePasswordResult = (SavePasswordResult) l.a(parcel, SavePasswordResult.CREATOR);
                    l.c(parcel);
                    y3.y(status, savePasswordResult, (w7.g) obj);
                    break;
                }
                break;
            case 1:
                if (i5 == 1) {
                    Status status2 = (Status) l.a(parcel, Status.CREATOR);
                    BeginSignInResult beginSignInResult = (BeginSignInResult) l.a(parcel, BeginSignInResult.CREATOR);
                    l.c(parcel);
                    y3.y(status2, beginSignInResult, (w7.g) obj);
                    break;
                }
                break;
            case 2:
                if (i5 == 1) {
                    Status status3 = (Status) l.a(parcel, Status.CREATOR);
                    PendingIntent pendingIntent = (PendingIntent) l.a(parcel, PendingIntent.CREATOR);
                    l.c(parcel);
                    y3.y(status3, pendingIntent, (w7.g) obj);
                    break;
                }
                break;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i5 == 1) {
                    V();
                    x5.a a7 = x5.a.a(revocationBoundService);
                    GoogleSignInAccount b10 = a7.b();
                    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f4397k;
                    if (b10 != null) {
                        String e9 = a7.e("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(e9) && (e7 = a7.e(x5.a.f("googleSignInOptions", e9))) != null) {
                            try {
                                googleSignInOptions = GoogleSignInOptions.c(e7);
                            } catch (JSONException unused) {
                            }
                        }
                        googleSignInOptions = null;
                    }
                    GoogleSignInOptions googleSignInOptions2 = googleSignInOptions;
                    v.h(googleSignInOptions2);
                    b7.f fVar = new b7.f(revocationBoundService, null, s5.a.f22623a, googleSignInOptions2, new d6.f(new m3.f(12), Looper.getMainLooper()));
                    if (b10 != null) {
                        boolean z5 = fVar.e() == 3;
                        x5.g.f25407a.c("Revoking access", new Object[0]);
                        Context context = fVar.f8249a;
                        String e10 = x5.a.a(context).e("refreshToken");
                        x5.g.b(context);
                        if (!z5) {
                            s sVar = fVar.f8257i;
                            x5.f fVar2 = new x5.f(sVar, 1);
                            sVar.a(fVar2);
                            basePendingResult = fVar2;
                        } else if (e10 == null) {
                            n0 n0Var = x5.b.f25392c;
                            Status status4 = new Status(4, null, null, null);
                            v.a("Status code must not be SUCCESS", !status4.c());
                            BasePendingResult nVar = new d6.n(status4);
                            nVar.u0(status4);
                            basePendingResult = nVar;
                        } else {
                            x5.b bVar = new x5.b(e10);
                            new Thread(bVar).start();
                            basePendingResult = bVar.f25394b;
                        }
                        basePendingResult.q0(new h0(basePendingResult, new w7.g(), new io.sentry.hints.j(16)));
                    } else {
                        fVar.d();
                    }
                } else if (i5 == 2) {
                    V();
                    x5.h.o(revocationBoundService).p();
                }
                break;
        }
        return true;
    }

    public void V() {
        if (q6.b.f((RevocationBoundService) this.f9472g, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, w7.g gVar) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 2);
        this.f9471f = 0;
        this.f9472g = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, w7.g gVar, int i5) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 2);
        this.f9471f = i5;
        switch (i5) {
            case 2:
                this.f9472g = gVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 2);
                break;
            default:
                this.f9472g = gVar;
                break;
        }
    }
}
