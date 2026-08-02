package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.util.UidVerifier;
import defpackage.lnb;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbt extends zbo {
    public final RevocationBoundService a;

    public zbt(RevocationBoundService revocationBoundService) {
        this.a = revocationBoundService;
    }

    public final void S1() {
        if (!UidVerifier.a(Binder.getCallingUid(), this.a)) {
            throw new SecurityException(lnb.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
