package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zztj implements zzrw {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;
    private ByteBuffer zzH;
    private int zzI;
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzte zzZ;
    private final Context zzb;
    private final zzsy zzc;
    private final zztv zzd;
    private final zzcv zze;
    private final zztu zzf;
    private final zzgvz zzg;
    private final ArrayDeque zzh;
    private zzta zzi;
    private final zzti zzj;
    private final zzti zzk;
    private zzpz zzl;
    private zzrt zzm;
    private zztd zzn;
    private zztd zzo;
    private zzck zzp;
    private final zzqz zzq;
    private zzqw zzr;
    private zzqp zzs;
    private zzd zzt;
    private zzth zzu;
    private zzth zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    static /* synthetic */ boolean zzH() {
        return zza.get() > 0;
    }

    private final void zzQ() {
        zzck zzk = this.zzo.zzk();
        this.zzp = zzk;
        zzk.zzb(zzcm.zza);
    }

    private final zzqp zzR(zzqy zzqyVar) throws zzrs {
        try {
            return ((zzsv) this.zzq).zzf(zzqyVar);
        } catch (zzqv e) {
            zzrs zzrsVar = new zzrs(0, zzqyVar.zzb, zzqyVar.zzc, zzqyVar.zza, zzqyVar.zze, this.zzo.zzf(), false, e);
            zzrt zzrtVar = this.zzm;
            if (zzrtVar == null) {
                throw zzrsVar;
            }
            zzrtVar.zza(zzrsVar);
            throw zzrsVar;
        }
    }

    private final void zzS(long j) throws zzrv {
        zzV(j);
        if (this.zzJ != null) {
            return;
        }
        if (!this.zzp.zzc()) {
            ByteBuffer byteBuffer = this.zzH;
            if (byteBuffer != null) {
                zzU(byteBuffer);
                zzV(j);
                return;
            }
            return;
        }
        while (!this.zzp.zzg()) {
            do {
                ByteBuffer zze = this.zzp.zze();
                if (zze.hasRemaining()) {
                    zzU(zze);
                    zzV(j);
                } else {
                    ByteBuffer byteBuffer2 = this.zzH;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.zzp.zzd(this.zzH);
                    }
                }
            } while (this.zzJ == null);
            return;
        }
    }

    private final boolean zzT() throws zzrv {
        if (!this.zzp.zzc()) {
            zzV(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzS(Long.MIN_VALUE);
        if (!this.zzp.zzg()) {
            return false;
        }
        ByteBuffer byteBuffer = this.zzJ;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x023a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0226  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzU(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        zzgsw.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zze()) {
                int zzu = (int) zzfk.zzu(zzfk.zzs(20L), this.zzo.zzj().zzb);
                long zzad = zzad();
                long j = zzu;
                if (zzad < j) {
                    int i9 = this.zzo.zzj().zza;
                    int zzi = this.zzo.zzi();
                    ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int position = byteBuffer.position();
                    int i10 = (int) zzad;
                    while (byteBuffer.hasRemaining() && i10 < zzu) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i9 != 4) {
                                if (i9 != 21) {
                                    if (i9 == 22) {
                                        int i11 = byteBuffer.get() & 255;
                                        int i12 = (byteBuffer.get() & 255) << 8;
                                        int i13 = (byteBuffer.get() & 255) << 16;
                                        i7 = (byteBuffer.get() & 255) << 24;
                                        i8 = i11 | i12 | i13;
                                    } else if (i9 == 268435456) {
                                        i = (byteBuffer.get() & 255) << 24;
                                        i2 = (byteBuffer.get() & 255) << 16;
                                    } else if (i9 == 1342177280) {
                                        i4 = (byteBuffer.get() & 255) << 24;
                                        i5 = (byteBuffer.get() & 255) << 16;
                                        i6 = (byteBuffer.get() & 255) << 8;
                                    } else if (i9 == 1610612736) {
                                        int i14 = (byteBuffer.get() & 255) << 24;
                                        int i15 = (byteBuffer.get() & 255) << 16;
                                        int i16 = (byteBuffer.get() & 255) << 8;
                                        i7 = byteBuffer.get() & 255;
                                        i8 = i16 | i14 | i15;
                                    } else {
                                        if (i9 != 1879048192) {
                                            throw new IllegalStateException();
                                        }
                                        double zzm = zzfk.zzm(byteBuffer.getDouble(), -1.0d, 1.0d);
                                        i3 = (int) (zzm < 0.0d ? (-zzm) * (-2.147483648E9d) : zzm * 2.147483647E9d);
                                    }
                                    i3 = i8 | i7;
                                } else {
                                    i4 = (byteBuffer.get() & 255) << 8;
                                    i5 = (byteBuffer.get() & 255) << 16;
                                    i6 = (byteBuffer.get() & 255) << 24;
                                }
                                i3 = i4 | i5 | i6;
                            } else {
                                float max = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                i3 = (int) (max < 0.0f ? (-max) * (-2.1474836E9f) : max * 2.1474836E9f);
                            }
                            int i17 = (int) ((i3 * i10) / j);
                            if (i9 != 2) {
                                order.put((byte) (i17 >> 16));
                                order.put((byte) (i17 >> 24));
                            } else if (i9 == 3) {
                                order.put((byte) (i17 >> 24));
                            } else if (i9 != 4) {
                                if (i9 == 21) {
                                    order.put((byte) (i17 >> 8));
                                    order.put((byte) (i17 >> 16));
                                    order.put((byte) (i17 >> 24));
                                } else if (i9 == 22) {
                                    order.put((byte) i17);
                                    order.put((byte) (i17 >> 8));
                                    order.put((byte) (i17 >> 16));
                                    order.put((byte) (i17 >> 24));
                                } else if (i9 == 268435456) {
                                    order.put((byte) (i17 >> 24));
                                    order.put((byte) (i17 >> 16));
                                } else if (i9 == 1342177280) {
                                    order.put((byte) (i17 >> 24));
                                    order.put((byte) (i17 >> 16));
                                    order.put((byte) (i17 >> 8));
                                } else if (i9 == 1610612736) {
                                    order.put((byte) (i17 >> 24));
                                    order.put((byte) (i17 >> 16));
                                    order.put((byte) (i17 >> 8));
                                    order.put((byte) i17);
                                } else {
                                    if (i9 != 1879048192) {
                                        throw new IllegalStateException();
                                    }
                                    if (i17 < 0) {
                                        order.putDouble((-i17) / (-2.147483648E9d));
                                    } else {
                                        order.putDouble(i17 / 2.147483647E9d);
                                    }
                                }
                            } else if (i17 < 0) {
                                order.putFloat((-i17) / (-2.1474836E9f));
                            } else {
                                order.putFloat(i17 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() != position + zzi) {
                                i10++;
                                position = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            i2 = (byteBuffer.get() & 255) << 24;
                        }
                        i3 = i2 | i;
                        int i172 = (int) ((i3 * i10) / j);
                        if (i9 != 2) {
                        }
                        if (byteBuffer.position() != position + zzi) {
                        }
                    }
                    order.put(byteBuffer);
                    order.flip();
                    byteBuffer2 = order;
                    this.zzJ = byteBuffer2;
                }
            }
            byteBuffer2 = byteBuffer;
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzV(long j) throws zzrv {
        zzrt zzrtVar;
        zzrt zzrtVar2;
        if (this.zzJ == null || this.zzk.zzb()) {
            return;
        }
        int remaining = this.zzJ.remaining();
        try {
            boolean zzc = this.zzs.zzc(this.zzJ, this.zzI, j);
            this.zzT = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzrtVar2 = this.zzm) != null && !zzc) {
                }
            }
            if (this.zzo.zze()) {
                this.zzA += remaining - this.zzJ.remaining();
            }
            if (zzc) {
                if (!this.zzo.zze()) {
                    zzgsw.zzi(this.zzJ == this.zzH);
                    this.zzB += this.zzC * this.zzI;
                }
                this.zzJ = null;
            }
        } catch (zzqo e) {
            boolean z = e.zzb;
            if (z) {
                if (zzad() <= 0) {
                    if (this.zzs.zzg()) {
                        zzW();
                    }
                }
                zzrv zzrvVar = new zzrv(e.zza, this.zzo.zzf(), r3);
                zzrtVar = this.zzm;
                if (zzrtVar != null) {
                    zzrtVar.zza(zzrvVar);
                }
                if (!z) {
                    throw zzrvVar;
                }
                this.zzk.zza(zzrvVar);
                return;
            }
            r3 = false;
            zzrv zzrvVar2 = new zzrv(e.zza, this.zzo.zzf(), r3);
            zzrtVar = this.zzm;
            if (zzrtVar != null) {
            }
            if (!z) {
            }
        }
    }

    private final void zzW() {
        this.zzo.zzj();
    }

    private final void zzX() {
        if (zzac()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzY() {
        if (this.zzo != null) {
            zztd zztdVar = this.zzn;
            if (zztdVar != null) {
                this.zzo = zztdVar;
                this.zzn = null;
            }
            try {
                this.zzo = new zztd(this.zzo.zzf(), this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzq.zzb(zzae(this.zzo.zzg(), -1)), this.zzo.zzk(), null);
            } catch (zzqq e) {
                throw new IllegalStateException(new zzrr(e, this.zzo.zzf()));
            }
        }
        zzB();
    }

    private final void zzZ(zzav zzavVar) {
        zzth zzthVar = new zzth(zzavVar, C.TIME_UNSET, C.TIME_UNSET, null);
        if (zzac()) {
            this.zzu = zzthVar;
        } else {
            this.zzv = zzthVar;
        }
    }

    private final void zzaa(long j) {
        zzav zzavVar;
        boolean z;
        if (zzab()) {
            zzte zzteVar = this.zzZ;
            zzavVar = this.zzw;
            zzteVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzab()) {
            zzte zzteVar2 = this.zzZ;
            z = this.zzx;
            zzteVar2.zzc(z);
        } else {
            z = false;
        }
        this.zzx = z;
        this.zzh.add(new zzth(zzavVar2, Math.max(0L, j), this.zzo.zzc(zzad()), null));
        zzQ();
        zzrt zzrtVar = this.zzm;
        if (zzrtVar != null) {
            ((zzto) zzrtVar).zza.zzaz().zzh(this.zzx);
        }
    }

    private final boolean zzab() {
        if (!this.zzo.zze()) {
            return false;
        }
        int i = this.zzo.zzf().zzJ;
        return true;
    }

    private final boolean zzac() {
        return this.zzs != null;
    }

    private final long zzad() {
        if (!this.zzo.zze()) {
            return this.zzB;
        }
        long j = this.zzA;
        long zzi = this.zzo.zzi();
        String str = zzfk.zza;
        return ((j + zzi) - 1) / zzi;
    }

    private final zzqs zzae(zzv zzvVar, int i) {
        zzqr zzqrVar = new zzqr(zzvVar);
        zzqrVar.zza(this.zzt);
        zzqrVar.zzb(this.zzR);
        zzqrVar.zzc(this.zzO);
        zzqrVar.zze(-1);
        zzqrVar.zzd(this.zzS);
        return new zzqs(zzqrVar, null);
    }

    private final void zzaf() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    private static int zzag(int i) {
        if (i == 0 || i == -1) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzA() {
        this.zzN = false;
        if (zzac()) {
            this.zzs.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzB() {
        if (zzac()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzth(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzQ();
            this.zzi = null;
            zztd zztdVar = this.zzn;
            if (zztdVar != null) {
                this.zzo = zztdVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzC() {
        zzB();
        zzgvz zzgvzVar = this.zzg;
        int size = zzgvzVar.size();
        for (int i = 0; i < size; i++) {
            ((zzco) zzgvzVar.get(i)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzD() {
        this.zzq.zze();
    }

    final /* synthetic */ void zzF() {
        if (this.zzX >= 300000) {
            ((zzto) this.zzm).zza.zzaB(true);
            this.zzX = 0L;
        }
    }

    final /* synthetic */ void zzG() {
        zzrt zzrtVar = this.zzm;
        if (zzrtVar != null) {
            ((zzto) zzrtVar).zza.zzT();
        }
    }

    final /* synthetic */ zzta zzJ() {
        return this.zzi;
    }

    final /* synthetic */ zzrt zzK() {
        return this.zzm;
    }

    final /* synthetic */ zztd zzL() {
        return this.zzo;
    }

    final /* synthetic */ zzqp zzM() {
        return this.zzs;
    }

    final /* synthetic */ void zzN(boolean z) {
        this.zzM = true;
    }

    final /* synthetic */ boolean zzO() {
        return this.zzN;
    }

    final /* synthetic */ long zzP() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zza(zzrt zzrtVar) {
        this.zzm = zzrtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzb(zzpz zzpzVar) {
        this.zzl = zzpzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzc(zzdo zzdoVar) {
        this.zzq.zzd(zzdoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzd(zzv zzvVar) {
        return zze(zzvVar) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final int zze(zzv zzvVar) {
        boolean z;
        int i = zzvVar.zzJ;
        if (!zzfk.zzC(i) || i == 2) {
            z = false;
        } else {
            zzt zza2 = zzvVar.zza();
            zza2.zzI(2);
            zzvVar = zza2.zzO();
            z = true;
        }
        int i2 = this.zzq.zza(zzae(zzvVar, -1)).zzd;
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 2) {
            return 0;
        }
        return z ? 1 : 2;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzqm zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzqm.zza;
        }
        zzqu zza2 = this.zzq.zza(zzae(zzvVar, -1));
        zzql zzqlVar = new zzql();
        zzqlVar.zza(zza2.zza);
        zzqlVar.zzb(zza2.zzb);
        zzqlVar.zzc(zza2.zzc);
        return zzqlVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final long zzg(boolean z) {
        ArrayDeque arrayDeque;
        long j;
        if (!zzac() || this.zzE) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzs.zzk(), this.zzo.zzc(zzad()));
        while (true) {
            arrayDeque = this.zzh;
            if (arrayDeque.isEmpty() || min < ((zzth) arrayDeque.getFirst()).zzc) {
                break;
            }
            this.zzv = (zzth) arrayDeque.remove();
        }
        zzth zzthVar = this.zzv;
        long j2 = min - zzthVar.zzc;
        long zzx = zzfk.zzx(j2, zzthVar.zza.zzb);
        if (arrayDeque.isEmpty()) {
            long zzd = this.zzZ.zzd(j2);
            zzth zzthVar2 = this.zzv;
            j = zzthVar2.zzb + zzd;
            zzthVar2.zzd = zzd - zzx;
        } else {
            zzth zzthVar3 = this.zzv;
            j = zzthVar3.zzb + zzx + zzthVar3.zzd;
        }
        long zze = this.zzZ.zze();
        long zzc = j + this.zzo.zzc(zze);
        long j3 = this.zzW;
        if (zze > j3) {
            long zzc2 = this.zzo.zzc(zze - j3);
            this.zzW = zze;
            this.zzX += zzc2;
            if (this.zzY == null) {
                this.zzY = new Handler(Looper.myLooper());
            }
            this.zzY.removeCallbacksAndMessages(null);
            this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zztg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zztj.this.zzF();
                }
            }, 100L);
        }
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzh(zzv zzvVar, int i, int[] iArr) throws zzrr {
        zzck zzckVar;
        zzv zzvVar2;
        int i2;
        int i3;
        if (this.zzr == null && this.zzb != null) {
            zzqw zzqwVar = new zzqw() { // from class: com.google.android.gms.internal.ads.zztf
                @Override // com.google.android.gms.internal.ads.zzqw
                public final /* synthetic */ void zza() {
                    zztj.this.zzG();
                }
            };
            this.zzr = zzqwVar;
            this.zzq.zzc(zzqwVar);
        }
        if (MimeTypes.AUDIO_RAW.equals(zzvVar.zzp)) {
            int i4 = zzvVar.zzJ;
            zzgsw.zza(zzfk.zzC(i4));
            int i5 = zzvVar.zzH;
            i2 = zzfk.zzF(i4) * i5;
            zzgvw zzgvwVar = new zzgvw();
            zzgvwVar.zzh(this.zzg);
            zzgvwVar.zzf(this.zze);
            zzgvwVar.zzg(this.zzZ.zza());
            zzckVar = new zzck(zzgvwVar.zzi());
            if (zzckVar.equals(this.zzp)) {
                zzckVar = this.zzp;
            }
            this.zzd.zzq(zzvVar.zzK, zzvVar.zzL);
            this.zzc.zzq(iArr);
            try {
                zzcl zza2 = zzckVar.zza(new zzcl(zzvVar.zzI, i5, i4));
                zzt zza3 = zzvVar.zza();
                int i6 = zza2.zzd;
                zza3.zzI(i6);
                zza3.zzH(zza2.zzb);
                int i7 = zza2.zzc;
                zza3.zzG(i7);
                zzvVar2 = zza3.zzO();
                i3 = zzfk.zzF(i6) * i7;
            } catch (zzcn e) {
                throw new zzrr(e, zzvVar);
            }
        } else {
            zzckVar = new zzck(zzgvz.zzi());
            zzvVar2 = zzvVar;
            i2 = -1;
            i3 = -1;
        }
        zzck zzckVar2 = zzckVar;
        zzqs zzae = zzae(zzvVar2, -1);
        try {
            zzqy zzb = this.zzq.zzb(zzae);
            if (zzb.zza == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(false).length() + 36);
                sb.append("Invalid output encoding (isOffload=false)");
                throw new zzrr(sb.toString(), zzae.zza);
            }
            if (zzb.zzc == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 42);
                sb2.append("Invalid output channel config (isOffload=false)");
                throw new zzrr(sb2.toString(), zzae.zza);
            }
            this.zzU = false;
            zztd zztdVar = new zztd(zzvVar, zzvVar2, i2, i3, zzb, zzckVar2, null);
            if (zzac()) {
                this.zzn = zztdVar;
            } else {
                this.zzo = zztdVar;
            }
        } catch (zzqq e2) {
            throw new zzrr(e2, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzi() {
        this.zzN = true;
        if (zzac()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzrs, zzrv {
        zzqp zzqpVar;
        long j2;
        long j3;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgsw.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzT()) {
                return false;
            }
            if (this.zzs != null) {
                zzqy zzj = this.zzo.zzj();
                zzae(this.zzn.zzg(), -1);
                if (!this.zzn.zzj().equals(zzj)) {
                    zzaf();
                    if (zzn()) {
                        return false;
                    }
                    zzB();
                    zzaa(j);
                }
            }
            this.zzo = this.zzn;
            this.zzn = null;
            zzqp zzqpVar2 = this.zzs;
            if (zzqpVar2 != null && zzqpVar2.zzg()) {
                this.zzo.zzj();
            }
            zzaa(j);
        }
        if (!zzac()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqpVar = zzR(this.zzo.zzj());
                } catch (zzrs e) {
                    int i2 = this.zzo.zzj().zze;
                    while (i2 > 1000000) {
                        int i3 = i2 >> 1;
                        int zzi = this.zzo.zzi() != -1 ? this.zzo.zzi() : 1;
                        int i4 = i3 % zzi;
                        if (i4 != 0) {
                            i3 += zzi - i4;
                        }
                        int i5 = i3;
                        zzqx zzqxVar = new zzqx(this.zzo.zzj(), null);
                        zzqxVar.zze(i5);
                        zzqy zzqyVar = new zzqy(zzqxVar, null);
                        try {
                            zzqp zzR = zzR(zzqyVar);
                            this.zzo = this.zzo.zza(zzqyVar);
                            zzqpVar = zzR;
                        } catch (zzrs e2) {
                            e.addSuppressed(e2);
                            i2 = i5;
                        }
                    }
                    zzW();
                    throw e;
                }
                this.zzs = zzqpVar;
                zzta zztaVar = new zzta(this, this.zzo.zzj(), bArr);
                this.zzi = zztaVar;
                this.zzs.zzm(zztaVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzj();
                }
                zzpz zzpzVar = this.zzl;
                if (zzpzVar != null) {
                    this.zzs.zzn(zzpzVar);
                }
                zzX();
                int i6 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int zzh = this.zzs.zzh();
                int i7 = this.zzO;
                this.zzO = zzh;
                zzrt zzrtVar = this.zzm;
                if (zzrtVar != null) {
                    ((zzto) zzrtVar).zza.zzaz().zzk(this.zzo.zzd());
                    if (zzh != i7) {
                        this.zzP = true;
                        zztd zztdVar = this.zzo;
                        zzqx zzqxVar2 = new zzqx(zztdVar.zzj(), null);
                        zzqxVar2.zzg(this.zzO);
                        this.zzo = zztdVar.zza(new zzqy(zzqxVar2, null));
                        zztd zztdVar2 = this.zzn;
                        if (zztdVar2 != null) {
                            zzqx zzqxVar3 = new zzqx(zztdVar2.zzj(), null);
                            zzqxVar3.zzg(this.zzO);
                            this.zzn = zztdVar2.zza(new zzqy(zzqxVar3, null));
                        }
                        zzrt zzrtVar2 = this.zzm;
                        int i8 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zztp zztpVar = ((zzto) zzrtVar2).zza;
                            if (zztpVar.zzaA() != null) {
                                zztpVar.zzaA().zza(i8);
                            }
                        }
                        ((zzto) zzrtVar2).zza.zzaz().zzm(i8);
                    }
                }
            } catch (zzrs e3) {
                this.zzj.zza(e3);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j);
            this.zzD = false;
            this.zzE = false;
            zzaa(j);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgsw.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zze() && this.zzC == 0) {
                int zzE = zzE(this.zzo.zzj().zza, byteBuffer);
                this.zzC = zzE;
                if (zzE == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzT()) {
                    return false;
                }
                zzaa(j);
                this.zzu = null;
            }
            long j4 = this.zzF;
            zztd zztdVar3 = this.zzo;
            if (zztdVar3.zze()) {
                j2 = 0;
                j3 = this.zzy / this.zzo.zzh();
            } else {
                j2 = 0;
                j3 = this.zzz;
            }
            long zzb = j4 + zztdVar3.zzb(j3 - this.zzd.zzs());
            if (!this.zzD && Math.abs(zzb - j) > 200000) {
                zzrt zzrtVar3 = this.zzm;
                if (zzrtVar3 != null) {
                    zzrtVar3.zza(new zzru(j, zzb));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzT()) {
                    return false;
                }
                long j5 = j - zzb;
                this.zzF += j5;
                this.zzD = false;
                zzaa(j);
                zzrt zzrtVar4 = this.zzm;
                if (zzrtVar4 != null && j5 != j2) {
                    ((zzto) zzrtVar4).zza.zzaq();
                }
            }
            if (this.zzo.zze()) {
                this.zzy += byteBuffer.remaining();
            } else {
                this.zzz += this.zzC * i;
            }
            this.zzH = byteBuffer;
            this.zzI = i;
        }
        zzS(j);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzef.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzB();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzl() throws zzrv {
        if (!this.zzK && zzac() && zzT()) {
            zzaf();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzm() {
        if (zzac()) {
            return this.zzK && !zzn();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final boolean zzn() {
        if (!zzac()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.zzs.zzg() && this.zzM) {
            return false;
        }
        long zzad = zzad();
        long zzk = this.zzs.zzk();
        zzqp zzqpVar = this.zzs;
        zzqpVar.getClass();
        return zzad > zzfk.zzu(zzk, zzqpVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzo(zzav zzavVar) {
        float f = zzavVar.zzb;
        String str = zzfk.zza;
        zzav zzavVar2 = new zzav(Math.max(0.1f, Math.min(f, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        this.zzw = zzavVar2;
        zzZ(zzavVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzq(boolean z) {
        this.zzx = z;
        zzZ(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final zzqb zzs() {
        zzqz zzqzVar = this.zzq;
        if (zzqzVar instanceof zzsv) {
            return ((zzsv) zzqzVar).zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzt(int i) {
        if (this.zzP) {
            if (this.zzO != i) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i) {
            this.zzO = i;
            zzY();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzu(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzv(AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzqp zzqpVar = this.zzs;
        if (zzqpVar != null) {
            zzqpVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzw(int i) {
        int i2 = this.zzS;
        int zzag = zzag(i);
        if (i2 == zzag) {
            return;
        }
        this.zzS = zzag;
        zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final long zzx() {
        if (!zzac()) {
            return C.TIME_UNSET;
        }
        if (this.zzo.zze()) {
            return this.zzo.zzc(this.zzs.zzj());
        }
        long zzj = this.zzs.zzj();
        int zzf = zzaft.zzf(this.zzo.zzj().zza);
        zzgsw.zzi(zzf != -2147483647);
        return zzfk.zzv(zzj, 1000000L, zzf, RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzy(int i, int i2) {
        zzqp zzqpVar = this.zzs;
        if (zzqpVar != null) {
            zzqpVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrw
    public final void zzz(float f) {
        if (this.zzG != f) {
            this.zzG = f;
            zzX();
        }
    }

    /* synthetic */ zztj(zztc zztcVar, byte[] bArr) {
        this.zzb = zztcVar.zzb() == null ? null : zztcVar.zzb().getApplicationContext();
        this.zzt = zzd.zza;
        this.zzZ = zztcVar.zzd();
        this.zzq = zztcVar.zzc();
        zzsy zzsyVar = new zzsy();
        this.zzc = zzsyVar;
        zztv zztvVar = new zztv();
        this.zzd = zztvVar;
        this.zze = new zzcv();
        this.zzf = new zztu();
        this.zzg = zzgvz.zzk(zztvVar, zzsyVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzth(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zzti();
        this.zzk = new zzti();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && zztcVar.zzb() != null) {
            i = zzag(zztcVar.zzb().getDeviceId());
        }
        this.zzS = i;
    }

    static int zzE(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        if (i == 20) {
            return zzgu.zzb(byteBuffer);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int zzb = zzagn.zzb(zzfk.zzL(byteBuffer, byteBuffer.position()));
                    if (zzb != -1) {
                        return zzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int i6 = zzaeq.zza;
                            int position = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i7 = position;
                            while (true) {
                                if (i7 > limit) {
                                    i5 = -1;
                                } else if ((zzfk.zzL(byteBuffer, i7 + 4) & (-2)) == -126718022) {
                                    i5 = i7 - position;
                                } else {
                                    i7++;
                                }
                            }
                            if (i5 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i5) + ((byteBuffer.get((byteBuffer.position() + i5) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i8 = zzaet.zza;
                            byte[] bArr = new byte[16];
                            int position2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position2);
                            return zzaet.zzb(new zzer(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
                            sb.append("Unexpected audio encoding: ");
                            sb.append(i);
                            throw new IllegalStateException(sb.toString());
                    }
            }
            return zzaeq.zze(byteBuffer);
        }
        int i9 = zzafo.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position3 = byteBuffer.position();
        byte b2 = byteBuffer.get(position3);
        if (b2 != -2) {
            if (b2 == -1) {
                i3 = (byteBuffer.get(position3 + 4) & 7) << 4;
                b = byteBuffer.get(position3 + 7);
            } else if (b2 != 31) {
                i3 = (byteBuffer.get(position3 + 4) & 1) << 6;
                i4 = byteBuffer.get(position3 + 5) & 252;
                i2 = (i4 >> 2) | i3;
            } else {
                i3 = (byteBuffer.get(position3 + 5) & 7) << 4;
                b = byteBuffer.get(position3 + 6);
            }
            i4 = b & 60;
            i2 = (i4 >> 2) | i3;
        } else {
            i2 = ((byteBuffer.get(position3 + 5) & 1) << 6) | ((byteBuffer.get(position3 + 4) & 252) >> 2);
        }
        return (i2 + 1) * 32;
    }
}
