package s7;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f23275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f23276c;

    public /* synthetic */ z1(e2 e2Var, Bundle bundle, int i5) {
        this.f23274a = i5;
        this.f23275b = bundle;
        this.f23276c = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        switch (this.f23274a) {
            case 0:
                e2 e2Var = this.f23276c;
                e2Var.j();
                e2Var.k();
                Bundle bundle2 = this.f23275b;
                String string = bundle2.getString("name");
                String string2 = bundle2.getString("origin");
                g6.v.e(string);
                g6.v.e(string2);
                g6.v.h(bundle2.get("value"));
                f1 f1Var = (f1) e2Var.f3328a;
                if (!f1Var.d()) {
                    n0 n0Var = f1Var.f22745f;
                    f1.m(n0Var);
                    n0Var.f22910n.a("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar = new zzpl(bundle2.getLong("triggered_timestamp"), bundle2.get("value"), string, string2);
                    try {
                        v3 v3Var = f1Var.f22748i;
                        f1.k(v3Var);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        zzbg N = v3Var.N(bundle2.getString("triggered_event_name"), bundle2.getBundle("triggered_event_params"), string2, 0L, true);
                        f1.k(v3Var);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        zzbg N2 = v3Var.N(bundle2.getString("timed_out_event_name"), bundle2.getBundle("timed_out_event_params"), string2, 0L, true);
                        bundle2.getString(CommonUrlParts.APP_ID);
                        f1Var.p().C(new zzah(bundle2.getString(CommonUrlParts.APP_ID), string2, zzplVar, bundle2.getLong("creation_timestamp"), false, bundle2.getString("trigger_event_name"), N2, bundle2.getLong("trigger_timeout"), N, bundle2.getLong("time_to_live"), v3Var.N(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), string2, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 1:
                e2 e2Var2 = this.f23276c;
                e2Var2.j();
                e2Var2.k();
                Bundle bundle3 = this.f23275b;
                String string3 = bundle3.getString("name");
                g6.v.e(string3);
                f1 f1Var2 = (f1) e2Var2.f3328a;
                if (!f1Var2.d()) {
                    n0 n0Var2 = f1Var2.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22910n.a("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    zzpl zzplVar2 = new zzpl(0L, null, string3, "");
                    try {
                        v3 v3Var2 = f1Var2.f22748i;
                        f1.k(v3Var2);
                        bundle3.getString(CommonUrlParts.APP_ID);
                        f1Var2.p().C(new zzah(bundle3.getString(CommonUrlParts.APP_ID), "", zzplVar2, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), v3Var2.N(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
            default:
                e2 e2Var3 = this.f23276c;
                r7.a aVar = e2Var3.f22714w;
                f1 f1Var3 = (f1) e2Var3.f3328a;
                Bundle bundle4 = this.f23275b;
                if (bundle4.isEmpty()) {
                    bundle = bundle4;
                } else {
                    v0 v0Var = f1Var3.f22744e;
                    v3 v3Var3 = f1Var3.f22748i;
                    e eVar = f1Var3.f22743d;
                    n0 n0Var3 = f1Var3.f22745f;
                    f1.k(v0Var);
                    bundle = new Bundle(v0Var.f23144y.R());
                    for (String str : bundle4.keySet()) {
                        Object obj = bundle4.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            f1.k(v3Var3);
                            if (v3.t0(obj)) {
                                v3.z(aVar, null, 27, null, null, 0);
                            }
                            f1.m(n0Var3);
                            n0Var3.f22907k.c(str, obj, "Invalid default event parameter type. Name, value");
                        } else if (v3.J(str)) {
                            f1.m(n0Var3);
                            n0Var3.f22907k.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            f1.k(v3Var3);
                            eVar.getClass();
                            if (v3Var3.u0("param", str, 500, obj)) {
                                v3Var3.y(bundle, str, obj);
                            }
                        }
                    }
                    f1.k(v3Var3);
                    v3 v3Var4 = ((f1) eVar.f3328a).f22748i;
                    f1.k(v3Var4);
                    int i5 = v3Var4.Q(201500000) ? 100 : 25;
                    if (bundle.size() > i5) {
                        Iterator it = new TreeSet(bundle.keySet()).iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i10++;
                            if (i10 > i5) {
                                bundle.remove(str2);
                            }
                        }
                        f1.k(v3Var3);
                        v3.z(aVar, null, 26, null, null, 0);
                        f1.m(n0Var3);
                        n0Var3.f22907k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                v0 v0Var2 = f1Var3.f22744e;
                f1.k(v0Var2);
                v0Var2.f23144y.V(bundle);
                if (!bundle4.isEmpty() || f1Var3.f22743d.t(null, x.X0)) {
                    f1Var3.p().o(bundle);
                    break;
                }
                break;
        }
    }
}
