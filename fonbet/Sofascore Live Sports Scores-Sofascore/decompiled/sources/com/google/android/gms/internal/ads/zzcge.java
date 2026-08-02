package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcge {
    public zzhdi a;
    public zzeaj b;
    public Context c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicBoolean e = new AtomicBoolean(false);
    public long f = -1;
    public long g = -1;

    public final void a(zzhdi zzhdiVar, zzeaj zzeajVar, Context context) {
        if (this.d.getAndSet(true)) {
            return;
        }
        this.a = zzhdiVar;
        this.b = zzeajVar;
        this.f = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ef)).longValue();
        this.g = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ff)).longValue();
        this.c = context;
    }
}
