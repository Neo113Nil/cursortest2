package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.fsn;
import defpackage.v35;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcjk extends com.google.android.gms.ads.internal.util.zzb {
    public final zzcif b;
    public final zzcjs c;
    public final String d;
    public final String[] e;

    public zzcjk(zzcif zzcifVar, zzcjs zzcjsVar, String str, String[] strArr) {
        this.b = zzcifVar;
        this.c = zzcjsVar;
        this.d = str;
        this.e = strArr;
        com.google.android.gms.ads.internal.zzt.zzB().a.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.c.h(this.d, this.e);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new fsn(this, 3));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ddb zzb() {
        return (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M2)).booleanValue() && (this.c instanceof zzckb)) ? zzcgj.f.submit(new v35(this, 8)) : super.zzb();
    }
}
