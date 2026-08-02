package w5;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import d6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final Status f24977a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleSignInAccount f24978b;

    public b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f24978b = googleSignInAccount;
        this.f24977a = status;
    }

    @Override // d6.l
    public final Status getStatus() {
        return this.f24977a;
    }
}
