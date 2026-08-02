package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfed implements zzfdg {
    public final String a;
    public final int b;

    public /* synthetic */ zzfed(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ac)).booleanValue()) {
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("topics", str);
            }
            int i = this.b;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
