package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import xsna.cv90;
import xsna.qdg0;
import xsna.uux0;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzal {
    private static final Status zza = new Status(13);

    public final cv90<Object> addWorkAccount(c cVar, String str) {
        return cVar.b(new zzae(this, uux0.a, cVar, str));
    }

    public final cv90<qdg0> removeWorkAccount(c cVar, Account account) {
        return cVar.b(new zzag(this, uux0.a, cVar, account));
    }

    public final void setWorkAuthenticatorEnabled(c cVar, boolean z) {
        setWorkAuthenticatorEnabledWithResult(cVar, z);
    }

    public final cv90<qdg0> setWorkAuthenticatorEnabledWithResult(c cVar, boolean z) {
        return cVar.b(new zzac(this, uux0.a, cVar, z));
    }
}
