package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzfq implements zzge {
    private final zzfm zza;
    private final zzgs zzb;
    private final boolean zzc;
    private final zzdt zzd;

    private zzfq(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        this.zzb = zzgsVar;
        this.zzc = zzfmVar instanceof zzed;
        this.zzd = zzdtVar;
        this.zza = zzfmVar;
    }

    static zzfq zzc(zzgs zzgsVar, zzdt zzdtVar, zzfm zzfmVar) {
        return new zzfq(zzgsVar, zzdtVar, zzfmVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zza(Object obj) {
        int zzb = ((zzeh) obj).zzc.zzb();
        return this.zzc ? zzb + ((zzed) obj).zzb.zzb() : zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final int zzb(Object obj) {
        int hashCode = ((zzeh) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzed) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final Object zze() {
        zzfm zzfmVar = this.zza;
        return zzfmVar instanceof zzeh ? ((zzeh) zzfmVar).zzK() : zzfmVar.zzZ().zzk();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzg(Object obj, Object obj2) {
        zzgg.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgg.zzo(this.zzd, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[EDGE_INSN: B:24:0x00b8->B:25:0x00b8 BREAK  A[LOOP:1: B:10:0x0064->B:18:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzh(Object obj, byte[] bArr, int i11, int i12, zzcu zzcuVar) throws IOException {
        int i13;
        zzeh zzehVar = (zzeh) obj;
        zzgt zzgtVar = zzehVar.zzc;
        if (zzgtVar == zzgt.zzc()) {
            zzgtVar = zzgt.zzf();
            zzehVar.zzc = zzgtVar;
        }
        zzgt zzgtVar2 = zzgtVar;
        zzdx zzc = ((zzed) obj).zzc();
        zzef zzefVar = null;
        while (i11 < i12) {
            int zzj = zzcv.zzj(bArr, i11, zzcuVar);
            int i14 = zzcuVar.zza;
            if (i14 == 11) {
                int i15 = i12;
                zzcu zzcuVar2 = zzcuVar;
                int i16 = 0;
                zzdf zzdfVar = null;
                while (true) {
                    if (zzj >= i15) {
                        i13 = zzj;
                        break;
                    }
                    i13 = zzcv.zzj(bArr, zzj, zzcuVar2);
                    int i17 = zzcuVar2.zza;
                    int i18 = i17 >>> 3;
                    int i19 = i17 & 7;
                    if (i18 != 2) {
                        if (i18 == 3) {
                            if (zzefVar != null) {
                                zzj = zzcv.zze(zzfu.zza().zzb(zzefVar.zza.getClass()), bArr, i13, i15, zzcuVar2);
                                zzc.zzi(zzefVar.zzb, zzcuVar2.zzc);
                            } else if (i19 == 2) {
                                zzj = zzcv.zza(bArr, i13, zzcuVar2);
                                zzdfVar = (zzdf) zzcuVar2.zzc;
                            }
                        }
                        if (i17 != 12) {
                            break;
                        } else {
                            zzj = zzcv.zzp(i17, bArr, i13, i15, zzcuVar2);
                        }
                    } else if (i19 == 0) {
                        zzj = zzcv.zzj(bArr, i13, zzcuVar2);
                        i16 = zzcuVar2.zza;
                        zzefVar = zzcuVar2.zzd.zzb(this.zza, i16);
                    } else if (i17 != 12) {
                    }
                }
                if (zzdfVar != null) {
                    zzgtVar2.zzj((i16 << 3) | 2, zzdfVar);
                }
                i11 = i13;
                i12 = i15;
                zzcuVar = zzcuVar2;
            } else if ((i14 & 7) == 2) {
                zzefVar = zzcuVar.zzd.zzb(this.zza, i14 >>> 3);
                if (zzefVar != null) {
                    i11 = zzcv.zze(zzfu.zza().zzb(zzefVar.zza.getClass()), bArr, zzj, i12, zzcuVar);
                    zzc.zzi(zzefVar.zzb, zzcuVar.zzc);
                } else {
                    i11 = zzcv.zzi(i14, bArr, zzj, i12, zzgtVar2, zzcuVar);
                }
            } else {
                i11 = zzcv.zzp(i14, bArr, zzj, i12, zzcuVar);
            }
        }
        if (i11 != i12) {
            throw new zzer("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final void zzi(Object obj, zzhh zzhhVar) throws IOException {
        Iterator zzf = ((zzed) obj).zzb.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzdw zzdwVar = (zzdw) entry.getKey();
            if (zzdwVar.zze() != zzhg.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            zzdwVar.zzg();
            zzdwVar.zzf();
            if (entry instanceof zzeu) {
                zzhhVar.zzw(zzdwVar.zza(), ((zzeu) entry).zza().zzb());
            } else {
                zzhhVar.zzw(zzdwVar.zza(), entry.getValue());
            }
        }
        ((zzeh) obj).zzc.zzk(zzhhVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzeh) obj).zzc.equals(((zzeh) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzed) obj).zzb.equals(((zzed) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzge
    public final boolean zzk(Object obj) {
        return ((zzed) obj).zzb.zzk();
    }
}
