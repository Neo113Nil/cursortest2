package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.android.gms.internal.ads.zzfsv;
import com.google.android.gms.internal.ads.zzhcy;
import com.ironsource.U3;
import defpackage.ddb;
import defpackage.f0o;
import defpackage.wt3;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfsv {
    public final com.google.android.gms.ads.internal.util.client.zzx a;
    public final zzu b;
    public final zzhdj c;
    public final zzfsw d;
    public final zzcny e;

    public zzfsv(com.google.android.gms.ads.internal.util.client.zzx zzxVar, zzu zzuVar, zzhdj zzhdjVar, zzfsw zzfswVar, zzcny zzcnyVar) {
        this.a = zzxVar;
        this.b = zzuVar;
        this.c = zzhdjVar;
        this.d = zzfswVar;
        this.e = zzcnyVar;
    }

    public final ddb a(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g)).booleanValue() || !str.isEmpty()) {
                try {
                    return b(1, 0L, str);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzhcy.a(com.google.android.gms.ads.internal.util.client.zzt.zzb);
                }
            }
        }
        return zzhcy.a(com.google.android.gms.ads.internal.util.client.zzt.zzb);
    }

    public final ddb b(final int i, final long j, final String str) {
        final String str2;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.a;
        if (i > zzxVar.zza()) {
            zzfsw zzfswVar = this.d;
            if (zzfswVar == null || !zzxVar.zzd()) {
                return zzhcy.a(com.google.android.gms.ads.internal.util.client.zzt.zzc);
            }
            zzelg zzelgVar = new zzelg(2, "", com.google.android.gms.ads.internal.zzt.zzk().a(), str);
            zzele zzeleVar = zzfswVar.a;
            zzeleVar.getClass();
            zzeleVar.e(new f0o(8, zzeleVar, zzelgVar));
            return zzhcy.a(com.google.android.gms.ads.internal.util.client.zzt.zzd);
        }
        final int i2 = 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.W9)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            String valueOf = String.valueOf(clearQuery.build());
            str2 = wt3.m(valueOf, U3.j.c, new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length()), encodedQuery);
        } else {
            str2 = str;
        }
        zzhcg zzhcgVar = new zzhcg() { // from class: y9o
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ddb zza(Object obj) {
                zzt zztVar = (zzt) obj;
                if (zztVar != zzt.zzc) {
                    return zzhcy.a(zztVar);
                }
                zzfsv zzfsvVar = zzfsv.this;
                zzx zzxVar2 = zzfsvVar.a;
                long zzb = zzxVar2.zzb();
                int i3 = i;
                if (i3 != 1) {
                    zzb = (long) (zzxVar2.zzc() * j);
                }
                return zzfsvVar.b(i3 + 1, zzb, str);
            }
        };
        zzhdj zzhdjVar = this.c;
        if (j == 0) {
            return zzhcy.h(zzhdjVar.submit(new Callable(this) { // from class: x9o
                public final /* synthetic */ zzfsv b;

                {
                    this.b = this;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    int i3 = i2;
                    String str3 = str2;
                    zzfsv zzfsvVar = this.b;
                    switch (i3) {
                    }
                    return zzfsvVar.c(str3);
                }
            }), zzhcgVar, zzhdjVar);
        }
        final int i3 = 0;
        return zzhcy.h(zzhdjVar.schedule(new Callable(this) { // from class: x9o
            public final /* synthetic */ zzfsv b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i32 = i3;
                String str3 = str2;
                zzfsv zzfsvVar = this.b;
                switch (i32) {
                }
                return zzfsvVar.c(str3);
            }
        }, j, TimeUnit.MILLISECONDS), zzhcgVar, zzhdjVar);
    }

    public final com.google.android.gms.ads.internal.util.client.zzt c(String str) {
        zzcny zzcnyVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.oa)).booleanValue();
        zzu zzuVar = this.b;
        if (!booleanValue || (zzcnyVar = this.e) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzh(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzi(str))) {
            return zzuVar.zzc(str, null);
        }
        zzims zzimsVar = zzcnyVar.c;
        String encodeToString = zzimsVar != null ? Base64.encodeToString(zzimsVar.d(), 10) : null;
        HashMap hashMap = new HashMap();
        if (encodeToString != null) {
            hashMap.put((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.pa), encodeToString);
        }
        return zzuVar.zzc(str, hashMap);
    }
}
