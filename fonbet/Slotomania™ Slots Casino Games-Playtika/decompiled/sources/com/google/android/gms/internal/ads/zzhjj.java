package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhjj extends zzhjk {
    public zzhjj(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhjk
    final zzhji zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzhjh(bArr, i);
    }
}
