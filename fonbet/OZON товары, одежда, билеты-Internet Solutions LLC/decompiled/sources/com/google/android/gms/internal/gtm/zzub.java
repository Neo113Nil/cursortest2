package com.google.android.gms.internal.gtm;

/* loaded from: classes9.dex */
public final class zzub extends zzuv<zzub, zzua> implements zzwl {
    private static final zzub zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private byte zzm = 2;
    private String zzk = "";
    private zzvh<zzuf> zzl = zzwu.zze();

    static {
        zzub zzubVar = new zzub();
        zze = zzubVar;
        zzuz.zzak(zzub.class, zzubVar);
    }

    private zzub() {
    }

    public static zzub zze() {
        return zze;
    }

    @Override // com.google.android.gms.internal.gtm.zzuz
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i12 == 2) {
            return new zzwv(zze, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzuf.class});
        }
        if (i12 == 3) {
            return new zzub();
        }
        zztq zztqVar = null;
        if (i12 == 4) {
            return new zzua(zztqVar);
        }
        if (i12 == 5) {
            return zze;
        }
        this.zzm = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
