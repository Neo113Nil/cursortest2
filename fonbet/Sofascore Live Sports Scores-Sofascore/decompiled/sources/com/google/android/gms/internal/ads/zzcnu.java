package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.jun;
import defpackage.lv4;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcnu {
    public final zzcnl a;
    public final zzeaj b;

    public zzcnu(zzcnl zzcnlVar, zzeaj zzeajVar) {
        this.a = zzcnlVar;
        this.b = zzeajVar;
    }

    public final void a(Context context, VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Kf)).booleanValue()) {
            AbstractExecutorService abstractExecutorService = zzcgj.a;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Mf)).booleanValue()) {
                jun junVar = new jun(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Of)).intValue());
                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Nf)).intValue();
                abstractExecutorService = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), junVar);
            }
            abstractExecutorService.execute(new lv4(this, context, versionInfoParcel, false, 23));
        }
    }
}
