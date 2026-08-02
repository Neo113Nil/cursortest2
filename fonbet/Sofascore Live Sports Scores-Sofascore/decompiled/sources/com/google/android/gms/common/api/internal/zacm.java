package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.base.zao;
import com.google.android.gms.signin.zad;
import defpackage.a8p;
import defpackage.k2n;
import defpackage.t1n;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zacm extends com.google.android.gms.signin.internal.zac implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    public static final t1n h = zad.a;
    public final Context a;
    public final Handler b;
    public final t1n c = h;
    public final Set d;
    public final ClientSettings e;
    public com.google.android.gms.signin.zae f;
    public k2n g;

    public zacm(Context context, zao zaoVar, ClientSettings clientSettings) {
        this.a = context;
        this.b = zaoVar;
        this.e = clientSettings;
        this.d = clientSettings.b;
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void J(ConnectionResult connectionResult) {
        this.g.b(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        this.f.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        k2n k2nVar = this.g;
        zabk zabkVar = (zabk) k2nVar.f.j.get(k2nVar.b);
        if (zabkVar != null) {
            if (zabkVar.i) {
                zabkVar.k(new ConnectionResult(17, null, null));
            } else {
                zabkVar.onConnectionSuspended(i);
            }
        }
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void p0(com.google.android.gms.signin.internal.zak zakVar) {
        this.b.post(new a8p(this, zakVar, false, 26));
    }
}
