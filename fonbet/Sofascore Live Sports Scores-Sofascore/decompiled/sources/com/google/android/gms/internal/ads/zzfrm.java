package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import defpackage.cqo;
import defpackage.lqo;
import defpackage.wpo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfrm extends zzifm implements zzigx {
    private static final zzfrm zzaL;
    private static volatile zzihe zzaM;
    private int zzC;
    private int zzE;
    private int zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private int zzX;
    private int zzY;
    private int zza;
    private zzfsr zzaA;
    private zzfsd zzaB;
    private zzfru zzaC;
    private zzfqr zzaD;
    private zzfqv zzaE;
    private int zzaF;
    private int zzaG;
    private boolean zzaH;
    private zzfsp zzaK;
    private int zzaa;
    private long zzak;
    private int zzam;
    private int zzan;
    private int zzao;
    private zzfsn zzap;
    private int zzaq;
    private zzfsj zzar;
    private zzfrs zzas;
    private zzfry zzat;
    private zzfrw zzau;
    private zzfsl zzav;
    private zzfsf zzaw;
    private zzfsb zzax;
    private zzija zzay;
    private int zzb;
    private int zzc;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzd = "";
    private zzifu zzh = wpo.e;
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzA = "";
    private String zzB = "";
    private String zzD = "";
    private String zzG = "";
    private zzifx zzH = cqo.e;
    private String zzR = "";
    private String zzS = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzZ = "";
    private String zzab = "";
    private String zzac = "";
    private String zzad = "";
    private String zzae = "";
    private String zzaf = "";
    private String zzag = "";
    private String zzah = "";
    private String zzai = "";
    private String zzaj = "";
    private String zzal = "";
    private String zzaz = "";
    private String zzaI = "";
    private String zzaJ = "";

    static {
        zzfrm zzfrmVar = new zzfrm();
        zzaL = zzfrmVar;
        zzifm.y(zzfrm.class, zzfrmVar);
    }

    private zzfrm() {
    }

    public static zzfrk F() {
        return (zzfrk) zzaL.v();
    }

    public final /* synthetic */ void D(int i) {
        if (i != 1) {
            this.zzI = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    public final /* synthetic */ void E(int i) {
        if (i != 1) {
            this.zzQ = i - 2;
        } else {
            zzifz.a();
            throw null;
        }
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzi = z;
    }

    public final /* synthetic */ void H(long j) {
        this.zzj = j;
    }

    public final /* synthetic */ void I(long j) {
        this.zzk = j;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zzu = str;
    }

    public final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzz = str;
    }

    public final /* synthetic */ void L(String str) {
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        this.zzB = str2;
    }

    public final /* synthetic */ void M(int i) {
        this.zzC = i;
    }

    public final void N(Iterable iterable) {
        zzifx zzifxVar = this.zzH;
        if (!zzifxVar.zza()) {
            int size = zzifxVar.size();
            this.zzH = zzifxVar.g(size + size);
        }
        zzidq.l(iterable, this.zzH);
    }

    public final /* synthetic */ void O(int i) {
        this.zzK = i;
    }

    public final /* synthetic */ void P(long j) {
        this.zzM = j;
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzR = str;
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzS = str;
    }

    public final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzae = str;
    }

    public final /* synthetic */ void U(String str) {
        this.zzaf = str;
    }

    public final /* synthetic */ void V(String str) {
        str.getClass();
        this.zzag = str;
    }

    public final /* synthetic */ void W(String str) {
        str.getClass();
        this.zzah = str;
    }

    public final /* synthetic */ void X(String str) {
        this.zzai = str;
    }

    public final /* synthetic */ void Y(String str) {
        str.getClass();
        this.zzaj = str;
    }

    public final /* synthetic */ void Z(zzfrl zzfrlVar) {
        this.zzaq = zzfrlVar.zza();
    }

    public final /* synthetic */ void a0(zzija zzijaVar) {
        this.zzay = zzijaVar;
        this.zza |= NotificationCompat.FLAG_LOCAL_ONLY;
    }

    public final /* synthetic */ void b0(String str) {
        this.zzaz = str;
    }

    public final /* synthetic */ void c0(int i) {
        this.zzb = i - 2;
    }

    public final /* synthetic */ void d0() {
        this.zzp = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzifm
    public final Object z(zzifl zziflVar, zzifm zzifmVar) {
        zzihe zziheVar;
        int ordinal = zziflVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return new lqo(zzaL, "\u0004T\u0000\u0001\u0001TT\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007Eဉ\nFȈGဉ\u000bH\u0004I\u0004J\u0004K\u0002L\u0002M\fN\fOဉ\fPဉ\rQ\u0007RȈSȈTဉ\u000e", new Object[]{"zza", "zzb", "zzi", "zzj", "zzp", "zzu", "zzz", "zzB", "zzC", "zzI", "zzK", "zzM", "zzQ", "zzR", "zzS", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzv", "zzx", "zzD", "zzG", "zzH", "zzT", "zzU", "zzac", "zzak", "zzd", "zze", "zzf", "zzg", "zzk", "zzn", "zzo", "zzh", "zzan", "zzao", "zzc", "zzar", "zzas", "zzX", "zzZ", "zzW", "zzV", "zzaq", "zzY", "zzaa", "zzab", "zzA", "zzat", "zzJ", "zzau", "zzal", "zzam", "zzap", "zzav", "zzaw", "zzad", "zzax", "zzay", "zzaz", "zzy", "zzaA", "zzN", "zzO", "zzP", "zzaB", "zzw", "zzaC", "zzL", "zzaF", "zzaG", "zzl", "zzm", "zzE", "zzF", "zzaD", "zzaE", "zzaH", "zzaI", "zzaJ", "zzaK"});
        }
        if (ordinal == 3) {
            return new zzfrm();
        }
        if (ordinal == 4) {
            return new zzfrk(zzaL);
        }
        if (ordinal == 5) {
            return zzaL;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzihe zziheVar2 = zzaM;
        if (zziheVar2 != null) {
            return zziheVar2;
        }
        synchronized (zzfrm.class) {
            try {
                zziheVar = zzaM;
                if (zziheVar == null) {
                    zziheVar = new zzifh(zzaL);
                    zzaM = zziheVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziheVar;
    }
}
