package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.c2a;
import defpackage.csn;
import defpackage.ddb;
import defpackage.dsn;
import defpackage.v35;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcfv {
    public final Object a = new Object();
    public final com.google.android.gms.ads.internal.util.zzj b;
    public final zzcga c;
    public boolean d;
    public Context e;
    public VersionInfoParcel f;
    public String g;
    public zzbjl h;
    public zzeaj i;
    public Boolean j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public final dsn m;
    public final Object n;
    public ddb o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;

    public zzcfv() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.b = zzjVar;
        this.c = new zzcga(com.google.android.gms.ads.internal.client.zzay.zzf(), zzjVar);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = new AtomicInteger(0);
        this.l = new AtomicInteger(0);
        this.m = new dsn();
        this.n = new Object();
        this.p = new AtomicBoolean();
        this.q = new AtomicBoolean(false);
    }

    public final zzbjl a() {
        zzbjl zzbjlVar;
        synchronized (this.a) {
            zzbjlVar = this.h;
        }
        return zzbjlVar;
    }

    public final void b(Context context, VersionInfoParcel versionInfoParcel, zzeaj zzeajVar) {
        zzbjl zzbjlVar;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.zzg().b(this.c);
                    this.b.zza(this.e);
                    zzcaq.d(this.e, this.f);
                    this.i = zzeajVar;
                    com.google.android.gms.ads.internal.zzt.zzm();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N2)).booleanValue()) {
                        zzbjlVar = new zzbjl();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbjlVar = null;
                    }
                    this.h = zzbjlVar;
                    if (zzbjlVar != null) {
                        zzcgm.a(new csn(this).zzb(), "AppState.registerCsiReporter", zzcgj.h);
                    }
                    Context context2 = this.e;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N9)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new c2a(this));
                        } catch (RuntimeException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzj("Failed to register network callback", e);
                            this.p.set(true);
                        }
                    }
                    this.d = true;
                    h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Kf)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources c() {
        if (this.f.isClientJar) {
            return this.e.getResources();
        }
        try {
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.zc)).booleanValue();
            Context context = this.e;
            if (booleanValue) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(context).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(context).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void d(String str, Throwable th) {
        zzcaq.d(this.e, this.f).a(str, th);
    }

    public final void e(String str, Throwable th) {
        zzcaq.d(this.e, this.f).b(th, str, ((Double) zzblq.f.c()).floatValue());
    }

    public final void f(String str, Throwable th) {
        zzcas zzcasVar;
        Context context = this.e;
        VersionInfoParcel versionInfoParcel = this.f;
        synchronized (zzcaq.l) {
            try {
                zzcasVar = zzcaq.n;
                if (zzcasVar == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J8)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I8)).booleanValue()) {
                            zzcasVar = new zzcaq(context, versionInfoParcel);
                            zzcaq.n = zzcasVar;
                        }
                    }
                    zzcasVar = new zzcar();
                    zzcaq.n = zzcasVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zzcasVar.a(str, th);
    }

    public final com.google.android.gms.ads.internal.util.zzj g() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.b;
        }
        return zzjVar;
    }

    public final ddb h() {
        if (this.e != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V3)).booleanValue()) {
                synchronized (this.n) {
                    try {
                        ddb ddbVar = this.o;
                        if (ddbVar != null) {
                            return ddbVar;
                        }
                        ddb submit = zzcgj.a.submit(new v35(this, 7));
                        this.o = submit;
                        return submit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzhcy.a(new ArrayList());
    }

    public final boolean i(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.N9)).booleanValue()) {
            return this.p.get();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
