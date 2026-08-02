package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfct implements zzfdg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public zzfct(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfml.e("gmp_app_id", bundle, this.a);
        zzfml.e("fbs_aiid", bundle, this.b);
        zzfml.e("fbs_aeid", bundle, this.c);
        zzfml.e("apm_id_origin", bundle, this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
