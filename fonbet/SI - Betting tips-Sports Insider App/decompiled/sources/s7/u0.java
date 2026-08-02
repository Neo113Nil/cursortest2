package s7;

import android.content.SharedPreferences;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23114a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23115b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23116c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f23118e;

    public u0(v0 v0Var, String str, boolean z5) {
        this.f23118e = v0Var;
        g6.v.e(str);
        this.f23114a = str;
        this.f23115b = z5;
    }

    public final boolean a() {
        if (!this.f23116c) {
            this.f23116c = true;
            this.f23117d = this.f23118e.n().getBoolean(this.f23114a, this.f23115b);
        }
        return this.f23117d;
    }

    public final void b(boolean z5) {
        SharedPreferences.Editor edit = this.f23118e.n().edit();
        edit.putBoolean(this.f23114a, z5);
        edit.apply();
        this.f23117d = z5;
    }
}
