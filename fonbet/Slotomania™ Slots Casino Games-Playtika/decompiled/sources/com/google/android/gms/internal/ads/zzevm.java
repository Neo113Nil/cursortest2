package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzevm implements zzfbw {
    final String zza;
    final int zzb;

    public zzevm(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        String str = this.zza;
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(str) || (i = this.zzb) == -1) {
            return;
        }
        Bundle zza = zzflb.zza(bundle, "pii");
        bundle.putBundle("pii", zza);
        zza.putString("pvid", str);
        zza.putInt("pvid_s", i);
    }
}
