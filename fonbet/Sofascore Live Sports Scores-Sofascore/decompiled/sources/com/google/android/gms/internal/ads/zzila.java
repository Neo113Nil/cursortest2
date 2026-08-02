package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lqo;
import defpackage.wpo;
import defpackage.xqo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzila extends zzifm implements zzigx {
    private static final zzila zzl;
    private static volatile zzihe zzm;
    private int zza;
    private int zzb;
    private zzikg zzd;
    private zzikk zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private zzifu zzg = wpo.e;
    private String zzh = "";
    private zzify zzj = kqo.e;

    static {
        zzila zzilaVar = new zzila();
        zzl = zzilaVar;
        zzifm.y(zzila.class, zzilaVar);
    }

    private zzila() {
    }

    public static zzikz F() {
        return (zzikz) zzl.v();
    }

    public final String D() {
        return this.zzc;
    }

    public final int E() {
        return this.zzj.size();
    }

    public final /* synthetic */ void G(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void I(zzikg zzikgVar) {
        this.zzd = zzikgVar;
        this.zza |= 4;
    }

    public final void J(String str) {
        str.getClass();
        zzify zzifyVar = this.zzj;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzj = zzifyVar.g(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void K(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        switch (zziflVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                this.zzk = zzifmVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new lqo(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", xqo.d, "zzj"});
            case 3:
                return new zzila();
            case 4:
                return new zzikz(zzl);
            case 5:
                return zzl;
            case 6:
                zzihe zziheVar2 = zzm;
                if (zziheVar2 != null) {
                    return zziheVar2;
                }
                synchronized (zzila.class) {
                    try {
                        zziheVar = zzm;
                        if (zziheVar == null) {
                            zziheVar = new zzifh(zzl);
                            zzm = zziheVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zziheVar;
            default:
                throw null;
        }
    }
}
