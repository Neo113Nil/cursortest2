package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public final class AuthProxyOptions implements Api.ApiOptions.Optional {
    static {
        new Bundle();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AuthProxyOptions) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
