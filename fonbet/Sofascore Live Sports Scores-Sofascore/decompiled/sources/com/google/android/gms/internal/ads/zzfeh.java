package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzgdj;
import com.google.android.gms.internal.ads.zzgdn;
import defpackage.asn;
import defpackage.ddb;
import defpackage.hsn;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfeh implements zzfdi {
    public final Context a;
    public final ScheduledExecutorService b;
    public final hsn c;
    public final boolean d;
    public final boolean e;
    public final zzcfn f;

    public zzfeh(zzcfn zzcfnVar, Context context, ScheduledExecutorService scheduledExecutorService, hsn hsnVar, int i, boolean z, boolean z2) {
        this.f = zzcfnVar;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = hsnVar;
        this.d = z;
        this.e = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        zzcgo zzcgoVar = new zzcgo();
        com.google.android.gms.ads.internal.client.zzay.zza();
        Context context = this.a;
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcgj.a.execute(new asn(this.f, context, zzcgoVar));
        }
        zzhcq r = zzhcq.r(zzcgoVar);
        final int i = 1;
        zzgub zzgubVar = new zzgub(this) { // from class: v7o
            public final /* synthetic */ zzfeh b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
            
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.j4)).booleanValue() == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
            
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.i4)).booleanValue() == false) goto L25;
             */
            @Override // com.google.android.gms.internal.ads.zzgub
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i2 = i;
                zzfeh zzfehVar = this.b;
                switch (i2) {
                    case 0:
                        zzay.zza();
                        ContentResolver contentResolver = zzfehVar.a.getContentResolver();
                        return new zzfei(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgdj());
                    default:
                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                        zzgdj zzgdjVar = new zzgdj();
                        if (!zzfehVar.d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = zzfehVar.a;
                            zzgdn f = zzgdn.f(context2);
                            Objects.requireNonNull(info);
                            String id = info.getId();
                            Objects.requireNonNull(id);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) zzba.zzc().a(zzbjg.o4)).longValue();
                            boolean z = zzfehVar.e;
                            f.getClass();
                            synchronized (zzgdn.class) {
                                zzgdjVar = f.a(id, packageName, longValue, z);
                            }
                        } catch (IOException | IllegalArgumentException e) {
                            zzt.zzh().d("AdIdInfoSignalSource.getPaidV1", e);
                            zzgdjVar = new zzgdj();
                        }
                        return new zzfei(info, null, zzgdjVar);
                }
            }
        };
        hsn hsnVar = this.c;
        final int i2 = 0;
        return zzhcy.e((zzhcq) zzhcy.g(zzhcy.i(r, zzgubVar, hsnVar), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M1)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new zzgub(this) { // from class: v7o
            public final /* synthetic */ zzfeh b;

            {
                this.b = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0036, code lost:
            
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.j4)).booleanValue() == false) goto L25;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
            
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.i4)).booleanValue() == false) goto L25;
             */
            @Override // com.google.android.gms.internal.ads.zzgub
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object apply(Object obj) {
                int i22 = i2;
                zzfeh zzfehVar = this.b;
                switch (i22) {
                    case 0:
                        zzay.zza();
                        ContentResolver contentResolver = zzfehVar.a.getContentResolver();
                        return new zzfei(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"), new zzgdj());
                    default:
                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                        zzgdj zzgdjVar = new zzgdj();
                        if (!zzfehVar.d) {
                            break;
                        } else {
                            break;
                        }
                        try {
                            Context context2 = zzfehVar.a;
                            zzgdn f = zzgdn.f(context2);
                            Objects.requireNonNull(info);
                            String id = info.getId();
                            Objects.requireNonNull(id);
                            String packageName = context2.getPackageName();
                            long longValue = ((Long) zzba.zzc().a(zzbjg.o4)).longValue();
                            boolean z = zzfehVar.e;
                            f.getClass();
                            synchronized (zzgdn.class) {
                                zzgdjVar = f.a(id, packageName, longValue, z);
                            }
                        } catch (IOException | IllegalArgumentException e) {
                            zzt.zzh().d("AdIdInfoSignalSource.getPaidV1", e);
                            zzgdjVar = new zzgdj();
                        }
                        return new zzfei(info, null, zzgdjVar);
                }
            }
        }, hsnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 40;
    }
}
