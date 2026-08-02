package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public abstract class zzvl extends zzir {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private boolean zzA;
    private float zzB;
    private ArrayDeque zzC;
    private zzvh zzD;
    private zzve zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzM;
    private long zzN;
    private int zzO;
    private int zzP;
    private ByteBuffer zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private int zzX;
    private int zzY;
    private int zzZ;
    protected zziv zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private long zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private zzvk zzah;
    private long zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private long zzam;
    private zzit zzan;
    private zzit zzao;
    private zzgwj zzap;
    private final Context zzc;
    private final zzuz zzd;
    private final zzvn zze;
    private final float zzf;
    private final zzip zzg;
    private final zzip zzh;
    private final zzip zzi;
    private final zzus zzj;
    private final MediaCodec.BufferInfo zzk;
    private final ArrayDeque zzl;
    private final zztq zzm;
    private final AtomicInteger zzn;
    private zzv zzo;
    private zzv zzp;
    private zzty zzq;
    private zzty zzr;
    private zzmt zzs;
    private MediaCrypto zzt;
    private long zzu;
    private float zzv;
    private float zzw;
    private zzvb zzx;
    private zzv zzy;
    private MediaFormat zzz;

    public zzvl(Context context, int i, zzuz zzuzVar, zzvn zzvnVar, boolean z, float f) {
        super(i);
        this.zzc = context.getApplicationContext();
        this.zzd = zzuzVar;
        zzvnVar.getClass();
        this.zze = zzvnVar;
        this.zzf = f;
        this.zzn = new AtomicInteger();
        this.zzg = new zzip(0, 0);
        this.zzh = new zzip(0, 0);
        this.zzi = new zzip(2, 0);
        zzus zzusVar = new zzus();
        this.zzj = zzusVar;
        this.zzk = new MediaCodec.BufferInfo();
        this.zzv = 1.0f;
        this.zzw = 1.0f;
        this.zzu = C.TIME_UNSET;
        this.zzl = new ArrayDeque();
        this.zzah = zzvk.zza;
        zzusVar.zzj(0);
        zzusVar.zzc.order(ByteOrder.nativeOrder());
        this.zzm = new zztq();
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzX = 0;
        this.zzO = -1;
        this.zzP = -1;
        this.zzN = C.TIME_UNSET;
        this.zzad = C.TIME_UNSET;
        this.zzai = C.TIME_UNSET;
        this.zzL = C.TIME_UNSET;
        this.zzY = 0;
        this.zzZ = 0;
        this.zza = new zziv();
        this.zzal = false;
        this.zzam = 0L;
        this.zzap = zzgwj.zzh();
        zzit zzitVar = zzit.zza;
        this.zzan = zzitVar;
        this.zzao = zzitVar;
    }

    private final boolean zzaA(int i) throws zzje {
        zzlq zzI = zzI();
        zzip zzipVar = this.zzg;
        zzipVar.zza();
        int zzQ = zzQ(zzI, zzipVar, i | 4);
        if (zzQ == -5) {
            zzao(zzI);
            return true;
        }
        if (zzQ != -4 || !zzipVar.zzb()) {
            return false;
        }
        this.zzae = true;
        zzbr();
        return false;
    }

    private final boolean zzaB(long j) {
        return this.zzu == C.TIME_UNSET || zzM().zzb() - j < this.zzu;
    }

    private final boolean zzaC() {
        return this.zzP >= 0;
    }

    private final void zzaq() {
        this.zzT = false;
        zzaw();
    }

    private final void zzaw() {
        zzaz();
        this.zzV = false;
        this.zzj.zza();
        this.zzi.zza();
        this.zzU = false;
        this.zzm.zzb();
    }

    private final boolean zzax() {
        if (this.zzx == null) {
            return false;
        }
        if (zzaO()) {
            zzaM();
            return true;
        }
        if (zzaP()) {
            zzay();
            return false;
        }
        this.zzal = true;
        return false;
    }

    private final void zzay() {
        try {
            zzvb zzvbVar = this.zzx;
            if (zzvbVar == null) {
                throw null;
            }
            zzvb zzvbVar2 = zzvbVar;
            zzvbVar.zzk();
        } finally {
            zzaR();
        }
    }

    private final void zzaz() {
        this.zzad = C.TIME_UNSET;
        zzbt().zzf = C.TIME_UNSET;
        this.zzai = C.TIME_UNSET;
    }

    protected static boolean zzbj(zzv zzvVar) {
        return zzvVar.zzO == 0;
    }

    private final void zzbm() {
        this.zzO = -1;
        this.zzh.zzc = null;
    }

    private final void zzbn() {
        this.zzP = -1;
        this.zzQ = null;
    }

    private final boolean zzbo(zzv zzvVar) throws zzje {
        if (this.zzx != null && this.zzZ != 3 && zze() != 0) {
            float f = this.zzw;
            zzvVar.getClass();
            float zzak = zzak(f, zzvVar, zzJ());
            float f2 = this.zzB;
            if (f2 != zzak) {
                if (zzak == -1.0f) {
                    zzbq();
                    return false;
                }
                if (f2 != -1.0f || zzak > this.zzf) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzak);
                    zzvb zzvbVar = this.zzx;
                    zzvbVar.getClass();
                    zzvbVar.zzp(bundle);
                    this.zzB = zzak;
                }
            }
        }
        return true;
    }

    private final boolean zzbp() throws zzje {
        if (this.zzaa) {
            this.zzY = 1;
            if (this.zzH) {
                this.zzZ = 3;
                return false;
            }
            this.zzZ = 2;
        } else {
            zzbu();
        }
        return true;
    }

    private final void zzbq() throws zzje {
        if (this.zzaa) {
            this.zzY = 1;
            this.zzZ = 3;
        } else {
            zzaM();
            zzaE();
        }
    }

    private final void zzbs(zzvk zzvkVar) {
        this.zzah = zzvkVar;
        if (zzvkVar.zzd != C.TIME_UNSET) {
            this.zzaj = true;
        }
    }

    private final zzvk zzbt() {
        ArrayDeque arrayDeque = this.zzl;
        return !arrayDeque.isEmpty() ? (zzvk) arrayDeque.getLast() : this.zzah;
    }

    private final boolean zzbv(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzv zzvVar = this.zzp;
        return (zzvVar != null && Objects.equals(zzvVar.zzp, MimeTypes.AUDIO_OPUS) && zzgu.zzf(j, j2)) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzA(long j, boolean z, boolean z2) throws zzje {
        ArrayDeque arrayDeque = this.zzl;
        if (!arrayDeque.isEmpty()) {
            this.zzah = (zzvk) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.zzae = false;
            this.zzaf = false;
            if (this.zzT) {
                zzaw();
            } else {
                zzaN();
            }
            zzfg zzfgVar = this.zzah.zze;
            if (zzfgVar.zzc() > 0) {
                this.zzag = true;
            }
            zzfgVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzD() {
        this.zzo = null;
        zzbs(zzvk.zza);
        this.zzl.clear();
        if (this.zzT) {
            zzaq();
        } else {
            zzax();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzE() {
        try {
            zzaq();
            zzaM();
        } finally {
            this.zzr = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public final long zzV(long j, long j2) {
        return zzaj(j, j2, this.zzM);
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public void zzX(float f, float f2) throws zzje {
        this.zzv = f;
        this.zzw = f2;
        zzbo(this.zzy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x047a, code lost:
    
        if (r0 >= r3.zzs.size()) goto L444;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x047c, code lost:
    
        r3 = (byte[]) r24.zzy.zzs.get(r0);
        r4 = r24.zzh.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x048a, code lost:
    
        if (r4 == null) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x048c, code lost:
    
        r5 = r4;
        r4.put(r3);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0495, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0496, code lost:
    
        r24.zzX = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0499, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x049a, code lost:
    
        r0 = r24.zzh.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x049e, code lost:
    
        if (r0 == null) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04a0, code lost:
    
        r3 = r0;
        r0 = r0.position();
        r3 = zzI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04ab, code lost:
    
        r2.zzi(new com.google.android.gms.internal.ads.zzvi(r24, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04b3, code lost:
    
        r4 = r24.zzn.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04ba, code lost:
    
        if (r4 != (-3)) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04cd, code lost:
    
        if (r4 != (-5)) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04d1, code lost:
    
        if (r24.zzX != 2) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04d3, code lost:
    
        r24.zzh.zza();
        r24.zzX = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x04da, code lost:
    
        zzao(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x04df, code lost:
    
        r3 = r24.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04e5, code lost:
    
        if (r3.zzb() == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x051a, code lost:
    
        if (r24.zzaa != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0520, code lost:
    
        if (r3.zzc() != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0522, code lost:
    
        r3.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0527, code lost:
    
        if (r24.zzX != 2) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0529, code lost:
    
        r24.zzX = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x052d, code lost:
    
        r4 = r3.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0533, code lost:
    
        if (zzaX(r3) != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0535, code lost:
    
        r6 = r3.zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0539, code lost:
    
        if (r6 == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x053b, code lost:
    
        r3.zzb.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0542, code lost:
    
        if (r24.zzag == false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0544, code lost:
    
        r0 = zzbt().zze;
        r7 = r24.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x054c, code lost:
    
        if (r7 == null) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x054e, code lost:
    
        r8 = r7;
        r0.zza(r4, r7);
        r24.zzag = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0557, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0558, code lost:
    
        r24.zzad = java.lang.Math.max(r24.zzad, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0564, code lost:
    
        if (zzcW() != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x056a, code lost:
    
        if (r3.zzd() == false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0574, code lost:
    
        r3.zzl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x057b, code lost:
    
        if (r3.zze() == false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x057d, code lost:
    
        zzav(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0582, code lost:
    
        if (r24.zzal == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0584, code lost:
    
        r7 = r24.zzad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0588, code lost:
    
        if (r4 > r7) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x058a, code lost:
    
        r24.zzam += (r7 - r4) + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0594, code lost:
    
        r24.zzad = r4;
        r24.zzal = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0598, code lost:
    
        zzaV(r3);
        r8 = zzaW(r3);
        r4 = r4 + r24.zzam;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x05a2, code lost:
    
        if (r6 == false) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x05a4, code lost:
    
        r0 = r2;
        r2.zzb(r24.zzO, 0, r3.zzb, r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x05c8, code lost:
    
        zzbm();
        r24.zzaa = true;
        r24.zzX = 0;
        r24.zza.zzc++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x05b2, code lost:
    
        r0 = r2;
        r0 = r24.zzO;
        r3 = r3.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x05ba, code lost:
    
        if (r3 == null) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x05bc, code lost:
    
        r4 = r3;
        r2.zza(r0, 0, r3.limit(), r4, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x05d7, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x056c, code lost:
    
        zzbt().zzf = r24.zzad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04e7, code lost:
    
        zzbt().zzf = r24.zzad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04f1, code lost:
    
        if (r24.zzX != 2) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04f3, code lost:
    
        r3.zza();
        r24.zzX = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04f8, code lost:
    
        r24.zzae = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04fc, code lost:
    
        if (r24.zzaa != false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04fe, code lost:
    
        zzbr();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0505, code lost:
    
        if (r24.zzK != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0507, code lost:
    
        r24.zzab = true;
        r2.zza(r24.zzO, 0, 0, 0, 4);
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04c0, code lost:
    
        if (zzcW() == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x04c2, code lost:
    
        zzbt().zzf = r24.zzad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05d8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x05d9, code lost:
    
        zzan(r0);
        zzaA(0);
        zzay();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05ea, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05eb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0622, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0429, code lost:
    
        if (r24.zzK != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x042b, code lost:
    
        r24.zzab = true;
        r2.zza(r24.zzO, 0, 0, 0, 4);
        zzbm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x043a, code lost:
    
        r24.zzY = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03f7, code lost:
    
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x02e2, code lost:
    
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x034b, code lost:
    
        if (r24.zzp != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03f9, code lost:
    
        r2 = r24.zzx;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x03fb, code lost:
    
        if (r2 == null) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0400, code lost:
    
        if (r24.zzY == 2) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0404, code lost:
    
        if (r24.zzae == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0408, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x040d, code lost:
    
        if (r24.zzO >= 0) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x040f, code lost:
    
        r0 = r2.zze();
        r24.zzO = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0415, code lost:
    
        if (r0 < 0) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0417, code lost:
    
        r3 = r24.zzh;
        r3.zzc = r2.zzh(r0);
        r3.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0424, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0425, code lost:
    
        if (r24.zzY != 1) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0441, code lost:
    
        if (r24.zzI == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0444, code lost:
    
        r24.zzI = false;
        r0 = r24.zzh.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x044a, code lost:
    
        if (r0 == null) goto L437;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x044c, code lost:
    
        r3 = r0;
        r0.put(com.google.android.gms.internal.ads.zzvl.zzb);
        r2.zza(r24.zzO, 0, 38, 0, 0);
        zzbm();
        r24.zzaa = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0466, code lost:
    
        throw r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0467, code lost:
    
        r10 = false;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x046a, code lost:
    
        if (r24.zzX != 1) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x046c, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x046d, code lost:
    
        r3 = r24.zzy;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x046f, code lost:
    
        if (r3 == null) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0471, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03a7 A[Catch: IllegalStateException -> 0x05f6, CryptoException -> 0x061d, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x05f6, blocks: (B:231:0x0205, B:311:0x02e5, B:313:0x02f2, B:314:0x02fa, B:316:0x02fe, B:319:0x0303, B:320:0x0307, B:322:0x0311, B:323:0x0320, B:325:0x032e, B:327:0x0332, B:329:0x0336, B:331:0x0342, B:332:0x034d, B:334:0x0351, B:27:0x0361, B:29:0x0365, B:33:0x0375, B:35:0x037f, B:38:0x038a, B:40:0x03a7, B:336:0x035e, B:337:0x0345, B:339:0x0349), top: B:230:0x0205 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03ee A[LOOP:0: B:21:0x01f2->B:58:0x03ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03ed A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzvl] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.media.MediaFormat, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // com.google.android.gms.internal.ads.zzmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void zzZ(long j, long j2) throws zzje {
        boolean z;
        boolean z2;
        ?? r10;
        boolean z3;
        boolean z4;
        ?? r2;
        boolean z5;
        char c;
        Throwable th;
        long j3;
        boolean z6;
        zzv zzvVar;
        boolean z7 = true;
        try {
            try {
                if (this.zzaf) {
                    zzau();
                    return;
                }
                int i = 2;
                if (this.zzo == null && !zzaA(2)) {
                    return;
                }
                zzaE();
                ?? r5 = 65531;
                Throwable th2 = null;
                try {
                    try {
                        try {
                            try {
                                if (this.zzT) {
                                    try {
                                        try {
                                            Trace.beginSection("bypassRender");
                                            while (true) {
                                                zzgsw.zzi(this.zzaf ^ z7);
                                                zzus zzusVar = this.zzj;
                                                if (zzusVar.zzp()) {
                                                    ByteBuffer byteBuffer = zzusVar.zzc;
                                                    int i2 = this.zzP;
                                                    int zzo = zzusVar.zzo();
                                                    long j4 = zzusVar.zze;
                                                    boolean zzbv = zzbv(zzH(), zzusVar.zzn());
                                                    boolean zzb2 = zzusVar.zzb();
                                                    zzv zzvVar2 = this.zzp;
                                                    if (zzvVar2 == null) {
                                                        throw th2;
                                                    }
                                                    zzv zzvVar3 = zzvVar2;
                                                    if (!zzas(j, j2, null, byteBuffer, i2, 0, zzo, j4, zzbv, zzb2, zzvVar2)) {
                                                        z7 = true;
                                                        break;
                                                    } else {
                                                        zzaZ(zzusVar.zzn());
                                                        zzusVar.zza();
                                                        r2 = 0;
                                                    }
                                                } else {
                                                    r2 = th2;
                                                }
                                                try {
                                                    if (this.zzae) {
                                                        z7 = true;
                                                        this.zzaf = true;
                                                        break;
                                                    }
                                                    z7 = true;
                                                    if (this.zzU) {
                                                        zzgsw.zzi(zzusVar.zzq(this.zzi));
                                                        z5 = false;
                                                        this.zzU = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (this.zzV) {
                                                        if (!zzusVar.zzp()) {
                                                            zzaq();
                                                            this.zzV = z5;
                                                            zzaE();
                                                            if (!this.zzT) {
                                                                break;
                                                            }
                                                        } else {
                                                            c = 65531;
                                                            th2 = r2;
                                                        }
                                                    }
                                                    zzgsw.zzi(!this.zzae);
                                                    zzlq zzI = zzI();
                                                    zzip zzipVar = this.zzi;
                                                    zzipVar.zza();
                                                    do {
                                                        zzipVar.zza();
                                                        int zzQ = zzQ(zzI, zzipVar, z5 ? 1 : 0);
                                                        c = 65531;
                                                        if (zzQ == -5) {
                                                            zzao(zzI);
                                                            break;
                                                        }
                                                        if (zzQ == -4) {
                                                            if (zzipVar.zzb()) {
                                                                this.zzae = true;
                                                                zzbt().zzf = this.zzad;
                                                                break;
                                                            }
                                                            this.zzad = Math.max(this.zzad, zzipVar.zze);
                                                            if (zzcW() || this.zzh.zzd()) {
                                                                zzbt().zzf = this.zzad;
                                                            }
                                                            if (this.zzag) {
                                                                zzv zzvVar4 = this.zzo;
                                                                if (zzvVar4 == null) {
                                                                    throw r2;
                                                                }
                                                                zzv zzvVar5 = zzvVar4;
                                                                this.zzp = zzvVar4;
                                                                if (Objects.equals(zzvVar4.zzp, MimeTypes.AUDIO_OPUS) && !this.zzp.zzs.isEmpty()) {
                                                                    int zze = zzgu.zze((byte[]) this.zzp.zzs.get(z5 ? 1 : 0));
                                                                    zzt zza = this.zzp.zza();
                                                                    zza.zzJ(zze);
                                                                    this.zzp = zza.zzO();
                                                                }
                                                                zzap(this.zzp, r2);
                                                                this.zzag = z5;
                                                            }
                                                            zzipVar.zzl();
                                                            zzv zzvVar6 = this.zzp;
                                                            if (zzvVar6 != null && Objects.equals(zzvVar6.zzp, MimeTypes.AUDIO_OPUS)) {
                                                                if (zzipVar.zze()) {
                                                                    zzipVar.zza = this.zzp;
                                                                    zzav(zzipVar);
                                                                }
                                                                if (zzgu.zzf(zzH(), zzipVar.zze)) {
                                                                    this.zzm.zza(zzipVar, this.zzp.zzs);
                                                                }
                                                            }
                                                            if (zzusVar.zzp()) {
                                                                long zzH = zzH();
                                                                if (zzbv(zzH, zzusVar.zzn()) != zzbv(zzH, zzipVar.zze)) {
                                                                    break;
                                                                }
                                                            }
                                                        } else if (zzcW()) {
                                                            zzbt().zzf = this.zzad;
                                                        }
                                                    } while (zzusVar.zzq(zzipVar));
                                                    this.zzU = true;
                                                    if (zzusVar.zzp()) {
                                                        zzusVar.zzl();
                                                    }
                                                    if (!zzusVar.zzp() && !this.zzae && !this.zzV) {
                                                        break;
                                                    }
                                                    th2 = r2;
                                                } catch (IllegalStateException e) {
                                                    e = e;
                                                    z7 = true;
                                                    r5 = 0;
                                                    z = z7;
                                                    r10 = r5;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                        StackTraceElement[] stackTrace = e.getStackTrace();
                                                        if (stackTrace.length <= 0 || !stackTrace[r10].getClassName().equals("android.media.MediaCodec")) {
                                                            throw e;
                                                        }
                                                    }
                                                    zzan(e);
                                                    z4 = (z3 || !((MediaCodec.CodecException) e).isRecoverable()) ? r10 : z;
                                                    if (z4) {
                                                        zzaM();
                                                    }
                                                    zzvd zzaT = zzaT(e, this.zzE);
                                                    throw zzP(zzaT, this.zzo, z4, zzaT.zza != 1101 ? 4006 : PlaybackException.ERROR_CODE_DECODING_FAILED);
                                                }
                                            }
                                            z5 = false;
                                            Trace.endSection();
                                        } catch (IllegalStateException e2) {
                                            e = e2;
                                        }
                                    } catch (MediaCodec.CryptoException e3) {
                                        e = e3;
                                        r5 = 0;
                                        z2 = r5;
                                        throw zzP(e, this.zzo, z2, zzfk.zzG(e.getErrorCode()));
                                    }
                                } else {
                                    char c2 = 65531;
                                    Throwable th3 = null;
                                    boolean z8 = false;
                                    if (this.zzx != null) {
                                        long zzb3 = zzM().zzb();
                                        Trace.beginSection("drainAndFeed");
                                        long j5 = zzb3;
                                        while (true) {
                                            zzvb zzvbVar = this.zzx;
                                            if (zzvbVar == null) {
                                                throw th3;
                                            }
                                            zzvb zzvbVar2 = zzvbVar;
                                            if (zzaC()) {
                                                th = th3;
                                            } else {
                                                try {
                                                    MediaCodec.BufferInfo bufferInfo = this.zzk;
                                                    int zzf = zzvbVar.zzf(bufferInfo);
                                                    if (zzf >= 0) {
                                                        th = th3;
                                                        bufferInfo.presentationTimeUs -= this.zzam;
                                                        if (!this.zzJ) {
                                                            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                                                                zzbr();
                                                                break;
                                                            }
                                                            this.zzP = zzf;
                                                            ByteBuffer zzj = zzvbVar.zzj(zzf);
                                                            this.zzQ = zzj;
                                                            if (zzj != null) {
                                                                zzj.position(bufferInfo.offset);
                                                                this.zzQ.limit(bufferInfo.offset + bufferInfo.size);
                                                            }
                                                            zzv zzvVar7 = (zzv) this.zzah.zze.zze(bufferInfo.presentationTimeUs);
                                                            if (zzvVar7 == null && this.zzaj && this.zzz != null) {
                                                                zzvVar7 = (zzv) this.zzah.zze.zzd();
                                                            }
                                                            if (zzvVar7 != null) {
                                                                this.zzp = zzvVar7;
                                                            } else if (this.zzA) {
                                                            }
                                                            zzv zzvVar8 = this.zzp;
                                                            if (zzvVar8 == null) {
                                                                throw th;
                                                            }
                                                            zzv zzvVar9 = zzvVar8;
                                                            zzap(zzvVar8, this.zzz);
                                                            this.zzA = z8;
                                                            this.zzaj = z8;
                                                        } else {
                                                            this.zzJ = z8;
                                                            zzvbVar.zzc(zzf, z8);
                                                            j3 = j5;
                                                            if (!zzaB(j3)) {
                                                            }
                                                        }
                                                    } else if (zzf == -2) {
                                                        this.zzac = z7;
                                                        zzvb zzvbVar3 = this.zzx;
                                                        if (zzvbVar3 == null) {
                                                            throw th3;
                                                        }
                                                        zzvb zzvbVar4 = zzvbVar3;
                                                        MediaFormat zzg = zzvbVar3.zzg();
                                                        if (this.zzF != 0 && zzg.getInteger("width") == 32 && zzg.getInteger("height") == 32) {
                                                            this.zzJ = z7;
                                                        } else {
                                                            if (Build.VERSION.SDK_INT >= 29 && !this.zzap.isEmpty()) {
                                                                zzgwj<String> zzgwjVar = this.zzap;
                                                                zzit zzitVar = zzit.zza;
                                                                zzis zzisVar = new zzis();
                                                                for (String str : zzgwjVar) {
                                                                    if (zzg.containsKey(str)) {
                                                                        int valueTypeForKey = zzg.getValueTypeForKey(str);
                                                                        if (valueTypeForKey == z7) {
                                                                            zzisVar.zza(str, zzg.getInteger(str));
                                                                        } else if (valueTypeForKey == i) {
                                                                            zzisVar.zzb(str, zzg.getLong(str));
                                                                        } else if (valueTypeForKey == 3) {
                                                                            zzisVar.zzc(str, zzg.getFloat(str));
                                                                        } else if (valueTypeForKey == 4) {
                                                                            zzisVar.zzd(str, zzg.getString(str));
                                                                        } else if (valueTypeForKey == 5) {
                                                                            zzisVar.zze(str, zzg.getByteBuffer(str));
                                                                        }
                                                                    }
                                                                }
                                                                zzit zzg2 = zzisVar.zzg();
                                                                if (!zzg2.equals(this.zzao)) {
                                                                    this.zzao = zzg2;
                                                                    zzat(zzg2);
                                                                }
                                                            }
                                                            this.zzz = zzg;
                                                            this.zzA = z7;
                                                        }
                                                        th = th3;
                                                        j3 = j5;
                                                        if (!zzaB(j3)) {
                                                            break;
                                                        }
                                                        j5 = j3;
                                                        th3 = th;
                                                        z7 = true;
                                                        i = 2;
                                                        z8 = false;
                                                        c2 = 65531;
                                                    } else {
                                                        if (this.zzK && (this.zzae || this.zzY == i)) {
                                                            zzbr();
                                                        }
                                                        long j6 = this.zzL;
                                                        if (j6 != C.TIME_UNSET && j6 + 100 < zzM().zza()) {
                                                            zzbr();
                                                        }
                                                        th = th3;
                                                    }
                                                } catch (IllegalStateException e4) {
                                                    e = e4;
                                                    r10 = z8;
                                                    z = true;
                                                    z3 = e instanceof MediaCodec.CodecException;
                                                    if (!z3) {
                                                    }
                                                    zzan(e);
                                                    if (z3) {
                                                    }
                                                    if (z4) {
                                                    }
                                                    zzvd zzaT2 = zzaT(e, this.zzE);
                                                    throw zzP(zzaT2, this.zzo, z4, zzaT2.zza != 1101 ? 4006 : PlaybackException.ERROR_CODE_DECODING_FAILED);
                                                }
                                            }
                                            if (!this.zzal && this.zzk.presentationTimeUs >= zzH()) {
                                                z6 = z8;
                                                this.zzR = z6;
                                                long j7 = this.zzah.zzf;
                                                this.zzS = (j7 != C.TIME_UNSET || j7 > this.zzk.presentationTimeUs) ? z8 : true;
                                                ByteBuffer byteBuffer2 = this.zzQ;
                                                int i3 = this.zzP;
                                                MediaCodec.BufferInfo bufferInfo2 = this.zzk;
                                                long j8 = j5;
                                                int i4 = bufferInfo2.flags;
                                                long j9 = bufferInfo2.presentationTimeUs;
                                                boolean z9 = this.zzR;
                                                boolean z10 = this.zzS;
                                                zzvVar = this.zzp;
                                                if (zzvVar != null) {
                                                    throw th;
                                                }
                                                zzv zzvVar10 = zzvVar;
                                                if (!zzas(j, j2, zzvbVar, byteBuffer2, i3, i4, 1, j9, z9, z10, zzvVar)) {
                                                    break;
                                                }
                                                zzaZ(bufferInfo2.presentationTimeUs);
                                                boolean z11 = (bufferInfo2.flags & 4) != 0;
                                                if (!z11 && this.zzab && this.zzS) {
                                                    this.zzL = zzM().zza();
                                                }
                                                zzbn();
                                                if (z11) {
                                                    zzbr();
                                                    break;
                                                } else {
                                                    j3 = j8;
                                                    if (!zzaB(j3)) {
                                                    }
                                                }
                                            }
                                            z6 = true;
                                            this.zzR = z6;
                                            long j72 = this.zzah.zzf;
                                            this.zzS = (j72 != C.TIME_UNSET || j72 > this.zzk.presentationTimeUs) ? z8 : true;
                                            ByteBuffer byteBuffer22 = this.zzQ;
                                            int i32 = this.zzP;
                                            MediaCodec.BufferInfo bufferInfo22 = this.zzk;
                                            long j82 = j5;
                                            int i42 = bufferInfo22.flags;
                                            long j92 = bufferInfo22.presentationTimeUs;
                                            boolean z92 = this.zzR;
                                            boolean z102 = this.zzS;
                                            zzvVar = this.zzp;
                                            if (zzvVar != null) {
                                            }
                                        }
                                    } else {
                                        this.zza.zzd += zzR(j);
                                        zzaA(1);
                                    }
                                }
                                this.zza.zza();
                            } catch (IllegalStateException e5) {
                                e = e5;
                                r10 = 0;
                            }
                        } catch (IllegalStateException e6) {
                            e = e6;
                        }
                    } catch (MediaCodec.CryptoException e7) {
                        e = e7;
                    }
                } catch (MediaCodec.CryptoException e8) {
                    e = e8;
                    throw zzP(e, this.zzo, z2, zzfk.zzG(e.getErrorCode()));
                } catch (IllegalStateException e9) {
                    e = e9;
                    z3 = e instanceof MediaCodec.CodecException;
                    if (!z3) {
                    }
                    zzan(e);
                    if (z3) {
                    }
                    if (z4) {
                    }
                    zzvd zzaT22 = zzaT(e, this.zzE);
                    throw zzP(zzaT22, this.zzo, z4, zzaT22.zza != 1101 ? 4006 : PlaybackException.ERROR_CODE_DECODING_FAILED);
                }
                if (!zzaB(j3)) {
                    Trace.endSection();
                    this.zza.zza();
                }
            } catch (MediaCodec.CryptoException e10) {
                e = e10;
                z2 = false;
            }
        } catch (IllegalStateException e11) {
            e = e11;
            z = true;
        }
    }

    public final void zzaD() {
        this.zzak = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a6 A[Catch: zzvh -> 0x02d4, TryCatch #2 {zzvh -> 0x02d4, blocks: (B:25:0x0055, B:27:0x005c, B:180:0x0063, B:182:0x0079, B:183:0x0084, B:29:0x0091, B:31:0x0099, B:33:0x009d, B:34:0x00a0, B:36:0x00a4, B:38:0x00ad, B:100:0x028d, B:102:0x02a6, B:103:0x02af, B:106:0x02bb, B:107:0x02bd, B:110:0x02a9, B:171:0x02bf, B:173:0x02c0, B:176:0x02c5, B:177:0x02c6, B:178:0x02d0, B:186:0x0088, B:187:0x0090, B:189:0x02d3), top: B:24:0x0055, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a9 A[Catch: zzvh -> 0x02d4, TryCatch #2 {zzvh -> 0x02d4, blocks: (B:25:0x0055, B:27:0x005c, B:180:0x0063, B:182:0x0079, B:183:0x0084, B:29:0x0091, B:31:0x0099, B:33:0x009d, B:34:0x00a0, B:36:0x00a4, B:38:0x00ad, B:100:0x028d, B:102:0x02a6, B:103:0x02af, B:106:0x02bb, B:107:0x02bd, B:110:0x02a9, B:171:0x02bf, B:173:0x02c0, B:176:0x02c5, B:177:0x02c6, B:178:0x02d0, B:186:0x0088, B:187:0x0090, B:189:0x02d3), top: B:24:0x0055, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[Catch: Exception -> 0x027f, TryCatch #0 {Exception -> 0x027f, blocks: (B:49:0x00e2, B:51:0x00ec, B:53:0x00fc, B:56:0x0138, B:58:0x014b, B:59:0x0160, B:61:0x016b, B:63:0x0173, B:65:0x017d, B:67:0x0187, B:69:0x0191, B:72:0x019e, B:74:0x01a6, B:77:0x01b2, B:79:0x01bd, B:83:0x0217, B:85:0x021d, B:127:0x01c9, B:129:0x01cd, B:131:0x01d5, B:133:0x01dd, B:135:0x01e5, B:137:0x01ed, B:139:0x01f5, B:141:0x01fd, B:143:0x0207, B:145:0x0211), top: B:48:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bd A[Catch: Exception -> 0x027f, TryCatch #0 {Exception -> 0x027f, blocks: (B:49:0x00e2, B:51:0x00ec, B:53:0x00fc, B:56:0x0138, B:58:0x014b, B:59:0x0160, B:61:0x016b, B:63:0x0173, B:65:0x017d, B:67:0x0187, B:69:0x0191, B:72:0x019e, B:74:0x01a6, B:77:0x01b2, B:79:0x01bd, B:83:0x0217, B:85:0x021d, B:127:0x01c9, B:129:0x01cd, B:131:0x01d5, B:133:0x01dd, B:135:0x01e5, B:137:0x01ed, B:139:0x01f5, B:141:0x01fd, B:143:0x0207, B:145:0x0211), top: B:48:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x021d A[Catch: Exception -> 0x027f, TRY_LEAVE, TryCatch #0 {Exception -> 0x027f, blocks: (B:49:0x00e2, B:51:0x00ec, B:53:0x00fc, B:56:0x0138, B:58:0x014b, B:59:0x0160, B:61:0x016b, B:63:0x0173, B:65:0x017d, B:67:0x0187, B:69:0x0191, B:72:0x019e, B:74:0x01a6, B:77:0x01b2, B:79:0x01bd, B:83:0x0217, B:85:0x021d, B:127:0x01c9, B:129:0x01cd, B:131:0x01d5, B:133:0x01dd, B:135:0x01e5, B:137:0x01ed, B:139:0x01f5, B:141:0x01fd, B:143:0x0207, B:145:0x0211), top: B:48:0x00e2 }] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.google.android.gms.internal.ads.zzuz] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.google.android.gms.internal.ads.zzve] */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.google.android.gms.internal.ads.zzuy] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzvl] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzaE() throws zzje {
        zzv zzvVar;
        boolean z;
        ?? r10;
        zzvh zzvhVar;
        zzv zzvVar2;
        long j;
        boolean z2;
        zzvb zzvbVar;
        zzve zzveVar;
        if (this.zzx != null || this.zzT || (zzvVar = this.zzo) == null) {
            return;
        }
        boolean z3 = true;
        if (zzaF(zzvVar)) {
            zzaq();
            String str = zzvVar.zzp;
            if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                this.zzj.zzm(32);
            } else {
                this.zzj.zzm(1);
            }
            this.zzT = true;
            return;
        }
        zzty zztyVar = this.zzr;
        this.zzq = zztyVar;
        if (zztyVar != null) {
            zzgsw.zzi(true);
            this.zzq.zza();
        }
        try {
            zzv zzvVar3 = this.zzo;
            MediaCrypto mediaCrypto = null;
            if (zzvVar3 == null) {
                throw null;
            }
            zzv zzvVar4 = zzvVar3;
            if (this.zzC == null) {
                try {
                    List zzaf = zzaf(this.zze, zzvVar3, false);
                    zzaf.isEmpty();
                    this.zzC = new ArrayDeque();
                    if (!zzaf.isEmpty()) {
                        this.zzC.add((zzve) zzaf.get(0));
                    }
                    this.zzD = null;
                } catch (zzvp e) {
                    throw new zzvh(zzvVar3, (Throwable) e, false, -49998);
                }
            }
            if (this.zzC.isEmpty()) {
                throw new zzvh(zzvVar3, (Throwable) null, false, -49999);
            }
            ArrayDeque arrayDeque = this.zzC;
            if (arrayDeque == null) {
                throw null;
            }
            ArrayDeque arrayDeque2 = arrayDeque;
            while (this.zzx == null) {
                zzve zzveVar2 = (zzve) arrayDeque.peekFirst();
                if (zzveVar2 == null) {
                    throw mediaCrypto;
                }
                zzve zzveVar3 = zzveVar2;
                zzaU(zzvVar3);
                if (!zzaG(zzveVar2)) {
                    return;
                }
                try {
                    this.zzE = zzveVar2;
                    zzvVar2 = this.zzo;
                } catch (Exception e2) {
                    e = e2;
                    z = z3;
                }
                if (zzvVar2 == null) {
                    throw mediaCrypto;
                }
                zzv zzvVar5 = zzvVar2;
                String str2 = zzveVar2.zza;
                float zzak = zzak(this.zzw, zzvVar2, zzJ());
                if (zzak <= this.zzf) {
                    zzak = -1.0f;
                }
                long zzb2 = zzM().zzb();
                z = z3;
                try {
                    r10 = zzah(zzveVar2, zzvVar2, mediaCrypto, zzak);
                } catch (Exception e3) {
                    e = e3;
                    r10 = zzveVar2;
                    zzef.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                    arrayDeque.removeFirst();
                    zzvh zzvhVar2 = new zzvh(zzvVar3, (Throwable) e, false, (zzve) r10);
                    zzan(zzvhVar2);
                    zzvhVar = this.zzD;
                    if (zzvhVar != null) {
                        this.zzD = zzvhVar2;
                    } else {
                        this.zzD = zzvhVar.zza(zzvhVar2);
                    }
                    if (!arrayDeque.isEmpty()) {
                        throw this.zzD;
                    }
                    z3 = z;
                    mediaCrypto = null;
                }
                try {
                    if (Build.VERSION.SDK_INT >= 31) {
                        LogSessionId zza = zzL().zza();
                        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                            j = zzb2;
                            r10.zzb.setString("log-session-id", zza.getStringId());
                            StringBuilder sb = new StringBuilder(str2.length() + 12);
                            sb.append("createCodec:");
                            sb.append(str2);
                            Trace.beginSection(sb.toString());
                            zzvb zzc = this.zzd.zzc(r10);
                            this.zzx = zzc;
                            this.zzM = zzc.zzm(new zzvj(this, null));
                            Trace.endSection();
                            long zzb3 = zzM().zzb();
                            if (!zzveVar2.zzc(this.zzc, zzvVar2)) {
                                Object[] objArr = {zzv.zze(zzvVar2), str2};
                                String str3 = zzfk.zza;
                                zzef.zzc("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
                            }
                            this.zzB = zzak;
                            this.zzy = zzvVar2;
                            this.zzF = (Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                            this.zzG = (Build.VERSION.SDK_INT == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z;
                            this.zzH = false;
                            String str4 = zzveVar2.zza;
                            if (Build.VERSION.SDK_INT <= 25) {
                                if ("OMX.rk.video_decoder.avc".equals(str4)) {
                                }
                                z2 = z;
                                this.zzK = z2;
                                zzvbVar = this.zzx;
                                if (zzvbVar != null) {
                                    throw null;
                                }
                                zzvb zzvbVar2 = zzvbVar;
                                if (zze() == 2) {
                                    try {
                                        zzveVar = zzveVar2;
                                    } catch (Exception e4) {
                                        e = e4;
                                        zzveVar = zzveVar2;
                                        r10 = zzveVar;
                                        zzef.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                        arrayDeque.removeFirst();
                                        zzvh zzvhVar22 = new zzvh(zzvVar3, (Throwable) e, false, (zzve) r10);
                                        zzan(zzvhVar22);
                                        zzvhVar = this.zzD;
                                        if (zzvhVar != null) {
                                        }
                                        if (!arrayDeque.isEmpty()) {
                                        }
                                    }
                                    try {
                                        this.zzN = zzM().zzb() + 1000;
                                    } catch (Exception e5) {
                                        e = e5;
                                        r10 = zzveVar;
                                        zzef.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                        arrayDeque.removeFirst();
                                        zzvh zzvhVar222 = new zzvh(zzvVar3, (Throwable) e, false, (zzve) r10);
                                        zzan(zzvhVar222);
                                        zzvhVar = this.zzD;
                                        if (zzvhVar != null) {
                                        }
                                        if (!arrayDeque.isEmpty()) {
                                        }
                                    }
                                } else {
                                    zzveVar = zzveVar2;
                                }
                                this.zza.zza++;
                                long j2 = zzb3 - j;
                                if (Build.VERSION.SDK_INT >= 31 && !this.zzap.isEmpty()) {
                                    zzvb zzvbVar3 = this.zzx;
                                    if (zzvbVar3 == null) {
                                        throw null;
                                    }
                                    zzvb zzvbVar4 = zzvbVar3;
                                    zzvbVar3.zzr(new ArrayList(this.zzap));
                                }
                                r10 = zzveVar;
                                try {
                                    zzal(str2, r10, zzb3, j2);
                                } catch (Exception e6) {
                                    e = e6;
                                    zzef.zzd("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r10.zza), e);
                                    arrayDeque.removeFirst();
                                    zzvh zzvhVar2222 = new zzvh(zzvVar3, (Throwable) e, false, (zzve) r10);
                                    zzan(zzvhVar2222);
                                    zzvhVar = this.zzD;
                                    if (zzvhVar != null) {
                                    }
                                    if (!arrayDeque.isEmpty()) {
                                    }
                                }
                                z3 = z;
                                mediaCrypto = null;
                            }
                            if ((Build.VERSION.SDK_INT <= 29 || (!"OMX.broadcom.video_decoder.tunnel".equals(str4) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.avc.tunnel".equals(str4) && !"OMX.bcm.vdec.avc.tunnel.secure".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel".equals(str4) && !"OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) && (!"Amazon".equals(Build.MANUFACTURER) || !"AFTS".equals(Build.MODEL) || !zzveVar2.zzf)) {
                                z2 = false;
                                this.zzK = z2;
                                zzvbVar = this.zzx;
                                if (zzvbVar != null) {
                                }
                            }
                            z2 = z;
                            this.zzK = z2;
                            zzvbVar = this.zzx;
                            if (zzvbVar != null) {
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(str2.length() + 12);
                    sb2.append("createCodec:");
                    sb2.append(str2);
                    Trace.beginSection(sb2.toString());
                    zzvb zzc2 = this.zzd.zzc(r10);
                    this.zzx = zzc2;
                    this.zzM = zzc2.zzm(new zzvj(this, null));
                    Trace.endSection();
                    long zzb32 = zzM().zzb();
                    if (!zzveVar2.zzc(this.zzc, zzvVar2)) {
                    }
                    this.zzB = zzak;
                    this.zzy = zzvVar2;
                    this.zzF = (Build.VERSION.SDK_INT > 25 && "OMX.Exynos.avc.dec.secure".equals(str2) && (Build.MODEL.startsWith("SM-T585") || Build.MODEL.startsWith("SM-A510") || Build.MODEL.startsWith("SM-A520") || Build.MODEL.startsWith("SM-J700"))) ? 2 : 0;
                    this.zzG = (Build.VERSION.SDK_INT == 29 || !"c2.android.aac.decoder".equals(str2)) ? false : z;
                    this.zzH = false;
                    String str42 = zzveVar2.zza;
                    if (Build.VERSION.SDK_INT <= 25) {
                    }
                    if (Build.VERSION.SDK_INT <= 29) {
                    }
                    z2 = false;
                    this.zzK = z2;
                    zzvbVar = this.zzx;
                    if (zzvbVar != null) {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
                j = zzb2;
            }
            this.zzC = mediaCrypto;
        } catch (zzvh e7) {
            throw zzP(e7, zzvVar, false, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
        }
    }

    protected final boolean zzaF(zzv zzvVar) {
        return this.zzr == null && zzag(zzvVar);
    }

    protected boolean zzaG(zzve zzveVar) {
        return true;
    }

    protected final boolean zzaH() {
        return this.zzT;
    }

    protected final zzvb zzaI() {
        return this.zzx;
    }

    protected final zzv zzaJ() {
        return this.zzy;
    }

    protected final MediaFormat zzaK() {
        return this.zzz;
    }

    protected final zzve zzaL() {
        return this.zzE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void zzaM() {
        try {
            zzvb zzvbVar = this.zzx;
            if (zzvbVar != null) {
                zzvbVar.zzl();
                this.zza.zzb++;
                zzve zzveVar = this.zzE;
                if (zzveVar == null) {
                    throw null;
                }
                zzve zzveVar2 = zzveVar;
                zzam(zzveVar.zza);
            }
        } finally {
            this.zzx = null;
            this.zzt = null;
            this.zzq = null;
            zzaS();
        }
    }

    protected final boolean zzaN() throws zzje {
        boolean zzax = zzax();
        if (zzax) {
            zzaE();
        }
        return zzax;
    }

    protected boolean zzaO() {
        int i = this.zzZ;
        if (i == 3 || ((this.zzG && !this.zzac) || (this.zzH && this.zzab))) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            zzbu();
            return false;
        } catch (zzje e) {
            zzef.zzd("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    protected boolean zzaP() {
        return true;
    }

    protected final long zzaQ() {
        return this.zzam;
    }

    protected void zzaR() {
        zzbm();
        zzbn();
        zzaz();
        this.zzN = C.TIME_UNSET;
        this.zzab = false;
        this.zzL = C.TIME_UNSET;
        this.zzaa = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzR = false;
        this.zzS = false;
        this.zzY = 0;
        this.zzZ = 0;
        this.zzX = this.zzW ? 1 : 0;
        this.zzal = false;
        this.zzam = 0L;
    }

    protected final void zzaS() {
        zzaR();
        this.zzC = null;
        this.zzE = null;
        this.zzy = null;
        this.zzz = null;
        this.zzA = false;
        this.zzac = false;
        this.zzB = -1.0f;
        this.zzF = 0;
        this.zzG = false;
        this.zzH = false;
        this.zzK = false;
        this.zzM = false;
        this.zzW = false;
        this.zzX = 0;
    }

    protected zzvd zzaT(Throwable th, zzve zzveVar) {
        return new zzvd(th, zzveVar);
    }

    protected boolean zzaU(zzv zzvVar) throws zzje {
        return true;
    }

    protected void zzaV(zzip zzipVar) throws zzje {
    }

    protected int zzaW(zzip zzipVar) {
        return 0;
    }

    protected boolean zzaX(zzip zzipVar) {
        return false;
    }

    protected final long zzaY() {
        return this.zzai;
    }

    protected void zzaZ(long j) {
        this.zzai = j;
        while (true) {
            ArrayDeque arrayDeque = this.zzl;
            if (arrayDeque.isEmpty() || j < ((zzvk) arrayDeque.peek()).zzb) {
                return;
            }
            zzvk zzvkVar = (zzvk) arrayDeque.poll();
            zzvkVar.getClass();
            zzbs(zzvkVar);
            zzar();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public boolean zzaa() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzmu
    public boolean zzab() {
        return this.zzaf;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final int zzad(zzv zzvVar) throws zzje {
        try {
            return zzae(this.zze, zzvVar);
        } catch (zzvp e) {
            throw zzP(e, zzvVar, false, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    protected abstract int zzae(zzvn zzvnVar, zzv zzvVar) throws zzvp;

    protected abstract List zzaf(zzvn zzvnVar, zzv zzvVar, boolean z) throws zzvp;

    protected boolean zzag(zzv zzvVar) {
        return false;
    }

    protected abstract zzuy zzah(zzve zzveVar, zzv zzvVar, MediaCrypto mediaCrypto, float f);

    protected zziw zzai(zzve zzveVar, zzv zzvVar, zzv zzvVar2) {
        throw null;
    }

    protected long zzaj(long j, long j2, boolean z) {
        return super.zzV(j, j2);
    }

    protected float zzak(float f, zzv zzvVar, zzv[] zzvVarArr) {
        throw null;
    }

    protected void zzal(String str, zzuy zzuyVar, long j, long j2) {
        throw null;
    }

    protected void zzam(String str) {
        throw null;
    }

    protected void zzan(Exception exc) {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (zzbp() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
    
        if (zzbp() == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d5, code lost:
    
        if (zzbp() == false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected zziw zzao(zzlq zzlqVar) throws zzje {
        int i;
        boolean z = true;
        this.zzag = true;
        zzv zzvVar = zzlqVar.zzb;
        zzvVar.getClass();
        String str = zzvVar.zzp;
        if (str == null) {
            throw zzP(new IllegalArgumentException("Sample MIME type is null."), zzvVar, false, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(str, MimeTypes.VIDEO_VP9) || (Objects.equals(str, MimeTypes.VIDEO_DOLBY_VISION) && Objects.equals(zzvx.zzg(zzvVar), "video/av01"))) && !zzvVar.zzs.isEmpty()) {
            zzt zza = zzvVar.zza();
            zza.zzr(null);
            zzvVar = zza.zzO();
        }
        zzv zzvVar2 = zzvVar;
        this.zzr = zzlqVar.zza;
        this.zzo = zzvVar2;
        if (this.zzT) {
            this.zzV = true;
            return null;
        }
        zzvb zzvbVar = this.zzx;
        if (zzvbVar == null) {
            this.zzC = null;
            zzaE();
            return null;
        }
        zzve zzveVar = this.zzE;
        zzveVar.getClass();
        zzv zzvVar3 = this.zzy;
        zzvVar3.getClass();
        zzty zztyVar = this.zzq;
        zzty zztyVar2 = this.zzr;
        if (zztyVar != zztyVar2) {
            zzbq();
            return new zziw(zzveVar.zza, zzvVar3, zzvVar2, 0, 128);
        }
        zziw zzai = zzai(zzveVar, zzvVar3, zzvVar2);
        int i2 = zzai.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                if (zzbo(zzvVar2)) {
                    this.zzy = zzvVar2;
                    if (zztyVar2 == zztyVar) {
                        if (this.zzaa) {
                            this.zzY = 1;
                            if (this.zzH) {
                                this.zzZ = 3;
                                i = 2;
                            } else {
                                this.zzZ = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (zzbo(zzvVar2)) {
                    this.zzy = zzvVar2;
                    if (zztyVar2 != zztyVar) {
                    }
                }
                i = 16;
            } else {
                if (zzbo(zzvVar2)) {
                    this.zzW = true;
                    this.zzX = 1;
                    int i3 = this.zzF;
                    if (i3 != 2 && (i3 != 1 || zzvVar2.zzw != zzvVar3.zzw || zzvVar2.zzx != zzvVar3.zzx)) {
                        z = false;
                    }
                    this.zzI = z;
                    this.zzy = zzvVar2;
                    if (zztyVar2 != zztyVar) {
                    }
                }
                i = 16;
            }
            return (i2 != 0 || (this.zzx == zzvbVar && this.zzZ != 3)) ? zzai : new zziw(zzveVar.zza, zzvVar3, zzvVar2, 0, i);
        }
        zzbq();
        i = 0;
        if (i2 != 0) {
        }
    }

    protected void zzap(zzv zzvVar, MediaFormat mediaFormat) throws zzje {
        throw null;
    }

    protected void zzar() {
    }

    protected abstract boolean zzas(long j, long j2, zzvb zzvbVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzv zzvVar) throws zzje;

    protected abstract void zzat(zzit zzitVar);

    protected void zzau() throws zzje {
        throw null;
    }

    protected void zzav(zzip zzipVar) throws zzje {
        throw null;
    }

    protected final boolean zzba() {
        if (this.zzo == null) {
            return false;
        }
        if (zzS() || zzaC()) {
            return true;
        }
        return this.zzN != C.TIME_UNSET && zzM().zzb() < this.zzN;
    }

    protected final float zzbb() {
        return this.zzv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmt zzbc() {
        return this.zzs;
    }

    protected final boolean zzbd() throws zzje {
        return zzbo(this.zzy);
    }

    protected final long zzbe() {
        return this.zzah.zzf;
    }

    protected final long zzbf() {
        return this.zzad;
    }

    protected final long zzbg() {
        return this.zzah.zzd;
    }

    protected final long zzbh() {
        return this.zzah.zzc;
    }

    protected final void zzbi(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.zzan.zzb(mediaFormat);
        }
    }

    final /* synthetic */ void zzbk(zzlq zzlqVar) {
        this.zzn.set(zzQ(zzlqVar, this.zzh, 0));
    }

    final /* synthetic */ zzmt zzbl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmw
    public final int zzu() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzir, com.google.android.gms.internal.ads.zzmp
    public void zzx(int i, Object obj) throws zzje {
        if (i != 11) {
            return;
        }
        zzmt zzmtVar = (zzmt) obj;
        zzmtVar.getClass();
        this.zzs = zzmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzir
    protected void zzy(boolean z, boolean z2) throws zzje {
        this.zza = new zziv();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void zzz(zzv[] zzvVarArr, long j, long j2, zzxc zzxcVar) throws zzje {
        if (this.zzah.zzd == C.TIME_UNSET) {
            zzbs(new zzvk(C.TIME_UNSET, j, j2));
            if (this.zzak) {
                zzar();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.zzl;
        if (arrayDeque.isEmpty()) {
            long j3 = this.zzad;
            if (j3 != C.TIME_UNSET) {
                long j4 = this.zzai;
                if (j4 != C.TIME_UNSET) {
                }
            }
            zzbs(new zzvk(C.TIME_UNSET, j, j2));
            if (this.zzah.zzd != C.TIME_UNSET) {
                zzar();
                return;
            }
            return;
        }
        arrayDeque.add(new zzvk(this.zzad, j, j2));
    }

    private final void zzbu() throws zzje {
        zzty zztyVar = this.zzr;
        zztyVar.getClass();
        this.zzq = zztyVar;
        this.zzY = 0;
        this.zzZ = 0;
    }

    private final void zzbr() throws zzje {
        int i = this.zzZ;
        if (i == 1) {
            zzay();
            return;
        }
        if (i == 2) {
            zzay();
            zzbu();
        } else if (i != 3) {
            this.zzaf = true;
            zzau();
        } else {
            zzaM();
            zzaE();
        }
    }
}
