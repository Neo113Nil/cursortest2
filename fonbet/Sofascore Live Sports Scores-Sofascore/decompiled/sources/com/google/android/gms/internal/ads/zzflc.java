package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzflc {
    public final Clock a;
    public final zzeaj b;
    public final Object c = new Object();
    public volatile int e = 1;
    public volatile long d = 0;

    public zzflc(Clock clock, zzeaj zzeajVar) {
        this.a = clock;
        this.b = zzeajVar;
    }

    public final void a(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Se)).booleanValue()) {
            zzeai a = this.b.a();
            a.b("action", "mbs_state");
            a.b("mbs_state", true != z ? "0" : "1");
            a.c();
        }
        if (z) {
            c(1, 2);
        } else {
            c(2, 1);
        }
    }

    public final void b() {
        long a = this.a.a();
        synchronized (this.c) {
            try {
                if (this.e == 3) {
                    if (this.d + ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a7)).longValue() <= a) {
                        this.e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i, int i2) {
        b();
        Object obj = this.c;
        long a = this.a.a();
        synchronized (obj) {
            try {
                if (this.e != i) {
                    return;
                }
                this.e = i2;
                if (this.e == 3) {
                    this.d = a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
