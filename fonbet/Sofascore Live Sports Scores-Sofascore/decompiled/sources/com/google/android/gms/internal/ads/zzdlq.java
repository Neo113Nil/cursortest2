package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.mxn;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdlq extends zzdjn implements zzbfg {
    public final WeakHashMap b;
    public final Context c;
    public final zzfld d;

    public zzdlq(Context context, Set set, zzfld zzfldVar) {
        super(set);
        this.b = new WeakHashMap(1);
        this.c = context;
        this.d = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final synchronized void A(zzbff zzbffVar) {
        p0(new mxn(zzbffVar, 3));
    }

    public final synchronized void q0(View view) {
        try {
            WeakHashMap weakHashMap = this.b;
            zzbfi zzbfiVar = (zzbfi) weakHashMap.get(view);
            if (zzbfiVar == null) {
                zzbfi zzbfiVar2 = new zzbfi(this.c, view);
                zzbfiVar2.l.add(this);
                zzbfiVar2.d(3);
                weakHashMap.put(view, zzbfiVar2);
                zzbfiVar = zzbfiVar2;
            }
            if (this.d.X) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.f2)).booleanValue()) {
                    zzbfiVar.i.zzb(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.e2)).longValue());
                    return;
                }
            }
            zzbfiVar.i.zzb(zzbfi.o);
        } catch (Throwable th) {
            throw th;
        }
    }
}
