package com.google.android.gms.internal.ads;

import defpackage.mio;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzcyl implements zzeqc {
    public final zzflo a;
    public final zzfld b;
    public final zzdeo c;
    public final zzdfb d;
    public final zzfir e;
    public final zzddi f;
    public final zzdig g;
    public final zzdff h;
    public final zzdll i;
    public final zzdck j;
    public final zzebm k;

    public zzcyl(zzcyk zzcykVar) {
        this.a = zzcykVar.a;
        this.b = zzcykVar.b;
        this.c = zzcykVar.c;
        this.d = zzcykVar.d;
        this.e = zzcykVar.e;
        this.f = zzcykVar.f;
        this.g = zzcykVar.g;
        this.h = zzcykVar.h;
        this.i = zzcykVar.i;
        this.j = zzcykVar.j;
        this.k = zzcykVar.k;
    }

    public void a() {
        this.d.zzg();
        this.h.f0(this);
    }

    public final void b() {
        zzebm zzebmVar;
        s sVar = this.b.C0;
        if (sVar == null || sVar.isEmpty() || (zzebmVar = this.k) == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R8)).booleanValue() || sVar.isEmpty()) {
            return;
        }
        mio listIterator = sVar.listIterator(0);
        while (listIterator.hasNext()) {
            zzebn zzebnVar = (zzebn) listIterator.next();
            int[] iArr = zzebnVar.b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    zzebmVar.a(1, zzebnVar.a, com.google.android.gms.ads.internal.zzt.zzk().a());
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeqc
    public final void zzm() {
        this.i.zzi();
    }
}
