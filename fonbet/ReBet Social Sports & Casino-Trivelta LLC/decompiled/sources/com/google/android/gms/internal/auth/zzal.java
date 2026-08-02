package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import w9.AbstractC6726a;
import w9.InterfaceC6727b;

/* loaded from: classes2.dex */
public final class zzal implements InterfaceC6727b {
    private static final Status zza = new Status(13);

    public final h addWorkAccount(f fVar, String str) {
        return fVar.h(new zzae(this, AbstractC6726a.f67538a, fVar, str));
    }

    public final h removeWorkAccount(f fVar, Account account) {
        return fVar.h(new zzag(this, AbstractC6726a.f67538a, fVar, account));
    }

    public final void setWorkAuthenticatorEnabled(f fVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(fVar, z10);
    }

    public final h setWorkAuthenticatorEnabledWithResult(f fVar, boolean z10) {
        return fVar.h(new zzac(this, AbstractC6726a.f67538a, fVar, z10));
    }
}
