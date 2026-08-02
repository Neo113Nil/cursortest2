package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class eyj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fyj b;

    public /* synthetic */ eyj(fyj fyjVar, int i) {
        this.a = i;
        this.b = fyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zi3 zi3Var;
        String str;
        int i = this.a;
        fyj fyjVar = this.b;
        switch (i) {
            case 0:
                wmf wmfVar = fyjVar.l;
                boolean z = fyjVar.q;
                wmfVar.d.a(z);
                wmfVar.e.a(z);
                return;
            default:
                r38 r38Var = fyjVar.d;
                r38Var.a();
                Context context = r38Var.a;
                fyjVar.j = context;
                fyjVar.o = context.getPackageName();
                fyjVar.k = oi3.e();
                fyjVar.l = new wmf(fyjVar.j, new dy9(100L, 1L, TimeUnit.MINUTES));
                fyjVar.m = oe0.a();
                vff vffVar = fyjVar.g;
                oi3 oi3Var = fyjVar.k;
                oi3Var.getClass();
                zi3 zi3Var2 = zi3.h;
                synchronized (zi3.class) {
                    zi3Var = zi3.h;
                    if (zi3Var == null) {
                        zi3Var = new zi3();
                        zi3.h = zi3Var;
                    }
                }
                Long l = (Long) oi3Var.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
                l.getClass();
                Map map = zi3.i;
                if (!map.containsKey(l) || (str = (String) map.get(l)) == null) {
                    jvd d = oi3Var.d(zi3Var);
                    str = d.b() ? (String) d.a() : "FIREPERF";
                } else {
                    oi3Var.c.f("com.google.firebase.perf.LogSourceName", str);
                }
                fyjVar.h = new o78(vffVar, str);
                ConcurrentLinkedQueue concurrentLinkedQueue = fyjVar.b;
                oe0 oe0Var = fyjVar.m;
                WeakReference weakReference = new WeakReference(fyj.s);
                synchronized (oe0Var.f) {
                    oe0Var.f.add(weakReference);
                }
                if0 n = lf0.n();
                fyjVar.n = n;
                r38 r38Var2 = fyjVar.d;
                r38Var2.a();
                n.n(r38Var2.c.b);
                ox k = qx.k();
                k.d(fyjVar.o);
                k.i();
                Context context2 = fyjVar.j;
                String str2 = "";
                try {
                    String str3 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str3 != null) {
                        str2 = str3;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                k.j(str2);
                n.k(k);
                fyjVar.c.set(true);
                while (!concurrentLinkedQueue.isEmpty()) {
                    gde gdeVar = (gde) concurrentLinkedQueue.poll();
                    if (gdeVar != null) {
                        fyjVar.i.execute(new ecg(12, fyjVar, gdeVar));
                    }
                }
                return;
        }
    }
}
