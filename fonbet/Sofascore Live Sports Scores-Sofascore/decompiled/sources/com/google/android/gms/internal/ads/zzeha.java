package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.hsn;
import defpackage.si0;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzeha implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzcgo a = new zzcgo();
    public final Object b = new Object();
    public boolean c = false;
    public boolean d = false;
    public zzcbv e;
    public zzcax f;

    public static void b(Context context, zzcgo zzcgoVar, hsn hsnVar) {
        if (((Boolean) zzbkz.j.c()).booleanValue() || ((Boolean) zzbkz.h.c()).booleanValue()) {
            zzcgoVar.addListener(new vlo(0, zzcgoVar, new si0(context, false)), hsnVar);
        }
    }

    public void J(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Disconnected from remote ad request service.");
        this.a.zzd(new zzehp(1));
    }

    public final void a() {
        synchronized (this.b) {
            try {
                this.d = true;
                if (!this.f.isConnected()) {
                    if (this.f.isConnecting()) {
                    }
                    Binder.flushPendingCommands();
                }
                this.f.disconnect();
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i) {
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        zzo.zzd("Cannot connect to remote service, fallback to local instance.");
    }
}
