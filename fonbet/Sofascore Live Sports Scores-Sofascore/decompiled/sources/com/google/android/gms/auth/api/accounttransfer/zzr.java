package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzr implements Api.ApiOptions.Optional {
    static {
        Bundle bundle = new Bundle();
        if (bundle.containsKey("accountTypes")) {
            return;
        }
        bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
