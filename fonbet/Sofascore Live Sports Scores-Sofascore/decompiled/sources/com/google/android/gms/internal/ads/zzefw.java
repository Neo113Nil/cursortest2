package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzefw implements zzinw {
    public final zziof a;

    public zzefw(zzcok zzcokVar) {
        this.a = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        String packageName = ((zzcok) this.a).a().getPackageName();
        zzioe.a(packageName);
        return packageName;
    }
}
