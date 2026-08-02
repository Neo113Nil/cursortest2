package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzata;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgo;
import com.ironsource.C4094gc;
import defpackage.c0l;
import defpackage.ddb;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbl {
    public static zzatv a;
    public static final Object b = new Object();

    public zzbl(Context context) {
        zzatv zzatvVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            try {
                if (a == null) {
                    zzbjg.a(context);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y5)).booleanValue()) {
                        zzatvVar = zzay.zzb(context);
                    } else {
                        zzatvVar = new zzatv(new zzauo(new c0l(context.getApplicationContext(), 14)), new zzauh(new zzaut()));
                        zzatvVar.a();
                    }
                    a = zzatvVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ddb zza(String str) {
        zzcgo zzcgoVar = new zzcgo();
        a.b(new zzbk(str, null, zzcgoVar));
        return zzcgoVar;
    }

    public final ddb zzb(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbi zzbiVar = new zzbi();
        zzbg zzbgVar = new zzbg(this, str, zzbiVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbh zzbhVar = new zzbh(this, i, str, zzbiVar, zzbgVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
            try {
                zzlVar.zzb(str, C4094gc.a, zzbhVar.zzm(), zzbhVar.zzn());
            } catch (zzata e) {
                String message = e.getMessage();
                int i2 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
        a.b(zzbhVar);
        return zzbiVar;
    }
}
