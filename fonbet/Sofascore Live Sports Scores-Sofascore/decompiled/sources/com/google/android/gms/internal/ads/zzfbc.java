package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbc implements zzfdg {
    public final Bundle a;

    public zzfbc(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = zzfml.a(bundle, U3.i.G);
        a.putBundle("android_mem_info", this.a);
        bundle.putBundle(U3.i.G, a);
    }
}
