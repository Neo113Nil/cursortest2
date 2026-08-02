package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.b2n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaag implements zaba {
    public final zabd a;

    public zaag(zabd zabdVar) {
        this.a = zabdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final boolean l() {
        zabd zabdVar = this.a;
        zabdVar.m.getClass();
        zabdVar.f();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final BaseImplementation.ApiMethodImpl n(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        zabd zabdVar = this.a;
        try {
            zaaz zaazVar = zabdVar.m;
            zacu zacuVar = zaazVar.w;
            zacuVar.a.add(apiMethodImpl);
            apiMethodImpl.g.set(zacuVar.b);
            Api.ClientKey clientKey = apiMethodImpl.o;
            Api.Client client = (Api.Client) zaazVar.o.get(clientKey);
            Preconditions.j(client, "Appropriate Api was not requested.");
            if (!client.isConnected() && zabdVar.g.containsKey(clientKey)) {
                apiMethodImpl.o(new Status(17, null, null, null));
                return apiMethodImpl;
            }
            try {
                apiMethodImpl.n(client);
            } catch (DeadObjectException e) {
                apiMethodImpl.o(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                apiMethodImpl.o(new Status(8, e2.getLocalizedMessage(), null, null));
            }
            return apiMethodImpl;
        } catch (DeadObjectException unused) {
            a aVar = new a(this, this);
            b2n b2nVar = zabdVar.e;
            b2nVar.sendMessage(b2nVar.obtainMessage(1, aVar));
            return apiMethodImpl;
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void q(int i) {
        zabd zabdVar = this.a;
        zabdVar.f();
        zabdVar.n.j(i);
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void m() {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void p() {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void r(ConnectionResult connectionResult, Api api, boolean z) {
    }
}
