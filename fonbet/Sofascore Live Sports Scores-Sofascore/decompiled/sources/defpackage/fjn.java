package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.b;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzah;
import com.google.android.gms.cast.internal.zzn;
import com.google.android.gms.cast.internal.zzy;
import com.google.android.gms.cast.zzaq;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzafu;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzaz;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmw;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcw;
import com.google.android.gms.internal.ads.zzddi;
import com.google.android.gms.internal.ads.zzdgv;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzedd;
import com.google.android.gms.internal.ads.zzeem;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzeul;
import com.google.android.gms.internal.ads.zzeup;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfkq;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfuo;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzgkr;
import com.google.android.gms.internal.ads.zzglb;
import com.google.android.gms.internal.ads.zzglc;
import com.google.android.gms.internal.ads.zzglv;
import com.google.android.gms.internal.ads.zzglw;
import com.google.android.gms.internal.ads.zzglx;
import com.google.android.gms.internal.ads.zzgly;
import com.google.android.gms.internal.ads.zzglz;
import com.google.android.gms.internal.ads.zzgmc;
import com.google.android.gms.internal.ads.zzgmr;
import com.google.android.gms.internal.ads.zzgnq;
import com.google.android.gms.internal.ads.zzgog;
import com.google.android.gms.internal.ads.zzgon;
import com.google.android.gms.internal.ads.zzgoo;
import com.google.android.gms.internal.ads.zzgop;
import com.google.android.gms.internal.ads.zzgoq;
import com.google.android.gms.internal.ads.zzgor;
import com.google.android.gms.internal.ads.zzgos;
import com.google.android.gms.internal.ads.zzgot;
import com.google.android.gms.internal.ads.zzgou;
import com.google.android.gms.internal.ads.zzgov;
import com.google.android.gms.internal.ads.zzgow;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgoy;
import com.google.android.gms.internal.ads.zzgoz;
import com.google.android.gms.internal.ads.zzgpa;
import com.google.android.gms.internal.ads.zzgpb;
import com.google.android.gms.internal.ads.zzgph;
import com.google.android.gms.internal.ads.zzgpz;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzibp;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.ads.zztj;
import com.google.android.gms.internal.cast.zzc;
import com.google.android.gms.internal.cast.zzcn;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.cast.zzj;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.google.android.gms.internal.cast.zzu;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fjn implements zzhb, RemoteCall, Predicate, zzcgq, OnFailureListener, zzcmw, zzhcv, zzdjm, zzbyz, a4o, zzcyj, zzeup, zzfit, OnSuccessListener, zzgkr, vzo, roo, zzgvc, zzeb, OnCompleteListener, who, zztj {
    public final /* synthetic */ int a;
    public final Object b;

    public fjn(vdf vdfVar) {
        this.a = 20;
        zzinx zzinxVar = (zzinx) vdfVar.b;
        zzinx zzinxVar2 = (zzinx) vdfVar.d;
        zzinv a = zzinv.a(new zzglw((zzinv) vdfVar.h, zzinxVar, zzinxVar2));
        zzinv a2 = zzinv.a(new zzglx(a, zzinxVar));
        zzinv zzinvVar = (zzinv) vdfVar.i;
        zzinv zzinvVar2 = (zzinv) vdfVar.c;
        zzinx zzinxVar3 = (zzinx) vdfVar.e;
        zzinv a3 = zzinv.a(new zzgpz(a2, zzinvVar, zzinvVar2, zzinxVar3));
        zzinv zzinvVar3 = (zzinv) vdfVar.n;
        zzinv a4 = zzinv.a(new zzgov(zzinvVar3));
        zzinv zzinvVar4 = (zzinv) vdfVar.o;
        zzinv a5 = zzinv.a(new zzgon(zzinv.a(new zzgog(zzinv.a(new zzgou(a4, zzinvVar4, zzinvVar)), zzinv.a(new zzgoy(zzinv.a(new zzgox(zzinvVar3)), zzinvVar4, zzinvVar)), zzinv.a(new zzgpb(zzinv.a(new zzgpa(zzinvVar3)), zzinvVar4, zzinvVar)), zzinv.a(new zzgoo(zzinv.a(new zzgop(zzinvVar3)), zzinvVar4, zzinvVar)), zzinv.a(new zzgor(zzinv.a(new zzgoq(zzinvVar3)), zzinvVar4, zzinvVar)), zzinv.a(new zzgot(zzinv.a(new zzgos(zzinvVar3)), zzinvVar4, zzinvVar)), zzinv.a(new zzgow(zzinvVar3)), zzinxVar2, zzinvVar)), zzinv.a(new zzgph(zzinv.a(new zzgly(a2, zzinvVar, zzinxVar)), zzinvVar, zzinxVar2)), zzinxVar3));
        zzinv a6 = zzinv.a(new zzgoz(zzinvVar3));
        zzinv a7 = zzinv.a(oeo.a);
        this.b = zzinv.a(new zzglb(zzinv.a(new zzglc(a3, zzinv.a(new zzgnq(zzinxVar, a2, a5, zzinvVar, zzinxVar2, zzinv.a(new zzglz(a6, a7, zzinvVar)), a)), a5, zzinvVar, (zzinv) vdfVar.f, zzinxVar3)), zzinv.a(new zzgmr(zzinv.a(new zzgmc(zzinv.a(new zzglv((zzinv) vdfVar.k, zzinxVar, zzinxVar3)), a, a7, zzinxVar, zzinxVar3)), a5, a3, zzinvVar, zzinxVar2)), a5, zzinxVar3));
    }

    public JSONObject a(View view) {
        int currentModeType;
        JSONObject a = myn.a(0, 0, 0, 0);
        UiModeManager uiModeManager = bea.d;
        int i = (uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : oea.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        try {
            a.put("noOutputDevice", i2 == 0);
        } catch (JSONException unused) {
        }
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public void c(zzcyl zzcylVar) {
        zzeul zzeulVar = (zzeul) this.b;
        synchronized (zzeulVar) {
            zzeulVar.c = zzcylVar.f;
            zzcylVar.a();
        }
    }

    @Override // defpackage.who
    public /* synthetic */ void d(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((zzpg) this.b).B(str, i, th, bArr, map);
    }

    @Override // defpackage.a4o
    public ddb e(zzcbv zzcbvVar) {
        zzehg zzehgVar = (zzehg) this.b;
        synchronized (zzehgVar.b) {
            try {
                int i = zzehgVar.h;
                int i2 = 1;
                if (i != 1 && i != 2) {
                    return zzhcy.b(new zzehp(2));
                }
                if (zzehgVar.c) {
                    return zzehgVar.a;
                }
                zzehgVar.h = 2;
                zzehgVar.c = true;
                zzehgVar.e = zzcbvVar;
                zzehgVar.f.checkAvailabilityAndConnect();
                zzcgo zzcgoVar = zzehgVar.a;
                zzcgoVar.addListener(new y3o(zzehgVar, i2), zzcgj.h);
                return zzcgoVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public /* synthetic */ void g(long j, zzeu zzeuVar) {
        zzafu.a(j, zzeuVar, ((zzark) this.b).b);
    }

    @Override // com.google.android.gms.internal.ads.zzfit
    public /* synthetic */ zzdcw h(zzfis zzfisVar) {
        return ((zzfkq) this.b).b(zzfisVar);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public /* synthetic */ void onComplete(Task task) {
        bvo bvoVar = (bvo) this.b;
        if (task.isCanceled()) {
            bvoVar.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            bvoVar.l(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            bvoVar.m(exception);
        } else {
            zzl.s();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 4:
                zzcn.d.b("get checkbox consent failed", new Object[0]);
                ((TaskCompletionSource) obj).trySetResult(Boolean.FALSE);
                break;
            default:
                qpn qpnVar = (qpn) obj;
                if (exc instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((en0) qpnVar.d).z(2025, -1L, exc);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i;
        long j;
        SharedPreferences sharedPreferences;
        zzr zzrVar;
        zzpm c;
        CastContext castContext = (CastContext) this.b;
        Bundle bundle = (Bundle) obj;
        if (zzj.l) {
            Context context = castContext.a;
            zzn zznVar = castContext.f;
            zzj zzjVar = new zzj(context, zznVar, castContext.c, castContext.j, castContext.g);
            int i2 = 1;
            int i3 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
            zzj.l = z2;
            if (i3 != 0) {
                i = i3;
            } else if (!z && !z2) {
                return;
            } else {
                i = 0;
            }
            zzjVar.i = new zzcn(context, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String y = dmi.y(packageName, ".client_cast_analytics_data");
            zzjVar.j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            gyj.b(context);
            zzjVar.h = gyj.a().c(zc2.e).a("CAST_SENDER_SDK", new kn5("proto"), bgf.j);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                zzjVar.f = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences(y, 0);
            if (i != 0) {
                TaskApiCall.Builder a = TaskApiCall.a();
                a.a = new tro(zznVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, i2);
                a.c = new Feature[]{zzaq.c};
                a.b = false;
                a.d = 8426;
                Task h = zznVar.h(0, a.a());
                j = 0;
                sharedPreferences = sharedPreferences2;
                h.addOnSuccessListener(new mbd(zzjVar, packageName, i, sharedPreferences, 5));
            } else {
                j = 0;
                sharedPreferences = sharedPreferences2;
            }
            if (z) {
                Preconditions.i(sharedPreferences);
                Logger logger = zzr.j;
                synchronized (zzr.class) {
                    zzrVar = zzr.l;
                    if (zzrVar == null) {
                        zzrVar = new zzr(sharedPreferences, zzjVar, packageName);
                        zzr.l = zzrVar;
                    }
                }
                String str = zzrVar.c;
                SharedPreferences sharedPreferences3 = zzrVar.b;
                HashSet hashSet = zzrVar.f;
                String string = sharedPreferences3.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences3.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = zzrVar.g;
                hashSet2.clear();
                zzrVar.i = j;
                String str2 = zzr.k;
                if (str2.equals(string) && str.equals(string2)) {
                    zzrVar.i = sharedPreferences3.getLong("feature_usage_last_report_time", j);
                    DefaultClock defaultClock = zzrVar.h;
                    Preconditions.i(defaultClock);
                    long a2 = defaultClock.a();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences3.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j2 = sharedPreferences3.getLong(str3, j);
                            if (j2 != j && a2 - j2 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                zzpm c2 = zzr.c(str3.substring(41));
                                if (c2 != null) {
                                    hashSet2.add(c2);
                                    hashSet.add(c2);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (c = zzr.c(str3.substring(41))) != null) {
                                hashSet.add(c);
                            }
                        }
                    }
                    zzrVar.b(hashSet3);
                    zzrVar.e.post(zzrVar.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences3.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    zzrVar.b(hashSet4);
                    sharedPreferences3.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                zzr.a(zzpm.CAST_CONTEXT);
            }
            if (zzj.l) {
                synchronized (zzu.class) {
                    if (zzu.a == null) {
                        zzu zzuVar = new zzu();
                        new ConcurrentHashMap();
                        DefaultClock defaultClock2 = DefaultClock.a;
                        zzu.a = zzuVar;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzy zzyVar = (zzy) anyClient;
        zzah zzahVar = (zzah) zzyVar.getService();
        zzyVar.getContext();
        ApiMetadata a = zzff.a();
        b bVar = ((zzbm) this.b).l;
        Parcel J = zzahVar.J();
        zzc.c(J, bVar);
        zzc.b(J, a);
        zzahVar.l2(J, 18);
        zzah zzahVar2 = (zzah) zzyVar.getService();
        zzyVar.getContext();
        ApiMetadata a2 = zzff.a();
        Parcel J2 = zzahVar2.J();
        zzc.b(J2, a2);
        zzahVar2.l2(J2, 17);
        taskCompletionSource.setResult(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 7:
                break;
            case 8:
            case 10:
            case 12:
            default:
                zzfvd zzfvdVar = (zzfvd) this.b;
                zzfvdVar.m.set(false);
                zzfvdVar.d(true);
                break;
            case 9:
                if (((Boolean) zzba.zzc().a(zzbjg.y6)).booleanValue()) {
                    zzt.zzh().d("omid native display exp", th);
                    break;
                }
                break;
            case 11:
                break;
            case 13:
                String valueOf = String.valueOf(th.getMessage());
                int i = zze.zza;
                zzo.zzf("Failed to get offline buffered ping database: ".concat(valueOf));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        Object obj2;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 7:
                ((zzdce) this.b).a.zza();
                return;
            case 8:
            case 10:
            case 12:
            default:
                zzfvd zzfvdVar = (zzfvd) this.b;
                if (obj != null) {
                    zzfvdVar.k.a();
                    zzdx j = zzfvdVar.j(obj);
                    double d = !(j instanceof zzddi) ? 0.0d : ((zzddi) j).j;
                    zzdx j2 = zzfvdVar.j(obj);
                    obj2 = obj;
                    zzfuo zzfuoVar = new zzfuo(obj2, zzfvdVar.r, d, j2 instanceof zzddi ? ((zzddi) j2).k : 2);
                    Queue queue = zzfvdVar.j;
                    synchronized (queue) {
                        queue.add(zzfuoVar);
                    }
                    zzdx j3 = zzfvdVar.j(obj2);
                    long a = zzfvdVar.r.a();
                    if (zzfvdVar.p.get()) {
                        zzs.zza.post(new wjn(zzfvdVar, j3, z, 22));
                    }
                    ScheduledExecutorService scheduledExecutorService = zzfvdVar.n;
                    scheduledExecutorService.execute(new jcn(zzfvdVar, a, j3));
                    if (zzfvdVar.f != null) {
                        if (((Boolean) zzba.zzc().a(zzbjg.I)).booleanValue()) {
                            zzfvdVar.o.a(zzfuoVar.a(), new jao(zzfvdVar, 4));
                        } else {
                            scheduledExecutorService.schedule(new jao(zzfvdVar, 3), zzfuoVar.a(), TimeUnit.MILLISECONDS);
                        }
                    } else {
                        if (((Boolean) zzba.zzc().a(zzbjg.I)).booleanValue()) {
                            zzfvdVar.o.a(zzfuoVar.a(), new jao(zzfvdVar, objArr2 == true ? 1 : 0));
                        } else {
                            scheduledExecutorService.schedule(new jao(zzfvdVar, objArr == true ? 1 : 0), zzfuoVar.a(), TimeUnit.MILLISECONDS);
                        }
                    }
                } else {
                    obj2 = obj;
                }
                zzfvdVar.m.set(false);
                if (obj2 == null || zzfvdVar.f == null) {
                    zzfvdVar.d(obj2 == null);
                    return;
                }
                return;
            case 9:
                try {
                    zzclm zzclmVar = (zzclm) ((List) obj).get(0);
                    if (zzclmVar != null) {
                        try {
                            ((zzdsr) this.b).c.execute(new cun(zzclmVar, 5));
                            return;
                        } catch (ClassCastException e) {
                            e = e;
                            Throwable th = e;
                            if (((Boolean) zzba.zzc().a(zzbjg.y6)).booleanValue()) {
                                zzt.zzh().d("omid native display exp", th);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e2) {
                    e = e2;
                }
            case 11:
                ((zzedd) obj).n = true;
                ((zzeem) this.b).d.b();
                return;
            case 13:
                try {
                    ((zzfpi) this.b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e3) {
                    String valueOf = String.valueOf(e3.getMessage());
                    int i = zze.zza;
                    zzo.zzf("Error executing function on offline buffered ping database: ".concat(valueOf));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public void zzc() {
        ((zzdxf) this.b).m.zza();
    }

    private final void b(Throwable th) {
    }

    private final void f(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyj
    public zzea zza() {
        try {
            return ((zzbxt) ((zzemt) this.b).b).zzh();
        } catch (RemoteException e) {
            throw new zzfmd(e);
        }
    }

    @Override // defpackage.roo
    public Object zza(String str) {
        return ((zzibp) this.b).a(str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgq
    /* renamed from: zza */
    public void mo17zza() {
        switch (this.a) {
            case 3:
                ((zzcgo) this.b).zzd(new zzbup("Cannot get Javascript Engine"));
                return;
            case 10:
                ((zzdxf) this.b).c.p0(fff.g);
                return;
            default:
                synchronized (((zzeul) this.b)) {
                }
                return;
        }
    }

    @Override // defpackage.vzo
    public void zza(int i, long j) {
        ((en0) this.b).y(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                ((zzdgv) obj).N((zzflo) obj2);
                break;
            case 17:
                zzfpp zzfppVar = (zzfpp) obj2;
                ((zzfqj) obj).A(zzfppVar.b);
                break;
            default:
                ((zzaz) obj).a((zzbv) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza, reason: collision with other method in class */
    public /* synthetic */ Object mo792zza() {
        int i = zzjw.l;
        return (b1l) this.b;
    }

    public /* synthetic */ fjn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public fjn(zzele zzeleVar, zzfpi zzfpiVar) {
        this.a = 13;
        this.b = zzfpiVar;
    }

    public fjn(zzeul zzeulVar) {
        this.a = 15;
        Objects.requireNonNull(zzeulVar);
        this.b = zzeulVar;
    }

    @Override // defpackage.vzo
    public void zzb(int i, long j, String str) {
        ((en0) this.b).A(i, System.currentTimeMillis() - j, null, null, str);
    }

    public fjn(byte[] bArr) {
        this.a = 21;
        this.b = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i = 0; i < 256; i++) {
            ((byte[]) this.b)[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = (byte[]) this.b;
            byte b = bArr2[i3];
            i2 = (i2 + b + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyz
    public void zzb() {
        ((zzdxf) this.b).c.p0(igf.e);
    }
}
