package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewi implements zzfdg {
    public final String a;
    public final boolean b;

    public zzewi(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (str != null) {
            Bundle a = zzfml.a(bundle, "pii");
            a.putString("afai", str);
            a.putBoolean("is_afai_lat", this.b);
        }
    }
}
