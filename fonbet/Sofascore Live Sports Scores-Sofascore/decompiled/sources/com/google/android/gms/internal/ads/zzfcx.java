package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfcx implements zzfdg {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final String h;

    public zzfcx(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M4));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Z6)).booleanValue()) {
            String str = this.h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle a = zzfml.a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) zzblh.g.c()).booleanValue());
        a.putBoolean("instant_app", this.a);
        a.putBoolean("lite", this.b);
        a.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = zzfml.a(a, "build_meta");
        a2.putString("cl", "919173219");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
