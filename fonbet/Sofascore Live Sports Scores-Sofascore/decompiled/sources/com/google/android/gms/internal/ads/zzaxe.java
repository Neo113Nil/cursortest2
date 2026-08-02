package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import defpackage.kqo;
import defpackage.lkn;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaxe extends zzifm implements zzigx {
    private static final zzaxe zzu;
    private static volatile zzihe zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private zzify zzb = kqo.e;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private zzifu zzn = wpo.e;

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzu = zzaxeVar;
        zzifm.y(zzaxe.class, zzaxeVar);
    }

    private zzaxe() {
    }

    public static zzaxd D() {
        return (zzaxd) zzu.v();
    }

    public final void E(zzaxw zzaxwVar) {
        zzify zzifyVar = this.zzb;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzb = zzifyVar.g(size + size);
        }
        this.zzb.add(zzaxwVar);
    }

    public final void F() {
        this.zzb = kqo.e;
    }

    public final /* synthetic */ void G(long j) {
        this.zza |= 1;
        this.zzc = j;
    }

    public final /* synthetic */ void H(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void L(long j) {
        this.zza |= 64;
        this.zzi = j;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
        this.zzk = str;
    }

    public final /* synthetic */ void O(long j) {
        this.zza |= 512;
        this.zzl = j;
    }

    public final /* synthetic */ void P(long j) {
        this.zza |= 1024;
        this.zzm = j;
    }

    public final void Q(zzifu zzifuVar) {
        zzifu zzifuVar2 = this.zzn;
        if (!zzifuVar2.zza()) {
            int size = zzifuVar2.size();
            this.zzn = zzifuVar2.g(size + size);
        }
        zzidq.l(zzifuVar, this.zzn);
    }

    public final /* synthetic */ void R(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    public final void S(int i) {
        this.zzo = i - 2;
        this.zza |= com.ironsource.mediationsdk.metadata.a.o;
    }

    public final /* synthetic */ void U(int i) {
        this.zzp = 1;
        this.zza |= 4096;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", zzaxw.class, "zzc", "zzd", "zze", "zzf", "zzg", lkn.e, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (ordinal == 3) {
            return new zzaxe();
        }
        if (ordinal == 4) {
            return new zzaxd(zzu);
        }
        if (ordinal == 5) {
            return zzu;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzv;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzaxe.class) {
            try {
                zziheVar = zzv;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzu);
                    zzv = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
