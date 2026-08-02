package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.zzbjg;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcg {
    public boolean d;
    public Context e;
    public boolean c = false;
    public final WeakHashMap b = new WeakHashMap();
    public final BroadcastReceiver a = new zzcf(this);

    public final synchronized void zza(Context context) {
        try {
            if (this.c) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.e = applicationContext;
            if (applicationContext == null) {
                this.e = context;
            } else {
                context = applicationContext;
            }
            zzbjg.a(context);
            this.d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.R4)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
                this.e.registerReceiver(this.a, intentFilter);
            } else {
                this.e.registerReceiver(this.a, intentFilter, 4);
            }
            this.c = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.b.put(broadcastReceiver, intentFilter);
            return;
        }
        zzbjg.a(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Fc)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
