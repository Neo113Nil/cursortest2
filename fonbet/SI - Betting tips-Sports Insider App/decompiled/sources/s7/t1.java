package s7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f23090b;

    public /* synthetic */ t1(e2 e2Var, int i5) {
        this.f23089a = i5;
        this.f23090b = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23089a) {
            case 0:
                this.f23090b.G();
                break;
            case 1:
                x0 x0Var = this.f23090b.f22709r;
                f1 f1Var = x0Var.f23230b;
                d1 d1Var = f1Var.f22746g;
                e2 e2Var = f1Var.f22751m;
                v0 v0Var = f1Var.f22744e;
                f1.m(d1Var);
                d1Var.j();
                if (x0Var.e()) {
                    if (x0Var.d()) {
                        f1.k(v0Var);
                        v0Var.f23142w.i(null);
                        Bundle bundle = new Bundle();
                        bundle.putString(AdRevenueConstants.SOURCE_KEY, "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        f1.l(e2Var);
                        e2Var.q("auto", "_cmpx", bundle);
                    } else {
                        f1.k(v0Var);
                        com.android.billingclient.api.i iVar = v0Var.f23142w;
                        String h10 = iVar.h();
                        if (TextUtils.isEmpty(h10)) {
                            n0 n0Var = f1Var.f22745f;
                            f1.m(n0Var);
                            n0Var.f22904g.a("Cache still valid but referrer not found");
                        } else {
                            long a7 = v0Var.f23143x.a() / 3600000;
                            Uri parse = Uri.parse(h10);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a7 - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            f1.l(e2Var);
                            e2Var.q(str2, "_cmp", (Bundle) pair.second);
                        }
                        iVar.i(null);
                    }
                    f1.k(v0Var);
                    v0Var.f23143x.b(0L);
                    break;
                }
                break;
            case 2:
                e2 e2Var2 = this.f23090b;
                e2Var2.j();
                f1 f1Var2 = (f1) e2Var2.f3328a;
                v0 v0Var2 = f1Var2.f22744e;
                n0 n0Var2 = f1Var2.f22745f;
                f1.k(v0Var2);
                u0 u0Var = v0Var2.f23139t;
                if (u0Var.a()) {
                    f1.m(n0Var2);
                    n0Var2.f22909m.a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    io.sentry.android.core.s sVar = v0Var2.f23140u;
                    long a10 = sVar.a();
                    sVar.b(1 + a10);
                    if (a10 >= 5) {
                        f1.m(n0Var2);
                        n0Var2.f22906i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        u0Var.b(true);
                        break;
                    } else {
                        if (e2Var2.f22711t == null) {
                            e2Var2.f22711t = new u1(e2Var2, f1Var2, 3);
                        }
                        e2Var2.f22711t.b(0L);
                        break;
                    }
                }
            default:
                this.f23090b.G();
                break;
        }
    }
}
