package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfta {
    public final zzeqb a;
    public final String b;
    public final String c;
    public final String d;
    public final Context e;
    public final zzflp f;
    public final zzflq g;
    public final Clock h;
    public final zzbbd i;

    public zzfta(zzeqb zzeqbVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, zzflp zzflpVar, zzflq zzflqVar, Clock clock, zzbbd zzbbdVar) {
        this.a = zzeqbVar;
        this.b = versionInfoParcel.afmaVersion;
        this.c = str;
        this.d = str2;
        this.e = context;
        this.f = zzflpVar;
        this.g = zzflqVar;
        this.h = clock;
        this.i = zzbbdVar;
    }

    public static String c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final ArrayList a(zzflo zzfloVar, zzfld zzfldVar, List list) {
        return b(zzfloVar, zzfldVar, false, "", "", list, null, null);
    }

    public final ArrayList b(zzflo zzfloVar, zzfld zzfldVar, boolean z, String str, String str2, List list, zzdck zzdckVar, zzcfw zzcfwVar) {
        String str3;
        String str4;
        long j;
        boolean z2;
        zzfld zzfldVar2 = zzfldVar;
        zzdck zzdckVar2 = zzdckVar;
        String str5 = "1";
        String str6 = "0";
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c = c(c(c((String) it.next(), "@gw_adlocid@", zzfloVar.a.a.g), "@gw_adnetrefresh@", true != z ? str6 : str5), "@gw_sdkver@", this.b);
            if (zzfldVar2 != null) {
                String c2 = c(c(c(c, "@gw_qdata@", zzfldVar2.y), "@gw_adnetid@", zzfldVar2.x), "@gw_allocid@", zzfldVar2.w);
                Context context = this.e;
                c = zzcet.a(c2, context, zzfldVar2.W, zzfldVar2.w0);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.rf)).booleanValue() && zzfldVar2.e == 4) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    c = c(c, "@gw_aps@", true != com.google.android.gms.ads.internal.util.zzs.zzJ(context) ? str6 : str5);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Cf)).booleanValue() && zzcfwVar != null) {
                    int i = zzcfwVar.a;
                    String c3 = c(c, "@gw_is@", i >= 0 ? Integer.toString(i) : "");
                    int i2 = zzcfwVar.b;
                    String c4 = c(c3, "@gw_fis@", i2 >= 0 ? Integer.toString(i2) : "");
                    int i3 = zzcfwVar.c;
                    c = c(c4, "@gw_sfis@", i3 >= 0 ? Integer.toString(i3) : "");
                }
            }
            zzeqb zzeqbVar = this.a;
            String c5 = c(c, "@gw_adnetstatus@", zzeqbVar.d());
            synchronized (zzeqbVar) {
                str3 = str5;
                str4 = str6;
                j = zzeqbVar.h;
            }
            String c6 = c(c(c(c5, "@gw_ttr@", Long.toString(j, 10)), "@gw_seqnum@", this.c), "@gw_sessid@", this.d);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Af)).booleanValue()) {
                if (zzdckVar2 != null) {
                    AtomicLong atomicLong = zzdckVar2.a;
                    if (atomicLong.get() > 0) {
                        c6 = c(c6, "@gw_placement_id@", Long.toString(atomicLong.get(), 10));
                    }
                }
                c6 = c(c6, "@gw_placement_id@", "");
            }
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean isEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !isEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!isEmpty) {
                    z2 = true;
                }
                arrayList.add(c6);
                zzfldVar2 = zzfldVar;
                zzdckVar2 = zzdckVar;
                str5 = str3;
                str6 = str4;
            }
            if (this.i.a(Uri.parse(c6))) {
                Uri.Builder buildUpon = Uri.parse(c6).buildUpon();
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                c6 = buildUpon.build().toString();
                arrayList.add(c6);
                zzfldVar2 = zzfldVar;
                zzdckVar2 = zzdckVar;
                str5 = str3;
                str6 = str4;
            }
            arrayList.add(c6);
            zzfldVar2 = zzfldVar;
            zzdckVar2 = zzdckVar;
            str5 = str3;
            str6 = str4;
        }
        return arrayList;
    }
}
