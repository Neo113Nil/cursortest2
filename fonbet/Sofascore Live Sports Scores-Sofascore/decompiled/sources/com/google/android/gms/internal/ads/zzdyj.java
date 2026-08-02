package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbil;
import defpackage.utn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdyj implements zzinw {
    public final zziof a;
    public final zzefw b;
    public final zziof c;
    public final zziof d;
    public final zzinv e;

    public zzdyj(zzcok zzcokVar, zzefw zzefwVar, zzcpa zzcpaVar, zziof zziofVar, zzinv zzinvVar) {
        this.a = zzcokVar;
        this.b = zzefwVar;
        this.c = zzcpaVar;
        this.d = zziofVar;
        this.e = zzinvVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context a = ((zzcok) this.a).a();
        String packageName = ((zzcok) this.b.a).a().getPackageName();
        zzioe.a(packageName);
        VersionInfoParcel a2 = ((zzcpa) this.c).a();
        zzbil.zza.EnumC0134zza enumC0134zza = (zzbil.zza.EnumC0134zza) this.d.zzb();
        String str = (String) this.e.zzb();
        zzbif zzbifVar = new zzbif(new zzbik(a));
        zzbil.zzar.zza H = zzbil.zzar.H();
        int i = a2.buddyApkVersion;
        H.n();
        ((zzbil.zzar) H.b).E(i);
        int i2 = a2.clientJarVersion;
        H.n();
        ((zzbil.zzar) H.b).F(i2);
        int i3 = true != a2.isClientJar ? 2 : 0;
        H.n();
        ((zzbil.zzar) H.b).G(i3);
        zzbifVar.b(new utn(3, enumC0134zza, packageName, (zzbil.zzar) H.o(), str, false));
        return zzbifVar;
    }
}
