package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcp implements zzfdg {
    public final String a;
    public final Bundle b;
    public final String c;

    public zzfcp(String str, Bundle bundle, String str2) {
        this.a = str;
        this.b = bundle;
        this.c = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.a);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.l5)).booleanValue()) {
            String str = this.c;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        Bundle bundle2 = this.b;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
