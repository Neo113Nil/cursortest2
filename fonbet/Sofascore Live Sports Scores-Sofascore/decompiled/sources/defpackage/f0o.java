package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.appsflyer.internal.i;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.cast.framework.media.internal.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbjw;
import com.google.android.gms.internal.ads.zzbmi;
import com.google.android.gms.internal.ads.zzcbe;
import com.google.android.gms.internal.ads.zzcbm;
import com.google.android.gms.internal.ads.zzcbn;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcni;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzdsm;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzdtl;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeem;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzepl;
import com.google.android.gms.internal.ads.zzeqc;
import com.google.android.gms.internal.ads.zzerz;
import com.google.android.gms.internal.ads.zzese;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfof;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfvy;
import com.google.android.gms.internal.ads.zzfwa;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhfb;
import com.google.android.gms.internal.ads.zzhoo;
import com.google.android.gms.internal.ads.zzhop;
import com.google.android.gms.internal.ads.zzhoq;
import com.google.android.gms.internal.ads.zzhrh;
import com.google.android.gms.internal.ads.zzhrl;
import com.google.android.gms.internal.ads.zzhrm;
import com.google.android.gms.internal.ads.zzjb;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzjd;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzkk;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzku;
import com.google.android.gms.internal.measurement.zzme;
import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f0o implements zzbmi, zzcni, zzhcv, NativeAd.OnNativeAdLoadedListener, zzfpi, v4o, zzfpo, aeo, zzdjm, zzo, zzhop, zzhrh, zza, rt8, Continuation, RemoteCall {
    public static f0o d;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public f0o(WebView webView, ViewGroup viewGroup) {
        this.a = 13;
        this.b = webView;
        this.c = viewGroup;
        if (((ViewGroup) webView.getParent()) != null) {
            return;
        }
        webView.setVisibility(4);
        viewGroup.addView(webView, new ViewGroup.LayoutParams(-1, -1));
    }

    public static final zzjc g(zzjc zzjcVar, List list) {
        zzjb zzjbVar = new zzjb(zzjcVar);
        HashSet hashSet = new HashSet(list);
        Iterator it = zzjcVar.a.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap = zzjbVar.a;
            if (!hasNext) {
                return new zzjc(hashMap);
            }
            String str = (String) it.next();
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhrh
    public byte[] a(int i, byte[] bArr) {
        return bArr.length <= 64 ? ((zzhrl) this.b).a(i, bArr) : ((zzhrm) this.c).a(i, bArr);
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public void b(Bitmap bitmap) {
        gvo gvoVar = (gvo) this.b;
        gvoVar.c = bitmap;
        axo axoVar = (axo) this.c;
        axoVar.m = gvoVar;
        axoVar.a();
    }

    @Override // com.google.android.gms.internal.ads.zzhop
    public /* synthetic */ Object c(zzhfb zzhfbVar) {
        return ((zzhoo) this.b).a(zzhfbVar.a(), ((zzhoq) this.c).zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public void d(MotionEvent motionEvent) {
        ((zzdso) this.b).onTouch(null, motionEvent);
    }

    public /* synthetic */ void e(zzjc zzjcVar) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            zzjd zzjdVar = (zzjd) entry.getKey();
            List list = (List) entry.getValue();
            if (!g(zzjcVar, list).equals(g((zzjc) this.c, list))) {
                zzjdVar.zza();
            }
        }
        this.c = zzjcVar;
    }

    public void h(Object obj, String str) {
        boolean commit;
        String str2 = (String) this.b;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        if (obj instanceof String) {
            commit = sharedPreferences.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            commit = sharedPreferences.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            commit = sharedPreferences.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                new StringBuilder(String.valueOf(obj.getClass()).length() + 33 + String.valueOf(str2).length());
                is8.e(fc6.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
            }
            commit = sharedPreferences.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (commit) {
            return;
        }
        is8.e(fc6.o(new StringBuilder(str.length() + 25 + String.valueOf(str2).length()), "Failed to store ", str, " for app ", str2));
    }

    public void j(String str) {
        if (((SharedPreferences) this.c).edit().remove(str).commit()) {
            return;
        }
        String str2 = (String) this.b;
        is8.e(fc6.o(new StringBuilder(str.length() + 26 + String.valueOf(str2).length()), "Failed to remove ", str, " for app ", str2));
    }

    @Override // defpackage.rt8
    public void onFailure(Throwable th) {
        zzlj zzljVar = (zzlj) this.c;
        zzljVar.Q();
        zzic zzicVar = (zzic) zzljVar.b;
        boolean z = false;
        zzljVar.j = false;
        zzljVar.o0().add((zzoh) this.b);
        int i = 1;
        if (zzljVar.k > ((Integer) zzfy.v0.a(null)).intValue()) {
            zzljVar.k = 1;
            zzgu zzguVar = zzicVar.f;
            zzic.m(zzguVar);
            zzguVar.j.c(zzgu.U(zzicVar.q().W()), zzgu.U(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        zzgu zzguVar2 = zzicVar.f;
        zzic.m(zzguVar2);
        zzguVar2.j.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgu.U(zzicVar.q().W()), zzgu.U(String.valueOf(zzljVar.k)), zzgu.U(th.toString()));
        int i2 = zzljVar.k;
        dto dtoVar = zzljVar.l;
        if (dtoVar == null) {
            dtoVar = new dto(zzljVar, zzicVar, i, z);
            zzljVar.l = dtoVar;
        }
        dtoVar.b(i2 * 1000);
        int i3 = zzljVar.k;
        zzljVar.k = i3 + i3;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
        ((zzeem) this.b).E4(nativeAd, (String) this.c);
    }

    @Override // defpackage.rt8
    /* renamed from: onSuccess */
    public void mo914onSuccess(Object obj) {
        zzlj zzljVar = (zzlj) this.c;
        zzljVar.Q();
        zzic zzicVar = (zzic) zzljVar.b;
        lmo lmoVar = zzicVar.e;
        zzic.k(lmoVar);
        SparseArray W = lmoVar.W();
        zzoh zzohVar = (zzoh) this.b;
        W.put(zzohVar.c, Long.valueOf(zzohVar.b));
        lmo lmoVar2 = zzicVar.e;
        zzic.k(lmoVar2);
        int[] iArr = new int[W.size()];
        long[] jArr = new long[W.size()];
        for (int i = 0; i < W.size(); i++) {
            iArr[i] = W.keyAt(i);
            jArr[i] = ((Long) W.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        lmoVar2.o.b(bundle);
        zzljVar.j = false;
        zzljVar.k = 1;
        zzgu zzguVar = zzicVar.f;
        zzic.m(zzguVar);
        zzguVar.n.b(zzohVar.a, "Successfully registered trigger URI");
        zzljVar.p0();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z = task.getException() instanceof UnsupportedApiCallException;
        zzme zzmeVar = (zzme) this.c;
        zzkk zzkkVar = (zzkk) this.b;
        if (z) {
            return zzkkVar.i(zzmeVar.y());
        }
        if (task.getException() instanceof ApiException) {
            ApiException apiException = (ApiException) task.getException();
            apiException.getClass();
            if (apiException.a.a == 29514) {
                return zzkkVar.i(zzmeVar.y());
            }
        }
        return task;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        int i = zzkk.l;
        juo juoVar = new juo(taskCompletionSource);
        zzkt zzktVar = (zzkt) ((zzku) anyClient).getService();
        String[] strArr = (String[]) this.c;
        String str = (String) this.b;
        Parcel S1 = zzktVar.S1();
        zzbn.c(S1, juoVar);
        S1.writeString(str);
        S1.writeInt(0);
        S1.writeStringArray(strArr);
        S1.writeByteArray(null);
        zzktVar.Z1(S1, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 3:
                return;
            case 6:
                try {
                    zzcbn zzcbnVar = (zzcbn) this.c;
                    zzba zza = zzba.zza(th);
                    Parcel J = zzcbnVar.J();
                    zzbew.c(J, zza);
                    zzcbnVar.Z1(J, 2);
                    return;
                } catch (RemoteException e) {
                    zze.zzb("Service can't call client", e);
                    return;
                }
            case 7:
                try {
                    ((zzcbm) this.c).D2(zzba.zza(th));
                    return;
                } catch (RemoteException e2) {
                    zze.zzb("Service can't call client", e2);
                    return;
                }
            case 10:
                zzepl zzeplVar = (zzepl) this.c;
                synchronized (zzeplVar) {
                    try {
                        n5o n5oVar = zzeplVar.j;
                        zzfld zzfldVar = (zzfld) this.b;
                        n5oVar.c(zzfldVar);
                        zzfld a = zzeplVar.j.a();
                        if (zzfldVar.v0) {
                            while (a != null) {
                                zzeplVar.a(a);
                                a = zzeplVar.j.a();
                            }
                        } else if (a != null) {
                            zzeplVar.a(a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 14:
                zzfoh zzfohVar = (zzfoh) this.c;
                synchronized (zzfohVar) {
                    zzfohVar.d = null;
                }
                return;
            case 15:
                ((zzfpz) this.c).f.c.p0(new f0o(16, (zzfpp) this.b, th));
                return;
            default:
                zzfqw zzfqwVar = (zzfqw) this.c;
                zzfqwVar.a(th);
                zzfqwVar.zzd(false);
                ((zzfrg) this.b).a(zzfqwVar);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        Bundle bundle;
        switch (this.a) {
            case 3:
                ((zzdtl) this.c).d.c(zzt.zzk().a(), ((zzdzs) this.b).a);
                return;
            case 6:
                String str = (String) obj;
                try {
                    zzcbn zzcbnVar = (zzcbn) this.c;
                    zzcbe zzcbeVar = (zzcbe) this.b;
                    Parcel J = zzcbnVar.J();
                    J.writeString(str);
                    zzbew.c(J, zzcbeVar);
                    zzcbnVar.Z1(J, 1);
                    return;
                } catch (RemoteException e) {
                    zze.zzb("Service can't call client", e);
                    return;
                }
            case 7:
                zzcbm zzcbmVar = (zzcbm) this.c;
                zzcbv zzcbvVar = (zzcbv) this.b;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                try {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue()) {
                        zzcbmVar.A3(parcelFileDescriptor);
                        return;
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T2)).booleanValue() && (bundle = zzcbvVar.m) != null) {
                        bundle.putLong("binder-call-start", zzt.zzk().a());
                    }
                    zzcbmVar.T2(parcelFileDescriptor, zzcbvVar);
                    return;
                } catch (RemoteException e2) {
                    zze.zzb("Service can't call client", e2);
                    return;
                }
            case 10:
                zzepl zzeplVar = (zzepl) this.c;
                zzeqc zzeqcVar = (zzeqc) obj;
                synchronized (zzeplVar) {
                    try {
                        zzeplVar.j.b(zzeqcVar, (zzfld) this.b);
                        zzfld a = zzeplVar.j.a();
                        if (a != null) {
                            zzeplVar.a(a);
                        }
                    } finally {
                    }
                }
                return;
            case 14:
                zzfoh zzfohVar = (zzfoh) this.c;
                synchronized (zzfohVar) {
                    try {
                        zzfohVar.d = null;
                        zzfohVar.c.addFirst((zzfof) this.b);
                        if (zzfohVar.e == 1) {
                            zzfohVar.a();
                        }
                    } finally {
                    }
                }
                return;
            case 15:
                ((zzfpz) this.c).f.c.p0(new ohn((zzfpp) this.b, 18));
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public JSONObject zzc() {
        return ((zzdso) this.b).zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbmi
    public JSONObject zzd() {
        return ((zzdso) this.b).zzo();
    }

    @Override // defpackage.aeo
    /* renamed from: zzc, reason: collision with other method in class */
    public void mo791zzc() {
        ((WebView) this.b).requestFocus();
    }

    private final void f(Throwable th) {
    }

    private final void i(Object obj) {
    }

    public /* synthetic */ f0o(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ f0o(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public f0o(Context context) {
        this.a = 18;
        this.b = context.getPackageName();
        this.c = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public /* synthetic */ f0o(int i) {
        this.a = i;
    }

    public f0o(zzejg zzejgVar, zzcbn zzcbnVar, zzcbe zzcbeVar) {
        this.a = 6;
        this.c = zzcbnVar;
        this.b = zzcbeVar;
    }

    public f0o(zzejg zzejgVar, zzcbv zzcbvVar, zzcbm zzcbmVar) {
        this.a = 7;
        this.b = zzcbvVar;
        this.c = zzcbmVar;
    }

    public /* synthetic */ f0o(cwo cwoVar) {
        this.a = 27;
        this.b = new HashMap();
        this.c = zzjc.b;
    }

    public f0o(axo axoVar, gvo gvoVar) {
        this.a = 25;
        this.b = gvoVar;
        Objects.requireNonNull(axoVar);
        this.c = axoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public Object zza(Object obj) {
        zzele zzeleVar = (zzele) this.b;
        zzelg zzelgVar = (zzelg) this.c;
        zzeleVar.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzelgVar.a));
        contentValues.put("gws_query_id", zzelgVar.b);
        contentValues.put("url", zzelgVar.c);
        contentValues.put("event_state", Integer.valueOf(zzelgVar.d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        zzt.zzc();
        Context context = zzeleVar.a;
        zzbo zzC = zzs.zzC(context);
        if (zzC != null) {
            try {
                zzC.zzf(new ObjectWrapper(context));
                return null;
            } catch (RemoteException e) {
                zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzegu, com.google.android.gms.internal.ads.zzeup
    /* renamed from: zza */
    public void mo12zza() {
        int i = 0;
        switch (this.a) {
            case 0:
                s sVar = zzdrm.o;
                zzdso zzdsoVar = (zzdso) this.b;
                Map zzi = zzdsoVar.zzi();
                if (zzi != null) {
                    int i2 = sVar.d;
                    while (i < i2) {
                        Object obj = zzi.get((String) sVar.get(i));
                        i++;
                        if (obj != null) {
                            zzdsoVar.onClick((ViewGroup) this.c);
                            break;
                        }
                    }
                    break;
                }
                break;
            case 11:
                zzerz zzerzVar = (zzerz) this.b;
                zzerzVar.c.H1((zzbjw) this.c);
                break;
            case 12:
                zzese zzeseVar = (zzese) this.b;
                zzeseVar.a.H1((zzbjw) this.c);
                break;
            default:
                WebView webView = (WebView) this.b;
                webView.setVisibility(0);
                ((ViewGroup) this.c).bringChildToFront(webView);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        zzfpp zzfppVar = (zzfpp) this.b;
        ((zzfqj) obj).D((zzfqc) zzfppVar.a, zzfppVar.b, (Throwable) this.c);
    }

    @Override // defpackage.v4o
    /* renamed from: zza */
    public Object zzh() {
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) this.b;
        int i = versionInfoParcel.buddyApkVersion;
        int i2 = versionInfoParcel.clientJarVersion;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty("Google")) {
            if (!TextUtils.isEmpty(sb2)) {
                return new zzfvy(new zzfwa("Google", sb2), (WebView) this.c);
            }
            a70.p("Version is null or empty");
            return null;
        }
        a70.p("Name is null or empty");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcni
    public void zza(boolean z, int i, String str, String str2) {
        switch (this.a) {
            case 1:
                zzdse zzdseVar = (zzdse) this.b;
                Map map = (Map) this.c;
                HashMap l = i.l("messageType", "htmlLoaded");
                l.put("id", (String) map.get("id"));
                zzdseVar.b.d(l);
                break;
            case 2:
                zzdsm zzdsmVar = (zzdsm) this.b;
                Map map2 = (Map) this.c;
                HashMap l2 = i.l("messageType", "validatorHtmlLoaded");
                l2.put("id", (String) map2.get("id"));
                zzdsmVar.b.d(l2);
                break;
            default:
                zzcgo zzcgoVar = (zzcgo) this.c;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V2)).booleanValue()) {
                        x5n.q("rendering-webview-load-html-end", (zzeae) this.b);
                    }
                    zzcgoVar.zzc(null);
                    break;
                } else {
                    int length = String.valueOf(i).length();
                    StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
                    fn0.s(i, "Ad Web View failed to load. Error code: ", ", Description: ", str, sb);
                    zzcgoVar.zzd(new Exception(mz1.o(sb, ", Failing URL: ", str2)));
                    break;
                }
        }
    }

    @Override // defpackage.aeo
    public void zzb() {
        ((WebView) this.b).setVisibility(4);
    }
}
