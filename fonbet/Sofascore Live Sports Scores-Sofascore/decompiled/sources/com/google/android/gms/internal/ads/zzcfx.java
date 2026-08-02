package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcfx {
    public final String h;
    public final com.google.android.gms.ads.internal.util.zzj i;
    public long a = -1;
    public long b = -1;
    public int c = -1;
    public int d = -1;
    public long e = 0;
    public final Object f = new Object();
    public final Object g = new Object();
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public final HashMap n = new HashMap();
    public final HashMap o = new HashMap();

    public zzcfx(String str, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.h = str;
        this.i = zzjVar;
    }

    public final void a(com.google.android.gms.ads.internal.client.zzm zzmVar, long j) {
        Bundle bundle;
        synchronized (this.f) {
            try {
                com.google.android.gms.ads.internal.util.zzj zzjVar = this.i;
                long zzm = zzjVar.zzm();
                long a = com.google.android.gms.ads.internal.zzt.zzk().a();
                if (this.b == -1) {
                    if (a - zzm > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L1)).longValue()) {
                        this.d = -1;
                    } else {
                        this.d = zzjVar.zzo();
                    }
                    this.b = j;
                    this.a = j;
                } else {
                    this.a = j;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.F4)).booleanValue() || (bundle = zzmVar.zzc) == null || bundle.getInt("gw", 2) != 1) {
                    this.c++;
                    int i = this.d + 1;
                    this.d = i;
                    if (i == 0) {
                        this.e = 0L;
                        zzjVar.zzp(a);
                    } else {
                        this.e = a - zzjVar.zzq();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (((Boolean) zzblo.a.c()).booleanValue()) {
            synchronized (this.f) {
                this.c--;
                this.d--;
            }
        }
    }
}
