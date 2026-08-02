package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.BaseImplementation;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zaas implements zaba {
    public final zabd a;

    public zaas(zabd zabdVar) {
        this.a = zabdVar;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final boolean l() {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void m() {
        zabd zabdVar = this.a;
        Lock lock = zabdVar.a;
        lock.lock();
        try {
            zabdVar.k = new zaar(zabdVar, zabdVar.h, zabdVar.i, zabdVar.d, zabdVar.j, lock, zabdVar.c);
            zabdVar.k.p();
            zabdVar.b.signalAll();
        } finally {
            zabdVar.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final BaseImplementation.ApiMethodImpl n(BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void p() {
        zabd zabdVar = this.a;
        Iterator it = zabdVar.f.values().iterator();
        while (it.hasNext()) {
            ((Api.Client) it.next()).disconnect();
        }
        zabdVar.m.p = Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void o(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void q(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zaba
    public final void r(ConnectionResult connectionResult, Api api, boolean z) {
    }
}
