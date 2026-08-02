package com.google.android.gms.internal.fido;

import com.plaid.internal.EnumC3631g;

/* loaded from: classes2.dex */
public final class zzdt {
    private final byte zza;
    private final byte zzb;

    public zzdt(int i10) {
        this.zza = (byte) (i10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE);
        this.zzb = (byte) (i10 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
