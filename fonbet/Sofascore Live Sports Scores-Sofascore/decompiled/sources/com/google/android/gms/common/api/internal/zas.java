package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zas implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public final Api a;
    public final boolean b;
    public zabd c;

    public zas(Api api, boolean z) {
        this.a = api;
        this.b = z;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        Api api = this.a;
        boolean z = this.b;
        Preconditions.j(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        zabd zabdVar = this.c;
        zabdVar.a.lock();
        try {
            zabdVar.k.r(connectionResult, api, z);
        } finally {
            zabdVar.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.j(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.j(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i);
    }
}
