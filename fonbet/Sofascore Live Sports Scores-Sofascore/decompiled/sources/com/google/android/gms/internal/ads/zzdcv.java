package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.inn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdcv implements zzinw {
    public final zzinv a;
    public final zziof b;
    public final zziof c;
    public final zzefw d;
    public final zziof e;
    public final zzinv f;
    public final zziof g;
    public final zzinv h;
    public final zzfdm i;
    public final zzddg j;
    public final zzinv k;

    public zzdcv(zzinv zzinvVar, zziof zziofVar, zziof zziofVar2, zzefw zzefwVar, zziof zziofVar3, zzinv zzinvVar2, zziof zziofVar4, zzinv zzinvVar3, zzfdm zzfdmVar, zzddg zzddgVar, zzinv zzinvVar4) {
        this.a = zzinvVar;
        this.b = zziofVar;
        this.c = zziofVar2;
        this.d = zzefwVar;
        this.e = zziofVar3;
        this.f = zzinvVar2;
        this.g = zziofVar4;
        this.h = zzinvVar3;
        this.i = zzfdmVar;
        this.j = zzddgVar;
        this.k = zzinvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzdcu zzb() {
        zzfqi zzfqiVar = (zzfqi) this.a.zzb();
        VersionInfoParcel a = ((zzcpa) this.b).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.c.zzb();
        String packageName = ((zzcok) this.d.a).a().getPackageName();
        zzioe.a(packageName);
        inn innVar = zzbjg.a;
        return new zzdcu(zzfqiVar, a, applicationInfo, packageName, com.google.android.gms.ads.internal.client.zzba.zzb().a(), (PackageInfo) this.e.zzb(), zzinv.b(this.f), ((zzcoe) this.g).zzb(), (String) this.h.zzb(), this.i.zzb(), this.j.a(), (zzdji) this.k.zzb());
    }
}
