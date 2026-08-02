package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.IInterface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import androidx.recyclerview.widget.u;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.l;
import com.android.billingclient.api.m;
import com.bytedance.sdk.component.utils.tsz;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzate;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.play_billing.zzbh;
import com.google.android.gms.internal.play_billing.zzbo;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzdq;
import com.google.android.gms.internal.play_billing.zzjs;
import com.iab.omid.library.smartadserver1.Omid;
import com.iab.omid.library.smartadserver1.adsession.Partner;
import com.sofascore.results.league.fragment.standings.LeagueStandingsFragment;
import com.sofascore.results.team.standings.TeamStandingsFragment;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pyn implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public pyn(o65 o65Var, w1a w1aVar) {
        this.a = 9;
        this.c = o65Var;
        z1a.y(w1aVar, "savedListener");
        this.b = w1aVar;
    }

    private final void a() {
        hih hihVar = (hih) this.b;
        hihVar.a.a();
        synchronized (hihVar.b) {
            synchronized (((jo5) this.c)) {
                try {
                    if (((jo5) this.c).a.a.contains(new ho5((hih) this.b, o1j.f))) {
                        ((jo5) this.c).r.b();
                        jo5 jo5Var = (jo5) this.c;
                        hih hihVar2 = (hih) this.b;
                        jo5Var.getClass();
                        try {
                            hihVar2.h(jo5Var.r, jo5Var.n);
                            ((jo5) this.c).g((hih) this.b);
                        } catch (Throwable th) {
                            throw new rh2(th);
                        }
                    }
                    ((jo5) this.c).c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final void b() {
        zzaex zzaexVar = (zzaex) this.b;
        zzje zzjeVar = (zzje) this.c;
        synchronized (zzjeVar) {
        }
        String str = zzfm.a;
        zzaexVar.b.c(zzjeVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        defpackage.j5h.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((j5h) this.c).b) {
                    if (!z) {
                        j5h j5hVar = (j5h) this.c;
                        if (j5hVar.c != 4) {
                            j5hVar.d++;
                            j5hVar.c = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((j5h) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((j5h) this.c).c = 1;
                    }
                }
                if (!z2) {
                    return;
                }
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v73, types: [j3d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.internal.play_billing.zzdk, java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [j3d] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable b;
        tec tecVar;
        wh0 wh0Var;
        sp5 sp5Var;
        List list;
        sm0 sm0Var;
        xei xeiVar;
        ?? r10;
        List list2;
        Throwable o;
        n6g i;
        tsz tszVar;
        tsz tszVar2;
        int i2 = 2;
        boolean z = false;
        switch (this.a) {
            case 0:
                axn axnVar = (axn) this.c;
                ?? r0 = (zzdk) this.b;
                if ((r0 instanceof zzdq) && (b = ((zzdq) r0).b()) != null) {
                    axnVar.d(b);
                    return;
                }
                try {
                    boolean isDone = r0.isDone();
                    Future future = r0;
                    if (!isDone) {
                        throw new IllegalStateException(zzbo.a("Future was expected to be done: %s", r0));
                    }
                    while (true) {
                        try {
                            Object obj = future.get();
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            Integer num = (Integer) obj;
                            int intValue = num.intValue();
                            l lVar = (l) axnVar.d;
                            if (intValue <= 0) {
                                ((Runnable) axnVar.c).run();
                                return;
                            }
                            int i3 = axnVar.a;
                            BillingResult a = m.a(num.intValue(), "Billing override value was set by a license tester.");
                            lVar.X(i3, a, zzjs.LICENSE_TESTER_BILLING_OVERRIDE);
                            ((yn3) axnVar.b).accept(a);
                            return;
                        } catch (InterruptedException unused) {
                            z = true;
                            future = future;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                } catch (ExecutionException e) {
                    axnVar.d(e.getCause());
                    return;
                } catch (Throwable th2) {
                    axnVar.d(th2);
                    return;
                }
                break;
            case 1:
                ac acVar = (ac) this.b;
                dc dcVar = (dc) this.c;
                vec vecVar = dcVar.c;
                if (vecVar != null && (tecVar = vecVar.e) != null) {
                    tecVar.j(vecVar);
                }
                View view = (View) dcVar.f;
                if (view != null && view.getWindowToken() != null) {
                    if (!acVar.b()) {
                        if (acVar.f != null) {
                            acVar.d(0, 0, false, false);
                        }
                    }
                    dcVar.q = acVar;
                }
                dcVar.s = null;
                return;
            case 2:
                Object obj2 = this.c;
                Object obj3 = this.b;
                try {
                    Method method = vd.d;
                    if (method != null) {
                        method.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        vd.e.invoke(obj3, obj2, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 3:
                yia yiaVar = (yia) this.b;
                Typeface typeface = (Typeface) this.c;
                t6a t6aVar = (t6a) yiaVar.b;
                if (t6aVar != null) {
                    t6aVar.C(typeface);
                    return;
                }
                return;
            case 4:
                nq4 nq4Var = (nq4) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u uVar = (u) it.next();
                    nq4Var.getClass();
                    View view2 = uVar.itemView;
                    ViewPropertyAnimator animate = view2.animate();
                    nq4Var.o.add(uVar);
                    animate.alpha(1.0f).setDuration(nq4Var.c).setListener(new iq4(nq4Var, uVar, view2, animate)).start();
                }
                arrayList.clear();
                nq4Var.l.remove(arrayList);
                return;
            case 5:
                ((mrb) this.c).u.N(this.b);
                return;
            case 6:
                z1a.D("Channel must have been shut down", ((qrb) ((sv4) this.c).h.b).G.get());
                return;
            case 7:
                ((rv4) this.c).c.s((hl4) this.b);
                return;
            case 8:
                ((ay2) ((vv4) this.c).b).v((cqa) this.b);
                return;
            case 9:
                w1a w1aVar = (w1a) this.b;
                o65 o65Var = (o65) this.c;
                String str = o65Var.m;
                xx3 xx3Var = o65Var.q;
                Logger logger = o65.A;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str);
                }
                try {
                    try {
                        ki9 a2 = o65Var.i.a(InetSocketAddress.createUnresolved(str, o65Var.n));
                        sp5Var = a2 != null ? new sp5(a2) : null;
                        list = Collections.EMPTY_LIST;
                        sm0Var = sm0.b;
                    } catch (IOException e3) {
                        e = e3;
                    }
                    if (sp5Var != null) {
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + sp5Var);
                        }
                        list2 = Collections.singletonList(sp5Var);
                        r10 = 0;
                    } else {
                        x6k b0 = o65Var.b0();
                        try {
                            xeiVar = (xei) b0.b;
                        } catch (IOException e4) {
                            e = e4;
                            r3 = b0;
                            w1aVar.z(xei.m.h("Unable to resolve host " + str).g(e));
                            wh0Var = new wh0(this, r3 != null && ((xei) r3.b) == null, i2);
                            xx3Var.execute(wh0Var);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            r3 = b0;
                            xx3Var.execute(new wh0(this, r3 != null && ((xei) r3.b) == null, i2));
                            throw th;
                        }
                        if (xeiVar != null) {
                            w1aVar.z(xeiVar);
                            wh0Var = new wh0(this, ((xei) b0.b) == null, i2);
                            xx3Var.execute(wh0Var);
                            return;
                        } else {
                            List list3 = (List) b0.c;
                            if (list3 != null) {
                                list = list3;
                            }
                            ?? r02 = (j3d) b0.d;
                            r10 = r02 != 0 ? r02 : null;
                            r3 = b0;
                            list2 = list;
                        }
                    }
                    w1aVar.A(new k3d(list2, sm0Var, r10));
                    wh0Var = new wh0(this, r3 != null && ((xei) r3.b) == null, i2);
                    xx3Var.execute(wh0Var);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
                break;
            case 10:
                a();
                return;
            case 11:
                rt8 rt8Var = (rt8) this.c;
                Future future2 = (Future) this.b;
                if ((future2 instanceof g4) && (o = ((g4) future2).o()) != null) {
                    rt8Var.onFailure(o);
                    return;
                }
                try {
                    rt8Var.mo914onSuccess(hkg.P(future2));
                    return;
                } catch (ExecutionException e5) {
                    rt8Var.onFailure(e5.getCause());
                    return;
                } catch (Throwable th5) {
                    rt8Var.onFailure(th5);
                    return;
                }
            case 12:
                rk3 rk3Var = ((t8a) this.c).w.a;
                rk3 rk3Var2 = rk3.e;
                if (rk3Var == rk3Var2) {
                    return;
                }
                t8a t8aVar = (t8a) this.c;
                t8aVar.x = (xei) this.b;
                p8a p8aVar = t8aVar.v;
                t8a t8aVar2 = (t8a) this.c;
                p8a p8aVar2 = t8aVar2.u;
                t8aVar2.v = null;
                t8a t8aVar3 = (t8a) this.c;
                t8aVar3.u = null;
                t8aVar3.e(rk3Var2);
                ((t8a) this.c).l.d();
                if (((t8a) this.c).s.isEmpty()) {
                    t8a t8aVar4 = (t8a) this.c;
                    t8aVar4.k.execute(new n8a(t8aVar4, i2));
                }
                t8a t8aVar5 = (t8a) this.c;
                t8aVar5.k.i();
                y3g y3gVar = t8aVar5.p;
                if (y3gVar != null) {
                    y3gVar.e();
                    t8aVar5.p = null;
                    t8aVar5.n = null;
                }
                y3g y3gVar2 = ((t8a) this.c).q;
                if (y3gVar2 != null) {
                    y3gVar2.e();
                    ((t8a) this.c).r.a((xei) this.b);
                    t8a t8aVar6 = (t8a) this.c;
                    t8aVar6.q = null;
                    t8aVar6.r = null;
                }
                if (p8aVar != null) {
                    p8aVar.a((xei) this.b);
                }
                if (p8aVar2 != null) {
                    p8aVar2.a((xei) this.b);
                    return;
                }
                return;
            case 13:
                View view3 = (View) this.b;
                LeagueStandingsFragment leagueStandingsFragment = (LeagueStandingsFragment) this.c;
                leagueStandingsFragment.D().I(view3.getMeasuredWidth());
                krk krkVar = leagueStandingsFragment.l;
                krkVar.getClass();
                ((oo8) krkVar).d.setAdapter(leagueStandingsFragment.D());
                view3.addOnLayoutChangeListener(new b2(leagueStandingsFragment, 6));
                return;
            case 14:
                krb krbVar = (krb) this.c;
                xei xeiVar2 = (xei) this.b;
                Logger logger2 = qrb.c0;
                Level level2 = Level.WARNING;
                qrb qrbVar = krbVar.m;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{qrbVar.a, xeiVar2});
                nrb nrbVar = qrbVar.P;
                if (nrbVar.a.get() == qrb.h0) {
                    nrbVar.h(null);
                }
                if (qrbVar.b0 != 3) {
                    qrbVar.N.E("Failed to resolve name: {0}", 3, xeiVar2);
                    qrbVar.b0 = 3;
                }
                jrb jrbVar = krbVar.k;
                if (jrbVar != qrbVar.x) {
                    return;
                }
                ((ffb) jrbVar.h.c).o(xeiVar2);
                return;
            case 15:
                ((kv4) this.b).run();
                mrb mrbVar = (mrb) this.c;
                mrbVar.C.d.m.execute(new mv4(mrbVar, i2));
                return;
            case 16:
                ((hg8) this.b).accept(this.c);
                return;
            case 17:
                grb grbVar = (grb) this.c;
                r3g b2 = grbVar.b(grbVar.o.e, false);
                if (b2 == null) {
                    return;
                }
                ((grb) this.c).b.execute(new a8p(this, b2, z, 18));
                return;
            case 18:
                grb grbVar2 = (grb) ((k1d) this.c).c;
                r3g r3gVar = (r3g) this.b;
                jic jicVar = grb.E;
                grbVar2.f(r3gVar);
                return;
            case 19:
                sjg sjgVar = (sjg) this.c;
                try {
                    Omid.activate((ia0) this.b);
                    sjgVar.c = Omid.isActive();
                    Omid.updateLastActivity();
                    sjgVar.b = Partner.createPartner("Equativ", "8.6.1");
                    return;
                } catch (IllegalArgumentException e6) {
                    fjg c = fjg.c();
                    e6.getMessage();
                    c.f(1);
                    return;
                }
            case 20:
                try {
                    c();
                    return;
                } catch (Error e7) {
                    synchronized (((j5h) this.c).b) {
                        ((j5h) this.c).c = 1;
                        throw e7;
                    }
                }
            case 21:
                View view4 = (View) this.b;
                TeamStandingsFragment teamStandingsFragment = (TeamStandingsFragment) this.c;
                teamStandingsFragment.C().I(view4.getMeasuredWidth());
                krk krkVar2 = teamStandingsFragment.l;
                krkVar2.getClass();
                ((oo8) krkVar2).d.setAdapter(teamStandingsFragment.C());
                view4.addOnLayoutChangeListener(new b2(teamStandingsFragment, 15));
                return;
            case 22:
                ((x40) this.b).invoke((WebView) this.c);
                return;
            case 23:
                o8m o8mVar = (o8m) this.c;
                if (o8mVar.a()) {
                    try {
                        i = w1a.i(new JSONObject(o8mVar.j.version()));
                    } catch (Exception e8) {
                        de0.g(p5m.ONE_DT_GENERAL_ERROR, e8);
                        hpo.h("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e8.toString());
                    }
                    o8mVar.i = i;
                    i2m.b.post((lv4) this.b);
                    return;
                }
                i = new n6g(3, "", false);
                o8mVar.i = i;
                i2m.b.post((lv4) this.b);
                return;
            case 24:
                csm csmVar = (csm) this.c;
                csm.ork(csmVar);
                tszVar = csmVar.dax;
                if (tszVar != null) {
                    tszVar2 = csmVar.dax;
                    tszVar2.obtainMessage(107, (nem) this.b).sendToTarget();
                    return;
                }
                return;
            case 25:
                ((qfn) this.c).S1("onConnectedNodes");
                return;
            case 26:
                ((rfn) ((o4n) this.b).c).c.remove((String) this.c);
                return;
            case 27:
                b();
                return;
            case 28:
                try {
                    ((zzate) this.c).b.put((zzats) this.b);
                    return;
                } catch (InterruptedException unused3) {
                    Thread.currentThread().interrupt();
                    return;
                }
            default:
                i1k i1kVar = (i1k) this.b;
                Runnable runnable = (Runnable) this.c;
                if (((IInterface) i1kVar.k) != null || i1kVar.a) {
                    if (!i1kVar.a) {
                        runnable.run();
                        return;
                    }
                    ArrayList arrayList2 = (ArrayList) i1kVar.e;
                    synchronized (arrayList2) {
                        arrayList2.add(runnable);
                    }
                    return;
                }
                ArrayList arrayList3 = (ArrayList) i1kVar.e;
                synchronized (arrayList3) {
                    arrayList3.add(runnable);
                }
                zxc zxcVar = new zxc(i1kVar, r5 ? 1 : 0);
                i1kVar.j = zxcVar;
                i1kVar.a = true;
                if (((Context) i1kVar.c).bindService((Intent) i1kVar.g, zxcVar, 65)) {
                    return;
                }
                i1kVar.a = false;
                ArrayList arrayList4 = (ArrayList) i1kVar.e;
                synchronized (arrayList4) {
                    arrayList4.clear();
                }
                return;
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                zzbh zzbhVar = new zzbh(pyn.class.getSimpleName());
                c0l c0lVar = new c0l(17, false);
                zzbhVar.c.c = c0lVar;
                zzbhVar.c = c0lVar;
                c0lVar.b = (axn) obj;
                return zzbhVar.toString();
            case 11:
                en0 I = qea.I(this);
                sx2 sx2Var = new sx2();
                ((sx2) I.e).c = sx2Var;
                I.e = sx2Var;
                sx2Var.b = (rt8) obj;
                return I.toString();
            case 20:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((j5h) obj).c;
                sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pyn(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public pyn(j5h j5hVar) {
        this.a = 20;
        this.c = j5hVar;
    }

    public /* synthetic */ pyn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
