package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.webkit.ProfileStore;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcge;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzchk;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzchw;
import com.google.android.gms.internal.ads.zzcjk;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcnl;
import com.google.android.gms.internal.ads.zzcnu;
import com.google.android.gms.internal.ads.zzcny;
import com.google.android.gms.internal.ads.zzcuy;
import com.google.android.gms.internal.ads.zzcza;
import com.google.android.gms.internal.ads.zzdaw;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcq;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqz;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzeai;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzeea;
import com.google.android.gms.internal.ads.zzeet;
import com.google.android.gms.internal.ads.zzeew;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzegt;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzhdr;
import com.google.android.gms.internal.pal.zzeb;
import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzdk;
import com.ironsource.C4227o2;
import com.ironsource.L6;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fsn implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ fsn() {
        this.a = 19;
    }

    private final void a() {
        zzdec zzdecVar = (zzdec) this.b;
        synchronized (zzdecVar) {
            int i = zze.zza;
            zzo.zzf("Timeout waiting for show call succeed to be called.");
            zzdecVar.L(new zzdol("Timeout for show call succeed."));
            zzdecVar.d = true;
        }
    }

    private final void b() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        zzeea zzeeaVar = (zzeea) this.b;
        zzclm zzclmVar = zzeeaVar.d;
        zzedp zzedpVar = zzeeaVar.c;
        synchronized (zzedpVar) {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(L6.H, "ANDROID");
                    String str = zzedpVar.k;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                        sb.append("afma-sdk-a-v");
                        sb.append(str);
                        jSONObject.put("sdkVersion", sb.toString());
                    }
                    jSONObject.put("internalSdkVersion", zzedpVar.i);
                    jSONObject.put("osVersion", Build.VERSION.RELEASE);
                    jSONObject.put("adapters", zzedpVar.d.a());
                    if (((Boolean) zzba.zzc().a(zzbjg.Wa)).booleanValue()) {
                        String str2 = zzt.zzh().g;
                        if (!TextUtils.isEmpty(str2)) {
                            jSONObject.put(L6.L, str2);
                        }
                    }
                    if (zzedpVar.q < zzt.zzk().a() / 1000) {
                        zzedpVar.o = "{}";
                    }
                    jSONObject.put("networkExtras", zzedpVar.o);
                    jSONObject.put("adSlots", zzedpVar.i());
                    jSONObject.put("appInfo", zzedpVar.e.a());
                    String str3 = zzt.zzh().g().zzi().e;
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("cld", new JSONObject(str3));
                    }
                    if (((Boolean) zzba.zzc().a(zzbjg.La)).booleanValue() && (jSONObject2 = zzedpVar.p) != null) {
                        String obj = jSONObject2.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 13);
                        sb2.append("Server data: ");
                        sb2.append(obj);
                        String sb3 = sb2.toString();
                        int i = zze.zza;
                        zzo.zzd(sb3);
                        jSONObject.put(C4227o2.s, zzedpVar.p);
                    }
                    if (((Boolean) zzba.zzc().a(zzbjg.Ka)).booleanValue()) {
                        jSONObject.put("openAction", zzedpVar.v);
                        jSONObject.put("gesture", zzedpVar.r);
                    }
                    jSONObject.put("isGamRegisteredTestDevice", zzt.zzo().zzk());
                    zzt.zzc();
                    zzay.zza();
                    jSONObject.put("isSimulator", zzf.zzy());
                    if (((Boolean) zzba.zzc().a(zzbjg.Ya)).booleanValue()) {
                        jSONObject.put("uiStorage", new JSONObject(zzedpVar.x));
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(zzbjg.ab))) {
                        jSONObject.put("gmaDisk", zzedpVar.h.a);
                    }
                    if (!TextUtils.isEmpty((CharSequence) zzba.zzc().a(zzbjg.Za))) {
                        jSONObject.put("userDisk", zzedpVar.g.a);
                    }
                } catch (JSONException e) {
                    zzt.zzh().e("Inspector.toJson", e);
                    int i2 = zze.zza;
                    zzo.zzj("Ad inspector encountered an error", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzclmVar.c("window.inspectorInfo", jSONObject.toString());
    }

    private final /* synthetic */ void c() {
        zzeez zzeezVar = (zzeez) this.b;
        AtomicReference atomicReference = zzeezVar.d;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(zzeezVar.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeaj zzeajVar;
        ActivityManager.MemoryInfo zze;
        long longValue;
        long intValue;
        boolean booleanValue;
        long j;
        long j2;
        ProfileStore profileStore;
        zzdk zzdkVar;
        hwn hwnVar;
        ProfileStore profileStore2 = null;
        switch (this.a) {
            case 0:
                zzcge zzcgeVar = (zzcge) this.b;
                while (zzcgeVar.e.get()) {
                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    zzs.zza.post(new f2n(atomicBoolean, 29));
                    try {
                        Thread.sleep(zzcgeVar.f);
                        if (!atomicBoolean.get()) {
                            if (((Boolean) zzba.zzc().a(zzbjg.Gf)).booleanValue() && (zzeajVar = zzcgeVar.b) != null) {
                                zzeai a = zzeajVar.a();
                                a.b("action", "panr");
                                if (((Boolean) zzba.zzc().a(zzbjg.ig)).booleanValue() && (zze = zzf.zze(zzcgeVar.c)) != null) {
                                    a.b("mem_avl", String.valueOf(zze.availMem));
                                    a.b("mem_tt", String.valueOf(zze.totalMem));
                                    a.b("low_m", true != zze.lowMemory ? "0" : "1");
                                }
                                a.e();
                            }
                            if (((Boolean) zzba.zzc().a(zzbjg.Hf)).booleanValue()) {
                                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                                wo0 wo0Var = new wo0("Potential ANR detected");
                                wo0Var.setStackTrace(stackTrace);
                                if (((Boolean) zzba.zzc().a(zzbjg.If)).booleanValue()) {
                                    zzcaq.e(zzcgeVar.c).b(wo0Var, "AnrWatchdog", ((Integer) zzba.zzc().a(zzbjg.Jf)).intValue() / 100.0f);
                                } else {
                                    zzt.zzh().d("AnrWatchdog", wo0Var);
                                }
                            }
                        }
                        do {
                            try {
                                Thread.sleep(zzcgeVar.g);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        } while (!atomicBoolean.get());
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                return;
            case 1:
                ((zzchl) this.b).k();
                return;
            case 2:
                ((zzchk) this.b).zzi();
                return;
            case 3:
                zzt.zzB().a.remove((zzcjk) this.b);
                return;
            case 4:
                zzckb zzckbVar = (zzckb) this.b;
                String concat = "cache:".concat(String.valueOf(zzf.zzg(zzckbVar.e)));
                try {
                    longValue = ((Long) zzba.zzc().a(zzbjg.q0)).longValue() * 1000;
                    intValue = ((Integer) zzba.zzc().a(zzbjg.A)).intValue();
                    booleanValue = ((Boolean) zzba.zzc().a(zzbjg.G2)).booleanValue();
                } catch (Exception e) {
                    String str = zzckbVar.e;
                    String message = e.getMessage();
                    String o = fc6.o(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
                    int i = zze.zza;
                    zzo.zzi(o);
                    zzt.zzh().e("VideoStreamExoPlayerCache.preload", e);
                    zzckbVar.release();
                    zzckbVar.p(zzckbVar.e, concat, "error", zzckb.r("error", e));
                }
                synchronized (zzckbVar) {
                    try {
                        if (zzt.zzk().a() - zzckbVar.i > longValue) {
                            StringBuilder sb = new StringBuilder(String.valueOf(longValue).length() + 27);
                            sb.append("Timeout reached. Limit: ");
                            sb.append(longValue);
                            sb.append(" ms");
                            throw new IOException(sb.toString());
                        }
                        if (zzckbVar.f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!zzckbVar.g) {
                            if (!zzckbVar.d.p()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long c = zzckbVar.d.i.c();
                            if (c > 0) {
                                long e2 = zzckbVar.d.i.e();
                                if (e2 != zzckbVar.j) {
                                    j = intValue;
                                    j2 = c;
                                    zzf.zza.post(new dtn(zzckbVar, zzckbVar.e, concat, e2, j2, booleanValue ? zzckbVar.d.t() : -1L, booleanValue ? zzckbVar.d.u() : -1L, booleanValue ? zzckbVar.d.v() : -1L, e2 > 0, zzchw.a.get(), zzchw.b.get()));
                                    zzckbVar.j = e2;
                                } else {
                                    j = intValue;
                                    j2 = c;
                                }
                                if (e2 >= j2) {
                                    String str2 = zzckbVar.e;
                                    Handler handler = zzf.zza;
                                    try {
                                        mpi mpiVar = new mpi(3, j2, zzckbVar, str2, concat);
                                        zzckbVar = zzckbVar;
                                        handler.post(mpiVar);
                                    } catch (Throwable th) {
                                        th = th;
                                        zzckbVar = zzckbVar;
                                        concat = concat;
                                        throw th;
                                    }
                                } else if (zzckbVar.d.m >= j && e2 > 0) {
                                }
                            }
                            zzs.zza.postDelayed(new fsn(zzckbVar, 4), ((Long) zzba.zzc().a(zzbjg.r0)).longValue());
                            return;
                        }
                        zzt.zzB().a.remove(zzckbVar.h);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                break;
            case 5:
                zzclm zzclmVar = ((zzclx) this.b).a;
                zzclmVar.f();
                zzm zzL = zzclmVar.zzL();
                if (zzL != null) {
                    zzL.zzu();
                    return;
                }
                return;
            case 6:
                int i2 = zzclx.I;
                zzbjl a2 = zzt.zzh().a();
                String str3 = (String) this.b;
                if (a2.g.contains(str3)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", a2.f);
                linkedHashMap.put("ue", str3);
                a2.b(a2.a(a2.b, linkedHashMap), null);
                return;
            case 7:
                zzt.zzu().d(((zzeml) this.b).a);
                return;
            case 8:
                zzcnu zzcnuVar = (zzcnu) this.b;
                zzeaj zzeajVar2 = zzcnuVar.b;
                long elapsedRealtime = zzt.zzk().elapsedRealtime();
                zzcnl zzcnlVar = zzcnuVar.a;
                zzcnlVar.getClass();
                if (!y0l.b("MULTI_PROFILE")) {
                    int i3 = zze.zza;
                    zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e3) {
                    String valueOf = String.valueOf(e3.getMessage());
                    int i4 = zze.zza;
                    zzo.zzd("Unable to get ProfileStore instance: ".concat(valueOf));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e4) {
                        zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e4.getMessage())));
                    }
                }
                profileStore2 = profileStore;
                if (profileStore2 != null) {
                    zzcnlVar.a = profileStore2.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                    if (((Boolean) zzba.zzc().a(zzbjg.Pf)).booleanValue()) {
                        long elapsedRealtime2 = zzt.zzk().elapsedRealtime() - elapsedRealtime;
                        zzeai a3 = zzeajVar2.a();
                        a3.b("action", "webview_p_l");
                        a3.b("webview_p_l", Long.toString(elapsedRealtime2));
                        a3.c();
                        return;
                    }
                    return;
                }
                int i5 = zze.zza;
                zzo.zzi("WebViewCompat failure: No instance");
                if (((Boolean) zzba.zzc().a(zzbjg.Pf)).booleanValue()) {
                    zzeai a4 = zzeajVar2.a();
                    a4.b("action", "webview_p_f");
                    a4.b("webview_p_f", "No instance");
                    a4.c();
                    return;
                }
                return;
            case 9:
                ((zzcny) this.b).b();
                return;
            case 10:
                zzeew zzeewVar = (zzeew) this.b;
                Context context = zzeewVar.a;
                try {
                    if (zzeewVar.d.zzP()) {
                        return;
                    }
                    zzeet zzeetVar = zzeewVar.b;
                    zzeetVar.b = new mjn(zzeetVar.a);
                    zzeetVar.a(new mxn(zzeewVar));
                    return;
                } catch (Exception e5) {
                    if (((Boolean) zzba.zzc().a(zzbjg.Z5)).booleanValue()) {
                        zzcas zzcasVar = zzeewVar.f;
                        if (zzcasVar == null) {
                            zzcasVar = zzcaq.e(context);
                            zzeewVar.f = zzcasVar;
                        }
                        zzcasVar.a("InstallReferrerUnsampled.initializeAndReport", e5);
                        return;
                    }
                    zzcas zzcasVar2 = zzeewVar.e;
                    if (zzcasVar2 == null) {
                        zzcasVar2 = zzcaq.c(context);
                        zzeewVar.e = zzcasVar2;
                    }
                    zzcasVar2.a("InstallReferrer.initializeAndReport", e5);
                    return;
                }
            case 11:
                ((mwn) this.b).b.d.h();
                return;
            case 12:
                zzcuy zzcuyVar = ((mwn) this.b).b.d;
                synchronized (zzcuyVar) {
                    zzcuyVar.n();
                    zzcuyVar.i = true;
                }
                return;
            case 13:
                bxn bxnVar = (bxn) this.b;
                zzbod zzbodVar = bxnVar.q.d;
                if (zzbodVar == null) {
                    return;
                }
                try {
                    zzbodVar.h2((zzbu) bxnVar.s.zzb(), new ObjectWrapper(bxnVar.l));
                    return;
                } catch (RemoteException e6) {
                    int i6 = zze.zza;
                    zzo.zzg("RemoteException when notifyAdLoad is called", e6);
                    return;
                }
            case 14:
                ((zzcza) this.b).c = false;
                return;
            case 15:
                zzdaw zzdawVar = (zzdaw) this.b;
                zzbir.a(zzdawVar.c);
                zzdawVar.h = true;
                return;
            case 16:
                zzdce zzdceVar = (zzdce) this.b;
                synchronized (zzdceVar) {
                    try {
                        zzhdr zzhdrVar = zzdceVar.f;
                        if (zzhdrVar.isDone()) {
                            return;
                        }
                        zzhdrVar.d(Boolean.TRUE);
                        return;
                    } finally {
                    }
                }
            case 17:
                zzdcq zzdcqVar = (zzdcq) this.b;
                synchronized (zzdcqVar.a) {
                    try {
                        if (zzdcqVar.i) {
                            return;
                        }
                        zzdcqVar.i = true;
                        zzdcqVar.a();
                        return;
                    } finally {
                    }
                }
            case 18:
                a();
                return;
            case 19:
                uzn uznVar = (uzn) this.b;
                if (uznVar == null || (zzdkVar = uznVar.h) == null) {
                    return;
                }
                this.b = null;
                if (zzdkVar.isDone()) {
                    Object obj = uznVar.a;
                    if (obj == null) {
                        if (zzdkVar.isDone()) {
                            if (twn.g.S(uznVar, null, zzcu.h(zzdkVar))) {
                                zzcu.j(uznVar);
                                return;
                            }
                            return;
                        }
                        gwn gwnVar = new gwn(uznVar, zzdkVar);
                        if (twn.g.S(uznVar, null, gwnVar)) {
                            try {
                                zzdkVar.a(gwnVar, dyn.a);
                                return;
                            } catch (Throwable th3) {
                                try {
                                    hwnVar = new hwn(th3);
                                } catch (Error | Exception unused3) {
                                    hwnVar = hwn.b;
                                }
                                twn.g.S(uznVar, gwnVar, hwnVar);
                                return;
                            }
                        }
                        obj = uznVar.a;
                    }
                    if (obj instanceof fwn) {
                        zzdkVar.cancel(((fwn) obj).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = uznVar.i;
                    uznVar.i = null;
                    String str4 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str4 = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th4) {
                            if (twn.g.S(uznVar, null, new hwn(new ozn(str4, 0)))) {
                                zzcu.j(uznVar);
                            }
                            throw th4;
                        }
                    }
                    if (twn.g.S(uznVar, null, new hwn(new ozn(str4 + ": " + zzdkVar.toString(), 0)))) {
                        zzcu.j(uznVar);
                    }
                    return;
                } finally {
                    zzdkVar.cancel(true);
                }
            case 20:
                ((sx2) this.b).Q();
                return;
            case 21:
                c0l c0lVar = ((j0o) this.b).e;
                c0lVar.getClass();
                i1o i1oVar = new i1o(c0lVar);
                d1o d1oVar = (d1o) c0lVar.c;
                i1oVar.a = d1oVar;
                ArrayDeque arrayDeque = d1oVar.b;
                arrayDeque.add(i1oVar);
                if (d1oVar.c == null) {
                    w0o w0oVar = (w0o) arrayDeque.poll();
                    d1oVar.c = w0oVar;
                    if (w0oVar != null) {
                        w0oVar.executeOnExecutor(d1oVar.a, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ((zzdqz) this.b).j();
                return;
            case 23:
                zzdrm zzdrmVar = (zzdrm) this.b;
                if (zzdrmVar.f == null) {
                    View view = new View(zzdrmVar.c.getContext());
                    zzdrmVar.f = view;
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                }
                if (zzdrmVar.c != zzdrmVar.f.getParent()) {
                    zzdrmVar.c.addView(zzdrmVar.f);
                    return;
                }
                return;
            case 24:
                zzdux zzduxVar = (zzdux) this.b;
                try {
                    Preconditions.e("#008 Must be called on the main UI thread.");
                    zzduxVar.F4();
                    zzdqm zzdqmVar = zzduxVar.c;
                    if (zzdqmVar != null) {
                        zzdqmVar.m();
                    }
                    zzduxVar.c = null;
                    zzduxVar.a = null;
                    zzduxVar.b = null;
                    zzduxVar.d = true;
                    return;
                } catch (RemoteException e7) {
                    int i7 = zze.zza;
                    zzo.zzl("#007 Could not call remote method.", e7);
                    return;
                }
            case 25:
                zzeb zzebVar = (zzeb) this.b;
                Handler handler2 = zzeb.e;
                zzebVar.b();
                return;
            case 26:
                String str5 = zzt.zzh().g().zzi().e;
                boolean isEmpty = TextUtils.isEmpty(str5);
                zzcgo zzcgoVar = (zzcgo) this.b;
                if (isEmpty) {
                    zzcgoVar.zzd(new Exception());
                    return;
                } else {
                    zzcgoVar.zzc(str5);
                    return;
                }
            case 27:
                b();
                return;
            case 28:
                c();
                return;
            default:
                ((zzegt) this.b).a();
                return;
        }
    }

    public /* synthetic */ fsn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
