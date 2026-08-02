package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import xsna.exc0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class zzaf extends Exception {
    public final ConnectionResult zza;

    public zzaf(ConnectionResult connectionResult) {
        exc0.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", connectionResult.i());
        this.zza = connectionResult;
    }
}
