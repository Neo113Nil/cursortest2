package defpackage;

import android.content.Context;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbve;
import com.google.android.gms.internal.ads.zzbxt;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzclx;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzcxi;
import com.google.android.gms.internal.ads.zzdec;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzdgq;
import com.google.android.gms.internal.ads.zzdi;
import com.google.android.gms.internal.ads.zzdiv;
import com.google.android.gms.internal.ads.zzdol;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzele;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzers;
import com.google.android.gms.internal.ads.zzfhq;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzfmt;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzghm;
import com.google.android.gms.internal.ads.zzghn;
import com.google.android.gms.internal.ads.zzgiz;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinv;
import com.google.android.gms.internal.ads.zzinx;
import com.google.android.gms.internal.ads.zzioe;
import com.google.android.gms.internal.ads.zzsq;
import com.google.android.gms.internal.consent_sdk.zzao;
import com.google.android.gms.internal.consent_sdk.zzaq;
import com.google.android.gms.internal.consent_sdk.zzbs;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzd;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qpn implements zzcgs, zzebt, zzfji, zzhcv, zzdom, zzfpi, zzghm {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;

    public qpn(vdf vdfVar) {
        this.a = 8;
        this.c = this;
        this.b = vdfVar;
        zzinv a = zzinv.a(fdo.a);
        zzinx zzinxVar = (zzinx) vdfVar.b;
        zzinx zzinxVar2 = (zzinx) vdfVar.d;
        zzinv zzinvVar = (zzinv) vdfVar.l;
        zzinv zzinvVar2 = (zzinv) vdfVar.n;
        zzinv zzinvVar3 = (zzinv) vdfVar.i;
        zzinx zzinxVar3 = (zzinx) vdfVar.e;
        int i = rdo.a;
        zzinv a2 = zzinv.a(new zzgiz(zzinvVar, a, zzinvVar2, zzinvVar3, zzinxVar, zzinxVar2, zzinxVar3));
        this.d = a2;
        this.e = zzinv.a(new zzghn((zzinx) vdfVar.d, a2, (zzinv) vdfVar.l, (zzinv) vdfVar.k, zzinv.a(gdo.a), new mco(this, 3), (zzinx) vdfVar.e));
    }

    public utn a() {
        zzioe.b(Long.class, (Long) this.d);
        zzioe.b(String.class, (String) this.e);
        return new utn((uun) this.b, (dvn) this.c, (Long) this.d, (String) this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public void b(boolean z, Context context, zzdec zzdecVar) {
        boolean t3;
        zzbxt zzbxtVar = (zzbxt) this.c;
        try {
            int ordinal = ((AdFormat) this.d).ordinal();
            if (ordinal == 1) {
                t3 = zzbxtVar.t3(new ObjectWrapper(context));
            } else {
                if (ordinal != 2) {
                    if (ordinal == 5) {
                        t3 = zzbxtVar.r(new ObjectWrapper(context));
                    }
                    throw new zzdol("Adapter failed to show.");
                }
                t3 = zzbxtVar.zzm(new ObjectWrapper(context));
            }
            if (t3) {
                zzdeh zzdehVar = (zzdeh) this.e;
                if (zzdehVar == null) {
                    return;
                }
                if (((Boolean) zzba.zzc().a(zzbjg.m2)).booleanValue() || ((zzfld) this.b).Y != 2) {
                    return;
                }
                zzdehVar.zza();
                return;
            }
            throw new zzdol("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdol(th);
        }
    }

    public gvn c() {
        zzioe.b(Context.class, (Context) this.c);
        zzioe.b(String.class, (String) this.d);
        zzioe.b(zzr.class, (zzr) this.e);
        return new gvn((uun) this.b, (Context) this.c, (String) this.d, (zzr) this.e);
    }

    public und f(zzcn zzcnVar) {
        int i;
        String str;
        zzaq zzaqVar = (zzaq) this.d;
        zzcr zzcrVar = (zzcr) this.e;
        int i2 = zzcnVar.g;
        zzaqVar.b.edit().putBoolean("is_pub_misconfigured", i2 == 8).commit();
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 3;
        switch (i3) {
            case 1:
            case 2:
            case 3:
                i = 3;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzcnVar.c)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzcnVar.c)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i5 = zzcnVar.h;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            i4 = 2;
        }
        String str2 = zzcnVar.a;
        zzbs zzbsVar = str2 == null ? null : new zzbs(zzcnVar.b, str2);
        zzcrVar.a.set(zzcnVar.f);
        zzaqVar.b.edit().putStringSet("stored_info", new HashSet(zzcnVar.d)).commit();
        for (zzcm zzcmVar : zzcnVar.e) {
            int i7 = zzcmVar.b;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                str = null;
            } else if (i8 == 1) {
                str = "write";
            } else {
                if (i8 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                zze zzeVar = (zze) this.b;
                String str3 = zzcmVar.a;
                zzd[] zzdVarArr = {(zzao) this.c};
                zzeVar.getClass();
                zzeVar.a.execute(new zzc(str, str3, zzdVarArr));
            }
        }
        return new und(i, i4, 10, zzbsVar);
    }

    public /* bridge */ /* synthetic */ qpn g(String str) {
        str.getClass();
        this.e = str;
        return this;
    }

    public /* bridge */ /* synthetic */ qpn h(long j) {
        this.d = Long.valueOf(j);
        return this;
    }

    public /* bridge */ /* synthetic */ qpn i(String str) {
        str.getClass();
        this.d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        zzfrg zzfrgVar;
        int i;
        switch (this.a) {
            case 3:
                return;
            case 6:
                if (((Boolean) zzba.zzc().a(zzbjg.R6)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
                }
                zzfhq zzfhqVar = (zzfhq) this.e;
                synchronized (zzfhqVar) {
                    zzcxi zzcxiVar = (zzcxi) this.d;
                    com.google.android.gms.ads.internal.client.zze b = zzfmy.b(th, zzcxiVar.b().l);
                    zzfhqVar.n = b;
                    zzcxiVar.a().i0(b);
                    zzfmt.a(b.zza, "BannerAdLoader.onFailure", th);
                    if (zzfhqVar.m) {
                        zzfhqVar.d();
                        zzdgq zzdgqVar = zzfhqVar.h;
                        zzdiv zzdivVar = zzfhqVar.j;
                        synchronized (zzdivVar) {
                            i = zzdivVar.a;
                        }
                        zzdgqVar.q0(i);
                    }
                    if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar = (zzfrg) this.b) == null) {
                        zzfrj zzfrjVar = zzfhqVar.i;
                        zzfqw zzfqwVar = (zzfqw) this.c;
                        zzfqwVar.b(b);
                        zzfqwVar.a(th);
                        zzfqwVar.zzd(false);
                        zzfrjVar.b(zzfqwVar.zzm());
                    } else {
                        zzfrgVar.f(b);
                        zzfqw zzfqwVar2 = (zzfqw) this.c;
                        zzfqwVar2.a(th);
                        zzfqwVar2.zzd(false);
                        zzfrgVar.a(zzfqwVar2);
                        zzfrgVar.h();
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        zzfrg zzfrgVar;
        zzcub zzcubVar;
        switch (this.a) {
            case 3:
                zzclm zzclmVar = (zzclm) obj;
                zzfld zzfldVar = (zzfld) this.b;
                zzclmVar.m0(zzfldVar, (zzflg) this.c);
                zzclx zzP = zzclmVar.zzP();
                if (((Boolean) zzba.zzc().a(zzbjg.Lb)).booleanValue() && zzP != null) {
                    zzcub zzcubVar2 = (zzcub) this.d;
                    zzdvv zzdvvVar = (zzdvv) this.e;
                    zzele zzeleVar = zzdvvVar.i;
                    zzP.i0(zzcubVar2, zzeleVar, zzdvvVar.j);
                    zzP.l0(zzcubVar2, zzeleVar, zzdvvVar.d);
                }
                if (!((Boolean) zzba.zzc().a(zzbjg.Qe)).booleanValue() || zzP == null) {
                    return;
                }
                zzclm zzclmVar2 = zzP.a;
                if (zzt.zzD().a(zzclmVar2.getContext())) {
                    zzP.j("/logScionEvent");
                    new HashMap();
                    zzP.h("/logScionEvent", new zzbqn(zzclmVar2.getContext(), zzfldVar.w0));
                    return;
                }
                return;
            case 6:
                zzfhq zzfhqVar = (zzfhq) this.e;
                zzcwd zzcwdVar = (zzcwd) obj;
                synchronized (zzfhqVar) {
                    if (zzcwdVar != null) {
                        try {
                            zzcwdVar.b();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (zzfhqVar.m) {
                        zzfhqVar.c();
                    }
                    if (!((Boolean) zzbla.c.c()).booleanValue() || (zzfrgVar = (zzfrg) this.b) == null) {
                        zzfrj zzfrjVar = zzfhqVar.i;
                        zzfqw zzfqwVar = (zzfqw) this.c;
                        zzfqwVar.f(zzcwdVar.a.b);
                        zzfqwVar.zzi(zzcwdVar.f.a);
                        zzfqwVar.zzd(true);
                        zzfrjVar.b(zzfqwVar.zzm());
                    } else {
                        zzfrgVar.e(zzcwdVar.a.b);
                        zzfrgVar.g(zzcwdVar.f.a);
                        zzfqw zzfqwVar2 = (zzfqw) this.c;
                        zzfqwVar2.zzd(true);
                        zzfrgVar.a(zzfqwVar2);
                        zzfrgVar.h();
                    }
                }
                return;
            default:
                String str = (String) obj;
                zzclm zzclmVar3 = (zzclm) this.b;
                zzfld e = zzclmVar3.e();
                int i = 0;
                if (e != null && !e.i0) {
                    zzv zzvVar = e.x0;
                    if (!((Boolean) zzba.zzc().a(zzbjg.Hb)).booleanValue() || (zzcubVar = (zzcub) this.c) == null || !zzcub.b(str)) {
                        ((zzfte) this.d).b(str, zzvVar, null, null);
                        return;
                    }
                    zzfte zzfteVar = (zzfte) this.d;
                    Random zzh = zzay.zzh();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    ddb g = zzhcy.g(zzcubVar.c(str, zzcubVar.d.a, zzh), ((Integer) zzba.zzc().a(zzbjg.Ub)).intValue(), TimeUnit.MILLISECONDS, zzcubVar.g);
                    g.addListener(new vlo(i, g, new utn(zzcubVar, zzfteVar, str, zzvVar)), zzcubVar.e);
                    return;
                }
                zzflg g2 = zzclmVar3.g();
                if (g2 == null) {
                    zzt.zzh().d("BufferingGmsgHandlers.getBufferingClickGmsgHandler", new IllegalArgumentException("Common configuration cannot be null"));
                    return;
                }
                boolean z = false;
                long a = zzt.zzk().a();
                boolean i2 = zzt.zzh().i(zzclmVar3.getContext());
                boolean z2 = ((Boolean) zzba.zzc().a(zzbjg.p7)).booleanValue() && e != null && e.S;
                if (e != null && e.d0 != null) {
                    z = true;
                }
                zzelg zzelgVar = new zzelg((i2 || z2 || z) ? 2 : 1, g2.b, a, str);
                zzele zzeleVar2 = (zzele) this.e;
                zzeleVar2.getClass();
                zzeleVar2.e(new f0o(8, zzeleVar2, zzelgVar));
                return;
        }
    }

    private final void d(Throwable th) {
    }

    private final void e(Throwable th) {
    }

    public qpn(Context context, Executor executor, en0 en0Var, jzo jzoVar) {
        this.a = 9;
        this.b = context;
        this.c = executor;
        this.d = en0Var;
    }

    public qpn(zzfld zzfldVar, zzbxt zzbxtVar, AdFormat adFormat) {
        this.a = 4;
        this.e = null;
        this.b = zzfldVar;
        this.c = zzbxtVar;
        this.d = adFormat;
    }

    public /* synthetic */ qpn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj;
    }

    public /* synthetic */ qpn(uun uunVar) {
        this.a = 2;
        this.b = uunVar;
    }

    public /* synthetic */ qpn(uun uunVar, dvn dvnVar) {
        this.a = 1;
        this.b = uunVar;
        this.c = dvnVar;
    }

    public /* synthetic */ qpn(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ qpn(AudioTrack audioTrack, zzsq zzsqVar) {
        this.a = 10;
        this.b = audioTrack;
        this.c = zzsqVar;
        Handler p = zzfm.p();
        this.d = p;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: y5p
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                qpn qpnVar = qpn.this;
                if (((y5p) qpnVar.e) == null) {
                    return;
                }
                zzdi.a().execute(new yuo(9, qpnVar, audioRouting));
            }
        };
        this.e = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, p);
    }

    @Override // com.google.android.gms.internal.ads.zzcgs, com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        zzbun zzbunVar = (zzbun) obj;
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.c;
        zzcgo zzcgoVar = (zzcgo) this.d;
        zzbve zzbveVar = (zzbve) this.e;
        zzbug zzbugVar = (zzbug) this.b;
        try {
            zzt.zzc();
            String uuid = UUID.randomUUID().toString();
            zzbqg.j.b(uuid, new rpn(zzbveVar, zzbugVar, zzcgoVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", zzbveVar.b.zzb(obj2));
            zzbunVar.h(zzbveVar.d, jSONObject);
        } catch (Exception e) {
            try {
                zzcgoVar.zzd(e);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzg("Unable to invokeJavascript", e);
            } finally {
                zzbugVar.d();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public /* synthetic */ Object zza(Object obj) {
        zzers zzersVar = (zzers) this.b;
        return zzersVar.b.a((zzflo) this.c, (zzfld) this.d, (zzemt) this.e);
    }

    @Override // com.google.android.gms.internal.ads.zzdom
    public zzfld zzb() {
        return (zzfld) this.b;
    }
}
