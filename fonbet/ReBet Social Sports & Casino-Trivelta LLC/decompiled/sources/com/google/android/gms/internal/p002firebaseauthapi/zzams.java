package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzalf;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzams<T> implements zzanb<T> {
    private final zzamm zza;
    private final zzanu<?, ?> zzb;
    private final boolean zzc;
    private final zzakw<?> zzd;

    private zzams(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        this.zzb = zzanuVar;
        this.zzc = zzakwVar.zza(zzammVar);
        this.zzd = zzakwVar;
        this.zza = zzammVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t10) {
        zzanu<?, ?> zzanuVar = this.zzb;
        int zzb = zzanuVar.zzb(zzanuVar.zzd(t10));
        return this.zzc ? zzb + this.zzd.zza(t10).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t10) {
        int hashCode = this.zzb.zzd(t10).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t10).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(T t10) {
        this.zzb.zzf(t10);
        this.zzd.zzc(t10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zze(T t10) {
        return this.zzd.zza(t10).zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zzb(T t10, T t11) {
        if (!this.zzb.zzd(t10).equals(this.zzb.zzd(t11))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t10).equals(this.zzd.zza(t11));
        }
        return true;
    }

    public static <T> zzams<T> zza(zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamm zzammVar) {
        return new zzams<>(zzanuVar, zzakwVar, zzammVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        zzamm zzammVar = this.zza;
        if (zzammVar instanceof zzalf) {
            return (T) ((zzalf) zzammVar).zzo();
        }
        return (T) zzammVar.zzq().zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t10, T t11) {
        zzand.zza(this.zzb, t10, t11);
        if (this.zzc) {
            zzand.zza(this.zzd, t10, t11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t10, zzanc zzancVar, zzaku zzakuVar) {
        boolean z10;
        zzanu<?, ?> zzanuVar = this.zzb;
        zzakw<?> zzakwVar = this.zzd;
        Object zzc = zzanuVar.zzc(t10);
        zzakx<?> zzb = zzakwVar.zzb(t10);
        while (zzancVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzancVar.zzd();
                int i10 = 0;
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzakwVar.zza(zzakuVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzakwVar.zza(zzancVar, zza, zzakuVar, zzb);
                        } else {
                            z10 = zzanuVar.zza((zzanu<?, ?>) zzc, zzancVar, 0);
                        }
                    } else {
                        z10 = zzancVar.zzt();
                    }
                    if (z10) {
                        zzanuVar.zzb((Object) t10, (T) zzc);
                        return;
                    }
                } else {
                    Object obj = null;
                    zzajv zzajvVar = null;
                    while (zzancVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzancVar.zzd();
                        if (zzd2 != 16) {
                            if (zzd2 != 26) {
                                if (zzd2 == 12 || !zzancVar.zzt()) {
                                    break;
                                }
                            } else if (obj != null) {
                                zzakwVar.zza(zzancVar, obj, zzakuVar, zzb);
                            } else {
                                zzajvVar = zzancVar.zzp();
                            }
                        } else {
                            i10 = zzancVar.zzj();
                            obj = zzakwVar.zza(zzakuVar, this.zza, i10);
                        }
                    }
                    if (zzancVar.zzd() != 12) {
                        throw zzall.zzb();
                    }
                    if (zzajvVar != null) {
                        if (obj != null) {
                            zzakwVar.zza(zzajvVar, obj, zzakuVar, zzb);
                        } else {
                            zzanuVar.zza((zzanu<?, ?>) zzc, i10, zzajvVar);
                        }
                    }
                }
                z10 = true;
                if (z10) {
                }
            } catch (Throwable th2) {
                zzanuVar.zzb((Object) t10, (T) zzc);
                throw th2;
            }
        }
        zzanuVar.zzb((Object) t10, (T) zzc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzaju zzajuVar) {
        int i12;
        zzalf zzalfVar = (zzalf) t10;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar == zzanx.zzc()) {
            zzanxVar = zzanx.zzd();
            zzalfVar.zzb = zzanxVar;
        }
        zzanx zzanxVar2 = zzanxVar;
        ((zzalf.zzd) t10).zza();
        zzalf.zzf zzfVar = null;
        while (i10 < i11) {
            int zzc = zzajr.zzc(bArr, i10, zzajuVar);
            int i13 = zzajuVar.zza;
            if (i13 == 11) {
                byte[] bArr2 = bArr;
                int i14 = i11;
                zzaju zzajuVar2 = zzajuVar;
                int i15 = 0;
                zzajv zzajvVar = null;
                while (true) {
                    if (zzc >= i14) {
                        i12 = zzc;
                        break;
                    }
                    i12 = zzajr.zzc(bArr2, zzc, zzajuVar2);
                    int i16 = zzajuVar2.zza;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 != 2) {
                        if (i17 == 3) {
                            if (zzfVar != null) {
                                zzamx.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i18 == 2) {
                                zzc = zzajr.zza(bArr2, i12, zzajuVar2);
                                zzajvVar = (zzajv) zzajuVar2.zzc;
                            }
                        }
                        if (i16 != 12) {
                            break;
                        } else {
                            zzc = zzajr.zza(i16, bArr2, i12, i14, zzajuVar2);
                        }
                    } else if (i18 == 0) {
                        zzc = zzajr.zzc(bArr2, i12, zzajuVar2);
                        i15 = zzajuVar2.zza;
                        zzfVar = (zzalf.zzf) this.zzd.zza(zzajuVar2.zzd, this.zza, i15);
                    } else if (i16 != 12) {
                    }
                }
                if (zzajvVar != null) {
                    zzanxVar2.zza((i15 << 3) | 2, zzajvVar);
                }
                i10 = i12;
                bArr = bArr2;
                i11 = i14;
                zzajuVar = zzajuVar2;
            } else if ((i13 & 7) == 2) {
                zzfVar = (zzalf.zzf) this.zzd.zza(zzajuVar.zzd, this.zza, i13 >>> 3);
                if (zzfVar == null) {
                    i10 = zzajr.zza(i13, bArr, zzc, i11, zzanxVar2, zzajuVar);
                } else {
                    zzamx.zza();
                    throw new NoSuchMethodError();
                }
            } else {
                i10 = zzajr.zza(i13, bArr, zzc, i11, zzajuVar);
            }
        }
        if (i10 != i11) {
            throw zzall.zzg();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t10, zzaol zzaolVar) {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t10).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzakz zzakzVar = (zzakz) next.getKey();
            if (zzakzVar.zzc() == zzaoj.MESSAGE && !zzakzVar.zze() && !zzakzVar.zzd()) {
                if (next instanceof zzalp) {
                    zzaolVar.zza(zzakzVar.zza(), (Object) ((zzalp) next).zza().zzb());
                } else {
                    zzaolVar.zza(zzakzVar.zza(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        zzanu<?, ?> zzanuVar = this.zzb;
        zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t10), zzaolVar);
    }
}
