package com.google.android.gms.internal.measurement;

import androidx.media3.common.C;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzku<T> implements zzli<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmh.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkq zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzky zzn;
    private final zzka zzo;
    private final zzmc<?, ?> zzp;
    private final zziz<?> zzq;
    private final zzkn zzr;

    private static <T> double zza(T t, long j) {
        return ((Double) zzmh.zze(t, j)).doubleValue();
    }

    private static boolean zzg(int i) {
        return (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0;
    }

    private static <T> float zzb(T t, long j) {
        return ((Float) zzmh.zze(t, j)).floatValue();
    }

    private static int zza(byte[] bArr, int i, int i2, zzmo zzmoVar, Class<?> cls, zzhw zzhwVar) throws IOException {
        switch (zzkx.zza[zzmoVar.ordinal()]) {
            case 1:
                int zzd = zzht.zzd(bArr, i, zzhwVar);
                zzhwVar.zzc = Boolean.valueOf(zzhwVar.zzb != 0);
                return zzd;
            case 2:
                return zzht.zza(bArr, i, zzhwVar);
            case 3:
                zzhwVar.zzc = Double.valueOf(zzht.zza(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzhwVar.zzc = Integer.valueOf(zzht.zzc(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzhwVar.zzc = Long.valueOf(zzht.zzd(bArr, i));
                return i + 8;
            case 8:
                zzhwVar.zzc = Float.valueOf(zzht.zzb(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzht.zzc(bArr, i, zzhwVar);
                zzhwVar.zzc = Integer.valueOf(zzhwVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzht.zzd(bArr, i, zzhwVar);
                zzhwVar.zzc = Long.valueOf(zzhwVar.zzb);
                return zzd2;
            case 14:
                return zzht.zza(zzle.zza().zza((Class) cls), bArr, i, i2, zzhwVar);
            case 15:
                int zzc2 = zzht.zzc(bArr, i, zzhwVar);
                zzhwVar.zzc = Integer.valueOf(zzil.zza(zzhwVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzht.zzd(bArr, i, zzhwVar);
                zzhwVar.zzc = Long.valueOf(zzil.zza(zzhwVar.zzb));
                return zzd3;
            case 17:
                return zzht.zzb(bArr, i, zzhwVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zza(T t) {
        int i;
        int zza2;
        int zza3;
        int zzb2;
        int zzd;
        int zzf;
        int zzg;
        zzku<T> zzkuVar = this;
        T t2 = t;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i3 < zzkuVar.zzc.length) {
            int zzc = zzkuVar.zzc(i3);
            int i7 = (267386880 & zzc) >>> 20;
            int[] iArr = zzkuVar.zzc;
            int i8 = iArr[i3];
            int i9 = iArr[i3 + 2];
            int i10 = i9 & i2;
            if (i7 <= 17) {
                if (i10 != i6) {
                    i4 = i10 == i2 ? 0 : unsafe.getInt(t2, i10);
                    i6 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = zzc & i2;
            if (i7 >= zzjf.DOUBLE_LIST_PACKED.zza()) {
                zzjf.SINT64_LIST_PACKED.zza();
            }
            int i11 = i5;
            switch (i7) {
                case 0:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzir.zza(i8, 0.0d);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 1:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzir.zza(i8, 0.0f);
                        i5 = i11 + zza3;
                        zzkuVar = this;
                        t2 = t;
                        break;
                    }
                    zzkuVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 2:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zzb(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 3:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zze(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 4:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zzc(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 5:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzir.zza(i8, 0L);
                        i5 = i11 + zza3;
                        zzkuVar = this;
                        t2 = t;
                        break;
                    }
                    zzkuVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 6:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzir.zzb(i8, 0);
                        i5 = i11 + zza3;
                        zzkuVar = this;
                        t2 = t;
                        break;
                    }
                    zzkuVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 7:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzir.zza(i8, true);
                        i5 = i11 + zza3;
                        zzkuVar = this;
                        t2 = t;
                        break;
                    }
                    zzkuVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 8:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        Object object = unsafe.getObject(t2, j);
                        if (object instanceof zzhx) {
                            zzb2 = zzir.zza(i8, (zzhx) object);
                        } else {
                            zzb2 = zzir.zza(i8, (String) object);
                        }
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 9:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzlk.zza(i8, unsafe.getObject(t2, j), zzkuVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 10:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zza(i8, (zzhx) unsafe.getObject(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 11:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zzf(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 12:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zza(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 13:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzir.zzd(i8, 0);
                        i5 = i11 + zza3;
                        zzkuVar = this;
                        t2 = t;
                        break;
                    }
                    zzkuVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 14:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza3 = zzir.zzc(i8, 0L);
                        i5 = i11 + zza3;
                        zzkuVar = this;
                        t2 = t;
                        break;
                    }
                    zzkuVar = this;
                    t2 = t;
                    i5 = i11;
                    break;
                case 15:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zze(i8, unsafe.getInt(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 16:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zzb2 = zzir.zzd(i8, unsafe.getLong(t2, j));
                        i5 = i11 + zzb2;
                        zzkuVar = this;
                        break;
                    }
                    zzkuVar = this;
                    i5 = i11;
                    break;
                case 17:
                    if (zzkuVar.zza((zzku<T>) t2, i3, i6, i4, i)) {
                        zza2 = zzir.zza(i8, (zzkq) unsafe.getObject(t2, j), zzkuVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 18:
                    zza2 = zzlk.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 19:
                    zza2 = zzlk.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 20:
                    zza2 = zzlk.zzf(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 21:
                    zza2 = zzlk.zzj(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 22:
                    zza2 = zzlk.zze(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 23:
                    zza2 = zzlk.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 24:
                    zza2 = zzlk.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 25:
                    zza2 = zzlk.zza(i8, (List<?>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 26:
                    zza2 = zzlk.zzb(i8, (List) unsafe.getObject(t2, j));
                    i5 = i11 + zza2;
                    break;
                case 27:
                    zza2 = zzlk.zzb(i8, (List<?>) unsafe.getObject(t2, j), zzkuVar.zze(i3));
                    i5 = i11 + zza2;
                    break;
                case 28:
                    zza2 = zzlk.zza(i8, (List<zzhx>) unsafe.getObject(t2, j));
                    i5 = i11 + zza2;
                    break;
                case 29:
                    zza2 = zzlk.zzi(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 30:
                    zza2 = zzlk.zzb(i8, (List<Integer>) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 31:
                    zza2 = zzlk.zzc(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 32:
                    zza2 = zzlk.zzd(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 33:
                    zza2 = zzlk.zzg(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 34:
                    zza2 = zzlk.zzh(i8, (List) unsafe.getObject(t2, j), false);
                    i5 = i11 + zza2;
                    break;
                case 35:
                    zzd = zzlk.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 36:
                    zzd = zzlk.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 37:
                    zzd = zzlk.zzf((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 38:
                    zzd = zzlk.zzj((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 39:
                    zzd = zzlk.zze((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 40:
                    zzd = zzlk.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 41:
                    zzd = zzlk.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 42:
                    zzd = zzlk.zza((List<?>) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 43:
                    zzd = zzlk.zzi((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 44:
                    zzd = zzlk.zzb((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 45:
                    zzd = zzlk.zzc((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 46:
                    zzd = zzlk.zzd((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 47:
                    zzd = zzlk.zzg((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 48:
                    zzd = zzlk.zzh((List) unsafe.getObject(t2, j));
                    if (zzd > 0) {
                        zzf = zzir.zzf(i8);
                        zzg = zzir.zzg(zzd);
                        i5 = i11 + zzf + zzg + zzd;
                        break;
                    }
                    i5 = i11;
                    break;
                case 49:
                    zza2 = zzlk.zza(i8, (List<zzkq>) unsafe.getObject(t2, j), zzkuVar.zze(i3));
                    i5 = i11 + zza2;
                    break;
                case 50:
                    zza2 = zzkuVar.zzr.zza(i8, unsafe.getObject(t2, j), zzkuVar.zzf(i3));
                    i5 = i11 + zza2;
                    break;
                case 51:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, 0.0d);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 52:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, 0.0f);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 53:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzb(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 54:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zze(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 55:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzc(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 56:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, 0L);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 57:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzb(i8, 0);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 58:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, true);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 59:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        Object object2 = unsafe.getObject(t2, j);
                        if (object2 instanceof zzhx) {
                            zza2 = zzir.zza(i8, (zzhx) object2);
                        } else {
                            zza2 = zzir.zza(i8, (String) object2);
                        }
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 60:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzlk.zza(i8, unsafe.getObject(t2, j), zzkuVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 61:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, (zzhx) unsafe.getObject(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 62:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzf(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 63:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 64:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzd(i8, 0);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 65:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzc(i8, 0L);
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 66:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zze(i8, zzc(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 67:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zzd(i8, zzd(t2, j));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                case 68:
                    if (zzkuVar.zzc((zzku<T>) t2, i8, i3)) {
                        zza2 = zzir.zza(i8, (zzkq) unsafe.getObject(t2, j), zzkuVar.zze(i3));
                        i5 = i11 + zza2;
                        break;
                    }
                    i5 = i11;
                    break;
                default:
                    i5 = i11;
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzmc<?, ?> zzmcVar = zzkuVar.zzp;
        int zza4 = i5 + zzmcVar.zza((zzmc<?, ?>) zzmcVar.zzd(t2));
        if (!zzkuVar.zzh) {
            return zza4;
        }
        zzja<?> zza5 = zzkuVar.zzq.zza(t2);
        int i12 = 0;
        for (int i13 = 0; i13 < zza5.zza.zzb(); i13++) {
            Map.Entry<?, Object> zzb3 = zza5.zza.zzb(i13);
            i12 += zzja.zza((zzjc<?>) zzb3.getKey(), zzb3.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzc()) {
            i12 += zzja.zza((zzjc<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i12;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzb(T t) {
        int i;
        int zza2;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzc = zzc(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & zzc;
            int i5 = 37;
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza2 = zzjn.zza(Double.doubleToLongBits(zzmh.zza(t, j)));
                    i2 = i + zza2;
                    break;
                case 1:
                    i = i2 * 53;
                    zza2 = Float.floatToIntBits(zzmh.zzb(t, j));
                    i2 = i + zza2;
                    break;
                case 2:
                    i = i2 * 53;
                    zza2 = zzjn.zza(zzmh.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 3:
                    i = i2 * 53;
                    zza2 = zzjn.zza(zzmh.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 4:
                    i = i2 * 53;
                    zza2 = zzmh.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 5:
                    i = i2 * 53;
                    zza2 = zzjn.zza(zzmh.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 6:
                    i = i2 * 53;
                    zza2 = zzmh.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 7:
                    i = i2 * 53;
                    zza2 = zzjn.zza(zzmh.zzh(t, j));
                    i2 = i + zza2;
                    break;
                case 8:
                    i = i2 * 53;
                    zza2 = ((String) zzmh.zze(t, j)).hashCode();
                    i2 = i + zza2;
                    break;
                case 9:
                    Object zze = zzmh.zze(t, j);
                    if (zze != null) {
                        i5 = zze.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza2 = zzmh.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 11:
                    i = i2 * 53;
                    zza2 = zzmh.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 12:
                    i = i2 * 53;
                    zza2 = zzmh.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 13:
                    i = i2 * 53;
                    zza2 = zzmh.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 14:
                    i = i2 * 53;
                    zza2 = zzjn.zza(zzmh.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 15:
                    i = i2 * 53;
                    zza2 = zzmh.zzc(t, j);
                    i2 = i + zza2;
                    break;
                case 16:
                    i = i2 * 53;
                    zza2 = zzjn.zza(zzmh.zzd(t, j));
                    i2 = i + zza2;
                    break;
                case 17:
                    Object zze2 = zzmh.zze(t, j);
                    if (zze2 != null) {
                        i5 = zze2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
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
                    i = i2 * 53;
                    zza2 = zzmh.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 50:
                    i = i2 * 53;
                    zza2 = zzmh.zze(t, j).hashCode();
                    i2 = i + zza2;
                    break;
                case 51:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(Double.doubleToLongBits(zza(t, j)));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = Float.floatToIntBits(zzb(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(zze(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = ((String) zzmh.zze(t, j)).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmh.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmh.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzc(t, j);
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzjn.zza(zzd(t, j));
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzku<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zza2 = zzmh.zze(t, j).hashCode();
                        i2 = i + zza2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzp.zzd(t).hashCode();
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t).hashCode() : hashCode;
    }

    private static <T> int zzc(T t, long j) {
        return ((Integer) zzmh.zze(t, j)).intValue();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int zza(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzhw r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzku.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzhw):int");
    }

    private final int zza(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zza(i, 0);
    }

    private final int zzb(int i) {
        return this.zzc[i + 2];
    }

    private final int zza(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int zzc(int i) {
        return this.zzc[i + 1];
    }

    private static <T> long zzd(T t, long j) {
        return ((Long) zzmh.zze(t, j)).longValue();
    }

    private final zzjp zzd(int i) {
        return (zzjp) this.zzd[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzku<T> zza(Class<T> cls, zzko zzkoVar, zzky zzkyVar, zzka zzkaVar, zzmc<?, ?> zzmcVar, zziz<?> zzizVar, zzkn zzknVar) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        boolean z;
        int i16;
        int i17;
        int[] iArr2;
        int i18;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        Field zza2;
        char charAt10;
        int i23;
        int i24;
        Object obj;
        Field zza3;
        Object obj2;
        Field zza4;
        int i25;
        char charAt11;
        int i26;
        char charAt12;
        int i27;
        char charAt13;
        int i28;
        char charAt14;
        if (zzkoVar instanceof zzlg) {
            zzlg zzlgVar = (zzlg) zzkoVar;
            String zzd = zzlgVar.zzd();
            int length = zzd.length();
            char c = 55296;
            boolean z2 = true;
            if (zzd.charAt(0) >= 55296) {
                int i29 = 1;
                while (true) {
                    i = i29 + 1;
                    if (zzd.charAt(i29) < 55296) {
                        break;
                    }
                    i29 = i;
                }
            } else {
                i = 1;
            }
            int i30 = i + 1;
            int charAt15 = zzd.charAt(i);
            if (charAt15 >= 55296) {
                int i31 = charAt15 & 8191;
                int i32 = 13;
                while (true) {
                    i28 = i30 + 1;
                    charAt14 = zzd.charAt(i30);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i31 |= (charAt14 & 8191) << i32;
                    i32 += 13;
                    i30 = i28;
                }
                charAt15 = i31 | (charAt14 << i32);
                i30 = i28;
            }
            if (charAt15 == 0) {
                i4 = 0;
                charAt = 0;
                i3 = 0;
                i7 = 0;
                i2 = 0;
                i6 = 0;
                iArr = zza;
                i5 = 0;
            } else {
                int i33 = i30 + 1;
                int charAt16 = zzd.charAt(i30);
                if (charAt16 >= 55296) {
                    int i34 = charAt16 & 8191;
                    int i35 = 13;
                    while (true) {
                        i15 = i33 + 1;
                        charAt9 = zzd.charAt(i33);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i34 |= (charAt9 & 8191) << i35;
                        i35 += 13;
                        i33 = i15;
                    }
                    charAt16 = i34 | (charAt9 << i35);
                    i33 = i15;
                }
                int i36 = i33 + 1;
                int charAt17 = zzd.charAt(i33);
                if (charAt17 >= 55296) {
                    int i37 = charAt17 & 8191;
                    int i38 = 13;
                    while (true) {
                        i14 = i36 + 1;
                        charAt8 = zzd.charAt(i36);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i37 |= (charAt8 & 8191) << i38;
                        i38 += 13;
                        i36 = i14;
                    }
                    charAt17 = i37 | (charAt8 << i38);
                    i36 = i14;
                }
                int i39 = i36 + 1;
                int charAt18 = zzd.charAt(i36);
                if (charAt18 >= 55296) {
                    int i40 = charAt18 & 8191;
                    int i41 = 13;
                    while (true) {
                        i13 = i39 + 1;
                        charAt7 = zzd.charAt(i39);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i40 |= (charAt7 & 8191) << i41;
                        i41 += 13;
                        i39 = i13;
                    }
                    charAt18 = i40 | (charAt7 << i41);
                    i39 = i13;
                }
                int i42 = i39 + 1;
                int charAt19 = zzd.charAt(i39);
                if (charAt19 >= 55296) {
                    int i43 = charAt19 & 8191;
                    int i44 = 13;
                    while (true) {
                        i12 = i42 + 1;
                        charAt6 = zzd.charAt(i42);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i43 |= (charAt6 & 8191) << i44;
                        i44 += 13;
                        i42 = i12;
                    }
                    charAt19 = i43 | (charAt6 << i44);
                    i42 = i12;
                }
                int i45 = i42 + 1;
                charAt = zzd.charAt(i42);
                if (charAt >= 55296) {
                    int i46 = charAt & 8191;
                    int i47 = 13;
                    while (true) {
                        i11 = i45 + 1;
                        charAt5 = zzd.charAt(i45);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i46 |= (charAt5 & 8191) << i47;
                        i47 += 13;
                        i45 = i11;
                    }
                    charAt = i46 | (charAt5 << i47);
                    i45 = i11;
                }
                int i48 = i45 + 1;
                int charAt20 = zzd.charAt(i45);
                if (charAt20 >= 55296) {
                    int i49 = charAt20 & 8191;
                    int i50 = 13;
                    while (true) {
                        i10 = i48 + 1;
                        charAt4 = zzd.charAt(i48);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i49 |= (charAt4 & 8191) << i50;
                        i50 += 13;
                        i48 = i10;
                    }
                    charAt20 = i49 | (charAt4 << i50);
                    i48 = i10;
                }
                int i51 = i48 + 1;
                int charAt21 = zzd.charAt(i48);
                if (charAt21 >= 55296) {
                    int i52 = charAt21 & 8191;
                    int i53 = 13;
                    while (true) {
                        i9 = i51 + 1;
                        charAt3 = zzd.charAt(i51);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i52 |= (charAt3 & 8191) << i53;
                        i53 += 13;
                        i51 = i9;
                    }
                    charAt21 = i52 | (charAt3 << i53);
                    i51 = i9;
                }
                int i54 = i51 + 1;
                int charAt22 = zzd.charAt(i51);
                if (charAt22 >= 55296) {
                    int i55 = charAt22 & 8191;
                    int i56 = 13;
                    while (true) {
                        i8 = i54 + 1;
                        charAt2 = zzd.charAt(i54);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i55 |= (charAt2 & 8191) << i56;
                        i56 += 13;
                        i54 = i8;
                    }
                    charAt22 = i55 | (charAt2 << i56);
                    i54 = i8;
                }
                int[] iArr3 = new int[charAt22 + charAt20 + charAt21];
                i2 = (charAt16 << 1) + charAt17;
                int i57 = charAt20;
                i3 = charAt18;
                i4 = i57;
                i5 = charAt16;
                iArr = iArr3;
                i6 = charAt22;
                i30 = i54;
                i7 = charAt19;
            }
            Unsafe unsafe = zzb;
            Object[] zze = zzlgVar.zze();
            Class<?> cls2 = zzlgVar.zza().getClass();
            int[] iArr4 = new int[charAt * 3];
            Object[] objArr = new Object[charAt << 1];
            int i58 = i6 + i4;
            int i59 = i6;
            int i60 = i58;
            int i61 = 0;
            int i62 = 0;
            while (i30 < length) {
                int i63 = i30 + 1;
                int charAt23 = zzd.charAt(i30);
                if (charAt23 >= c) {
                    int i64 = charAt23 & 8191;
                    z = z2;
                    int i65 = i63;
                    int i66 = 13;
                    while (true) {
                        i27 = i65 + 1;
                        charAt13 = zzd.charAt(i65);
                        if (charAt13 < c) {
                            break;
                        }
                        i64 |= (charAt13 & 8191) << i66;
                        i66 += 13;
                        i65 = i27;
                    }
                    charAt23 = i64 | (charAt13 << i66);
                    i16 = i27;
                } else {
                    z = z2;
                    i16 = i63;
                }
                int i67 = i16 + 1;
                int charAt24 = zzd.charAt(i16);
                if (charAt24 >= c) {
                    int i68 = charAt24 & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i26 = i69 + 1;
                        charAt12 = zzd.charAt(i69);
                        if (charAt12 < c) {
                            break;
                        }
                        i68 |= (charAt12 & 8191) << i70;
                        i70 += 13;
                        i69 = i26;
                    }
                    charAt24 = i68 | (charAt12 << i70);
                    i17 = i26;
                } else {
                    i17 = i67;
                }
                int i71 = charAt24 & 255;
                zzlg zzlgVar2 = zzlgVar;
                if ((charAt24 & 1024) != 0) {
                    iArr[i62] = i61;
                    i62++;
                }
                int i72 = length;
                if (i71 >= 51) {
                    int i73 = i17 + 1;
                    int charAt25 = zzd.charAt(i17);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i74 = charAt25 & 8191;
                        int i75 = 13;
                        while (true) {
                            i25 = i73 + 1;
                            charAt11 = zzd.charAt(i73);
                            if (charAt11 < c2) {
                                break;
                            }
                            i74 |= (charAt11 & 8191) << i75;
                            i75 += 13;
                            i73 = i25;
                            c2 = 55296;
                        }
                        charAt25 = i74 | (charAt11 << i75);
                        i73 = i25;
                    }
                    int i76 = i71 - 51;
                    int i77 = i73;
                    if (i76 == 9 || i76 == 17) {
                        i24 = i2 + 1;
                        objArr[((i61 / 3) << 1) + 1] = zze[i2];
                    } else {
                        if (i76 == 12 && (zzlgVar2.zzb().equals(zzlf.PROTO2) || (charAt24 & 2048) != 0)) {
                            i24 = i2 + 1;
                            objArr[((i61 / 3) << 1) + 1] = zze[i2];
                        }
                        int i78 = charAt25 << 1;
                        obj = zze[i78];
                        if (!(obj instanceof Field)) {
                            zza3 = (Field) obj;
                        } else {
                            zza3 = zza(cls2, (String) obj);
                            zze[i78] = zza3;
                        }
                        iArr2 = iArr4;
                        int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zza3);
                        int i79 = i78 + 1;
                        obj2 = zze[i79];
                        if (!(obj2 instanceof Field)) {
                            zza4 = (Field) obj2;
                        } else {
                            zza4 = zza(cls2, (String) obj2);
                            zze[i79] = zza4;
                        }
                        objectFieldOffset = objectFieldOffset2;
                        i20 = (int) unsafe.objectFieldOffset(zza4);
                        str = zzd;
                        i21 = i77;
                        i22 = 0;
                    }
                    i2 = i24;
                    int i782 = charAt25 << 1;
                    obj = zze[i782];
                    if (!(obj instanceof Field)) {
                    }
                    iArr2 = iArr4;
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zza3);
                    int i792 = i782 + 1;
                    obj2 = zze[i792];
                    if (!(obj2 instanceof Field)) {
                    }
                    objectFieldOffset = objectFieldOffset22;
                    i20 = (int) unsafe.objectFieldOffset(zza4);
                    str = zzd;
                    i21 = i77;
                    i22 = 0;
                } else {
                    iArr2 = iArr4;
                    int i80 = i2 + 1;
                    Field zza5 = zza(cls2, (String) zze[i2]);
                    if (i71 == 9 || i71 == 17) {
                        i18 = i80;
                        objArr[((i61 / 3) << 1) + 1] = zza5.getType();
                    } else {
                        if (i71 == 27 || i71 == 49) {
                            i23 = i2 + 2;
                            objArr[((i61 / 3) << 1) + 1] = zze[i80];
                        } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                            i18 = i80;
                            if (zzlgVar2.zzb() == zzlf.PROTO2 || (charAt24 & 2048) != 0) {
                                i23 = i2 + 2;
                                objArr[((i61 / 3) << 1) + 1] = zze[i18];
                            }
                        } else if (i71 == 50) {
                            int i81 = i59 + 1;
                            iArr[i59] = i61;
                            int i82 = (i61 / 3) << 1;
                            i18 = i2 + 2;
                            objArr[i82] = zze[i80];
                            if ((charAt24 & 2048) != 0) {
                                i19 = i2 + 3;
                                objArr[i82 + 1] = zze[i18];
                                i59 = i81;
                                objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                                if ((charAt24 & 4096) != 0 || i71 > 17) {
                                    i2 = i19;
                                    str = zzd;
                                    i20 = 1048575;
                                    i21 = i17;
                                    i22 = 0;
                                } else {
                                    int i83 = i17 + 1;
                                    int charAt26 = zzd.charAt(i17);
                                    i2 = i19;
                                    if (charAt26 >= 55296) {
                                        int i84 = charAt26 & 8191;
                                        int i85 = 13;
                                        while (true) {
                                            i21 = i83 + 1;
                                            charAt10 = zzd.charAt(i83);
                                            if (charAt10 < 55296) {
                                                break;
                                            }
                                            i84 |= (charAt10 & 8191) << i85;
                                            i85 += 13;
                                            i83 = i21;
                                        }
                                        charAt26 = i84 | (charAt10 << i85);
                                    } else {
                                        i21 = i83;
                                    }
                                    int i86 = (i5 << 1) + (charAt26 / 32);
                                    Object obj3 = zze[i86];
                                    str = zzd;
                                    if (obj3 instanceof Field) {
                                        zza2 = (Field) obj3;
                                    } else {
                                        zza2 = zza(cls2, (String) obj3);
                                        zze[i86] = zza2;
                                    }
                                    i20 = (int) unsafe.objectFieldOffset(zza2);
                                    i22 = charAt26 % 32;
                                }
                                if (i71 >= 18 && i71 <= 49) {
                                    iArr[i60] = objectFieldOffset;
                                    i60++;
                                }
                            } else {
                                i59 = i81;
                            }
                        } else {
                            i18 = i80;
                        }
                        i19 = i23;
                        objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                        if ((charAt24 & 4096) != 0) {
                        }
                        i2 = i19;
                        str = zzd;
                        i20 = 1048575;
                        i21 = i17;
                        i22 = 0;
                        if (i71 >= 18) {
                            iArr[i60] = objectFieldOffset;
                            i60++;
                        }
                    }
                    i19 = i18;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza5);
                    if ((charAt24 & 4096) != 0) {
                    }
                    i2 = i19;
                    str = zzd;
                    i20 = 1048575;
                    i21 = i17;
                    i22 = 0;
                    if (i71 >= 18) {
                    }
                }
                int i87 = i61 + 1;
                iArr2[i61] = charAt23;
                int i88 = i61 + 2;
                int i89 = i20;
                iArr2[i87] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? C.BUFFER_FLAG_LAST_SAMPLE : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i71 << 20) | objectFieldOffset;
                i61 += 3;
                iArr2[i88] = (i22 << 20) | i89;
                z2 = z;
                zzlgVar = zzlgVar2;
                i30 = i21;
                zzd = str;
                length = i72;
                iArr4 = iArr2;
                c = 55296;
            }
            zzlg zzlgVar3 = zzlgVar;
            return new zzku<>(iArr4, objArr, i3, i7, zzlgVar3.zza(), zzlgVar3.zzb(), false, iArr, i6, i58, zzkyVar, zzkaVar, zzmcVar, zzizVar, zzknVar);
        }
        throw new NoSuchMethodError();
    }

    private final zzli zze(int i) {
        int i2 = (i / 3) << 1;
        zzli zzliVar = (zzli) this.zzd[i2];
        if (zzliVar != null) {
            return zzliVar;
        }
        zzli<T> zza2 = zzle.zza().zza((Class) this.zzd[i2 + 1]);
        this.zzd[i2] = zza2;
        return zza2;
    }

    private static zzmf zze(Object obj) {
        zzjk zzjkVar = (zzjk) obj;
        zzmf zzmfVar = zzjkVar.zzb;
        if (zzmfVar != zzmf.zzc()) {
            return zzmfVar;
        }
        zzmf zzd = zzmf.zzd();
        zzjkVar.zzb = zzd;
        return zzd;
    }

    private final <UT, UB> UB zza(Object obj, int i, UB ub, zzmc<UT, UB> zzmcVar, Object obj2) {
        zzjp zzd;
        int i2 = this.zzc[i];
        Object zze = zzmh.zze(obj, zzc(i) & 1048575);
        return (zze == null || (zzd = zzd(i)) == null) ? ub : (UB) zza(i, i2, this.zzr.zze(zze), zzd, (zzjp) ub, (zzmc<UT, zzjp>) zzmcVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzjp zzjpVar, UB ub, zzmc<UT, UB> zzmcVar, Object obj) {
        zzkl<?, ?> zza2 = this.zzr.zza(zzf(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjpVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmcVar.zzc(obj);
                }
                zzig zzc = zzhx.zzc(zzki.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzki.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmcVar.zza((zzmc<UT, UB>) ub, i2, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    private final Object zzf(int i) {
        return this.zzd[(i / 3) << 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t, int i) {
        zzli zze = zze(i);
        long zzc = zzc(i) & 1048575;
        if (!zzc((zzku<T>) t, i)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc);
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
    private final Object zza(T t, int i, int i2) {
        zzli zze = zze(i2);
        if (!zzc((zzku<T>) t, i, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t, zzc(i2) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private zzku(int[] iArr, Object[] objArr, int i, int i2, zzkq zzkqVar, zzlf zzlfVar, boolean z, int[] iArr2, int i3, int i4, zzky zzkyVar, zzka zzkaVar, zzmc<?, ?> zzmcVar, zziz<?> zzizVar, zzkn zzknVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzkqVar instanceof zzjk;
        this.zzh = zzizVar != null && zzizVar.zza(zzkqVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzn = zzkyVar;
        this.zzo = zzkaVar;
        this.zzp = zzmcVar;
        this.zzq = zzizVar;
        this.zzg = zzkqVar;
        this.zzr = zzknVar;
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzc(T t) {
        if (zzg(t)) {
            if (t instanceof zzjk) {
                zzjk zzjkVar = (zzjk) t;
                zzjkVar.zzc(Integer.MAX_VALUE);
                zzjkVar.zza = 0;
                zzjkVar.zzci();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzc = zzc(i);
                long j = 1048575 & zzc;
                int i2 = (zzc & 267386880) >>> 20;
                if (i2 != 9) {
                    if (i2 == 60 || i2 == 68) {
                        if (zzc((zzku<T>) t, this.zzc[i], i)) {
                            zze(i).zzc(zzb.getObject(t, j));
                        }
                    } else {
                        switch (i2) {
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
                                this.zzo.zzb(t, j);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                }
                if (zzc((zzku<T>) t, i)) {
                    zze(i).zzc(zzb.getObject(t, j));
                }
            }
            this.zzp.zzf(t);
            if (this.zzh) {
                this.zzq.zzc(t);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zza(T t, T t2) {
        zzf(t);
        t2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzc = zzc(i);
            long j = 1048575 & zzc;
            int i2 = this.zzc[i];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza(t, j, zzmh.zza(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzb(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzd(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzd(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzc(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzd(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzc(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zzc(t, j, zzmh.zzh(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza(t, j, zzmh.zze(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza(t, j, zzmh.zze(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzc(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzc(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzc(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzd(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzc(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzku<T>) t2, i)) {
                        zzmh.zza((Object) t, j, zzmh.zzd(t2, j));
                        zzb((zzku<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
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
                    this.zzo.zza(t, t2, j);
                    break;
                case 50:
                    zzlk.zza(this.zzr, t, t2, j);
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
                    if (zzc((zzku<T>) t2, i2, i)) {
                        zzmh.zza(t, j, zzmh.zze(t2, j));
                        zzb((zzku<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzku<T>) t2, i2, i)) {
                        zzmh.zza(t, j, zzmh.zze(t2, j));
                        zzb((zzku<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        zzlk.zza(this.zzp, t, t2);
        if (this.zzh) {
            zzlk.zza(this.zzq, t, t2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x05df A[LOOP:1: B:27:0x05db->B:29:0x05df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05a9 A[Catch: all -> 0x05ce, TryCatch #6 {all -> 0x05ce, blocks: (B:96:0x05a4, B:98:0x05a9, B:99:0x05ae), top: B:95:0x05a4 }] */
    @Override // com.google.android.gms.internal.measurement.zzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzlj zzljVar, zzix zzixVar) throws IOException {
        T t2;
        int i;
        Object obj;
        zziz<?> zzizVar;
        zzku<T> zzkuVar;
        zzix zzixVar2;
        T t3;
        Object zza2;
        zzku<T> zzkuVar2 = this;
        zzix zzixVar3 = zzixVar;
        zzixVar3.getClass();
        zzf(t);
        zzmc zzmcVar = zzkuVar2.zzp;
        zziz<?> zzizVar2 = zzkuVar2.zzq;
        Object obj2 = null;
        zzja<?> zzjaVar = null;
        while (true) {
            try {
                int zzc = zzljVar.zzc();
                int zza3 = zzkuVar2.zza(zzc);
                if (zza3 >= 0) {
                    zzizVar = zzizVar2;
                    zzkuVar = zzkuVar2;
                    zzixVar2 = zzixVar3;
                    t3 = t;
                    int zzc2 = zzkuVar.zzc(zza3);
                    switch ((267386880 & zzc2) >>> 20) {
                        case 0:
                            zzmh.zza(t3, zzc2 & 1048575, zzljVar.zza());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 1:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzb());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 2:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzl());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 3:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzo());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 4:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzg());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 5:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzk());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 6:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzf());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 7:
                            zzmh.zzc(t3, zzc2 & 1048575, zzljVar.zzs());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 8:
                            zzkuVar.zza((Object) t3, zzc2, zzljVar);
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 9:
                            zzkq zzkqVar = (zzkq) zzkuVar.zza((zzku<T>) t3, zza3);
                            zzljVar.zzb((zzlj) zzkqVar, (zzli<zzlj>) zzkuVar.zze(zza3), zzixVar2);
                            zzkuVar.zza((zzku<T>) t3, zza3, zzkqVar);
                            break;
                        case 10:
                            zzmh.zza(t3, zzc2 & 1048575, zzljVar.zzp());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 11:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzj());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 12:
                            int zze = zzljVar.zze();
                            zzjp zzd = zzkuVar.zzd(zza3);
                            if (zzd != null && !zzd.zza(zze)) {
                                obj2 = zzlk.zza(t3, zzc, zze, obj2, zzmcVar);
                                break;
                            }
                            zzmh.zza((Object) t3, zzc2 & 1048575, zze);
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 13:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzh());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 14:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzm());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 15:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzi());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 16:
                            zzmh.zza((Object) t3, zzc2 & 1048575, zzljVar.zzn());
                            zzkuVar.zzb((zzku<T>) t3, zza3);
                            break;
                        case 17:
                            zzkq zzkqVar2 = (zzkq) zzkuVar.zza((zzku<T>) t3, zza3);
                            zzljVar.zza((zzlj) zzkqVar2, (zzli<zzlj>) zzkuVar.zze(zza3), zzixVar2);
                            zzkuVar.zza((zzku<T>) t3, zza3, zzkqVar2);
                            break;
                        case 18:
                            zzljVar.zzc(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 19:
                            zzljVar.zzg(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 20:
                            zzljVar.zzi(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 21:
                            zzljVar.zzq(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 22:
                            zzljVar.zzh(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 23:
                            zzljVar.zzf(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 24:
                            zzljVar.zze(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 25:
                            zzljVar.zza(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 26:
                            if (zzg(zzc2)) {
                                zzljVar.zzo(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                                break;
                            } else {
                                zzljVar.zzn(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                                break;
                            }
                        case 27:
                            zzljVar.zzb((List) zzkuVar.zzo.zza(t3, zzc2 & 1048575), (zzli) zzkuVar.zze(zza3), zzixVar2);
                            break;
                        case 28:
                            zzljVar.zzb(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 29:
                            zzljVar.zzp(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 30:
                            List<Integer> zza4 = zzkuVar.zzo.zza(t3, zzc2 & 1048575);
                            zzljVar.zzd(zza4);
                            zzjp zzd2 = zzkuVar.zzd(zza3);
                            Object obj3 = obj2;
                            zzmc zzmcVar2 = zzmcVar;
                            zza2 = zzlk.zza(t3, zzc, zza4, zzd2, obj3, zzmcVar2);
                            zzmcVar = zzmcVar2;
                            obj2 = zza2;
                            break;
                        case 31:
                            zzljVar.zzj(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 32:
                            zzljVar.zzk(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 33:
                            zzljVar.zzl(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 34:
                            zzljVar.zzm(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 35:
                            zzljVar.zzc(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 36:
                            zzljVar.zzg(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 37:
                            zzljVar.zzi(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 38:
                            zzljVar.zzq(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 39:
                            zzljVar.zzh(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 40:
                            zzljVar.zzf(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 41:
                            zzljVar.zze(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 42:
                            zzljVar.zza(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 43:
                            zzljVar.zzp(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 44:
                            List<Integer> zza5 = zzkuVar.zzo.zza(t3, zzc2 & 1048575);
                            zzljVar.zzd(zza5);
                            zzjp zzd3 = zzkuVar.zzd(zza3);
                            Object obj4 = obj2;
                            zzmc zzmcVar3 = zzmcVar;
                            try {
                                zza2 = zzlk.zza(t3, zzc, zza5, zzd3, obj4, zzmcVar3);
                                zzmcVar = zzmcVar3;
                                obj2 = zza2;
                                break;
                            } catch (zzjs unused) {
                                obj2 = obj4;
                                zzmcVar = zzmcVar3;
                                t2 = t3;
                                zzkuVar2 = zzkuVar;
                                try {
                                    zzmcVar.zza(zzljVar);
                                    if (obj2 == null) {
                                    }
                                    if (zzmcVar.zza((zzmc) obj2, zzljVar)) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    i = zzkuVar2.zzl;
                                    obj = obj2;
                                    while (i < zzkuVar2.zzm) {
                                    }
                                    if (obj != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj2 = obj4;
                                zzmcVar = zzmcVar3;
                                t2 = t3;
                                zzkuVar2 = zzkuVar;
                                i = zzkuVar2.zzl;
                                obj = obj2;
                                while (i < zzkuVar2.zzm) {
                                }
                                if (obj != null) {
                                }
                                throw th;
                            }
                            break;
                        case 45:
                            zzljVar.zzj(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 46:
                            zzljVar.zzk(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 47:
                            zzljVar.zzl(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 48:
                            zzljVar.zzm(zzkuVar.zzo.zza(t3, zzc2 & 1048575));
                            break;
                        case 49:
                            zzljVar.zza((List) zzkuVar.zzo.zza(t3, zzc2 & 1048575), (zzli) zzkuVar.zze(zza3), zzixVar2);
                            break;
                        case 50:
                            Object zzf = zzkuVar.zzf(zza3);
                            long zzc3 = zzkuVar.zzc(zza3) & 1048575;
                            Object zze2 = zzmh.zze(t3, zzc3);
                            if (zze2 == null) {
                                zze2 = zzkuVar.zzr.zzb(zzf);
                                zzmh.zza(t3, zzc3, zze2);
                            } else if (zzkuVar.zzr.zzf(zze2)) {
                                Object zzb2 = zzkuVar.zzr.zzb(zzf);
                                zzkuVar.zzr.zza(zzb2, zze2);
                                zzmh.zza(t3, zzc3, zzb2);
                                zze2 = zzb2;
                            }
                            zzljVar.zza(zzkuVar.zzr.zze(zze2), zzkuVar.zzr.zza(zzf), zzixVar2);
                            break;
                        case 51:
                            zzmh.zza(t3, zzc2 & 1048575, Double.valueOf(zzljVar.zza()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 52:
                            zzmh.zza(t3, zzc2 & 1048575, Float.valueOf(zzljVar.zzb()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 53:
                            zzmh.zza(t3, zzc2 & 1048575, Long.valueOf(zzljVar.zzl()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 54:
                            zzmh.zza(t3, zzc2 & 1048575, Long.valueOf(zzljVar.zzo()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 55:
                            zzmh.zza(t3, zzc2 & 1048575, Integer.valueOf(zzljVar.zzg()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 56:
                            zzmh.zza(t3, zzc2 & 1048575, Long.valueOf(zzljVar.zzk()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 57:
                            zzmh.zza(t3, zzc2 & 1048575, Integer.valueOf(zzljVar.zzf()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 58:
                            zzmh.zza(t3, zzc2 & 1048575, Boolean.valueOf(zzljVar.zzs()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 59:
                            zzkuVar.zza((Object) t3, zzc2, zzljVar);
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 60:
                            zzkq zzkqVar3 = (zzkq) zzkuVar.zza((zzku<T>) t3, zzc, zza3);
                            zzljVar.zzb((zzlj) zzkqVar3, (zzli<zzlj>) zzkuVar.zze(zza3), zzixVar2);
                            zzkuVar.zza((zzku<T>) t3, zzc, zza3, zzkqVar3);
                            break;
                        case 61:
                            zzmh.zza(t3, zzc2 & 1048575, zzljVar.zzp());
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 62:
                            zzmh.zza(t3, zzc2 & 1048575, Integer.valueOf(zzljVar.zzj()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 63:
                            int zze3 = zzljVar.zze();
                            zzjp zzd4 = zzkuVar.zzd(zza3);
                            if (zzd4 != null && !zzd4.zza(zze3)) {
                                obj2 = zzlk.zza(t3, zzc, zze3, obj2, zzmcVar);
                                break;
                            }
                            zzmh.zza(t3, zzc2 & 1048575, Integer.valueOf(zze3));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 64:
                            zzmh.zza(t3, zzc2 & 1048575, Integer.valueOf(zzljVar.zzh()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 65:
                            zzmh.zza(t3, zzc2 & 1048575, Long.valueOf(zzljVar.zzm()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 66:
                            zzmh.zza(t3, zzc2 & 1048575, Integer.valueOf(zzljVar.zzi()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 67:
                            zzmh.zza(t3, zzc2 & 1048575, Long.valueOf(zzljVar.zzn()));
                            zzkuVar.zzb((zzku<T>) t3, zzc, zza3);
                            break;
                        case 68:
                            zzkq zzkqVar4 = (zzkq) zzkuVar.zza((zzku<T>) t3, zzc, zza3);
                            zzljVar.zza((zzlj) zzkqVar4, (zzli<zzlj>) zzkuVar.zze(zza3), zzixVar2);
                            zzkuVar.zza((zzku<T>) t3, zzc, zza3, zzkqVar4);
                            break;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = zzmcVar.zzc(t3);
                                } catch (zzjs unused2) {
                                    t2 = t3;
                                    zzkuVar2 = zzkuVar;
                                    zzmcVar.zza(zzljVar);
                                    if (obj2 == null) {
                                        obj2 = zzmcVar.zzc(t2);
                                    }
                                    if (zzmcVar.zza((zzmc) obj2, zzljVar)) {
                                        Object obj5 = obj2;
                                        for (int i2 = zzkuVar2.zzl; i2 < zzkuVar2.zzm; i2++) {
                                            obj5 = zzkuVar2.zza((Object) t2, zzkuVar2.zzk[i2], (int) obj5, (zzmc<UT, int>) zzmcVar, (Object) t);
                                        }
                                        if (obj5 != null) {
                                            zzmcVar.zzb((Object) t2, (T) obj5);
                                            return;
                                        }
                                        return;
                                    }
                                    zzixVar3 = zzixVar2;
                                    zzizVar2 = zzizVar;
                                }
                            }
                            if (!zzmcVar.zza((zzmc) obj2, zzljVar)) {
                                int i3 = zzkuVar.zzl;
                                Object obj6 = obj2;
                                while (i3 < zzkuVar.zzm) {
                                    T t4 = t3;
                                    obj6 = zzkuVar.zza((Object) t4, zzkuVar.zzk[i3], (int) obj6, (zzmc<UT, int>) zzmcVar, (Object) t);
                                    i3++;
                                    t3 = t4;
                                }
                                T t5 = t3;
                                if (obj6 != null) {
                                    zzmcVar.zzb((Object) t5, (T) obj6);
                                    return;
                                }
                                return;
                            }
                            break;
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    int i4 = zzkuVar2.zzl;
                    Object obj7 = obj2;
                    while (i4 < zzkuVar2.zzm) {
                        obj7 = zzkuVar2.zza((Object) t, zzkuVar2.zzk[i4], (int) obj7, (zzmc<UT, int>) zzmcVar, (Object) t);
                        i4++;
                        zzkuVar2 = zzkuVar2;
                    }
                    zzkuVar = zzkuVar2;
                    if (obj7 != null) {
                        zzmcVar.zzb((Object) t, (T) obj7);
                    }
                } else {
                    zzkuVar = zzkuVar2;
                    t3 = t;
                    try {
                        Object zza6 = !zzkuVar.zzh ? null : zzizVar2.zza(zzixVar3, zzkuVar.zzg, zzc);
                        if (zza6 != null) {
                            if (zzjaVar == null) {
                                zzjaVar = zzizVar2.zzb(t3);
                            }
                            zzja<?> zzjaVar2 = zzjaVar;
                            zzmc zzmcVar4 = zzmcVar;
                            try {
                                obj2 = zzizVar2.zza(t3, zzljVar, zza6, zzixVar3, zzjaVar2, obj2, zzmcVar4);
                                zzjaVar = zzjaVar2;
                                zzmcVar = zzmcVar4;
                                zzizVar = zzizVar2;
                                zzixVar2 = zzixVar3;
                            } catch (Throwable th3) {
                                th = th3;
                                t2 = t3;
                                zzmcVar = zzmcVar4;
                                zzkuVar2 = zzkuVar;
                                i = zzkuVar2.zzl;
                                obj = obj2;
                                while (i < zzkuVar2.zzm) {
                                }
                                if (obj != null) {
                                }
                                throw th;
                            }
                        } else {
                            zzizVar = zzizVar2;
                            t2 = t3;
                            zzixVar2 = zzixVar3;
                            try {
                                zzmcVar.zza(zzljVar);
                                if (obj2 == null) {
                                    try {
                                        obj2 = zzmcVar.zzc(t2);
                                    } catch (Throwable th4) {
                                        th = th4;
                                        zzkuVar2 = zzkuVar;
                                        i = zzkuVar2.zzl;
                                        obj = obj2;
                                        while (i < zzkuVar2.zzm) {
                                        }
                                        if (obj != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!zzmcVar.zza((zzmc) obj2, zzljVar)) {
                                    Object obj8 = obj2;
                                    for (int i5 = zzkuVar.zzl; i5 < zzkuVar.zzm; i5++) {
                                        obj8 = zzkuVar.zza((Object) t2, zzkuVar.zzk[i5], (int) obj8, (zzmc<UT, int>) zzmcVar, (Object) t);
                                    }
                                    if (obj8 != null) {
                                        zzmcVar.zzb((Object) t2, (T) obj8);
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        t2 = t3;
                        zzkuVar2 = zzkuVar;
                        i = zzkuVar2.zzl;
                        obj = obj2;
                        while (i < zzkuVar2.zzm) {
                            obj = zzkuVar2.zza((Object) t2, zzkuVar2.zzk[i], (int) obj, (zzmc<UT, int>) zzmcVar, (Object) t);
                            i++;
                            zzkuVar2 = this;
                        }
                        if (obj != null) {
                            zzmcVar.zzb((Object) t2, (T) obj);
                        }
                        throw th;
                    }
                }
                zzkuVar2 = zzkuVar;
                zzixVar3 = zzixVar2;
                zzizVar2 = zzizVar;
            } catch (Throwable th7) {
                th = th7;
                t2 = t;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zza(T t, byte[] bArr, int i, int i2, zzhw zzhwVar) throws IOException {
        zza((zzku<T>) t, bArr, i, i2, 0, zzhwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t, T t2, int i) {
        if (zzc((zzku<T>) t2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzli zze = zze(i);
            if (!zzc((zzku<T>) t, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzku<T>) t, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t, T t2, int i) {
        int i2 = this.zzc[i];
        if (zzc((zzku<T>) t2, i2, i)) {
            long zzc = zzc(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t2, zzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + String.valueOf(t2));
            }
            zzli zze = zze(i);
            if (!zzc((zzku<T>) t, i2, i)) {
                if (!zzg(object)) {
                    unsafe.putObject(t, zzc, object);
                } else {
                    Object zza2 = zze.zza();
                    zze.zza(zza2, object);
                    unsafe.putObject(t, zzc, zza2);
                }
                zzb((zzku<T>) t, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(t, zzc);
            if (!zzg(object2)) {
                Object zza3 = zze.zza();
                zze.zza(zza3, object2);
                unsafe.putObject(t, zzc, zza3);
                object2 = zza3;
            }
            zze.zza(object2, object);
        }
    }

    private final void zza(Object obj, int i, zzlj zzljVar) throws IOException {
        if (zzg(i)) {
            zzmh.zza(obj, i & 1048575, zzljVar.zzr());
        } else if (this.zzi) {
            zzmh.zza(obj, i & 1048575, zzljVar.zzq());
        } else {
            zzmh.zza(obj, i & 1048575, zzljVar.zzp());
        }
    }

    private final void zzb(T t, int i) {
        int zzb2 = zzb(i);
        long j = 1048575 & zzb2;
        if (j == 1048575) {
            return;
        }
        zzmh.zza((Object) t, j, (1 << (zzb2 >>> 20)) | zzmh.zzc(t, j));
    }

    private final void zzb(T t, int i, int i2) {
        zzmh.zza((Object) t, zzb(i2) & 1048575, i);
    }

    private final void zza(T t, int i, Object obj) {
        zzb.putObject(t, zzc(i) & 1048575, obj);
        zzb((zzku<T>) t, i);
    }

    private final void zza(T t, int i, int i2, Object obj) {
        zzb.putObject(t, zzc(i2) & 1048575, obj);
        zzb((zzku<T>) t, i, i2);
    }

    private final <K, V> void zza(zzmx zzmxVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzmxVar.zza(i, this.zzr.zza(zzf(i2)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i, Object obj, zzmx zzmxVar) throws IOException {
        if (obj instanceof String) {
            zzmxVar.zza(i, (String) obj);
        } else {
            zzmxVar.zza(i, (zzhx) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0a5f  */
    @Override // com.google.android.gms.internal.measurement.zzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzmx zzmxVar) throws IOException {
        Map.Entry<?, ?> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i;
        Map.Entry<?, ?> entry2;
        int i2;
        int i3;
        int i4;
        int i5;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry3;
        int length2;
        zzku<T> zzkuVar = this;
        int i6 = 267386880;
        int i7 = 1;
        int i8 = 1048575;
        if (zzmxVar.zza() == 2) {
            zza(zzkuVar.zzp, t, zzmxVar);
            if (zzkuVar.zzh) {
                zzja<?> zza2 = zzkuVar.zzq.zza(t);
                if (!zza2.zza.isEmpty()) {
                    it2 = zza2.zzc();
                    entry3 = it2.next();
                    for (length2 = zzkuVar.zzc.length - 3; length2 >= 0; length2 -= 3) {
                        int zzc = zzkuVar.zzc(length2);
                        int i9 = zzkuVar.zzc[length2];
                        while (entry3 != null && zzkuVar.zzq.zza(entry3) > i9) {
                            zzkuVar.zzq.zza(zzmxVar, entry3);
                            entry3 = it2.hasNext() ? it2.next() : null;
                        }
                        switch ((zzc & 267386880) >>> 20) {
                            case 0:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, zzmh.zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, zzmh.zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzb(i9, zzmh.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zze(i9, zzmh.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzc(i9, zzmh.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, zzmh.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzb(i9, zzmh.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, zzmh.zzh(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zza(i9, zzmh.zze(t, zzc & 1048575), zzmxVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzb(i9, zzmh.zze(t, zzc & 1048575), zzkuVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, (zzhx) zzmh.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzf(i9, zzmh.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, zzmh.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzd(i9, zzmh.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzc(i9, zzmh.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zze(i9, zzmh.zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zzd(i9, zzmh.zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zzkuVar.zzc((zzku<T>) t, length2)) {
                                    zzmxVar.zza(i9, zzmh.zze(t, zzc & 1048575), zzkuVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzlk.zzb(zzkuVar.zzc[length2], (List<Double>) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 19:
                                zzlk.zzf(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 20:
                                zzlk.zzh(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 21:
                                zzlk.zzn(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 22:
                                zzlk.zzg(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 23:
                                zzlk.zze(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 24:
                                zzlk.zzd(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 25:
                                zzlk.zza(zzkuVar.zzc[length2], (List<Boolean>) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 26:
                                zzlk.zzb(zzkuVar.zzc[length2], (List<String>) zzmh.zze(t, zzc & 1048575), zzmxVar);
                                break;
                            case 27:
                                zzlk.zzb(zzkuVar.zzc[length2], (List<?>) zzmh.zze(t, zzc & 1048575), zzmxVar, zzkuVar.zze(length2));
                                break;
                            case 28:
                                zzlk.zza(zzkuVar.zzc[length2], (List<zzhx>) zzmh.zze(t, zzc & 1048575), zzmxVar);
                                break;
                            case 29:
                                zzlk.zzm(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 30:
                                zzlk.zzc(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 31:
                                zzlk.zzi(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 32:
                                zzlk.zzj(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 33:
                                zzlk.zzk(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 34:
                                zzlk.zzl(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, false);
                                break;
                            case 35:
                                zzlk.zzb(zzkuVar.zzc[length2], (List<Double>) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 36:
                                zzlk.zzf(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 37:
                                zzlk.zzh(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 38:
                                zzlk.zzn(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 39:
                                zzlk.zzg(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 40:
                                zzlk.zze(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 41:
                                zzlk.zzd(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 42:
                                zzlk.zza(zzkuVar.zzc[length2], (List<Boolean>) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 43:
                                zzlk.zzm(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 44:
                                zzlk.zzc(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 45:
                                zzlk.zzi(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 46:
                                zzlk.zzj(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 47:
                                zzlk.zzk(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 48:
                                zzlk.zzl(zzkuVar.zzc[length2], (List) zzmh.zze(t, zzc & 1048575), zzmxVar, true);
                                break;
                            case 49:
                                zzlk.zza(zzkuVar.zzc[length2], (List<?>) zzmh.zze(t, zzc & 1048575), zzmxVar, zzkuVar.zze(length2));
                                break;
                            case 50:
                                zzkuVar.zza(zzmxVar, i9, zzmh.zze(t, zzc & 1048575), length2);
                                break;
                            case 51:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, zza(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, zzb(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzb(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zze(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 55:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzc(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzb(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zza(i9, zzmh.zze(t, zzc & 1048575), zzmxVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzb(i9, zzmh.zze(t, zzc & 1048575), zzkuVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, (zzhx) zzmh.zze(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzf(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 63:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzd(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzc(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zze(i9, zzc(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zzd(i9, zzd(t, zzc & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zzkuVar.zzc((zzku<T>) t, i9, length2)) {
                                    zzmxVar.zza(i9, zzmh.zze(t, zzc & 1048575), zzkuVar.zze(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry3 != null) {
                        zzkuVar.zzq.zza(zzmxVar, entry3);
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
        if (zzkuVar.zzh) {
            zzja<?> zza3 = zzkuVar.zzq.zza(t);
            if (!zza3.zza.isEmpty()) {
                Iterator<Map.Entry<?, Object>> zzd = zza3.zzd();
                entry = (Map.Entry) zzd.next();
                it = zzd;
                length = zzkuVar.zzc.length;
                Unsafe unsafe = zzb;
                i = 0;
                int i10 = 0;
                int i11 = 1048575;
                while (i < length) {
                    int zzc2 = zzkuVar.zzc(i);
                    int i12 = i6;
                    int[] iArr = zzkuVar.zzc;
                    int i13 = iArr[i];
                    int i14 = (zzc2 & i12) >>> 20;
                    int i15 = i7;
                    if (i14 <= 17) {
                        int i16 = iArr[i + 2];
                        int i17 = i16 & i8;
                        if (i17 != i11) {
                            i10 = i17 == i8 ? 0 : unsafe.getInt(t, i17);
                            i11 = i17;
                        }
                        int i18 = i15 << (i16 >>> 20);
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = i18;
                    } else {
                        entry2 = entry;
                        i2 = i11;
                        i3 = i10;
                        i4 = 0;
                    }
                    while (entry2 != null && zzkuVar.zzq.zza(entry2) <= i13) {
                        zzkuVar.zzq.zza(zzmxVar, entry2);
                        entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    Iterator<Map.Entry<?, Object>> it3 = it;
                    long j = zzc2 & i8;
                    switch (i14) {
                        case 0:
                            i5 = i15;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, zzmh.zza(t, j));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            int i19 = i15;
                            i5 = i19;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, zzmh.zzb(t, j));
                                i5 = i19;
                            }
                            zzkuVar = this;
                            break;
                        case 2:
                            int i20 = i15;
                            i5 = i20;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzb(i13, unsafe.getLong(t, j));
                                i5 = i20;
                            }
                            zzkuVar = this;
                            break;
                        case 3:
                            int i21 = i15;
                            i5 = i21;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zze(i13, unsafe.getLong(t, j));
                                i5 = i21;
                            }
                            zzkuVar = this;
                            break;
                        case 4:
                            int i22 = i15;
                            i5 = i22;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzc(i13, unsafe.getInt(t, j));
                                i5 = i22;
                            }
                            zzkuVar = this;
                            break;
                        case 5:
                            int i23 = i15;
                            i5 = i23;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, unsafe.getLong(t, j));
                                i5 = i23;
                            }
                            zzkuVar = this;
                            break;
                        case 6:
                            int i24 = i15;
                            i5 = i24;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzb(i13, unsafe.getInt(t, j));
                                i5 = i24;
                            }
                            zzkuVar = this;
                            break;
                        case 7:
                            int i25 = i15;
                            i5 = i25;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, zzmh.zzh(t, j));
                                i5 = i25;
                            }
                            zzkuVar = this;
                            break;
                        case 8:
                            int i26 = i15;
                            i5 = i26;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zza(i13, unsafe.getObject(t, j), zzmxVar);
                                i5 = i26;
                            }
                            zzkuVar = this;
                            break;
                        case 9:
                            i5 = i15;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzb(i13, unsafe.getObject(t, j), zzkuVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            int i27 = i15;
                            i5 = i27;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, (zzhx) unsafe.getObject(t, j));
                                i5 = i27;
                            }
                            zzkuVar = this;
                            break;
                        case 11:
                            int i28 = i15;
                            i5 = i28;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzf(i13, unsafe.getInt(t, j));
                                i5 = i28;
                            }
                            zzkuVar = this;
                            break;
                        case 12:
                            int i29 = i15;
                            i5 = i29;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, unsafe.getInt(t, j));
                                i5 = i29;
                            }
                            zzkuVar = this;
                            break;
                        case 13:
                            int i30 = i15;
                            i5 = i30;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzd(i13, unsafe.getInt(t, j));
                                i5 = i30;
                            }
                            zzkuVar = this;
                            break;
                        case 14:
                            int i31 = i15;
                            i5 = i31;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzc(i13, unsafe.getLong(t, j));
                                i5 = i31;
                            }
                            zzkuVar = this;
                            break;
                        case 15:
                            int i32 = i15;
                            i5 = i32;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zze(i13, unsafe.getInt(t, j));
                                i5 = i32;
                            }
                            zzkuVar = this;
                            break;
                        case 16:
                            int i33 = i15;
                            i5 = i33;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zzd(i13, unsafe.getLong(t, j));
                                i5 = i33;
                            }
                            zzkuVar = this;
                            break;
                        case 17:
                            i5 = i15;
                            if (zzkuVar.zza((zzku<T>) t, i, i2, i3, i4)) {
                                zzmxVar.zza(i13, unsafe.getObject(t, j), zzkuVar.zze(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            i5 = i15;
                            zzlk.zzb(zzkuVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 19:
                            i5 = i15;
                            zzlk.zzf(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 20:
                            i5 = i15;
                            zzlk.zzh(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 21:
                            i5 = i15;
                            zzlk.zzn(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 22:
                            i5 = i15;
                            zzlk.zzg(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 23:
                            i5 = i15;
                            zzlk.zze(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 24:
                            i5 = i15;
                            zzlk.zzd(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 25:
                            i5 = i15;
                            zzlk.zza(zzkuVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 26:
                            i5 = i15;
                            zzlk.zzb(zzkuVar.zzc[i], (List<String>) unsafe.getObject(t, j), zzmxVar);
                            break;
                        case 27:
                            i5 = i15;
                            zzlk.zzb(zzkuVar.zzc[i], (List<?>) unsafe.getObject(t, j), zzmxVar, zzkuVar.zze(i));
                            break;
                        case 28:
                            i5 = i15;
                            zzlk.zza(zzkuVar.zzc[i], (List<zzhx>) unsafe.getObject(t, j), zzmxVar);
                            break;
                        case 29:
                            i5 = i15;
                            zzlk.zzm(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 30:
                            i5 = i15;
                            zzlk.zzc(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 31:
                            i5 = i15;
                            zzlk.zzi(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 32:
                            i5 = i15;
                            zzlk.zzj(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 33:
                            i5 = i15;
                            zzlk.zzk(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 34:
                            i5 = i15;
                            zzlk.zzl(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, false);
                            break;
                        case 35:
                            boolean z = i15;
                            zzlk.zzb(zzkuVar.zzc[i], (List<Double>) unsafe.getObject(t, j), zzmxVar, z);
                            i5 = z;
                            break;
                        case 36:
                            boolean z2 = i15;
                            zzlk.zzf(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z2);
                            i5 = z2;
                            break;
                        case 37:
                            boolean z3 = i15;
                            zzlk.zzh(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z3);
                            i5 = z3;
                            break;
                        case 38:
                            boolean z4 = i15;
                            zzlk.zzn(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z4);
                            i5 = z4;
                            break;
                        case 39:
                            boolean z5 = i15;
                            zzlk.zzg(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z5);
                            i5 = z5;
                            break;
                        case 40:
                            boolean z6 = i15;
                            zzlk.zze(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z6);
                            i5 = z6;
                            break;
                        case 41:
                            boolean z7 = i15;
                            zzlk.zzd(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z7);
                            i5 = z7;
                            break;
                        case 42:
                            boolean z8 = i15;
                            zzlk.zza(zzkuVar.zzc[i], (List<Boolean>) unsafe.getObject(t, j), zzmxVar, z8);
                            i5 = z8;
                            break;
                        case 43:
                            boolean z9 = i15;
                            zzlk.zzm(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z9);
                            i5 = z9;
                            break;
                        case 44:
                            boolean z10 = i15;
                            zzlk.zzc(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z10);
                            i5 = z10;
                            break;
                        case 45:
                            boolean z11 = i15;
                            zzlk.zzi(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z11);
                            i5 = z11;
                            break;
                        case 46:
                            boolean z12 = i15;
                            zzlk.zzj(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z12);
                            i5 = z12;
                            break;
                        case 47:
                            boolean z13 = i15;
                            zzlk.zzk(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z13);
                            i5 = z13;
                            break;
                        case 48:
                            boolean z14 = i15;
                            zzlk.zzl(zzkuVar.zzc[i], (List) unsafe.getObject(t, j), zzmxVar, z14);
                            i5 = z14;
                            break;
                        case 49:
                            zzlk.zza(zzkuVar.zzc[i], (List<?>) unsafe.getObject(t, j), zzmxVar, zzkuVar.zze(i));
                            i5 = i15;
                            break;
                        case 50:
                            zzkuVar.zza(zzmxVar, i13, unsafe.getObject(t, j), i);
                            i5 = i15;
                            break;
                        case 51:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, zza(t, j));
                            }
                            i5 = i15;
                            break;
                        case 52:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, zzb(t, j));
                            }
                            i5 = i15;
                            break;
                        case 53:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzb(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 54:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zze(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 55:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzc(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 56:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 57:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzb(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 58:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, zze(t, j));
                            }
                            i5 = i15;
                            break;
                        case 59:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zza(i13, unsafe.getObject(t, j), zzmxVar);
                            }
                            i5 = i15;
                            break;
                        case 60:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzb(i13, unsafe.getObject(t, j), zzkuVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        case 61:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, (zzhx) unsafe.getObject(t, j));
                            }
                            i5 = i15;
                            break;
                        case 62:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzf(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 63:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 64:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzd(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 65:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzc(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 66:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zze(i13, zzc(t, j));
                            }
                            i5 = i15;
                            break;
                        case 67:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zzd(i13, zzd(t, j));
                            }
                            i5 = i15;
                            break;
                        case 68:
                            if (zzkuVar.zzc((zzku<T>) t, i13, i)) {
                                zzmxVar.zza(i13, unsafe.getObject(t, j), zzkuVar.zze(i));
                            }
                            i5 = i15;
                            break;
                        default:
                            i5 = i15;
                            break;
                    }
                    i += 3;
                    i10 = i3;
                    it = it3;
                    i8 = 1048575;
                    i11 = i2;
                    entry = entry2;
                    i6 = i12;
                    i7 = i5;
                }
                Iterator<Map.Entry<?, Object>> it4 = it;
                while (entry != null) {
                    zzkuVar.zzq.zza(zzmxVar, entry);
                    entry = it4.hasNext() ? (Map.Entry) it4.next() : null;
                }
                zza(zzkuVar.zzp, t, zzmxVar);
            }
        }
        entry = null;
        it = null;
        length = zzkuVar.zzc.length;
        Unsafe unsafe2 = zzb;
        i = 0;
        int i102 = 0;
        int i112 = 1048575;
        while (i < length) {
        }
        Iterator<Map.Entry<?, Object>> it42 = it;
        while (entry != null) {
        }
        zza(zzkuVar.zzp, t, zzmxVar);
    }

    private static <UT, UB> void zza(zzmc<UT, UB> zzmcVar, T t, zzmx zzmxVar) throws IOException {
        zzmcVar.zzb((zzmc<UT, UB>) zzmcVar.zzd(t), zzmxVar);
    }

    private final boolean zzc(T t, T t2, int i) {
        return zzc((zzku<T>) t, i) == zzc((zzku<T>) t2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlk.zza(com.google.android.gms.internal.measurement.zzmh.zze(r10, r6), com.google.android.gms.internal.measurement.zzmh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlk.zza(com.google.android.gms.internal.measurement.zzmh.zze(r10, r6), com.google.android.gms.internal.measurement.zzmh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlk.zza(com.google.android.gms.internal.measurement.zzmh.zze(r10, r6), com.google.android.gms.internal.measurement.zzmh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlk.zza(com.google.android.gms.internal.measurement.zzmh.zze(r10, r6), com.google.android.gms.internal.measurement.zzmh.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmh.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmh.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmh.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmh.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmh.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmh.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlk.zza(com.google.android.gms.internal.measurement.zzmh.zze(r10, r6), com.google.android.gms.internal.measurement.zzmh.zze(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.measurement.zzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(T t, T t2) {
        int length = this.zzc.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzc = zzc(i);
                long j = zzc & 1048575;
                switch ((zzc & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
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
                        z = zzlk.zza(zzmh.zze(t, j), zzmh.zze(t2, j));
                        break;
                    case 50:
                        z = zzlk.zza(zzmh.zze(t, j), zzmh.zze(t2, j));
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
                        long zzb2 = zzb(i) & 1048575;
                        if (zzmh.zzc(t, zzb2) == zzmh.zzc(t2, zzb2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzp.zzd(t).equals(this.zzp.zzd(t2))) {
                    return false;
                }
                if (this.zzh) {
                    return this.zzq.zza(t).equals(this.zzq.zza(t2));
                }
                return true;
            }
        }
    }

    private final boolean zzc(T t, int i) {
        int zzb2 = zzb(i);
        long j = zzb2 & 1048575;
        if (j != 1048575) {
            return (zzmh.zzc(t, j) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i);
        long j2 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzmh.zza(t, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmh.zzb(t, j2)) != 0;
            case 2:
                return zzmh.zzd(t, j2) != 0;
            case 3:
                return zzmh.zzd(t, j2) != 0;
            case 4:
                return zzmh.zzc(t, j2) != 0;
            case 5:
                return zzmh.zzd(t, j2) != 0;
            case 6:
                return zzmh.zzc(t, j2) != 0;
            case 7:
                return zzmh.zzh(t, j2);
            case 8:
                Object zze = zzmh.zze(t, j2);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzhx) {
                    return !zzhx.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmh.zze(t, j2) != null;
            case 10:
                return !zzhx.zza.equals(zzmh.zze(t, j2));
            case 11:
                return zzmh.zzc(t, j2) != 0;
            case 12:
                return zzmh.zzc(t, j2) != 0;
            case 13:
                return zzmh.zzc(t, j2) != 0;
            case 14:
                return zzmh.zzd(t, j2) != 0;
            case 15:
                return zzmh.zzc(t, j2) != 0;
            case 16:
                return zzmh.zzd(t, j2) != 0;
            case 17:
                return zzmh.zze(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zza(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzc((zzku<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [com.google.android.gms.internal.measurement.zzli] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [com.google.android.gms.internal.measurement.zzli] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    @Override // com.google.android.gms.internal.measurement.zzli
    public final boolean zzd(T t) {
        int i;
        int i2;
        zzku<T> zzkuVar;
        T t2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.zzl) {
            int i6 = this.zzk[i4];
            int i7 = this.zzc[i6];
            int zzc = zzc(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = zzb.getInt(t, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i3;
                i2 = i5;
            }
            if ((268435456 & zzc) != 0) {
                zzkuVar = this;
                t2 = t;
                if (!zzkuVar.zza((zzku<T>) t2, i6, i, i2, i10)) {
                    return false;
                }
            } else {
                zzkuVar = this;
                t2 = t;
            }
            int i11 = (267386880 & zzc) >>> 20;
            if (i11 == 9 || i11 == 17) {
                if (zzkuVar.zza((zzku<T>) t2, i6, i, i2, i10) && !zza((Object) t2, zzc, zze(i6))) {
                    return false;
                }
            } else {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (zzc((zzku<T>) t2, i7, i6) && !zza((Object) t2, zzc, zze(i6))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = zzkuVar.zzr.zzd(zzmh.zze(t2, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (zzkuVar.zzr.zza(zzf(i6)).zzc.zzb() == zzmy.MESSAGE) {
                                ?? r3 = 0;
                                for (Object obj : zzd.values()) {
                                    r3 = r3;
                                    if (r3 == 0) {
                                        r3 = zzle.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r3.zzd(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzmh.zze(t2, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zze.zzd(list.get(i12))) {
                            return false;
                        }
                    }
                }
            }
            i4++;
            t = t2;
            i3 = i;
            i5 = i2;
        }
        return !this.zzh || this.zzq.zza(t).zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzli zzliVar) {
        return zzliVar.zzd(zzmh.zze(obj, i & 1048575));
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjk) {
            return ((zzjk) obj).zzcj();
        }
        return true;
    }

    private final boolean zzc(T t, int i, int i2) {
        return zzmh.zzc(t, (long) (zzb(i2) & 1048575)) == i;
    }

    private static <T> boolean zze(T t, long j) {
        return ((Boolean) zzmh.zze(t, j)).booleanValue();
    }
}
