package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import defpackage.cpn;
import defpackage.ddb;
import defpackage.wlo;
import defpackage.yvn;
import defpackage.z1a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfec implements zzfdi {
    public final com.google.android.gms.ads.internal.util.zzg a;
    public final Context b;
    public final zzhdi c;
    public final ScheduledExecutorService d;
    public final zzemo e;
    public final zzflw f;
    public final VersionInfoParcel g;

    public zzfec(com.google.android.gms.ads.internal.util.zzj zzjVar, Context context, zzhdi zzhdiVar, ScheduledExecutorService scheduledExecutorService, zzemo zzemoVar, zzflw zzflwVar, VersionInfoParcel versionInfoParcel) {
        this.a = zzjVar;
        this.b = context;
        this.c = zzhdiVar;
        this.d = scheduledExecutorService;
        this.e = zzemoVar;
        this.f = zzflwVar;
        this.g = versionInfoParcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a2, code lost:
    
        if (java.util.Arrays.asList(r2.split(com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType.STRING_SEPARATOR)).contains(r6.b.getPackageName()) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r6.f.d.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // com.google.android.gms.internal.ads.zzfdi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ddb zza() {
        ddb b;
        wlo b2;
        ScheduledExecutorService scheduledExecutorService = this.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ac)).booleanValue() && this.a.zzz()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ec)).booleanValue()) {
            }
            if (this.g.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Yb)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Zb)).intValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Wb)).booleanValue()) {
                        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Xb);
                        if (!TextUtils.isEmpty(str)) {
                        }
                    }
                    try {
                        try {
                            z1a.G(this.e.a);
                            b2 = zzhcy.b(new IllegalStateException());
                        } catch (Exception e) {
                            b2 = zzhcy.b(e);
                        }
                        b = zzhcy.g(b2, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cc)).intValue(), timeUnit, scheduledExecutorService);
                    } catch (Exception e2) {
                        b = zzhcy.b(e2);
                    }
                    zzhcq r = zzhcq.r(b);
                    yvn yvnVar = yvn.k;
                    zzhdi zzhdiVar = this.c;
                    return zzhcy.g(zzhcy.f(zzhcy.h(r, yvnVar, zzhdiVar), Throwable.class, new cpn(this, 9), zzhdiVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.cc)).intValue(), timeUnit, scheduledExecutorService);
                }
            }
        }
        return zzhcy.a(new zzfed("", -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 56;
    }
}
