package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import defpackage.g4n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzg extends g4n {
    public final /* synthetic */ BaseGmsClient g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(BaseGmsClient baseGmsClient, int i, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.g = baseGmsClient;
    }

    @Override // defpackage.g4n
    public final boolean b() {
        this.g.p.a(ConnectionResult.f);
        return true;
    }

    @Override // defpackage.g4n
    public final void c(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.g;
        baseGmsClient.p.a(connectionResult);
        baseGmsClient.k(connectionResult);
    }
}
