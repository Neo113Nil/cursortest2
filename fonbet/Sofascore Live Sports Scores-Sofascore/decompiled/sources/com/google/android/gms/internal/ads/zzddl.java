package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzddl implements zzinw {
    public final zziof a;
    public final zziof b;
    public final zzczc c;

    public zzddl(zzinv zzinvVar, zzcpa zzcpaVar, zzczc zzczcVar) {
        this.a = zzinvVar;
        this.b = zzcpaVar;
        this.c = zzczcVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        Context context = (Context) this.a.zzb();
        VersionInfoParcel a = ((zzcpa) this.b).a();
        zzfld a2 = this.c.a();
        new zzceb();
        zzcec zzcecVar = a2.A;
        if (zzcecVar == null) {
            return null;
        }
        zzfli zzfliVar = a2.s;
        return new zzcea(context, a, zzcecVar, zzfliVar != null ? zzfliVar.b : null);
    }
}
