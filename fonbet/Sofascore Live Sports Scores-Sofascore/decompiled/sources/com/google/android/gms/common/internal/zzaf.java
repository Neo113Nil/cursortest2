package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaf extends Exception {
    public final ConnectionResult a;

    public zzaf(ConnectionResult connectionResult) {
        Preconditions.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", connectionResult.Y0());
        this.a = connectionResult;
    }
}
