package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class zzamq<T> implements zzanb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzanz.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzamm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzamu zzn;
    private final zzalw zzo;
    private final zzanu<?, ?> zzp;
    private final zzakw<?> zzq;
    private final zzamf zzr;

    private zzamq(int[] iArr, Object[] objArr, int i10, int i11, zzamm zzammVar, boolean z10, int[] iArr2, int i12, int i13, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzammVar instanceof zzalf;
        this.zzh = zzakwVar != null && zzakwVar.zza(zzammVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzn = zzamuVar;
        this.zzo = zzalwVar;
        this.zzp = zzanuVar;
        this.zzq = zzakwVar;
        this.zzg = zzammVar;
        this.zzr = zzamfVar;
    }

    private static <T> double zza(T t10, long j10) {
        return ((Double) zzanz.zze(t10, j10)).doubleValue();
    }

    private static <T> float zzb(T t10, long j10) {
        return ((Float) zzanz.zze(t10, j10)).floatValue();
    }

    private static <T> int zzc(T t10, long j10) {
        return ((Integer) zzanz.zze(t10, j10)).intValue();
    }

    private static <T> long zzd(T t10, long j10) {
        return ((Long) zzanz.zze(t10, j10)).longValue();
    }

    private final zzanb zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzanb zzanbVar = (zzanb) this.zzd[i11];
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb<T> zza2 = zzamx.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static boolean zzg(int i10) {
        return (i10 & PKIFailureInfo.duplicateCertReq) != 0;
    }

    private static int zza(byte[] bArr, int i10, int i11, zzaog zzaogVar, Class<?> cls, zzaju zzajuVar) {
        switch (zzamp.zza[zzaogVar.ordinal()]) {
            case 1:
                int zzd = zzajr.zzd(bArr, i10, zzajuVar);
                zzajuVar.zzc = Boolean.valueOf(zzajuVar.zzb != 0);
                return zzd;
            case 2:
                return zzajr.zza(bArr, i10, zzajuVar);
            case 3:
                zzajuVar.zzc = Double.valueOf(zzajr.zza(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                zzajuVar.zzc = Integer.valueOf(zzajr.zzc(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                zzajuVar.zzc = Long.valueOf(zzajr.zzd(bArr, i10));
                return i10 + 8;
            case 8:
                zzajuVar.zzc = Float.valueOf(zzajr.zzb(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzajr.zzc(bArr, i10, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzajuVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzajr.zzd(bArr, i10, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzajuVar.zzb);
                return zzd2;
            case 14:
                return zzajr.zza(zzamx.zza().zza((Class) cls), bArr, i10, i11, zzajuVar);
            case 15:
                int zzc2 = zzajr.zzc(bArr, i10, zzajuVar);
                zzajuVar.zzc = Integer.valueOf(zzakh.zza(zzajuVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzajr.zzd(bArr, i10, zzajuVar);
                zzajuVar.zzc = Long.valueOf(zzakh.zza(zzajuVar.zzb));
                return zzd3;
            case 17:
                return zzajr.zzb(bArr, i10, zzajuVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzalj zzd(int i10) {
        return (zzalj) this.zzd[((i10 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzalf) {
            return ((zzalf) obj).zzw();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zzb(T t10) {
        int i10;
        int zza2;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzc = zzc(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzc;
            int i14 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(Double.doubleToLongBits(zzanz.zza(t10, j10)));
                    i11 = i10 + zza2;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zza2 = Float.floatToIntBits(zzanz.zzb(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zza2 = zzanz.zzc(t10, j10);
                    i11 = i10 + zza2;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zza2 = zzanz.zzc(t10, j10);
                    i11 = i10 + zza2;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(zzanz.zzh(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zza2 = ((String) zzanz.zze(t10, j10)).hashCode();
                    i11 = i10 + zza2;
                    break;
                case 9:
                    Object zze = zzanz.zze(t10, j10);
                    if (zze != null) {
                        i14 = zze.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zza2 = zzanz.zze(t10, j10).hashCode();
                    i11 = i10 + zza2;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zza2 = zzanz.zzc(t10, j10);
                    i11 = i10 + zza2;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zza2 = zzanz.zzc(t10, j10);
                    i11 = i10 + zza2;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zza2 = zzanz.zzc(t10, j10);
                    i11 = i10 + zza2;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zza2 = zzanz.zzc(t10, j10);
                    i11 = i10 + zza2;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zza2 = zzalh.zza(zzanz.zzd(t10, j10));
                    i11 = i10 + zza2;
                    break;
                case 17:
                    Object zze2 = zzanz.zze(t10, j10);
                    if (zze2 != null) {
                        i14 = zze2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    zza2 = zzanz.zze(t10, j10).hashCode();
                    i11 = i10 + zza2;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zza2 = zzanz.zze(t10, j10).hashCode();
                    i11 = i10 + zza2;
                    break;
                case 51:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(Double.doubleToLongBits(zza(t10, j10)));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = Float.floatToIntBits(zzb(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(zzd(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(zzd(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzc(t10, j10);
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(zzd(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzc(t10, j10);
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(zze(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = ((String) zzanz.zze(t10, j10)).hashCode();
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzanz.zze(t10, j10).hashCode();
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzanz.zze(t10, j10).hashCode();
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzc(t10, j10);
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzc(t10, j10);
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzc(t10, j10);
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(zzd(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzc(t10, j10);
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzalh.zza(zzd(t10, j10));
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzamq<T>) t10, i13, i12)) {
                        i10 = i11 * 53;
                        zza2 = zzanz.zze(t10, j10).hashCode();
                        i11 = i10 + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.zzp.zzd(t10).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t10).hashCode() : hashCode;
    }

    public static zzanx zzc(Object obj) {
        zzalf zzalfVar = (zzalf) obj;
        zzanx zzanxVar = zzalfVar.zzb;
        if (zzanxVar != zzanx.zzc()) {
            return zzanxVar;
        }
        zzanx zzd = zzanx.zzd();
        zzalfVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zzd(T t10) {
        if (zzg(t10)) {
            if (t10 instanceof zzalf) {
                zzalf zzalfVar = (zzalf) t10;
                zzalfVar.zzb(Integer.MAX_VALUE);
                zzalfVar.zza = 0;
                zzalfVar.zzu();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzc = zzc(i10);
                long j10 = 1048575 & zzc;
                int i11 = (zzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzo.zzb(t10, j10);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t10, j10);
                                if (object != null) {
                                    unsafe.putObject(t10, j10, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzamq<T>) t10, this.zzc[i10], i10)) {
                        zze(i10).zzd(zzb.getObject(t10, j10));
                    }
                }
                if (zzc((zzamq<T>) t10, i10)) {
                    zze(i10).zzd(zzb.getObject(t10, j10));
                }
            }
            this.zzp.zzf(t10);
            if (this.zzh) {
                this.zzq.zzc(t10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.firebase-auth-api.zzanb] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final boolean zze(T t10) {
        int i10;
        int i11;
        zzamq<T> zzamqVar;
        T t11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i13 < this.zzl) {
            int i15 = this.zzk[i13];
            int i16 = this.zzc[i15];
            int zzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i14 = zzb.getInt(t10, i18);
                }
                i11 = i14;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i14;
            }
            if ((268435456 & zzc) != 0) {
                zzamqVar = this;
                t11 = t10;
                if (!zzamqVar.zza((zzamq<T>) t11, i15, i10, i11, i19)) {
                    return false;
                }
            } else {
                zzamqVar = this;
                t11 = t10;
            }
            int i20 = (267386880 & zzc) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc((zzamq<T>) t11, i16, i15) && !zza((Object) t11, zzc, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = zzamqVar.zzr.zzd(zzanz.zze(t11, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (zzamqVar.zzr.zza(zzf(i15)).zzc.zzb() == zzaoj.MESSAGE) {
                                ?? r32 = 0;
                                for (Object obj : zzd.values()) {
                                    r32 = r32;
                                    if (r32 == 0) {
                                        r32 = zzamx.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r32.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzanz.zze(t11, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!zze.zze(list.get(i21))) {
                            return false;
                        }
                    }
                }
            } else if (zzamqVar.zza((zzamq<T>) t11, i15, i10, i11, i19) && !zza((Object) t11, zzc, zze(i15))) {
                return false;
            }
            i13++;
            t10 = t11;
            i12 = i10;
            i14 = i11;
        }
        return !this.zzh || this.zzq.zza(t10).zzg();
    }

    private final boolean zzc(T t10, T t11, int i10) {
        return zzc((zzamq<T>) t10, i10) == zzc((zzamq<T>) t11, i10);
    }

    private final boolean zzc(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = zzb2 & 1048575;
        if (j10 != 1048575) {
            return (zzanz.zzc(t10, j10) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i10);
        long j11 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzanz.zza(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzanz.zzb(t10, j11)) != 0;
            case 2:
                return zzanz.zzd(t10, j11) != 0;
            case 3:
                return zzanz.zzd(t10, j11) != 0;
            case 4:
                return zzanz.zzc(t10, j11) != 0;
            case 5:
                return zzanz.zzd(t10, j11) != 0;
            case 6:
                return zzanz.zzc(t10, j11) != 0;
            case 7:
                return zzanz.zzh(t10, j11);
            case 8:
                Object zze = zzanz.zze(t10, j11);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzajv) {
                    return !zzajv.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzanz.zze(t10, j11) != null;
            case 10:
                return !zzajv.zza.equals(zzanz.zze(t10, j11));
            case 11:
                return zzanz.zzc(t10, j11) != 0;
            case 12:
                return zzanz.zzc(t10, j11) != 0;
            case 13:
                return zzanz.zzc(t10, j11) != 0;
            case 14:
                return zzanz.zzd(t10, j11) != 0;
            case 15:
                return zzanz.zzc(t10, j11) != 0;
            case 16:
                return zzanz.zzd(t10, j11) != 0;
            case 17:
                return zzanz.zze(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final int zza(T t10) {
        int i10;
        int zza2;
        int zza3;
        int zzb2;
        int zzd;
        int zzh;
        int zzi;
        zzamq<T> zzamqVar = this;
        T t11 = t10;
        Unsafe unsafe = zzb;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1048575;
        while (i12 < zzamqVar.zzc.length) {
            int zzc = zzamqVar.zzc(i12);
            int i16 = (267386880 & zzc) >>> 20;
            int[] iArr = zzamqVar.zzc;
            int i17 = iArr[i12];
            int i18 = iArr[i12 + 2];
            int i19 = i18 & i11;
            if (i16 <= 17) {
                if (i19 != i15) {
                    i13 = i19 == i11 ? 0 : unsafe.getInt(t11, i19);
                    i15 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            long j10 = zzc & i11;
            if (i16 >= zzalc.zza.zza()) {
                zzalc.zzb.zza();
            }
            int i20 = i14;
            switch (i16) {
                case 0:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza2 = zzakn.zza(i17, 0.0d);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 1:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza3 = zzakn.zza(i17, 0.0f);
                        i14 = i20 + zza3;
                        zzamqVar = this;
                        t11 = t10;
                        break;
                    }
                    zzamqVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 2:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zzb(i17, unsafe.getLong(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 3:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zze(i17, unsafe.getLong(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 4:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zzc(i17, unsafe.getInt(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 5:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza3 = zzakn.zza(i17, 0L);
                        i14 = i20 + zza3;
                        zzamqVar = this;
                        t11 = t10;
                        break;
                    }
                    zzamqVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 6:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza3 = zzakn.zzb(i17, 0);
                        i14 = i20 + zza3;
                        zzamqVar = this;
                        t11 = t10;
                        break;
                    }
                    zzamqVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 7:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza3 = zzakn.zza(i17, true);
                        i14 = i20 + zza3;
                        zzamqVar = this;
                        t11 = t10;
                        break;
                    }
                    zzamqVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 8:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        Object object = unsafe.getObject(t11, j10);
                        if (object instanceof zzajv) {
                            zzb2 = zzakn.zza(i17, (zzajv) object);
                        } else {
                            zzb2 = zzakn.zza(i17, (String) object);
                        }
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 9:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza2 = zzand.zza(i17, unsafe.getObject(t11, j10), (zzanb<?>) zzamqVar.zze(i12));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 10:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zza(i17, (zzajv) unsafe.getObject(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 11:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zzf(i17, unsafe.getInt(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 12:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zza(i17, unsafe.getInt(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 13:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza3 = zzakn.zzd(i17, 0);
                        i14 = i20 + zza3;
                        zzamqVar = this;
                        t11 = t10;
                        break;
                    }
                    zzamqVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 14:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza3 = zzakn.zzc(i17, 0L);
                        i14 = i20 + zza3;
                        zzamqVar = this;
                        t11 = t10;
                        break;
                    }
                    zzamqVar = this;
                    t11 = t10;
                    i14 = i20;
                    break;
                case 15:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zze(i17, unsafe.getInt(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 16:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zzb2 = zzakn.zzd(i17, unsafe.getLong(t11, j10));
                        i14 = i20 + zzb2;
                        zzamqVar = this;
                        break;
                    }
                    zzamqVar = this;
                    i14 = i20;
                    break;
                case 17:
                    if (zzamqVar.zza((zzamq<T>) t11, i12, i15, i13, i10)) {
                        zza2 = zzand.zza(i17, (zzamm) unsafe.getObject(t11, j10), zzamqVar.zze(i12));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 18:
                    zza2 = zzand.zzd(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 19:
                    zza2 = zzand.zzc(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 20:
                    zza2 = zzand.zzf(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 21:
                    zza2 = zzand.zzj(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 22:
                    zza2 = zzand.zze(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 23:
                    zza2 = zzand.zzd(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 24:
                    zza2 = zzand.zzc(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 25:
                    zza2 = zzand.zza(i17, (List<?>) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 26:
                    zza2 = zzand.zzb(i17, (List) unsafe.getObject(t11, j10));
                    i14 = i20 + zza2;
                    break;
                case 27:
                    zza2 = zzand.zzb(i17, (List<?>) unsafe.getObject(t11, j10), (zzanb<?>) zzamqVar.zze(i12));
                    i14 = i20 + zza2;
                    break;
                case 28:
                    zza2 = zzand.zza(i17, (List<zzajv>) unsafe.getObject(t11, j10));
                    i14 = i20 + zza2;
                    break;
                case 29:
                    zza2 = zzand.zzi(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 30:
                    zza2 = zzand.zzb(i17, (List<Integer>) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 31:
                    zza2 = zzand.zzc(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 32:
                    zza2 = zzand.zzd(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 33:
                    zza2 = zzand.zzg(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 34:
                    zza2 = zzand.zzh(i17, (List) unsafe.getObject(t11, j10), false);
                    i14 = i20 + zza2;
                    break;
                case 35:
                    zzd = zzand.zzd((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 36:
                    zzd = zzand.zzc((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 37:
                    zzd = zzand.zzf((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 38:
                    zzd = zzand.zzj((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 39:
                    zzd = zzand.zze((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 40:
                    zzd = zzand.zzd((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 41:
                    zzd = zzand.zzc((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 42:
                    zzd = zzand.zza((List<?>) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 43:
                    zzd = zzand.zzi((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 44:
                    zzd = zzand.zzb((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 45:
                    zzd = zzand.zzc((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 46:
                    zzd = zzand.zzd((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 47:
                    zzd = zzand.zzg((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 48:
                    zzd = zzand.zzh((List) unsafe.getObject(t11, j10));
                    if (zzd > 0) {
                        zzh = zzakn.zzh(i17);
                        zzi = zzakn.zzi(zzd);
                        i14 = i20 + zzh + zzi + zzd;
                        break;
                    }
                    i14 = i20;
                    break;
                case 49:
                    zza2 = zzand.zza(i17, (List<zzamm>) unsafe.getObject(t11, j10), (zzanb<?>) zzamqVar.zze(i12));
                    i14 = i20 + zza2;
                    break;
                case 50:
                    zza2 = zzamqVar.zzr.zza(i17, unsafe.getObject(t11, j10), zzamqVar.zzf(i12));
                    i14 = i20 + zza2;
                    break;
                case 51:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zza(i17, 0.0d);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 52:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zza(i17, 0.0f);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 53:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzb(i17, zzd(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 54:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zze(i17, zzd(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 55:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzc(i17, zzc(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 56:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zza(i17, 0L);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 57:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzb(i17, 0);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 58:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zza(i17, true);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 59:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        Object object2 = unsafe.getObject(t11, j10);
                        if (object2 instanceof zzajv) {
                            zza2 = zzakn.zza(i17, (zzajv) object2);
                        } else {
                            zza2 = zzakn.zza(i17, (String) object2);
                        }
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 60:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzand.zza(i17, unsafe.getObject(t11, j10), (zzanb<?>) zzamqVar.zze(i12));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 61:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zza(i17, (zzajv) unsafe.getObject(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 62:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzf(i17, zzc(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 63:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zza(i17, zzc(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 64:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzd(i17, 0);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 65:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzc(i17, 0L);
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 66:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zze(i17, zzc(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 67:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzakn.zzd(i17, zzd(t11, j10));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                case 68:
                    if (zzamqVar.zzc((zzamq<T>) t11, i17, i12)) {
                        zza2 = zzand.zza(i17, (zzamm) unsafe.getObject(t11, j10), zzamqVar.zze(i12));
                        i14 = i20 + zza2;
                        break;
                    }
                    i14 = i20;
                    break;
                default:
                    i14 = i20;
                    break;
            }
            i12 += 3;
            i11 = 1048575;
        }
        zzanu<?, ?> zzanuVar = zzamqVar.zzp;
        int zza4 = i14 + zzanuVar.zza((zzanu<?, ?>) zzanuVar.zzd(t11));
        if (!zzamqVar.zzh) {
            return zza4;
        }
        zzakx<?> zza5 = zzamqVar.zzq.zza(t11);
        int zzb3 = zza5.zza.zzb();
        int i21 = 0;
        for (int i22 = 0; i22 < zzb3; i22++) {
            Map.Entry<?, Object> zza6 = zza5.zza.zza(i22);
            i21 += zzakx.zza((zzakz<?>) zza6.getKey(), zza6.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzc()) {
            i21 += zzakx.zza((zzakz<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i21;
    }

    private static <T> boolean zze(T t10, long j10) {
        return ((Boolean) zzanz.zze(t10, j10)).booleanValue();
    }

    private final boolean zzc(T t10, int i10, int i11) {
        return zzanz.zzc(t10, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzamq<T>) t11, i11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc);
            if (object != null) {
                zzanb zze = zze(i10);
                if (!zzc((zzamq<T>) t10, i11, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t10, zzc, zza2);
                    }
                    zzb((zzamq<T>) t10, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t10, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zzb(T t10, int i10) {
        int zzb2 = zzb(i10);
        long j10 = 1048575 & zzb2;
        if (j10 == 1048575) {
            return;
        }
        zzanz.zza((Object) t10, j10, (1 << (zzb2 >>> 20)) | zzanz.zzc(t10, j10));
    }

    private final void zzb(T t10, int i10, int i11) {
        zzanz.zza((Object) t10, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzh(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r10, r6) == com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.p002firebaseauthapi.zzand.zza(com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r10, r6), com.google.android.gms.internal.p002firebaseauthapi.zzanz.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t10, T t11) {
        int length = this.zzc.length;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 < length) {
                int zzc = zzc(i10);
                long j10 = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 1:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 2:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 3:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 4:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 5:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 6:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 7:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 8:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 9:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 10:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 11:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 12:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 13:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 14:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 15:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 16:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 17:
                        if (zzc(t10, t11, i10)) {
                            break;
                        }
                        z10 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        z10 = zzand.zza(zzanz.zze(t10, j10), zzanz.zze(t11, j10));
                        break;
                    case 50:
                        z10 = zzand.zza(zzanz.zze(t10, j10), zzanz.zze(t11, j10));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long zzb2 = zzb(i10) & 1048575;
                        if (zzanz.zzc(t10, zzb2) == zzanz.zzc(t11, zzb2)) {
                            break;
                        }
                        z10 = false;
                        break;
                }
                if (!z10) {
                    return false;
                }
                i10 += 3;
            } else {
                if (!this.zzp.zzd(t10).equals(this.zzp.zzd(t11))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t10).equals(this.zzq.zza(t11));
                }
                return true;
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int zza(T r30, byte[] r31, int r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzaju r35) {
        /*
            Method dump skipped, instructions count: 3628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamq.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaju):int");
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> zzamq<T> zza(Class<T> cls, zzamk zzamkVar, zzamu zzamuVar, zzalw zzalwVar, zzanu<?, ?> zzanuVar, zzakw<?> zzakwVar, zzamf zzamfVar) {
        int i10;
        int charAt;
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        int i17;
        char charAt2;
        int i18;
        char charAt3;
        int i19;
        char charAt4;
        int i20;
        char charAt5;
        int i21;
        char charAt6;
        int i22;
        char charAt7;
        int i23;
        char charAt8;
        int i24;
        char charAt9;
        int i25;
        zzamz zzamzVar;
        int i26;
        int[] iArr2;
        int i27;
        String str;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        Field zza2;
        int i34;
        char charAt10;
        int i35;
        int i36;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i37;
        char charAt11;
        int i38;
        char charAt12;
        int i39;
        char charAt13;
        int i40;
        char charAt14;
        if (zzamkVar instanceof zzamz) {
            zzamz zzamzVar2 = (zzamz) zzamkVar;
            String zzd = zzamzVar2.zzd();
            int length = zzd.length();
            char c10 = 55296;
            if (zzd.charAt(0) >= 55296) {
                int i41 = 1;
                while (true) {
                    i10 = i41 + 1;
                    if (zzd.charAt(i41) < 55296) {
                        break;
                    }
                    i41 = i10;
                }
            } else {
                i10 = 1;
            }
            int i42 = i10 + 1;
            int charAt15 = zzd.charAt(i10);
            if (charAt15 >= 55296) {
                int i43 = charAt15 & 8191;
                int i44 = 13;
                while (true) {
                    i40 = i42 + 1;
                    charAt14 = zzd.charAt(i42);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i43 |= (charAt14 & 8191) << i44;
                    i44 += 13;
                    i42 = i40;
                }
                charAt15 = i43 | (charAt14 << i44);
                i42 = i40;
            }
            if (charAt15 == 0) {
                i12 = 0;
                i14 = 0;
                charAt = 0;
                i11 = 0;
                i13 = 0;
                i16 = 0;
                iArr = zza;
                i15 = 0;
            } else {
                int i45 = i42 + 1;
                int charAt16 = zzd.charAt(i42);
                if (charAt16 >= 55296) {
                    int i46 = charAt16 & 8191;
                    int i47 = 13;
                    while (true) {
                        i24 = i45 + 1;
                        charAt9 = zzd.charAt(i45);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i46 |= (charAt9 & 8191) << i47;
                        i47 += 13;
                        i45 = i24;
                    }
                    charAt16 = i46 | (charAt9 << i47);
                    i45 = i24;
                }
                int i48 = i45 + 1;
                int charAt17 = zzd.charAt(i45);
                if (charAt17 >= 55296) {
                    int i49 = charAt17 & 8191;
                    int i50 = 13;
                    while (true) {
                        i23 = i48 + 1;
                        charAt8 = zzd.charAt(i48);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i49 |= (charAt8 & 8191) << i50;
                        i50 += 13;
                        i48 = i23;
                    }
                    charAt17 = i49 | (charAt8 << i50);
                    i48 = i23;
                }
                int i51 = i48 + 1;
                int charAt18 = zzd.charAt(i48);
                if (charAt18 >= 55296) {
                    int i52 = charAt18 & 8191;
                    int i53 = 13;
                    while (true) {
                        i22 = i51 + 1;
                        charAt7 = zzd.charAt(i51);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i52 |= (charAt7 & 8191) << i53;
                        i53 += 13;
                        i51 = i22;
                    }
                    charAt18 = i52 | (charAt7 << i53);
                    i51 = i22;
                }
                int i54 = i51 + 1;
                int charAt19 = zzd.charAt(i51);
                if (charAt19 >= 55296) {
                    int i55 = charAt19 & 8191;
                    int i56 = 13;
                    while (true) {
                        i21 = i54 + 1;
                        charAt6 = zzd.charAt(i54);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i55 |= (charAt6 & 8191) << i56;
                        i56 += 13;
                        i54 = i21;
                    }
                    charAt19 = i55 | (charAt6 << i56);
                    i54 = i21;
                }
                int i57 = i54 + 1;
                charAt = zzd.charAt(i54);
                if (charAt >= 55296) {
                    int i58 = charAt & 8191;
                    int i59 = 13;
                    while (true) {
                        i20 = i57 + 1;
                        charAt5 = zzd.charAt(i57);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i58 |= (charAt5 & 8191) << i59;
                        i59 += 13;
                        i57 = i20;
                    }
                    charAt = i58 | (charAt5 << i59);
                    i57 = i20;
                }
                int i60 = i57 + 1;
                int charAt20 = zzd.charAt(i57);
                if (charAt20 >= 55296) {
                    int i61 = charAt20 & 8191;
                    int i62 = 13;
                    while (true) {
                        i19 = i60 + 1;
                        charAt4 = zzd.charAt(i60);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i61 |= (charAt4 & 8191) << i62;
                        i62 += 13;
                        i60 = i19;
                    }
                    charAt20 = i61 | (charAt4 << i62);
                    i60 = i19;
                }
                int i63 = i60 + 1;
                int charAt21 = zzd.charAt(i60);
                if (charAt21 >= 55296) {
                    int i64 = charAt21 & 8191;
                    int i65 = 13;
                    while (true) {
                        i18 = i63 + 1;
                        charAt3 = zzd.charAt(i63);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i64 |= (charAt3 & 8191) << i65;
                        i65 += 13;
                        i63 = i18;
                    }
                    charAt21 = i64 | (charAt3 << i65);
                    i63 = i18;
                }
                int i66 = i63 + 1;
                int charAt22 = zzd.charAt(i63);
                if (charAt22 >= 55296) {
                    int i67 = charAt22 & 8191;
                    int i68 = 13;
                    while (true) {
                        i17 = i66 + 1;
                        charAt2 = zzd.charAt(i66);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i67 |= (charAt2 & 8191) << i68;
                        i68 += 13;
                        i66 = i17;
                    }
                    charAt22 = i67 | (charAt2 << i68);
                    i66 = i17;
                }
                int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
                int i69 = (charAt16 << 1) + charAt17;
                int i70 = charAt20;
                i11 = charAt18;
                i12 = i70;
                i13 = charAt19;
                i14 = i69;
                iArr = iArr3;
                i15 = charAt16;
                i16 = charAt22;
                i42 = i66;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzamzVar2.zze();
            Class<?> cls2 = zzamzVar2.zza().getClass();
            int[] iArr4 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i71 = i16 + i12;
            int i72 = i16;
            int i73 = i71;
            int i74 = 0;
            int i75 = 0;
            while (i42 < length) {
                int i76 = i42 + 1;
                int charAt23 = zzd.charAt(i42);
                if (charAt23 >= c10) {
                    int i77 = charAt23 & 8191;
                    int i78 = i76;
                    int i79 = 13;
                    while (true) {
                        i39 = i78 + 1;
                        charAt13 = zzd.charAt(i78);
                        if (charAt13 < c10) {
                            break;
                        }
                        i77 |= (charAt13 & 8191) << i79;
                        i79 += 13;
                        i78 = i39;
                    }
                    charAt23 = i77 | (charAt13 << i79);
                    i25 = i39;
                } else {
                    i25 = i76;
                }
                int i80 = i25 + 1;
                int charAt24 = zzd.charAt(i25);
                if (charAt24 >= c10) {
                    int i81 = charAt24 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i38 = i82 + 1;
                        charAt12 = zzd.charAt(i82);
                        zzamzVar = zzamzVar2;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i81 |= (charAt12 & 8191) << i83;
                        i83 += 13;
                        i82 = i38;
                        zzamzVar2 = zzamzVar;
                    }
                    charAt24 = i81 | (charAt12 << i83);
                    i26 = i38;
                } else {
                    zzamzVar = zzamzVar2;
                    i26 = i80;
                }
                int i84 = charAt24 & 255;
                int i85 = length;
                if ((charAt24 & 1024) != 0) {
                    iArr[i75] = i74;
                    i75++;
                }
                int i86 = charAt23;
                if (i84 >= 51) {
                    i30 = i26 + 1;
                    int charAt25 = zzd.charAt(i26);
                    char c11 = 55296;
                    if (charAt25 >= 55296) {
                        int i87 = charAt25 & 8191;
                        int i88 = 13;
                        while (true) {
                            i37 = i30 + 1;
                            charAt11 = zzd.charAt(i30);
                            if (charAt11 < c11) {
                                break;
                            }
                            i87 |= (charAt11 & 8191) << i88;
                            i88 += 13;
                            i30 = i37;
                            c11 = 55296;
                        }
                        charAt25 = i87 | (charAt11 << i88);
                        i30 = i37;
                    }
                    int i89 = i84 - 51;
                    int i90 = charAt25;
                    if (i89 != 9 && i89 != 17) {
                        if (i89 == 12 && (zzamzVar.zzb().equals(zzamy.PROTO2) || (charAt24 & 2048) != 0)) {
                            i36 = i14 + 1;
                            objArr[((i74 / 3) << 1) + 1] = zze[i14];
                        }
                        int i91 = i90 << 1;
                        obj = zze[i91];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i91] = zza3;
                        }
                        iArr2 = iArr4;
                        i27 = i15;
                        i31 = (int) unsafe.objectFieldOffset(zza3);
                        int i92 = i91 + 1;
                        obj2 = zze[i92];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i92] = zza4;
                        }
                        i32 = (int) unsafe.objectFieldOffset(zza4);
                        i33 = i14;
                        str = zzd;
                        i29 = 0;
                    } else {
                        i36 = i14 + 1;
                        objArr[((i74 / 3) << 1) + 1] = zze[i14];
                    }
                    i14 = i36;
                    int i912 = i90 << 1;
                    obj = zze[i912];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    i27 = i15;
                    i31 = (int) unsafe.objectFieldOffset(zza3);
                    int i922 = i912 + 1;
                    obj2 = zze[i922];
                    if (!(obj2 instanceof Field)) {
                    }
                    i32 = (int) unsafe.objectFieldOffset(zza4);
                    i33 = i14;
                    str = zzd;
                    i29 = 0;
                } else {
                    iArr2 = iArr4;
                    i27 = i15;
                    int i93 = i14 + 1;
                    Field zza5 = zza(cls2, (String) zze[i14]);
                    if (i84 == 9 || i84 == 17) {
                        objArr[((i74 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i84 == 27 || i84 == 49) {
                            i35 = i14 + 2;
                            objArr[((i74 / 3) << 1) + 1] = zze[i93];
                        } else if (i84 == 12 || i84 == 30 || i84 == 44) {
                            if (zzamzVar.zzb() == zzamy.PROTO2 || (charAt24 & 2048) != 0) {
                                i35 = i14 + 2;
                                objArr[((i74 / 3) << 1) + 1] = zze[i93];
                            }
                        } else if (i84 == 50) {
                            int i94 = i72 + 1;
                            iArr[i72] = i74;
                            int i95 = (i74 / 3) << 1;
                            int i96 = i14 + 2;
                            objArr[i95] = zze[i93];
                            if ((charAt24 & 2048) != 0) {
                                i93 = i14 + 3;
                                objArr[i95 + 1] = zze[i96];
                                i72 = i94;
                            } else {
                                i72 = i94;
                                i93 = i96;
                            }
                        }
                        i93 = i35;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) == 0 || i84 > 17) {
                        str = zzd;
                        i28 = 1048575;
                        i29 = 0;
                    } else {
                        int i97 = i26 + 1;
                        int charAt26 = zzd.charAt(i26);
                        if (charAt26 >= 55296) {
                            int i98 = charAt26 & 8191;
                            int i99 = 13;
                            while (true) {
                                i34 = i97 + 1;
                                charAt10 = zzd.charAt(i97);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i98 |= (charAt10 & 8191) << i99;
                                i99 += 13;
                                i97 = i34;
                            }
                            charAt26 = i98 | (charAt10 << i99);
                            i97 = i34;
                        }
                        int i100 = (i27 << 1) + (charAt26 / 32);
                        Object obj3 = zze[i100];
                        int i101 = charAt26;
                        if (obj3 instanceof Field) {
                            zza2 = (Field) obj3;
                        } else {
                            zza2 = zza(cls2, (String) obj3);
                            zze[i100] = zza2;
                        }
                        str = zzd;
                        i29 = i101 % 32;
                        int i102 = i97;
                        i28 = (int) unsafe.objectFieldOffset(zza2);
                        i26 = i102;
                    }
                    if (i84 < 18 || i84 > 49) {
                        int i103 = i93;
                        i30 = i26;
                        i31 = objectFieldOffset;
                        i32 = i28;
                        i33 = i103;
                    } else {
                        int i104 = i73 + 1;
                        iArr[i73] = objectFieldOffset;
                        int i105 = i93;
                        i30 = i26;
                        i31 = objectFieldOffset;
                        i32 = i28;
                        i33 = i105;
                        i73 = i104;
                    }
                }
                int i106 = i74 + 1;
                iArr2[i74] = i86;
                int i107 = i74 + 2;
                iArr2[i106] = ((charAt24 & 512) != 0 ? PKIFailureInfo.duplicateCertReq : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i84 << 20) | i31;
                i74 += 3;
                iArr2[i107] = (i29 << 20) | i32;
                i42 = i30;
                zzd = str;
                length = i85;
                zzamzVar2 = zzamzVar;
                i15 = i27;
                c10 = 55296;
                i14 = i33;
                iArr4 = iArr2;
            }
            return new zzamq<>(iArr4, objArr, i11, i13, zzamzVar2.zza(), false, iArr, i16, i71, zzamuVar, zzalwVar, zzanuVar, zzakwVar, zzamfVar);
        }
        throw new NoSuchMethodError();
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzanu<UT, UB> zzanuVar, Object obj2) {
        zzalj zzd;
        int i11 = this.zzc[i10];
        Object zze = zzanz.zze(obj, zzc(i10) & 1048575);
        return (zze == null || (zzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzr.zze(zze), zzd, (zzalj) ub2, (zzanu<UT, zzalj>) zzanuVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzalj zzaljVar, UB ub2, zzanu<UT, UB> zzanuVar, Object obj) {
        zzamd<?, ?> zza2 = this.zzr.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzaljVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzanuVar.zzc(obj);
                }
                zzake zzc = zzajv.zzc(zzame.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzame.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzanuVar.zza((zzanu<UT, UB>) ub2, i11, zzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10) {
        zzanb zze = zze(i10);
        long zzc = zzc(i10) & 1048575;
        if (!zzc((zzamq<T>) t10, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t10, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10, int i11) {
        zzanb zze = zze(i11);
        if (!zzc((zzamq<T>) t10, i10, i11)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e10) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t10, T t11) {
        zzf(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc = zzc(i10);
            long j10 = 1048575 & zzc;
            int i11 = this.zzc[i10];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza(t10, j10, zzanz.zza(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzb(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzd(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzd(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzc(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzd(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzc(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zzc(t10, j10, zzanz.zzh(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza(t10, j10, zzanz.zze(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t10, t11, i10);
                    break;
                case 10:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza(t10, j10, zzanz.zze(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzc(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzc(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzc(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzd(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzc(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzamq<T>) t11, i10)) {
                        zzanz.zza((Object) t10, j10, zzanz.zzd(t11, j10));
                        zzb((zzamq<T>) t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzo.zza(t10, t11, j10);
                    break;
                case 50:
                    zzand.zza(this.zzr, t10, t11, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzc((zzamq<T>) t11, i11, i10)) {
                        zzanz.zza(t10, j10, zzanz.zze(t11, j10));
                        zzb((zzamq<T>) t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzamq<T>) t11, i11, i10)) {
                        zzanz.zza(t10, j10, zzanz.zze(t11, j10));
                        zzb((zzamq<T>) t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t10, t11, i10);
                    break;
            }
        }
        zzand.zza(this.zzp, t10, t11);
        if (this.zzh) {
            zzand.zza(this.zzq, t10, t11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0775 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:37:0x0058, B:115:0x0770, B:117:0x0775, B:118:0x077a, B:134:0x013a, B:137:0x014c, B:138:0x0164, B:139:0x017c, B:140:0x0194, B:141:0x01ac, B:143:0x01bc, B:146:0x01c3, B:147:0x01c9, B:148:0x01d7, B:149:0x01ef, B:150:0x0203, B:151:0x021b, B:152:0x0229, B:153:0x0241, B:154:0x0259, B:155:0x0271, B:156:0x0289, B:157:0x02a1, B:158:0x02b9, B:159:0x02d1, B:160:0x02e9, B:162:0x02ff, B:163:0x0320, B:164:0x0309, B:166:0x0311, B:167:0x0331, B:168:0x0349, B:169:0x035d, B:170:0x0371, B:171:0x0385, B:172:0x0399, B:183:0x03cc, B:184:0x03da, B:185:0x03ee, B:186:0x0402, B:187:0x0416, B:188:0x042a, B:189:0x043e, B:190:0x0452, B:191:0x0466, B:192:0x047a, B:193:0x048e, B:194:0x04a2, B:195:0x04b6, B:196:0x04ca, B:201:0x04f1, B:202:0x04ff, B:203:0x0513, B:204:0x052b, B:206:0x0537, B:207:0x0545, B:208:0x0553, B:209:0x0567, B:210:0x057b, B:211:0x058f, B:212:0x05a3, B:213:0x05b7, B:214:0x05cb, B:215:0x05df, B:216:0x05f3, B:217:0x060b, B:218:0x0620, B:219:0x0634, B:220:0x0648, B:221:0x065c, B:223:0x066b, B:226:0x0672, B:227:0x0678, B:228:0x0682, B:229:0x0696, B:230:0x06aa, B:231:0x06c2, B:232:0x06d0, B:233:0x06e4, B:234:0x06f8, B:235:0x070c, B:236:0x0720, B:237:0x0734, B:238:0x0748, B:239:0x075c), top: B:36:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0781 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x07ae A[LOOP:1: B:27:0x07aa->B:29:0x07ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07c1  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t10, zzanc zzancVar, zzaku zzakuVar) {
        T t11;
        int i10;
        Object obj;
        int zzc;
        int zza2;
        zzakw<?> zzakwVar;
        zzaku zzakuVar2;
        zzanu zzanuVar;
        T t12;
        zzamq<T> zzamqVar;
        Object zza3;
        T t13;
        zzanu zzanuVar2;
        zzanu zzanuVar3;
        zzamq<T> zzamqVar2;
        zzamq<T> zzamqVar3 = this;
        zzaku zzakuVar3 = zzakuVar;
        zzakuVar3.getClass();
        zzf(t10);
        zzanu zzanuVar4 = zzamqVar3.zzp;
        zzakw<?> zzakwVar2 = zzamqVar3.zzq;
        Object obj2 = null;
        zzakx<?> zzakxVar = null;
        while (true) {
            try {
                zzc = zzancVar.zzc();
                zza2 = zzamqVar3.zza(zzc);
            } catch (Throwable th2) {
                th = th2;
                t11 = t10;
            }
            if (zza2 >= 0) {
                zzakwVar = zzakwVar2;
                zzakuVar2 = zzakuVar3;
                zzanuVar = zzanuVar4;
                t12 = t10;
                try {
                    int zzc2 = zzamqVar3.zzc(zza2);
                    switch ((267386880 & zzc2) >>> 20) {
                        case 0:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, zzancVar.zza());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 1:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzb());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 2:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzl());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 3:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzo());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 4:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzg());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 5:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzk());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 6:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzf());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 7:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zzc(t12, zzc2 & 1048575, zzancVar.zzs());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 8:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamqVar.zza((Object) t12, zzc2, zzancVar);
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 9:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamm zzammVar = (zzamm) zzamqVar.zza((zzamq<T>) t12, zza2);
                            zzancVar.zzb((zzanc) zzammVar, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar.zza((zzamq<T>) t12, zza2, zzammVar);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 10:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, zzancVar.zzp());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 11:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzj());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 12:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            int zze = zzancVar.zze();
                            zzalj zzd = zzamqVar.zzd(zza2);
                            if (zzd != null && !zzd.zza(zze)) {
                                obj2 = zzand.zza(t12, zzc, zze, obj2, zzanuVar4);
                                zzamqVar3 = zzamqVar;
                                break;
                            }
                            zzanz.zza((Object) t12, zzc2 & 1048575, zze);
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 13:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzh());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 14:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzm());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 15:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzi());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 16:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza((Object) t12, zzc2 & 1048575, zzancVar.zzn());
                            zzamqVar.zzb((zzamq<T>) t12, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 17:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamm zzammVar2 = (zzamm) zzamqVar.zza((zzamq<T>) t12, zza2);
                            zzancVar.zza((zzanc) zzammVar2, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar.zza((zzamq<T>) t12, zza2, zzammVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 18:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzc(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 19:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzg(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 20:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzi(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 21:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzq(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 22:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzh(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 23:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzf(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 24:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zze(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 25:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zza(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 26:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            if (zzg(zzc2)) {
                                zzancVar.zzo(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            } else {
                                zzancVar.zzn(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            }
                            zzamqVar3 = zzamqVar;
                            break;
                        case 27:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzb((List) zzamqVar.zzo.zza(t12, zzc2 & 1048575), (zzanb) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 28:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzb(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 29:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzp(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 30:
                            zzamqVar = zzamqVar3;
                            List<Integer> zza4 = zzamqVar.zzo.zza(t12, zzc2 & 1048575);
                            zzancVar.zzd(zza4);
                            zza3 = zzand.zza(t12, zzc, zza4, zzamqVar.zzd(zza2), obj2, zzanuVar);
                            zzanuVar4 = zzanuVar;
                            obj2 = zza3;
                            zzamqVar3 = zzamqVar;
                            break;
                        case 31:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzj(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 32:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzk(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 33:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzl(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 34:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzm(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 35:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzc(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 36:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzg(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 37:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzi(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 38:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzq(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 39:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzh(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 40:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzf(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 41:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zze(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 42:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zza(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 43:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzp(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 44:
                            zzamqVar = zzamqVar3;
                            t13 = t12;
                            List<Integer> zza5 = zzamqVar.zzo.zza(t13, zzc2 & 1048575);
                            zzancVar.zzd(zza5);
                            zzalj zzd2 = zzamqVar.zzd(zza2);
                            Object obj3 = obj2;
                            try {
                                zza3 = zzand.zza(t13, zzc, zza5, zzd2, obj3, zzanuVar);
                                zzanuVar4 = zzanuVar;
                                obj2 = zza3;
                            } catch (zzalo unused) {
                                zzanuVar3 = zzanuVar;
                                obj2 = obj3;
                                zzanuVar4 = zzanuVar3;
                                zzanuVar4.zza(zzancVar);
                                if (obj2 == null) {
                                }
                                if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                zzanuVar2 = zzanuVar;
                                obj2 = obj3;
                                zzanuVar4 = zzanuVar2;
                                t11 = t13;
                                zzamqVar3 = zzamqVar;
                                i10 = zzamqVar3.zzl;
                                obj = obj2;
                                while (i10 < zzamqVar3.zzm) {
                                }
                                T t14 = t11;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            zzamqVar3 = zzamqVar;
                            break;
                        case 45:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzj(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 46:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzk(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 47:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzl(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 48:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zzm(zzamqVar.zzo.zza(t12, zzc2 & 1048575));
                            zzamqVar3 = zzamqVar;
                            break;
                        case 49:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzancVar.zza((List) zzamqVar.zzo.zza(t12, zzc2 & 1048575), (zzanb) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 50:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            Object zzf = zzamqVar.zzf(zza2);
                            long zzc3 = zzamqVar.zzc(zza2) & 1048575;
                            Object zze2 = zzanz.zze(t12, zzc3);
                            if (zze2 == null) {
                                zze2 = zzamqVar.zzr.zzb(zzf);
                                zzanz.zza(t12, zzc3, zze2);
                            } else if (zzamqVar.zzr.zzf(zze2)) {
                                Object zzb2 = zzamqVar.zzr.zzb(zzf);
                                zzamqVar.zzr.zza(zzb2, zze2);
                                zzanz.zza(t12, zzc3, zzb2);
                                zze2 = zzb2;
                            }
                            zzancVar.zza(zzamqVar.zzr.zze(zze2), zzamqVar.zzr.zza(zzf), zzakuVar2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 51:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Double.valueOf(zzancVar.zza()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 52:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Float.valueOf(zzancVar.zzb()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 53:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Long.valueOf(zzancVar.zzl()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 54:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Long.valueOf(zzancVar.zzo()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 55:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Integer.valueOf(zzancVar.zzg()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 56:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Long.valueOf(zzancVar.zzk()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 57:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Integer.valueOf(zzancVar.zzf()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 58:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Boolean.valueOf(zzancVar.zzs()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 59:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamqVar.zza((Object) t12, zzc2, zzancVar);
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 60:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzamm zzammVar3 = (zzamm) zzamqVar.zza((zzamq<T>) t12, zzc, zza2);
                            zzancVar.zzb((zzanc) zzammVar3, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                            zzamqVar.zza((zzamq<T>) t12, zzc, zza2, zzammVar3);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 61:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, zzancVar.zzp());
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 62:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Integer.valueOf(zzancVar.zzj()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 63:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            int zze3 = zzancVar.zze();
                            zzalj zzd3 = zzamqVar.zzd(zza2);
                            if (zzd3 != null && !zzd3.zza(zze3)) {
                                obj2 = zzand.zza(t12, zzc, zze3, obj2, zzanuVar4);
                                zzamqVar3 = zzamqVar;
                                break;
                            }
                            zzanz.zza(t12, zzc2 & 1048575, Integer.valueOf(zze3));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 64:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Integer.valueOf(zzancVar.zzh()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 65:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Long.valueOf(zzancVar.zzm()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 66:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Integer.valueOf(zzancVar.zzi()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 67:
                            zzamqVar = zzamqVar3;
                            zzanuVar4 = zzanuVar;
                            zzanz.zza(t12, zzc2 & 1048575, Long.valueOf(zzancVar.zzn()));
                            zzamqVar.zzb((zzamq<T>) t12, zzc, zza2);
                            zzamqVar3 = zzamqVar;
                            break;
                        case 68:
                            zzamqVar = zzamqVar3;
                            t13 = t12;
                            zzanuVar4 = zzanuVar;
                            try {
                                zzamm zzammVar4 = (zzamm) zzamqVar.zza((zzamq<T>) t13, zzc, zza2);
                                zzancVar.zza((zzanc) zzammVar4, (zzanb<zzanc>) zzamqVar.zze(zza2), zzakuVar2);
                                zzamqVar.zza((zzamq<T>) t13, zzc, zza2, zzammVar4);
                            } catch (zzalo unused2) {
                                zzanuVar4.zza(zzancVar);
                                if (obj2 == null) {
                                }
                                if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                }
                            }
                            zzamqVar3 = zzamqVar;
                            break;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = zzanuVar.zzc(t12);
                                } catch (zzalo unused3) {
                                    zzanuVar3 = zzanuVar;
                                    zzamqVar = zzamqVar3;
                                    t13 = t12;
                                    zzanuVar4 = zzanuVar3;
                                    zzanuVar4.zza(zzancVar);
                                    if (obj2 == null) {
                                        obj2 = zzanuVar4.zzc(t13);
                                    }
                                    if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                        int i11 = zzamqVar.zzl;
                                        Object obj4 = obj2;
                                        while (i11 < zzamqVar.zzm) {
                                            T t15 = t13;
                                            obj4 = zzamqVar.zza((Object) t15, zzamqVar.zzk[i11], (int) obj4, (zzanu<UT, int>) zzanuVar4, (Object) t10);
                                            i11++;
                                            t13 = t15;
                                        }
                                        T t16 = t13;
                                        if (obj4 != null) {
                                            zzanuVar4.zzb((Object) t16, (T) obj4);
                                            return;
                                        }
                                        return;
                                    }
                                    zzamqVar3 = zzamqVar;
                                    zzakuVar3 = zzakuVar2;
                                    zzakwVar2 = zzakwVar;
                                }
                            }
                            try {
                                if (!zzanuVar.zza((zzanu) obj2, zzancVar, 0)) {
                                    int i12 = zzamqVar3.zzl;
                                    Object obj5 = obj2;
                                    while (i12 < zzamqVar3.zzm) {
                                        T t17 = t12;
                                        zzanu zzanuVar5 = zzanuVar;
                                        obj5 = zzamqVar3.zza((Object) t17, zzamqVar3.zzk[i12], (int) obj5, (zzanu<UT, int>) zzanuVar5, (Object) t10);
                                        i12++;
                                        t12 = t17;
                                        zzamqVar3 = zzamqVar3;
                                        zzanuVar = zzanuVar5;
                                    }
                                    zzanu zzanuVar6 = zzanuVar;
                                    zzamqVar2 = zzamqVar3;
                                    T t18 = t12;
                                    if (obj5 != null) {
                                        zzanuVar6.zzb((Object) t18, (T) obj5);
                                        break;
                                    }
                                } else {
                                    zzamqVar = zzamqVar3;
                                    zzanuVar4 = zzanuVar;
                                    zzamqVar3 = zzamqVar;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                zzanuVar2 = zzanuVar;
                                zzamqVar = zzamqVar3;
                                t13 = t12;
                                zzanuVar4 = zzanuVar2;
                                t11 = t13;
                                zzamqVar3 = zzamqVar;
                                i10 = zzamqVar3.zzl;
                                obj = obj2;
                                while (i10 < zzamqVar3.zzm) {
                                }
                                T t142 = t11;
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    t11 = t12;
                    zzanuVar4 = zzanuVar;
                    i10 = zzamqVar3.zzl;
                    obj = obj2;
                    while (i10 < zzamqVar3.zzm) {
                    }
                    T t1422 = t11;
                    if (obj != null) {
                    }
                    throw th;
                }
            } else if (zzc == Integer.MAX_VALUE) {
                int i13 = zzamqVar3.zzl;
                Object obj6 = obj2;
                while (i13 < zzamqVar3.zzm) {
                    obj6 = zzamqVar3.zza((Object) t10, zzamqVar3.zzk[i13], (int) obj6, (zzanu<UT, int>) zzanuVar4, (Object) t10);
                    i13++;
                    zzamqVar3 = zzamqVar3;
                }
                zzamqVar2 = zzamqVar3;
                if (obj6 != null) {
                    zzanuVar4.zzb((Object) t10, (T) obj6);
                }
            } else {
                zzamqVar = zzamqVar3;
                t13 = t10;
                try {
                    Object zza6 = !zzamqVar.zzh ? null : zzakwVar2.zza(zzakuVar3, zzamqVar.zzg, zzc);
                    if (zza6 != null) {
                        if (zzakxVar == null) {
                            try {
                                zzakxVar = zzakwVar2.zzb(t13);
                            } catch (Throwable th6) {
                                th = th6;
                                t11 = t13;
                                zzamqVar3 = zzamqVar;
                                i10 = zzamqVar3.zzl;
                                obj = obj2;
                                while (i10 < zzamqVar3.zzm) {
                                }
                                T t14222 = t11;
                                if (obj != null) {
                                }
                                throw th;
                            }
                        }
                        zzakx<?> zzakxVar2 = zzakxVar;
                        zzanu zzanuVar7 = zzanuVar4;
                        try {
                            obj2 = zzakwVar2.zza(t13, zzancVar, zza6, zzakuVar3, zzakxVar2, obj2, zzanuVar7);
                            zzakxVar = zzakxVar2;
                            zzanuVar4 = zzanuVar7;
                            zzakwVar = zzakwVar2;
                            zzakuVar2 = zzakuVar3;
                            zzamqVar3 = zzamqVar;
                        } catch (Throwable th7) {
                            th = th7;
                            t11 = t13;
                            zzanuVar4 = zzanuVar7;
                        }
                    } else {
                        zzakwVar = zzakwVar2;
                        t11 = t13;
                        zzakuVar2 = zzakuVar3;
                        try {
                            zzanuVar4.zza(zzancVar);
                            if (obj2 == null) {
                                try {
                                    obj2 = zzanuVar4.zzc(t11);
                                } catch (Throwable th8) {
                                    th = th8;
                                }
                            }
                            if (!zzanuVar4.zza((zzanu) obj2, zzancVar, 0)) {
                                int i14 = zzamqVar.zzl;
                                Object obj7 = obj2;
                                while (i14 < zzamqVar.zzm) {
                                    zzamq<T> zzamqVar4 = zzamqVar;
                                    obj7 = zzamqVar4.zza((Object) t11, zzamqVar.zzk[i14], (int) obj7, (zzanu<UT, int>) zzanuVar4, (Object) t10);
                                    i14++;
                                    zzanuVar4 = zzanuVar4;
                                    zzamqVar = zzamqVar4;
                                }
                                zzanu zzanuVar8 = zzanuVar4;
                                if (obj7 != null) {
                                    zzanuVar8.zzb((Object) t11, (T) obj7);
                                    return;
                                }
                                return;
                            }
                            zzamqVar3 = zzamqVar;
                            zzanuVar4 = zzanuVar4;
                        } catch (Throwable th9) {
                            th = th9;
                            zzamqVar3 = zzamqVar;
                            zzanuVar = zzanuVar4;
                            zzanuVar4 = zzanuVar;
                            i10 = zzamqVar3.zzl;
                            obj = obj2;
                            while (i10 < zzamqVar3.zzm) {
                            }
                            T t142222 = t11;
                            if (obj != null) {
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th10) {
                    th = th10;
                    zzanu zzanuVar9 = zzanuVar4;
                    t12 = t13;
                    zzamqVar3 = zzamqVar;
                    zzanuVar = zzanuVar9;
                    t11 = t12;
                    zzanuVar4 = zzanuVar;
                    i10 = zzamqVar3.zzl;
                    obj = obj2;
                    while (i10 < zzamqVar3.zzm) {
                    }
                    T t1422222 = t11;
                    if (obj != null) {
                    }
                    throw th;
                }
                zzamqVar3 = zzamqVar;
                i10 = zzamqVar3.zzl;
                obj = obj2;
                while (i10 < zzamqVar3.zzm) {
                    obj = zzamqVar3.zza((Object) t11, zzamqVar3.zzk[i10], (int) obj, (zzanu<UT, int>) zzanuVar4, (Object) t10);
                    i10++;
                    zzamqVar3 = this;
                }
                T t14222222 = t11;
                if (obj != null) {
                    zzanuVar4.zzb((Object) t14222222, (T) obj);
                }
                throw th;
            }
            zzakuVar3 = zzakuVar2;
            zzakwVar2 = zzakwVar;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzaju zzajuVar) {
        zza((zzamq<T>) t10, bArr, i10, i11, 0, zzajuVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i10) {
        if (zzc((zzamq<T>) t11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, zzc);
            if (object != null) {
                zzanb zze = zze(i10);
                if (!zzc((zzamq<T>) t10, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t10, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t10, zzc, zza2);
                    }
                    zzb((zzamq<T>) t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t10, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
        }
    }

    private final void zza(Object obj, int i10, zzanc zzancVar) {
        if (zzg(i10)) {
            zzanz.zza(obj, i10 & 1048575, zzancVar.zzr());
        } else if (this.zzi) {
            zzanz.zza(obj, i10 & 1048575, zzancVar.zzq());
        } else {
            zzanz.zza(obj, i10 & 1048575, zzancVar.zzp());
        }
    }

    private final void zza(T t10, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((zzamq<T>) t10, i10);
    }

    private final void zza(T t10, int i10, int i11, Object obj) {
        zzb.putObject(t10, zzc(i11) & 1048575, obj);
        zzb((zzamq<T>) t10, i10, i11);
    }

    private final <K, V> void zza(zzaol zzaolVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zzaolVar.zza(i10, this.zzr.zza(zzf(i11)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i10, Object obj, zzaol zzaolVar) {
        if (obj instanceof String) {
            zzaolVar.zza(i10, (String) obj);
        } else {
            zzaolVar.zza(i10, (zzajv) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a60  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzanb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t10, zzaol zzaolVar) {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i10;
        Map.Entry<?, ?> entry2;
        int i11;
        int i12;
        int i13;
        int i14;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        zzamq<T> zzamqVar = this;
        int i15 = 267386880;
        int i16 = 1;
        int i17 = 1048575;
        if (zzaolVar.zza() == 2) {
            zza(zzamqVar.zzp, t10, zzaolVar);
            if (zzamqVar.zzh) {
                zzakx<?> zza2 = zzamqVar.zzq.zza(t10);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zzc();
                    entry3 = it2.next();
                    for (length2 = zzamqVar.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzamqVar.zzc(length2);
                        int i18 = zzamqVar.zzc[length2];
                        while (entry3 != null && zzamqVar.zzq.zza(entry3) > i18) {
                            zzamqVar.zzq.zza(zzaolVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, zzanz.zza(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, zzanz.zzb(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzb(i18, zzanz.zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zze(i18, zzanz.zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzc(i18, zzanz.zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, zzanz.zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzb(i18, zzanz.zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, zzanz.zzh(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zza(i18, zzanz.zze(t10, zzc & 1048575), zzaolVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzb(i18, zzanz.zze(t10, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, (zzajv) zzanz.zze(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzf(i18, zzanz.zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, zzanz.zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzd(i18, zzanz.zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzc(i18, zzanz.zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zze(i18, zzanz.zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zzd(i18, zzanz.zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzamqVar.zzc((zzamq<T>) t10, length2)) {
                                    zzaolVar.zza(i18, zzanz.zze(t10, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzand.zzb(zzamqVar.zzc[length2], (List<Double>) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 19:
                                zzand.zzf(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 20:
                                zzand.zzh(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 21:
                                zzand.zzn(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 22:
                                zzand.zzg(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 23:
                                zzand.zze(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 24:
                                zzand.zzd(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 25:
                                zzand.zza(zzamqVar.zzc[length2], (List<Boolean>) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 26:
                                zzand.zzb(zzamqVar.zzc[length2], (List<String>) zzanz.zze(t10, zzc & 1048575), zzaolVar);
                                break;
                            case 27:
                                zzand.zzb(zzamqVar.zzc[length2], (List<?>) zzanz.zze(t10, zzc & 1048575), zzaolVar, (zzanb<?>) zzamqVar.zze(length2));
                                break;
                            case 28:
                                zzand.zza(zzamqVar.zzc[length2], (List<zzajv>) zzanz.zze(t10, zzc & 1048575), zzaolVar);
                                break;
                            case 29:
                                zzand.zzm(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 30:
                                zzand.zzc(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 31:
                                zzand.zzi(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 32:
                                zzand.zzj(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 33:
                                zzand.zzk(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 34:
                                zzand.zzl(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, false);
                                break;
                            case 35:
                                zzand.zzb(zzamqVar.zzc[length2], (List<Double>) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 36:
                                zzand.zzf(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 37:
                                zzand.zzh(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 38:
                                zzand.zzn(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 39:
                                zzand.zzg(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 40:
                                zzand.zze(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 41:
                                zzand.zzd(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 42:
                                zzand.zza(zzamqVar.zzc[length2], (List<Boolean>) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 43:
                                zzand.zzm(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 44:
                                zzand.zzc(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 45:
                                zzand.zzi(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 46:
                                zzand.zzj(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 47:
                                zzand.zzk(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 48:
                                zzand.zzl(zzamqVar.zzc[length2], (List) zzanz.zze(t10, zzc & 1048575), zzaolVar, true);
                                break;
                            case 49:
                                zzand.zza(zzamqVar.zzc[length2], (List<?>) zzanz.zze(t10, zzc & 1048575), zzaolVar, (zzanb<?>) zzamqVar.zze(length2));
                                break;
                            case 50:
                                zzamqVar.zza(zzaolVar, i18, zzanz.zze(t10, zzc & 1048575), length2);
                                break;
                            case 51:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, zza(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, zzb(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzb(i18, zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zze(i18, zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzc(i18, zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzb(i18, zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, zze(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zza(i18, zzanz.zze(t10, zzc & 1048575), zzaolVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzb(i18, zzanz.zze(t10, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, (zzajv) zzanz.zze(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzf(i18, zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzd(i18, zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzc(i18, zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zze(i18, zzc(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zzd(i18, zzd(t10, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzamqVar.zzc((zzamq<T>) t10, i18, length2)) {
                                    zzaolVar.zza(i18, zzanz.zze(t10, zzc & 1048575), zzamqVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzamqVar.zzq.zza(zzaolVar, entry3);
                        entry3 = it2.hasNext() ? it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry3 = null;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
            return;
        }
        if (zzamqVar.zzh) {
            zzakx<?> zza3 = zzamqVar.zzq.zza(t10);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = zzamqVar.zzc.length;
                Unsafe unsafe = zzb;
                i10 = 0;
                int i19 = 0;
                int i20 = 1048575;
                while (i10 < length) {
                    int zzc2 = zzamqVar.zzc(i10);
                    int i21 = i15;
                    int[] iArr = zzamqVar.zzc;
                    int i22 = iArr[i10];
                    int i23 = (zzc2 & i21) >>> 20;
                    int i24 = i16;
                    if (i23 <= 17) {
                        int i25 = iArr[i10 + 2];
                        int i26 = i25 & i17;
                        if (i26 != i20) {
                            i19 = i26 == i17 ? 0 : unsafe.getInt(t10, i26);
                            i20 = i26;
                        }
                        int i27 = i24 << (i25 >>> 20);
                        entry2 = entry;
                        i11 = i20;
                        i12 = i19;
                        i13 = i27;
                    } else {
                        entry2 = entry;
                        i11 = i20;
                        i12 = i19;
                        i13 = 0;
                    }
                    while (entry2 != null && zzamqVar.zzq.zza(entry2) <= i22) {
                        zzamqVar.zzq.zza(zzaolVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j10 = zzc2 & i17;
                    switch (i23) {
                        case 0:
                            i14 = i24;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, zzanz.zza(t10, j10));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            int i28 = i24;
                            i14 = i28;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, zzanz.zzb(t10, j10));
                                i14 = i28;
                            }
                            zzamqVar = this;
                            break;
                        case 2:
                            int i29 = i24;
                            i14 = i29;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzb(i22, unsafe.getLong(t10, j10));
                                i14 = i29;
                            }
                            zzamqVar = this;
                            break;
                        case 3:
                            int i30 = i24;
                            i14 = i30;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zze(i22, unsafe.getLong(t10, j10));
                                i14 = i30;
                            }
                            zzamqVar = this;
                            break;
                        case 4:
                            int i31 = i24;
                            i14 = i31;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzc(i22, unsafe.getInt(t10, j10));
                                i14 = i31;
                            }
                            zzamqVar = this;
                            break;
                        case 5:
                            int i32 = i24;
                            i14 = i32;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, unsafe.getLong(t10, j10));
                                i14 = i32;
                            }
                            zzamqVar = this;
                            break;
                        case 6:
                            int i33 = i24;
                            i14 = i33;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzb(i22, unsafe.getInt(t10, j10));
                                i14 = i33;
                            }
                            zzamqVar = this;
                            break;
                        case 7:
                            int i34 = i24;
                            i14 = i34;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, zzanz.zzh(t10, j10));
                                i14 = i34;
                            }
                            zzamqVar = this;
                            break;
                        case 8:
                            int i35 = i24;
                            i14 = i35;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zza(i22, unsafe.getObject(t10, j10), zzaolVar);
                                i14 = i35;
                            }
                            zzamqVar = this;
                            break;
                        case 9:
                            i14 = i24;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzb(i22, unsafe.getObject(t10, j10), zzamqVar.zze(i10));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            int i36 = i24;
                            i14 = i36;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, (zzajv) unsafe.getObject(t10, j10));
                                i14 = i36;
                            }
                            zzamqVar = this;
                            break;
                        case 11:
                            int i37 = i24;
                            i14 = i37;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzf(i22, unsafe.getInt(t10, j10));
                                i14 = i37;
                            }
                            zzamqVar = this;
                            break;
                        case 12:
                            int i38 = i24;
                            i14 = i38;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, unsafe.getInt(t10, j10));
                                i14 = i38;
                            }
                            zzamqVar = this;
                            break;
                        case 13:
                            int i39 = i24;
                            i14 = i39;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzd(i22, unsafe.getInt(t10, j10));
                                i14 = i39;
                            }
                            zzamqVar = this;
                            break;
                        case 14:
                            int i40 = i24;
                            i14 = i40;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzc(i22, unsafe.getLong(t10, j10));
                                i14 = i40;
                            }
                            zzamqVar = this;
                            break;
                        case 15:
                            int i41 = i24;
                            i14 = i41;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zze(i22, unsafe.getInt(t10, j10));
                                i14 = i41;
                            }
                            zzamqVar = this;
                            break;
                        case 16:
                            int i42 = i24;
                            i14 = i42;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zzd(i22, unsafe.getLong(t10, j10));
                                i14 = i42;
                            }
                            zzamqVar = this;
                            break;
                        case 17:
                            i14 = i24;
                            if (zzamqVar.zza((zzamq<T>) t10, i10, i11, i12, i13)) {
                                zzaolVar.zza(i22, unsafe.getObject(t10, j10), zzamqVar.zze(i10));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i14 = i24;
                            zzand.zzb(zzamqVar.zzc[i10], (List<Double>) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 19:
                            i14 = i24;
                            zzand.zzf(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 20:
                            i14 = i24;
                            zzand.zzh(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 21:
                            i14 = i24;
                            zzand.zzn(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 22:
                            i14 = i24;
                            zzand.zzg(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 23:
                            i14 = i24;
                            zzand.zze(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 24:
                            i14 = i24;
                            zzand.zzd(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 25:
                            i14 = i24;
                            zzand.zza(zzamqVar.zzc[i10], (List<Boolean>) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 26:
                            i14 = i24;
                            zzand.zzb(zzamqVar.zzc[i10], (List<String>) unsafe.getObject(t10, j10), zzaolVar);
                            break;
                        case 27:
                            i14 = i24;
                            zzand.zzb(zzamqVar.zzc[i10], (List<?>) unsafe.getObject(t10, j10), zzaolVar, (zzanb<?>) zzamqVar.zze(i10));
                            break;
                        case 28:
                            i14 = i24;
                            zzand.zza(zzamqVar.zzc[i10], (List<zzajv>) unsafe.getObject(t10, j10), zzaolVar);
                            break;
                        case 29:
                            i14 = i24;
                            zzand.zzm(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 30:
                            i14 = i24;
                            zzand.zzc(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 31:
                            i14 = i24;
                            zzand.zzi(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 32:
                            i14 = i24;
                            zzand.zzj(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 33:
                            i14 = i24;
                            zzand.zzk(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 34:
                            i14 = i24;
                            zzand.zzl(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, false);
                            break;
                        case 35:
                            boolean z10 = i24;
                            zzand.zzb(zzamqVar.zzc[i10], (List<Double>) unsafe.getObject(t10, j10), zzaolVar, z10);
                            i14 = z10;
                            break;
                        case 36:
                            boolean z11 = i24;
                            zzand.zzf(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z11);
                            i14 = z11;
                            break;
                        case 37:
                            boolean z12 = i24;
                            zzand.zzh(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z12);
                            i14 = z12;
                            break;
                        case 38:
                            boolean z13 = i24;
                            zzand.zzn(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z13);
                            i14 = z13;
                            break;
                        case 39:
                            boolean z14 = i24;
                            zzand.zzg(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z14);
                            i14 = z14;
                            break;
                        case 40:
                            boolean z15 = i24;
                            zzand.zze(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z15);
                            i14 = z15;
                            break;
                        case 41:
                            boolean z16 = i24;
                            zzand.zzd(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z16);
                            i14 = z16;
                            break;
                        case 42:
                            boolean z17 = i24;
                            zzand.zza(zzamqVar.zzc[i10], (List<Boolean>) unsafe.getObject(t10, j10), zzaolVar, z17);
                            i14 = z17;
                            break;
                        case 43:
                            boolean z18 = i24;
                            zzand.zzm(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z18);
                            i14 = z18;
                            break;
                        case 44:
                            boolean z19 = i24;
                            zzand.zzc(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z19);
                            i14 = z19;
                            break;
                        case 45:
                            boolean z20 = i24;
                            zzand.zzi(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z20);
                            i14 = z20;
                            break;
                        case 46:
                            boolean z21 = i24;
                            zzand.zzj(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z21);
                            i14 = z21;
                            break;
                        case 47:
                            boolean z22 = i24;
                            zzand.zzk(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z22);
                            i14 = z22;
                            break;
                        case 48:
                            boolean z23 = i24;
                            zzand.zzl(zzamqVar.zzc[i10], (List) unsafe.getObject(t10, j10), zzaolVar, z23);
                            i14 = z23;
                            break;
                        case 49:
                            zzand.zza(zzamqVar.zzc[i10], (List<?>) unsafe.getObject(t10, j10), zzaolVar, (zzanb<?>) zzamqVar.zze(i10));
                            i14 = i24;
                            break;
                        case 50:
                            zzamqVar.zza(zzaolVar, i22, unsafe.getObject(t10, j10), i10);
                            i14 = i24;
                            break;
                        case 51:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, zza(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 52:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, zzb(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 53:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzb(i22, zzd(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 54:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zze(i22, zzd(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 55:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzc(i22, zzc(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 56:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, zzd(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 57:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzb(i22, zzc(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 58:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, zze(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 59:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zza(i22, unsafe.getObject(t10, j10), zzaolVar);
                            }
                            i14 = i24;
                            break;
                        case 60:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzb(i22, unsafe.getObject(t10, j10), zzamqVar.zze(i10));
                            }
                            i14 = i24;
                            break;
                        case 61:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, (zzajv) unsafe.getObject(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 62:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzf(i22, zzc(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 63:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, zzc(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 64:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzd(i22, zzc(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 65:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzc(i22, zzd(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 66:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zze(i22, zzc(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 67:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zzd(i22, zzd(t10, j10));
                            }
                            i14 = i24;
                            break;
                        case 68:
                            if (zzamqVar.zzc((zzamq<T>) t10, i22, i10)) {
                                zzaolVar.zza(i22, unsafe.getObject(t10, j10), zzamqVar.zze(i10));
                            }
                            i14 = i24;
                            break;
                        default:
                            i14 = i24;
                            break;
                    }
                    i10 += 3;
                    i19 = i12;
                    it = it3;
                    i17 = 1048575;
                    i20 = i11;
                    entry = entry2;
                    i15 = i21;
                    i16 = i14;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    zzamqVar.zzq.zza(zzaolVar, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(zzamqVar.zzp, t10, zzaolVar);
            }
        }
        entry = null;
        it = null;
        length = zzamqVar.zzc.length;
        Unsafe unsafe2 = zzb;
        i10 = 0;
        int i192 = 0;
        int i202 = 1048575;
        while (i10 < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(zzamqVar.zzp, t10, zzaolVar);
    }

    private static <UT, UB> void zza(zzanu<UT, UB> zzanuVar, T t10, zzaol zzaolVar) {
        zzanuVar.zzb((zzanu<UT, UB>) zzanuVar.zzd(t10), zzaolVar);
    }

    private final boolean zza(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzc((zzamq<T>) t10, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzanb zzanbVar) {
        return zzanbVar.zze(zzanz.zze(obj, i10 & 1048575));
    }
}
