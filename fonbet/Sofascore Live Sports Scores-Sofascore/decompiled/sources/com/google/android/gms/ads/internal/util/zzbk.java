package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzaty;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzcgo;
import com.ironsource.C4094gc;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbk extends zzats {
    public final zzcgo m;
    public final com.google.android.gms.ads.internal.util.client.zzl n;

    public zzbk(String str, Map map, zzcgo zzcgoVar) {
        super(0, str, new zzbj(zzcgoVar));
        this.m = zzcgoVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.n = zzlVar;
        zzlVar.zzb(str, C4094gc.a, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final zzaty c(zzato zzatoVar) {
        return new zzaty(zzatoVar, zzaup.a(zzatoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzats
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        zzato zzatoVar = (zzato) obj;
        Map map = zzatoVar.c;
        int i = zzatoVar.a;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.n;
        zzlVar.zzd(map, i);
        byte[] bArr = zzatoVar.b;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.m.zzc(zzatoVar);
    }
}
