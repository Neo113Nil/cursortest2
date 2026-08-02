package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* loaded from: classes2.dex */
public final class r0 extends zza implements InterfaceC3184h {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3184h
    public final Account zzb() {
        Parcel zzB = zzB(2, zza());
        Account account = (Account) zzc.zzb(zzB, Account.CREATOR);
        zzB.recycle();
        return account;
    }
}
