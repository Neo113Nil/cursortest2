package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzgte extends zzgtj {
    zzgte(zzgtl zzgtlVar, CharSequence charSequence, int i) {
        super(zzgtlVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzc(int i) {
        CharSequence charSequence = this.zzb;
        int i2 = i + Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        if (i2 < charSequence.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtj
    public final int zzd(int i) {
        return i;
    }
}
