package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeww implements zzfdg {
    public final String a;
    public final int b;

    public zzeww(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        if (TextUtils.isEmpty(str) || (i = this.b) == -1) {
            return;
        }
        Bundle a = zzfml.a(bundle, "pii");
        bundle.putBundle("pii", a);
        a.putString("pvid", str);
        a.putInt("pvid_s", i);
    }
}
