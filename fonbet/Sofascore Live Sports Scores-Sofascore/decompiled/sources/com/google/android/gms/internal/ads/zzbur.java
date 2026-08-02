package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbur {
    public final Object a = new Object();
    public final Object b = new Object();
    public zzbva c;
    public zzbva d;

    public static final boolean c(Context context) {
        if (((Boolean) zzbln.c.c()).booleanValue()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzk(context).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbva a(Context context, VersionInfoParcel versionInfoParcel, zzfrj zzfrjVar) {
        zzbva zzbvaVar;
        String str;
        synchronized (this.b) {
            try {
                zzbvaVar = this.d;
                if (zzbvaVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (c(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c);
                    } else {
                        str = (String) zzblr.a.c();
                    }
                    zzbvaVar = new zzbva(applicationContext, versionInfoParcel, str, zzfrjVar);
                    this.d = zzbvaVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbvaVar;
    }

    public final zzbva b(Context context, VersionInfoParcel versionInfoParcel, zzfrj zzfrjVar) {
        zzbva zzbvaVar;
        String str;
        synchronized (this.a) {
            try {
                zzbvaVar = this.c;
                if (zzbvaVar == null) {
                    if (c(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c);
                    } else if (((Boolean) zzbln.h.c()).booleanValue()) {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a);
                    } else {
                        str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.b);
                    }
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    zzbva zzbvaVar2 = new zzbva(context, versionInfoParcel, str, zzfrjVar);
                    this.c = zzbvaVar2;
                    zzbvaVar = zzbvaVar2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbvaVar;
    }
}
