package v1;

import androidx.lifecycle.q0;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final r7.a f24383a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24384b = false;

    public c(x5.c cVar, r7.a aVar) {
        this.f24383a = aVar;
    }

    @Override // androidx.lifecycle.q0
    public final void a(Object obj) {
        this.f24384b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f24383a.f22318b;
        signInHubActivity.setResult(signInHubActivity.C, signInHubActivity.D);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f24383a.toString();
    }
}
