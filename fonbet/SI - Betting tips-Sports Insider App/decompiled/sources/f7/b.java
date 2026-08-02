package f7;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.Status;
import com.sports.insider.data.room.general.table.predictions.PredictionTable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends d6.g {

    /* renamed from: m, reason: collision with root package name */
    public static final l1.a f9473m = new l1.a("Auth.Api.Identity.CredentialSaving.API", new a6.d(3), new d6.d());

    /* renamed from: n, reason: collision with root package name */
    public static final l1.a f9474n = new l1.a("Auth.Api.Identity.SignIn.API", new a6.d(4), new d6.d());

    /* renamed from: l, reason: collision with root package name */
    public final String f9475l;

    public b(HiddenActivity hiddenActivity, u5.a aVar) {
        super(hiddenActivity, hiddenActivity, f9473m, aVar, d6.f.f8246c);
        this.f9475l = f.a();
    }

    public SignInCredential d(Intent intent) {
        Status status = Status.f4463g;
        if (intent == null) {
            throw new d6.e(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra(PredictionTable.statusColumn);
        Status status2 = (Status) (byteArrayExtra == null ? null : io.sentry.config.a.h(byteArrayExtra, creator));
        if (status2 == null) {
            throw new d6.e(Status.f4465i);
        }
        if (!status2.c()) {
            throw new d6.e(status2);
        }
        Parcelable.Creator<SignInCredential> creator2 = SignInCredential.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        SignInCredential signInCredential = (SignInCredential) (byteArrayExtra2 != null ? io.sentry.config.a.h(byteArrayExtra2, creator2) : null);
        if (signInCredential != null) {
            return signInCredential;
        }
        throw new d6.e(status);
    }

    public b(HiddenActivity hiddenActivity, u5.c cVar) {
        super(hiddenActivity, hiddenActivity, f9474n, cVar, d6.f.f8246c);
        this.f9475l = f.a();
    }

    public b(Context context, u5.c cVar) {
        super(context, null, f9474n, cVar, d6.f.f8246c);
        this.f9475l = f.a();
    }
}
