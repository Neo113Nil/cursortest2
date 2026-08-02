package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.zzaex;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzcnu;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzerj;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzfua;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzjf;
import com.google.android.gms.internal.ads.zzv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.internal.zzgj;
import com.google.android.gms.wearable.internal.zzhk;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.event.standings.EventStandingsFragment;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.coroutines.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class lv4 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public lv4(zzbgg zzbggVar, zzbfw zzbfwVar, WebView webView, boolean z) {
        this.a = 17;
        this.b = webView;
        this.d = zzbggVar;
        this.c = new smn(this, zzbfwVar, webView, z);
    }

    private final void a() {
        kzf kzfVar = (kzf) this.d;
        kzfVar.b((ps0) this.c, (TaskCompletionSource) this.b);
        ((AtomicInteger) kzfVar.i.c).set(0);
        double min = Math.min(3600000.0d, Math.pow(kzfVar.b, kzfVar.a()) * (60000.0d / kzfVar.a));
        String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d));
        try {
            Thread.sleep((long) min);
        } catch (InterruptedException unused) {
        }
    }

    private final void b() {
        lj2 lj2Var = (lj2) this.c;
        try {
            td4.t0(lj2Var.e.minusKey(d.Q7), new cce((k6g) this.b, lj2Var, (hb4) this.d, (rq3) null, 10));
        } catch (Throwable th) {
            lj2Var.a(th);
        }
    }

    private final void c() {
        ((xx3) this.d).execute((jqi) this.c);
    }

    private final void d() {
        ((o8m) this.d).e((ComponentName) this.c, (IBinder) this.b);
    }

    private final /* synthetic */ void e() {
        zzaex zzaexVar = (zzaex) this.c;
        zzv zzvVar = (zzv) this.b;
        zzjf zzjfVar = (zzjf) this.d;
        zzaexVar.getClass();
        String str = zzfm.a;
        zzaexVar.b.b(zzvVar, zzjfVar);
    }

    private final void f() {
        qfn qfnVar = (qfn) this.c;
        zzgj zzgjVar = (zzgj) this.d;
        zzhk zzhkVar = (zzhk) this.b;
        try {
            if (qfnVar.S1("onRequestReceived") == null) {
                zzgjVar.Z1(false, null);
            } else {
                String str = zzhkVar.d;
                zzgjVar.Z1(false, null);
            }
        } catch (RemoteException unused) {
        }
    }

    private final void g() {
        zzats zzatsVar = (zzats) this.c;
        zzatsVar.zzl();
        zzaty zzatyVar = (zzaty) this.b;
        zzaub zzaubVar = zzatyVar.c;
        if (zzaubVar == null) {
            zzatsVar.d(zzatyVar.a);
        } else {
            zzatsVar.zzt(zzaubVar);
        }
        if (zzatyVar.d) {
            zzatsVar.zzc("intermediate-response");
        } else {
            zzatsVar.a("done");
        }
        Runnable runnable = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        }
    }

    private final void h() {
        LifecycleCallback lifecycleCallback = (LifecycleCallback) this.c;
        b10 b10Var = (b10) this.d;
        if (b10Var.b > 0) {
            Bundle bundle = (Bundle) b10Var.d;
            lifecycleCallback.onCreate(bundle != null ? bundle.getBundle((String) this.b) : null);
        }
        if (b10Var.b >= 2) {
            lifecycleCallback.onStart();
        }
        if (b10Var.b >= 3) {
            lifecycleCallback.onResume();
        }
        if (b10Var.b >= 4) {
            lifecycleCallback.onStop();
        }
        if (b10Var.b >= 5) {
            lifecycleCallback.onDestroy();
        }
    }

    private final void i() {
        smn smnVar = (smn) this.c;
        WebView webView = (WebView) this.b;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", smnVar);
            } catch (Throwable unused) {
                smnVar.onReceiveValue("");
            }
        }
    }

    private final /* synthetic */ void j() {
        Cast.MessageReceivedCallback messageReceivedCallback;
        b bVar = (b) this.c;
        HashMap hashMap = bVar.a.D;
        String str = (String) this.b;
        synchronized (hashMap) {
            messageReceivedCallback = (Cast.MessageReceivedCallback) hashMap.get(str);
        }
        if (messageReceivedCallback == null) {
            zzbm.H.a("Discarded message for unknown namespace '%s'", str);
        } else {
            String str2 = (String) this.d;
            CastDevice castDevice = bVar.a.B;
            messageReceivedCallback.a(str2);
        }
    }

    private final void k() {
        AdManagerAdView adManagerAdView = (AdManagerAdView) this.c;
        if (adManagerAdView.zza((zzbu) this.b)) {
            ((zzbou) this.d).a.onAdManagerAdViewLoaded(adManagerAdView);
        } else {
            zzo.zzi("Could not bind.");
        }
    }

    private final void l() {
        zzcht zzchtVar = ((zzchj) this.d).q;
        if (zzchtVar != null) {
            zzchtVar.j((String) this.c, (String) this.b);
        }
    }

    private final /* synthetic */ void m() {
        vdb vdbVar = (vdb) this.c;
        String str = (String) this.b;
        n8p n8pVar = (n8p) this.d;
        vdbVar.i(str, new ksn(n8pVar, 0), new ksn(n8pVar, 1));
    }

    private final /* synthetic */ void n() {
        ((n) this.c).t0((String) this.b, (ValueCallback) this.d);
    }

    private final /* synthetic */ void o() {
        zzcnu zzcnuVar = (zzcnu) this.c;
        Context context = (Context) this.b;
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.d;
        long elapsedRealtime = zzt.zzk().elapsedRealtime();
        zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) zzba.zzc().a(zzbjg.Lf)).booleanValue()) {
            long elapsedRealtime2 = zzt.zzk().elapsedRealtime() - elapsedRealtime;
            zzeai a = zzcnuVar.b.a();
            a.b("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length());
            sb.append(elapsedRealtime2);
            a.b("webview_startup_l", sb.toString());
            a.c();
        }
        if (((Boolean) zzba.zzc().a(zzbjg.Rf)).booleanValue()) {
            zzcgj.f.execute(new fsn(zzcnuVar, 8));
        }
    }

    private final /* synthetic */ void p() {
        ((zzfte) this.c).b((String) this.b, (com.google.android.gms.ads.internal.util.client.zzv) this.d, null, null);
    }

    private final void q() {
        int i;
        Task b;
        CloudMessage cloudMessage = (CloudMessage) this.b;
        Intent intent = cloudMessage.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            b = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = cloudMessage.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = cloudMessage.a;
            Integer valueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (valueOf != null) {
                bundle.putInt("google.product_id", valueOf.intValue());
            }
            Context context = (Context) this.c;
            bundle.putBoolean("supports_message_handled", true);
            com.google.android.gms.cloudmessaging.zzv a = com.google.android.gms.cloudmessaging.zzv.a(context);
            synchronized (a) {
                i = a.d;
                a.d = i + 1;
            }
            b = a.b(new s3p(i, 2, bundle, 0));
        }
        b.addOnCompleteListener(g35.f, new mxn((CountDownLatch) this.d, 8));
    }

    private final /* synthetic */ void r() {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.c;
        String str = (String) this.b;
        zzu zzuVar = (zzu) this.d;
        int i = zzele.c;
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzele.g(sQLiteDatabase, zzuVar);
    }

    private final /* synthetic */ void s() {
        zzerj.c((zzflo) this.c, (zzfld) this.b, (zzemt) this.d);
    }

    private final /* synthetic */ void t() {
        zzfua zzfuaVar = (zzfua) this.c;
        zzftp zzftpVar = (zzftp) this.b;
        zzfvd zzfvdVar = (zzfvd) this.d;
        if (zzfuaVar.b.compareAndSet(false, true)) {
            zzftpVar.b(zzfvdVar, true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        sr9 a;
        OverScroller overScroller;
        ood oodVar;
        nod nodVar;
        Socket socket;
        Socket socket2;
        lof lofVar;
        av9 av9Var;
        av9 av9Var2;
        vwd vwdVar;
        double d;
        SSLSession sSLSession = null;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((mrb) this.d).u.P((c5n) this.c, (qic) this.b);
                return;
            case 1:
                ((pv4) this.d).h.J((xei) this.c, (qic) this.b);
                return;
            case 2:
                EventStandingsFragment eventStandingsFragment = (EventStandingsFragment) this.b;
                jai C = eventStandingsFragment.C();
                View view = (View) this.d;
                C.I(view.getMeasuredWidth());
                krk krkVar = eventStandingsFragment.l;
                krkVar.getClass();
                ((oo8) krkVar).d.setAdapter(eventStandingsFragment.C());
                view.addOnLayoutChangeListener(new b2(eventStandingsFragment, 5));
                return;
            case 3:
                b48 b48Var = (b48) this.d;
                Activity activity = (Activity) this.c;
                y0 y0Var = (y0) this.b;
                if (b48Var.j == null) {
                    return;
                }
                w38 w38Var = new w38(0, b48Var, activity);
                HashMap hashMap = new HashMap();
                lw9 lw9Var = b48Var.j;
                ArrayList arrayList = new ArrayList();
                int i = a48.a[lw9Var.a.ordinal()];
                if (i == 1) {
                    arrayList.add(((wz0) lw9Var).f);
                } else if (i == 2) {
                    arrayList.add(((gtc) lw9Var).f);
                } else if (i == 3) {
                    arrayList.add(((at9) lw9Var).d);
                } else if (i != 4) {
                    arrayList.add(new wa(null, null));
                } else {
                    jk2 jk2Var = (jk2) lw9Var;
                    arrayList.add(jk2Var.f);
                    arrayList.add(jk2Var.g);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    wa waVar = (wa) it.next();
                    hashMap.put(waVar, (waVar == null || TextUtils.isEmpty(waVar.a)) ? w38Var : new x38(b48Var, waVar, activity));
                }
                ViewTreeObserver.OnGlobalLayoutListener j = y0Var.j(hashMap, w38Var);
                if (j != null) {
                    y0Var.h().getViewTreeObserver().addOnGlobalLayoutListener(j);
                }
                lw9 lw9Var2 = b48Var.j;
                if (lw9Var2.a == MessageType.CARD) {
                    jk2 jk2Var2 = (jk2) lw9Var2;
                    a = jk2Var2.h;
                    sr9 sr9Var = jk2Var2.i;
                    if (b48Var.h.getResources().getConfiguration().orientation != 1 ? !(sr9Var == null || TextUtils.isEmpty(sr9Var.a)) : !(a != null && !TextUtils.isEmpty(a.a))) {
                        a = sr9Var;
                    }
                } else {
                    a = lw9Var2.a();
                }
                z38 z38Var = new z38(b48Var, y0Var, activity, j);
                if (a == null || TextUtils.isEmpty(a.a)) {
                    z38Var.d();
                    return;
                }
                iz7 iz7Var = b48Var.c;
                String str = a.a;
                iz7Var.getClass();
                upa upaVar = new upa();
                vpa vpaVar = new vpa("image/*");
                HashMap hashMap2 = new HashMap(upaVar.a.size());
                for (Map.Entry entry : upaVar.a.entrySet()) {
                    hashMap2.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
                }
                upaVar.a = hashMap2;
                List list = (List) upaVar.a.get("Accept");
                if (list == null) {
                    list = new ArrayList();
                    upaVar.a.put("Accept", list);
                }
                list.add(vpaVar);
                qz8 qz8Var = new qz8(str, new wpa(upaVar.a));
                n0g n0gVar = iz7Var.a;
                n0gVar.getClass();
                c0g w = new c0g(n0gVar.a, n0gVar, Drawable.class, n0gVar.b).w(qz8Var);
                w.getClass();
                c0g c0gVar = (c0g) w.l(n75.f).l(gy8.a);
                hcc hccVar = new hcc(iz7Var, c0gVar);
                c0gVar.r(new kz8(b48Var.j, b48Var.k));
                hccVar.c = activity.getClass().getSimpleName();
                hccVar.J();
                c0gVar.i();
                ImageView h = y0Var.h();
                Objects.toString(z38Var);
                z38Var.b = h;
                c0gVar.v(z38Var);
                hccVar.b = z38Var;
                hccVar.J();
                return;
            case 4:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.c;
                y79 y79Var = (y79) this.d;
                View view2 = (View) this.b;
                if (view2 == null || (overScroller = y79Var.d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    y79Var.A(coordinatorLayout, view2, y79Var.d.getCurrY());
                    view2.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                ((AppBarLayout.BaseBehavior) y79Var).F(coordinatorLayout, appBarLayout);
                if (appBarLayout.l) {
                    appBarLayout.h(appBarLayout.i(AppBarLayout.BaseBehavior.C(coordinatorLayout)));
                    return;
                }
                return;
            case 5:
                rk3 rk3Var = (rk3) this.b;
                dfb dfbVar = (dfb) this.c;
                jrb jrbVar = (jrb) this.d;
                qrb qrbVar = jrbVar.i;
                if (jrbVar != qrbVar.x) {
                    return;
                }
                qrbVar.y = dfbVar;
                qrbVar.E.g(dfbVar);
                if (rk3Var != rk3.e) {
                    jrbVar.i.N.E("Entering {0} state with picker: {1}", 2, rk3Var, dfbVar);
                    jrbVar.i.r.f(rk3Var);
                    return;
                }
                return;
            case 6:
                try {
                    ((CountDownLatch) this.c).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                lof lofVar2 = new lof(new mod());
                try {
                    try {
                        ood oodVar2 = (ood) this.d;
                        ki9 ki9Var = oodVar2.N;
                        if (ki9Var == null) {
                            socket = oodVar2.A.createSocket(oodVar2.a.getAddress(), ((ood) this.d).a.getPort());
                        } else {
                            SocketAddress socketAddress = ki9Var.a;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new zei(xei.l.h("Unsupported SocketAddress implementation " + ((ood) this.d).N.a.getClass()));
                            }
                            socket = oodVar2.f(ki9Var.b, (InetSocketAddress) socketAddress, ki9Var.c, ki9Var.d);
                        }
                        ood oodVar3 = (ood) this.d;
                        SSLSocketFactory sSLSocketFactory = oodVar3.B;
                        socket2 = socket;
                        if (sSLSocketFactory != null) {
                            String str2 = oodVar3.b;
                            URI a2 = n49.a(str2);
                            if (a2.getHost() != null) {
                                str2 = a2.getHost();
                            }
                            SSLSocket a3 = xod.a(sSLSocketFactory, socket, str2, ((ood) this.d).i(), ((ood) this.d).E);
                            sSLSession = a3.getSession();
                            socket2 = a3;
                        }
                        socket2.setTcpNoDelay(true);
                        qoh qohVar = new qoh(socket2);
                        InputStream inputStream = socket2.getInputStream();
                        inputStream.getClass();
                        lofVar = new lof(new xk0(qohVar, new xk0(inputStream, qohVar)));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (zei e) {
                    e = e;
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    tk0 tk0Var = (tk0) this.b;
                    qoh qohVar2 = new qoh(socket2);
                    OutputStream outputStream = socket2.getOutputStream();
                    outputStream.getClass();
                    tk0Var.e(new wk0(qohVar2, new wk0(outputStream, qohVar2)), socket2);
                    ood oodVar4 = (ood) this.d;
                    sm0 sm0Var = oodVar4.u;
                    sm0Var.getClass();
                    f4a f4aVar = new f4a(sm0Var, 26);
                    f4aVar.x(t62.j, socket2.getRemoteSocketAddress());
                    f4aVar.x(t62.k, socket2.getLocalSocketAddress());
                    f4aVar.x(t62.l, sSLSession);
                    f4aVar.x(j72.d, sSLSession == null ? wzg.a : wzg.b);
                    oodVar4.u = f4aVar.c();
                    ood oodVar5 = (ood) this.d;
                    oodVar5.g.getClass();
                    oodVar5.t = new nod(oodVar5, new pg9(lofVar));
                    synchronized (((ood) this.d).k) {
                        if (sSLSession != null) {
                            try {
                                new zic(sSLSession);
                            } finally {
                            }
                        }
                    }
                    return;
                } catch (zei e3) {
                    e = e3;
                    lofVar2 = lofVar;
                    ((ood) this.d).q(0, up5.INTERNAL_ERROR, e.a);
                    oodVar = (ood) this.d;
                    oodVar.g.getClass();
                    nodVar = new nod(oodVar, new pg9(lofVar2));
                    oodVar.t = nodVar;
                    return;
                } catch (Exception e4) {
                    e = e4;
                    lofVar2 = lofVar;
                    ((ood) this.d).m(e);
                    oodVar = (ood) this.d;
                    oodVar.g.getClass();
                    nodVar = new nod(oodVar, new pg9(lofVar2));
                    oodVar.t = nodVar;
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    lofVar2 = lofVar;
                    ood oodVar6 = (ood) this.d;
                    oodVar6.g.getClass();
                    oodVar6.t = new nod(oodVar6, new pg9(lofVar2));
                    throw th;
                }
            case 7:
                axd axdVar = (axd) this.d;
                axdVar.m = Long.valueOf(axdVar.j.l());
                for (twd twdVar : ((HashMap) ((axd) this.d).g.s).values()) {
                    k1d k1dVar = twdVar.c;
                    ((AtomicLong) k1dVar.b).set(0L);
                    ((AtomicLong) k1dVar.c).set(0L);
                    k1d k1dVar2 = twdVar.b;
                    twdVar.b = twdVar.c;
                    twdVar.c = k1dVar2;
                }
                vwd vwdVar2 = (vwd) this.c;
                ao2 ao2Var = (ao2) this.b;
                zu9 s = hv9.s();
                if (vwdVar2.e != null) {
                    s.c(new uwd(vwdVar2, ao2Var, 1));
                }
                if (vwdVar2.f != null) {
                    s.c(new uwd(vwdVar2, ao2Var, 0));
                }
                av9 listIterator = s.g().listIterator(0);
                while (listIterator.hasNext()) {
                    uwd uwdVar = (uwd) listIterator.next();
                    axd axdVar2 = (axd) this.d;
                    wp4 wp4Var = axdVar2.g;
                    long longValue = axdVar2.m.longValue();
                    switch (uwdVar.a) {
                        case 0:
                            av9Var = listIterator;
                            vwd vwdVar3 = uwdVar.b;
                            ArrayList B = axd.B(wp4Var, ((Integer) vwdVar3.f.e).intValue());
                            int size = B.size();
                            g7h g7hVar = vwdVar3.f;
                            if (size >= ((Integer) g7hVar.d).intValue() && B.size() != 0) {
                                Iterator it2 = B.iterator();
                                while (it2.hasNext()) {
                                    twd twdVar2 = (twd) it2.next();
                                    if (wp4Var.k0() >= vwdVar3.d.intValue()) {
                                        break;
                                    }
                                    if (twdVar2.c() >= ((Integer) g7hVar.e).intValue()) {
                                        if (((AtomicLong) twdVar2.c.c).get() / twdVar2.c() > ((Integer) g7hVar.b).intValue() / 100.0d) {
                                            uwdVar.c.E("FailurePercentage algorithm detected outlier: {0}, failureRate={1}", 1, twdVar2, Double.valueOf(((AtomicLong) twdVar2.c.c).get() / twdVar2.c()));
                                            if (new Random().nextInt(100) < ((Integer) g7hVar.c).intValue()) {
                                                twdVar2.b(longValue);
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            break;
                        default:
                            vwd vwdVar4 = uwdVar.b;
                            ArrayList B2 = axd.B(wp4Var, ((Integer) vwdVar4.e.e).intValue());
                            int size2 = B2.size();
                            ujg ujgVar = vwdVar4.e;
                            if (size2 >= ((Integer) ujgVar.d).intValue() && B2.size() != 0) {
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it3 = B2.iterator();
                                while (it3.hasNext()) {
                                    twd twdVar3 = (twd) it3.next();
                                    arrayList2.add(Double.valueOf(((AtomicLong) twdVar3.c.b).get() / twdVar3.c()));
                                    B2 = B2;
                                }
                                ArrayList arrayList3 = B2;
                                Iterator it4 = arrayList2.iterator();
                                double d2 = 0.0d;
                                double d3 = 0.0d;
                                while (it4.hasNext()) {
                                    d3 = ((Double) it4.next()).doubleValue() + d3;
                                }
                                double size3 = d3 / arrayList2.size();
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    double doubleValue = ((Double) it5.next()).doubleValue() - size3;
                                    d2 = (doubleValue * doubleValue) + d2;
                                }
                                double sqrt = Math.sqrt(d2 / arrayList2.size());
                                double intValue = size3 - ((((Integer) ujgVar.b).intValue() / 1000.0f) * sqrt);
                                Iterator it6 = arrayList3.iterator();
                                while (it6.hasNext()) {
                                    twd twdVar4 = (twd) it6.next();
                                    wp4 wp4Var2 = wp4Var;
                                    if (wp4Var.k0() < vwdVar4.d.intValue()) {
                                        vwd vwdVar5 = vwdVar4;
                                        if (((AtomicLong) twdVar4.c.b).get() / twdVar4.c() < intValue) {
                                            vwdVar = vwdVar5;
                                            av9Var2 = listIterator;
                                            d = sqrt;
                                            uwdVar.c.E("SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", 1, twdVar4, Double.valueOf(((AtomicLong) twdVar4.c.b).get() / twdVar4.c()), Double.valueOf(size3), Double.valueOf(sqrt), Double.valueOf(intValue));
                                            if (new Random().nextInt(100) < ((Integer) ujgVar.c).intValue()) {
                                                twdVar4.b(longValue);
                                            }
                                        } else {
                                            av9Var2 = listIterator;
                                            vwdVar = vwdVar5;
                                            d = sqrt;
                                        }
                                        vwdVar4 = vwdVar;
                                        listIterator = av9Var2;
                                        wp4Var = wp4Var2;
                                        sqrt = d;
                                    }
                                }
                            }
                            av9Var = listIterator;
                            break;
                    }
                    listIterator = av9Var;
                }
                axd axdVar3 = (axd) this.d;
                wp4 wp4Var3 = axdVar3.g;
                Long l = axdVar3.m;
                for (twd twdVar5 : ((HashMap) wp4Var3.s).values()) {
                    if (!twdVar5.d()) {
                        int i2 = twdVar5.e;
                        twdVar5.e = i2 == 0 ? 0 : i2 - 1;
                    }
                    if (twdVar5.d()) {
                        if (l.longValue() > Math.min(twdVar5.a.b.longValue() * twdVar5.e, Math.max(twdVar5.a.b.longValue(), twdVar5.a.c.longValue())) + twdVar5.d.longValue()) {
                            twdVar5.e();
                        }
                    }
                }
                return;
            case 8:
                a();
                return;
            case 9:
                try {
                    obj = ((gg8) this.c).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new pyn(16, (hg8) this.b, obj));
                return;
            case 10:
                b();
                return;
            case 11:
                c();
                return;
            case 12:
                d();
                return;
            case 13:
                e();
                return;
            case 14:
                f();
                return;
            case 15:
                g();
                return;
            case 16:
                h();
                return;
            case 17:
                i();
                return;
            case 18:
                j();
                return;
            case 19:
                k();
                return;
            case 20:
                l();
                return;
            case 21:
                m();
                return;
            case 22:
                n();
                return;
            case 23:
                o();
                return;
            case 24:
                p();
                return;
            case 25:
                q();
                return;
            case 26:
                r();
                return;
            case 27:
                s();
                return;
            case 28:
                t();
                return;
            default:
                veo veoVar = (veo) this.c;
                HashMap hashMap3 = (HashMap) this.b;
                Context context = (Context) this.d;
                hashMap3.putAll(veoVar.e.a());
                veoVar.e(hashMap3);
                hashMap3.put(InneractiveMediationDefs.GENDER_FEMALE, CampaignEx.JSON_KEY_AD_Q);
                hashMap3.put("ctx", context);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 11:
                return ((Runnable) this.b).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ lv4(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ lv4(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ lv4(qfn qfnVar, zzgj zzgjVar, zzhk zzhkVar) {
        this.a = 14;
        this.c = qfnVar;
        this.d = zzgjVar;
        this.b = zzhkVar;
    }

    public /* synthetic */ lv4() {
        this.a = 9;
    }
}
