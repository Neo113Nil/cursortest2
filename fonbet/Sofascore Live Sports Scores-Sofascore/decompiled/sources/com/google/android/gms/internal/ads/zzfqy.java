package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.pyh;
import defpackage.sgo;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfqy implements zzfqw {
    public final Context a;
    public final int p;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int q = 2;
    public int r = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public zzfrl j = zzfrl.SCAR_REQUEST_TYPE_UNSPECIFIED;
    public String k = "";
    public String l = "";
    public String m = "";
    public boolean n = false;
    public boolean o = false;

    public zzfqy(Context context, int i) {
        this.a = context;
        this.p = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw a(Throwable th) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ja)).booleanValue()) {
                String zzh = com.google.android.gms.ads.internal.util.client.zzf.zzh(zzcaq.f(th));
                if (zzh == null) {
                    zzh = "";
                }
                this.l = zzh;
                String f = zzcaq.f(th);
                zzguz a = zzguz.a(new sgo('\n'));
                f.getClass();
                this.k = (String) ((pyh) a.c.i(a, f)).next();
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw b(com.google.android.gms.ads.internal.client.zze zzeVar) {
        synchronized (this) {
            try {
                IBinder iBinder = zzeVar.zze;
                if (iBinder != null) {
                    zzddi zzddiVar = (zzddi) iBinder;
                    String str = zzddiVar.d;
                    if (!TextUtils.isEmpty(str)) {
                        this.f = str;
                    }
                    String str2 = zzddiVar.b;
                    if (!TextUtils.isEmpty(str2)) {
                        this.g = str2;
                    }
                }
            } finally {
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw d(zzfrl zzfrlVar) {
        synchronized (this) {
            this.j = zzfrlVar;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        r2.g = r0;
     */
    @Override // com.google.android.gms.internal.ads.zzfqw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzfqw f(zzfln zzflnVar) {
        synchronized (this) {
            try {
                String str = zzflnVar.b.b;
                if (!TextUtils.isEmpty(str)) {
                    this.f = str;
                }
                Iterator it = zzflnVar.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = ((zzfld) it.next()).b0;
                    if (!TextUtils.isEmpty(str2)) {
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw g(int i) {
        synchronized (this) {
            this.q = i;
        }
        return this;
    }

    public final synchronized void h() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.a;
        this.e = zzf.zzk(context);
        Resources resources = context.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.r = i;
        this.b = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.o = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final /* bridge */ /* synthetic */ zzfqw zza() {
        h();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final synchronized boolean zzb() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzc() {
        synchronized (this) {
            this.c = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzd(boolean z) {
        synchronized (this) {
            this.d = z;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zze(String str) {
        synchronized (this) {
            this.i = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzi(String str) {
        synchronized (this) {
            this.h = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final zzfqw zzk(String str) {
        synchronized (this) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.ja)).booleanValue()) {
                this.m = str;
            }
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // com.google.android.gms.internal.ads.zzfqw
    public final synchronized zzfqz zzm() {
        try {
            if (this.n) {
                return null;
            }
            this.n = true;
            if (!this.o) {
                h();
            }
            if (this.c < 0) {
                synchronized (this) {
                    this.c = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                }
            }
            return new zzfqz(this);
        } catch (Throwable th) {
            throw th;
        }
    }
}
