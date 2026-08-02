package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class h0 extends T {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c f32717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AbstractC3179c abstractC3179c, int i10, Bundle bundle) {
        super(abstractC3179c, i10, bundle);
        Objects.requireNonNull(abstractC3179c);
        this.f32717g = abstractC3179c;
    }

    @Override // com.google.android.gms.common.internal.T
    public final boolean e() {
        this.f32717g.zzc.a(ConnectionResult.f32216f);
        return true;
    }

    @Override // com.google.android.gms.common.internal.T
    public final void f(ConnectionResult connectionResult) {
        AbstractC3179c abstractC3179c = this.f32717g;
        if (abstractC3179c.enableLocalFallback() && abstractC3179c.zzg()) {
            abstractC3179c.zzf(16);
        } else {
            abstractC3179c.zzc.a(connectionResult);
            abstractC3179c.onConnectionFailed(connectionResult);
        }
    }
}
