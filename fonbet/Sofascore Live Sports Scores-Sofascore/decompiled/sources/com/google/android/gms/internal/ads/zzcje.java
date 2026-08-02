package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.bf3;
import defpackage.upn;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcje implements zzbqh {
    public final upn a;

    public zzcje(upn upnVar) {
        this.a = upnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final /* synthetic */ void a(Object obj, Map map) {
        String str = (String) map.get("action");
        if (str == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Action missing from video GMSG.");
        } else if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("src missing from video GMSG.");
            } else {
                this.a.a.zzc(bf3.f("mediaUrl", str2));
            }
        }
    }
}
