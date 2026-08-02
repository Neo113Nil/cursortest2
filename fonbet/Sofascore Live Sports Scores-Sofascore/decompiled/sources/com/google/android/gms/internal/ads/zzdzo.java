package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.L6;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import defpackage.f0o;
import defpackage.t94;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdzo implements zzdir, com.google.android.gms.ads.internal.client.zza, zzdej, zzddt, zzdgk {
    public final Context a;
    public final zzfmp b;
    public final zzeaj c;
    public final zzflo d;
    public final zzfld e;
    public final zzele f;
    public final String g;
    public Boolean i;
    public long h = -1;
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final boolean j = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S7)).booleanValue();

    public zzdzo(Context context, zzfmp zzfmpVar, zzeaj zzeajVar, zzflo zzfloVar, zzfld zzfldVar, zzele zzeleVar, String str) {
        this.a = context;
        this.b = zzfmpVar;
        this.c = zzeajVar;
        this.d = zzfloVar;
        this.e = zzfldVar;
        this.f = zzeleVar;
        this.g = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void D() {
        if (c()) {
            zzeai h = h("adapter_impression");
            h.b("imp_type", String.valueOf(this.e.e));
            if (this.l.get()) {
                h.b("po", "1");
                h.b("pil", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a() - this.h));
            } else {
                h.b("po", "0");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sf)).booleanValue() && t()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                h.b(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.a) ? "1" : "0");
                h.b("fg_show", true != this.k.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.tf)).booleanValue() && t()) {
                h.b("fg_al", true == com.google.android.gms.ads.internal.zzt.zzg().e() ? "1" : "0");
            }
            h.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void L(zzdol zzdolVar) {
        if (this.j) {
            zzeai h = h("ifts");
            h.b("reason", "exception");
            if (!TextUtils.isEmpty(zzdolVar.getMessage())) {
                h.b(NotificationCompat.CATEGORY_MESSAGE, zzdolVar.getMessage());
            }
            h.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void M() {
        if (c()) {
            h("adapter_shown").c();
        }
    }

    public final boolean c() {
        String str;
        Boolean bool = this.i;
        if (bool == null) {
            synchronized (this) {
                bool = this.i;
                if (bool == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.j2);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzr(this.a);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzh().d("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    bool = Boolean.valueOf(z);
                    this.i = bool;
                }
            }
        }
        return bool.booleanValue();
    }

    public final zzeai h(String str) {
        zzflo zzfloVar = this.d;
        zzfln zzflnVar = zzfloVar.b;
        zzeai a = this.c.a();
        a.b("gqi", zzflnVar.b.b);
        zzfld zzfldVar = this.e;
        a.a(zzfldVar);
        a.b("action", str);
        a.b("ad_format", this.g.toUpperCase(Locale.ROOT));
        List list = zzfldVar.t;
        if (!list.isEmpty()) {
            a.b("ancn", (String) list.get(0));
        }
        if (zzfldVar.b()) {
            a.b("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzh().i(this.a) ? "offline" : t94.ONLINE_EXTRAS_KEY);
            a.b("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a()));
            a.b("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z7)).booleanValue()) {
            boolean zza = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zza(zzfloVar);
            a.b("scar", String.valueOf(zza));
            if (zza) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfloVar.a.a.d;
                a.b("ragent", zzmVar.zzp);
                a.b("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzmVar)));
            }
        }
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzdej
    public final void j() {
        boolean c = c();
        zzfld zzfldVar = this.e;
        if (c || zzfldVar.b()) {
            zzeai h = h("impression");
            h.b("imp_type", String.valueOf(zzfldVar.e));
            if (this.h > 0) {
                h.b("p_imp_l", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a() - this.h));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sf)).booleanValue() && t()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                h.b(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzJ(this.a) ? "1" : "0");
                h.b("fg_show", true == this.k.get() ? "1" : "0");
            }
            n(h);
        }
    }

    public final void n(zzeai zzeaiVar) {
        if (!this.e.b()) {
            zzeaiVar.c();
            return;
        }
        zzeao zzeaoVar = zzeaiVar.b.a;
        String generateUrl = zzeaoVar.f.generateUrl(zzeaiVar.a);
        zzelg zzelgVar = new zzelg(2, this.d.b.b.b, com.google.android.gms.ads.internal.zzt.zzk().a(), generateUrl);
        zzele zzeleVar = this.f;
        zzeleVar.getClass();
        zzeleVar.e(new f0o(8, zzeleVar, zzelgVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.e.b()) {
            n(h("click"));
        }
    }

    public final boolean t() {
        int i = this.e.b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // com.google.android.gms.internal.ads.zzddt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        String str;
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.j) {
            zzeai h = h("ifts");
            h.b("reason", L6.G1);
            int i = zzeVar.zza;
            String str2 = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str2 = zzeVar3.zzb;
            }
            if (i >= 0) {
                h.b("arec", String.valueOf(i));
            }
            Pattern pattern = this.b.a;
            if (pattern != null && str2 != null) {
                Matcher matcher = pattern.matcher(str2);
                if (matcher.find()) {
                    str = matcher.group();
                    if (str != null) {
                        h.b("areec", str);
                    }
                    h.c();
                }
            }
            str = null;
            if (str != null) {
            }
            h.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zze() {
        if (this.j) {
            zzeai h = h("ifts");
            h.b("reason", "blocked");
            h.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzk() {
        if (c()) {
            this.l.set(true);
            this.h = com.google.android.gms.ads.internal.zzt.zzk().a();
            zzeai h = h("presentation");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.sf)).booleanValue() && t()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                boolean z = !com.google.android.gms.ads.internal.util.zzs.zzJ(this.a);
                AtomicBoolean atomicBoolean = this.k;
                atomicBoolean.set(z);
                h.b(DownloadService.KEY_FOREGROUND, true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.tf)).booleanValue() && t()) {
                h.b("fg_al", true != com.google.android.gms.ads.internal.zzt.zzg().e() ? "0" : "1");
            }
            h.c();
        }
    }
}
