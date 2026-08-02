package s7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23229a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f23230b;

    public /* synthetic */ x0(f1 f1Var, int i5) {
        this.f23229a = i5;
        this.f23230b = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a() {
        switch (this.f23229a) {
            case 0:
                f1 f1Var = this.f23230b;
                boolean z5 = false;
                try {
                    s6.b a7 = s6.c.a(f1Var.f22740a);
                    if (a7 == null) {
                        n0 n0Var = f1Var.f22745f;
                        f1.m(n0Var);
                        n0Var.f22910n.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        f1Var = f1Var;
                    } else {
                        int i5 = a7.b(128, "com.android.vending").versionCode;
                        f1Var = i5;
                        if (i5 >= 80837300) {
                            z5 = true;
                            f1Var = i5;
                        }
                    }
                } catch (Exception e7) {
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22910n.b(e7, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z5;
            default:
                n0 n0Var3 = this.f23230b.f22745f;
                f1.m(n0Var3);
                return Log.isLoggable(n0Var3.t(), 3);
        }
    }

    @Override // s7.g2, s7.p0
    public /* synthetic */ void b(String str, int i5, Throwable th2, byte[] bArr, Map map) {
        this.f23230b.i(i5, th2, bArr);
    }

    public void c(Bundle bundle, String str) {
        String uri;
        f1 f1Var = this.f23230b;
        d1 d1Var = f1Var.f22746g;
        v0 v0Var = f1Var.f22744e;
        f1.m(d1Var);
        d1Var.j();
        if (f1Var.d()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        f1.k(v0Var);
        v0Var.f23142w.i(uri);
        io.sentry.android.core.s sVar = v0Var.f23143x;
        f1Var.f22749k.getClass();
        sVar.b(System.currentTimeMillis());
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        f1 f1Var = this.f23230b;
        f1Var.f22749k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        v0 v0Var = f1Var.f22744e;
        f1.k(v0Var);
        return currentTimeMillis - v0Var.f23143x.a() > f1Var.f22743d.q(null, x.k0);
    }

    public boolean e() {
        v0 v0Var = this.f23230b.f22744e;
        f1.k(v0Var);
        return v0Var.f23143x.a() > 0;
    }

    public x0(r3 r3Var) {
        this.f23229a = 0;
        this.f23230b = r3Var.f22997l;
    }

    public x0(s1 s1Var, f1 f1Var) {
        this.f23229a = 2;
        this.f23230b = f1Var;
    }
}
