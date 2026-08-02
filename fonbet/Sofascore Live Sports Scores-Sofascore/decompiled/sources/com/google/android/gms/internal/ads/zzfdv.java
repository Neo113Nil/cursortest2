package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.L6;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfdv implements zzfdg {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public zzfdv(int i, int i2, int i3, int i4, String str, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfml.b(bundle, L6.R0, this.a, !TextUtils.isEmpty(r0));
        int i = this.b;
        zzfml.c(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle a = zzfml.a(bundle, U3.i.G);
        bundle.putBundle(U3.i.G, a);
        Bundle a2 = zzfml.a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f);
        a2.putBoolean("active_network_metered", this.e);
    }
}
