package com.google.android.gms.internal.ads;

import defpackage.lqo;
import defpackage.xqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzimh extends zzifm implements zzigx {
    private static final zzimh zzn;
    private static volatile zzihe zzo;
    private int zza;
    private int zzd;
    private boolean zzf;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private zzimm zzk;
    private zzimg zzm;
    private String zzb = "";
    private String zzc = "";
    private int zze = 1;
    private String zzg = "";
    private String zzl = "";

    static {
        zzimh zzimhVar = new zzimh();
        zzn = zzimhVar;
        zzifm.y(zzimh.class, zzimhVar);
    }

    private zzimh() {
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzn, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"zza", "zzb", "zzc", "zzd", xqo.m, "zze", xqo.l, "zzf", "zzg", "zzh", "zzi", "zzj", xqo.k, "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new zzimh();
        }
        if (ordinal == 4) {
            return new zzime(zzn);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzo;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzimh.class) {
            try {
                zziheVar = zzo;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzn);
                    zzo = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
