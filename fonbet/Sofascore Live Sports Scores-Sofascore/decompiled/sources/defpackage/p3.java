package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.g;
import androidx.fragment.app.y;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.inmobi.media.Bo;
import com.inmobi.media.G3;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.Ha;
import com.inmobi.media.Uo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.Ae;
import com.ironsource.C4037d9;
import com.ironsource.C4221ne;
import com.ironsource.InterfaceC4292re;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.FirebaseBundle;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.fantasy.competition.FantasyCompetitionActivity;
import com.sofascore.results.mvvm.base.AbstractFragment;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p3(ViewGroup viewGroup, View view, c cVar) {
        this.a = 14;
        this.b = viewGroup;
        this.d = view;
        this.c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        Integer num;
        boolean z;
        o72 o72Var;
        int i = 1;
        switch (this.a) {
            case 0:
                AbstractFragment abstractFragment = (AbstractFragment) this.b;
                Function1 function1 = (Function1) this.c;
                View view = (View) this.d;
                if (abstractFragment.l != null) {
                    function1.invoke(view);
                    return;
                }
                return;
            case 1:
                f4a f4aVar = (f4a) this.b;
                scc sccVar = (scc) this.c;
                IOException iOException = (IOException) this.d;
                wk wkVar = (wk) f4aVar.c;
                hr9 hr9Var = wkVar.n;
                int i2 = sccVar.b;
                int i3 = sccVar.c;
                if (hr9Var.l == null) {
                    return;
                }
                ah ahVar = (ah) hr9Var.f.get(wkVar);
                ahVar.getClass();
                if (ahVar.q == null) {
                    return;
                }
                try {
                    ahVar.j(i2, iOException, i3);
                    return;
                } catch (RuntimeException e) {
                    ahVar.r(e, "handlePrepareError");
                    return;
                }
            case 2:
                Ae.a.a((InterfaceC4292re) this.b, (C4221ne) this.c, (C4037d9) this.d);
                return;
            case 3:
                AnalyticsClient.b((Sdk.SDKError.Reason) this.b, (String) this.c, (s) this.d);
                return;
            case 4:
                t30 t30Var = (t30) this.b;
                r30 r30Var = (r30) this.c;
                s30 s30Var = (s30) this.d;
                ActionMode startActionMode = t30Var.a.startActionMode(new w88(r30Var), 1);
                Intrinsics.c(t30Var.h, startActionMode);
                if (startActionMode == null) {
                    s30Var.close();
                    return;
                }
                return;
            case 5:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                vdb vdbVar = (vdb) this.d;
                int i4 = 18;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new y2(vdbVar, i4));
                    }
                    synchronized (lp0.p) {
                        try {
                            int i5 = lp0.r - 1;
                            lp0.r = i5;
                            if (i5 == 0) {
                                ScheduledExecutorService scheduledExecutorService = lp0.q;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                lp0.q = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new y2(vdbVar, i4));
                    }
                    synchronized (lp0.p) {
                        try {
                            int i6 = lp0.r - 1;
                            lp0.r = i6;
                            if (i6 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = lp0.q;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                lp0.q = null;
                            }
                            throw th;
                        } finally {
                        }
                    }
                }
            case 6:
                Context context = (Context) this.b;
                cn1 cn1Var = (cn1) this.c;
                ez0 ez0Var = cn1Var.d;
                zm1 zm1Var = (zm1) this.d;
                int width = hkg.c0(context) ? ((ScrollInterceptorHorizontalScrollView) ez0Var.d).getChildAt(0).getWidth() : 0;
                hf9 hf9Var = (hf9) cn1Var.c.d();
                if (hf9Var != null && (hashMap = hf9Var.d) != null && (num = (Integer) hashMap.get(zm1Var.m.a)) != null) {
                    width = num.intValue();
                }
                ((ScrollInterceptorHorizontalScrollView) ez0Var.d).scrollTo(width, 0);
                return;
            case 7:
                Bo.a((AdConfig.WebAssetCacheConfig) this.b, (Bo) this.c, (Context) this.d);
                return;
            case 8:
                WorkDatabase workDatabase = (WorkDatabase) this.b;
                String str = (String) this.c;
                xbl xblVar = (xbl) this.d;
                qcl g = workDatabase.g();
                g.getClass();
                str.getClass();
                Iterator it = ((List) gz8.S(g.a, true, false, new cfi(str, 12))).iterator();
                while (it.hasNext()) {
                    fcp.b0(xblVar, (String) it.next());
                }
                return;
            case 9:
                ((BiConsumer) this.b).accept((String) this.c, (fi3) this.d);
                return;
            case 10:
                sn3 sn3Var = (sn3) this.b;
                fsf fsfVar = (fsf) this.c;
                fsf fsfVar2 = (fsf) this.d;
                yia yiaVar = sn3Var.c;
                if (yiaVar != null) {
                    String str2 = (String) fsfVar.a;
                    tn3 tn3Var = (tn3) fsfVar2.a;
                    if (tn3Var == null) {
                        tn3Var = tn3.d;
                    }
                    yiaVar.h(str2, tn3Var);
                    return;
                }
                return;
            case 11:
                nw3 nw3Var = (nw3) this.b;
                String str3 = (String) this.c;
                String str4 = (String) this.d;
                jw3 jw3Var = nw3Var.g;
                jw3Var.getClass();
                try {
                    ((en0) jw3Var.d.d).w(str3, str4);
                    return;
                } catch (IllegalArgumentException e2) {
                    Context context2 = jw3Var.a;
                    if (context2 != null && (context2.getApplicationInfo().flags & 2) != 0) {
                        throw e2;
                    }
                    return;
                }
            case 12:
                z41 z41Var = (z41) this.b;
                ph2 ph2Var = (ph2) this.c;
                c2g c2gVar = (c2g) this.d;
                xn4 xn4Var = (xn4) z41Var.c;
                if (xn4Var.b.Z()) {
                    ph2Var.m(xn4Var, new IOException("Canceled"));
                    return;
                } else {
                    ph2Var.e(xn4Var, c2gVar);
                    return;
                }
            case 13:
                ((ph2) this.c).m((xn4) ((z41) this.b).c, (Throwable) this.d);
                return;
            case 14:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view2 = (View) this.d;
                c cVar = (c) this.c;
                viewGroup.getClass();
                viewGroup.endViewTransition(view2);
                cVar.c.a.c(cVar);
                return;
            case 15:
                y yVar = (y) this.b;
                y yVar2 = (y) this.c;
                g gVar = (g) this.d;
                Fragment fragment = yVar.c;
                Fragment fragment2 = yVar2.c;
                boolean z2 = gVar.o;
                lq8 lq8Var = gq8.a;
                if (z2) {
                    fragment2.getEnterTransitionCallback();
                    return;
                } else {
                    fragment.getEnterTransitionCallback();
                    return;
                }
            case 16:
                oy4 oy4Var = (oy4) this.b;
                lw9 lw9Var = (lw9) this.c;
                wa waVar = (wa) this.d;
                g01 g01Var = oy4Var.r;
                Context context3 = g01Var.a;
                String str5 = g01Var.b;
                KProperty[] kPropertyArr = BaseActivity.H;
                String str6 = waVar.a;
                o72 o72Var2 = waVar.b;
                if (lw9Var instanceof jk2) {
                    o72 o72Var3 = ((jk2) lw9Var).f.b;
                    z = Intrinsics.c(o72Var3 != null ? o72Var3.a : null, o72Var2 != null ? o72Var2.a : null);
                } else if (lw9Var instanceof gtc) {
                    wa waVar2 = ((gtc) lw9Var).f;
                    z = Intrinsics.c((waVar2 == null || (o72Var = waVar2.b) == null) ? null : o72Var.a, o72Var2 != null ? o72Var2.a : null);
                } else if (lw9Var instanceof wz0) {
                    wa waVar3 = ((wz0) lw9Var).f;
                    z = Intrinsics.c(waVar3 != null ? waVar3.a : null, str6);
                } else if (lw9Var instanceof at9) {
                    wa waVar4 = ((at9) lw9Var).d;
                    z = Intrinsics.c(waVar4 != null ? waVar4.a : null, str6);
                } else {
                    z = false;
                }
                context3.getClass();
                String str7 = (String) lw9Var.b.c;
                str5.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString(Payload.CAMPAIGN_ID, str7);
                firebaseBundle.putString("action", z ? "interested" : "not_interested");
                firebaseBundle.putString("location", str5);
                ia0 ia0Var = ia0.q;
                me4.d((f5d) me4.e(), "in_app_message_click", firebaseBundle, context3).a.e(n9e.K(firebaseBundle), null, "in_app_message_click", false);
                return;
            case 17:
                cc5 cc5Var = (cc5) this.b;
                ((ec5) this.c).a(cc5Var.a, cc5Var.b, (Exception) this.d);
                return;
            case 18:
                cc5 cc5Var2 = (cc5) this.b;
                ((ec5) this.c).k(cc5Var2.a, cc5Var2.b, (eja) this.d);
                return;
            case 19:
                fl5 fl5Var = (fl5) this.b;
                dy0 dy0Var = (dy0) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    fg8 s = wkn.s(fl5Var.a);
                    if (s == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    eg8 eg8Var = (eg8) s.a;
                    synchronized (eg8Var.c) {
                        eg8Var.e = threadPoolExecutor;
                    }
                    s.a.a(new el5(dy0Var, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    dy0Var.z(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 20:
                mo5 mo5Var = (mo5) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                try {
                    mo5Var.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 21:
                Context context4 = (Context) this.b;
                vg6 vg6Var = (vg6) this.c;
                cse cseVar = (cse) this.d;
                s6c b = s6c.b(context4);
                if (b == null) {
                    tgj.d0("MediaMetricsService unavailable.");
                    return;
                }
                cn4 cn4Var = vg6Var.s;
                cn4Var.getClass();
                cn4Var.f.a(b);
                LogSessionId d = b.d();
                synchronized (cseVar) {
                    ase aseVar = cseVar.b;
                    aseVar.getClass();
                    aseVar.a(d);
                }
                return;
            case 22:
                FantasyCompetitionActivity fantasyCompetitionActivity = (FantasyCompetitionActivity) this.b;
                ip6 ip6Var = (ip6) this.c;
                do7 do7Var = (do7) this.d;
                jp6 jp6Var = fantasyCompetitionActivity.O;
                if (jp6Var == null) {
                    Intrinsics.i("viewPagerAdapter");
                    throw null;
                }
                kp5 kp5Var = ip6.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj : kp5Var) {
                    if (((Boolean) ((ip6) obj).b.invoke(do7Var.c)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                jp6Var.x(arrayList);
                if (ip6Var != null) {
                    jp6 jp6Var2 = fantasyCompetitionActivity.O;
                    if (jp6Var2 == null) {
                        Intrinsics.i("viewPagerAdapter");
                        throw null;
                    }
                    int D = jp6Var2.D(ip6Var);
                    r1 = D > -1 ? Integer.valueOf(D) : null;
                    if (r1 != null) {
                        fantasyCompetitionActivity.Q().i.c(r1.intValue(), false);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                G3.a((G3) this.b, (ViewGroup) this.c, (Uo) this.d);
                return;
            case 24:
                Ha.a((GestureDetectorOnGestureListenerC3889xi) this.b, (Ha) this.c, (String) this.d);
                return;
            case 25:
                gx9 gx9Var = (gx9) this.b;
                px9 px9Var = (px9) this.c;
                Runnable runnable = (Runnable) this.d;
                if (cw3.a.contains(gx9.class)) {
                    return;
                }
                try {
                    Class cls = gx9Var.f;
                    qx9.B(gx9Var.b, gx9Var.g(), gx9Var.j, px9Var.a, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new dx9(gx9Var, px9Var, runnable)));
                    return;
                } catch (Throwable th3) {
                    cw3.a(gx9.class, th3);
                    return;
                }
            case 26:
                hx9 hx9Var = (hx9) this.b;
                px9 px9Var2 = (px9) this.c;
                Runnable runnable2 = (Runnable) this.d;
                if (cw3.a.contains(hx9.class)) {
                    return;
                }
                try {
                    Class cls2 = hx9Var.o;
                    qx9.B(hx9Var.b, hx9Var.d(), hx9Var.q, hx9Var.g(px9Var2), Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new fx9(hx9Var, new Object[]{px9Var2, runnable2}, i)));
                    return;
                } catch (Throwable th4) {
                    cw3.a(hx9.class, th4);
                    return;
                }
            case 27:
                c7c c7cVar = (c7c) this.b;
                zu9 zu9Var = (zu9) this.c;
                rcc rccVar = (rcc) this.d;
                bn4 bn4Var = c7cVar.c;
                vvf g2 = zu9Var.g();
                ox9 ox9Var = bn4Var.d;
                zke zkeVar = bn4Var.g;
                zkeVar.getClass();
                ox9Var.c = hv9.v(g2);
                if (!g2.isEmpty()) {
                    ox9Var.f = (rcc) g2.get(0);
                    rccVar.getClass();
                    ox9Var.g = rccVar;
                }
                if (((rcc) ox9Var.e) == null) {
                    ox9Var.e = ox9.h(zkeVar, (hv9) ox9Var.c, (rcc) ox9Var.f, (hij) ox9Var.b);
                }
                ox9Var.s(((ug6) zkeVar).j());
                return;
            case 28:
                d7c d7cVar = (d7c) this.b;
                zu9 zu9Var2 = (zu9) this.c;
                scc sccVar2 = (scc) this.d;
                cn4 cn4Var2 = (cn4) d7cVar.j;
                vvf g3 = zu9Var2.g();
                vng vngVar = cn4Var2.d;
                ale aleVar = cn4Var2.g;
                aleVar.getClass();
                vngVar.b = hv9.v(g3);
                if (!g3.isEmpty()) {
                    vngVar.e = (scc) g3.get(0);
                    sccVar2.getClass();
                    vngVar.f = sccVar2;
                }
                if (((scc) vngVar.d) == null) {
                    vngVar.d = vng.G(aleVar, (hv9) vngVar.b, (scc) vngVar.e, (iij) vngVar.a);
                }
                vngVar.p0(aleVar.getCurrentTimeline());
                return;
            default:
                bc5 bc5Var = (bc5) this.b;
                ((ddc) this.c).g(bc5Var.a, bc5Var.b, (l6c) this.d);
                return;
        }
    }

    public /* synthetic */ p3(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
