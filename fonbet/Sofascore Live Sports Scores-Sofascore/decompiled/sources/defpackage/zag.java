package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.ironsource.Y1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zag implements xag {
    public final Context a;
    public final long b;
    public final pgg c;
    public final ujg d;
    public final qc4 e;
    public final Function1 f;
    public final Function2 g;
    public final Function1 h;
    public final Function1 i;
    public tbg j;
    public final ad2 k;
    public gcg l;
    public boolean m;
    public boolean n;
    public boolean o;
    public p03 p;
    public jhg q;
    public hhg r;
    public long s;
    public final ArrayList t;
    public gme u;
    public final ArrayList v;
    public final ArrayList w;

    public zag(Context context, long j, pgg pggVar) {
        ujg P = ujg.P(context);
        qc4 qc4Var = new qc4(context);
        j9g j9gVar = new j9g(24);
        eee eeeVar = new eee((byte) 0, 22);
        fdg fdgVar = fdg.a;
        Class<fdg> cls = fdg.class;
        chf chfVar = new chf(1, fdgVar, cls, "isActivityOrientationLocked", "isActivityOrientationLocked(Landroid/app/Activity;)Z", 0, 3);
        chf chfVar2 = new chf(1, fdgVar, cls, "isDeviceRotationEnabled", "isDeviceRotationEnabled(Landroid/content/Context;)Z", 0, 4);
        context.getClass();
        this.a = context;
        this.b = j;
        this.c = pggVar;
        this.d = P;
        this.e = qc4Var;
        this.f = j9gVar;
        this.g = eeeVar;
        this.h = chfVar;
        this.i = chfVar2;
        this.k = s9a.c(new te6(Executors.unconfigurableExecutorService(Executors.newScheduledThreadPool(1, new u14(new AtomicInteger())))));
        this.t = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
    }

    public final void a() {
        if (this.m) {
            return;
        }
        ogj.k("SASAdLifecycleControllerImpl should be configured before being used");
    }

    public final void b(Iterator it) {
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!StringsKt.R(str)) {
                this.d.J(str);
            }
        }
    }

    public final Object c(String str, hoi hoiVar) {
        a();
        Object w = xw3.t(this.k, null, new m1f(this, str, null, 6), 3).w(hoiVar);
        lu3 lu3Var = lu3.a;
        return w;
    }

    public final void d() {
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((wag) it.next()).f();
        }
    }

    public final void e() {
        Iterator it = this.v.iterator();
        while (it.hasNext()) {
            ((wag) it.next()).e();
        }
        this.s = new Date().getTime();
    }

    public final void f(int i) {
        a();
        Function1 function1 = this.i;
        Context context = this.a;
        boolean booleanValue = ((Boolean) function1.invoke(context)).booleanValue();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        boolean booleanValue2 = activity != null ? ((Boolean) this.h.invoke(activity)).booleanValue() : false;
        gme gmeVar = this.u;
        if (gmeVar != null) {
            gmeVar.invoke(Integer.valueOf(i), Boolean.valueOf(!booleanValue || booleanValue2));
        }
    }

    public final void g() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((vag) it.next()).b();
        }
    }

    public final void h() {
        a();
        xw3.L(this.k, null, null, new yag(this, null, 1), 3);
    }

    public final void i(kig kigVar, long j) {
        kigVar.getClass();
        a();
        hhg hhgVar = this.r;
        if (hhgVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("num1={[eventValue]}", j >= 0 ? String.valueOf(j / 1000.0d) : Y1.f);
            synchronized (hhgVar) {
                String str = kigVar.a;
                String str2 = hhgVar.g;
                hhgVar.f.getClass();
                hhgVar.u(str, hashMap, ukg.a(str2, hhgVar.e));
            }
        }
    }

    public final void j(blg blgVar) {
        a();
        xw3.L(this.k, null, null, new m1f(this, blgVar, null, 7), 3);
    }

    public final void k(RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        a();
        xw3.L(this.k, null, null, new m1f(this, relativeLayout, null, 8), 3);
    }

    public final void l() {
        a();
        xw3.L(this.k, null, null, new yag(this, null, 2), 3);
    }

    public final void m(boolean z) {
        a();
        xw3.L(this.k, null, null, new mp1(z, this, (rq3) null), 3);
    }

    public final void n(View view) {
        tbg tbgVar = this.j;
        if (tbgVar != null) {
            tbgVar.unloadAd(view);
        } else {
            Intrinsics.i("adViewController");
            throw null;
        }
    }
}
