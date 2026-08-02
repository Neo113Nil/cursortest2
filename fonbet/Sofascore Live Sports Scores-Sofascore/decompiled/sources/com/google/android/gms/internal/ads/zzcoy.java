package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcoy implements zzinw {
    public final zzcok a;

    public zzcoy(zzcok zzcokVar) {
        this.a = zzcokVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a = this.a.a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.dd)).booleanValue()) {
            return com.google.android.gms.ads.internal.util.client.zzf.zzf(a);
        }
        return null;
    }
}
