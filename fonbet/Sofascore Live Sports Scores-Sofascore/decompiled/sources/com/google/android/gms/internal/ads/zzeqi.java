package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.ddb;
import defpackage.ewn;
import defpackage.hsn;
import defpackage.me4;
import defpackage.n5o;
import defpackage.x3o;
import defpackage.x5n;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeqi implements zzhcg {
    public final zzfqi a;
    public final zzddr b;
    public final zzfta c;
    public final zzfte d;
    public final hsn e;
    public final ScheduledExecutorService f;
    public final zzcyo g;
    public final zzeqb h;
    public final zzemv i;
    public final Context j;
    public final zzfrg k;
    public final zzepl l;
    public final zzeae m;

    public zzeqi(Context context, zzfqi zzfqiVar, zzeqb zzeqbVar, zzddr zzddrVar, zzfta zzftaVar, zzfte zzfteVar, zzcyo zzcyoVar, hsn hsnVar, ScheduledExecutorService scheduledExecutorService, zzemv zzemvVar, zzfrg zzfrgVar, zzepl zzeplVar, zzeae zzeaeVar) {
        this.j = context;
        this.a = zzfqiVar;
        this.h = zzeqbVar;
        this.b = zzddrVar;
        this.c = zzftaVar;
        this.d = zzfteVar;
        this.g = zzcyoVar;
        this.e = hsnVar;
        this.f = scheduledExecutorService;
        this.i = zzemvVar;
        this.k = zzfrgVar;
        this.l = zzeplVar;
        this.m = zzeaeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.G6)).booleanValue() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(zzflo zzfloVar) {
        String str = "No fill.";
        String str2 = true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H6)).booleanValue() ? "No ad config." : "No fill.";
        zzflg zzflgVar = zzfloVar.b.b;
        int i = zzflgVar.f;
        if (i != 0) {
            if (i < 200 || i >= 300) {
                str = (i < 300 || i >= 400) ? me4.g(i, "Received error HTTP response code: ", new StringBuilder(String.valueOf(i).length() + 35)) : "No location header to follow redirect or too many redirects.";
            }
            zzflf zzflfVar = zzflgVar.j;
            return zzflfVar == null ? zzflfVar.a : str;
        }
        str = str2;
        zzflf zzflfVar2 = zzflgVar.j;
        if (zzflfVar2 == null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final ddb zza(Object obj) {
        ddb d;
        int i;
        Bundle bundle;
        zzeqi zzeqiVar = this;
        zzflo zzfloVar = (zzflo) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S2)).booleanValue() && (bundle = zzfloVar.b.d) != null) {
            zzeae zzeaeVar = zzeqiVar.m;
            synchronized (zzeaeVar) {
                zzeaeVar.e.putAll(bundle);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.T2)).booleanValue()) {
            x5n.q("rendering-start", zzeqiVar.m);
        }
        String a = a(zzfloVar);
        zzemv zzemvVar = zzeqiVar.i;
        zzfln zzflnVar = zzfloVar.b;
        zzflg zzflgVar = zzflnVar.b;
        zzemvVar.d = zzflgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I9)).booleanValue() && (i = zzflgVar.f) != 0 && (i < 200 || i >= 300)) {
            return zzhcy.b(new zzeqf(3, a));
        }
        String str = zzflgVar.q;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfld zzfldVar : zzflnVar.a) {
                zzemvVar.b(zzfldVar, zzemvVar.a.size());
                Iterator it = zzfldVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzemvVar.c(zzfldVar, 0L, zzfmy.d(1, null, null), false);
                        break;
                    }
                    zzemq a2 = zzeqiVar.g.a(zzfldVar.b, (String) it.next());
                    if (a2 == null || !a2.b(zzfloVar, zzfldVar)) {
                    }
                }
            }
        } else {
            List list = zzflnVar.a;
            synchronized (zzemvVar) {
                Map map = zzemvVar.b;
                if (map.containsKey(str)) {
                    com.google.android.gms.ads.internal.client.zzv zzvVar = (com.google.android.gms.ads.internal.client.zzv) map.get(str);
                    List list2 = zzemvVar.a;
                    int indexOf = list2.indexOf(zzvVar);
                    try {
                        list2.remove(indexOf);
                    } catch (IndexOutOfBoundsException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().d("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    zzemvVar.b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzemvVar.b((zzfld) it2.next(), indexOf);
                        indexOf++;
                    }
                }
            }
        }
        zzddr zzddrVar = zzeqiVar.b;
        zzcuf zzcufVar = new zzcuf(zzfloVar, zzeqiVar.d, zzeqiVar.c);
        hsn hsnVar = zzeqiVar.e;
        zzddrVar.n0(zzcufVar, hsnVar);
        if (zzflgVar.r > 1) {
            zzepl zzeplVar = zzeqiVar.l;
            synchronized (zzeplVar) {
                try {
                    if (!zzeplVar.i.getAndSet(true)) {
                        List list3 = zzfloVar.b.a;
                        if (list3.isEmpty()) {
                            zzeplVar.h.e(new zzeqf(3, a(zzfloVar)));
                        } else {
                            zzeplVar.k = zzfloVar;
                            zzeqb zzeqbVar = zzeplVar.f;
                            zzeplVar.j = new n5o(zzfloVar, zzeqbVar, zzeplVar.h);
                            zzeqbVar.a(list3);
                            for (zzfld a3 = zzeplVar.j.a(); a3 != null; a3 = zzeplVar.j.a()) {
                                zzeplVar.a(a3);
                            }
                        }
                    }
                    d = zzeplVar.h;
                } finally {
                }
            }
        } else {
            String a4 = a(zzfloVar);
            zzfqi zzfqiVar = zzeqiVar.a;
            zzfqc zzfqcVar = zzfqc.RENDER_CONFIG_INIT;
            Objects.requireNonNull(zzfqiVar);
            d = new zzfpz(zzfqiVar, zzfqcVar, null, zzfqa.d, Collections.EMPTY_LIST, zzhcy.b(new zzeqf(3, a4))).d();
            zzeqb zzeqbVar2 = zzeqiVar.h;
            synchronized (zzeqbVar2) {
                zzeqbVar2.i = zzeqbVar2.a.elapsedRealtime();
            }
            int i2 = 0;
            for (zzfld zzfldVar2 : zzflnVar.a) {
                Iterator it3 = zzfldVar2.a.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String str2 = (String) it3.next();
                    zzemq a5 = zzeqiVar.g.a(zzfldVar2.b, str2);
                    if (a5 != null && a5.b(zzfloVar, zzfldVar2)) {
                        zzfpz a6 = zzfqiVar.a(d, zzfqc.RENDER_CONFIG_WATERFALL);
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                        sb.append("render-config-");
                        sb.append(i2);
                        sb.append("-");
                        sb.append(str2);
                        zzfpz zzfpzVar = new zzfpz(a6.f, a6.a, sb.toString(), a6.c, a6.d, a6.e);
                        ewn ewnVar = new ewn(zzeqiVar, zzfldVar2, zzfloVar, a5, 3);
                        zzfqa zzfqaVar = zzfpzVar.f;
                        d = new zzfpz(zzfqaVar, zzfpzVar.a, zzfpzVar.b, zzfpzVar.c, zzfpzVar.d, zzhcy.f(zzfpzVar.e, Throwable.class, ewnVar, zzfqaVar.a)).d();
                        break;
                    }
                    zzeqiVar = this;
                }
                i2++;
                zzeqiVar = this;
            }
            d.addListener(new x3o(zzeqbVar2, 5), hsnVar);
        }
        return d;
    }
}
