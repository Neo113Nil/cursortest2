package w5;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import g6.v;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f24968a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24970c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24971d;

    /* renamed from: e, reason: collision with root package name */
    public final String f24972e;

    /* renamed from: f, reason: collision with root package name */
    public final Account f24973f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24974g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f24975h;

    /* renamed from: i, reason: collision with root package name */
    public String f24976i;

    public a() {
        this.f24968a = new HashSet();
        this.f24975h = new HashMap();
    }

    public a(GoogleSignInOptions googleSignInOptions) {
        this.f24968a = new HashSet();
        this.f24975h = new HashMap();
        v.h(googleSignInOptions);
        this.f24968a = new HashSet(googleSignInOptions.f4404b);
        this.f24969b = googleSignInOptions.f4407e;
        this.f24970c = googleSignInOptions.f4408f;
        this.f24971d = googleSignInOptions.f4406d;
        this.f24972e = googleSignInOptions.f4409g;
        this.f24973f = googleSignInOptions.f4405c;
        this.f24974g = googleSignInOptions.f4410h;
        this.f24975h = GoogleSignInOptions.l0(googleSignInOptions.f4411i);
        this.f24976i = googleSignInOptions.j;
    }
}
