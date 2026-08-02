package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjk;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzkw<T> implements zzli<T> {
    private final zzkq zza;
    private final zzmc<?, ?> zzb;
    private final boolean zzc;
    private final zziz<?> zzd;

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zza(T t) {
        zzmc<?, ?> zzmcVar = this.zzb;
        int zzb = zzmcVar.zzb(zzmcVar.zzd(t));
        return this.zzc ? zzb + this.zzd.zza(t).zza() : zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzb(T t) {
        int hashCode = this.zzb.zzd(t).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zza(t).hashCode() : hashCode;
    }

    static <T> zzkw<T> zza(zzmc<?, ?> zzmcVar, zziz<?> zzizVar, zzkq zzkqVar) {
        return new zzkw<>(zzmcVar, zzizVar, zzkqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final T zza() {
        zzkq zzkqVar = this.zza;
        if (zzkqVar instanceof zzjk) {
            return (T) ((zzjk) zzkqVar).zzcb();
        }
        return (T) zzkqVar.zzcf().zzah();
    }

    private zzkw(zzmc<?, ?> zzmcVar, zziz<?> zzizVar, zzkq zzkqVar) {
        this.zzb = zzmcVar;
        this.zzc = zzizVar.zza(zzkqVar);
        this.zzd = zzizVar;
        this.zza = zzkqVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzc(T t) {
        this.zzb.zzf(t);
        this.zzd.zzc(t);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zza(T t, T t2) {
        zzlk.zza(this.zzb, t, t2);
        if (this.zzc) {
            zzlk.zza(this.zzd, t, t2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:0: B:2:0x000c->B:20:?, LOOP_END, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzlj zzljVar, zzix zzixVar) throws IOException {
        boolean z;
        zzmc<?, ?> zzmcVar = this.zzb;
        zziz<?> zzizVar = this.zzd;
        Object zzc = zzmcVar.zzc(t);
        zzja<?> zzb = zzizVar.zzb(t);
        while (zzljVar.zzc() != Integer.MAX_VALUE) {
            try {
                int zzd = zzljVar.zzd();
                if (zzd != 11) {
                    if ((zzd & 7) == 2) {
                        Object zza = zzizVar.zza(zzixVar, this.zza, zzd >>> 3);
                        if (zza != null) {
                            zzizVar.zza(zzljVar, zza, zzixVar, zzb);
                        } else {
                            z = zzmcVar.zza((zzmc<?, ?>) zzc, zzljVar);
                        }
                    } else {
                        z = zzljVar.zzt();
                    }
                    if (z) {
                        return;
                    }
                } else {
                    Object obj = null;
                    int i = 0;
                    zzhx zzhxVar = null;
                    while (zzljVar.zzc() != Integer.MAX_VALUE) {
                        int zzd2 = zzljVar.zzd();
                        if (zzd2 == 16) {
                            i = zzljVar.zzj();
                            obj = zzizVar.zza(zzixVar, this.zza, i);
                        } else if (zzd2 == 26) {
                            if (obj != null) {
                                zzizVar.zza(zzljVar, obj, zzixVar, zzb);
                            } else {
                                zzhxVar = zzljVar.zzp();
                            }
                        } else if (!zzljVar.zzt()) {
                            break;
                        }
                    }
                    if (zzljVar.zzd() != 12) {
                        throw zzjt.zzb();
                    }
                    if (zzhxVar != null) {
                        if (obj != null) {
                            zzizVar.zza(zzhxVar, obj, zzixVar, zzb);
                        } else {
                            zzmcVar.zza((zzmc<?, ?>) zzc, i, zzhxVar);
                        }
                    }
                }
                z = true;
                if (z) {
                }
            } finally {
                zzmcVar.zzb((Object) t, (T) zzc);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[EDGE_INSN: B:24:0x00a1->B:25:0x00a1 BREAK  A[LOOP:1: B:10:0x0059->B:18:0x0059], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zzhw zzhwVar) throws IOException {
        int i3;
        zzjk zzjkVar = (zzjk) t;
        zzmf zzmfVar = zzjkVar.zzb;
        if (zzmfVar == zzmf.zzc()) {
            zzmfVar = zzmf.zzd();
            zzjkVar.zzb = zzmfVar;
        }
        zzmf zzmfVar2 = zzmfVar;
        ((zzjk.zzb) t).zza();
        zzjk.zzd zzdVar = null;
        while (i < i2) {
            int zzc = zzht.zzc(bArr, i, zzhwVar);
            int i4 = zzhwVar.zza;
            if (i4 == 11) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                zzhw zzhwVar2 = zzhwVar;
                int i6 = 0;
                zzhx zzhxVar = null;
                while (true) {
                    if (zzc >= i5) {
                        i3 = zzc;
                        break;
                    }
                    i3 = zzht.zzc(bArr2, zzc, zzhwVar2);
                    int i7 = zzhwVar2.zza;
                    int i8 = i7 >>> 3;
                    int i9 = i7 & 7;
                    if (i8 != 2) {
                        if (i8 == 3) {
                            if (zzdVar != null) {
                                zzle.zza();
                                throw new NoSuchMethodError();
                            }
                            if (i9 == 2) {
                                zzc = zzht.zza(bArr2, i3, zzhwVar2);
                                zzhxVar = (zzhx) zzhwVar2.zzc;
                            }
                        }
                        if (i7 != 12) {
                            break;
                        } else {
                            zzc = zzht.zza(i7, bArr2, i3, i5, zzhwVar2);
                        }
                    } else if (i9 == 0) {
                        zzc = zzht.zzc(bArr2, i3, zzhwVar2);
                        i6 = zzhwVar2.zza;
                        zzdVar = (zzjk.zzd) this.zzd.zza(zzhwVar2.zzd, this.zza, i6);
                    } else if (i7 != 12) {
                    }
                }
                if (zzhxVar != null) {
                    zzmfVar2.zza((i6 << 3) | 2, zzhxVar);
                }
                i = i3;
                bArr = bArr2;
                i2 = i5;
                zzhwVar = zzhwVar2;
            } else if ((i4 & 7) == 2) {
                zzdVar = (zzjk.zzd) this.zzd.zza(zzhwVar.zzd, this.zza, i4 >>> 3);
                if (zzdVar != null) {
                    zzle.zza();
                    throw new NoSuchMethodError();
                }
                i = zzht.zza(i4, bArr, zzc, i2, zzmfVar2, zzhwVar);
            } else {
                i = zzht.zza(i4, bArr, zzc, i2, zzhwVar);
            }
        }
        if (i != i2) {
            throw zzjt.zzg();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zza(T t, zzmx zzmxVar) throws IOException {
        Iterator<Map.Entry<?, Object>> zzd = this.zzd.zza(t).zzd();
        while (zzd.hasNext()) {
            Map.Entry<?, Object> next = zzd.next();
            zzjc zzjcVar = (zzjc) next.getKey();
            if (zzjcVar.zzc() != zzmy.MESSAGE || zzjcVar.zze() || zzjcVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof zzjx) {
                zzmxVar.zza(zzjcVar.zza(), (Object) ((zzjx) next).zza().zzb());
            } else {
                zzmxVar.zza(zzjcVar.zza(), next.getValue());
            }
        }
        zzmc<?, ?> zzmcVar = this.zzb;
        zzmcVar.zza((zzmc<?, ?>) zzmcVar.zzd(t), zzmxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final boolean zzb(T t, T t2) {
        if (!this.zzb.zzd(t).equals(this.zzb.zzd(t2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zza(t).equals(this.zzd.zza(t2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final boolean zzd(T t) {
        return this.zzd.zza(t).zzg();
    }
}
