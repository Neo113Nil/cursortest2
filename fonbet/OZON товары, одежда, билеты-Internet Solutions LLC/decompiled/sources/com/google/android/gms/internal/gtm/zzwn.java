package com.google.android.gms.internal.gtm;

import C.o0;
import Nh.a;
import Nh.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zzwn<T> implements zzwx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzxy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzwk zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzvy zzn;
    private final zzxo<?, ?> zzo;
    private final zzuk<?> zzp;
    private final zzwq zzq;
    private final zzwf zzr;

    /* JADX WARN: Multi-variable type inference failed */
    private zzwn(int[] iArr, int[] iArr2, Object[] objArr, int i11, int i12, zzwk zzwkVar, boolean z11, boolean z12, int[] iArr3, int i13, int i14, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i11;
        this.zzi = i12 instanceof zzuz;
        this.zzj = zzwkVar;
        boolean z13 = false;
        if (zzxoVar != 0 && zzxoVar.zzi(i12)) {
            z13 = true;
        }
        this.zzh = z13;
        this.zzk = z12;
        this.zzl = iArr3;
        this.zzm = i13;
        this.zzq = i14;
        this.zzn = zzwqVar;
        this.zzo = zzvyVar;
        this.zzp = zzxoVar;
        this.zzg = i12;
        this.zzr = zzukVar;
    }

    private final int zzA(int i11, int i12) {
        int length = (this.zzc.length / 3) - 1;
        while (i12 <= length) {
            int i13 = (length + i12) >>> 1;
            int i14 = i13 * 3;
            int i15 = this.zzc[i14];
            if (i11 == i15) {
                return i14;
            }
            if (i11 < i15) {
                length = i13 - 1;
            } else {
                i12 = i13 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzC(int i11) {
        return this.zzc[i11 + 1];
    }

    private static <T> long zzD(T t2, long j11) {
        return ((Long) zzxy.zzf(t2, j11)).longValue();
    }

    private final zzvd zzE(int i11) {
        int i12 = i11 / 3;
        return (zzvd) this.zzd[i12 + i12 + 1];
    }

    private final zzwx zzF(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzwx zzwxVar = (zzwx) this.zzd[i13];
        if (zzwxVar != null) {
            return zzwxVar;
        }
        zzwx<T> zzb2 = zzwt.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzb2;
        return zzb2;
    }

    private final <UT, UB> UB zzG(Object obj, int i11, UB ub2, zzxo<UT, UB> zzxoVar) {
        int i12 = this.zzc[i11];
        Object zzf = zzxy.zzf(obj, zzC(i11) & 1048575);
        if (zzf == null || zzE(i11) == null) {
            return ub2;
        }
        throw null;
    }

    private final Object zzH(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private static Field zzI(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            a.h(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(o0.c(sb2, " not found. Known fields are ", arrays));
        }
    }

    private final void zzJ(T t2, T t11, int i11) {
        long zzC = zzC(i11) & 1048575;
        if (zzQ(t11, i11)) {
            Object zzf = zzxy.zzf(t2, zzC);
            Object zzf2 = zzxy.zzf(t11, zzC);
            if (zzf != null && zzf2 != null) {
                zzxy.zzs(t2, zzC, zzvi.zzg(zzf, zzf2));
                zzM(t2, i11);
            } else if (zzf2 != null) {
                zzxy.zzs(t2, zzC, zzf2);
                zzM(t2, i11);
            }
        }
    }

    private final void zzK(T t2, T t11, int i11) {
        int zzC = zzC(i11);
        int i12 = this.zzc[i11];
        long j11 = zzC & 1048575;
        if (zzT(t11, i12, i11)) {
            Object zzf = zzT(t2, i12, i11) ? zzxy.zzf(t2, j11) : null;
            Object zzf2 = zzxy.zzf(t11, j11);
            if (zzf != null && zzf2 != null) {
                zzxy.zzs(t2, j11, zzvi.zzg(zzf, zzf2));
                zzN(t2, i12, i11);
            } else if (zzf2 != null) {
                zzxy.zzs(t2, j11, zzf2);
                zzN(t2, i12, i11);
            }
        }
    }

    private final void zzL(Object obj, int i11, zzww zzwwVar) throws IOException {
        if (zzP(i11)) {
            zzxy.zzs(obj, i11 & 1048575, zzwwVar.zzx());
        } else if (this.zzi) {
            zzxy.zzs(obj, i11 & 1048575, zzwwVar.zzv());
        } else {
            zzxy.zzs(obj, i11 & 1048575, zzwwVar.zzq());
        }
    }

    private final void zzM(T t2, int i11) {
        int zzz = zzz(i11);
        long j11 = 1048575 & zzz;
        if (j11 == 1048575) {
            return;
        }
        zzxy.zzq(t2, j11, (1 << (zzz >>> 20)) | zzxy.zzc(t2, j11));
    }

    private final void zzN(T t2, int i11, int i12) {
        zzxy.zzq(t2, zzz(i12) & 1048575, i11);
    }

    private final boolean zzO(T t2, T t11, int i11) {
        return zzQ(t2, i11) == zzQ(t11, i11);
    }

    private static boolean zzP(int i11) {
        return (i11 & 536870912) != 0;
    }

    private final boolean zzQ(T t2, int i11) {
        int zzz = zzz(i11);
        long j11 = zzz & 1048575;
        if (j11 != 1048575) {
            return (zzxy.zzc(t2, j11) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i11);
        long j12 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return zzxy.zza(t2, j12) != 0.0d;
            case 1:
                return zzxy.zzb(t2, j12) != 0.0f;
            case 2:
                return zzxy.zzd(t2, j12) != 0;
            case 3:
                return zzxy.zzd(t2, j12) != 0;
            case 4:
                return zzxy.zzc(t2, j12) != 0;
            case 5:
                return zzxy.zzd(t2, j12) != 0;
            case 6:
                return zzxy.zzc(t2, j12) != 0;
            case 7:
                return zzxy.zzw(t2, j12);
            case 8:
                Object zzf = zzxy.zzf(t2, j12);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zztd) {
                    return !zztd.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzxy.zzf(t2, j12) != null;
            case 10:
                return !zztd.zzb.equals(zzxy.zzf(t2, j12));
            case 11:
                return zzxy.zzc(t2, j12) != 0;
            case 12:
                return zzxy.zzc(t2, j12) != 0;
            case 13:
                return zzxy.zzc(t2, j12) != 0;
            case 14:
                return zzxy.zzd(t2, j12) != 0;
            case 15:
                return zzxy.zzc(t2, j12) != 0;
            case 16:
                return zzxy.zzd(t2, j12) != 0;
            case 17:
                return zzxy.zzf(t2, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(T t2, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? zzQ(t2, i11) : (i13 & i14) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzS(Object obj, int i11, zzwx zzwxVar) {
        return zzwxVar.zzk(zzxy.zzf(obj, i11 & 1048575));
    }

    private final boolean zzT(T t2, int i11, int i12) {
        return zzxy.zzc(t2, (long) (zzz(i12) & 1048575)) == i11;
    }

    private static <T> boolean zzU(T t2, long j11) {
        return ((Boolean) zzxy.zzf(t2, j11)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzV(T t2, zztp zztpVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i11;
        int i12;
        if (this.zzh) {
            zzuo<?> zzb2 = this.zzp.zzb(t2);
            if (!zzb2.zza.isEmpty()) {
                it = zzb2.zzf();
                entry = (Map.Entry) it.next();
                length = this.zzc.length;
                Unsafe unsafe = zzb;
                int i13 = 1048575;
                int i14 = 0;
                for (i11 = 0; i11 < length; i11 += 3) {
                    int zzC = zzC(i11);
                    int i15 = this.zzc[i11];
                    int zzB = zzB(zzC);
                    if (zzB <= 17) {
                        int i16 = this.zzc[i11 + 2];
                        int i17 = i16 & 1048575;
                        if (i17 != i13) {
                            i14 = unsafe.getInt(t2, i17);
                            i13 = i17;
                        }
                        i12 = 1 << (i16 >>> 20);
                    } else {
                        i12 = 0;
                    }
                    while (entry != null && this.zzp.zza(entry) <= i15) {
                        this.zzp.zzj(zztpVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j11 = zzC & 1048575;
                    switch (zzB) {
                        case 0:
                            if ((i12 & i14) == 0) {
                                break;
                            } else {
                                zztpVar.zzf(i15, zzxy.zza(t2, j11));
                                continue;
                            }
                        case 1:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzo(i15, zzxy.zzb(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzt(i15, unsafe.getLong(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzK(i15, unsafe.getLong(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzr(i15, unsafe.getInt(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzm(i15, unsafe.getLong(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzk(i15, unsafe.getInt(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzb(i15, zzxy.zzw(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i12 & i14) != 0) {
                                zzX(i15, unsafe.getObject(t2, j11), zztpVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzv(i15, unsafe.getObject(t2, j11), zzF(i11));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzd(i15, (zztd) unsafe.getObject(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzI(i15, unsafe.getInt(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzi(i15, unsafe.getInt(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzx(i15, unsafe.getInt(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzz(i15, unsafe.getLong(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzB(i15, unsafe.getInt(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzD(i15, unsafe.getLong(t2, j11));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i12 & i14) != 0) {
                                zztpVar.zzq(i15, unsafe.getObject(t2, j11), zzF(i11));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzwz.zzL(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 19:
                            zzwz.zzP(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 20:
                            zzwz.zzS(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 21:
                            zzwz.zzaa(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 22:
                            zzwz.zzR(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 23:
                            zzwz.zzO(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 24:
                            zzwz.zzN(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            zzwz.zzJ(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            zzwz.zzY(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar);
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            zzwz.zzT(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, zzF(i11));
                            break;
                        case 28:
                            zzwz.zzK(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar);
                            break;
                        case 29:
                            zzwz.zzZ(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            zzwz.zzM(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            zzwz.zzU(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 32:
                            zzwz.zzV(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 33:
                            zzwz.zzW(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case 34:
                            zzwz.zzX(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, false);
                            continue;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            zzwz.zzL(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            zzwz.zzP(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            zzwz.zzS(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 38:
                            zzwz.zzaa(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            zzwz.zzR(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 40:
                            zzwz.zzO(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 41:
                            zzwz.zzN(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 42:
                            zzwz.zzJ(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 43:
                            zzwz.zzZ(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            zzwz.zzM(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            zzwz.zzU(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 46:
                            zzwz.zzV(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 47:
                            zzwz.zzW(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 48:
                            zzwz.zzX(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, true);
                            break;
                        case 49:
                            zzwz.zzQ(this.zzc[i11], (List) unsafe.getObject(t2, j11), zztpVar, zzF(i11));
                            break;
                        case 50:
                            zzW(zztpVar, i15, unsafe.getObject(t2, j11), i11);
                            break;
                        case 51:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzf(i15, zzo(t2, j11));
                                break;
                            }
                            break;
                        case 52:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzo(i15, zzp(t2, j11));
                                break;
                            }
                            break;
                        case 53:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzt(i15, zzD(t2, j11));
                                break;
                            }
                            break;
                        case 54:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzK(i15, zzD(t2, j11));
                                break;
                            }
                            break;
                        case 55:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzr(i15, zzs(t2, j11));
                                break;
                            }
                            break;
                        case 56:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzm(i15, zzD(t2, j11));
                                break;
                            }
                            break;
                        case 57:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzk(i15, zzs(t2, j11));
                                break;
                            }
                            break;
                        case 58:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzb(i15, zzU(t2, j11));
                                break;
                            }
                            break;
                        case 59:
                            if (zzT(t2, i15, i11)) {
                                zzX(i15, unsafe.getObject(t2, j11), zztpVar);
                                break;
                            }
                            break;
                        case 60:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzv(i15, unsafe.getObject(t2, j11), zzF(i11));
                                break;
                            }
                            break;
                        case 61:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzd(i15, (zztd) unsafe.getObject(t2, j11));
                                break;
                            }
                            break;
                        case 62:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzI(i15, zzs(t2, j11));
                                break;
                            }
                            break;
                        case 63:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzi(i15, zzs(t2, j11));
                                break;
                            }
                            break;
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzx(i15, zzs(t2, j11));
                                break;
                            }
                            break;
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzz(i15, zzD(t2, j11));
                                break;
                            }
                            break;
                        case 66:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzB(i15, zzs(t2, j11));
                                break;
                            }
                            break;
                        case 67:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzD(i15, zzD(t2, j11));
                                break;
                            }
                            break;
                        case 68:
                            if (zzT(t2, i15, i11)) {
                                zztpVar.zzq(i15, unsafe.getObject(t2, j11), zzF(i11));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzp.zzj(zztpVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zzxo<?, ?> zzxoVar = this.zzo;
                zzxoVar.zzs(zzxoVar.zzd(t2), zztpVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzc.length;
        Unsafe unsafe2 = zzb;
        int i132 = 1048575;
        int i142 = 0;
        while (i11 < length) {
        }
        while (entry != null) {
        }
        zzxo<?, ?> zzxoVar2 = this.zzo;
        zzxoVar2.zzs(zzxoVar2.zzd(t2), zztpVar);
    }

    private final <K, V> void zzW(zztp zztpVar, int i11, Object obj, int i12) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void zzX(int i11, Object obj, zztp zztpVar) throws IOException {
        if (obj instanceof String) {
            zztpVar.zzG(i11, (String) obj);
        } else {
            zztpVar.zzd(i11, (zztd) obj);
        }
    }

    static zzxp zzd(Object obj) {
        zzuz zzuzVar = (zzuz) obj;
        zzxp zzxpVar = zzuzVar.zzc;
        if (zzxpVar != zzxp.zzc()) {
            return zzxpVar;
        }
        zzxp zze = zzxp.zze();
        zzuzVar.zzc = zze;
        return zze;
    }

    static <T> zzwn<T> zzl(Class<T> cls, zzwh zzwhVar, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        if (zzwhVar instanceof zzwv) {
            return zzm((zzwv) zzwhVar, zzwqVar, zzvyVar, zzxoVar, zzukVar, zzwfVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> zzwn<T> zzm(zzwv zzwvVar, zzwq zzwqVar, zzvy zzvyVar, zzxo<?, ?> zzxoVar, zzuk<?> zzukVar, zzwf zzwfVar) {
        int i11;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        int i15;
        char charAt5;
        int i16;
        char charAt6;
        int i17;
        char charAt7;
        int i18;
        char charAt8;
        int i19;
        char charAt9;
        int i21;
        char charAt10;
        int i22;
        char charAt11;
        int i23;
        char charAt12;
        int i24;
        int i25;
        int i26;
        int i27;
        int objectFieldOffset;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        Field zzI;
        char charAt13;
        int i35;
        int i36;
        Object obj;
        Field zzI2;
        Object obj2;
        Field zzI3;
        int i37;
        char charAt14;
        int i38;
        int i39;
        char charAt15;
        int i41;
        char charAt16;
        int i42;
        char charAt17;
        boolean z11 = zzwvVar.zzc() == 2;
        String zzd = zzwvVar.zzd();
        int length = zzd.length();
        char c11 = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i43 = 1;
            while (true) {
                i11 = i43 + 1;
                if (zzd.charAt(i43) < 55296) {
                    break;
                }
                i43 = i11;
            }
        } else {
            i11 = 1;
        }
        int i44 = i11 + 1;
        int charAt18 = zzd.charAt(i11);
        if (charAt18 >= 55296) {
            int i45 = charAt18 & 8191;
            int i46 = 13;
            while (true) {
                i42 = i44 + 1;
                charAt17 = zzd.charAt(i44);
                if (charAt17 < 55296) {
                    break;
                }
                i45 |= (charAt17 & 8191) << i46;
                i46 += 13;
                i44 = i42;
            }
            charAt18 = i45 | (charAt17 << i46);
            i44 = i42;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i13 = 0;
            charAt4 = 0;
            i12 = 0;
            iArr = zza;
            i14 = 0;
        } else {
            int i47 = i44 + 1;
            int charAt19 = zzd.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i23 = i47 + 1;
                    charAt12 = zzd.charAt(i47);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i48 |= (charAt12 & 8191) << i49;
                    i49 += 13;
                    i47 = i23;
                }
                charAt19 = i48 | (charAt12 << i49);
                i47 = i23;
            }
            int i51 = i47 + 1;
            int charAt20 = zzd.charAt(i47);
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i22 = i51 + 1;
                    charAt11 = zzd.charAt(i51);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i52 |= (charAt11 & 8191) << i53;
                    i53 += 13;
                    i51 = i22;
                }
                charAt20 = i52 | (charAt11 << i53);
                i51 = i22;
            }
            int i54 = i51 + 1;
            charAt = zzd.charAt(i51);
            if (charAt >= 55296) {
                int i55 = charAt & 8191;
                int i56 = 13;
                while (true) {
                    i21 = i54 + 1;
                    charAt10 = zzd.charAt(i54);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i55 |= (charAt10 & 8191) << i56;
                    i56 += 13;
                    i54 = i21;
                }
                charAt = i55 | (charAt10 << i56);
                i54 = i21;
            }
            int i57 = i54 + 1;
            charAt2 = zzd.charAt(i54);
            if (charAt2 >= 55296) {
                int i58 = charAt2 & 8191;
                int i59 = 13;
                while (true) {
                    i19 = i57 + 1;
                    charAt9 = zzd.charAt(i57);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i58 |= (charAt9 & 8191) << i59;
                    i59 += 13;
                    i57 = i19;
                }
                charAt2 = i58 | (charAt9 << i59);
                i57 = i19;
            }
            int i61 = i57 + 1;
            charAt3 = zzd.charAt(i57);
            if (charAt3 >= 55296) {
                int i62 = charAt3 & 8191;
                int i63 = 13;
                while (true) {
                    i18 = i61 + 1;
                    charAt8 = zzd.charAt(i61);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i62 |= (charAt8 & 8191) << i63;
                    i63 += 13;
                    i61 = i18;
                }
                charAt3 = i62 | (charAt8 << i63);
                i61 = i18;
            }
            int i64 = i61 + 1;
            int charAt21 = zzd.charAt(i61);
            if (charAt21 >= 55296) {
                int i65 = charAt21 & 8191;
                int i66 = 13;
                while (true) {
                    i17 = i64 + 1;
                    charAt7 = zzd.charAt(i64);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i65 |= (charAt7 & 8191) << i66;
                    i66 += 13;
                    i64 = i17;
                }
                charAt21 = i65 | (charAt7 << i66);
                i64 = i17;
            }
            int i67 = i64 + 1;
            int charAt22 = zzd.charAt(i64);
            if (charAt22 >= 55296) {
                int i68 = charAt22 & 8191;
                int i69 = 13;
                while (true) {
                    i16 = i67 + 1;
                    charAt6 = zzd.charAt(i67);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i68 |= (charAt6 & 8191) << i69;
                    i69 += 13;
                    i67 = i16;
                }
                charAt22 = i68 | (charAt6 << i69);
                i67 = i16;
            }
            int i71 = i67 + 1;
            charAt4 = zzd.charAt(i67);
            if (charAt4 >= 55296) {
                int i72 = charAt4 & 8191;
                int i73 = 13;
                while (true) {
                    i15 = i71 + 1;
                    charAt5 = zzd.charAt(i71);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i72 |= (charAt5 & 8191) << i73;
                    i73 += 13;
                    i71 = i15;
                }
                charAt4 = i72 | (charAt5 << i73);
                i71 = i15;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i12 = charAt19 + charAt19 + charAt20;
            i13 = charAt21;
            iArr = iArr2;
            i14 = charAt19;
            i44 = i71;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzwvVar.zze();
        Class<?> cls = zzwvVar.zza().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 + charAt3];
        int i74 = i13 + charAt4;
        int i75 = i74;
        int i76 = charAt4;
        int i77 = 0;
        int i78 = 0;
        while (i44 < length) {
            int i79 = i44 + 1;
            int charAt23 = zzd.charAt(i44);
            if (charAt23 >= c11) {
                int i81 = charAt23 & 8191;
                int i82 = i79;
                int i83 = 13;
                while (true) {
                    i41 = i82 + 1;
                    charAt16 = zzd.charAt(i82);
                    if (charAt16 < c11) {
                        break;
                    }
                    i81 |= (charAt16 & 8191) << i83;
                    i83 += 13;
                    i82 = i41;
                }
                charAt23 = i81 | (charAt16 << i83);
                i24 = i41;
            } else {
                i24 = i79;
            }
            int i84 = i24 + 1;
            int charAt24 = zzd.charAt(i24);
            if (charAt24 >= c11) {
                int i85 = charAt24 & 8191;
                int i86 = i84;
                int i87 = 13;
                while (true) {
                    i39 = i86 + 1;
                    charAt15 = zzd.charAt(i86);
                    i25 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i85 |= (charAt15 & 8191) << i87;
                    i87 += 13;
                    i86 = i39;
                    length = i25;
                }
                charAt24 = i85 | (charAt15 << i87);
                i26 = i39;
            } else {
                i25 = length;
                i26 = i84;
            }
            int i88 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i78] = i77;
                i78++;
            }
            if (i88 >= 51) {
                int i89 = i26 + 1;
                int charAt25 = zzd.charAt(i26);
                if (charAt25 >= 55296) {
                    int i91 = charAt25 & 8191;
                    int i92 = i89;
                    int i93 = 13;
                    while (true) {
                        i37 = i92 + 1;
                        charAt14 = zzd.charAt(i92);
                        i38 = i91;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i91 = i38 | ((charAt14 & 8191) << i93);
                        i93 += 13;
                        i92 = i37;
                    }
                    charAt25 = i38 | (charAt14 << i93);
                    i35 = i37;
                } else {
                    i35 = i89;
                }
                int i94 = charAt25;
                int i95 = i88 - 51;
                int i96 = i35;
                if (i95 == 9 || i95 == 17) {
                    int i97 = i77 / 3;
                    i36 = i12 + 1;
                    objArr[i97 + i97 + 1] = zze[i12];
                } else {
                    if (i95 == 12 && !z11) {
                        int i98 = i77 / 3;
                        i36 = i12 + 1;
                        objArr[i98 + i98 + 1] = zze[i12];
                    }
                    int i99 = i94 + i94;
                    obj = zze[i99];
                    if (obj instanceof Field) {
                        zzI2 = zzI(cls, (String) obj);
                        zze[i99] = zzI2;
                    } else {
                        zzI2 = (Field) obj;
                    }
                    i27 = charAt23;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzI2);
                    int i100 = i99 + 1;
                    obj2 = zze[i100];
                    if (obj2 instanceof Field) {
                        zzI3 = zzI(cls, (String) obj2);
                        zze[i100] = zzI3;
                    } else {
                        zzI3 = (Field) obj2;
                    }
                    i28 = (int) unsafe.objectFieldOffset(zzI3);
                    i33 = objectFieldOffset2;
                    i44 = i96;
                    i32 = 0;
                }
                i12 = i36;
                int i992 = i94 + i94;
                obj = zze[i992];
                if (obj instanceof Field) {
                }
                i27 = charAt23;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzI2);
                int i1002 = i992 + 1;
                obj2 = zze[i1002];
                if (obj2 instanceof Field) {
                }
                i28 = (int) unsafe.objectFieldOffset(zzI3);
                i33 = objectFieldOffset22;
                i44 = i96;
                i32 = 0;
            } else {
                i27 = charAt23;
                int i101 = i12 + 1;
                Field zzI4 = zzI(cls, (String) zze[i12]);
                if (i88 == 9 || i88 == 17) {
                    int i102 = i77 / 3;
                    objArr[i102 + i102 + 1] = zzI4.getType();
                } else {
                    if (i88 == 27 || i88 == 49) {
                        int i103 = i77 / 3;
                        i12 += 2;
                        objArr[i103 + i103 + 1] = zze[i101];
                    } else if (i88 == 12 || i88 == 30 || i88 == 44) {
                        if (!z11) {
                            int i104 = i77 / 3;
                            i12 += 2;
                            objArr[i104 + i104 + 1] = zze[i101];
                        }
                    } else if (i88 == 50) {
                        int i105 = i76 + 1;
                        iArr[i76] = i77;
                        int i106 = i77 / 3;
                        int i107 = i106 + i106;
                        int i108 = i12 + 2;
                        objArr[i107] = zze[i101];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i107 + 1] = zze[i108];
                            i12 += 3;
                        } else {
                            i12 = i108;
                        }
                        i76 = i105;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                    i28 = 1048575;
                    if ((charAt24 & 4096) == 4096 || i88 > 17) {
                        i29 = i26;
                        i31 = 0;
                    } else {
                        int i109 = i26 + 1;
                        int charAt26 = zzd.charAt(i26);
                        if (charAt26 >= 55296) {
                            int i110 = charAt26 & 8191;
                            int i111 = 13;
                            while (true) {
                                i34 = i109 + 1;
                                charAt13 = zzd.charAt(i109);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i110 |= (charAt13 & 8191) << i111;
                                i111 += 13;
                                i109 = i34;
                            }
                            charAt26 = i110 | (charAt13 << i111);
                        } else {
                            i34 = i109;
                        }
                        int i112 = (charAt26 / 32) + i14 + i14;
                        Object obj3 = zze[i112];
                        if (obj3 instanceof Field) {
                            zzI = (Field) obj3;
                        } else {
                            zzI = zzI(cls, (String) obj3);
                            zze[i112] = zzI;
                        }
                        i31 = charAt26 % 32;
                        int i113 = i34;
                        i28 = (int) unsafe.objectFieldOffset(zzI);
                        i29 = i113;
                    }
                    if (i88 >= 18 && i88 <= 49) {
                        iArr[i75] = objectFieldOffset;
                        i75++;
                    }
                    i44 = i29;
                    i32 = i31;
                    i33 = objectFieldOffset;
                }
                i12 = i101;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                i28 = 1048575;
                if ((charAt24 & 4096) == 4096) {
                }
                i29 = i26;
                i31 = 0;
                if (i88 >= 18) {
                    iArr[i75] = objectFieldOffset;
                    i75++;
                }
                i44 = i29;
                i32 = i31;
                i33 = objectFieldOffset;
            }
            int i114 = i77 + 1;
            iArr4[i77] = i27;
            int i115 = i77 + 2;
            String str = zzd;
            iArr4[i114] = ((charAt24 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i88 << 20) | i33;
            i77 += 3;
            iArr4[i115] = (i32 << 20) | i28;
            iArr3 = iArr4;
            length = i25;
            zzd = str;
            c11 = 55296;
        }
        return new zzwn<>(iArr3, objArr, charAt, charAt2, zzwvVar.zza(), z11, false, iArr, charAt4, i74, zzwqVar, zzvyVar, zzxoVar, zzukVar, zzwfVar, null);
    }

    private static <T> double zzo(T t2, long j11) {
        return ((Double) zzxy.zzf(t2, j11)).doubleValue();
    }

    private static <T> float zzp(T t2, long j11) {
        return ((Float) zzxy.zzf(t2, j11)).floatValue();
    }

    private final int zzq(T t2) {
        int i11;
        int zzD;
        int zzE;
        int zzD2;
        int zzx;
        int zzo;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1048575;
        while (i13 < this.zzc.length) {
            int zzC = zzC(i13);
            int i17 = this.zzc[i13];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i18 = this.zzc[i13 + 2];
                int i19 = i18 & i12;
                i11 = 1 << (i18 >>> 20);
                if (i19 != i16) {
                    i15 = unsafe.getInt(t2, i19);
                    i16 = i19;
                }
            } else {
                i11 = 0;
            }
            long j11 = zzC & i12;
            switch (zzB) {
                case 0:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i15 & i11) != 0) {
                        long j12 = unsafe.getLong(t2, j11);
                        zzD = zzto.zzD(i17 << 3);
                        zzE = zzto.zzE(j12);
                        i14 += zzE + zzD;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i15 & i11) != 0) {
                        long j13 = unsafe.getLong(t2, j11);
                        zzD = zzto.zzD(i17 << 3);
                        zzE = zzto.zzE(j13);
                        i14 += zzE + zzD;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i15 & i11) != 0) {
                        int i21 = unsafe.getInt(t2, j11);
                        zzD2 = zzto.zzD(i17 << 3);
                        zzx = zzto.zzx(i21);
                        i14 += zzx + zzD2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i15 & i11) != 0) {
                        Object object = unsafe.getObject(t2, j11);
                        if (object instanceof zztd) {
                            int zzD3 = zzto.zzD(i17 << 3);
                            int zzd = ((zztd) object).zzd();
                            i14 = Tl.a.b(zzd, zzd, zzD3, i14);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i17 << 3);
                            zzx = zzto.zzB((String) object);
                            i14 += zzx + zzD2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i15 & i11) != 0) {
                        zzo = zzwz.zzo(i17, unsafe.getObject(t2, j11), zzF(i13));
                        i14 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i15 & i11) != 0) {
                        zztd zztdVar = (zztd) unsafe.getObject(t2, j11);
                        int zzD4 = zzto.zzD(i17 << 3);
                        int zzd2 = zztdVar.zzd();
                        i14 = Tl.a.b(zzd2, zzd2, zzD4, i14);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(unsafe.getInt(t2, j11), zzto.zzD(i17 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i15 & i11) != 0) {
                        int i22 = unsafe.getInt(t2, j11);
                        zzD2 = zzto.zzD(i17 << 3);
                        zzx = zzto.zzx(i22);
                        i14 += zzx + zzD2;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i15 & i11) != 0) {
                        i14 = b.a(i17 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i15 & i11) != 0) {
                        int i23 = unsafe.getInt(t2, j11);
                        i14 = b.a((i23 >> 31) ^ (i23 + i23), zzto.zzD(i17 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i15 & i11) != 0) {
                        long j14 = unsafe.getLong(t2, j11);
                        zzD = zzto.zzD(i17 << 3);
                        zzE = zzto.zzE((j14 + j14) ^ (j14 >> 63));
                        i14 += zzE + zzD;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i15 & i11) != 0) {
                        zzo = zzto.zzv(i17, (zzwk) unsafe.getObject(t2, j11), zzF(i13));
                        i14 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzwz.zzh(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 19:
                    zzo = zzwz.zzf(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 20:
                    zzo = zzwz.zzm(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 21:
                    zzo = zzwz.zzx(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 22:
                    zzo = zzwz.zzk(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 23:
                    zzo = zzwz.zzh(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 24:
                    zzo = zzwz.zzf(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzo = zzwz.zza(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    zzo = zzwz.zzu(i17, (List) unsafe.getObject(t2, j11));
                    i14 += zzo;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    zzo = zzwz.zzp(i17, (List) unsafe.getObject(t2, j11), zzF(i13));
                    i14 += zzo;
                    break;
                case 28:
                    zzo = zzwz.zzc(i17, (List) unsafe.getObject(t2, j11));
                    i14 += zzo;
                    break;
                case 29:
                    zzo = zzwz.zzv(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    zzo = zzwz.zzd(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzo = zzwz.zzf(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 32:
                    zzo = zzwz.zzh(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 33:
                    zzo = zzwz.zzq(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case 34:
                    zzo = zzwz.zzs(i17, (List) unsafe.getObject(t2, j11), false);
                    i14 += zzo;
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int zzi = zzwz.zzi((List) unsafe.getObject(t2, j11));
                    if (zzi > 0) {
                        i14 = Tl.a.b(zzi, zzto.zzC(i17), zzi, i14);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int zzg = zzwz.zzg((List) unsafe.getObject(t2, j11));
                    if (zzg > 0) {
                        i14 = Tl.a.b(zzg, zzto.zzC(i17), zzg, i14);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int zzn = zzwz.zzn((List) unsafe.getObject(t2, j11));
                    if (zzn > 0) {
                        i14 = Tl.a.b(zzn, zzto.zzC(i17), zzn, i14);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzwz.zzy((List) unsafe.getObject(t2, j11));
                    if (zzy > 0) {
                        i14 = Tl.a.b(zzy, zzto.zzC(i17), zzy, i14);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int zzl = zzwz.zzl((List) unsafe.getObject(t2, j11));
                    if (zzl > 0) {
                        i14 = Tl.a.b(zzl, zzto.zzC(i17), zzl, i14);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzwz.zzi((List) unsafe.getObject(t2, j11));
                    if (zzi2 > 0) {
                        i14 = Tl.a.b(zzi2, zzto.zzC(i17), zzi2, i14);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzwz.zzg((List) unsafe.getObject(t2, j11));
                    if (zzg2 > 0) {
                        i14 = Tl.a.b(zzg2, zzto.zzC(i17), zzg2, i14);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzwz.zzb((List) unsafe.getObject(t2, j11));
                    if (zzb2 > 0) {
                        i14 = Tl.a.b(zzb2, zzto.zzC(i17), zzb2, i14);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzwz.zzw((List) unsafe.getObject(t2, j11));
                    if (zzw > 0) {
                        i14 = Tl.a.b(zzw, zzto.zzC(i17), zzw, i14);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int zze = zzwz.zze((List) unsafe.getObject(t2, j11));
                    if (zze > 0) {
                        i14 = Tl.a.b(zze, zzto.zzC(i17), zze, i14);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int zzg3 = zzwz.zzg((List) unsafe.getObject(t2, j11));
                    if (zzg3 > 0) {
                        i14 = Tl.a.b(zzg3, zzto.zzC(i17), zzg3, i14);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzwz.zzi((List) unsafe.getObject(t2, j11));
                    if (zzi3 > 0) {
                        i14 = Tl.a.b(zzi3, zzto.zzC(i17), zzi3, i14);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzwz.zzr((List) unsafe.getObject(t2, j11));
                    if (zzr > 0) {
                        i14 = Tl.a.b(zzr, zzto.zzC(i17), zzr, i14);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzwz.zzt((List) unsafe.getObject(t2, j11));
                    if (zzt > 0) {
                        i14 = Tl.a.b(zzt, zzto.zzC(i17), zzt, i14);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzwz.zzj(i17, (List) unsafe.getObject(t2, j11), zzF(i13));
                    i14 += zzo;
                    break;
                case 50:
                    zzwf.zza(i17, unsafe.getObject(t2, j11), zzH(i13));
                    break;
                case 51:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t2, i17, i13)) {
                        long zzD5 = zzD(t2, j11);
                        zzD = zzto.zzD(i17 << 3);
                        zzE = zzto.zzE(zzD5);
                        i14 += zzE + zzD;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t2, i17, i13)) {
                        long zzD6 = zzD(t2, j11);
                        zzD = zzto.zzD(i17 << 3);
                        zzE = zzto.zzE(zzD6);
                        i14 += zzE + zzD;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t2, i17, i13)) {
                        int zzs = zzs(t2, j11);
                        zzD2 = zzto.zzD(i17 << 3);
                        zzx = zzto.zzx(zzs);
                        i14 += zzx + zzD2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 1, i14);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(t2, i17, i13)) {
                        Object object2 = unsafe.getObject(t2, j11);
                        if (object2 instanceof zztd) {
                            int zzD7 = zzto.zzD(i17 << 3);
                            int zzd3 = ((zztd) object2).zzd();
                            i14 = Tl.a.b(zzd3, zzd3, zzD7, i14);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i17 << 3);
                            zzx = zzto.zzB((String) object2);
                            i14 += zzx + zzD2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(t2, i17, i13)) {
                        zzo = zzwz.zzo(i17, unsafe.getObject(t2, j11), zzF(i13));
                        i14 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t2, i17, i13)) {
                        zztd zztdVar2 = (zztd) unsafe.getObject(t2, j11);
                        int zzD8 = zzto.zzD(i17 << 3);
                        int zzd4 = zztdVar2.zzd();
                        i14 = Tl.a.b(zzd4, zzd4, zzD8, i14);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(zzs(t2, j11), zzto.zzD(i17 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t2, i17, i13)) {
                        int zzs2 = zzs(t2, j11);
                        zzD2 = zzto.zzD(i17 << 3);
                        zzx = zzto.zzx(zzs2);
                        i14 += zzx + zzD2;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 4, i14);
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzT(t2, i17, i13)) {
                        i14 = b.a(i17 << 3, 8, i14);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t2, i17, i13)) {
                        int zzs3 = zzs(t2, j11);
                        i14 = b.a((zzs3 >> 31) ^ (zzs3 + zzs3), zzto.zzD(i17 << 3), i14);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t2, i17, i13)) {
                        long zzD9 = zzD(t2, j11);
                        zzD = zzto.zzD(i17 << 3);
                        zzE = zzto.zzE((zzD9 + zzD9) ^ (zzD9 >> 63));
                        i14 += zzE + zzD;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t2, i17, i13)) {
                        zzo = zzto.zzv(i17, (zzwk) unsafe.getObject(t2, j11), zzF(i13));
                        i14 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
            i13 += 3;
            i12 = 1048575;
        }
        zzxo<?, ?> zzxoVar = this.zzo;
        int zza2 = i14 + zzxoVar.zza(zzxoVar.zzd(t2));
        if (!this.zzh) {
            return zza2;
        }
        zzuo<?> zzb3 = this.zzp.zzb(t2);
        int i24 = 0;
        for (int i25 = 0; i25 < zzb3.zza.zzb(); i25++) {
            Map.Entry<?, Object> zzg4 = zzb3.zza.zzg(i25);
            i24 += zzuo.zza((zzun) zzg4.getKey(), zzg4.getValue());
        }
        for (Map.Entry<?, Object> entry : zzb3.zza.zzc()) {
            i24 += zzuo.zza((zzun) entry.getKey(), entry.getValue());
        }
        return zza2 + i24;
    }

    private final int zzr(T t2) {
        int zzD;
        int zzE;
        int zzD2;
        int zzx;
        int zzo;
        int i11;
        Unsafe unsafe = zzb;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzC = zzC(i13);
            int zzB = zzB(zzC);
            int i14 = this.zzc[i13];
            long j11 = zzC & 1048575;
            if (zzB >= zzup.zzJ.zza() && zzB <= zzup.zzW.zza()) {
                int i15 = this.zzc[i13 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(t2, i13)) {
                        long zzd = zzxy.zzd(t2, j11);
                        zzD = zzto.zzD(i14 << 3);
                        zzE = zzto.zzE(zzd);
                        i11 = zzE + zzD;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(t2, i13)) {
                        long zzd2 = zzxy.zzd(t2, j11);
                        zzD = zzto.zzD(i14 << 3);
                        zzE = zzto.zzE(zzd2);
                        i11 = zzE + zzD;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(t2, i13)) {
                        int zzc = zzxy.zzc(t2, j11);
                        zzD2 = zzto.zzD(i14 << 3);
                        zzx = zzto.zzx(zzc);
                        i11 = zzx + zzD2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(t2, i13)) {
                        Object zzf = zzxy.zzf(t2, j11);
                        if (zzf instanceof zztd) {
                            int zzD3 = zzto.zzD(i14 << 3);
                            int zzd3 = ((zztd) zzf).zzd();
                            i12 = Tl.a.b(zzd3, zzd3, zzD3, i12);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i14 << 3);
                            zzx = zzto.zzB((String) zzf);
                            i11 = zzx + zzD2;
                            i12 += i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzQ(t2, i13)) {
                        zzo = zzwz.zzo(i14, zzxy.zzf(t2, j11), zzF(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(t2, i13)) {
                        zztd zztdVar = (zztd) zzxy.zzf(t2, j11);
                        int zzD4 = zzto.zzD(i14 << 3);
                        int zzd4 = zztdVar.zzd();
                        i12 = Tl.a.b(zzd4, zzd4, zzD4, i12);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(zzxy.zzc(t2, j11), zzto.zzD(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(t2, i13)) {
                        int zzc2 = zzxy.zzc(t2, j11);
                        zzD2 = zzto.zzD(i14 << 3);
                        zzx = zzto.zzx(zzc2);
                        i11 = zzx + zzD2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(t2, i13)) {
                        i12 = b.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(t2, i13)) {
                        int zzc3 = zzxy.zzc(t2, j11);
                        i12 = b.a((zzc3 >> 31) ^ (zzc3 + zzc3), zzto.zzD(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(t2, i13)) {
                        long zzd5 = zzxy.zzd(t2, j11);
                        zzD = zzto.zzD(i14 << 3);
                        zzE = zzto.zzE((zzd5 >> 63) ^ (zzd5 + zzd5));
                        i11 = zzE + zzD;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(t2, i13)) {
                        zzo = zzto.zzv(i14, (zzwk) zzxy.zzf(t2, j11), zzF(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzwz.zzh(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 19:
                    zzo = zzwz.zzf(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 20:
                    zzo = zzwz.zzm(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 21:
                    zzo = zzwz.zzx(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 22:
                    zzo = zzwz.zzk(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 23:
                    zzo = zzwz.zzh(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 24:
                    zzo = zzwz.zzf(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzo = zzwz.zza(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    zzo = zzwz.zzu(i14, (List) zzxy.zzf(t2, j11));
                    i12 += zzo;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    zzo = zzwz.zzp(i14, (List) zzxy.zzf(t2, j11), zzF(i13));
                    i12 += zzo;
                    break;
                case 28:
                    zzo = zzwz.zzc(i14, (List) zzxy.zzf(t2, j11));
                    i12 += zzo;
                    break;
                case 29:
                    zzo = zzwz.zzv(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    zzo = zzwz.zzd(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzo = zzwz.zzf(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 32:
                    zzo = zzwz.zzh(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 33:
                    zzo = zzwz.zzq(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case 34:
                    zzo = zzwz.zzs(i14, (List) zzxy.zzf(t2, j11), false);
                    i12 += zzo;
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int zzi = zzwz.zzi((List) unsafe.getObject(t2, j11));
                    if (zzi > 0) {
                        i12 = Tl.a.b(zzi, zzto.zzC(i14), zzi, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int zzg = zzwz.zzg((List) unsafe.getObject(t2, j11));
                    if (zzg > 0) {
                        i12 = Tl.a.b(zzg, zzto.zzC(i14), zzg, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int zzn = zzwz.zzn((List) unsafe.getObject(t2, j11));
                    if (zzn > 0) {
                        i12 = Tl.a.b(zzn, zzto.zzC(i14), zzn, i12);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzwz.zzy((List) unsafe.getObject(t2, j11));
                    if (zzy > 0) {
                        i12 = Tl.a.b(zzy, zzto.zzC(i14), zzy, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int zzl = zzwz.zzl((List) unsafe.getObject(t2, j11));
                    if (zzl > 0) {
                        i12 = Tl.a.b(zzl, zzto.zzC(i14), zzl, i12);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzwz.zzi((List) unsafe.getObject(t2, j11));
                    if (zzi2 > 0) {
                        i12 = Tl.a.b(zzi2, zzto.zzC(i14), zzi2, i12);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzwz.zzg((List) unsafe.getObject(t2, j11));
                    if (zzg2 > 0) {
                        i12 = Tl.a.b(zzg2, zzto.zzC(i14), zzg2, i12);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzwz.zzb((List) unsafe.getObject(t2, j11));
                    if (zzb2 > 0) {
                        i12 = Tl.a.b(zzb2, zzto.zzC(i14), zzb2, i12);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzwz.zzw((List) unsafe.getObject(t2, j11));
                    if (zzw > 0) {
                        i12 = Tl.a.b(zzw, zzto.zzC(i14), zzw, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int zze = zzwz.zze((List) unsafe.getObject(t2, j11));
                    if (zze > 0) {
                        i12 = Tl.a.b(zze, zzto.zzC(i14), zze, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int zzg3 = zzwz.zzg((List) unsafe.getObject(t2, j11));
                    if (zzg3 > 0) {
                        i12 = Tl.a.b(zzg3, zzto.zzC(i14), zzg3, i12);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzwz.zzi((List) unsafe.getObject(t2, j11));
                    if (zzi3 > 0) {
                        i12 = Tl.a.b(zzi3, zzto.zzC(i14), zzi3, i12);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzwz.zzr((List) unsafe.getObject(t2, j11));
                    if (zzr > 0) {
                        i12 = Tl.a.b(zzr, zzto.zzC(i14), zzr, i12);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzwz.zzt((List) unsafe.getObject(t2, j11));
                    if (zzt > 0) {
                        i12 = Tl.a.b(zzt, zzto.zzC(i14), zzt, i12);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzwz.zzj(i14, (List) zzxy.zzf(t2, j11), zzF(i13));
                    i12 += zzo;
                    break;
                case 50:
                    zzwf.zza(i14, zzxy.zzf(t2, j11), zzH(i13));
                    break;
                case 51:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t2, i14, i13)) {
                        long zzD5 = zzD(t2, j11);
                        zzD = zzto.zzD(i14 << 3);
                        zzE = zzto.zzE(zzD5);
                        i11 = zzE + zzD;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t2, i14, i13)) {
                        long zzD6 = zzD(t2, j11);
                        zzD = zzto.zzD(i14 << 3);
                        zzE = zzto.zzE(zzD6);
                        i11 = zzE + zzD;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t2, i14, i13)) {
                        int zzs = zzs(t2, j11);
                        zzD2 = zzto.zzD(i14 << 3);
                        zzx = zzto.zzx(zzs);
                        i11 = zzx + zzD2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(t2, i14, i13)) {
                        Object zzf2 = zzxy.zzf(t2, j11);
                        if (zzf2 instanceof zztd) {
                            int zzD7 = zzto.zzD(i14 << 3);
                            int zzd6 = ((zztd) zzf2).zzd();
                            i12 = Tl.a.b(zzd6, zzd6, zzD7, i12);
                            break;
                        } else {
                            zzD2 = zzto.zzD(i14 << 3);
                            zzx = zzto.zzB((String) zzf2);
                            i11 = zzx + zzD2;
                            i12 += i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(t2, i14, i13)) {
                        zzo = zzwz.zzo(i14, zzxy.zzf(t2, j11), zzF(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t2, i14, i13)) {
                        zztd zztdVar2 = (zztd) zzxy.zzf(t2, j11);
                        int zzD8 = zzto.zzD(i14 << 3);
                        int zzd7 = zztdVar2.zzd();
                        i12 = Tl.a.b(zzd7, zzd7, zzD8, i12);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(zzs(t2, j11), zzto.zzD(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t2, i14, i13)) {
                        int zzs2 = zzs(t2, j11);
                        zzD2 = zzto.zzD(i14 << 3);
                        zzx = zzto.zzx(zzs2);
                        i11 = zzx + zzD2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzT(t2, i14, i13)) {
                        i12 = b.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t2, i14, i13)) {
                        int zzs3 = zzs(t2, j11);
                        i12 = b.a((zzs3 >> 31) ^ (zzs3 + zzs3), zzto.zzD(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t2, i14, i13)) {
                        long zzD9 = zzD(t2, j11);
                        zzD = zzto.zzD(i14 << 3);
                        zzE = zzto.zzE((zzD9 >> 63) ^ (zzD9 + zzD9));
                        i11 = zzE + zzD;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t2, i14, i13)) {
                        zzo = zzto.zzv(i14, (zzwk) zzxy.zzf(t2, j11), zzF(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzxo<?, ?> zzxoVar = this.zzo;
        return i12 + zzxoVar.zza(zzxoVar.zzd(t2));
    }

    private static <T> int zzs(T t2, long j11) {
        return ((Integer) zzxy.zzf(t2, j11)).intValue();
    }

    private final <K, V> int zzt(T t2, byte[] bArr, int i11, int i12, int i13, long j11, zzsl zzslVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i13);
        Object object = unsafe.getObject(t2, j11);
        if (zzwf.zzb(object)) {
            zzwe<K, V> zzb2 = zzwe.zza().zzb();
            zzwf.zzc(zzb2, object);
            unsafe.putObject(t2, j11, zzb2);
        }
        throw null;
    }

    private final int zzu(T t2, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, zzsl zzslVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j12 = this.zzc[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Double.valueOf(Double.longBitsToDouble(zzsm.zzo(bArr, i11))));
                unsafe.putInt(t2, j12, i14);
                return i11 + 8;
            case 52:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Float.valueOf(Float.intBitsToFloat(zzsm.zzb(bArr, i11))));
                unsafe.putInt(t2, j12, i14);
                return i11 + 4;
            case 53:
            case 54:
                if (i15 != 0) {
                    return i11;
                }
                int zzm = zzsm.zzm(bArr, i11, zzslVar);
                unsafe.putObject(t2, j11, Long.valueOf(zzslVar.zzb));
                unsafe.putInt(t2, j12, i14);
                return zzm;
            case 55:
            case 62:
                if (i15 != 0) {
                    return i11;
                }
                int zzj = zzsm.zzj(bArr, i11, zzslVar);
                unsafe.putObject(t2, j11, Integer.valueOf(zzslVar.zza));
                unsafe.putInt(t2, j12, i14);
                return zzj;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Long.valueOf(zzsm.zzo(bArr, i11)));
                unsafe.putInt(t2, j12, i14);
                return i11 + 8;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(t2, j11, Integer.valueOf(zzsm.zzb(bArr, i11)));
                unsafe.putInt(t2, j12, i14);
                return i11 + 4;
            case 58:
                if (i15 != 0) {
                    return i11;
                }
                int zzm2 = zzsm.zzm(bArr, i11, zzslVar);
                unsafe.putObject(t2, j11, Boolean.valueOf(zzslVar.zzb != 0));
                unsafe.putInt(t2, j12, i14);
                return zzm2;
            case 59:
                if (i15 != 2) {
                    return i11;
                }
                int zzj2 = zzsm.zzj(bArr, i11, zzslVar);
                int i19 = zzslVar.zza;
                if (i19 == 0) {
                    unsafe.putObject(t2, j11, "");
                } else {
                    if ((i16 & 536870912) != 0 && !zzyd.zzf(bArr, zzj2, zzj2 + i19)) {
                        throw zzvk.zzd();
                    }
                    unsafe.putObject(t2, j11, new String(bArr, zzj2, i19, zzvi.zza));
                    zzj2 += i19;
                }
                unsafe.putInt(t2, j12, i14);
                return zzj2;
            case 60:
                if (i15 != 2) {
                    return i11;
                }
                int zzd = zzsm.zzd(zzF(i18), bArr, i11, i12, zzslVar);
                object = unsafe.getInt(t2, j12) == i14 ? unsafe.getObject(t2, j11) : null;
                if (object == null) {
                    unsafe.putObject(t2, j11, zzslVar.zzc);
                } else {
                    unsafe.putObject(t2, j11, zzvi.zzg(object, zzslVar.zzc));
                }
                unsafe.putInt(t2, j12, i14);
                return zzd;
            case 61:
                if (i15 != 2) {
                    return i11;
                }
                int zza2 = zzsm.zza(bArr, i11, zzslVar);
                unsafe.putObject(t2, j11, zzslVar.zzc);
                unsafe.putInt(t2, j12, i14);
                return zza2;
            case 63:
                if (i15 != 0) {
                    return i11;
                }
                int zzj3 = zzsm.zzj(bArr, i11, zzslVar);
                int i21 = zzslVar.zza;
                zzvd zzE = zzE(i18);
                if (zzE != null && !zzE.zza(i21)) {
                    zzd(t2).zzh(i13, Long.valueOf(i21));
                    return zzj3;
                }
                unsafe.putObject(t2, j11, Integer.valueOf(i21));
                unsafe.putInt(t2, j12, i14);
                return zzj3;
            case 66:
                if (i15 != 0) {
                    return i11;
                }
                int zzj4 = zzsm.zzj(bArr, i11, zzslVar);
                unsafe.putObject(t2, j11, Integer.valueOf(zztj.zzs(zzslVar.zza)));
                unsafe.putInt(t2, j12, i14);
                return zzj4;
            case 67:
                if (i15 != 0) {
                    return i11;
                }
                int zzm3 = zzsm.zzm(bArr, i11, zzslVar);
                unsafe.putObject(t2, j11, Long.valueOf(zztj.zzt(zzslVar.zzb)));
                unsafe.putInt(t2, j12, i14);
                return zzm3;
            case 68:
                if (i15 == 3) {
                    int zzc = zzsm.zzc(zzF(i18), bArr, i11, i12, (i13 & (-8)) | 4, zzslVar);
                    object = unsafe.getInt(t2, j12) == i14 ? unsafe.getObject(t2, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j11, zzslVar.zzc);
                    } else {
                        unsafe.putObject(t2, j11, zzvi.zzg(object, zzslVar.zzc));
                    }
                    unsafe.putInt(t2, j12, i14);
                    return zzc;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x0087. Please report as an issue. */
    private final int zzv(T t2, byte[] bArr, int i11, int i12, zzsl zzslVar) throws IOException {
        T t11;
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int zzj;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        zzwn<T> zzwnVar = this;
        T t12 = t2;
        byte[] bArr2 = bArr;
        int i25 = i12;
        zzsl zzslVar2 = zzslVar;
        Unsafe unsafe2 = zzb;
        int i26 = -1;
        int i27 = i11;
        int i28 = -1;
        int i29 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (i27 < i25) {
            int i33 = i27 + 1;
            int i34 = bArr2[i27];
            if (i34 < 0) {
                i33 = zzsm.zzk(i34, bArr2, i33, zzslVar2);
                i34 = zzslVar2.zza;
            }
            int i35 = i33;
            int i36 = i34 >>> 3;
            int i37 = i34 & 7;
            int zzy = i36 > i28 ? zzwnVar.zzy(i36, i29 / 3) : zzwnVar.zzx(i36);
            if (zzy == i26) {
                t11 = t12;
                unsafe = unsafe2;
                i13 = i34;
                i14 = i26;
                i15 = i35;
                i16 = i36;
                i17 = 0;
            } else {
                int i38 = zzwnVar.zzc[zzy + 1];
                int zzB = zzB(i38);
                int i39 = i34;
                int i41 = zzy;
                long j11 = i38 & 1048575;
                if (zzB <= 17) {
                    int i42 = zzwnVar.zzc[i41 + 2];
                    int i43 = 1 << (i42 >>> 20);
                    int i44 = i42 & 1048575;
                    if (i44 != i32) {
                        int i45 = 1048575;
                        if (i32 != 1048575) {
                            unsafe2.putInt(t12, i32, i31);
                            i44 = i44;
                            i45 = 1048575;
                        }
                        if (i44 != i45) {
                            i31 = unsafe2.getInt(t12, i44);
                        }
                        i32 = i44;
                    }
                    switch (zzB) {
                        case 0:
                            i18 = i41;
                            if (i37 != 1) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzxy.zzo(t12, j11, Double.longBitsToDouble(zzsm.zzo(bArr2, i35)));
                                i27 = i35 + 8;
                                i31 |= i43;
                                bArr2 = bArr;
                                i25 = i12;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 1:
                            i18 = i41;
                            if (i37 != 5) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzxy.zzp(t12, j11, Float.intBitsToFloat(zzsm.zzb(bArr2, i35)));
                                i27 = i35 + 4;
                                i31 |= i43;
                                i25 = i12;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i18 = i41;
                            if (i37 != 0) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                int zzm = zzsm.zzm(bArr2, i35, zzslVar2);
                                Unsafe unsafe3 = unsafe2;
                                T t13 = t12;
                                unsafe3.putLong(t13, j11, zzslVar2.zzb);
                                unsafe2 = unsafe3;
                                t12 = t13;
                                i31 |= i43;
                                i27 = zzm;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                i25 = i12;
                                break;
                            }
                        case 4:
                        case 11:
                            i18 = i41;
                            if (i37 != 0) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzj = zzsm.zzj(bArr2, i35, zzslVar2);
                                unsafe2.putInt(t12, j11, zzslVar2.zza);
                                i31 |= i43;
                                i25 = i12;
                                i27 = zzj;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i18 = i41;
                            if (i37 != 1) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                T t14 = t12;
                                unsafe4.putLong(t14, j11, zzsm.zzo(bArr2, i35));
                                unsafe2 = unsafe4;
                                t12 = t14;
                                i27 = i35 + 8;
                                i31 |= i43;
                                i25 = i12;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i18 = i41;
                            if (i37 != 5) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                unsafe2.putInt(t12, j11, zzsm.zzb(bArr2, i35));
                                i27 = i35 + 4;
                                i31 |= i43;
                                i25 = i12;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 7:
                            i18 = i41;
                            if (i37 != 0) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                int zzm2 = zzsm.zzm(bArr2, i35, zzslVar2);
                                zzxy.zzm(t12, j11, zzslVar2.zzb != 0);
                                i31 |= i43;
                                i27 = zzm2;
                                i25 = i12;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 8:
                            i18 = i41;
                            if (i37 != 2) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzj = (i38 & 536870912) == 0 ? zzsm.zzg(bArr2, i35, zzslVar2) : zzsm.zzh(bArr2, i35, zzslVar2);
                                unsafe2.putObject(t12, j11, zzslVar2.zzc);
                                i31 |= i43;
                                i25 = i12;
                                i27 = zzj;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 9:
                            i18 = i41;
                            if (i37 != 2) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzj = zzsm.zzd(zzwnVar.zzF(i18), bArr2, i35, i25, zzslVar2);
                                Object object = unsafe2.getObject(t12, j11);
                                if (object == null) {
                                    unsafe2.putObject(t12, j11, zzslVar2.zzc);
                                } else {
                                    unsafe2.putObject(t12, j11, zzvi.zzg(object, zzslVar2.zzc));
                                }
                                i31 |= i43;
                                i27 = zzj;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 10:
                            i18 = i41;
                            if (i37 != 2) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzj = zzsm.zza(bArr2, i35, zzslVar2);
                                unsafe2.putObject(t12, j11, zzslVar2.zzc);
                                i31 |= i43;
                                i27 = zzj;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 12:
                            i18 = i41;
                            if (i37 != 0) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzj = zzsm.zzj(bArr2, i35, zzslVar2);
                                unsafe2.putInt(t12, j11, zzslVar2.zza);
                                i31 |= i43;
                                i27 = zzj;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 15:
                            i18 = i41;
                            if (i37 != 0) {
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                zzj = zzsm.zzj(bArr2, i35, zzslVar2);
                                unsafe2.putInt(t12, j11, zztj.zzs(zzslVar2.zza));
                                i31 |= i43;
                                i27 = zzj;
                                i29 = i18;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        case 16:
                            if (i37 != 0) {
                                i18 = i41;
                                i13 = i39;
                                t11 = t12;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i36;
                                i14 = -1;
                                i17 = i18;
                                break;
                            } else {
                                int zzm3 = zzsm.zzm(bArr2, i35, zzslVar2);
                                Unsafe unsafe5 = unsafe2;
                                T t15 = t12;
                                unsafe5.putLong(t15, j11, zztj.zzt(zzslVar2.zzb));
                                unsafe2 = unsafe5;
                                t12 = t15;
                                i31 |= i43;
                                i27 = zzm3;
                                i29 = i41;
                                i28 = i36;
                                i26 = -1;
                                break;
                            }
                        default:
                            i18 = i41;
                            i13 = i39;
                            t11 = t12;
                            unsafe = unsafe2;
                            i15 = i35;
                            i16 = i36;
                            i14 = -1;
                            i17 = i18;
                            break;
                    }
                } else {
                    if (zzB != 27) {
                        Unsafe unsafe6 = unsafe2;
                        if (zzB <= 49) {
                            i19 = i31;
                            unsafe = unsafe6;
                            i14 = -1;
                            i23 = i32;
                            int zzw = zzwnVar.zzw(t2, bArr, i35, i12, i39, i36, i37, i41, i38, zzB, j11, zzslVar);
                            i24 = i39;
                            i22 = i36;
                            i17 = i41;
                            if (zzw != i35) {
                                zzwnVar = this;
                                t12 = t2;
                                i25 = i12;
                                zzslVar2 = zzslVar;
                                i27 = zzw;
                                i28 = i22;
                                i29 = i17;
                                i32 = i23;
                                i26 = -1;
                                unsafe2 = unsafe;
                                i31 = i19;
                                bArr2 = bArr;
                            } else {
                                t11 = t2;
                                i15 = zzw;
                                i16 = i22;
                                i13 = i24;
                            }
                        } else {
                            i17 = i41;
                            i19 = i31;
                            unsafe = unsafe6;
                            i14 = -1;
                            i21 = i35;
                            i23 = i32;
                            i22 = i36;
                            i24 = i39;
                            if (zzB != 50) {
                                i16 = i22;
                                int zzu = zzu(t2, bArr, i21, i12, i24, i16, i37, i38, zzB, j11, i17, zzslVar);
                                t11 = t2;
                                if (zzu != i21) {
                                    zzwnVar = this;
                                    zzslVar2 = zzslVar;
                                    i28 = i16;
                                    i27 = zzu;
                                    t12 = t11;
                                    i29 = i17;
                                    i32 = i23;
                                    i26 = -1;
                                    unsafe2 = unsafe;
                                    i31 = i19;
                                    bArr2 = bArr;
                                    i25 = i12;
                                } else {
                                    i13 = i24;
                                    i15 = zzu;
                                }
                            } else if (i37 == 2) {
                                int zzt = zzt(t2, bArr, i21, i12, i17, j11, zzslVar);
                                if (zzt != i21) {
                                    zzwnVar = this;
                                    t12 = t2;
                                    bArr2 = bArr;
                                    i25 = i12;
                                    zzslVar2 = zzslVar;
                                    i27 = zzt;
                                    i28 = i22;
                                    i29 = i17;
                                    i32 = i23;
                                    i26 = -1;
                                    unsafe2 = unsafe;
                                    i31 = i19;
                                } else {
                                    t11 = t2;
                                    i15 = zzt;
                                    i16 = i22;
                                    i13 = i24;
                                }
                            } else {
                                t11 = t2;
                                i15 = i21;
                                i16 = i22;
                                i13 = i24;
                            }
                        }
                    } else if (i37 == 2) {
                        zzvh zzvhVar = (zzvh) unsafe2.getObject(t12, j11);
                        if (!zzvhVar.zzc()) {
                            int size = zzvhVar.size();
                            zzvhVar = zzvhVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(t12, j11, zzvhVar);
                        }
                        int zze = zzsm.zze(zzwnVar.zzF(i41), i39, bArr, i35, i12, zzvhVar, zzslVar2);
                        bArr2 = bArr;
                        zzslVar2 = zzslVar;
                        i27 = zze;
                        i29 = i41;
                        i28 = i36;
                        unsafe2 = unsafe2;
                        i26 = -1;
                        t12 = t2;
                        i25 = i12;
                    } else {
                        i19 = i31;
                        i21 = i35;
                        i22 = i36;
                        unsafe = unsafe2;
                        i14 = -1;
                        i17 = i41;
                        i23 = i32;
                        i24 = i39;
                        t11 = t2;
                        i15 = i21;
                        i16 = i22;
                        i13 = i24;
                    }
                    i32 = i23;
                    i31 = i19;
                }
            }
            int zzi = zzsm.zzi(i13, bArr, i15, i12, zzd(t11), zzslVar);
            bArr2 = bArr;
            zzslVar2 = zzslVar;
            i28 = i16;
            t12 = t11;
            i29 = i17;
            i26 = i14;
            unsafe2 = unsafe;
            i25 = i12;
            i27 = zzi;
            zzwnVar = this;
        }
        Unsafe unsafe7 = unsafe2;
        int i46 = i25;
        int i47 = i32;
        int i48 = i31;
        T t16 = t12;
        if (i47 != 1048575) {
            unsafe7.putInt(t16, i47, i48);
        }
        if (i27 == i46) {
            return i27;
        }
        throw zzvk.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int zzw(T t2, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, zzsl zzslVar) throws IOException {
        int zzl;
        Unsafe unsafe = zzb;
        zzvh zzvhVar = (zzvh) unsafe.getObject(t2, j12);
        if (!zzvhVar.zzc()) {
            int size = zzvhVar.size();
            zzvhVar = zzvhVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(t2, j12, zzvhVar);
        }
        zzvh zzvhVar2 = zzvhVar;
        switch (i17) {
            case 18:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i15 == 2) {
                    zzug zzugVar = (zzug) zzvhVar2;
                    int zzj = zzsm.zzj(bArr, i11, zzslVar);
                    int i18 = zzslVar.zza + zzj;
                    while (zzj < i18) {
                        zzugVar.zze(Double.longBitsToDouble(zzsm.zzo(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i18) {
                        return zzj;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 1) {
                    zzug zzugVar2 = (zzug) zzvhVar2;
                    zzugVar2.zze(Double.longBitsToDouble(zzsm.zzo(bArr, i11)));
                    int i19 = i11 + 8;
                    while (i19 < i12) {
                        int zzj2 = zzsm.zzj(bArr, i19, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return i19;
                        }
                        zzugVar2.zze(Double.longBitsToDouble(zzsm.zzo(bArr, zzj2)));
                        i19 = zzj2 + 8;
                    }
                    return i19;
                }
                return i11;
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i15 == 2) {
                    zzuq zzuqVar = (zzuq) zzvhVar2;
                    int zzj3 = zzsm.zzj(bArr, i11, zzslVar);
                    int i21 = zzslVar.zza + zzj3;
                    while (zzj3 < i21) {
                        zzuqVar.zze(Float.intBitsToFloat(zzsm.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i21) {
                        return zzj3;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 5) {
                    zzuq zzuqVar2 = (zzuq) zzvhVar2;
                    zzuqVar2.zze(Float.intBitsToFloat(zzsm.zzb(bArr, i11)));
                    int i22 = i11 + 4;
                    while (i22 < i12) {
                        int zzj4 = zzsm.zzj(bArr, i22, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return i22;
                        }
                        zzuqVar2.zze(Float.intBitsToFloat(zzsm.zzb(bArr, zzj4)));
                        i22 = zzj4 + 4;
                    }
                    return i22;
                }
                return i11;
            case 20:
            case 21:
            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
            case 38:
                if (i15 == 2) {
                    zzvz zzvzVar = (zzvz) zzvhVar2;
                    int zzj5 = zzsm.zzj(bArr, i11, zzslVar);
                    int i23 = zzslVar.zza + zzj5;
                    while (zzj5 < i23) {
                        zzj5 = zzsm.zzm(bArr, zzj5, zzslVar);
                        zzvzVar.zzf(zzslVar.zzb);
                    }
                    if (zzj5 == i23) {
                        return zzj5;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 0) {
                    zzvz zzvzVar2 = (zzvz) zzvhVar2;
                    int zzm = zzsm.zzm(bArr, i11, zzslVar);
                    zzvzVar2.zzf(zzslVar.zzb);
                    while (zzm < i12) {
                        int zzj6 = zzsm.zzj(bArr, zzm, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return zzm;
                        }
                        zzm = zzsm.zzm(bArr, zzj6, zzslVar);
                        zzvzVar2.zzf(zzslVar.zzb);
                    }
                    return zzm;
                }
                return i11;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i15 == 2) {
                    return zzsm.zzf(bArr, i11, zzvhVar2, zzslVar);
                }
                if (i15 == 0) {
                    return zzsm.zzl(i13, bArr, i11, i12, zzvhVar2, zzslVar);
                }
                return i11;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    zzvz zzvzVar3 = (zzvz) zzvhVar2;
                    int zzj7 = zzsm.zzj(bArr, i11, zzslVar);
                    int i24 = zzslVar.zza + zzj7;
                    while (zzj7 < i24) {
                        zzvzVar3.zzf(zzsm.zzo(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i24) {
                        return zzj7;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 1) {
                    zzvz zzvzVar4 = (zzvz) zzvhVar2;
                    zzvzVar4.zzf(zzsm.zzo(bArr, i11));
                    int i25 = i11 + 8;
                    while (i25 < i12) {
                        int zzj8 = zzsm.zzj(bArr, i25, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return i25;
                        }
                        zzvzVar4.zzf(zzsm.zzo(bArr, zzj8));
                        i25 = zzj8 + 8;
                    }
                    return i25;
                }
                return i11;
            case 24:
            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
            case 41:
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                if (i15 == 2) {
                    zzva zzvaVar = (zzva) zzvhVar2;
                    int zzj9 = zzsm.zzj(bArr, i11, zzslVar);
                    int i26 = zzslVar.zza + zzj9;
                    while (zzj9 < i26) {
                        zzvaVar.zzh(zzsm.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i26) {
                        return zzj9;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 5) {
                    zzva zzvaVar2 = (zzva) zzvhVar2;
                    zzvaVar2.zzh(zzsm.zzb(bArr, i11));
                    int i27 = i11 + 4;
                    while (i27 < i12) {
                        int zzj10 = zzsm.zzj(bArr, i27, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return i27;
                        }
                        zzvaVar2.zzh(zzsm.zzb(bArr, zzj10));
                        i27 = zzj10 + 4;
                    }
                    return i27;
                }
                return i11;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case 42:
                if (i15 == 2) {
                    zzsr zzsrVar = (zzsr) zzvhVar2;
                    int zzj11 = zzsm.zzj(bArr, i11, zzslVar);
                    int i28 = zzslVar.zza + zzj11;
                    while (zzj11 < i28) {
                        zzj11 = zzsm.zzm(bArr, zzj11, zzslVar);
                        zzsrVar.zze(zzslVar.zzb != 0);
                    }
                    if (zzj11 == i28) {
                        return zzj11;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 0) {
                    zzsr zzsrVar2 = (zzsr) zzvhVar2;
                    int zzm2 = zzsm.zzm(bArr, i11, zzslVar);
                    zzsrVar2.zze(zzslVar.zzb != 0);
                    while (zzm2 < i12) {
                        int zzj12 = zzsm.zzj(bArr, zzm2, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzsm.zzm(bArr, zzj12, zzslVar);
                        zzsrVar2.zze(zzslVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i11;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        int zzj13 = zzsm.zzj(bArr, i11, zzslVar);
                        int i29 = zzslVar.zza;
                        if (i29 < 0) {
                            throw zzvk.zzf();
                        }
                        if (i29 == 0) {
                            zzvhVar2.add("");
                        } else {
                            zzvhVar2.add(new String(bArr, zzj13, i29, zzvi.zza));
                            zzj13 += i29;
                        }
                        while (zzj13 < i12) {
                            int zzj14 = zzsm.zzj(bArr, zzj13, zzslVar);
                            if (i13 != zzslVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzsm.zzj(bArr, zzj14, zzslVar);
                            int i31 = zzslVar.zza;
                            if (i31 < 0) {
                                throw zzvk.zzf();
                            }
                            if (i31 == 0) {
                                zzvhVar2.add("");
                            } else {
                                zzvhVar2.add(new String(bArr, zzj13, i31, zzvi.zza));
                                zzj13 += i31;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzsm.zzj(bArr, i11, zzslVar);
                    int i32 = zzslVar.zza;
                    if (i32 < 0) {
                        throw zzvk.zzf();
                    }
                    if (i32 == 0) {
                        zzvhVar2.add("");
                    } else {
                        int i33 = zzj15 + i32;
                        if (!zzyd.zzf(bArr, zzj15, i33)) {
                            throw zzvk.zzd();
                        }
                        zzvhVar2.add(new String(bArr, zzj15, i32, zzvi.zza));
                        zzj15 = i33;
                    }
                    while (zzj15 < i12) {
                        int zzj16 = zzsm.zzj(bArr, zzj15, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return zzj15;
                        }
                        zzj15 = zzsm.zzj(bArr, zzj16, zzslVar);
                        int i34 = zzslVar.zza;
                        if (i34 < 0) {
                            throw zzvk.zzf();
                        }
                        if (i34 == 0) {
                            zzvhVar2.add("");
                        } else {
                            int i35 = zzj15 + i34;
                            if (!zzyd.zzf(bArr, zzj15, i35)) {
                                throw zzvk.zzd();
                            }
                            zzvhVar2.add(new String(bArr, zzj15, i34, zzvi.zza));
                            zzj15 = i35;
                        }
                    }
                    return zzj15;
                }
                return i11;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i15 == 2) {
                    return zzsm.zze(zzF(i16), i13, bArr, i11, i12, zzvhVar2, zzslVar);
                }
                return i11;
            case 28:
                if (i15 == 2) {
                    int zzj17 = zzsm.zzj(bArr, i11, zzslVar);
                    int i36 = zzslVar.zza;
                    if (i36 < 0) {
                        throw zzvk.zzf();
                    }
                    if (i36 > bArr.length - zzj17) {
                        throw zzvk.zzj();
                    }
                    if (i36 == 0) {
                        zzvhVar2.add(zztd.zzb);
                    } else {
                        zzvhVar2.add(zztd.zzn(bArr, zzj17, i36));
                        zzj17 += i36;
                    }
                    while (zzj17 < i12) {
                        int zzj18 = zzsm.zzj(bArr, zzj17, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzsm.zzj(bArr, zzj18, zzslVar);
                        int i37 = zzslVar.zza;
                        if (i37 < 0) {
                            throw zzvk.zzf();
                        }
                        if (i37 > bArr.length - zzj17) {
                            throw zzvk.zzj();
                        }
                        if (i37 == 0) {
                            zzvhVar2.add(zztd.zzb);
                        } else {
                            zzvhVar2.add(zztd.zzn(bArr, zzj17, i37));
                            zzj17 += i37;
                        }
                    }
                    return zzj17;
                }
                return i11;
            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                if (i15 != 2) {
                    if (i15 == 0) {
                        zzl = zzsm.zzl(i13, bArr, i11, i12, zzvhVar2, zzslVar);
                    }
                    return i11;
                }
                zzl = zzsm.zzf(bArr, i11, zzvhVar2, zzslVar);
                zzuz zzuzVar = (zzuz) t2;
                zzxp zzxpVar = zzuzVar.zzc;
                if (zzxpVar == zzxp.zzc()) {
                    zzxpVar = null;
                }
                Object zzC = zzwz.zzC(i14, zzvhVar2, zzE(i16), zzxpVar, this.zzo);
                if (zzC == null) {
                    return zzl;
                }
                zzuzVar.zzc = (zzxp) zzC;
                return zzl;
            case 33:
            case 47:
                if (i15 == 2) {
                    zzva zzvaVar3 = (zzva) zzvhVar2;
                    int zzj19 = zzsm.zzj(bArr, i11, zzslVar);
                    int i38 = zzslVar.zza + zzj19;
                    while (zzj19 < i38) {
                        zzj19 = zzsm.zzj(bArr, zzj19, zzslVar);
                        zzvaVar3.zzh(zztj.zzs(zzslVar.zza));
                    }
                    if (zzj19 == i38) {
                        return zzj19;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 0) {
                    zzva zzvaVar4 = (zzva) zzvhVar2;
                    int zzj20 = zzsm.zzj(bArr, i11, zzslVar);
                    zzvaVar4.zzh(zztj.zzs(zzslVar.zza));
                    while (zzj20 < i12) {
                        int zzj21 = zzsm.zzj(bArr, zzj20, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzsm.zzj(bArr, zzj21, zzslVar);
                        zzvaVar4.zzh(zztj.zzs(zzslVar.zza));
                    }
                    return zzj20;
                }
                return i11;
            case 34:
            case 48:
                if (i15 == 2) {
                    zzvz zzvzVar5 = (zzvz) zzvhVar2;
                    int zzj22 = zzsm.zzj(bArr, i11, zzslVar);
                    int i39 = zzslVar.zza + zzj22;
                    while (zzj22 < i39) {
                        zzj22 = zzsm.zzm(bArr, zzj22, zzslVar);
                        zzvzVar5.zzf(zztj.zzt(zzslVar.zzb));
                    }
                    if (zzj22 == i39) {
                        return zzj22;
                    }
                    throw zzvk.zzj();
                }
                if (i15 == 0) {
                    zzvz zzvzVar6 = (zzvz) zzvhVar2;
                    int zzm3 = zzsm.zzm(bArr, i11, zzslVar);
                    zzvzVar6.zzf(zztj.zzt(zzslVar.zzb));
                    while (zzm3 < i12) {
                        int zzj23 = zzsm.zzj(bArr, zzm3, zzslVar);
                        if (i13 != zzslVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzsm.zzm(bArr, zzj23, zzslVar);
                        zzvzVar6.zzf(zztj.zzt(zzslVar.zzb));
                    }
                    return zzm3;
                }
                return i11;
            default:
                if (i15 == 3) {
                    zzwx zzF = zzF(i16);
                    int i41 = (i13 & (-8)) | 4;
                    int zzc = zzsm.zzc(zzF, bArr, i11, i12, i41, zzslVar);
                    zzwx zzwxVar = zzF;
                    zzsl zzslVar2 = zzslVar;
                    zzvhVar2.add(zzslVar2.zzc);
                    while (zzc < i12) {
                        int zzj24 = zzsm.zzj(bArr, zzc, zzslVar2);
                        if (i13 != zzslVar2.zza) {
                            return zzc;
                        }
                        zzwx zzwxVar2 = zzwxVar;
                        zzsl zzslVar3 = zzslVar2;
                        zzc = zzsm.zzc(zzwxVar2, bArr, zzj24, i12, i41, zzslVar3);
                        zzvhVar2.add(zzslVar3.zzc);
                        zzwxVar = zzwxVar2;
                        zzslVar2 = zzslVar3;
                    }
                    return zzc;
                }
                return i11;
        }
    }

    private final int zzx(int i11) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzA(i11, 0);
    }

    private final int zzy(int i11, int i12) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzA(i11, i12);
    }

    private final int zzz(int i11) {
        return this.zzc[i11 + 2];
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zza(T t2) {
        return this.zzj ? zzr(t2) : zzq(t2);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final int zzb(T t2) {
        int i11;
        int zzc;
        int i12;
        int zzc2;
        int length = this.zzc.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int zzC = zzC(i14);
            int i15 = this.zzc[i14];
            long j11 = 1048575 & zzC;
            int i16 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i11 = i13 * 53;
                    zzc = zzvi.zzc(Double.doubleToLongBits(zzxy.zza(t2, j11)));
                    i13 = zzc + i11;
                    break;
                case 1:
                    i11 = i13 * 53;
                    zzc = Float.floatToIntBits(zzxy.zzb(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 2:
                    i11 = i13 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 3:
                    i11 = i13 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 4:
                    i12 = i13 * 53;
                    zzc2 = zzxy.zzc(t2, j11);
                    i13 = i12 + zzc2;
                    break;
                case 5:
                    i11 = i13 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 6:
                    i12 = i13 * 53;
                    zzc2 = zzxy.zzc(t2, j11);
                    i13 = i12 + zzc2;
                    break;
                case 7:
                    i11 = i13 * 53;
                    zzc = zzvi.zza(zzxy.zzw(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    zzc = ((String) zzxy.zzf(t2, j11)).hashCode();
                    i13 = zzc + i11;
                    break;
                case 9:
                    Object zzf = zzxy.zzf(t2, j11);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
                    break;
                case 10:
                    i11 = i13 * 53;
                    zzc = zzxy.zzf(t2, j11).hashCode();
                    i13 = zzc + i11;
                    break;
                case 11:
                    i12 = i13 * 53;
                    zzc2 = zzxy.zzc(t2, j11);
                    i13 = i12 + zzc2;
                    break;
                case 12:
                    i12 = i13 * 53;
                    zzc2 = zzxy.zzc(t2, j11);
                    i13 = i12 + zzc2;
                    break;
                case 13:
                    i12 = i13 * 53;
                    zzc2 = zzxy.zzc(t2, j11);
                    i13 = i12 + zzc2;
                    break;
                case 14:
                    i11 = i13 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 15:
                    i12 = i13 * 53;
                    zzc2 = zzxy.zzc(t2, j11);
                    i13 = i12 + zzc2;
                    break;
                case 16:
                    i11 = i13 * 53;
                    zzc = zzvi.zzc(zzxy.zzd(t2, j11));
                    i13 = zzc + i11;
                    break;
                case 17:
                    Object zzf2 = zzxy.zzf(t2, j11);
                    if (zzf2 != null) {
                        i16 = zzf2.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    zzc = zzxy.zzf(t2, j11).hashCode();
                    i13 = zzc + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    zzc = zzxy.zzf(t2, j11).hashCode();
                    i13 = zzc + i11;
                    break;
                case 51:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zzc(Double.doubleToLongBits(zzo(t2, j11)));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = Float.floatToIntBits(zzp(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zzc(zzD(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zzc(zzD(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(t2, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzs(t2, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zzc(zzD(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(t2, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzs(t2, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zza(zzU(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = ((String) zzxy.zzf(t2, j11)).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzxy.zzf(t2, j11).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzxy.zzf(t2, j11).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(t2, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzs(t2, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(t2, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzs(t2, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzT(t2, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzs(t2, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zzc(zzD(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(t2, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzs(t2, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzvi.zzc(zzD(t2, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(t2, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzxy.zzf(t2, j11).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(t2).hashCode() + (i13 * 53);
        return this.zzh ? (hashCode * 53) + this.zzp.zzb(t2).zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x05f4, code lost:
    
        if (r11 == 1048575) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x05f6, code lost:
    
        r21.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x05fc, code lost:
    
        r0 = r8.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0600, code lost:
    
        if (r0 >= r8.zzm) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0602, code lost:
    
        r8.zzG(r9, r8.zzk[r0], null, r8.zzo);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x060f, code lost:
    
        if (r7 != 0) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0611, code lost:
    
        if (r4 != r3) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0618, code lost:
    
        throw com.google.android.gms.internal.gtm.zzvk.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x061d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0619, code lost:
    
        if (r4 > r3) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x061b, code lost:
    
        if (r6 != r7) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0622, code lost:
    
        throw com.google.android.gms.internal.gtm.zzvk.zzg();
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(T t2, byte[] bArr, int i11, int i12, int i13, zzsl zzslVar) throws IOException {
        int i14;
        T t11;
        Unsafe unsafe;
        zzwn<T> zzwnVar;
        int i15;
        int i16;
        int i17;
        int i18;
        Object valueOf;
        int ordinal;
        Object zze;
        int i19;
        int i21;
        int i22;
        zzsl zzslVar2;
        Unsafe unsafe2;
        int i23;
        Unsafe unsafe3;
        boolean z11;
        byte[] bArr2;
        int i24;
        int i25;
        byte[] bArr3;
        int i26;
        byte[] bArr4;
        int i27;
        byte[] bArr5;
        byte[] bArr6;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        zzwn<T> zzwnVar2 = this;
        T t12 = t2;
        byte[] bArr7 = bArr;
        int i37 = i12;
        zzsl zzslVar3 = zzslVar;
        Unsafe unsafe4 = zzb;
        int i38 = i11;
        int i39 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = -1;
        int i44 = 1048575;
        while (true) {
            if (i38 < i37) {
                int i45 = i38 + 1;
                int i46 = bArr7[i38];
                if (i46 < 0) {
                    i45 = zzsm.zzk(i46, bArr7, i45, zzslVar3);
                    i46 = zzslVar3.zza;
                }
                int i47 = i45;
                int i48 = i46;
                int i49 = i48 >>> 3;
                int i51 = i48 & 7;
                i42 = i49 > i43 ? zzwnVar2.zzy(i49, i42 / 3) : zzwnVar2.zzx(i49);
                boolean z12 = true;
                if (i42 == -1) {
                    i14 = i13;
                    t11 = t12;
                    i15 = i47;
                    unsafe = unsafe4;
                    i42 = 0;
                    zzwnVar = zzwnVar2;
                    i16 = i48;
                    i17 = i49;
                } else {
                    int i52 = zzwnVar2.zzc[i42 + 1];
                    int zzB = zzB(i52);
                    long j11 = i52 & 1048575;
                    if (zzB <= 17) {
                        int i53 = zzwnVar2.zzc[i42 + 2];
                        int i54 = 1 << (i53 >>> 20);
                        int i55 = i53 & 1048575;
                        if (i55 != i44) {
                            i19 = zzB;
                            if (i44 != 1048575) {
                                unsafe4.putInt(t12, i44, i41);
                            }
                            i44 = i55;
                            i41 = unsafe4.getInt(t12, i55);
                        } else {
                            i19 = zzB;
                        }
                        switch (i19) {
                            case 0:
                                bArr2 = bArr;
                                i21 = i47;
                                i22 = i48;
                                unsafe3 = unsafe4;
                                z11 = true;
                                i24 = i12;
                                zzslVar2 = zzslVar3;
                                i23 = i44;
                                if (i51 != 1) {
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    zzxy.zzo(t12, j11, Double.longBitsToDouble(zzsm.zzo(bArr2, i21)));
                                    i25 = i21 + 8;
                                    i41 |= i54;
                                    i37 = i24;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe3;
                                    i38 = i25;
                                    bArr7 = bArr2;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                i21 = i47;
                                i22 = i48;
                                unsafe3 = unsafe4;
                                i24 = i12;
                                zzslVar2 = zzslVar3;
                                i23 = i44;
                                if (i51 != 5) {
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    zzxy.zzp(t12, j11, Float.intBitsToFloat(zzsm.zzb(bArr2, i21)));
                                    i25 = i21 + 4;
                                    i41 |= i54;
                                    i37 = i24;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe3;
                                    i38 = i25;
                                    bArr7 = bArr2;
                                    break;
                                }
                            case 2:
                            case 3:
                                i21 = i47;
                                i22 = i48;
                                zzslVar2 = zzslVar3;
                                unsafe2 = unsafe4;
                                i23 = i44;
                                if (i51 != 0) {
                                    unsafe3 = unsafe2;
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    int zzm = zzsm.zzm(bArr, i21, zzslVar2);
                                    unsafe2.putLong(t2, j11, zzslVar2.zzb);
                                    t12 = t2;
                                    i41 |= i54;
                                    i37 = i12;
                                    bArr7 = bArr;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i39 = i22;
                                    unsafe4 = unsafe2;
                                    i38 = zzm;
                                    i43 = i49;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr3 = bArr;
                                i21 = i47;
                                i22 = i48;
                                zzslVar2 = zzslVar3;
                                unsafe2 = unsafe4;
                                i23 = i44;
                                i26 = i12;
                                if (i51 != 0) {
                                    unsafe3 = unsafe2;
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    int zzj = zzsm.zzj(bArr3, i21, zzslVar2);
                                    unsafe2.putInt(t12, j11, zzslVar2.zza);
                                    i41 |= i54;
                                    i38 = zzj;
                                    i37 = i26;
                                    bArr7 = bArr3;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 5:
                            case 14:
                                i23 = i44;
                                zzslVar2 = zzslVar3;
                                i22 = i48;
                                unsafe2 = unsafe4;
                                z11 = true;
                                i26 = i12;
                                if (i51 != 1) {
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    bArr3 = bArr;
                                    unsafe2.putLong(t2, j11, zzsm.zzo(bArr, i47));
                                    unsafe2 = unsafe2;
                                    t12 = t2;
                                    i38 = i47 + 8;
                                    i41 |= i54;
                                    i37 = i26;
                                    bArr7 = bArr3;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 6:
                            case 13:
                                i23 = i44;
                                zzslVar2 = zzslVar3;
                                i22 = i48;
                                unsafe2 = unsafe4;
                                bArr4 = bArr;
                                i27 = i12;
                                if (i51 != 5) {
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    unsafe2.putInt(t12, j11, zzsm.zzb(bArr4, i47));
                                    i38 = i47 + 4;
                                    i41 |= i54;
                                    bArr7 = bArr4;
                                    i37 = i27;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 7:
                                i23 = i44;
                                zzslVar2 = zzslVar3;
                                i22 = i48;
                                unsafe2 = unsafe4;
                                bArr4 = bArr;
                                i27 = i12;
                                if (i51 != 0) {
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    i38 = zzsm.zzm(bArr4, i47, zzslVar2);
                                    zzxy.zzm(t12, j11, zzslVar2.zzb != 0);
                                    i41 |= i54;
                                    bArr7 = bArr4;
                                    i37 = i27;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 8:
                                i23 = i44;
                                zzslVar2 = zzslVar3;
                                i22 = i48;
                                unsafe2 = unsafe4;
                                bArr4 = bArr;
                                i27 = i12;
                                if (i51 != 2) {
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    i38 = (536870912 & i52) == 0 ? zzsm.zzg(bArr4, i47, zzslVar2) : zzsm.zzh(bArr4, i47, zzslVar2);
                                    unsafe2.putObject(t12, j11, zzslVar2.zzc);
                                    i41 |= i54;
                                    bArr7 = bArr4;
                                    i37 = i27;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 9:
                                i23 = i44;
                                bArr5 = bArr;
                                zzslVar2 = zzslVar3;
                                i22 = i48;
                                unsafe2 = unsafe4;
                                i27 = i12;
                                if (i51 != 2) {
                                    z11 = true;
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    i38 = zzsm.zzd(zzwnVar2.zzF(i42), bArr5, i47, i27, zzslVar2);
                                    if ((i41 & i54) == 0) {
                                        unsafe2.putObject(t12, j11, zzslVar2.zzc);
                                    } else {
                                        unsafe2.putObject(t12, j11, zzvi.zzg(unsafe2.getObject(t12, j11), zzslVar2.zzc));
                                    }
                                    i41 |= i54;
                                    bArr7 = bArr5;
                                    i37 = i27;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 10:
                                i23 = i44;
                                bArr5 = bArr;
                                zzslVar2 = zzslVar3;
                                i22 = i48;
                                unsafe2 = unsafe4;
                                i27 = i12;
                                if (i51 != 2) {
                                    z11 = true;
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    i38 = zzsm.zza(bArr5, i47, zzslVar2);
                                    unsafe2.putObject(t12, j11, zzslVar2.zzc);
                                    i41 |= i54;
                                    bArr7 = bArr5;
                                    i37 = i27;
                                    i44 = i23;
                                    i39 = i22;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 12:
                                bArr6 = bArr;
                                i28 = i48;
                                zzslVar2 = zzslVar3;
                                unsafe2 = unsafe4;
                                i29 = i12;
                                if (i51 != 0) {
                                    i22 = i28;
                                    i23 = i44;
                                    z11 = true;
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    int zzj2 = zzsm.zzj(bArr6, i47, zzslVar2);
                                    int i56 = zzslVar2.zza;
                                    zzvd zzE = zzwnVar2.zzE(i42);
                                    if (zzE == null || zzE.zza(i56)) {
                                        i31 = zzj2;
                                        unsafe2.putInt(t12, j11, i56);
                                        i41 |= i54;
                                    } else {
                                        i31 = zzj2;
                                        zzd(t12).zzh(i28, Long.valueOf(i56));
                                    }
                                    i38 = i31;
                                    bArr7 = bArr6;
                                    i37 = i29;
                                    i39 = i28;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                                break;
                            case 15:
                                bArr6 = bArr;
                                i28 = i48;
                                zzslVar2 = zzslVar3;
                                unsafe2 = unsafe4;
                                i29 = i12;
                                if (i51 != 0) {
                                    i22 = i28;
                                    i23 = i44;
                                    z11 = true;
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    i38 = zzsm.zzj(bArr6, i47, zzslVar2);
                                    unsafe2.putInt(t12, j11, zztj.zzs(zzslVar2.zza));
                                    i41 |= i54;
                                    bArr7 = bArr6;
                                    i37 = i29;
                                    i39 = i28;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            case 16:
                                bArr6 = bArr;
                                zzsl zzslVar4 = zzslVar3;
                                i28 = i48;
                                if (i51 != 0) {
                                    zzslVar2 = zzslVar4;
                                    unsafe2 = unsafe4;
                                    i22 = i28;
                                    i23 = i44;
                                    z11 = true;
                                    i21 = i47;
                                    unsafe3 = unsafe2;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    int zzm2 = zzsm.zzm(bArr6, i47, zzslVar4);
                                    long zzt = zztj.zzt(zzslVar4.zzb);
                                    zzslVar2 = zzslVar4;
                                    T t13 = t12;
                                    Unsafe unsafe5 = unsafe4;
                                    unsafe5.putLong(t13, j11, zzt);
                                    unsafe2 = unsafe5;
                                    t12 = t13;
                                    i41 |= i54;
                                    bArr7 = bArr6;
                                    i37 = i12;
                                    i38 = zzm2;
                                    i39 = i28;
                                    i43 = i49;
                                    unsafe4 = unsafe2;
                                    zzslVar3 = zzslVar2;
                                    break;
                                }
                            default:
                                if (i51 != 3) {
                                    i21 = i47;
                                    zzslVar2 = zzslVar3;
                                    i22 = i48;
                                    unsafe3 = unsafe4;
                                    i23 = i44;
                                    z11 = true;
                                    zzwnVar = zzwnVar2;
                                    t11 = t12;
                                    z12 = z11;
                                    i15 = i21;
                                    zzslVar3 = zzslVar2;
                                    i44 = i23;
                                    i16 = i22;
                                    i17 = i49;
                                    i14 = i13;
                                    unsafe = unsafe3;
                                    break;
                                } else {
                                    zzsl zzslVar5 = zzslVar3;
                                    i38 = zzsm.zzc(zzwnVar2.zzF(i42), bArr, i47, i12, (i49 << 3) | 4, zzslVar5);
                                    if ((i41 & i54) == 0) {
                                        unsafe4.putObject(t12, j11, zzslVar5.zzc);
                                    } else {
                                        unsafe4.putObject(t12, j11, zzvi.zzg(unsafe4.getObject(t12, j11), zzslVar5.zzc));
                                    }
                                    i41 |= i54;
                                    i37 = i12;
                                    zzslVar3 = zzslVar5;
                                    bArr7 = bArr;
                                    i39 = i48;
                                    i43 = i49;
                                    break;
                                }
                        }
                    } else {
                        Unsafe unsafe6 = unsafe4;
                        zzsl zzslVar6 = zzslVar3;
                        if (zzB != 27) {
                            i32 = i47;
                            i16 = i48;
                            if (zzB <= 49) {
                                i33 = i44;
                                i34 = i41;
                                unsafe = unsafe6;
                                z12 = true;
                                int zzw = zzwnVar2.zzw(t2, bArr, i32, i12, i16, i49, i51, i42, i52, zzB, j11, zzslVar);
                                i16 = i16;
                                i36 = i49;
                                i35 = i42;
                                if (zzw != i32) {
                                    zzwnVar2 = this;
                                    t12 = t2;
                                    bArr7 = bArr;
                                    i37 = i12;
                                    zzslVar3 = zzslVar;
                                    i38 = zzw;
                                    i43 = i36;
                                    i39 = i16;
                                    i42 = i35;
                                    i44 = i33;
                                    i41 = i34;
                                    unsafe4 = unsafe;
                                } else {
                                    zzwnVar = this;
                                    zzslVar3 = zzslVar;
                                    i15 = zzw;
                                    i17 = i36;
                                    i42 = i35;
                                    i44 = i33;
                                    i41 = i34;
                                    t11 = t2;
                                    i14 = i13;
                                }
                            } else {
                                i33 = i44;
                                i34 = i41;
                                i35 = i42;
                                unsafe = unsafe6;
                                i36 = i49;
                                z12 = true;
                                if (zzB != 50) {
                                    i17 = i36;
                                    int zzu = zzu(t2, bArr, i32, i12, i16, i17, i51, i52, zzB, j11, i35, zzslVar);
                                    zzwnVar = this;
                                    t11 = t2;
                                    i16 = i16;
                                    zzslVar3 = zzslVar;
                                    if (zzu != i32) {
                                        bArr7 = bArr;
                                        i37 = i12;
                                        i38 = zzu;
                                        zzwnVar2 = zzwnVar;
                                        t12 = t11;
                                        i42 = i35;
                                        i44 = i33;
                                        i41 = i34;
                                        unsafe4 = unsafe;
                                        i43 = i17;
                                        i39 = i16;
                                    } else {
                                        i15 = zzu;
                                        i42 = i35;
                                        i44 = i33;
                                        i41 = i34;
                                        i14 = i13;
                                    }
                                } else if (i51 == 2) {
                                    int zzt2 = zzt(t2, bArr, i32, i12, i35, j11, zzslVar);
                                    if (zzt2 != i32) {
                                        zzwnVar2 = this;
                                        t12 = t2;
                                        bArr7 = bArr;
                                        i37 = i12;
                                        zzslVar3 = zzslVar;
                                        i38 = zzt2;
                                        i43 = i36;
                                        i39 = i16;
                                        i42 = i35;
                                        i44 = i33;
                                        i41 = i34;
                                        unsafe4 = unsafe;
                                    } else {
                                        zzwnVar = this;
                                        i14 = i13;
                                        zzslVar3 = zzslVar;
                                        i15 = zzt2;
                                        i17 = i36;
                                        i42 = i35;
                                        i44 = i33;
                                        i41 = i34;
                                        t11 = t2;
                                    }
                                }
                            }
                        } else if (i51 == 2) {
                            zzvh zzvhVar = (zzvh) unsafe6.getObject(t12, j11);
                            if (!zzvhVar.zzc()) {
                                int size = zzvhVar.size();
                                zzvhVar = zzvhVar.zzd(size == 0 ? 10 : size + size);
                                unsafe6.putObject(t12, j11, zzvhVar);
                            }
                            i38 = zzsm.zze(zzwnVar2.zzF(i42), i48, bArr, i47, i12, zzvhVar, zzslVar6);
                            t12 = t2;
                            bArr7 = bArr;
                            i37 = i12;
                            zzslVar3 = zzslVar;
                            i39 = i48;
                            unsafe4 = unsafe6;
                            i43 = i49;
                        } else {
                            i32 = i47;
                            i33 = i44;
                            i34 = i41;
                            i35 = i42;
                            i16 = i48;
                            i36 = i49;
                            z12 = true;
                            unsafe = unsafe6;
                        }
                        zzwnVar = this;
                        i14 = i13;
                        zzslVar3 = zzslVar;
                        i15 = i32;
                        i17 = i36;
                        i42 = i35;
                        i44 = i33;
                        i41 = i34;
                        t11 = t2;
                    }
                }
                if (i16 != i14 || i14 == 0) {
                    if (!zzwnVar.zzh || zzslVar3.zzd == zzuj.zza()) {
                        int i57 = i16;
                        i18 = i44;
                        i37 = i12;
                        i15 = zzsm.zzi(i57, bArr, i15, i37, zzd(t11), zzslVar3);
                        i16 = i57;
                    } else {
                        zzwk zzwkVar = zzwnVar.zzg;
                        zzxo<?, ?> zzxoVar = zzwnVar.zzo;
                        zzux zzc = zzslVar3.zzd.zzc(zzwkVar, i17);
                        if (zzc == null) {
                            i15 = zzsm.zzi(i16, bArr, i15, i12, zzd(t11), zzslVar3);
                            i37 = i12;
                            i18 = i44;
                        } else {
                            zzuv zzuvVar = (zzuv) t11;
                            zzuvVar.zzU();
                            zzuo<zzuw> zzuoVar = zzuvVar.zza;
                            int i58 = i16;
                            zzye zzyeVar = zzc.zzd.zzc;
                            i18 = i44;
                            if (zzyeVar != zzye.zzn) {
                                switch (zzyeVar.ordinal()) {
                                    case 0:
                                        valueOf = Double.valueOf(Double.longBitsToDouble(zzsm.zzo(bArr, i15)));
                                        i15 += 8;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if ((ordinal != 9 || ordinal == 10) && (zze = zzuoVar.zze(zzc.zzd)) != null) {
                                            valueOf = zzvi.zzg(zze, valueOf);
                                        }
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 1:
                                        valueOf = Float.valueOf(Float.intBitsToFloat(zzsm.zzb(bArr, i15)));
                                        i15 += 4;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                            break;
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 2:
                                    case 3:
                                        i15 = zzsm.zzm(bArr, i15, zzslVar3);
                                        valueOf = Long.valueOf(zzslVar3.zzb);
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 4:
                                    case 12:
                                        i15 = zzsm.zzj(bArr, i15, zzslVar3);
                                        valueOf = Integer.valueOf(zzslVar3.zza);
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 5:
                                    case 15:
                                        valueOf = Long.valueOf(zzsm.zzo(bArr, i15));
                                        i15 += 8;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 6:
                                    case 14:
                                        valueOf = Integer.valueOf(zzsm.zzb(bArr, i15));
                                        i15 += 4;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 7:
                                        i15 = zzsm.zzm(bArr, i15, zzslVar3);
                                        valueOf = Boolean.valueOf(zzslVar3.zzb != 0 ? z12 : false);
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 8:
                                        i15 = zzsm.zzg(bArr, i15, zzslVar3);
                                        valueOf = zzslVar3.zzc;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 9:
                                        i15 = zzsm.zzc(zzwt.zza().zzb(zzc.zzc.getClass()), bArr, i15, i12, (i17 << 3) | 4, zzslVar3);
                                        valueOf = zzslVar3.zzc;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                    case 10:
                                        i15 = zzsm.zzd(zzwt.zza().zzb(zzc.zzc.getClass()), bArr, i15, i12, zzslVar3);
                                        valueOf = zzslVar3.zzc;
                                        break;
                                    case 11:
                                        i15 = zzsm.zza(bArr, i15, zzslVar3);
                                        valueOf = zzslVar3.zzc;
                                        break;
                                    case 13:
                                        throw new IllegalStateException("Shouldn't reach here.");
                                    case 16:
                                        i15 = zzsm.zzj(bArr, i15, zzslVar3);
                                        valueOf = Integer.valueOf(zztj.zzs(zzslVar3.zza));
                                        break;
                                    case 17:
                                        i15 = zzsm.zzm(bArr, i15, zzslVar3);
                                        valueOf = Long.valueOf(zztj.zzt(zzslVar3.zzb));
                                        break;
                                    default:
                                        valueOf = null;
                                        zzc.zza();
                                        ordinal = zzc.zzd.zzc.ordinal();
                                        if (ordinal != 9) {
                                        }
                                        valueOf = zzvi.zzg(zze, valueOf);
                                        zzuoVar.zzi(zzc.zzd, valueOf);
                                        i16 = i58;
                                        i37 = i12;
                                        break;
                                }
                            } else {
                                i15 = zzsm.zzj(bArr, i15, zzslVar3);
                                zzvc<?> zzvcVar = zzc.zzd.zza;
                                if (zzyl.zzc(zzslVar3.zza) == null) {
                                    zzxp zzxpVar = zzuvVar.zzc;
                                    if (zzxpVar == zzxp.zzc()) {
                                        zzxpVar = zzxp.zze();
                                        zzuvVar.zzc = zzxpVar;
                                    }
                                    zzwz.zzD(i17, zzslVar3.zza, zzxpVar, zzxoVar);
                                    i16 = i58;
                                    i37 = i12;
                                } else {
                                    valueOf = Integer.valueOf(zzslVar3.zza);
                                }
                            }
                            zzc.zza();
                            ordinal = zzc.zzd.zzc.ordinal();
                            if (ordinal != 9) {
                            }
                            valueOf = zzvi.zzg(zze, valueOf);
                            zzuoVar.zzi(zzc.zzd, valueOf);
                            i16 = i58;
                            i37 = i12;
                        }
                    }
                    i38 = i15;
                    bArr7 = bArr;
                    zzslVar3 = zzslVar;
                    i43 = i17;
                    zzwnVar2 = zzwnVar;
                    t12 = t11;
                    i39 = i16;
                    i44 = i18;
                    unsafe4 = unsafe;
                } else {
                    i37 = i12;
                    i38 = i15;
                    i39 = i16;
                }
            } else {
                i14 = i13;
                t11 = t12;
                unsafe = unsafe4;
                zzwnVar = zzwnVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final T zze() {
        return (T) ((zzuz) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzf(T t2) {
        int i11;
        int i12 = this.zzl;
        while (true) {
            i11 = this.zzm;
            if (i12 >= i11) {
                break;
            }
            long zzC = zzC(this.zzk[i12]) & 1048575;
            Object zzf = zzxy.zzf(t2, zzC);
            if (zzf != null) {
                ((zzwe) zzf).zzc();
                zzxy.zzs(t2, zzC, zzf);
            }
            i12++;
        }
        int length = this.zzk.length;
        while (i11 < length) {
            this.zzn.zzb(t2, this.zzk[i11]);
            i11++;
        }
        this.zzo.zzm(t2);
        if (this.zzh) {
            this.zzp.zzf(t2);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzg(T t2, T t11) {
        t11.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzC = zzC(i11);
            long j11 = 1048575 & zzC;
            int i12 = this.zzc[i11];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(t11, i11)) {
                        zzxy.zzo(t2, j11, zzxy.zza(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(t11, i11)) {
                        zzxy.zzp(t2, j11, zzxy.zzb(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(t11, i11)) {
                        zzxy.zzr(t2, j11, zzxy.zzd(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(t11, i11)) {
                        zzxy.zzr(t2, j11, zzxy.zzd(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(t11, i11)) {
                        zzxy.zzq(t2, j11, zzxy.zzc(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(t11, i11)) {
                        zzxy.zzr(t2, j11, zzxy.zzd(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(t11, i11)) {
                        zzxy.zzq(t2, j11, zzxy.zzc(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(t11, i11)) {
                        zzxy.zzm(t2, j11, zzxy.zzw(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(t11, i11)) {
                        zzxy.zzs(t2, j11, zzxy.zzf(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(t2, t11, i11);
                    break;
                case 10:
                    if (zzQ(t11, i11)) {
                        zzxy.zzs(t2, j11, zzxy.zzf(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(t11, i11)) {
                        zzxy.zzq(t2, j11, zzxy.zzc(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(t11, i11)) {
                        zzxy.zzq(t2, j11, zzxy.zzc(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(t11, i11)) {
                        zzxy.zzq(t2, j11, zzxy.zzc(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(t11, i11)) {
                        zzxy.zzr(t2, j11, zzxy.zzd(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(t11, i11)) {
                        zzxy.zzq(t2, j11, zzxy.zzc(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(t11, i11)) {
                        zzxy.zzr(t2, j11, zzxy.zzd(t11, j11));
                        zzM(t2, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(t2, t11, i11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(t2, t11, j11);
                    break;
                case 50:
                    zzwz.zzI(this.zzr, t2, t11, j11);
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
                    if (zzT(t11, i12, i11)) {
                        zzxy.zzs(t2, j11, zzxy.zzf(t11, j11));
                        zzN(t2, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(t2, t11, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzT(t11, i12, i11)) {
                        zzxy.zzs(t2, j11, zzxy.zzf(t11, j11));
                        zzN(t2, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(t2, t11, i11);
                    break;
            }
        }
        zzwz.zzF(this.zzo, t2, t11);
        if (this.zzh) {
            zzwz.zzE(this.zzp, t2, t11);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzh(T t2, zzww zzwwVar, zzuj zzujVar) throws IOException {
        zzujVar.getClass();
        zzxo zzxoVar = this.zzo;
        zzuk<?> zzukVar = this.zzp;
        zzuo<?> zzuoVar = null;
        Object obj = null;
        while (true) {
            try {
                int zzc = zzwwVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzxy.zzo(t2, zzC & 1048575, zzwwVar.zza());
                                zzM(t2, zzx);
                                break;
                            case 1:
                                zzxy.zzp(t2, zzC & 1048575, zzwwVar.zzb());
                                zzM(t2, zzx);
                                break;
                            case 2:
                                zzxy.zzr(t2, zzC & 1048575, zzwwVar.zzl());
                                zzM(t2, zzx);
                                break;
                            case 3:
                                zzxy.zzr(t2, zzC & 1048575, zzwwVar.zzo());
                                zzM(t2, zzx);
                                break;
                            case 4:
                                zzxy.zzq(t2, zzC & 1048575, zzwwVar.zzg());
                                zzM(t2, zzx);
                                break;
                            case 5:
                                zzxy.zzr(t2, zzC & 1048575, zzwwVar.zzk());
                                zzM(t2, zzx);
                                break;
                            case 6:
                                zzxy.zzq(t2, zzC & 1048575, zzwwVar.zzf());
                                zzM(t2, zzx);
                                break;
                            case 7:
                                zzxy.zzm(t2, zzC & 1048575, zzwwVar.zzS());
                                zzM(t2, zzx);
                                break;
                            case 8:
                                zzL(t2, zzC, zzwwVar);
                                zzM(t2, zzx);
                                break;
                            case 9:
                                if (zzQ(t2, zzx)) {
                                    long j11 = zzC & 1048575;
                                    zzxy.zzs(t2, j11, zzvi.zzg(zzxy.zzf(t2, j11), zzwwVar.zzu(zzF(zzx), zzujVar)));
                                    break;
                                } else {
                                    zzxy.zzs(t2, zzC & 1048575, zzwwVar.zzu(zzF(zzx), zzujVar));
                                    zzM(t2, zzx);
                                    break;
                                }
                            case 10:
                                zzxy.zzs(t2, zzC & 1048575, zzwwVar.zzq());
                                zzM(t2, zzx);
                                break;
                            case 11:
                                zzxy.zzq(t2, zzC & 1048575, zzwwVar.zzj());
                                zzM(t2, zzx);
                                break;
                            case 12:
                                int zze = zzwwVar.zze();
                                zzvd zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj = zzwz.zzD(zzc, zze, obj, zzxoVar);
                                    break;
                                }
                                zzxy.zzq(t2, zzC & 1048575, zze);
                                zzM(t2, zzx);
                                break;
                            case 13:
                                zzxy.zzq(t2, zzC & 1048575, zzwwVar.zzh());
                                zzM(t2, zzx);
                                break;
                            case 14:
                                zzxy.zzr(t2, zzC & 1048575, zzwwVar.zzm());
                                zzM(t2, zzx);
                                break;
                            case 15:
                                zzxy.zzq(t2, zzC & 1048575, zzwwVar.zzi());
                                zzM(t2, zzx);
                                break;
                            case 16:
                                zzxy.zzr(t2, zzC & 1048575, zzwwVar.zzn());
                                zzM(t2, zzx);
                                break;
                            case 17:
                                if (zzQ(t2, zzx)) {
                                    long j12 = zzC & 1048575;
                                    zzxy.zzs(t2, j12, zzvi.zzg(zzxy.zzf(t2, j12), zzwwVar.zzs(zzF(zzx), zzujVar)));
                                    break;
                                } else {
                                    zzxy.zzs(t2, zzC & 1048575, zzwwVar.zzs(zzF(zzx), zzujVar));
                                    zzM(t2, zzx);
                                    break;
                                }
                            case 18:
                                zzwwVar.zzA(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 19:
                                zzwwVar.zzE(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 20:
                                zzwwVar.zzH(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 21:
                                zzwwVar.zzR(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 22:
                                zzwwVar.zzG(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 23:
                                zzwwVar.zzD(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 24:
                                zzwwVar.zzC(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                zzwwVar.zzy(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                                if (zzP(zzC)) {
                                    zzwwVar.zzP(this.zzn.zza(t2, zzC & 1048575));
                                    break;
                                } else {
                                    zzwwVar.zzN(this.zzn.zza(t2, zzC & 1048575));
                                    break;
                                }
                            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                zzwwVar.zzI(this.zzn.zza(t2, zzC & 1048575), zzF(zzx), zzujVar);
                                break;
                            case 28:
                                zzwwVar.zzz(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 29:
                                zzwwVar.zzQ(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                List<Integer> zza2 = this.zzn.zza(t2, zzC & 1048575);
                                zzwwVar.zzB(zza2);
                                obj = zzwz.zzC(zzc, zza2, zzE(zzx), obj, zzxoVar);
                                break;
                            case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                zzwwVar.zzJ(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 32:
                                zzwwVar.zzK(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 33:
                                zzwwVar.zzL(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 34:
                                zzwwVar.zzM(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                                zzwwVar.zzA(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                zzwwVar.zzE(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                zzwwVar.zzH(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 38:
                                zzwwVar.zzR(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                zzwwVar.zzG(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 40:
                                zzwwVar.zzD(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 41:
                                zzwwVar.zzC(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 42:
                                zzwwVar.zzy(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 43:
                                zzwwVar.zzQ(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                List<Integer> zza3 = this.zzn.zza(t2, zzC & 1048575);
                                zzwwVar.zzB(zza3);
                                obj = zzwz.zzC(zzc, zza3, zzE(zzx), obj, zzxoVar);
                                break;
                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                zzwwVar.zzJ(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 46:
                                zzwwVar.zzK(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 47:
                                zzwwVar.zzL(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 48:
                                zzwwVar.zzM(this.zzn.zza(t2, zzC & 1048575));
                                break;
                            case 49:
                                zzwwVar.zzF(this.zzn.zza(t2, zzC & 1048575), zzF(zzx), zzujVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzxy.zzf(t2, zzC2);
                                if (zzf == null) {
                                    zzf = zzwe.zza().zzb();
                                    zzxy.zzs(t2, zzC2, zzf);
                                } else if (zzwf.zzb(zzf)) {
                                    Object zzb2 = zzwe.zza().zzb();
                                    zzwf.zzc(zzb2, zzf);
                                    zzxy.zzs(t2, zzC2, zzb2);
                                    zzf = zzb2;
                                }
                                throw null;
                                break;
                            case 51:
                                zzxy.zzs(t2, zzC & 1048575, Double.valueOf(zzwwVar.zza()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 52:
                                zzxy.zzs(t2, zzC & 1048575, Float.valueOf(zzwwVar.zzb()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 53:
                                zzxy.zzs(t2, zzC & 1048575, Long.valueOf(zzwwVar.zzl()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 54:
                                zzxy.zzs(t2, zzC & 1048575, Long.valueOf(zzwwVar.zzo()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 55:
                                zzxy.zzs(t2, zzC & 1048575, Integer.valueOf(zzwwVar.zzg()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 56:
                                zzxy.zzs(t2, zzC & 1048575, Long.valueOf(zzwwVar.zzk()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 57:
                                zzxy.zzs(t2, zzC & 1048575, Integer.valueOf(zzwwVar.zzf()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 58:
                                zzxy.zzs(t2, zzC & 1048575, Boolean.valueOf(zzwwVar.zzS()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 59:
                                zzL(t2, zzC, zzwwVar);
                                zzN(t2, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(t2, zzc, zzx)) {
                                    long j13 = zzC & 1048575;
                                    zzxy.zzs(t2, j13, zzvi.zzg(zzxy.zzf(t2, j13), zzwwVar.zzu(zzF(zzx), zzujVar)));
                                } else {
                                    zzxy.zzs(t2, zzC & 1048575, zzwwVar.zzu(zzF(zzx), zzujVar));
                                    zzM(t2, zzx);
                                }
                                zzN(t2, zzc, zzx);
                                break;
                            case 61:
                                zzxy.zzs(t2, zzC & 1048575, zzwwVar.zzq());
                                zzN(t2, zzc, zzx);
                                break;
                            case 62:
                                zzxy.zzs(t2, zzC & 1048575, Integer.valueOf(zzwwVar.zzj()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzwwVar.zze();
                                zzvd zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj = zzwz.zzD(zzc, zze2, obj, zzxoVar);
                                    break;
                                }
                                zzxy.zzs(t2, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(t2, zzc, zzx);
                                break;
                            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                                zzxy.zzs(t2, zzC & 1048575, Integer.valueOf(zzwwVar.zzh()));
                                zzN(t2, zzc, zzx);
                                break;
                            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                                zzxy.zzs(t2, zzC & 1048575, Long.valueOf(zzwwVar.zzm()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 66:
                                zzxy.zzs(t2, zzC & 1048575, Integer.valueOf(zzwwVar.zzi()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 67:
                                zzxy.zzs(t2, zzC & 1048575, Long.valueOf(zzwwVar.zzn()));
                                zzN(t2, zzc, zzx);
                                break;
                            case 68:
                                zzxy.zzs(t2, zzC & 1048575, zzwwVar.zzs(zzF(zzx), zzujVar));
                                zzN(t2, zzc, zzx);
                                break;
                            default:
                                if (obj == null) {
                                    obj = zzxoVar.zzf();
                                }
                                if (!zzxoVar.zzp(obj, zzwwVar)) {
                                    for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                        zzG(t2, this.zzk[i11], obj, zzxoVar);
                                    }
                                    zzxoVar.zzn(t2, obj);
                                    return;
                                }
                                break;
                        }
                    } catch (zzvj unused) {
                        zzxoVar.zzq(zzwwVar);
                        if (obj == null) {
                            obj = zzxoVar.zzc(t2);
                        }
                        if (!zzxoVar.zzp(obj, zzwwVar)) {
                            for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                                zzG(t2, this.zzk[i12], obj, zzxoVar);
                            }
                            if (obj != null) {
                                zzxoVar.zzn(t2, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (zzc == Integer.MAX_VALUE) {
                        for (int i13 = this.zzl; i13 < this.zzm; i13++) {
                            zzG(t2, this.zzk[i13], obj, zzxoVar);
                        }
                        if (obj != null) {
                            zzxoVar.zzn(t2, obj);
                            return;
                        }
                        return;
                    }
                    Object zzd = !this.zzh ? null : zzukVar.zzd(zzujVar, this.zzg, zzc);
                    if (zzd != null) {
                        if (zzuoVar == null) {
                            zzuoVar = zzukVar.zzc(t2);
                        }
                        zzuj zzujVar2 = zzujVar;
                        zzuo<?> zzuoVar2 = zzuoVar;
                        zzww zzwwVar2 = zzwwVar;
                        obj = zzukVar.zze(zzwwVar2, zzd, zzujVar2, zzuoVar2, obj, zzxoVar);
                        zzwwVar = zzwwVar2;
                        zzujVar = zzujVar2;
                        zzuoVar = zzuoVar2;
                    } else {
                        zzxoVar.zzq(zzwwVar);
                        if (obj == null) {
                            obj = zzxoVar.zzc(t2);
                        }
                        if (!zzxoVar.zzp(obj, zzwwVar)) {
                            for (int i14 = this.zzl; i14 < this.zzm; i14++) {
                                zzG(t2, this.zzk[i14], obj, zzxoVar);
                            }
                            if (obj != null) {
                                zzxoVar.zzn(t2, obj);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                for (int i15 = this.zzl; i15 < this.zzm; i15++) {
                    zzG(t2, this.zzk[i15], obj, zzxoVar);
                }
                if (obj == null) {
                    throw th2;
                }
                zzxoVar.zzn(t2, obj);
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final void zzi(T t2, byte[] bArr, int i11, int i12, zzsl zzslVar) throws IOException {
        if (this.zzj) {
            zzv(t2, bArr, i11, i12, zzslVar);
        } else {
            zzc(t2, bArr, i11, i12, 0, zzslVar);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzj(T t2, T t11) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzC = zzC(i11);
            long j11 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(t2, t11, i11) && Double.doubleToLongBits(zzxy.zza(t2, j11)) == Double.doubleToLongBits(zzxy.zza(t11, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(t2, t11, i11) && Float.floatToIntBits(zzxy.zzb(t2, j11)) == Float.floatToIntBits(zzxy.zzb(t11, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(t2, t11, i11) && zzxy.zzd(t2, j11) == zzxy.zzd(t11, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(t2, t11, i11) && zzxy.zzd(t2, j11) == zzxy.zzd(t11, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(t2, t11, i11) && zzxy.zzc(t2, j11) == zzxy.zzc(t11, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(t2, t11, i11) && zzxy.zzd(t2, j11) == zzxy.zzd(t11, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(t2, t11, i11) && zzxy.zzc(t2, j11) == zzxy.zzc(t11, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(t2, t11, i11) && zzxy.zzw(t2, j11) == zzxy.zzw(t11, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(t2, t11, i11) && zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(t2, t11, i11) && zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(t2, t11, i11) && zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(t2, t11, i11) && zzxy.zzc(t2, j11) == zzxy.zzc(t11, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(t2, t11, i11) && zzxy.zzc(t2, j11) == zzxy.zzc(t11, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(t2, t11, i11) && zzxy.zzc(t2, j11) == zzxy.zzc(t11, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(t2, t11, i11) && zzxy.zzd(t2, j11) == zzxy.zzd(t11, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(t2, t11, i11) && zzxy.zzc(t2, j11) == zzxy.zzc(t11, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(t2, t11, i11) && zzxy.zzd(t2, j11) == zzxy.zzd(t11, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(t2, t11, i11) && zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                case 32:
                case 33:
                case 34:
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                case 38:
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                case 40:
                case 41:
                case 42:
                case 43:
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11));
                    break;
                case 50:
                    zzH = zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11));
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
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                case 68:
                    long zzz = zzz(i11) & 1048575;
                    if (zzxy.zzc(t2, zzz) == zzxy.zzc(t11, zzz) && zzwz.zzH(zzxy.zzf(t2, j11), zzxy.zzf(t11, j11))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (!this.zzo.zzd(t2).equals(this.zzo.zzd(t11))) {
            return false;
        }
        if (this.zzh) {
            return this.zzp.zzb(t2).equals(this.zzp.zzb(t11));
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.gtm.zzwx
    public final boolean zzk(T t2) {
        int i11;
        int i12;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.zzl) {
            int i16 = this.zzk[i14];
            int i17 = this.zzc[i16];
            int zzC = zzC(i16);
            int i18 = this.zzc[i16 + 2];
            int i19 = i18 & 1048575;
            int i21 = 1 << (i18 >>> 20);
            if (i19 != i13) {
                if (i19 != 1048575) {
                    i15 = zzb.getInt(t2, i19);
                }
                i12 = i15;
                i11 = i19;
            } else {
                i11 = i13;
                i12 = i15;
            }
            T t11 = t2;
            if ((268435456 & zzC) != 0 && !zzR(t11, i16, i11, i12, i21)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(t11, i17, i16) && !zzS(t11, zzC, zzF(i16))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzwe) zzxy.zzf(t11, zzC & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzxy.zzf(t11, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzwx zzF = zzF(i16);
                    for (int i22 = 0; i22 < list.size(); i22++) {
                        if (!zzF.zzk(list.get(i22))) {
                            return false;
                        }
                    }
                }
            } else if (zzR(t11, i16, i11, i12, i21) && !zzS(t11, zzC, zzF(i16))) {
                return false;
            }
            i14++;
            t2 = t11;
            i13 = i11;
            i15 = i12;
        }
        return !this.zzh || this.zzp.zzb(t2).zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0507  */
    @Override // com.google.android.gms.internal.gtm.zzwx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzn(T t2, zztp zztpVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i11;
        if (!this.zzj) {
            zzV(t2, zztpVar);
            return;
        }
        if (this.zzh) {
            zzuo<?> zzb2 = this.zzp.zzb(t2);
            if (!zzb2.zza.isEmpty()) {
                it = zzb2.zzf();
                entry = (Map.Entry) it.next();
                length = this.zzc.length;
                for (i11 = 0; i11 < length; i11 += 3) {
                    int zzC = zzC(i11);
                    int i12 = this.zzc[i11];
                    while (entry != null && this.zzp.zza(entry) <= i12) {
                        this.zzp.zzj(zztpVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    switch (zzB(zzC)) {
                        case 0:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzf(i12, zzxy.zza(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzo(i12, zzxy.zzb(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzt(i12, zzxy.zzd(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzK(i12, zzxy.zzd(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzr(i12, zzxy.zzc(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzm(i12, zzxy.zzd(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzk(i12, zzxy.zzc(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzb(i12, zzxy.zzw(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (zzQ(t2, i11)) {
                                zzX(i12, zzxy.zzf(t2, zzC & 1048575), zztpVar);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzv(i12, zzxy.zzf(t2, zzC & 1048575), zzF(i11));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzd(i12, (zztd) zzxy.zzf(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzI(i12, zzxy.zzc(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzi(i12, zzxy.zzc(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzx(i12, zzxy.zzc(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzz(i12, zzxy.zzd(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzB(i12, zzxy.zzc(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzD(i12, zzxy.zzd(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (zzQ(t2, i11)) {
                                zztpVar.zzq(i12, zzxy.zzf(t2, zzC & 1048575), zzF(i11));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            zzwz.zzL(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 19:
                            zzwz.zzP(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 20:
                            zzwz.zzS(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 21:
                            zzwz.zzaa(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 22:
                            zzwz.zzR(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 23:
                            zzwz.zzO(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 24:
                            zzwz.zzN(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                            zzwz.zzJ(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                            zzwz.zzY(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar);
                            break;
                        case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            zzwz.zzT(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, zzF(i11));
                            break;
                        case 28:
                            zzwz.zzK(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar);
                            break;
                        case 29:
                            zzwz.zzZ(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                            zzwz.zzM(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            zzwz.zzU(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 32:
                            zzwz.zzV(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 33:
                            zzwz.zzW(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case 34:
                            zzwz.zzX(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, false);
                            break;
                        case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            zzwz.zzL(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            zzwz.zzP(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            zzwz.zzS(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 38:
                            zzwz.zzaa(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            zzwz.zzR(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 40:
                            zzwz.zzO(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 41:
                            zzwz.zzN(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 42:
                            zzwz.zzJ(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 43:
                            zzwz.zzZ(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            zzwz.zzM(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            zzwz.zzU(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 46:
                            zzwz.zzV(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 47:
                            zzwz.zzW(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 48:
                            zzwz.zzX(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, true);
                            break;
                        case 49:
                            zzwz.zzQ(this.zzc[i11], (List) zzxy.zzf(t2, zzC & 1048575), zztpVar, zzF(i11));
                            break;
                        case 50:
                            zzW(zztpVar, i12, zzxy.zzf(t2, zzC & 1048575), i11);
                            break;
                        case 51:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzf(i12, zzo(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzo(i12, zzp(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzt(i12, zzD(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzK(i12, zzD(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzr(i12, zzs(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzm(i12, zzD(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzk(i12, zzs(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzb(i12, zzU(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (zzT(t2, i12, i11)) {
                                zzX(i12, zzxy.zzf(t2, zzC & 1048575), zztpVar);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzv(i12, zzxy.zzf(t2, zzC & 1048575), zzF(i11));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzd(i12, (zztd) zzxy.zzf(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzI(i12, zzs(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzi(i12, zzs(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzx(i12, zzs(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzz(i12, zzD(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzB(i12, zzs(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzD(i12, zzD(t2, zzC & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (zzT(t2, i12, i11)) {
                                zztpVar.zzq(i12, zzxy.zzf(t2, zzC & 1048575), zzF(i11));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry != null) {
                    this.zzp.zzj(zztpVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zzxo<?, ?> zzxoVar = this.zzo;
                zzxoVar.zzs(zzxoVar.zzd(t2), zztpVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzc.length;
        while (i11 < length) {
        }
        while (entry != null) {
        }
        zzxo<?, ?> zzxoVar2 = this.zzo;
        zzxoVar2.zzs(zzxoVar2.zzd(t2), zztpVar);
    }
}
