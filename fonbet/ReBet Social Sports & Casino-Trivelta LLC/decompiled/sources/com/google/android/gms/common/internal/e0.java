package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes2.dex */
public final class e0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC3179c f32703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32704b;

    public e0(AbstractC3179c abstractC3179c, int i10) {
        this.f32703a = abstractC3179c;
        this.f32704b = i10;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3186j
    public final void I(int i10, IBinder iBinder, Bundle bundle) {
        AbstractC3191o.n(this.f32703a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f32703a.onPostInitHandler(i10, iBinder, bundle, this.f32704b);
        this.f32703a = null;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3186j
    public final void e0(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3186j
    public final void n0(int i10, IBinder iBinder, zzj zzjVar) {
        AbstractC3179c abstractC3179c = this.f32703a;
        AbstractC3191o.n(abstractC3179c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC3191o.m(zzjVar);
        abstractC3179c.zzc(zzjVar);
        I(i10, iBinder, zzjVar.f32770a);
    }
}
