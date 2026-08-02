package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcvc implements zzinw {
    public final zziof a;
    public final zzinv b;
    public final zziof c;

    public zzcvc(zzcpa zzcpaVar, zzinv zzinvVar, zziof zziofVar) {
        this.a = zzcpaVar;
        this.b = zzinvVar;
        this.c = zziofVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel a = ((zzcpa) this.a).a();
        JSONObject jSONObject = (JSONObject) this.b.zzb();
        String str = (String) this.c.zzb();
        boolean equals = IronSourceConstants.EVENTS_NATIVE.equals(str);
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbfd(UUID.randomUUID().toString(), a, str, jSONObject, equals);
    }
}
