package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.internal.common.zza;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzt extends zza implements IAccountAccessor {
    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        Parcel J = J(S1(), 2);
        Account account = (Account) com.google.android.gms.internal.common.zzc.a(J, Account.CREATOR);
        J.recycle();
        return account;
    }
}
