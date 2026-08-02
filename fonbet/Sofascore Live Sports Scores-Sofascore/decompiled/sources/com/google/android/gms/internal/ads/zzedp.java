package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.f3o;
import defpackage.inn;
import defpackage.nkn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzedp implements zzeer, zzeda {
    public final zzeea a;
    public final zzees b;
    public final zzedb c;
    public final zzedk d;
    public final zzecz e;
    public final zzeem f;
    public final zzedw g;
    public final zzedw h;
    public final String i;
    public final Context j;
    public final String k;
    public JSONObject p;
    public boolean s;
    public int t;
    public boolean u;
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public String o = "{}";
    public long q = Long.MAX_VALUE;
    public zzedl r = zzedl.a;
    public zzedo v = zzedo.a;
    public long w = 0;
    public String x = "";

    public zzedp(zzeea zzeeaVar, zzees zzeesVar, zzedb zzedbVar, Context context, VersionInfoParcel versionInfoParcel, zzedk zzedkVar, zzeem zzeemVar, zzedw zzedwVar, zzedw zzedwVar2, String str) {
        this.a = zzeeaVar;
        this.b = zzeesVar;
        this.c = zzedbVar;
        this.e = new zzecz(context);
        this.i = versionInfoParcel.afmaVersion;
        this.k = str;
        this.d = zzedkVar;
        this.f = zzeemVar;
        this.g = zzedwVar;
        this.h = zzedwVar2;
        this.j = context;
        com.google.android.gms.ads.internal.zzt.zzo().zza(this);
    }

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().g().zzJ()) {
                j();
                return;
            }
            String zzH = com.google.android.gms.ads.internal.zzt.zzh().g().zzH();
            if (TextUtils.isEmpty(zzH)) {
                return;
            }
            try {
                if (new JSONObject(zzH).optBoolean("isTestMode", false)) {
                    j();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z) {
        if (!this.u && z) {
            j();
        }
        g(z, true);
    }

    public final synchronized void c(String str, zzedd zzeddVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue() && f()) {
            if (this.t >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.xa)).intValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap hashMap = this.l;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, new ArrayList());
            }
            this.t++;
            ((List) hashMap.get(str)).add(zzeddVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ta)).booleanValue()) {
                String str2 = zzeddVar.c;
                this.m.put(str2, zzeddVar);
                HashMap hashMap2 = this.n;
                if (hashMap2.containsKey(str2)) {
                    List list = (List) hashMap2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcgo) it.next()).zzc(zzeddVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized zzcgo d(String str) {
        zzcgo zzcgoVar;
        try {
            zzcgoVar = new zzcgo();
            HashMap hashMap = this.m;
            if (hashMap.containsKey(str)) {
                zzcgoVar.zzc((zzedd) hashMap.get(str));
            } else {
                HashMap hashMap2 = this.n;
                if (!hashMap2.containsKey(str)) {
                    hashMap2.put(str, new ArrayList());
                }
                ((List) hashMap2.get(str)).add(zzcgoVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcgoVar;
    }

    public final synchronized void e(zzdk zzdkVar, zzedo zzedoVar) {
        if (!f()) {
            try {
                zzdkVar.zze(zzfmy.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.va)).booleanValue()) {
            this.v = zzedoVar;
            this.a.a(zzdkVar, new zzbrd(this), new zzbqw(this.f), new zzbqi(this));
            return;
        } else {
            try {
                zzdkVar.zze(zzfmy.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean f() {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue();
        boolean z = this.s;
        if (!booleanValue) {
            return z;
        }
        if (!z) {
            if (!com.google.android.gms.ads.internal.zzt.zzo().zzk()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(boolean z, boolean z2) {
        try {
            if (this.s != z) {
                this.s = z;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue()) {
                        if (!com.google.android.gms.ads.internal.zzt.zzo().zzk()) {
                        }
                    }
                    k();
                    if (z2) {
                        m();
                        return;
                    }
                }
                if (!f()) {
                    l();
                }
                if (z2) {
                }
            }
        } finally {
        }
    }

    public final synchronized void h(zzedl zzedlVar, boolean z) {
        try {
            if (this.r != zzedlVar) {
                if (f()) {
                    l();
                }
                this.r = zzedlVar;
                if (f()) {
                    k();
                }
                if (z) {
                    m();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject i() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzedd zzeddVar : (List) entry.getValue()) {
                    if (zzeddVar.e != zzedc.a) {
                        jSONArray.put(zzeddVar.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void j() {
        this.u = true;
        zzedk zzedkVar = this.d;
        zzedkVar.getClass();
        f3o f3oVar = new f3o(zzedkVar);
        zzecu zzecuVar = zzedkVar.a;
        zzecuVar.getClass();
        zzecuVar.e.addListener(new nkn(zzecuVar, f3oVar, false, 16), zzecuVar.j);
        this.a.c = this;
        this.b.f = this;
        this.c.i = this;
        this.f.f = this;
        inn innVar = zzbjg.Za;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.j);
            List asList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
            zzedw zzedwVar = this.g;
            zzedwVar.b = asList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzedwVar);
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                zzedwVar.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        inn innVar2 = zzbjg.ab;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2))) {
            SharedPreferences sharedPreferences = this.j.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0);
            List asList2 = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar2)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
            zzedw zzedwVar2 = this.h;
            zzedwVar2.b = asList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzedwVar2);
            Iterator it2 = asList2.iterator();
            while (it2.hasNext()) {
                zzedwVar2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String zzH = com.google.android.gms.ads.internal.zzt.zzh().g().zzH();
        synchronized (this) {
            if (!TextUtils.isEmpty(zzH)) {
                try {
                    JSONObject jSONObject = new JSONObject(zzH);
                    g(jSONObject.optBoolean("isTestMode", false), false);
                    h((zzedl) Enum.valueOf(zzedl.class, jSONObject.optString("gesture", "NONE")), false);
                    this.o = jSONObject.optString("networkExtras", "{}");
                    this.q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.x = com.google.android.gms.ads.internal.zzt.zzh().g().zzN();
    }

    public final synchronized void k() {
        int ordinal = this.r.ordinal();
        if (ordinal == 1) {
            this.b.b();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    public final synchronized void l() {
        SensorManager sensorManager;
        Sensor sensor;
        try {
            int ordinal = this.r.ordinal();
            if (ordinal == 1) {
                zzees zzeesVar = this.b;
                synchronized (zzeesVar) {
                    try {
                        if (zzeesVar.g) {
                            SensorManager sensorManager2 = zzeesVar.b;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(zzeesVar, zzeesVar.c);
                                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                            }
                            zzeesVar.g = false;
                        }
                    } finally {
                    }
                }
                return;
            }
            if (ordinal != 2) {
                return;
            }
            zzedb zzedbVar = this.c;
            synchronized (zzedbVar) {
                try {
                    if (zzedbVar.j && (sensorManager = zzedbVar.a) != null && (sensor = zzedbVar.b) != null) {
                        sensorManager.unregisterListener(zzedbVar, sensor);
                        zzedbVar.j = false;
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
                    }
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final void m() {
        String jSONObject;
        com.google.android.gms.ads.internal.util.zzj g = com.google.android.gms.ads.internal.zzt.zzh().g();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.s);
                jSONObject2.put("gesture", this.r);
                if (this.q > com.google.android.gms.ads.internal.zzt.zzk().a() / 1000) {
                    jSONObject2.put("networkExtras", this.o);
                    jSONObject2.put("networkExtrasExpirationSecs", this.q);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        g.zzI(jSONObject);
    }
}
