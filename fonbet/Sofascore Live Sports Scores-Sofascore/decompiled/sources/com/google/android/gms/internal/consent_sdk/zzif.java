package com.google.android.gms.internal.consent_sdk;

import defpackage.a5p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzif extends zzqm implements zzrr {
    private static final zzif zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        zzif zzifVar = new zzif();
        zzb = zzifVar;
        zzqm.m(zzif.class, zzifVar);
    }

    private zzif() {
    }

    public static zzid n() {
        return (zzid) zzb.h();
    }

    public static /* synthetic */ void o(zzif zzifVar, zzhc zzhcVar) {
        zzifVar.zzf = zzhcVar;
        zzifVar.zze = 38;
    }

    public static /* synthetic */ void p(zzif zzifVar, long j) {
        zzifVar.zzd |= 1;
        zzifVar.zzg = j;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    public final Object f(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new a5p(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", zzla.class, "zzg", zzlz.class, zziw.class, zzfa.class, zzkc.class, zzfo.class, zzic.class, zzfh.class, zzgg.class, zzjf.class, zzjo.class, zznp.class, zzlo.class, zzok.class, "zzh", zzoh.class, zzme.class, zzgr.class, zznb.class, zzmx.class, zzfr.class, zzoo.class, zznu.class, zzhc.class});
        }
        if (i2 == 3) {
            return new zzif();
        }
        if (i2 == 4) {
            return new zzid(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
