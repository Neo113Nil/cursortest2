package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.f0o;
import defpackage.vlo;
import defpackage.yz1;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfmj {
    public final zzfld a;
    public final zzflg b;
    public final zzfte c;
    public final zzfsw d;
    public final zzfrg e;
    public final zzcub f;

    public zzfmj(zzfte zzfteVar, zzfsw zzfswVar, zzfld zzfldVar, zzflg zzflgVar, zzcub zzcubVar, zzfrg zzfrgVar) {
        this.a = zzfldVar;
        this.b = zzflgVar;
        this.c = zzfteVar;
        this.d = zzfswVar;
        this.f = zzcubVar;
        this.e = zzfrgVar;
    }

    public final void a(ArrayList arrayList, zzdge zzdgeVar) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzfld zzfldVar = this.a;
            if (zzfldVar.i0) {
                String str2 = this.b.b;
                zzfsw zzfswVar = this.d;
                zzfswVar.getClass();
                zzelg zzelgVar = new zzelg(2, str2, com.google.android.gms.ads.internal.zzt.zzk().a(), str);
                zzele zzeleVar = zzfswVar.a;
                zzeleVar.getClass();
                zzeleVar.e(new f0o(8, zzeleVar, zzelgVar));
            } else {
                zzfrg zzfrgVar = this.e;
                this.c.b(str, zzfldVar.x0, zzfrgVar, zzdgeVar);
            }
        }
    }

    public final void b(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ddb a = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hb)).booleanValue() && zzcub.b(str)) ? this.f.a(str, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.a(str);
            a.addListener(new vlo(0, a, new yz1(this, i, 20)), zzcgj.a);
        }
    }
}
