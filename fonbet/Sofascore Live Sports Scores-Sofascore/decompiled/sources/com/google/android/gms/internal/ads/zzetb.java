package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbp;
import defpackage.fhh;
import defpackage.uun;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzetb extends zzbp {
    public final Context a;
    public final uun b;
    public final zzflv c;
    public final zzdra d;
    public com.google.android.gms.ads.internal.client.zzbh e;

    public zzetb(uun uunVar, Context context, String str) {
        zzflv zzflvVar = new zzflv();
        this.c = zzflvVar;
        this.d = new zzdra();
        this.b = uunVar;
        zzflvVar.c = str;
        this.a = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final com.google.android.gms.ads.internal.client.zzbn zze() {
        zzdra zzdraVar = this.d;
        zzdraVar.getClass();
        zzdrb zzdrbVar = new zzdrb(zzdraVar);
        ArrayList arrayList = new ArrayList();
        if (zzdrbVar.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (zzdrbVar.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (zzdrbVar.b != null) {
            arrayList.add(Integer.toString(2));
        }
        fhh fhhVar = zzdrbVar.f;
        if (!fhhVar.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (zzdrbVar.e != null) {
            arrayList.add(Integer.toString(7));
        }
        zzflv zzflvVar = this.c;
        zzflvVar.f = arrayList;
        ArrayList arrayList2 = new ArrayList(fhhVar.c);
        for (int i = 0; i < fhhVar.c; i++) {
            arrayList2.add((String) fhhVar.g(i));
        }
        zzflvVar.g = arrayList2;
        if (zzflvVar.b == null) {
            zzflvVar.b = com.google.android.gms.ads.internal.client.zzr.zzb();
        }
        return new zzetc(this.a, this.b, zzflvVar, zzdrbVar, this.e);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.e = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(zzbnq zzbnqVar) {
        this.d.b = zzbnqVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(zzbnt zzbntVar) {
        this.d.a = zzbntVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(String str, zzbnz zzbnzVar, zzbnw zzbnwVar) {
        zzdra zzdraVar = this.d;
        zzdraVar.f.put(str, zzbnzVar);
        if (zzbnwVar != null) {
            zzdraVar.g.put(str, zzbnwVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(zzbmk zzbmkVar) {
        this.c.h = zzbmkVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(zzbod zzbodVar, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.d.d = zzbodVar;
        this.c.b = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(PublisherAdViewOptions publisherAdViewOptions) {
        zzflv zzflvVar = this.c;
        zzflvVar.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            zzflvVar.e = publisherAdViewOptions.zza();
            zzflvVar.l = publisherAdViewOptions.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(zzbog zzbogVar) {
        this.d.c = zzbogVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzbst zzbstVar) {
        zzflv zzflvVar = this.c;
        zzflvVar.n = zzbstVar;
        zzflvVar.d = new com.google.android.gms.ads.internal.client.zzfw(false, true, false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbtc zzbtcVar) {
        this.d.e = zzbtcVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(AdManagerAdViewOptions adManagerAdViewOptions) {
        zzflv zzflvVar = this.c;
        zzflvVar.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            zzflvVar.e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        this.c.x = zzcpVar;
    }
}
