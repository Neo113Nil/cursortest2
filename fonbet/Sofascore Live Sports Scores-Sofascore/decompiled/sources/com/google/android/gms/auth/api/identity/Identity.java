package com.google.android.gms.auth.api.identity;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p000authapi.zbaq;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class Identity {
    private Identity() {
    }

    public static zbaq a(Context context) {
        Preconditions.i(context);
        return new zbaq(context, new zbv());
    }
}
