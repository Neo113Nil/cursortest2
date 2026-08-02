package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.zabu;
import com.google.android.gms.internal.ads.zzadk;
import com.google.android.gms.internal.ads.zzadn;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzcfq;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzcje;
import com.google.android.gms.internal.ads.zzcku;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcp;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzczp;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdef;
import com.google.android.gms.internal.ads.zzdjg;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzdua;
import com.google.android.gms.internal.ads.zzdwk;
import com.google.android.gms.internal.ads.zzecw;
import com.google.android.gms.internal.ads.zzegi;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzeib;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzeqf;
import com.google.android.gms.internal.ads.zzesu;
import com.google.android.gms.internal.ads.zzesy;
import com.google.android.gms.internal.ads.zzeup;
import com.google.android.gms.internal.ads.zzfco;
import com.google.android.gms.internal.ads.zzfla;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzgks;
import com.google.android.gms.internal.ads.zzgrz;
import com.google.android.gms.internal.ads.zzguk;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzgxp;
import com.google.android.gms.internal.ads.zzgxw;
import com.google.android.gms.internal.ads.zzhaa;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhcx;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzhm;
import com.google.android.gms.internal.ads.zzidr;
import com.google.android.gms.internal.ads.zziei;
import com.google.android.gms.internal.ads.zzier;
import com.google.android.gms.internal.ads.zzigw;
import com.google.android.gms.internal.ads.zzne;
import com.google.android.gms.internal.ads.zznj;
import com.google.android.gms.internal.ads.zzql;
import com.google.android.gms.internal.ads.zztg;
import com.google.android.gms.internal.ads.zzti;
import com.google.android.gms.internal.ads.zztm;
import com.google.android.gms.internal.ads.zzto;
import com.google.android.gms.internal.ads.zztp;
import com.google.android.gms.internal.ads.zztr;
import com.google.android.gms.internal.ads.zztw;
import com.google.android.gms.internal.ads.zzuc;
import com.google.android.gms.internal.ads.zzvh;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.cast.zzce;
import com.google.android.gms.internal.cast.zzpm;
import com.google.android.gms.internal.cast.zzr;
import com.google.android.gms.internal.consent_sdk.zztk;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b1l implements zabu, zztk, njn, zzcgs, OnCompleteListener, zznj, zzhcv, zzdjm, a4o, zzfpi, zzdom, zzhcf, zzeup, Continuation, zzgks, zzgrz, zzhm, u0l, zzgm {
    public final /* synthetic */ int a;
    public final Object b;

    public b1l(zzdua zzduaVar, zzcgo zzcgoVar) {
        this.a = 14;
        this.b = zzcgoVar;
        Objects.requireNonNull(zzduaVar);
    }

    public static b1l i(String str) {
        return new b1l((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : zzjl.e(str.charAt(0)), 15);
    }

    @Override // defpackage.njn
    public void a(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        synchronized (byteBuffer) {
            int i2 = (int) j;
            byteBuffer.position(i2);
            byteBuffer.limit(i2 + i);
            slice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public void c(zzcyl zzcylVar) {
        zzfla zzflaVar = (zzfla) this.b;
        zzdwk zzdwkVar = (zzdwk) zzcylVar;
        synchronized (zzflaVar) {
            try {
                zzflaVar.d = zzdwkVar;
                if (((Boolean) zzba.zzc().a(zzbjg.C4)).booleanValue()) {
                    zzdwkVar.u.a = zzflaVar.c;
                }
                zzflaVar.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        zzgu zzguVar = ((zzic) this.b).f;
        zzic.m(zzguVar);
        return Log.isLoggable(zzguVar.W(), 3);
    }

    @Override // defpackage.a4o
    public ddb e(zzcbv zzcbvVar) {
        zzehg zzehgVar = ((zzeib) this.b).b;
        String str = zzcbvVar.h;
        synchronized (zzehgVar.b) {
            try {
                int i = zzehgVar.h;
                if (i != 1 && i != 3) {
                    return zzhcy.b(new zzehp(2));
                }
                if (zzehgVar.c) {
                    return zzehgVar.a;
                }
                zzehgVar.h = 3;
                zzehgVar.c = true;
                zzehgVar.g = str;
                zzehgVar.f.checkAvailabilityAndConnect();
                zzcgo zzcgoVar = zzehgVar.a;
                zzcgoVar.addListener(new y3o(zzehgVar, 0), zzcgj.h);
                return zzcgoVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzne[] f(Handler handler, auo auoVar, auo auoVar2) {
        Context context = ((zzcku) this.b).c;
        zztp zztpVar = new zztp(context);
        zzguk.f(!zztpVar.c);
        zztpVar.c = true;
        if (zztpVar.f == null) {
            zztpVar.f = new zztr(new zzcp[0]);
        }
        zzti zztiVar = zztpVar.e;
        zztm zztmVar = zztpVar.g;
        if (zztiVar == null) {
            if (zztmVar == null) {
                zztpVar.g = new zztm(context);
            }
            if (zztpVar.d == null) {
                zztpVar.d = zzto.a;
            }
            zztg zztgVar = new zztg(context);
            zzql zzqlVar = context != null ? null : zztpVar.b;
            Context context2 = zztgVar.a;
            if (context2 == null) {
                zztgVar.b = zzqlVar;
            }
            zztm zztmVar2 = zztpVar.g;
            zztgVar.c = zztmVar2;
            if (zztmVar2 == null) {
                zztgVar.c = new zztm(context2);
            }
            zztpVar.e = new zzti(zztgVar);
        } else {
            zzguk.f(zztmVar == null);
            zzguk.f(zztpVar.d == null);
        }
        zzuc zzucVar = new zzuc(context, new zzvh(context), handler, auoVar2, new zztw(zztpVar));
        zzadk zzadkVar = new zzadk(context);
        zzadkVar.d = handler;
        zzadkVar.e = auoVar;
        zzguk.f(!zzadkVar.b);
        Handler handler2 = zzadkVar.d;
        zzguk.f((handler2 == null && zzadkVar.e == null) || !(handler2 == null || zzadkVar.e == null));
        zzadkVar.b = true;
        return new zzne[]{zzucVar, new zzadn(zzadkVar)};
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void g(Bundle bundle) {
        g gVar = (g) this.b;
        Lock lock = gVar.m;
        lock.lock();
        try {
            Bundle bundle2 = gVar.i;
            if (bundle2 == null) {
                gVar.i = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            gVar.j = ConnectionResult.f;
            gVar.h();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void j(int i) {
        ConnectionResult connectionResult;
        g gVar = (g) this.b;
        Lock lock = gVar.m;
        lock.lock();
        try {
            if (!gVar.l && (connectionResult = gVar.k) != null && connectionResult.Z0()) {
                gVar.l = true;
                gVar.e.onConnectionSuspended(i);
                return;
            }
            gVar.l = false;
            gVar.b.j(i);
            gVar.k = null;
            gVar.j = null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void k(ConnectionResult connectionResult) {
        g gVar = (g) this.b;
        Lock lock = gVar.m;
        lock.lock();
        try {
            gVar.j = connectionResult;
            gVar.h();
        } finally {
            lock.unlock();
        }
    }

    public void l(int i, Object obj, pcn pcnVar) {
        r8n r8nVar = (r8n) this.b;
        k7n k7nVar = (k7n) obj;
        r8nVar.a(i, 2);
        r8nVar.n(k7nVar.c(pcnVar));
        pcnVar.d(k7nVar, this);
    }

    public void m(int i, Object obj, nqo nqoVar) {
        zzier zzierVar = (zzier) this.b;
        zzidr zzidrVar = (zzidr) obj;
        zzierVar.e(i, 2);
        zzierVar.u(zzidrVar.k(nqoVar));
        nqoVar.f(zzidrVar, this);
    }

    public void n(int i, Object obj) {
        boolean z = obj instanceof zziei;
        zzier zzierVar = (zzier) this.b;
        if (z) {
            zzierVar.q(i, (zziei) obj);
        } else {
            zzierVar.p(i, (zzigw) obj);
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        CastOptions castOptions;
        zzbx zzbxVar = (zzbx) this.b;
        Logger logger = zzbx.h;
        boolean z = zzbxVar.e;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            logger.a("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                zzbxVar.f = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            }
        }
        boolean z3 = zzbxVar.f;
        if (zzbxVar.a == null || (castOptions = zzbxVar.b) == null) {
            return;
        }
        boolean z4 = castOptions.k;
        boolean z5 = castOptions.j;
        boolean z6 = z3 && castOptions.m;
        rbc rbcVar = new rbc();
        int i = Build.VERSION.SDK_INT;
        rbcVar.a = i >= 30;
        if (i >= 30) {
            rbcVar.a = z6;
        }
        if (i >= 30) {
            rbcVar.c = z4;
        }
        if (i >= 30) {
            rbcVar.b = z5;
        }
        boolean z7 = castOptions.r;
        if (i >= 30) {
            rbcVar.d = z7;
        }
        sbc sbcVar = new sbc(rbcVar);
        pbc.b();
        yz8 c = pbc.c();
        sbc sbcVar2 = c.u;
        vz8 vz8Var = c.a;
        c.u = sbcVar;
        boolean i2 = c.i();
        z9c z9cVar = c.r;
        if (i2) {
            if (z9cVar == null) {
                z9c z9cVar2 = new z9c(c.g, new j0l(c, 27));
                c.r = z9cVar2;
                c.a(z9cVar2, true);
                c.m();
            }
            z9c z9cVar3 = c.r;
            boolean z8 = sbcVar.d;
            z9cVar3.p = z8;
            z9cVar3.n();
            vdb vdbVar = c.c;
            vdbVar.a = z8;
            ((Handler) vdbVar.e).post((kac) vdbVar.i);
            if ((sbcVar2 != null && sbcVar2.c) != sbcVar.c) {
                z9c z9cVar4 = c.r;
                z9cVar4.e = c.A;
                if (!z9cVar4.f) {
                    z9cVar4.f = true;
                    z9cVar4.c.sendEmptyMessage(2);
                }
            }
        } else if (z9cVar != null) {
            nbc d = c.d(z9cVar);
            if (d != null) {
                pbc.b();
                z9cVar.d = null;
                z9cVar.j(null);
                c.o(d, null);
                vz8Var.b(514, d);
                c.l.remove(d);
            }
            c.r = null;
            vdb vdbVar2 = c.c;
            ((Handler) vdbVar2.e).post((kac) vdbVar2.i);
        }
        vz8Var.b(769, sbcVar);
        logger.c("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(z), Boolean.valueOf(z6), Boolean.valueOf(z4), Boolean.valueOf(z5));
        zzce zzceVar = zzbxVar.d;
        if (zzceVar != null) {
            zzceVar.f = z && z6;
        }
        if (z && z6) {
            zzr.a(zzpm.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        if (z4) {
            zzr.a(zzpm.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    @Override // defpackage.u0l
    public void onPostMessage(WebView webView, i0l i0lVar, Uri uri, boolean z, mda mdaVar) {
        p03 p03Var = (p03) this.b;
        try {
            JSONObject jSONObject = new JSONObject(i0lVar.a());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                p03Var.E(string2);
                return;
            }
            if (string.equals("finishSession")) {
                HashMap hashMap = (HashMap) p03Var.f;
                i2o i2oVar = (i2o) hashMap.get(string2);
                if (i2oVar != null) {
                    i2oVar.c();
                    hashMap.remove(string2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        rbo rboVar = (rbo) this.b;
        rboVar.getClass();
        List list = (List) task.getResult();
        return Tasks.whenAllComplete(list).continueWith(rboVar.e, new wm2(list, false));
    }

    @Override // com.google.android.gms.internal.ads.zzhcf
    /* renamed from: zza, reason: collision with other method in class */
    public ddb mo10zza() {
        Bundle bundle;
        String str;
        HashMap hashMap;
        Map a;
        zzfco zzfcoVar = (zzfco) this.b;
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.Ac)).booleanValue();
        String str2 = zzfcoVar.e.g;
        if (booleanValue) {
            str2 = str2.toLowerCase(Locale.ROOT);
        }
        if (((Boolean) zzba.zzc().a(zzbjg.t2)).booleanValue()) {
            zzecw zzecwVar = zzfcoVar.h;
            synchronized (zzecwVar) {
                bundle = new Bundle(zzecwVar.a);
            }
        } else {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (((Boolean) zzba.zzc().a(zzbjg.l5)).booleanValue()) {
            zzcfq zzi = zzt.zzh().g().zzi();
            str = (TextUtils.isEmpty(zzi.e) || zzi.g == null) ? "EMPTY" : zzi.b() ? "VALID" : "INVALID";
        } else {
            str = "";
        }
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = zzfcoVar.e.w;
        if (jSONArray != null) {
            HashMap hashMap2 = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String str4 = "";
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        str4 = optJSONArray.getString(0);
                    }
                    String str5 = str4;
                    if (!TextUtils.isEmpty(str5)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        Bundle bundle3 = new Bundle();
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle3.putString(next, optJSONObject.optString(next, ""));
                            }
                        }
                        hashMap2.put(str5, new zzesy(str5, true, true, false, bundle3));
                    }
                } catch (JSONException e) {
                    zzt.zzh().d("RecursiveRtbAdapterMap.parseAdapters", new JSONException("Malformed RTB adapter config."));
                    zze.zzb("Malformed RTB adapter config.", e);
                }
            }
            zzfcoVar.a(arrayList, hashMap2);
        } else {
            boolean booleanValue2 = ((Boolean) zzba.zzc().a(zzbjg.C2)).booleanValue();
            zzesu zzesuVar = zzfcoVar.c;
            String str6 = zzfcoVar.i;
            if (booleanValue2) {
                synchronized (zzesuVar) {
                    try {
                        zzgxp a2 = zzesuVar.a(str6, str2);
                        zzgxp i2 = zzesuVar.i(str2);
                        hashMap = new HashMap();
                        Iterator it = a2.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str7 = (String) entry.getKey();
                            if (i2.containsKey(str7)) {
                                zzesy zzesyVar = (zzesy) i2.get(str7);
                                List list = (List) entry.getValue();
                                hashMap.put(str7, new zzesy(str7, zzesyVar.b, zzesyVar.c, zzesyVar.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                            }
                        }
                        zzgxw zzgxwVar = i2.a;
                        if (zzgxwVar == null) {
                            zzgxwVar = i2.d();
                            i2.a = zzgxwVar;
                        }
                        zzhaa it2 = zzgxwVar.iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            String str8 = (String) entry2.getKey();
                            if (!hashMap.containsKey(str8) && ((zzesy) entry2.getValue()).d) {
                                hashMap.put(str8, (zzesy) entry2.getValue());
                            }
                        }
                    } finally {
                    }
                }
                zzfcoVar.a(arrayList, hashMap);
            } else {
                Iterator it3 = zzesuVar.a(str6, str2).entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it3.next();
                    String str9 = (String) entry3.getKey();
                    List list2 = (List) entry3.getValue();
                    Bundle bundle4 = zzfcoVar.e.d.zzm;
                    arrayList.add(zzfcoVar.b(str9, list2, bundle4 != null ? bundle4.getBundle(str9) : null, true, true));
                }
                synchronized (zzesuVar) {
                    a = TextUtils.isEmpty(zzt.zzh().g().zzi().e) ? njo.g : zzgxp.a(zzesuVar.b);
                }
                zzfcoVar.a(arrayList, a);
            }
        }
        return new zzhcx(zzgxm.x(arrayList), true).a(zzfcoVar.a, new t3n(arrayList, bundle2, str3));
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        switch (this.a) {
            case 10:
                ((zzczp) this.b).f.b0(true);
                return;
            case 14:
                zzclm zzclmVar = (zzclm) obj;
                zzcgo zzcgoVar = (zzcgo) this.b;
                if (zzclmVar == null) {
                    zzcgoVar.zzd(new zzeqf(1, "Missing webview from video view future."));
                    return;
                } else {
                    zzclmVar.T("/video", new zzcje(new upn(zzcgoVar)));
                    zzclmVar.l();
                    return;
                }
            case 16:
                zzflo zzfloVar = (zzflo) obj;
                if (((Boolean) zzba.zzc().a(zzbjg.n7)).booleanValue()) {
                    zzegi zzegiVar = (zzegi) this.b;
                    zzflg zzflgVar = zzfloVar.b.b;
                    zzekb zzekbVar = zzegiVar.e;
                    int i = zzflgVar.f;
                    synchronized (zzekbVar.g) {
                        zzekbVar.b = i;
                    }
                    zzekb zzekbVar2 = zzegiVar.e;
                    long j = zzflgVar.g;
                    synchronized (zzekbVar2.h) {
                        zzekbVar2.c = j;
                    }
                    return;
                }
                return;
            default:
                ((zzfqw) this.b).zza();
                return;
        }
    }

    public /* synthetic */ b1l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public b1l(zzbug zzbugVar) {
        this.a = 6;
        Objects.requireNonNull(zzbugVar);
        this.b = zzbugVar;
    }

    public /* synthetic */ b1l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public b1l(zzier zzierVar) {
        this.a = 28;
        this.b = zzierVar;
        zzierVar.a = this;
    }

    public b1l(ByteBuffer byteBuffer) {
        this.a = 5;
        this.b = byteBuffer.slice();
    }

    public b1l(r8n r8nVar) {
        this.a = 2;
        Charset charset = jan.a;
        this.b = r8nVar;
        r8nVar.a = this;
    }

    private final void h(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public void b(boolean z, Context context, zzdec zzdecVar) {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    public /* bridge */ /* synthetic */ Object zzb() {
        return new c0l(((jfn) this.b).b);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.b;
    }

    @Override // defpackage.njn
    public long zza() {
        return ((ByteBuffer) this.b).capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzgks
    /* renamed from: zza, reason: collision with other method in class */
    public gvn mo11zza() {
        return new gvn((vdf) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public /* synthetic */ Object zza(Object obj) {
        zzele.g((SQLiteDatabase) obj, (zzu) this.b);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    /* renamed from: zza, reason: collision with other method in class */
    public void mo12zza() {
        zzfla zzflaVar = (zzfla) this.b;
        synchronized (zzflaVar) {
            zzflaVar.d = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza, reason: collision with other method in class */
    public /* synthetic */ void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                zze.zza("Releasing engine reference.");
                ((zzbug) obj2).d.e();
                break;
            case 11:
                zzdef zzdefVar = (zzdef) obj;
                String message = ((zzdol) obj2).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdefVar.t(zzfmy.d(12, message, null));
                break;
            case 12:
                ((zzdjg) obj).D((zzbil.zzb) obj2);
                break;
            default:
                ((zzbra) obj).I((zzcct) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 10:
                ((zzczp) this.b).f.b0(false);
                return;
            case 14:
                int i = zze.zza;
                zzo.zzf("Failed to load media data due to video view load failure.");
                ((zzcgo) this.b).zzd(th);
                return;
            case 16:
                if (((Boolean) zzba.zzc().a(zzbjg.n7)).booleanValue()) {
                    Matcher matcher = zzegi.h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        zzegi zzegiVar = (zzegi) this.b;
                        int parseInt = Integer.parseInt(group);
                        zzekb zzekbVar = zzegiVar.e;
                        synchronized (zzekbVar.g) {
                            zzekbVar.b = parseInt;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
