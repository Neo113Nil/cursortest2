package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzwo<T> implements zzwx<T> {
    private final zzwk zza;
    private final zzxo<?, ?> zzb;
    private final boolean zzc;
    private final zzuk<?> zzd;

    private zzwo(zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwk zzwkVar) {
        this.zzb = zzxoVar;
        this.zzc = zzukVar.zzi(zzwkVar);
        this.zzd = zzukVar;
        this.zza = zzwkVar;
    }

    static <T> zzwo<T> zzc(zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwk zzwkVar) {
        return new zzwo<>(zzxoVar, zzukVar, zzwkVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zza(T t2) {
        zzxo<?, ?> zzxoVar = this.zzb;
        int zzb = zzxoVar.zzb(zzxoVar.zzd(t2));
        return this.zzc ? zzb + this.zzd.zzb(t2).zzb() : zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zzb(T t2) {
        int hashCode = this.zzb.zzd(t2).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(t2).zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final T zze() {
        return (T) this.zza.zzao().zzD();
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzf(T t2) {
        this.zzb.zzm(t2);
        this.zzd.zzf(t2);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzg(T t2, T t11) {
        zzwz.zzF(this.zzb, t2, t11);
        if (this.zzc) {
            zzwz.zzE(this.zzd, t2, t11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzh(T t2, zzww zzwwVar, zzuj zzujVar) throws IOException {
        boolean zzT;
        zzxo<?, ?> zzxoVar = this.zzb;
        zzuk<?> zzukVar = this.zzd;
        Object zzc = zzxoVar.zzc(t2);
        zzuo<?> zzc2 = zzukVar.zzc(t2);
        while (zzwwVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzwwVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zzd2 = zzukVar.zzd(zzujVar, this.zza, zzd >>> 3);
                        if (zzd2 != null) {
                            zzukVar.zzg(zzwwVar, zzd2, zzujVar, zzc2);
                        } else {
                            zzT = zzxoVar.zzp(zzc, zzwwVar);
                        }
                    } else {
                        zzT = zzwwVar.zzT();
                    }
                    if (!zzT) {
                        zzxoVar.zzn(t2, zzc);
                        return;
                    }
                } else {
                    Object obj = null;
                    int i11 = 0;
                    zztd zztdVar = null;
                    while (zzwwVar.zzc() != Integer.MAX_VALUE) {
                        int zzd3 = zzwwVar.zzd();
                        if (zzd3 == 16) {
                            i11 = zzwwVar.zzj();
                            obj = zzukVar.zzd(zzujVar, this.zza, i11);
                        } else if (zzd3 == 26) {
                            if (obj != null) {
                                zzukVar.zzg(zzwwVar, obj, zzujVar, zzc2);
                            } else {
                                zztdVar = zzwwVar.zzq();
                            }
                        } else if (!zzwwVar.zzT()) {
                            break;
                        }
                    }
                    if (zzwwVar.zzd() != 12) {
                        throw zzvk.zzb();
                    }
                    if (zztdVar != null) {
                        if (obj != null) {
                            zzukVar.zzh(zztdVar, obj, zzujVar, zzc2);
                        } else {
                            zzxoVar.zzk(zzc, i11, zztdVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                zzxoVar.zzn(t2, zzc);
                throw th2;
            }
        }
        zzxoVar.zzn(t2, zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[EDGE_INSN: B:24:0x00c3->B:25:0x00c3 BREAK  A[LOOP:1: B:10:0x0069->B:18:0x0069], SYNTHETIC] */
    @Override // com.google.android.gms.internal.gtm.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(T t2, byte[] bArr, int i11, int i12, zzsl zzslVar) throws IOException {
        int i13;
        zzuz zzuzVar = (zzuz) t2;
        zzxp zzxpVar = zzuzVar.zzc;
        if (zzxpVar == zzxp.zzc()) {
            zzxpVar = zzxp.zze();
            zzuzVar.zzc = zzxpVar;
        }
        zzxp zzxpVar2 = zzxpVar;
        zzuo<zzuw> zzU = ((zzuv) t2).zzU();
        Object obj = null;
        while (i11 < i12) {
            int zzj = zzsm.zzj(bArr, i11, zzslVar);
            int i14 = zzslVar.zza;
            if (i14 == 11) {
                int i15 = i12;
                zzsl zzslVar2 = zzslVar;
                int i16 = 0;
                zztd zztdVar = null;
                while (true) {
                    if (zzj >= i15) {
                        i13 = zzj;
                        break;
                    }
                    i13 = zzsm.zzj(bArr, zzj, zzslVar2);
                    int i17 = zzslVar2.zza;
                    int i18 = i17 & 7;
                    int i19 = i17 >>> 3;
                    if (i19 != 2) {
                        if (i19 == 3) {
                            if (obj != null) {
                                zzux zzuxVar = (zzux) obj;
                                int zzd = zzsm.zzd(zzwt.zza().zzb(zzuxVar.zzc.getClass()), bArr, i13, i15, zzslVar2);
                                zzU.zzi(zzuxVar.zzd, zzslVar2.zzc);
                                zzj = zzd;
                            } else if (i18 == 2) {
                                zzj = zzsm.zza(bArr, i13, zzslVar2);
                                zztdVar = (zztd) zzslVar2.zzc;
                            }
                        }
                        if (i17 != 12) {
                            break;
                        } else {
                            zzj = zzsm.zzn(i17, bArr, i13, i15, zzslVar2);
                        }
                    } else if (i18 == 0) {
                        zzj = zzsm.zzj(bArr, i13, zzslVar2);
                        i16 = zzslVar2.zza;
                        obj = this.zzd.zzd(zzslVar2.zzd, this.zza, i16);
                    } else if (i17 != 12) {
                    }
                }
                if (zztdVar != null) {
                    zzxpVar2.zzh((i16 << 3) | 2, zztdVar);
                }
                i11 = i13;
                i12 = i15;
                zzslVar = zzslVar2;
            } else if ((i14 & 7) == 2) {
                obj = this.zzd.zzd(zzslVar.zzd, this.zza, i14 >>> 3);
                if (obj != null) {
                    zzux zzuxVar2 = (zzux) obj;
                    i11 = zzsm.zzd(zzwt.zza().zzb(zzuxVar2.zzc.getClass()), bArr, zzj, i12, zzslVar);
                    zzU.zzi(zzuxVar2.zzd, zzslVar.zzc);
                } else {
                    i11 = zzsm.zzi(i14, bArr, zzj, i12, zzxpVar2, zzslVar);
                }
            } else {
                i11 = zzsm.zzn(i14, bArr, zzj, i12, zzslVar);
            }
        }
        if (i11 != i12) {
            throw zzvk.zzg();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzj(T t2, T t11) {
        if (!this.zzb.zzd(t2).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(t2).equals(this.zzd.zzb(t11));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzk(T t2) {
        return this.zzd.zzb(t2).zzk();
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzn(T t2, zztp zztpVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzf = this.zzd.zzb(t2).zzf();
        while (zzf.hasNext()) {
            Map.Entry<?, Object> next = zzf.next();
            zzun zzunVar = (zzun) next.getKey();
            if (zzunVar.zze() != zzyf.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzunVar.zzg();
            zzunVar.zzf();
            if (next instanceof zzvn) {
                zztpVar.zzw(zzunVar.zza(), ((zzvn) next).zza().zzb());
            } else {
                zztpVar.zzw(zzunVar.zza(), next.getValue());
            }
        }
        zzxo<?, ?> zzxoVar = this.zzb;
        zzxoVar.zzr(zzxoVar.zzd(t2), zztpVar);
    }
}
