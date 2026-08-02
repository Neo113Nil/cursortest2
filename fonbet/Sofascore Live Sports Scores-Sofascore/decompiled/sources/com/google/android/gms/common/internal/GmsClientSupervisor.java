package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.n2p;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public abstract class GmsClientSupervisor {
    public static final Object a = new Object();
    public static n2p b;
    public static HandlerThread c;

    public static n2p a(Context context) {
        n2p n2pVar;
        synchronized (a) {
            try {
                n2pVar = b;
                if (n2pVar == null) {
                    n2pVar = new n2p(context.getApplicationContext(), context.getMainLooper());
                    b = n2pVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n2pVar;
    }

    public abstract ConnectionResult b(zzn zznVar, zze zzeVar, String str, Executor executor);

    public abstract void c(zzn zznVar, ServiceConnection serviceConnection);
}
