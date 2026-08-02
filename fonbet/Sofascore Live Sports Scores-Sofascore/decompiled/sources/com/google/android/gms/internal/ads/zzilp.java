package com.google.android.gms.internal.ads;

import defpackage.kqo;
import defpackage.lkn;
import defpackage.lqo;
import defpackage.xqo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzilp extends zzifm implements zzigx {
    private static final zzilp zzQ;
    private static volatile zzihe zzR;
    private zzill zzA;
    private zzify zzB;
    private zzijw zzC;
    private String zzD;
    private zzijo zzE;
    private zzify zzF;
    private int zzG;
    private zzify zzH;
    private zzify zzI;
    private long zzJ;
    private zzilo zzK;
    private zzikp zzL;
    private String zzM;
    private zzili zzN;
    private zzify zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private zzijs zzg;
    private zzify zzh;
    private zzify zzi;
    private String zzj;
    private zzikv zzk;
    private boolean zzl;
    private zzify zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private zziei zzu;
    private zzilc zzv;
    private boolean zzw;
    private String zzx;
    private zzify zzy;
    private zzify zzz;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzilp zzilpVar = new zzilp();
        zzQ = zzilpVar;
        zzifm.y(zzilp.class, zzilpVar);
    }

    private zzilp() {
        kqo kqoVar = kqo.e;
        this.zzh = kqoVar;
        this.zzi = kqoVar;
        this.zzj = "";
        this.zzm = kqoVar;
        this.zzn = "";
        this.zzu = zziei.b;
        this.zzx = "";
        this.zzy = kqoVar;
        this.zzz = kqoVar;
        this.zzB = kqoVar;
        this.zzD = "";
        this.zzF = kqoVar;
        this.zzH = kqoVar;
        this.zzI = kqoVar;
        this.zzM = "";
        this.zzO = kqoVar;
    }

    public static zzijq G() {
        return (zzijq) zzQ.v();
    }

    public final String D() {
        return this.zzd;
    }

    public final List E() {
        return this.zzh;
    }

    public final String F() {
        return this.zzj;
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void I(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void J(zzijs zzijsVar) {
        this.zzg = zzijsVar;
        this.zza |= 32;
    }

    public final void K(zzila zzilaVar) {
        zzify zzifyVar = this.zzh;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzh = zzifyVar.g(size + size);
        }
        this.zzh.add(zzilaVar);
    }

    public final /* synthetic */ void L(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void M() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void N(zzikv zzikvVar) {
        this.zzk = zzikvVar;
        this.zza |= 128;
    }

    public final /* synthetic */ void O(zzilc zzilcVar) {
        this.zzv = zzilcVar;
        this.zza |= 8192;
    }

    public final void P(ArrayList arrayList) {
        zzify zzifyVar = this.zzy;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzy = zzifyVar.g(size + size);
        }
        zzidq.l(arrayList, this.zzy);
    }

    public final void Q(ArrayList arrayList) {
        zzify zzifyVar = this.zzz;
        if (!zzifyVar.zza()) {
            int size = zzifyVar.size();
            this.zzz = zzifyVar.g(size + size);
        }
        zzidq.l(arrayList, this.zzz);
    }

    public final /* synthetic */ void R(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        switch (zziflVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                this.zzP = zzifmVar == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new lqo(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", zzila.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", xqo.c, "zzc", lkn.A, "zzg", "zzj", "zzk", "zzu", "zzi", zzilt.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", zzilz.class, "zzC", "zzD", "zzE", "zzF", zzika.class, "zzG", xqo.g, "zzH", zzikn.class, "zzI", zziks.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", zzilf.class});
            case 3:
                return new zzilp();
            case 4:
                return new zzijq(zzQ);
            case 5:
                return zzQ;
            case 6:
                zzihe zziheVar2 = zzR;
                if (zziheVar2 != null) {
                    return zziheVar2;
                }
                synchronized (zzilp.class) {
                    try {
                        zziheVar = zzR;
                        if (zziheVar == null) {
                            zziheVar = new zzifh(zzQ);
                            zzR = zziheVar;
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
