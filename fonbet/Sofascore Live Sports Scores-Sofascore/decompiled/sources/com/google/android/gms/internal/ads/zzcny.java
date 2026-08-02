package com.google.android.gms.internal.ads;

import android.util.Base64;
import defpackage.fsn;
import defpackage.v0l;
import defpackage.y0l;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcny {
    public String a;
    public zzija b;
    public zzims c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public zzcny(ScheduledExecutorService scheduledExecutorService) {
        this.d = scheduledExecutorService;
    }

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.la)).booleanValue() && !this.e.getAndSet(true)) {
            b();
        }
    }

    public final void b() {
        try {
            String c = y0l.b("GET_VARIATIONS_HEADER") ? v0l.c() : null;
            if (c != null && !c.isEmpty()) {
                this.a = c;
                byte[] decode = Base64.decode(c, 10);
                this.b = zzija.D(decode, zziew.a());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.oa)).booleanValue()) {
                    this.c = zzims.D(decode, zziew.a());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ma)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.la)).booleanValue()) {
                        this.d.schedule(new fsn(this, 9), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.na)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (zzige | IllegalArgumentException e) {
            com.google.android.gms.ads.internal.zzt.zzh().e("ChromeVariations", e);
        }
    }
}
