package defpackage;

import androidx.compose.runtime.e;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzefb;
import com.google.android.gms.internal.ads.zzemu;
import com.google.android.gms.internal.ads.zzepj;
import com.google.android.gms.internal.ads.zzeqb;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmy;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzfte;
import com.google.android.gms.internal.ads.zzhcv;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pcj implements zzhcv {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public final Object g;

    public pcj(ema emaVar, kx4 kx4Var, sf8 sf8Var, dfj dfjVar, Object obj) {
        long a;
        this.b = emaVar;
        this.c = kx4Var;
        this.d = sf8Var;
        this.e = dfjVar;
        this.f = obj;
        this.g = e.f(Boolean.TRUE);
        a = faj.a((dfj) this.e, (kx4) this.c, (sf8) this.d, faj.a, 1);
        this.a = a;
    }

    public static void a(pcj pcjVar, ema emaVar, kx4 kx4Var, dfj dfjVar, int i) {
        if ((i & 1) != 0) {
            emaVar = (ema) pcjVar.b;
        }
        if ((i & 2) != 0) {
            kx4Var = (kx4) pcjVar.c;
        }
        sf8 sf8Var = (sf8) pcjVar.d;
        if ((i & 8) != 0) {
            dfjVar = (dfj) pcjVar.e;
        }
        Object obj = pcjVar.f;
        ema emaVar2 = (ema) pcjVar.b;
        e1d e1dVar = (e1d) pcjVar.g;
        if (emaVar == emaVar2 && Intrinsics.c(kx4Var, (kx4) pcjVar.c) && Intrinsics.c(sf8Var, (sf8) pcjVar.d) && Intrinsics.c(dfjVar, (dfj) pcjVar.e)) {
            if (Intrinsics.c(obj, pcjVar.f)) {
                return;
            }
            pcjVar.f = obj;
            ((eoh) e1dVar).setValue(Boolean.TRUE);
            return;
        }
        pcjVar.b = emaVar;
        pcjVar.c = kx4Var;
        pcjVar.d = sf8Var;
        pcjVar.e = dfjVar;
        ((eoh) e1dVar).setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zza(Throwable th) {
        int i;
        zze zzeVar;
        Integer valueOf;
        zze zzeVar2;
        zzeqb zzeqbVar = (zzeqb) this.g;
        long elapsedRealtime = zzeqbVar.a.elapsedRealtime() - this.a;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzepj) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof zzfmd) {
            i = 5;
        } else if (th instanceof zzefb) {
            i = zzfmy.a(th).zza == 3 ? 1 : 6;
            if (((Boolean) zzba.zzc().a(zzbjg.s2)).booleanValue() && (th instanceof zzemu) && (zzeVar = ((zzemu) th).b) != null) {
                valueOf = Integer.valueOf(zzeVar.zza);
                synchronized (zzeqbVar) {
                    try {
                        if (zzeqbVar.e) {
                            int i2 = i;
                            zzeqbVar.b.a((zzflg) this.b, (zzfld) this.c, i2, th instanceof zzemu ? (zzemu) th : null, elapsedRealtime);
                            i = i2;
                            elapsedRealtime = elapsedRealtime;
                        }
                        if (((Boolean) zzba.zzc().a(zzbjg.K9)).booleanValue()) {
                            zzfte zzfteVar = zzeqbVar.c;
                            zzfta zzftaVar = (zzfta) this.e;
                            zzflo zzfloVar = (zzflo) this.f;
                            zzfld zzfldVar = (zzfld) this.c;
                            zzfteVar.a(zzftaVar.a(zzfloVar, zzfldVar, zzfldVar.n), zzfldVar.x0);
                        }
                        if (zzeqbVar.g) {
                            return;
                        }
                        LinkedHashMap linkedHashMap = zzeqbVar.d;
                        zzfld zzfldVar2 = (zzfld) this.c;
                        long j = elapsedRealtime;
                        linkedHashMap.put(zzfldVar2, new r5o((String) this.d, zzfldVar2.f0, i, j, valueOf));
                        zze a = zzfmy.a(th);
                        int i3 = a.zza;
                        if ((i3 == 3 || i3 == 0) && (zzeVar2 = a.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                            a = zzfmy.a(new zzemu(13, a.zzd));
                        }
                        zzeqbVar.f.c(zzfldVar2, j, a, false);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            i = 6;
        }
        valueOf = null;
        synchronized (zzeqbVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x000f, B:6:0x0013, B:7:0x002c, B:9:0x0030, B:12:0x0032, B:13:0x0036, B:18:0x0042, B:21:0x0050, B:22:0x006a, B:23:0x0074, B:25:0x0059, B:29:0x004a, B:35:0x0079, B:15:0x0037, B:26:0x0044), top: B:3:0x000f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059 A[Catch: all -> 0x0028, TryCatch #1 {all -> 0x0028, blocks: (B:4:0x000f, B:6:0x0013, B:7:0x002c, B:9:0x0030, B:12:0x0032, B:13:0x0036, B:18:0x0042, B:21:0x0050, B:22:0x006a, B:23:0x0074, B:25:0x0059, B:29:0x004a, B:35:0x0079, B:15:0x0037, B:26:0x0044), top: B:3:0x000f, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.zzhcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzb(Object obj) {
        long j;
        zzeqb zzeqbVar = (zzeqb) this.g;
        long elapsedRealtime = zzeqbVar.a.elapsedRealtime() - this.a;
        synchronized (zzeqbVar) {
            try {
                if (zzeqbVar.e) {
                    zzeqbVar.b.a((zzflg) this.b, (zzfld) this.c, 0, null, elapsedRealtime);
                    j = elapsedRealtime;
                } else {
                    j = elapsedRealtime;
                }
                if (zzeqbVar.g) {
                    return;
                }
                zzfld zzfldVar = (zzfld) this.c;
                synchronized (zzeqbVar) {
                    r5o r5oVar = (r5o) zzeqbVar.d.get(zzfldVar);
                    boolean z = false;
                    if (r5oVar != null) {
                        if (r5oVar.c == 8) {
                            z = true;
                            LinkedHashMap linkedHashMap = zzeqbVar.d;
                            if (z) {
                                linkedHashMap.put(zzfldVar, new r5o((String) this.d, zzfldVar.f0, 0, j, null));
                            } else {
                                ((r5o) linkedHashMap.get(zzfldVar)).d = j;
                            }
                            zzeqbVar.f.c(zzfldVar, j, null, true);
                        }
                    }
                    LinkedHashMap linkedHashMap2 = zzeqbVar.d;
                    if (z) {
                    }
                    zzeqbVar.f.c(zzfldVar, j, null, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public pcj(zzeqb zzeqbVar, long j, zzflg zzflgVar, zzfld zzfldVar, String str, zzfta zzftaVar, zzflo zzfloVar) {
        this.a = j;
        this.b = zzflgVar;
        this.c = zzfldVar;
        this.d = str;
        this.e = zzftaVar;
        this.f = zzfloVar;
        Objects.requireNonNull(zzeqbVar);
        this.g = zzeqbVar;
    }
}
