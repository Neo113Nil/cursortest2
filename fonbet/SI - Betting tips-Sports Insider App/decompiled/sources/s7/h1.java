package s7;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22792c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f22793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22795f;

    public /* synthetic */ h1(Object obj, String str, String str2, Object obj2, long j, int i5) {
        this.f22790a = i5;
        this.f22791b = str;
        this.f22792c = str2;
        this.f22794e = obj2;
        this.f22793d = j;
        this.f22795f = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22790a) {
            case 0:
                String str = (String) this.f22792c;
                k1 k1Var = (k1) this.f22795f;
                String str2 = (String) this.f22791b;
                if (str2 != null) {
                    l2 l2Var = new l2(this.f22793d, (String) this.f22794e, str2);
                    r3 r3Var = k1Var.f22848a;
                    r3Var.b().j();
                    String str3 = r3Var.G;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    r3Var.G = str;
                    r3Var.F = l2Var;
                    break;
                } else {
                    r3 r3Var2 = k1Var.f22848a;
                    r3Var2.b().j();
                    String str4 = r3Var2.G;
                    if (str4 == null || str4.equals(str)) {
                        r3Var2.G = str;
                        r3Var2.F = null;
                        break;
                    }
                }
                break;
            case 1:
                e2 e2Var = (e2) this.f22795f;
                String str5 = (String) this.f22791b;
                String str6 = (String) this.f22792c;
                e2Var.u(this.f22793d, this.f22794e, str5, str6);
                break;
            default:
                o2 o2Var = (o2) this.f22795f;
                Bundle bundle = (Bundle) this.f22791b;
                l2 l2Var2 = (l2) this.f22792c;
                l2 l2Var3 = (l2) this.f22794e;
                o2Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                v3 v3Var = ((f1) o2Var.f3328a).f22748i;
                f1.k(v3Var);
                o2Var.t(l2Var2, l2Var3, this.f22793d, true, v3Var.r("screen_view", bundle, null, false));
                break;
        }
    }

    public h1(o2 o2Var, Bundle bundle, l2 l2Var, l2 l2Var2, long j) {
        this.f22790a = 2;
        this.f22791b = bundle;
        this.f22792c = l2Var;
        this.f22794e = l2Var2;
        this.f22793d = j;
        Objects.requireNonNull(o2Var);
        this.f22795f = o2Var;
    }
}
