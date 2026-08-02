package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcax;
import com.google.android.gms.internal.ads.zzcay;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcod;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzegv;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzeie;
import com.google.android.gms.internal.ads.zzeil;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzem;
import com.google.android.gms.internal.ads.zzeqb;
import com.google.android.gms.internal.ads.zzesx;
import com.google.android.gms.internal.ads.zzeua;
import com.google.android.gms.internal.ads.zzfgl;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfkh;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfpm;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfxe;
import com.google.android.gms.internal.ads.zzfxo;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfxw;
import com.google.android.gms.internal.ads.zzfxx;
import com.google.android.gms.internal.ads.zzfxy;
import com.google.android.gms.internal.ads.zzgqn;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.internal.ads.zzinq;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.measurement.internal.zzpg;
import com.unity3d.services.UnityAdsConstants;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3o implements Runnable {
    public final /* synthetic */ int a;
    public Object b;

    public x3o(zzfxe zzfxeVar) {
        this.a = 17;
        this.b = zzfxeVar.e;
    }

    private final void a() {
        zzesx zzesxVar = (zzesx) this.b;
        synchronized (zzesxVar) {
            zzesxVar.E4(3, "Signal collection timeout.");
        }
    }

    private final /* synthetic */ void b() {
        r9o r9oVar;
        r9o r9oVar2 = (r9o) this.b;
        zzfpm zzfpmVar = r9oVar2.d;
        synchronized (zzfpmVar) {
            try {
                ScheduledFuture scheduledFuture = r9oVar2.c;
                r9oVar = scheduledFuture != null ? (r9o) zzfpmVar.c.remove(scheduledFuture) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (r9oVar != null) {
            r9oVar2.d.b.execute(r9oVar2.a);
        }
    }

    private final void c() {
        zzfpm zzfpmVar = (zzfpm) this.b;
        synchronized (zzfpmVar) {
            HashMap hashMap = zzfpmVar.c;
            ArrayList arrayList = new ArrayList(hashMap.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                r9o r9oVar = (r9o) hashMap.get(scheduledFuture);
                if (r9oVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    hashMap.remove(scheduledFuture);
                    zzfpmVar.a(Math.max(0L, r9oVar.b - zzt.zzk().a()), r9oVar.a);
                }
            }
        }
    }

    private final /* synthetic */ void d() {
        u53 u53Var = (u53) this.b;
        if (((zzgrm) u53Var.i) != null) {
            ((zzgtj) u53Var.d).a("Unbind from service.", new Object[0]);
            Context context = (Context) u53Var.c;
            zxc zxcVar = (zxc) u53Var.h;
            zxcVar.getClass();
            context.unbindService(zxcVar);
            u53Var.a = false;
            u53Var.i = null;
            u53Var.h = null;
            ArrayList arrayList = (ArrayList) u53Var.e;
            synchronized (arrayList) {
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ddb ddbVar;
        int i = 3;
        int i2 = 2;
        int i3 = 1;
        switch (this.a) {
            case 0:
                ((zzehc) this.b).a();
                return;
            case 1:
                zzeie zzeieVar = (zzeie) this.b;
                uun uunVar = zzeieVar.a.c;
                zzioe.b(Context.class, zzeieVar.b);
                ewm ewmVar = new ewm(uunVar);
                zzinv zzinvVar = uunVar.o;
                zzcod zzcodVar = uunVar.b;
                zzejh zzejhVar = (zzejh) ewmVar.b;
                Context context = zzcodVar.b;
                zzioe.a(context);
                hsn hsnVar = zzcgj.b;
                zzioe.a(hsnVar);
                hsn hsnVar2 = zzcgj.a;
                zzioe.a(hsnVar2);
                zzinq b = zzinv.b(zzejhVar);
                VersionInfoParcel versionInfoParcel = zzcodVar.a;
                zzioe.a(versionInfoParcel);
                zzeil zzeilVar = new zzeil(context, hsnVar, hsnVar2, b, versionInfoParcel, ewmVar, (zzeaj) zzinvVar.zzb());
                zzt.zzc();
                if (zzs.zzF(context.getPackageName())) {
                    hsnVar2.execute(new x3o(zzeilVar, i2));
                    return;
                }
                ewm ewmVar2 = new ewm(zzeilVar, 19);
                zzcod zzcodVar2 = uunVar.b;
                Context context2 = zzcodVar2.b;
                zzioe.a(context2);
                VersionInfoParcel versionInfoParcel2 = zzcodVar2.a;
                zzioe.a(versionInfoParcel2);
                new zzcay();
                hsnVar.execute(new x3o(new zzegv(context2, versionInfoParcel2, ewmVar2), i));
                return;
            case 2:
                ((zzeil) this.b).a();
                return;
            case 3:
                zzegv zzegvVar = (zzegv) this.b;
                synchronized (zzegvVar.b) {
                    try {
                        if (zzegvVar.c) {
                            return;
                        }
                        zzegvVar.c = true;
                        zzcax zzcaxVar = new zzcax(zzegvVar.g, zzt.zzs().zza(), zzegvVar, zzegvVar);
                        zzegvVar.f = zzcaxVar;
                        zzcaxVar.checkAvailabilityAndConnect();
                        return;
                    } finally {
                    }
                }
            case 4:
                c5o c5oVar = (c5o) this.b;
                zzem zzemVar = (zzem) c5oVar.a.get();
                if (zzemVar != null) {
                    zzemVar.a(c5oVar.c.b());
                    return;
                }
                return;
            case 5:
                zzeqb zzeqbVar = (zzeqb) this.b;
                synchronized (zzeqbVar) {
                    zzeqbVar.h = zzeqbVar.a.elapsedRealtime() - zzeqbVar.i;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.bc)).booleanValue();
                Throwable th = (Throwable) this.b;
                if (booleanValue) {
                    zzt.zzh().f("TopicsSignalUnsampled.fetchTopicsSignal", th);
                    return;
                } else {
                    zzt.zzh().e("TopicsSignal.fetchTopicsSignal", th);
                    return;
                }
            case 8:
                ((zzfgl) this.b).d.i0(zzfmy.d(6, null, null));
                return;
            case 9:
                ((zzfhq) this.b).d.i0(zzfmy.d(6, null, null));
                return;
            case 10:
                ((zzeua) this.b).zzg();
                return;
            case 11:
                ((zzfjg) this.b).d.i0(zzfmy.d(6, null, null));
                return;
            case 12:
                ((zzfkh) this.b).zzg();
                return;
            case 13:
                ((zzfkq) this.b).d.i0(zzfmy.d(6, null, null));
                return;
            case 14:
                b();
                return;
            case 15:
                c();
                return;
            case 16:
                zzfwg zzfwgVar = (zzfwg) this.b;
                AtomicBoolean atomicBoolean = zzfwgVar.e;
                AudioManager audioManager = zzfwgVar.c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) zzfwgVar.d.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    zzfwgVar.a.post(new mrn(this, f, i3));
                    return;
                }
                return;
            case 17:
                ((WebView) this.b).destroy();
                return;
            case 18:
                zzfxo zzfxoVar = ((zzfxu) this.b).e;
                zzfxoVar.getClass();
                zzfxy zzfxyVar = new zzfxy(zzfxoVar);
                zzfxx zzfxxVar = zzfxoVar.b;
                zzfxyVar.a = zzfxxVar;
                ArrayDeque arrayDeque = zzfxxVar.b;
                arrayDeque.add(zzfxyVar);
                if (zzfxxVar.c == null) {
                    zzfxw zzfxwVar = (zzfxw) arrayDeque.poll();
                    zzfxxVar.c = zzfxwVar;
                    if (zzfxwVar != null) {
                        zzfxwVar.executeOnExecutor(zzfxxVar.a, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((HttpURLConnection) this.b).disconnect();
                return;
            case 20:
                feo feoVar = (feo) this.b;
                meo meoVar = (meo) feoVar.a.zzb();
                long j = feoVar.e;
                if (j > 0) {
                    meoVar.e.a(j, new x3o(meoVar, 21));
                    return;
                } else {
                    meoVar.a();
                    return;
                }
            case 21:
                ((meo) this.b).a();
                return;
            case 22:
                zzgqn zzgqnVar = (zzgqn) this.b;
                ddb submit = zzgqnVar.c.submit(new q7o(zzgqnVar, 17));
                zzgqnVar.b.e(53, submit);
                zzgqnVar.f = submit;
                return;
            case 23:
                tfo tfoVar = (tfo) this.b;
                c2a c2aVar = new c2a(tfoVar, 10);
                try {
                    Object systemService = tfoVar.a.getSystemService("connectivity");
                    if (systemService == null) {
                        throw null;
                    }
                    ((ConnectivityManager) systemService).registerDefaultNetworkCallback(c2aVar);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 24:
                ((yfo) this.b).e();
                return;
            case 25:
                u53 u53Var = (u53) ((zxc) this.b).b;
                ((zzgtj) u53Var.d).a("unlinkToDeath", new Object[0]);
                zzgrm zzgrmVar = (zzgrm) u53Var.i;
                zzgrmVar.getClass();
                zzgrmVar.asBinder().unlinkToDeath((fnn) u53Var.g, 0);
                u53Var.i = null;
                u53Var.a = false;
                return;
            case 26:
                d();
                return;
            case 27:
                ((zzpg) ((pko) this.b).d).N();
                return;
            case 28:
                cmo cmoVar = (cmo) this.b;
                if (cmoVar == null || (ddbVar = cmoVar.h) == null) {
                    return;
                }
                this.b = null;
                if (ddbVar.isDone()) {
                    cmoVar.m(ddbVar);
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = cmoVar.i;
                    cmoVar.i = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                StringBuilder sb = new StringBuilder(String.valueOf(abs).length() + 55);
                                sb.append("Timed out (timeout delayed by ");
                                sb.append(abs);
                                sb.append(" ms after scheduled time)");
                                str = sb.toString();
                            }
                        } catch (Throwable th2) {
                            cmoVar.e(new ozn(str, 1));
                            throw th2;
                        }
                    }
                    String obj = ddbVar.toString();
                    StringBuilder sb2 = new StringBuilder(str.length() + 2 + obj.length());
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(obj);
                    cmoVar.e(new ozn(sb2.toString(), 1));
                    ddbVar.cancel(true);
                    return;
                } catch (Throwable th3) {
                    ddbVar.cancel(true);
                    throw th3;
                }
            default:
                smo smoVar = (smo) this.b;
                synchronized (smoVar.m) {
                    if (smoVar.n) {
                        return;
                    }
                    smoVar.n = true;
                    try {
                        smoVar.i();
                    } catch (Exception e) {
                        ((smo) this.b).f.z(2023, -1L, e);
                    }
                    smo smoVar2 = (smo) this.b;
                    synchronized (smoVar2.m) {
                        smoVar2.n = false;
                    }
                    return;
                }
        }
    }

    public /* synthetic */ x3o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ x3o() {
        this.a = 28;
    }

    public x3o(pko pkoVar, boolean z) {
        this.a = 27;
        this.b = pkoVar;
    }
}
