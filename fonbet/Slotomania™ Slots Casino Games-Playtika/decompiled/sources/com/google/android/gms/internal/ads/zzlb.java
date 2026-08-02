package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.C;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzlb extends zzf implements zzjp {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfb zzC;
    private final zzla zzD;
    private final zzjr zzE;
    private final zzjr zzF;
    private int zzG;
    private int zzH;
    private boolean zzI;
    private zznb zzJ;
    private zznc zzK;
    private zzjo zzL;
    private zzax zzM;
    private zzan zzN;
    private Object zzO;
    private Surface zzP;
    private int zzQ;
    private zzet zzR;
    private zzd zzS;
    private float zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private boolean zzY;
    private zzan zzZ;
    private zzmm zzaa;
    private int zzab;
    private long zzac;
    private zzyx zzad;
    final zzaba zzb;
    final zzax zzc;
    private final zzdr zze = new zzdr(zzdo.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzmu[] zzh;
    private final zzmu[] zzi;
    private final zzaaz zzj;
    private final zzdy zzk;
    private final zzlm zzl;
    private final zzlo zzm;
    private final zzee zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzng zzs;
    private final Looper zzt;
    private final zzabi zzu;
    private final zzdo zzv;
    private final zzjx zzw;
    private final zzkw zzx;
    private final zzfq zzy;
    private final zzfr zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzlb(zzjn zzjnVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfk.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 39 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.10.0-alpha01] [");
            sb.append(str);
            sb.append(X3.j.e);
            zzef.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjnVar.zza.getApplicationContext();
            this.zzs = (zzng) zzjnVar.zzh.apply(zzjnVar.zzb);
            this.zzX = zzjnVar.zzj;
            this.zzS = zzjnVar.zzk;
            this.zzQ = zzjnVar.zzl;
            this.zzU = false;
            this.zzA = zzjnVar.zzq;
            zzjx zzjxVar = new zzjx(this, null);
            this.zzw = zzjxVar;
            this.zzx = new zzkw(null);
            zzmu[] zza = ((zzmz) zzjnVar.zzc.zza()).zza(new Handler(zzjnVar.zzi), zzjxVar, zzjxVar, zzjxVar, zzjxVar);
            this.zzh = zza;
            int length = zza.length;
            this.zzi = new zzmu[2];
            int i = 0;
            while (true) {
                zzmu[] zzmuVarArr = this.zzi;
                int length2 = zzmuVarArr.length;
                if (i >= 2) {
                    break;
                }
                zzmu zzmuVar = this.zzh[i];
                zzmuVarArr[i] = null;
                i++;
            }
            zzaaz zzaazVar = (zzaaz) zzjnVar.zze.zza();
            this.zzj = zzaazVar;
            zzabi zzabiVar = (zzabi) zzjnVar.zzg.zza();
            this.zzu = zzabiVar;
            this.zzr = zzjnVar.zzm;
            this.zzK = zzjnVar.zzn;
            this.zzJ = zzjnVar.zzo;
            Looper looper = zzjnVar.zzi;
            this.zzt = looper;
            zzdo zzdoVar = zzjnVar.zzb;
            this.zzv = zzdoVar;
            this.zzg = zzbbVar;
            this.zzn = new zzee(looper, zzdoVar, new zzea() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // com.google.android.gms.internal.ads.zzea
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    zzlb.this.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzad = new zzyx(0);
            this.zzL = zzjo.zza;
            int length3 = this.zzh.length;
            zzaba zzabaVar = new zzaba(new zzmx[2], new zzaas[2], zzbn.zza, null);
            this.zzb = zzabaVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaazVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zze = zzawVar.zze();
            this.zzc = zze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzM = zzawVar2.zze();
            this.zzk = zzdoVar.zzd(looper, null);
            zzlm zzlmVar = new zzlm() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // com.google.android.gms.internal.ads.zzlm
                public final /* synthetic */ void zza(zzll zzllVar) {
                    zzlb.this.zzK(zzllVar);
                }
            };
            this.zzl = zzlmVar;
            this.zzaa = zzmm.zza(zzabaVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpz zzpzVar = new zzpz(zzjnVar.zzx);
            zzlo zzloVar = new zzlo(this.zzf, this.zzh, this.zzi, zzaazVar, zzabaVar, (zzls) zzjnVar.zzf.zza(), zzabiVar, 0, false, this.zzs, this.zzK, zzjnVar.zzz, zzjnVar.zzp, false, false, looper, zzdoVar, zzlmVar, zzpzVar, null, this.zzL, this.zzx, zzjnVar.zzy);
            this.zzm = zzloVar;
            Looper zzn = zzloVar.zzn();
            this.zzT = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzN = zzanVar;
            this.zzZ = zzanVar;
            this.zzab = -1;
            int i2 = zzcz.zza;
            this.zzV = true;
            zze(this.zzs);
            zzabiVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context = this.zzf;
                final boolean z = zzjnVar.zzv;
                zzdoVar.zzd(zzloVar.zzn(), null).zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpv zza2 = zzpv.zza(context);
                        if (zza2 == null) {
                            zzef.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.zzD(zza2);
                        }
                        zzpzVar.zzb(zza2.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, zzn, looper, zzdoVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int intValue = ((Integer) obj2).intValue();
                    zzlb.this.zzL(((Integer) obj).intValue(), intValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzko
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzlb.this.zzM();
                }
            });
            new zzbz(zzjnVar.zza, zzn, zzjnVar.zzi, this.zzw, zzdoVar);
            boolean z2 = (zzjnVar.zzs == Integer.MAX_VALUE || zzjnVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfq zzfqVar = new zzfq(zzjnVar.zza, zzn, zzdoVar);
            this.zzy = zzfqVar;
            zzfqVar.zza(z2);
            this.zzz = new zzfr(zzjnVar.zza, zzn, zzdoVar);
            int i3 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzR = zzet.zza;
            this.zzD = Build.VERSION.SDK_INT >= 34 ? new zzla(this, zzjnVar.zza, null) : null;
            this.zzE = new zzjr(this, 1, null);
            this.zzF = new zzjr(this, 2, null);
            this.zzC = new zzfb(this, this.zzw, zzdoVar, zzjnVar.zzr, zzjnVar.zzs, zzjnVar.zzt, zzjnVar.zzu);
            zzloVar.zzg(this.zzJ);
            zzloVar.zzi(this.zzS, false);
            zzau(1, 3, this.zzS);
            zzau(2, 4, Integer.valueOf(this.zzQ));
            zzau(2, 5, 0);
            zzau(1, 9, Boolean.valueOf(this.zzU));
            zzau(6, 8, this.zzx);
            zzau(-1, 16, Integer.valueOf(this.zzX));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzje zzjeVar) {
        zzmm zzmmVar = this.zzaa;
        zzmm zzh = zzmmVar.zzh(zzmmVar.zzb);
        zzh.zzq = zzh.zzs;
        zzh.zzr = 0L;
        zzmm zzam = zzam(zzh, 1);
        if (zzjeVar != null) {
            zzam = zzam.zzf(zzjeVar);
        }
        this.zzG++;
        this.zzm.zzh();
        zzaj(zzam, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    private final int zzag(zzmm zzmmVar) {
        zzbf zzbfVar = zzmmVar.zza;
        return zzbfVar.zzg() ? this.zzab : zzbfVar.zzo(zzmmVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzah(zzmm zzmmVar) {
        zzxc zzxcVar = zzmmVar.zzb;
        if (!zzxcVar.zzb()) {
            return zzfk.zzr(zzai(zzmmVar));
        }
        zzbf zzbfVar = zzmmVar.zza;
        zzbfVar.zzo(zzxcVar.zza, this.zzp);
        long j = zzmmVar.zzc;
        if (j != C.TIME_UNSET) {
            return zzfk.zzr(0L) + zzfk.zzr(j);
        }
        long j2 = zzbfVar.zzb(zzag(zzmmVar), this.zza, 0L).zzl;
        return zzfk.zzr(0L);
    }

    private final long zzai(zzmm zzmmVar) {
        zzbf zzbfVar = zzmmVar.zza;
        if (zzbfVar.zzg()) {
            return zzfk.zzs(this.zzac);
        }
        boolean z = zzmmVar.zzp;
        long j = zzmmVar.zzs;
        zzxc zzxcVar = zzmmVar.zzb;
        if (zzxcVar.zzb()) {
            return j;
        }
        zzao(zzbfVar, zzxcVar, j);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x046e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ea  */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaj(final zzmm zzmmVar, final int i, boolean z, int i2, long j, int i3, boolean z2) {
        int i4;
        zzmm zzmmVar2;
        zzbf zzbfVar;
        final int i5;
        boolean z3;
        Pair pair;
        boolean z4;
        boolean z5;
        int i6;
        boolean booleanValue;
        final zzak zzakVar;
        List list;
        int i7;
        zzbf zzq;
        zzan zzw;
        int i8;
        int i9;
        int i10;
        boolean z6;
        zzje zzjeVar;
        zzje zzjeVar2;
        zzaba zzabaVar;
        zzaba zzabaVar2;
        zzf zzfVar;
        zzbf zzq2;
        zzax zzaxVar;
        boolean z7;
        zzbf zzq3;
        ?? r15;
        int i11;
        boolean z8;
        zzbf zzq4;
        boolean z9;
        zzbf zzq5;
        zzbb zzbbVar;
        long j2;
        boolean z10;
        boolean zzg;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        zzax zze;
        int i15;
        int i16;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        long j3;
        long zzak;
        int i17;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        int i18 = i2;
        zzmm zzmmVar3 = this.zzaa;
        this.zzaa = zzmmVar;
        zzbf zzbfVar2 = zzmmVar3.zza;
        zzbf zzbfVar3 = zzmmVar.zza;
        boolean equals = zzbfVar2.equals(zzbfVar3);
        if (zzbfVar3.zzg() && zzbfVar2.zzg()) {
            pair = new Pair(false, -1);
        } else {
            if (zzbfVar3.zzg() == zzbfVar2.zzg()) {
                zzxc zzxcVar = zzmmVar3.zzb;
                Object obj5 = zzxcVar.zza;
                i4 = 0;
                zzbd zzbdVar = this.zzp;
                int i19 = zzbfVar2.zzo(obj5, zzbdVar).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = zzbfVar2.zzb(i19, zzbeVar, 0L).zzb;
                zzxc zzxcVar2 = zzmmVar.zzb;
                zzmmVar2 = zzmmVar3;
                zzbfVar = zzbfVar2;
                if (obj6.equals(zzbfVar3.zzb(zzbfVar3.zzo(zzxcVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb)) {
                    if (z) {
                        if (i18 != 0) {
                            i5 = i18;
                        } else if (zzxcVar.zzd < zzxcVar2.zzd) {
                            pair = new Pair(true, 0);
                            i5 = 0;
                            z3 = true;
                        } else {
                            i5 = 0;
                        }
                        z3 = true;
                    } else {
                        i5 = i18;
                        z3 = false;
                    }
                    pair = new Pair(false, -1);
                } else {
                    if (!z) {
                        z4 = false;
                        z5 = false;
                    } else if (i18 == 0) {
                        i18 = 0;
                        i6 = 1;
                        z5 = true;
                        pair = new Pair(true, Integer.valueOf(i6));
                        i5 = i18;
                        z3 = z5;
                    } else {
                        z4 = true;
                        z5 = true;
                    }
                    if (z4 && i18 == 1) {
                        i6 = 2;
                    } else {
                        if (equals) {
                            throw new IllegalStateException();
                        }
                        i6 = 3;
                    }
                    pair = new Pair(true, Integer.valueOf(i6));
                    i5 = i18;
                    z3 = z5;
                }
                booleanValue = ((Boolean) pair.first).booleanValue();
                final int intValue = ((Integer) pair.second).intValue();
                if (booleanValue) {
                    zzakVar = null;
                } else {
                    zzakVar = !zzbfVar3.zzg() ? zzbfVar3.zzb(zzbfVar3.zzo(zzmmVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd : null;
                    this.zzZ = zzan.zza;
                }
                if (!booleanValue || !zzmmVar2.zzj.equals(zzmmVar.zzj)) {
                    zzam zza = this.zzZ.zza();
                    list = zzmmVar.zzj;
                    for (i7 = i4; i7 < list.size(); i7++) {
                        zzap zzapVar = (zzap) list.get(i7);
                        for (int i20 = i4; i20 < zzapVar.zza(); i20++) {
                            zzapVar.zzb(i20).zza(zza);
                        }
                    }
                    this.zzZ = zza.zzw();
                }
                zzq = zzq();
                if (zzq.zzg()) {
                    zzak zzakVar4 = zzq.zzb(zzs(), this.zza, 0L).zzd;
                    zzam zza2 = this.zzZ.zza();
                    zza2.zzv(zzakVar4.zzd);
                    zzw = zza2.zzw();
                } else {
                    zzw = this.zzZ;
                }
                boolean equals2 = zzw.equals(this.zzN);
                this.zzN = zzw;
                int i21 = zzmmVar2.zzl == zzmmVar.zzl ? 1 : i4;
                i8 = zzmmVar2.zze == zzmmVar.zze ? 1 : i4;
                if (i8 == 0 || i21 != 0) {
                    zzas();
                }
                i9 = zzmmVar2.zzg == zzmmVar.zzg ? 1 : i4;
                if (!equals) {
                    this.zzn.zze(i4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkr
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj7) {
                            int i22 = zzlb.zzd;
                            ((zzaz) obj7).zzb(zzmm.this.zza, i);
                        }
                    });
                }
                if (z3) {
                    i10 = i21;
                    z6 = equals2;
                } else {
                    zzbd zzbdVar2 = new zzbd();
                    if (zzbfVar.zzg()) {
                        i10 = i21;
                        z6 = equals2;
                        i15 = i3;
                        i16 = i15;
                        obj = null;
                        zzakVar2 = null;
                        obj2 = null;
                    } else {
                        Object obj7 = zzmmVar2.zzb.zza;
                        zzbf zzbfVar4 = zzbfVar;
                        zzbfVar4.zzo(obj7, zzbdVar2);
                        int i22 = zzbdVar2.zzc;
                        int zze2 = zzbfVar4.zze(obj7);
                        zzbe zzbeVar2 = this.zza;
                        i10 = i21;
                        z6 = equals2;
                        Object obj8 = zzbfVar4.zzb(i22, zzbeVar2, 0L).zzb;
                        zzakVar2 = zzbeVar2.zzd;
                        i15 = i22;
                        obj = obj8;
                        obj2 = obj7;
                        i16 = zze2;
                    }
                    if (i5 == 0) {
                        zzxc zzxcVar3 = zzmmVar2.zzb;
                        if (zzxcVar3.zzb()) {
                            j3 = zzbdVar2.zzh(zzxcVar3.zzb, zzxcVar3.zzc);
                            zzak = zzak(zzmmVar2);
                            String str = zzfk.zza;
                            zzxc zzxcVar4 = zzmmVar2.zzb;
                            final zzba zzbaVar = new zzba(obj, i15, zzakVar2, obj2, i16, zzfk.zzr(j3), zzfk.zzr(zzak), zzxcVar4.zzb, zzxcVar4.zzc);
                            int zzs = zzs();
                            int zzr = zzr();
                            if (this.zzaa.zza.zzg()) {
                                zzmm zzmmVar4 = this.zzaa;
                                Object obj9 = zzmmVar4.zzb.zza;
                                zzmmVar4.zza.zzo(obj9, this.zzp);
                                int zze3 = this.zzaa.zza.zze(obj9);
                                zzbf zzbfVar5 = this.zzaa.zza;
                                zzbe zzbeVar3 = this.zza;
                                i17 = zze3;
                                obj3 = zzbfVar5.zzb(zzs, zzbeVar3, 0L).zzb;
                                zzakVar3 = zzbeVar3.zzd;
                                obj4 = obj9;
                            } else {
                                i17 = zzr;
                                obj3 = null;
                                zzakVar3 = null;
                                obj4 = null;
                            }
                            long zzr2 = zzfk.zzr(j);
                            long zzr3 = !this.zzaa.zzb.zzb() ? zzfk.zzr(zzak(this.zzaa)) : zzr2;
                            zzxc zzxcVar5 = this.zzaa.zzb;
                            final zzba zzbaVar2 = new zzba(obj3, zzs, zzakVar3, obj4, i17, zzr2, zzr3, zzxcVar5.zzb, zzxcVar5.zzc);
                            this.zzn.zze(11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzks
                                @Override // com.google.android.gms.internal.ads.zzdz
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i23 = zzlb.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i5);
                                }
                            });
                        } else {
                            j3 = zzxcVar3.zze != -1 ? zzak(this.zzaa) : zzbdVar2.zzd;
                            zzak = j3;
                            String str2 = zzfk.zza;
                            zzxc zzxcVar42 = zzmmVar2.zzb;
                            final zzba zzbaVar3 = new zzba(obj, i15, zzakVar2, obj2, i16, zzfk.zzr(j3), zzfk.zzr(zzak), zzxcVar42.zzb, zzxcVar42.zzc);
                            int zzs2 = zzs();
                            int zzr4 = zzr();
                            if (this.zzaa.zza.zzg()) {
                            }
                            long zzr22 = zzfk.zzr(j);
                            if (!this.zzaa.zzb.zzb()) {
                            }
                            zzxc zzxcVar52 = this.zzaa.zzb;
                            final zzba zzbaVar22 = new zzba(obj3, zzs2, zzakVar3, obj4, i17, zzr22, zzr3, zzxcVar52.zzb, zzxcVar52.zzc);
                            this.zzn.zze(11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzks
                                @Override // com.google.android.gms.internal.ads.zzdz
                                public final /* synthetic */ void zza(Object obj10) {
                                    int i23 = zzlb.zzd;
                                    ((zzaz) obj10).zzo(zzbaVar3, zzbaVar22, i5);
                                }
                            });
                        }
                    } else if (zzmmVar2.zzb.zzb()) {
                        j3 = zzmmVar2.zzs;
                        zzak = zzak(zzmmVar2);
                        String str22 = zzfk.zza;
                        zzxc zzxcVar422 = zzmmVar2.zzb;
                        final zzba zzbaVar32 = new zzba(obj, i15, zzakVar2, obj2, i16, zzfk.zzr(j3), zzfk.zzr(zzak), zzxcVar422.zzb, zzxcVar422.zzc);
                        int zzs22 = zzs();
                        int zzr42 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzr222 = zzfk.zzr(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzxc zzxcVar522 = this.zzaa.zzb;
                        final zzba zzbaVar222 = new zzba(obj3, zzs22, zzakVar3, obj4, i17, zzr222, zzr3, zzxcVar522.zzb, zzxcVar522.zzc);
                        this.zzn.zze(11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzks
                            @Override // com.google.android.gms.internal.ads.zzdz
                            public final /* synthetic */ void zza(Object obj10) {
                                int i23 = zzlb.zzd;
                                ((zzaz) obj10).zzo(zzbaVar32, zzbaVar222, i5);
                            }
                        });
                    } else {
                        j3 = zzmmVar2.zzs;
                        zzak = j3;
                        String str222 = zzfk.zza;
                        zzxc zzxcVar4222 = zzmmVar2.zzb;
                        final zzba zzbaVar322 = new zzba(obj, i15, zzakVar2, obj2, i16, zzfk.zzr(j3), zzfk.zzr(zzak), zzxcVar4222.zzb, zzxcVar4222.zzc);
                        int zzs222 = zzs();
                        int zzr422 = zzr();
                        if (this.zzaa.zza.zzg()) {
                        }
                        long zzr2222 = zzfk.zzr(j);
                        if (!this.zzaa.zzb.zzb()) {
                        }
                        zzxc zzxcVar5222 = this.zzaa.zzb;
                        final zzba zzbaVar2222 = new zzba(obj3, zzs222, zzakVar3, obj4, i17, zzr2222, zzr3, zzxcVar5222.zzb, zzxcVar5222.zzc);
                        this.zzn.zze(11, new zzdz() { // from class: com.google.android.gms.internal.ads.zzks
                            @Override // com.google.android.gms.internal.ads.zzdz
                            public final /* synthetic */ void zza(Object obj10) {
                                int i23 = zzlb.zzd;
                                ((zzaz) obj10).zzo(zzbaVar322, zzbaVar2222, i5);
                            }
                        });
                    }
                }
                if (!booleanValue) {
                    this.zzn.zze(1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkt
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzc(zzak.this, intValue);
                        }
                    });
                }
                zzjeVar = zzmmVar2.zzf;
                zzjeVar2 = zzmmVar.zzf;
                if (zzjeVar != zzjeVar2) {
                    zzee zzeeVar = this.zzn;
                    zzeeVar.zze(10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzku
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzn(zzmm.this.zzf);
                        }
                    });
                    if (zzjeVar2 != null) {
                        zzeeVar.zze(10, new zzdz() { // from class: com.google.android.gms.internal.ads.zzjz
                            @Override // com.google.android.gms.internal.ads.zzdz
                            public final /* synthetic */ void zza(Object obj10) {
                                int i23 = zzlb.zzd;
                                ((zzaz) obj10).zzm(zzmm.this.zzf);
                            }
                        });
                    }
                }
                zzabaVar = zzmmVar2.zzi;
                zzabaVar2 = zzmmVar.zzi;
                if (zzabaVar != zzabaVar2) {
                    this.zzj.zzq(zzabaVar2.zze);
                    this.zzn.zze(2, new zzdz() { // from class: com.google.android.gms.internal.ads.zzka
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzd(zzmm.this.zzi.zzd);
                        }
                    });
                }
                if (!z6) {
                    final zzan zzanVar = this.zzN;
                    this.zzn.zze(14, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkb
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zze(zzan.this);
                        }
                    });
                }
                if (i9 != 0) {
                    this.zzn.zze(3, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkc
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzf(zzmm.this.zzg);
                        }
                    });
                }
                if (i8 == 0 || i10 != 0) {
                    this.zzn.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkd
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            zzmm zzmmVar5 = zzmm.this;
                            ((zzaz) obj10).zzh(zzmmVar5.zzl, zzmmVar5.zze);
                        }
                    });
                }
                if (i8 != 0) {
                    this.zzn.zze(4, new zzdz() { // from class: com.google.android.gms.internal.ads.zzke
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzi(zzmm.this.zze);
                        }
                    });
                }
                if (i10 == 0 || zzmmVar2.zzm != zzmmVar.zzm) {
                    this.zzn.zze(5, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkf
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            zzmm zzmmVar5 = zzmm.this;
                            ((zzaz) obj10).zzj(zzmmVar5.zzl, zzmmVar5.zzm);
                        }
                    });
                }
                if (zzmmVar2.zzn != zzmmVar.zzn) {
                    this.zzn.zze(6, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkg
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzk(zzmm.this.zzn);
                        }
                    });
                }
                if (zzmmVar2.zzj() != zzmmVar.zzj()) {
                    this.zzn.zze(7, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkh
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzl(zzmm.this.zzj());
                        }
                    });
                }
                if (!zzmmVar2.zzo.equals(zzmmVar.zzo)) {
                    this.zzn.zze(12, new zzdz() { // from class: com.google.android.gms.internal.ads.zzki
                        @Override // com.google.android.gms.internal.ads.zzdz
                        public final /* synthetic */ void zza(Object obj10) {
                            int i23 = zzlb.zzd;
                            ((zzaz) obj10).zzp(zzmm.this.zzo);
                        }
                    });
                }
                zzax zzaxVar2 = this.zzM;
                zzbb zzbbVar2 = this.zzg;
                zzax zzaxVar3 = this.zzc;
                String str3 = zzfk.zza;
                boolean zzx = zzbbVar2.zzx();
                zzfVar = (zzf) zzbbVar2;
                zzq2 = zzfVar.zzq();
                if (zzq2.zzg()) {
                    zzaxVar = zzaxVar2;
                    if (zzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
                        z7 = true;
                        zzq3 = zzfVar.zzq();
                        if (zzq3.zzg()) {
                            i11 = -1;
                            r15 = 0;
                            z8 = false;
                        } else {
                            int zzs3 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            r15 = 0;
                            r15 = 0;
                            int zzi = zzq3.zzi(zzs3, 0, false);
                            i11 = -1;
                            z8 = zzi != -1;
                        }
                        zzq4 = zzfVar.zzq();
                        if (!zzq4.zzg()) {
                            int zzs4 = zzfVar.zzs();
                            zzfVar.zzl();
                            zzfVar.zzm();
                            if (zzq4.zzh(zzs4, r15, r15) != i11) {
                                z9 = true;
                                zzq5 = zzfVar.zzq();
                                if (zzq5.zzg()) {
                                    zzbbVar = zzbbVar2;
                                    j2 = 0;
                                    if (zzq5.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                                        z10 = true;
                                        zzbf zzq6 = zzfVar.zzq();
                                        boolean z14 = zzq6.zzg() && zzq6.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi;
                                        zzg = zzbbVar.zzq().zzg();
                                        zzaw zzawVar = new zzaw();
                                        zzawVar.zzd(zzaxVar3);
                                        boolean z15 = !zzx;
                                        zzawVar.zzb(4, z15);
                                        zzawVar.zzb(5, (z7 || zzx) ? false : true);
                                        zzawVar.zzb(6, (z8 || zzx) ? false : true);
                                        if (!zzg || (!(z8 || !z10 || z7) || zzx)) {
                                            i12 = 7;
                                            z11 = false;
                                        } else {
                                            i12 = 7;
                                            z11 = true;
                                        }
                                        zzawVar.zzb(i12, z11);
                                        zzawVar.zzb(8, (z9 || zzx) ? false : true);
                                        zzawVar.zzb(9, zzg && (z9 || (z10 && z14)) && !zzx);
                                        zzawVar.zzb(10, z15);
                                        if (z7 || zzx) {
                                            i13 = 11;
                                            z12 = false;
                                        } else {
                                            i13 = 11;
                                            z12 = true;
                                        }
                                        zzawVar.zzb(i13, z12);
                                        if (z7 || zzx) {
                                            i14 = 12;
                                            z13 = false;
                                        } else {
                                            i14 = 12;
                                            z13 = true;
                                        }
                                        zzawVar.zzb(i14, z13);
                                        zze = zzawVar.zze();
                                        this.zzM = zze;
                                        if (!zze.equals(zzaxVar)) {
                                            this.zzn.zze(13, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkk
                                                @Override // com.google.android.gms.internal.ads.zzdz
                                                public final /* synthetic */ void zza(Object obj10) {
                                                    zzlb.this.zzN((zzaz) obj10);
                                                }
                                            });
                                        }
                                        this.zzn.zzf();
                                        boolean z16 = zzmmVar2.zzp;
                                        boolean z17 = zzmmVar.zzp;
                                    }
                                } else {
                                    zzbbVar = zzbbVar2;
                                    j2 = 0;
                                }
                                z10 = false;
                                zzbf zzq62 = zzfVar.zzq();
                                if (zzq62.zzg()) {
                                }
                                zzg = zzbbVar.zzq().zzg();
                                zzaw zzawVar2 = new zzaw();
                                zzawVar2.zzd(zzaxVar3);
                                boolean z152 = !zzx;
                                zzawVar2.zzb(4, z152);
                                zzawVar2.zzb(5, (z7 || zzx) ? false : true);
                                zzawVar2.zzb(6, (z8 || zzx) ? false : true);
                                if (zzg) {
                                }
                                i12 = 7;
                                z11 = false;
                                zzawVar2.zzb(i12, z11);
                                zzawVar2.zzb(8, (z9 || zzx) ? false : true);
                                zzawVar2.zzb(9, zzg && (z9 || (z10 && z14)) && !zzx);
                                zzawVar2.zzb(10, z152);
                                if (z7) {
                                }
                                i13 = 11;
                                z12 = false;
                                zzawVar2.zzb(i13, z12);
                                if (z7) {
                                }
                                i14 = 12;
                                z13 = false;
                                zzawVar2.zzb(i14, z13);
                                zze = zzawVar2.zze();
                                this.zzM = zze;
                                if (!zze.equals(zzaxVar)) {
                                }
                                this.zzn.zzf();
                                boolean z162 = zzmmVar2.zzp;
                                boolean z172 = zzmmVar.zzp;
                            }
                        }
                        z9 = r15;
                        zzq5 = zzfVar.zzq();
                        if (zzq5.zzg()) {
                        }
                        z10 = false;
                        zzbf zzq622 = zzfVar.zzq();
                        if (zzq622.zzg()) {
                        }
                        zzg = zzbbVar.zzq().zzg();
                        zzaw zzawVar22 = new zzaw();
                        zzawVar22.zzd(zzaxVar3);
                        boolean z1522 = !zzx;
                        zzawVar22.zzb(4, z1522);
                        zzawVar22.zzb(5, (z7 || zzx) ? false : true);
                        zzawVar22.zzb(6, (z8 || zzx) ? false : true);
                        if (zzg) {
                        }
                        i12 = 7;
                        z11 = false;
                        zzawVar22.zzb(i12, z11);
                        zzawVar22.zzb(8, (z9 || zzx) ? false : true);
                        zzawVar22.zzb(9, zzg && (z9 || (z10 && z14)) && !zzx);
                        zzawVar22.zzb(10, z1522);
                        if (z7) {
                        }
                        i13 = 11;
                        z12 = false;
                        zzawVar22.zzb(i13, z12);
                        if (z7) {
                        }
                        i14 = 12;
                        z13 = false;
                        zzawVar22.zzb(i14, z13);
                        zze = zzawVar22.zze();
                        this.zzM = zze;
                        if (!zze.equals(zzaxVar)) {
                        }
                        this.zzn.zzf();
                        boolean z1622 = zzmmVar2.zzp;
                        boolean z1722 = zzmmVar.zzp;
                    }
                } else {
                    zzaxVar = zzaxVar2;
                }
                z7 = false;
                zzq3 = zzfVar.zzq();
                if (zzq3.zzg()) {
                }
                zzq4 = zzfVar.zzq();
                if (!zzq4.zzg()) {
                }
                z9 = r15;
                zzq5 = zzfVar.zzq();
                if (zzq5.zzg()) {
                }
                z10 = false;
                zzbf zzq6222 = zzfVar.zzq();
                if (zzq6222.zzg()) {
                }
                zzg = zzbbVar.zzq().zzg();
                zzaw zzawVar222 = new zzaw();
                zzawVar222.zzd(zzaxVar3);
                boolean z15222 = !zzx;
                zzawVar222.zzb(4, z15222);
                zzawVar222.zzb(5, (z7 || zzx) ? false : true);
                zzawVar222.zzb(6, (z8 || zzx) ? false : true);
                if (zzg) {
                }
                i12 = 7;
                z11 = false;
                zzawVar222.zzb(i12, z11);
                zzawVar222.zzb(8, (z9 || zzx) ? false : true);
                zzawVar222.zzb(9, zzg && (z9 || (z10 && z14)) && !zzx);
                zzawVar222.zzb(10, z15222);
                if (z7) {
                }
                i13 = 11;
                z12 = false;
                zzawVar222.zzb(i13, z12);
                if (z7) {
                }
                i14 = 12;
                z13 = false;
                zzawVar222.zzb(i14, z13);
                zze = zzawVar222.zze();
                this.zzM = zze;
                if (!zze.equals(zzaxVar)) {
                }
                this.zzn.zzf();
                boolean z16222 = zzmmVar2.zzp;
                boolean z17222 = zzmmVar.zzp;
            }
            pair = new Pair(true, 3);
        }
        zzmmVar2 = zzmmVar3;
        zzbfVar = zzbfVar2;
        i4 = 0;
        i5 = i18;
        z3 = z;
        booleanValue = ((Boolean) pair.first).booleanValue();
        final int intValue2 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        if (!booleanValue) {
        }
        zzam zza3 = this.zzZ.zza();
        list = zzmmVar.zzj;
        while (i7 < list.size()) {
        }
        this.zzZ = zza3.zzw();
        zzq = zzq();
        if (zzq.zzg()) {
        }
        boolean equals22 = zzw.equals(this.zzN);
        this.zzN = zzw;
        if (zzmmVar2.zzl == zzmmVar.zzl) {
        }
        if (zzmmVar2.zze == zzmmVar.zze) {
        }
        if (i8 == 0) {
        }
        zzas();
        if (zzmmVar2.zzg == zzmmVar.zzg) {
        }
        if (!equals) {
        }
        if (z3) {
        }
        if (!booleanValue) {
        }
        zzjeVar = zzmmVar2.zzf;
        zzjeVar2 = zzmmVar.zzf;
        if (zzjeVar != zzjeVar2) {
        }
        zzabaVar = zzmmVar2.zzi;
        zzabaVar2 = zzmmVar.zzi;
        if (zzabaVar != zzabaVar2) {
        }
        if (!z6) {
        }
        if (i9 != 0) {
        }
        if (i8 == 0) {
        }
        this.zzn.zze(-1, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkd
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj10) {
                int i23 = zzlb.zzd;
                zzmm zzmmVar5 = zzmm.this;
                ((zzaz) obj10).zzh(zzmmVar5.zzl, zzmmVar5.zze);
            }
        });
        if (i8 != 0) {
        }
        if (i10 == 0) {
        }
        this.zzn.zze(5, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkf
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj10) {
                int i23 = zzlb.zzd;
                zzmm zzmmVar5 = zzmm.this;
                ((zzaz) obj10).zzj(zzmmVar5.zzl, zzmmVar5.zzm);
            }
        });
        if (zzmmVar2.zzn != zzmmVar.zzn) {
        }
        if (zzmmVar2.zzj() != zzmmVar.zzj()) {
        }
        if (!zzmmVar2.zzo.equals(zzmmVar.zzo)) {
        }
        zzax zzaxVar22 = this.zzM;
        zzbb zzbbVar22 = this.zzg;
        zzax zzaxVar32 = this.zzc;
        String str32 = zzfk.zza;
        boolean zzx2 = zzbbVar22.zzx();
        zzfVar = (zzf) zzbbVar22;
        zzq2 = zzfVar.zzq();
        if (zzq2.zzg()) {
        }
        z7 = false;
        zzq3 = zzfVar.zzq();
        if (zzq3.zzg()) {
        }
        zzq4 = zzfVar.zzq();
        if (!zzq4.zzg()) {
        }
        z9 = r15;
        zzq5 = zzfVar.zzq();
        if (zzq5.zzg()) {
        }
        z10 = false;
        zzbf zzq62222 = zzfVar.zzq();
        if (zzq62222.zzg()) {
        }
        zzg = zzbbVar.zzq().zzg();
        zzaw zzawVar2222 = new zzaw();
        zzawVar2222.zzd(zzaxVar32);
        boolean z152222 = !zzx2;
        zzawVar2222.zzb(4, z152222);
        zzawVar2222.zzb(5, (z7 || zzx2) ? false : true);
        zzawVar2222.zzb(6, (z8 || zzx2) ? false : true);
        if (zzg) {
        }
        i12 = 7;
        z11 = false;
        zzawVar2222.zzb(i12, z11);
        zzawVar2222.zzb(8, (z9 || zzx2) ? false : true);
        zzawVar2222.zzb(9, zzg && (z9 || (z10 && z14)) && !zzx2);
        zzawVar2222.zzb(10, z152222);
        if (z7) {
        }
        i13 = 11;
        z12 = false;
        zzawVar2222.zzb(i13, z12);
        if (z7) {
        }
        i14 = 12;
        z13 = false;
        zzawVar2222.zzb(i14, z13);
        zze = zzawVar2222.zze();
        this.zzM = zze;
        if (!zze.equals(zzaxVar)) {
        }
        this.zzn.zzf();
        boolean z162222 = zzmmVar2.zzp;
        boolean z172222 = zzmmVar.zzp;
    }

    private static long zzak(zzmm zzmmVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmmVar.zza;
        zzbfVar.zzo(zzmmVar.zzb.zza, zzbdVar);
        long j = zzmmVar.zzc;
        if (j != C.TIME_UNSET) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final zzmm zzal(zzmm zzmmVar, zzbf zzbfVar, Pair pair) {
        boolean z;
        zzgsw.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmmVar.zza;
        long zzah = zzah(zzmmVar);
        zzmm zzd2 = zzmmVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzxc zzb = zzmm.zzb();
            long zzs = zzfk.zzs(this.zzac);
            zzmm zzh = zzd2.zzc(zzb, zzs, zzs, zzs, 0L, zzzf.zza, this.zzb, zzgvz.zzi()).zzh(zzb);
            zzh.zzq = zzh.zzs;
            return zzh;
        }
        zzxc zzxcVar = zzd2.zzb;
        Object obj = zzxcVar.zza;
        String str = zzfk.zza;
        boolean equals = obj.equals(pair.first);
        zzxc zzxcVar2 = !equals ? new zzxc(pair.first, -1L) : zzxcVar;
        long longValue = ((Long) pair.second).longValue();
        long zzs2 = zzfk.zzs(zzah);
        if (!zzbfVar2.zzg()) {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (equals && zzs2 - longValue == 1) {
                zzbd zzo = zzbfVar2.zzo(obj, zzbdVar);
                z = true;
                if (zzs2 == zzo.zzd) {
                    zzs2--;
                }
                if (equals || longValue < zzs2) {
                    zzgsw.zzi(zzxcVar2.zzb() ^ z);
                    zzxc zzxcVar3 = zzxcVar2;
                    zzmm zzh2 = zzd2.zzc(zzxcVar3, longValue, longValue, longValue, 0L, equals ? zzzf.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzgvz.zzi() : zzd2.zzj).zzh(zzxcVar3);
                    zzh2.zzq = longValue;
                    return zzh2;
                }
                if (longValue != zzs2) {
                    zzgsw.zzi(zzxcVar2.zzb() ^ z);
                    long max = Math.max(0L, zzd2.zzr - (longValue - zzs2));
                    long j = zzd2.zzq;
                    if (zzd2.zzk.equals(zzxcVar)) {
                        j = longValue + max;
                    }
                    zzmm zzc = zzd2.zzc(zzxcVar2, longValue, longValue, longValue, max, zzd2.zzh, zzd2.zzi, zzd2.zzj);
                    zzc.zzq = j;
                    return zzc;
                }
                int zze = zzbfVar.zze(zzd2.zzk.zza);
                if (zze != -1) {
                    zzbd zzbdVar2 = this.zzp;
                    if (zzbfVar.zzd(zze, zzbdVar2, false).zzc == zzbfVar.zzo(zzxcVar2.zza, zzbdVar2).zzc) {
                        return zzd2;
                    }
                }
                Object obj2 = zzxcVar2.zza;
                zzbd zzbdVar3 = this.zzp;
                zzbfVar.zzo(obj2, zzbdVar3);
                long zzh3 = zzxcVar2.zzb() ? zzbdVar3.zzh(zzxcVar2.zzb, zzxcVar2.zzc) : zzbdVar3.zzd;
                zzxc zzxcVar4 = zzxcVar2;
                zzmm zzh4 = zzd2.zzc(zzxcVar4, zzd2.zzs, zzd2.zzs, zzd2.zzd, zzh3 - zzd2.zzs, zzd2.zzh, zzd2.zzi, zzd2.zzj).zzh(zzxcVar4);
                zzh4.zzq = zzh3;
                return zzh4;
            }
        }
        z = true;
        if (equals) {
        }
        zzgsw.zzi(zzxcVar2.zzb() ^ z);
        zzxc zzxcVar32 = zzxcVar2;
        zzmm zzh22 = zzd2.zzc(zzxcVar32, longValue, longValue, longValue, 0L, equals ? zzzf.zza : zzd2.zzh, equals ? this.zzb : zzd2.zzi, equals ? zzgvz.zzi() : zzd2.zzj).zzh(zzxcVar32);
        zzh22.zzq = longValue;
        return zzh22;
    }

    private static zzmm zzam(zzmm zzmmVar, int i) {
        zzmm zze = zzmmVar.zze(i);
        return (i == 1 || i == 4) ? zze.zzg(false) : zze;
    }

    private final Pair zzan(zzbf zzbfVar, int i, long j) {
        if (zzbfVar.zzg()) {
            this.zzab = i;
            if (j == C.TIME_UNSET) {
                j = 0;
            }
            this.zzac = j;
            return null;
        }
        if (i == -1 || i >= zzbfVar.zza()) {
            i = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i, this.zza, 0L).zzl;
            j = zzfk.zzr(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i, zzfk.zzs(j));
    }

    private final long zzao(zzbf zzbfVar, zzxc zzxcVar, long j) {
        zzbfVar.zzo(zzxcVar.zza, this.zzp);
        return j;
    }

    private final zzmq zzap(zzmp zzmpVar) {
        int zzag = zzag(this.zzaa);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzag == -1) {
            zzag = 0;
        }
        zzdo zzdoVar = this.zzv;
        zzlo zzloVar = this.zzm;
        return new zzmq(zzloVar, zzmpVar, zzbfVar, zzag, zzdoVar, zzloVar.zzn());
    }

    private final void zzaq(Object obj) {
        Object obj2 = this.zzO;
        boolean z = false;
        if (obj2 != null && obj2 != obj) {
            z = true;
        }
        boolean zzl = this.zzm.zzl(obj, z ? this.zzA : C.TIME_UNSET);
        if (z) {
            Object obj3 = this.zzO;
            Surface surface = this.zzP;
            if (obj3 == surface) {
                surface.release();
                this.zzP = null;
            }
        }
        this.zzO = obj;
        if (zzl) {
            return;
        }
        zzP(zzje.zzc(new zzlp(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzar, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i, final int i2) {
        if (i == this.zzR.zza() && i2 == this.zzR.zzb()) {
            return;
        }
        this.zzR = new zzet(i, i2);
        zzee zzeeVar = this.zzn;
        zzeeVar.zze(24, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkl
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlb.zzd;
                ((zzaz) obj).zzu(i, i2);
            }
        });
        zzeeVar.zzf();
        zzau(2, 14, new zzet(i, i2));
    }

    private final void zzas() {
        int zzh = zzh();
        if (zzh != 2 && zzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzat();
            boolean z = this.zzaa.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzat() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), looper.getThread().getName()};
            String str = zzfk.zza;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", objArr);
            if (this.zzV) {
                throw new IllegalStateException(format);
            }
            zzef.zzd("ExoPlayerImpl", format, this.zzW ? null : new IllegalStateException());
            this.zzW = true;
        }
    }

    private final void zzau(int i, int i2, Object obj) {
        zzmu[] zzmuVarArr = this.zzh;
        int length = zzmuVarArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzmu zzmuVar = zzmuVarArr[i3];
            if (i == -1 || zzmuVar.zza() == i) {
                zzmq zzap = zzap(zzmuVar);
                zzap.zzb(i2);
                zzap.zzd(obj);
                zzap.zzg();
            }
        }
        zzmu[] zzmuVarArr2 = this.zzi;
        int length2 = zzmuVarArr2.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzmu zzmuVar2 = zzmuVarArr2[i4];
            if (zzmuVar2 != null && (i == -1 || zzmuVar2.zza() == i)) {
                zzmq zzap2 = zzap(zzmuVar2);
                zzap2.zzb(i2);
                zzap2.zzd(obj);
                zzap2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzat();
        return zzah(this.zzaa);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzat();
        String str = zzfk.zza;
        final float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzT == max) {
            return;
        }
        this.zzT = max;
        this.zzm.zzj(max);
        zzee zzeeVar = this.zzn;
        zzeeVar.zze(22, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i = zzlb.zzd;
                ((zzaz) obj).zzr(max);
            }
        });
        zzeeVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzat();
        zzaq(surface);
        int i = surface == null ? 0 : -1;
        zzS(i, i);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzD(zznj zznjVar) {
        this.zzs.zzv(zznjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzE(zznj zznjVar) {
        zzat();
        this.zzs.zzw(zznjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int zzF() {
        zzat();
        int length = this.zzh.length;
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzG(zzxe zzxeVar) {
        zzat();
        List singletonList = Collections.singletonList(zzxeVar);
        zzat();
        zzat();
        zzag(this.zzaa);
        zzu();
        this.zzG++;
        List list = this.zzq;
        list.clear();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < singletonList.size(); i++) {
            zzmi zzmiVar = new zzmi((zzxe) singletonList.get(i), this.zzr);
            arrayList.add(zzmiVar);
            list.add(i, new zzkx(zzmiVar.zzb, zzmiVar.zza));
        }
        this.zzad = this.zzad.zzg().zzf(0, arrayList.size());
        zzms zzmsVar = new zzms(list, this.zzad);
        if (!zzmsVar.zzg() && zzmsVar.zza() < 0) {
            throw new zzw(zzmsVar, -1, C.TIME_UNSET);
        }
        int zzk = zzmsVar.zzk(false);
        zzmm zzal = zzal(this.zzaa, zzmsVar, zzan(zzmsVar, zzk, C.TIME_UNSET));
        int i2 = zzal.zze;
        if (i2 == 1) {
            i2 = 1;
        } else {
            if (!zzmsVar.zzg()) {
                if (zzk != -1) {
                    if (zzk < zzmsVar.zza()) {
                        i2 = 2;
                    }
                }
            }
            i2 = 4;
        }
        zzmm zzam = zzam(zzal, i2);
        this.zzm.zzy(arrayList, zzk, zzfk.zzs(C.TIME_UNSET), this.zzad);
        zzaj(zzam, 0, (this.zzaa.zzb.zza.equals(zzam.zzb.zza) || this.zzaa.zza.zzg()) ? false : true, 4, zzai(zzam), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfk.zza;
        String zza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 42 + String.valueOf(str).length() + 3 + String.valueOf(zza).length() + 1);
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [AndroidXMedia3/1.10.0-alpha01] [");
        sb.append(str);
        sb.append("] [");
        sb.append(zza);
        sb.append(X3.j.e);
        zzef.zzb("ExoPlayerImpl", sb.toString());
        zzat();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzla zzlaVar = this.zzD;
        if (zzlaVar != null && Build.VERSION.SDK_INT >= 34) {
            zzlaVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzee zzeeVar = this.zzn;
            zzeeVar.zze(10, zzkp.zza);
            zzeeVar.zzf();
        }
        this.zzn.zzg();
        this.zzk.zzl(null);
        zzabi zzabiVar = this.zzu;
        zzng zzngVar = this.zzs;
        zzabiVar.zzg(zzngVar);
        boolean z = this.zzaa.zzp;
        zzmm zzam = zzam(this.zzaa, 1);
        this.zzaa = zzam;
        zzmm zzh = zzam.zzh(zzam.zzb);
        this.zzaa = zzh;
        zzh.zzq = zzh.zzs;
        this.zzaa.zzr = 0L;
        zzngVar.zzy();
        Surface surface = this.zzP;
        if (surface != null) {
            surface.release();
            this.zzP = null;
        }
        int i = zzcz.zza;
        this.zzY = true;
    }

    public final zzje zzI() {
        zzat();
        return this.zzaa.zzf;
    }

    final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    final /* synthetic */ void zzK(final zzll zzllVar) {
        this.zzk.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzlb.this.zzO(zzllVar);
            }
        });
    }

    final /* synthetic */ void zzL(int i, final int i2) {
        zzat();
        Integer valueOf = Integer.valueOf(i2);
        zzau(1, 10, valueOf);
        zzau(2, 10, valueOf);
        zzdz zzdzVar = new zzdz() { // from class: com.google.android.gms.internal.ads.zzkm
            @Override // com.google.android.gms.internal.ads.zzdz
            public final /* synthetic */ void zza(Object obj) {
                int i3 = zzlb.zzd;
                ((zzaz) obj).zzq(i2);
            }
        };
        zzee zzeeVar = this.zzn;
        zzeeVar.zze(21, zzdzVar);
        zzeeVar.zzf();
    }

    final /* synthetic */ void zzM() {
        String str = zzfk.zza;
        int generateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (generateAudioSessionId == -1) {
            generateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(generateAudioSessionId));
    }

    final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzM);
    }

    final /* synthetic */ void zzO(zzll zzllVar) {
        int i;
        long j;
        boolean z;
        int i2 = this.zzG - zzllVar.zzb;
        this.zzG = i2;
        boolean z2 = true;
        if (zzllVar.zzc) {
            this.zzH = zzllVar.zzd;
            this.zzI = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzllVar.zza.zza;
            int i3 = -1;
            if (!this.zzaa.zza.zzg() && zzbfVar.zzg()) {
                this.zzab = -1;
                this.zzac = 0L;
            }
            if (!zzbfVar.zzg()) {
                List zzw = ((zzms) zzbfVar).zzw();
                int size = zzw.size();
                List list = this.zzq;
                zzgsw.zzi(size == list.size());
                for (int i4 = 0; i4 < zzw.size(); i4++) {
                    ((zzkx) list.get(i4)).zzc((zzbf) zzw.get(i4));
                }
            }
            boolean z3 = this.zzI;
            long j2 = C.TIME_UNSET;
            if (z3) {
                boolean z4 = zzllVar.zza.zza.zzg() && this.zzaa.zza.zzg();
                boolean equals = zzllVar.zza.zzb.equals(this.zzaa.zzb);
                long j3 = zzllVar.zza.zzd;
                long j4 = this.zzaa.zzs;
                if (z4 || (equals && j3 == j4)) {
                    z2 = false;
                }
                if (z2) {
                    i3 = zzs();
                    if (zzbfVar.zzg() || zzllVar.zza.zzb.zzb()) {
                        j2 = zzllVar.zza.zzd;
                    } else {
                        zzmm zzmmVar = zzllVar.zza;
                        zzxc zzxcVar = zzmmVar.zzb;
                        long j5 = zzmmVar.zzd;
                        zzao(zzbfVar, zzxcVar, j5);
                        j2 = j5;
                    }
                }
                z = z2;
                long j6 = j2;
                i = i3;
                j = j6;
            } else {
                i = -1;
                j = -9223372036854775807L;
                z = false;
            }
            this.zzI = false;
            zzaj(zzllVar.zza, 1, z, this.zzH, j, i, false);
        }
    }

    final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzaq(surface);
        this.zzP = surface;
    }

    final /* synthetic */ void zzR(Object obj) {
        zzaq(null);
    }

    final /* synthetic */ void zzT(int i, int i2, Object obj) {
        zzau(1, 19, obj);
    }

    final /* synthetic */ zzee zzU() {
        return this.zzn;
    }

    final /* synthetic */ zzng zzV() {
        return this.zzs;
    }

    final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    final /* synthetic */ zzdo zzX() {
        return this.zzv;
    }

    final /* synthetic */ zzdm zzY() {
        return this.zzB;
    }

    final /* synthetic */ zzjr zzZ() {
        return this.zzE;
    }

    final /* synthetic */ zzjr zzaa() {
        return this.zzF;
    }

    final /* synthetic */ Object zzab() {
        return this.zzO;
    }

    final /* synthetic */ boolean zzac() {
        return this.zzU;
    }

    final /* synthetic */ void zzad(boolean z) {
        this.zzU = z;
    }

    final /* synthetic */ boolean zzae() {
        return this.zzY;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    protected final void zzc(int i, long j, int i2, boolean z) {
        zzat();
        if (i == -1) {
            return;
        }
        zzgsw.zza(i >= 0);
        zzbf zzbfVar = this.zzaa.zza;
        if (zzbfVar.zzg() || i < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzG++;
            if (zzx()) {
                zzef.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzll zzllVar = new zzll(this.zzaa);
                zzllVar.zza(1);
                this.zzl.zza(zzllVar);
                return;
            }
            zzmm zzmmVar = this.zzaa;
            int i3 = zzmmVar.zze;
            if (i3 == 3 || (i3 == 4 && !zzbfVar.zzg())) {
                zzmmVar = zzam(this.zzaa, 2);
            }
            int zzs = zzs();
            zzmm zzal = zzal(zzmmVar, zzbfVar, zzan(zzbfVar, i, j));
            this.zzm.zzf(zzbfVar, i, zzfk.zzs(j));
            zzaj(zzal, 0, true, 1, zzai(zzal), zzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzat();
        zzazVar.getClass();
        this.zzn.zzd(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzat();
        zzmm zzmmVar = this.zzaa;
        if (zzmmVar.zze != 1) {
            return;
        }
        zzmm zzf = zzmmVar.zzf(null);
        zzmm zzam = zzam(zzf, true != zzf.zza.zzg() ? 2 : 4);
        this.zzG++;
        this.zzm.zzd();
        zzaj(zzam, 1, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzat();
        return this.zzaa.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzat();
        return this.zzaa.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z) {
        zzat();
        zzmm zzmmVar = this.zzaa;
        int i = zzmmVar.zzn;
        int i2 = 0;
        if (i == 1) {
            if (z) {
                i = 1;
            } else {
                i = 1;
                i2 = 1;
            }
        }
        if (zzmmVar.zzl == z && i == i2 && zzmmVar.zzm == 1) {
            return;
        }
        this.zzG++;
        boolean z2 = zzmmVar.zzp;
        zzmm zzi = zzmmVar.zzi(z, 1, i2);
        this.zzm.zze(z, 1, i2);
        zzaj(zzi, 0, false, 5, C.TIME_UNSET, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzat();
        return this.zzaa.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzat();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzat();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzat();
        return this.zzaa.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzat();
        zzP(null);
        new zzcz(zzgvz.zzi(), this.zzaa.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzat();
        return this.zzaa.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzat();
        return this.zzaa.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzat();
        if (!this.zzaa.zza.zzg()) {
            zzmm zzmmVar = this.zzaa;
            return zzmmVar.zza.zze(zzmmVar.zzb.zza);
        }
        int i = this.zzab;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzat();
        int zzag = zzag(this.zzaa);
        if (zzag == -1) {
            return 0;
        }
        return zzag;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzat();
        if (!zzx()) {
            zzbf zzq = zzq();
            return zzq.zzg() ? C.TIME_UNSET : zzfk.zzr(zzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzmm zzmmVar = this.zzaa;
        zzxc zzxcVar = zzmmVar.zzb;
        zzbf zzbfVar = zzmmVar.zza;
        Object obj = zzxcVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfk.zzr(zzbdVar.zzh(zzxcVar.zzb, zzxcVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzat();
        return zzfk.zzr(zzai(this.zzaa));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzat();
        if (zzx()) {
            zzmm zzmmVar = this.zzaa;
            return zzmmVar.zzk.equals(zzmmVar.zzb) ? zzfk.zzr(this.zzaa.zzq) : zzt();
        }
        zzat();
        if (this.zzaa.zza.zzg()) {
            return this.zzac;
        }
        zzmm zzmmVar2 = this.zzaa;
        long j = 0;
        if (zzmmVar2.zzk.zzd != zzmmVar2.zzb.zzd) {
            return zzfk.zzr(zzmmVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmmVar2.zzq;
        if (this.zzaa.zzk.zzb()) {
            zzmm zzmmVar3 = this.zzaa;
            zzmmVar3.zza.zzo(zzmmVar3.zzk.zza, this.zzp).zzc(this.zzaa.zzk.zzb);
        } else {
            j = j2;
        }
        zzmm zzmmVar4 = this.zzaa;
        zzao(zzmmVar4.zza, zzmmVar4.zzk, j);
        return zzfk.zzr(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzat();
        return zzfk.zzr(this.zzaa.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzat();
        return this.zzaa.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzat();
        if (zzx()) {
            return this.zzaa.zzb.zzc;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }
}
