package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzexo implements zzfdg {
    public final double a;
    public final boolean b;

    public zzexo(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = zzfml.a(bundle, U3.i.G);
        bundle.putBundle(U3.i.G, a);
        Bundle a2 = zzfml.a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.b);
        a2.putDouble("battery_level", this.a);
    }
}
