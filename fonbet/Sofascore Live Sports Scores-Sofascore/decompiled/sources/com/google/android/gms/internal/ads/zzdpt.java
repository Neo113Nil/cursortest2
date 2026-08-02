package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpt implements zzinw {
    public final zziof a;
    public final zzczc b;

    public zzdpt(zzczc zzczcVar, zzinv zzinvVar) {
        this.a = zzinvVar;
        this.b = zzczcVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdlq((Context) this.a.zzb(), new HashSet(), this.b.a());
    }
}
