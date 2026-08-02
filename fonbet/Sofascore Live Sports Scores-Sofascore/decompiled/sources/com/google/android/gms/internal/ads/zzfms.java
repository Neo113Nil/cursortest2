package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfms {
    public static zzfms d;
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzcv b;
    public final AtomicReference c = new AtomicReference();

    public zzfms(Context context, com.google.android.gms.ads.internal.client.zzcv zzcvVar) {
        this.a = context;
        this.b = zzcvVar;
    }

    public static zzfms a(Context context) {
        synchronized (zzfms.class) {
            try {
                zzfms zzfmsVar = d;
                if (zzfmsVar != null) {
                    return zzfmsVar;
                }
                Context applicationContext = context.getApplicationContext();
                long longValue = ((Long) zzbli.b.c()).longValue();
                com.google.android.gms.ads.internal.client.zzcv zzcvVar = null;
                if (longValue > 0 && longValue <= 262180000) {
                    try {
                        zzcvVar = zzcu.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzg("Failed to retrieve lite SDK info.", e);
                    }
                }
                zzfms zzfmsVar2 = new zzfms(applicationContext, zzcvVar);
                d = zzfmsVar2;
                return zzfmsVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzbvu zzbvuVar) {
        zzbvu adapterCreator;
        boolean booleanValue = ((Boolean) zzbli.a.c()).booleanValue();
        AtomicReference atomicReference = this.c;
        if (!booleanValue) {
            while (!atomicReference.compareAndSet(null, zzbvuVar) && atomicReference.get() == null) {
            }
            return;
        }
        com.google.android.gms.ads.internal.client.zzcv zzcvVar = this.b;
        if (zzcvVar != null) {
            try {
                adapterCreator = zzcvVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
            if (adapterCreator == null) {
                adapterCreator = zzbvuVar;
            }
            while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
            }
            return;
        }
        adapterCreator = null;
        if (adapterCreator == null) {
        }
        while (!atomicReference.compareAndSet(null, adapterCreator)) {
        }
    }
}
