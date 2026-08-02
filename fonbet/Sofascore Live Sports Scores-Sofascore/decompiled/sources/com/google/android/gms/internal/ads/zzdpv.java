package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdpv implements zzinw {
    public final zziof a;

    public zzdpv(zzcpa zzcpaVar) {
        this.a = zzcpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel a = ((zzcpa) this.a).a();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbfd(UUID.randomUUID().toString(), a, IronSourceConstants.EVENTS_NATIVE, new JSONObject(), true);
    }
}
