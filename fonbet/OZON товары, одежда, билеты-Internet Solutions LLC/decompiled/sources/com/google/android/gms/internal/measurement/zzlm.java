package com.google.android.gms.internal.measurement;

import B3.p;
import Lh.a;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import sun.misc.Unsafe;

/* loaded from: classes9.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i11, int i12, zzlj zzljVar, boolean z11, boolean z12, int[] iArr2, int i13, int i14, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i11;
        this.zzf = i12;
        this.zzi = z11;
        boolean z13 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z13 = true;
        }
        this.zzh = z13;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i11) {
        return (i11 >>> 20) & 255;
    }

    private final int zzB(int i11) {
        return this.zzc[i11 + 1];
    }

    private static long zzC(Object obj, long j11) {
        return ((Long) zzmv.zzf(obj, j11)).longValue();
    }

    private final zzkg zzD(int i11) {
        int i12 = i11 / 3;
        return (zzkg) this.zzd[i12 + i12 + 1];
    }

    private final zzlu zzE(int i11) {
        int i12 = i11 / 3;
        int i13 = i12 + i12;
        zzlu zzluVar = (zzlu) this.zzd[i13];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i13 + 1]);
        this.zzd[i13] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i11) {
        int i12 = i11 / 3;
        return this.zzd[i12 + i12];
    }

    private static Field zzG(Class cls, String str) {
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
            StringBuilder d11 = C3660k.d("Field ", str, " for ", name, " not found. Known fields are ");
            d11.append(arrays);
            throw new RuntimeException(d11.toString());
        }
    }

    private final void zzH(Object obj, Object obj2, int i11) {
        long zzB = zzB(i11) & 1048575;
        if (zzO(obj2, i11)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i11);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i11);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i11) {
        int zzB = zzB(i11);
        int i12 = this.zzc[i11];
        long j11 = zzB & 1048575;
        if (zzR(obj2, i12, i11)) {
            Object zzf = zzR(obj, i12, i11) ? zzmv.zzf(obj, j11) : null;
            Object zzf2 = zzmv.zzf(obj2, j11);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j11, zzkk.zzg(zzf, zzf2));
                zzK(obj, i12, i11);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j11, zzf2);
                zzK(obj, i12, i11);
            }
        }
    }

    private final void zzJ(Object obj, int i11) {
        int zzy = zzy(i11);
        long j11 = 1048575 & zzy;
        if (j11 == 1048575) {
            return;
        }
        zzmv.zzq(obj, j11, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j11));
    }

    private final void zzK(Object obj, int i11, int i12) {
        zzmv.zzq(obj, zzy(i12) & 1048575, i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i11;
        boolean z11;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int zzB = zzB(i14);
            int[] iArr = this.zzc;
            int i16 = iArr[i14];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i12;
                if (i18 != i13) {
                    i15 = unsafe.getInt(obj, i18);
                    i13 = i18;
                }
                i11 = 1 << (i17 >>> 20);
            } else {
                i11 = 0;
            }
            long j11 = zzB & i12;
            switch (zzA) {
                case 0:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzf(i16, zzmv.zza(obj, j11));
                        break;
                    }
                case 1:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzo(i16, zzmv.zzb(obj, j11));
                        break;
                    }
                case 2:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzt(i16, unsafe.getLong(obj, j11));
                        break;
                    }
                case 3:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzJ(i16, unsafe.getLong(obj, j11));
                        break;
                    }
                case 4:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzr(i16, unsafe.getInt(obj, j11));
                        break;
                    }
                case 5:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzm(i16, unsafe.getLong(obj, j11));
                        break;
                    }
                case 6:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzk(i16, unsafe.getInt(obj, j11));
                        break;
                    }
                case 7:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzb(i16, zzmv.zzw(obj, j11));
                        break;
                    }
                case 8:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzT(i16, unsafe.getObject(obj, j11), zzndVar);
                        break;
                    }
                case 9:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzv(i16, unsafe.getObject(obj, j11), zzE(i14));
                        break;
                    }
                case 10:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzd(i16, (zzjb) unsafe.getObject(obj, j11));
                        break;
                    }
                case 11:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzH(i16, unsafe.getInt(obj, j11));
                        break;
                    }
                case 12:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzi(i16, unsafe.getInt(obj, j11));
                        break;
                    }
                case 13:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzw(i16, unsafe.getInt(obj, j11));
                        break;
                    }
                case 14:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzy(i16, unsafe.getLong(obj, j11));
                        break;
                    }
                case 15:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzA(i16, unsafe.getInt(obj, j11));
                        break;
                    }
                case 16:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzC(i16, unsafe.getLong(obj, j11));
                        break;
                    }
                case 17:
                    if ((i15 & i11) == 0) {
                        break;
                    } else {
                        zzndVar.zzq(i16, unsafe.getObject(obj, j11), zzE(i14));
                        break;
                    }
                case 18:
                    zzlw.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzlw.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    zzlw.zzW(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    zzlw.zzR(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, zzE(i14));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar);
                    break;
                case 29:
                    z11 = false;
                    zzlw.zzX(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    z11 = false;
                    zzlw.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z11 = false;
                    zzlw.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 32:
                    z11 = false;
                    zzlw.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 33:
                    z11 = false;
                    zzlw.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case 34:
                    z11 = false;
                    zzlw.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, false);
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    zzlw.zzJ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzlw.zzN(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    zzlw.zzQ(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzlw.zzP(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzlw.zzK(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    zzlw.zzS(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(this.zzc[i14], (List) unsafe.getObject(obj, j11), zzndVar, zzE(i14));
                    break;
                case 50:
                    zzM(zzndVar, i16, unsafe.getObject(obj, j11), i14);
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzf(i16, zzn(obj, j11));
                    }
                    break;
                case 52:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzo(i16, zzo(obj, j11));
                    }
                    break;
                case 53:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzt(i16, zzC(obj, j11));
                    }
                    break;
                case 54:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzJ(i16, zzC(obj, j11));
                    }
                    break;
                case 55:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzr(i16, zzr(obj, j11));
                    }
                    break;
                case 56:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzm(i16, zzC(obj, j11));
                    }
                    break;
                case 57:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzk(i16, zzr(obj, j11));
                    }
                    break;
                case 58:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzb(i16, zzS(obj, j11));
                    }
                    break;
                case 59:
                    if (zzR(obj, i16, i14)) {
                        zzT(i16, unsafe.getObject(obj, j11), zzndVar);
                    }
                    break;
                case 60:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzv(i16, unsafe.getObject(obj, j11), zzE(i14));
                    }
                    break;
                case 61:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzd(i16, (zzjb) unsafe.getObject(obj, j11));
                    }
                    break;
                case 62:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzH(i16, zzr(obj, j11));
                    }
                    break;
                case 63:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzi(i16, zzr(obj, j11));
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzw(i16, zzr(obj, j11));
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzy(i16, zzC(obj, j11));
                    }
                    break;
                case 66:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzA(i16, zzr(obj, j11));
                    }
                    break;
                case 67:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzC(i16, zzC(obj, j11));
                    }
                    break;
                case 68:
                    if (zzR(obj, i16, i14)) {
                        zzndVar.zzq(i16, unsafe.getObject(obj, j11), zzE(i14));
                    }
                    break;
            }
            i14 += 3;
            i12 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i11, Object obj, int i12) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i11) {
        return zzO(obj, i11) == zzO(obj2, i11);
    }

    private final boolean zzO(Object obj, int i11) {
        int zzy = zzy(i11);
        long j11 = zzy & 1048575;
        if (j11 != 1048575) {
            return (zzmv.zzc(obj, j11) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i11);
        long j12 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j12)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j12)) != 0;
            case 2:
                return zzmv.zzd(obj, j12) != 0;
            case 3:
                return zzmv.zzd(obj, j12) != 0;
            case 4:
                return zzmv.zzc(obj, j12) != 0;
            case 5:
                return zzmv.zzd(obj, j12) != 0;
            case 6:
                return zzmv.zzc(obj, j12) != 0;
            case 7:
                return zzmv.zzw(obj, j12);
            case 8:
                Object zzf = zzmv.zzf(obj, j12);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j12) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j12));
            case 11:
                return zzmv.zzc(obj, j12) != 0;
            case 12:
                return zzmv.zzc(obj, j12) != 0;
            case 13:
                return zzmv.zzc(obj, j12) != 0;
            case 14:
                return zzmv.zzd(obj, j12) != 0;
            case 15:
                return zzmv.zzc(obj, j12) != 0;
            case 16:
                return zzmv.zzd(obj, j12) != 0;
            case 17:
                return zzmv.zzf(obj, j12) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i11, int i12, int i13, int i14) {
        return i12 == 1048575 ? zzO(obj, i11) : (i13 & i14) != 0;
    }

    private static boolean zzQ(Object obj, int i11, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i11 & 1048575));
    }

    private final boolean zzR(Object obj, int i11, int i12) {
        return zzmv.zzc(obj, (long) (zzy(i12) & 1048575)) == i11;
    }

    private static boolean zzS(Object obj, long j11) {
        return ((Boolean) zzmv.zzf(obj, j11)).booleanValue();
    }

    private static final void zzT(int i11, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i11, (String) obj);
        } else {
            zzndVar.zzd(i11, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zze = zzmm.zze();
        zzkcVar.zzc = zze;
        return zze;
    }

    static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
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
    static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
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
        Field zzG;
        char charAt13;
        int i35;
        int i36;
        Object obj;
        Field zzG2;
        Object obj2;
        Field zzG3;
        int i37;
        char charAt14;
        int i38;
        int i39;
        char charAt15;
        int i41;
        char charAt16;
        int i42;
        char charAt17;
        boolean z11 = zzltVar.zzc() == 2;
        String zzd = zzltVar.zzd();
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
        Object[] zze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
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
                        zzG2 = zzG(cls, (String) obj);
                        zze[i99] = zzG2;
                    } else {
                        zzG2 = (Field) obj;
                    }
                    i27 = charAt23;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzG2);
                    int i100 = i99 + 1;
                    obj2 = zze[i100];
                    if (obj2 instanceof Field) {
                        zzG3 = zzG(cls, (String) obj2);
                        zze[i100] = zzG3;
                    } else {
                        zzG3 = (Field) obj2;
                    }
                    i28 = (int) unsafe.objectFieldOffset(zzG3);
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzG2);
                int i1002 = i992 + 1;
                obj2 = zze[i1002];
                if (obj2 instanceof Field) {
                }
                i28 = (int) unsafe.objectFieldOffset(zzG3);
                i33 = objectFieldOffset22;
                i44 = i96;
                i32 = 0;
            } else {
                i27 = charAt23;
                int i101 = i12 + 1;
                Field zzG4 = zzG(cls, (String) zze[i12]);
                if (i88 == 9 || i88 == 17) {
                    int i102 = i77 / 3;
                    objArr[i102 + i102 + 1] = zzG4.getType();
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
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
                            zzG = (Field) obj3;
                        } else {
                            zzG = zzG(cls, (String) obj3);
                            zze[i112] = zzG;
                        }
                        i31 = charAt26 % 32;
                        int i113 = i34;
                        i28 = (int) unsafe.objectFieldOffset(zzG);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
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
        return new zzlm(iArr3, objArr, charAt, charAt2, zzltVar.zza(), z11, false, iArr, charAt4, i74, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j11) {
        return ((Double) zzmv.zzf(obj, j11)).doubleValue();
    }

    private static float zzo(Object obj, long j11) {
        return ((Float) zzmv.zzf(obj, j11)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i11;
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int i12;
        int zzu;
        boolean z11;
        int zzd;
        int zzA3;
        int zzB2;
        int zzA4;
        int zzv2;
        int i13;
        Unsafe unsafe = zzb;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (i16 < this.zzc.length) {
            int zzB3 = zzB(i16);
            int[] iArr = this.zzc;
            int i19 = iArr[i16];
            int zzA5 = zzA(zzB3);
            if (zzA5 <= 17) {
                int i21 = iArr[i16 + 2];
                int i22 = i21 & i14;
                i11 = 1 << (i21 >>> 20);
                if (i22 != i15) {
                    i18 = unsafe.getInt(obj, i22);
                    i15 = i22;
                }
            } else {
                i11 = 0;
            }
            long j11 = zzB3 & i14;
            switch (zzA5) {
                case 0:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 8, i17);
                        break;
                    }
                case 1:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 4, i17);
                        break;
                    }
                case 2:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j11);
                        zzA = zzjj.zzA(i19 << 3);
                        zzB = zzjj.zzB(j12);
                        i12 = zzB + zzA;
                        i17 += i12;
                        break;
                    }
                case 3:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j11);
                        zzA = zzjj.zzA(i19 << 3);
                        zzB = zzjj.zzB(j13);
                        i12 = zzB + zzA;
                        i17 += i12;
                        break;
                    }
                case 4:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j11);
                        zzA2 = zzjj.zzA(i19 << 3);
                        zzv = zzjj.zzv(i23);
                        i12 = zzv + zzA2;
                        i17 += i12;
                        break;
                    }
                case 5:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 8, i17);
                        break;
                    }
                case 6:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 4, i17);
                        break;
                    }
                case 7:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 1, i17);
                        break;
                    }
                case 8:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j11);
                        if (!(object instanceof zzjb)) {
                            zzA2 = zzjj.zzA(i19 << 3);
                            zzv = zzjj.zzy((String) object);
                            i12 = zzv + zzA2;
                            i17 += i12;
                            break;
                        } else {
                            int zzA6 = zzjj.zzA(i19 << 3);
                            int zzd2 = ((zzjb) object).zzd();
                            i17 = a.a(zzd2, zzd2, zzA6, i17);
                            break;
                        }
                    }
                case 9:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        zzo = zzlw.zzo(i19, unsafe.getObject(obj, j11), zzE(i16));
                        i17 += zzo;
                        break;
                    }
                case 10:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j11);
                        int zzA7 = zzjj.zzA(i19 << 3);
                        int zzd3 = zzjbVar.zzd();
                        i17 = a.a(zzd3, zzd3, zzA7, i17);
                        break;
                    }
                case 11:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(unsafe.getInt(obj, j11), zzjj.zzA(i19 << 3), i17);
                        break;
                    }
                case 12:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j11);
                        zzA2 = zzjj.zzA(i19 << 3);
                        zzv = zzjj.zzv(i24);
                        i12 = zzv + zzA2;
                        i17 += i12;
                        break;
                    }
                case 13:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 4, i17);
                        break;
                    }
                case 14:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i17 = p.a(i19 << 3, 8, i17);
                        break;
                    }
                case 15:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j11);
                        i17 = p.a((i25 >> 31) ^ (i25 + i25), zzjj.zzA(i19 << 3), i17);
                        break;
                    }
                case 16:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        long j14 = unsafe.getLong(obj, j11);
                        zzA = zzjj.zzA(i19 << 3);
                        zzB = zzjj.zzB((j14 >> 63) ^ (j14 + j14));
                        i12 = zzB + zzA;
                        i17 += i12;
                        break;
                    }
                case 17:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        zzo = zzjj.zzu(i19, (zzlj) unsafe.getObject(obj, j11), zzE(i16));
                        i17 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzo = zzlw.zza(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzo;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    zzu = zzlw.zzu(i19, (List) unsafe.getObject(obj, j11));
                    i17 += zzu;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    zzu = zzlw.zzp(i19, (List) unsafe.getObject(obj, j11), zzE(i16));
                    i17 += zzu;
                    break;
                case 28:
                    zzu = zzlw.zzc(i19, (List) unsafe.getObject(obj, j11));
                    i17 += zzu;
                    break;
                case 29:
                    zzu = zzlw.zzv(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzu;
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    z11 = false;
                    zzd = zzlw.zzd(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzd;
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z11 = false;
                    zzd = zzlw.zzf(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzd;
                    break;
                case 32:
                    z11 = false;
                    zzd = zzlw.zzh(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzd;
                    break;
                case 33:
                    z11 = false;
                    zzd = zzlw.zzq(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzd;
                    break;
                case 34:
                    z11 = false;
                    zzd = zzlw.zzs(i19, (List) unsafe.getObject(obj, j11), false);
                    i17 += zzd;
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int zzi = zzlw.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        i17 = a.a(zzi, zzjj.zzz(i19), zzi, i17);
                    }
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int zzg = zzlw.zzg((List) unsafe.getObject(obj, j11));
                    if (zzg > 0) {
                        i17 = a.a(zzg, zzjj.zzz(i19), zzg, i17);
                    }
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int zzn = zzlw.zzn((List) unsafe.getObject(obj, j11));
                    if (zzn > 0) {
                        i17 = a.a(zzn, zzjj.zzz(i19), zzn, i17);
                    }
                    break;
                case 38:
                    int zzy = zzlw.zzy((List) unsafe.getObject(obj, j11));
                    if (zzy > 0) {
                        i17 = a.a(zzy, zzjj.zzz(i19), zzy, i17);
                    }
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int zzl = zzlw.zzl((List) unsafe.getObject(obj, j11));
                    if (zzl > 0) {
                        i17 = a.a(zzl, zzjj.zzz(i19), zzl, i17);
                    }
                    break;
                case 40:
                    int zzi2 = zzlw.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi2 > 0) {
                        i17 = a.a(zzi2, zzjj.zzz(i19), zzi2, i17);
                    }
                    break;
                case 41:
                    int zzg2 = zzlw.zzg((List) unsafe.getObject(obj, j11));
                    if (zzg2 > 0) {
                        i17 = a.a(zzg2, zzjj.zzz(i19), zzg2, i17);
                    }
                    break;
                case 42:
                    int zzb2 = zzlw.zzb((List) unsafe.getObject(obj, j11));
                    if (zzb2 > 0) {
                        i17 = a.a(zzb2, zzjj.zzz(i19), zzb2, i17);
                    }
                    break;
                case 43:
                    int zzw = zzlw.zzw((List) unsafe.getObject(obj, j11));
                    if (zzw > 0) {
                        i17 = a.a(zzw, zzjj.zzz(i19), zzw, i17);
                    }
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int zze = zzlw.zze((List) unsafe.getObject(obj, j11));
                    if (zze > 0) {
                        i17 = a.a(zze, zzjj.zzz(i19), zze, i17);
                    }
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int zzg3 = zzlw.zzg((List) unsafe.getObject(obj, j11));
                    if (zzg3 > 0) {
                        i17 = a.a(zzg3, zzjj.zzz(i19), zzg3, i17);
                    }
                    break;
                case 46:
                    int zzi3 = zzlw.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi3 > 0) {
                        i17 = a.a(zzi3, zzjj.zzz(i19), zzi3, i17);
                    }
                    break;
                case 47:
                    int zzr = zzlw.zzr((List) unsafe.getObject(obj, j11));
                    if (zzr > 0) {
                        i17 = a.a(zzr, zzjj.zzz(i19), zzr, i17);
                    }
                    break;
                case 48:
                    int zzt = zzlw.zzt((List) unsafe.getObject(obj, j11));
                    if (zzt > 0) {
                        i17 = a.a(zzt, zzjj.zzz(i19), zzt, i17);
                    }
                    break;
                case 49:
                    zzu = zzlw.zzj(i19, (List) unsafe.getObject(obj, j11), zzE(i16));
                    i17 += zzu;
                    break;
                case 50:
                    zzle.zza(i19, unsafe.getObject(obj, j11), zzF(i16));
                    break;
                case 51:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 8, i17);
                    }
                    break;
                case 52:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 4, i17);
                    }
                    break;
                case 53:
                    if (zzR(obj, i19, i16)) {
                        long zzC = zzC(obj, j11);
                        zzA3 = zzjj.zzA(i19 << 3);
                        zzB2 = zzjj.zzB(zzC);
                        i13 = zzB2 + zzA3;
                        i17 += i13;
                    }
                    break;
                case 54:
                    if (zzR(obj, i19, i16)) {
                        long zzC2 = zzC(obj, j11);
                        zzA3 = zzjj.zzA(i19 << 3);
                        zzB2 = zzjj.zzB(zzC2);
                        i13 = zzB2 + zzA3;
                        i17 += i13;
                    }
                    break;
                case 55:
                    if (zzR(obj, i19, i16)) {
                        int zzr2 = zzr(obj, j11);
                        zzA4 = zzjj.zzA(i19 << 3);
                        zzv2 = zzjj.zzv(zzr2);
                        i13 = zzv2 + zzA4;
                        i17 += i13;
                    }
                    break;
                case 56:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 8, i17);
                    }
                    break;
                case 57:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 4, i17);
                    }
                    break;
                case 58:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 1, i17);
                    }
                    break;
                case 59:
                    if (zzR(obj, i19, i16)) {
                        Object object2 = unsafe.getObject(obj, j11);
                        if (object2 instanceof zzjb) {
                            int zzA8 = zzjj.zzA(i19 << 3);
                            int zzd4 = ((zzjb) object2).zzd();
                            i17 = a.a(zzd4, zzd4, zzA8, i17);
                        } else {
                            zzA4 = zzjj.zzA(i19 << 3);
                            zzv2 = zzjj.zzy((String) object2);
                            i13 = zzv2 + zzA4;
                            i17 += i13;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i19, i16)) {
                        zzu = zzlw.zzo(i19, unsafe.getObject(obj, j11), zzE(i16));
                        i17 += zzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i19, i16)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j11);
                        int zzA9 = zzjj.zzA(i19 << 3);
                        int zzd5 = zzjbVar2.zzd();
                        i17 = a.a(zzd5, zzd5, zzA9, i17);
                    }
                    break;
                case 62:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(zzr(obj, j11), zzjj.zzA(i19 << 3), i17);
                    }
                    break;
                case 63:
                    if (zzR(obj, i19, i16)) {
                        int zzr3 = zzr(obj, j11);
                        zzA4 = zzjj.zzA(i19 << 3);
                        zzv2 = zzjj.zzv(zzr3);
                        i13 = zzv2 + zzA4;
                        i17 += i13;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 4, i17);
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i19, i16)) {
                        i17 = p.a(i19 << 3, 8, i17);
                    }
                    break;
                case 66:
                    if (zzR(obj, i19, i16)) {
                        int zzr4 = zzr(obj, j11);
                        i17 = p.a((zzr4 >> 31) ^ (zzr4 + zzr4), zzjj.zzA(i19 << 3), i17);
                    }
                    break;
                case 67:
                    if (zzR(obj, i19, i16)) {
                        long zzC3 = zzC(obj, j11);
                        zzA3 = zzjj.zzA(i19 << 3);
                        zzB2 = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i13 = zzB2 + zzA3;
                        i17 += i13;
                    }
                    break;
                case 68:
                    if (zzR(obj, i19, i16)) {
                        zzu = zzjj.zzu(i19, (zzlj) unsafe.getObject(obj, j11), zzE(i16));
                        i17 += zzu;
                    }
                    break;
            }
            i16 += 3;
            i14 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i17 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return zza2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int i11;
        Unsafe unsafe = zzb;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzB2 = zzB(i13);
            int zzA3 = zzA(zzB2);
            int i14 = this.zzc[i13];
            long j11 = zzB2 & 1048575;
            if (zzA3 >= zzju.zzJ.zza() && zzA3 <= zzju.zzW.zza()) {
                int i15 = this.zzc[i13 + 2];
            }
            switch (zzA3) {
                case 0:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i13)) {
                        long zzd = zzmv.zzd(obj, j11);
                        zzA = zzjj.zzA(i14 << 3);
                        zzB = zzjj.zzB(zzd);
                        i11 = zzB + zzA;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i13)) {
                        long zzd2 = zzmv.zzd(obj, j11);
                        zzA = zzjj.zzA(i14 << 3);
                        zzB = zzjj.zzB(zzd2);
                        i11 = zzB + zzA;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i13)) {
                        int zzc = zzmv.zzc(obj, j11);
                        zzA2 = zzjj.zzA(i14 << 3);
                        zzv = zzjj.zzv(zzc);
                        i11 = zzv + zzA2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i13)) {
                        Object zzf = zzmv.zzf(obj, j11);
                        if (zzf instanceof zzjb) {
                            int zzA4 = zzjj.zzA(i14 << 3);
                            int zzd3 = ((zzjb) zzf).zzd();
                            i12 = a.a(zzd3, zzd3, zzA4, i12);
                            break;
                        } else {
                            zzA2 = zzjj.zzA(i14 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            i11 = zzv + zzA2;
                            i12 += i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i13)) {
                        zzo = zzlw.zzo(i14, zzmv.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i13)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j11);
                        int zzA5 = zzjj.zzA(i14 << 3);
                        int zzd4 = zzjbVar.zzd();
                        i12 = a.a(zzd4, zzd4, zzA5, i12);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i13)) {
                        i12 = p.a(zzmv.zzc(obj, j11), zzjj.zzA(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i13)) {
                        int zzc2 = zzmv.zzc(obj, j11);
                        zzA2 = zzjj.zzA(i14 << 3);
                        zzv = zzjj.zzv(zzc2);
                        i11 = zzv + zzA2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i13)) {
                        i12 = p.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i13)) {
                        int zzc3 = zzmv.zzc(obj, j11);
                        i12 = p.a((zzc3 >> 31) ^ (zzc3 + zzc3), zzjj.zzA(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i13)) {
                        long zzd5 = zzmv.zzd(obj, j11);
                        zzA = zzjj.zzA(i14 << 3);
                        zzB = zzjj.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        i11 = zzB + zzA;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i13)) {
                        zzo = zzjj.zzu(i14, (zzlj) zzmv.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzo = zzlw.zza(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    zzo = zzlw.zzu(i14, (List) zzmv.zzf(obj, j11));
                    i12 += zzo;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    zzo = zzlw.zzp(i14, (List) zzmv.zzf(obj, j11), zzE(i13));
                    i12 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i14, (List) zzmv.zzf(obj, j11));
                    i12 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    zzo = zzlw.zzd(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzo = zzlw.zzf(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i14, (List) zzmv.zzf(obj, j11), false);
                    i12 += zzo;
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    int zzi = zzlw.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi > 0) {
                        i12 = a.a(zzi, zzjj.zzz(i14), zzi, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    int zzg = zzlw.zzg((List) unsafe.getObject(obj, j11));
                    if (zzg > 0) {
                        i12 = a.a(zzg, zzjj.zzz(i14), zzg, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    int zzn = zzlw.zzn((List) unsafe.getObject(obj, j11));
                    if (zzn > 0) {
                        i12 = a.a(zzn, zzjj.zzz(i14), zzn, i12);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzlw.zzy((List) unsafe.getObject(obj, j11));
                    if (zzy > 0) {
                        i12 = a.a(zzy, zzjj.zzz(i14), zzy, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    int zzl = zzlw.zzl((List) unsafe.getObject(obj, j11));
                    if (zzl > 0) {
                        i12 = a.a(zzl, zzjj.zzz(i14), zzl, i12);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzlw.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi2 > 0) {
                        i12 = a.a(zzi2, zzjj.zzz(i14), zzi2, i12);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzlw.zzg((List) unsafe.getObject(obj, j11));
                    if (zzg2 > 0) {
                        i12 = a.a(zzg2, zzjj.zzz(i14), zzg2, i12);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzlw.zzb((List) unsafe.getObject(obj, j11));
                    if (zzb2 > 0) {
                        i12 = a.a(zzb2, zzjj.zzz(i14), zzb2, i12);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzlw.zzw((List) unsafe.getObject(obj, j11));
                    if (zzw > 0) {
                        i12 = a.a(zzw, zzjj.zzz(i14), zzw, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    int zze = zzlw.zze((List) unsafe.getObject(obj, j11));
                    if (zze > 0) {
                        i12 = a.a(zze, zzjj.zzz(i14), zze, i12);
                        break;
                    } else {
                        break;
                    }
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    int zzg3 = zzlw.zzg((List) unsafe.getObject(obj, j11));
                    if (zzg3 > 0) {
                        i12 = a.a(zzg3, zzjj.zzz(i14), zzg3, i12);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzlw.zzi((List) unsafe.getObject(obj, j11));
                    if (zzi3 > 0) {
                        i12 = a.a(zzi3, zzjj.zzz(i14), zzi3, i12);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzlw.zzr((List) unsafe.getObject(obj, j11));
                    if (zzr > 0) {
                        i12 = a.a(zzr, zzjj.zzz(i14), zzr, i12);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzlw.zzt((List) unsafe.getObject(obj, j11));
                    if (zzt > 0) {
                        i12 = a.a(zzt, zzjj.zzz(i14), zzt, i12);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i14, (List) zzmv.zzf(obj, j11), zzE(i13));
                    i12 += zzo;
                    break;
                case 50:
                    zzle.zza(i14, zzmv.zzf(obj, j11), zzF(i13));
                    break;
                case 51:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i14, i13)) {
                        long zzC = zzC(obj, j11);
                        zzA = zzjj.zzA(i14 << 3);
                        zzB = zzjj.zzB(zzC);
                        i11 = zzB + zzA;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i14, i13)) {
                        long zzC2 = zzC(obj, j11);
                        zzA = zzjj.zzA(i14 << 3);
                        zzB = zzjj.zzB(zzC2);
                        i11 = zzB + zzA;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i14, i13)) {
                        int zzr2 = zzr(obj, j11);
                        zzA2 = zzjj.zzA(i14 << 3);
                        zzv = zzjj.zzv(zzr2);
                        i11 = zzv + zzA2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 1, i12);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i14, i13)) {
                        Object zzf2 = zzmv.zzf(obj, j11);
                        if (zzf2 instanceof zzjb) {
                            int zzA6 = zzjj.zzA(i14 << 3);
                            int zzd6 = ((zzjb) zzf2).zzd();
                            i12 = a.a(zzd6, zzd6, zzA6, i12);
                            break;
                        } else {
                            zzA2 = zzjj.zzA(i14 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            i11 = zzv + zzA2;
                            i12 += i11;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i14, i13)) {
                        zzo = zzlw.zzo(i14, zzmv.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i14, i13)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j11);
                        int zzA7 = zzjj.zzA(i14 << 3);
                        int zzd7 = zzjbVar2.zzd();
                        i12 = a.a(zzd7, zzd7, zzA7, i12);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(zzr(obj, j11), zzjj.zzA(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i14, i13)) {
                        int zzr3 = zzr(obj, j11);
                        zzA2 = zzjj.zzA(i14 << 3);
                        zzv = zzjj.zzv(zzr3);
                        i11 = zzv + zzA2;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 4, i12);
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i14, i13)) {
                        i12 = p.a(i14 << 3, 8, i12);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i14, i13)) {
                        int zzr4 = zzr(obj, j11);
                        i12 = p.a((zzr4 >> 31) ^ (zzr4 + zzr4), zzjj.zzA(i14 << 3), i12);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i14, i13)) {
                        long zzC3 = zzC(obj, j11);
                        zzA = zzjj.zzA(i14 << 3);
                        zzB = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i11 = zzB + zzA;
                        i12 += i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i14, i13)) {
                        zzo = zzjj.zzu(i14, (zzlj) zzmv.zzf(obj, j11), zzE(i13));
                        i12 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i12 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j11) {
        return ((Integer) zzmv.zzf(obj, j11)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i11, int i12, int i13, long j11, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i13);
        Object object = unsafe.getObject(obj, j11);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j11, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, int i18, zzio zzioVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j12 = this.zzc[i18 + 2] & 1048575;
        switch (i17) {
            case 51:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(obj, j11, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i11))));
                unsafe.putInt(obj, j12, i14);
                return i11 + 8;
            case 52:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(obj, j11, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i11))));
                unsafe.putInt(obj, j12, i14);
                return i11 + 4;
            case 53:
            case 54:
                if (i15 != 0) {
                    return i11;
                }
                int zzm = zzip.zzm(bArr, i11, zzioVar);
                unsafe.putObject(obj, j11, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j12, i14);
                return zzm;
            case 55:
            case 62:
                if (i15 != 0) {
                    return i11;
                }
                int zzj = zzip.zzj(bArr, i11, zzioVar);
                unsafe.putObject(obj, j11, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j12, i14);
                return zzj;
            case 56:
            case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                if (i15 != 1) {
                    return i11;
                }
                unsafe.putObject(obj, j11, Long.valueOf(zzip.zzn(bArr, i11)));
                unsafe.putInt(obj, j12, i14);
                return i11 + 8;
            case 57:
            case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                if (i15 != 5) {
                    return i11;
                }
                unsafe.putObject(obj, j11, Integer.valueOf(zzip.zzb(bArr, i11)));
                unsafe.putInt(obj, j12, i14);
                return i11 + 4;
            case 58:
                if (i15 != 0) {
                    return i11;
                }
                int zzm2 = zzip.zzm(bArr, i11, zzioVar);
                unsafe.putObject(obj, j11, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j12, i14);
                return zzm2;
            case 59:
                if (i15 != 2) {
                    return i11;
                }
                int zzj2 = zzip.zzj(bArr, i11, zzioVar);
                int i19 = zzioVar.zza;
                if (i19 == 0) {
                    unsafe.putObject(obj, j11, "");
                } else {
                    if ((i16 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i19)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j11, new String(bArr, zzj2, i19, zzkk.zzb));
                    zzj2 += i19;
                }
                unsafe.putInt(obj, j12, i14);
                return zzj2;
            case 60:
                if (i15 != 2) {
                    return i11;
                }
                int zzd = zzip.zzd(zzE(i18), bArr, i11, i12, zzioVar);
                object = unsafe.getInt(obj, j12) == i14 ? unsafe.getObject(obj, j11) : null;
                if (object == null) {
                    unsafe.putObject(obj, j11, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j11, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j12, i14);
                return zzd;
            case 61:
                if (i15 != 2) {
                    return i11;
                }
                int zza2 = zzip.zza(bArr, i11, zzioVar);
                unsafe.putObject(obj, j11, zzioVar.zzc);
                unsafe.putInt(obj, j12, i14);
                return zza2;
            case 63:
                if (i15 != 0) {
                    return i11;
                }
                int zzj3 = zzip.zzj(bArr, i11, zzioVar);
                int i21 = zzioVar.zza;
                zzkg zzD = zzD(i18);
                if (zzD != null && !zzD.zza(i21)) {
                    zzd(obj).zzh(i13, Long.valueOf(i21));
                    return zzj3;
                }
                unsafe.putObject(obj, j11, Integer.valueOf(i21));
                unsafe.putInt(obj, j12, i14);
                return zzj3;
            case 66:
                if (i15 != 0) {
                    return i11;
                }
                int zzj4 = zzip.zzj(bArr, i11, zzioVar);
                unsafe.putObject(obj, j11, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j12, i14);
                return zzj4;
            case 67:
                if (i15 != 0) {
                    return i11;
                }
                int zzm3 = zzip.zzm(bArr, i11, zzioVar);
                unsafe.putObject(obj, j11, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j12, i14);
                return zzm3;
            case 68:
                if (i15 == 3) {
                    int zzc = zzip.zzc(zzE(i18), bArr, i11, i12, (i13 & (-8)) | 4, zzioVar);
                    object = unsafe.getInt(obj, j12) == i14 ? unsafe.getObject(obj, j11) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j11, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j11, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j12, i14);
                    return zzc;
                }
                break;
        }
        return i11;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i11, int i12, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i13;
        int i14;
        int i15;
        int i16;
        Object obj2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        zzlm<T> zzlmVar = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int i24 = i12;
        zzio zzioVar2 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i25 = -1;
        int i26 = i11;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i31 = 1048575;
        while (i26 < i24) {
            int i32 = i26 + 1;
            int i33 = bArr2[i26];
            if (i33 < 0) {
                i32 = zzip.zzk(i33, bArr2, i32, zzioVar2);
                i33 = zzioVar2.zza;
            }
            int i34 = i32;
            int i35 = i33 >>> 3;
            int i36 = i33 & 7;
            int zzx = i35 > i27 ? zzlmVar.zzx(i35, i28 / 3) : zzlmVar.zzw(i35);
            if (zzx == i25) {
                unsafe = unsafe2;
                i13 = i33;
                i14 = i25;
                i15 = i35;
                i16 = 0;
                obj2 = obj3;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i37 = iArr[zzx + 1];
                int zzA = zzA(i37);
                int i38 = i33;
                int i39 = zzx;
                long j11 = i37 & 1048575;
                if (zzA <= 17) {
                    int i41 = iArr[i39 + 2];
                    int i42 = 1 << (i41 >>> 20);
                    int i43 = i41 & 1048575;
                    if (i43 != i31) {
                        int i44 = 1048575;
                        if (i31 != 1048575) {
                            unsafe2.putInt(obj3, i31, i29);
                            i44 = 1048575;
                        }
                        if (i43 != i44) {
                            i29 = unsafe2.getInt(obj3, i43);
                        }
                        i31 = i43;
                    }
                    switch (zzA) {
                        case 0:
                            i23 = i39;
                            if (i36 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                zzmv.zzo(obj3, j11, Double.longBitsToDouble(zzip.zzn(bArr2, i34)));
                                i26 = i34 + 8;
                                i29 |= i42;
                                i24 = i12;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 1:
                            i23 = i39;
                            if (i36 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                zzmv.zzp(obj3, j11, Float.intBitsToFloat(zzip.zzb(bArr2, i34)));
                                i26 = i34 + 4;
                                i29 |= i42;
                                i24 = i12;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            i23 = i39;
                            if (i36 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                int zzm = zzip.zzm(bArr2, i34, zzioVar2);
                                Unsafe unsafe3 = unsafe2;
                                Object obj4 = obj3;
                                unsafe3.putLong(obj4, j11, zzioVar2.zzb);
                                unsafe2 = unsafe3;
                                obj3 = obj4;
                                i29 |= i42;
                                i26 = zzm;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                i24 = i12;
                                break;
                            }
                        case 4:
                        case 11:
                            i23 = i39;
                            if (i36 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                int zzj = zzip.zzj(bArr2, i34, zzioVar2);
                                unsafe2.putInt(obj3, j11, zzioVar2.zza);
                                i29 |= i42;
                                i24 = i12;
                                i26 = zzj;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            i23 = i39;
                            if (i36 != 1) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj5 = obj3;
                                unsafe4.putLong(obj5, j11, zzip.zzn(bArr2, i34));
                                unsafe2 = unsafe4;
                                obj3 = obj5;
                                i26 = i34 + 8;
                                i29 |= i42;
                                i24 = i12;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            i23 = i39;
                            if (i36 != 5) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j11, zzip.zzb(bArr2, i34));
                                i26 = i34 + 4;
                                i29 |= i42;
                                i24 = i12;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 7:
                            i23 = i39;
                            if (i36 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                i26 = zzip.zzm(bArr2, i34, zzioVar2);
                                zzmv.zzm(obj3, j11, zzioVar2.zzb != 0);
                                i29 |= i42;
                                i24 = i12;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 8:
                            i23 = i39;
                            if (i36 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                i26 = (536870912 & i37) == 0 ? zzip.zzg(bArr2, i34, zzioVar2) : zzip.zzh(bArr2, i34, zzioVar2);
                                unsafe2.putObject(obj3, j11, zzioVar2.zzc);
                                i29 |= i42;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 9:
                            i23 = i39;
                            if (i36 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                i26 = zzip.zzd(zzlmVar.zzE(i23), bArr2, i34, i24, zzioVar2);
                                Object object = unsafe2.getObject(obj3, j11);
                                if (object == null) {
                                    unsafe2.putObject(obj3, j11, zzioVar2.zzc);
                                } else {
                                    unsafe2.putObject(obj3, j11, zzkk.zzg(object, zzioVar2.zzc));
                                }
                                i29 |= i42;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 10:
                            i23 = i39;
                            if (i36 != 2) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                i26 = zzip.zza(bArr2, i34, zzioVar2);
                                unsafe2.putObject(obj3, j11, zzioVar2.zzc);
                                i29 |= i42;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 12:
                            i23 = i39;
                            if (i36 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                i26 = zzip.zzj(bArr2, i34, zzioVar2);
                                unsafe2.putInt(obj3, j11, zzioVar2.zza);
                                i29 |= i42;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 15:
                            i23 = i39;
                            if (i36 != 0) {
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                i26 = zzip.zzj(bArr2, i34, zzioVar2);
                                unsafe2.putInt(obj3, j11, zzjf.zzb(zzioVar2.zza));
                                i29 |= i42;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        case 16:
                            if (i36 != 0) {
                                i23 = i39;
                                obj2 = obj3;
                                unsafe = unsafe2;
                                i15 = i35;
                                i16 = i23;
                                i14 = -1;
                                i13 = i38;
                                break;
                            } else {
                                int zzm2 = zzip.zzm(bArr2, i34, zzioVar2);
                                Unsafe unsafe5 = unsafe2;
                                Object obj6 = obj3;
                                i23 = i39;
                                unsafe5.putLong(obj6, j11, zzjf.zzc(zzioVar2.zzb));
                                unsafe2 = unsafe5;
                                obj3 = obj6;
                                i29 |= i42;
                                i26 = zzm2;
                                i27 = i35;
                                i28 = i23;
                                i25 = -1;
                                break;
                            }
                        default:
                            i23 = i39;
                            obj2 = obj3;
                            unsafe = unsafe2;
                            i15 = i35;
                            i16 = i23;
                            i14 = -1;
                            i13 = i38;
                            break;
                    }
                } else {
                    i16 = i39;
                    if (zzA != 27) {
                        i17 = i34;
                        Unsafe unsafe6 = unsafe2;
                        if (zzA <= 49) {
                            i18 = i29;
                            unsafe = unsafe6;
                            i14 = -1;
                            i21 = i31;
                            int zzv = zzlmVar.zzv(obj, bArr, i17, i12, i38, i35, i36, i16, i37, zzA, j11, zzioVar);
                            i19 = i38;
                            i22 = i35;
                            if (zzv != i17) {
                                zzlmVar = this;
                                obj3 = obj;
                                zzioVar2 = zzioVar;
                                i26 = zzv;
                                i28 = i16;
                                i27 = i22;
                                i31 = i21;
                                i25 = i14;
                                i29 = i18;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i24 = i12;
                            } else {
                                obj2 = obj;
                                i34 = zzv;
                                i15 = i22;
                                i13 = i19;
                            }
                        } else {
                            i18 = i29;
                            unsafe = unsafe6;
                            i14 = -1;
                            i19 = i38;
                            i21 = i31;
                            i22 = i35;
                            if (zzA != 50) {
                                i15 = i22;
                                int zzt = zzt(obj, bArr, i17, i12, i19, i15, i36, i37, zzA, j11, i16, zzioVar);
                                obj2 = obj;
                                i13 = i19;
                                i16 = i16;
                                if (zzt != i17) {
                                    zzlmVar = this;
                                    zzioVar2 = zzioVar;
                                    i27 = i15;
                                    i26 = zzt;
                                    i28 = i16;
                                    obj3 = obj2;
                                    i31 = i21;
                                    i25 = i14;
                                    i29 = i18;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i24 = i12;
                                } else {
                                    i34 = zzt;
                                }
                            } else if (i36 == 2) {
                                int zzs = zzs(obj, bArr, i17, i12, i16, j11, zzioVar);
                                i16 = i16;
                                if (zzs != i17) {
                                    zzlmVar = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    zzioVar2 = zzioVar;
                                    i26 = zzs;
                                    i28 = i16;
                                    i27 = i22;
                                    i31 = i21;
                                    i25 = -1;
                                    i29 = i18;
                                    unsafe2 = unsafe;
                                    i24 = i12;
                                } else {
                                    obj2 = obj;
                                    i34 = zzs;
                                    i15 = i22;
                                    i13 = i19;
                                }
                            } else {
                                i16 = i16;
                                obj2 = obj;
                                i34 = i17;
                                i15 = i22;
                                i13 = i19;
                            }
                        }
                    } else if (i36 == 2) {
                        zzkj zzkjVar = (zzkj) unsafe2.getObject(obj3, j11);
                        if (!zzkjVar.zzc()) {
                            int size = zzkjVar.size();
                            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj3, j11, zzkjVar);
                        }
                        int zze = zzip.zze(zzlmVar.zzE(i16), i38, bArr2, i34, i12, zzkjVar, zzioVar2);
                        bArr2 = bArr;
                        zzioVar2 = zzioVar;
                        i26 = zze;
                        i28 = i16;
                        unsafe2 = unsafe2;
                        i27 = i35;
                        i25 = -1;
                        obj3 = obj;
                        i24 = i12;
                    } else {
                        i17 = i34;
                        i21 = i31;
                        i18 = i29;
                        unsafe = unsafe2;
                        i22 = i35;
                        i14 = -1;
                        i19 = i38;
                        obj2 = obj;
                        i34 = i17;
                        i15 = i22;
                        i13 = i19;
                    }
                    i31 = i21;
                    i29 = i18;
                }
            }
            int zzi = zzip.zzi(i13, bArr, i34, i12, zzd(obj2), zzioVar);
            bArr2 = bArr;
            zzioVar2 = zzioVar;
            i27 = i15;
            i28 = i16;
            obj3 = obj2;
            i25 = i14;
            unsafe2 = unsafe;
            i24 = i12;
            i26 = zzi;
            zzlmVar = this;
        }
        Object obj7 = obj3;
        Unsafe unsafe7 = unsafe2;
        int i45 = i24;
        int i46 = i31;
        int i47 = i29;
        if (i46 != 1048575) {
            unsafe7.putInt(obj7, i46, i47);
        }
        if (i26 == i45) {
            return i26;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11, int i17, long j12, zzio zzioVar) throws IOException {
        int zzl;
        Unsafe unsafe = zzb;
        zzkj zzkjVar = (zzkj) unsafe.getObject(obj, j12);
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j12, zzkjVar);
        }
        zzkj zzkjVar2 = zzkjVar;
        switch (i17) {
            case 18:
            case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                if (i15 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar2;
                    int zzj = zzip.zzj(bArr, i11, zzioVar);
                    int i18 = zzioVar.zza + zzj;
                    while (zzj < i18) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i18) {
                        return zzj;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar2;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i11)));
                    int i19 = i11 + 8;
                    while (i19 < i12) {
                        int zzj2 = zzip.zzj(bArr, i19, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return i19;
                        }
                        zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj2)));
                        i19 = zzj2 + 8;
                    }
                    return i19;
                }
                return i11;
            case 19:
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                if (i15 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar2;
                    int zzj3 = zzip.zzj(bArr, i11, zzioVar);
                    int i21 = zzioVar.zza + zzj3;
                    while (zzj3 < i21) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i21) {
                        return zzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar2;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i11)));
                    int i22 = i11 + 4;
                    while (i22 < i12) {
                        int zzj4 = zzip.zzj(bArr, i22, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return i22;
                        }
                        zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj4)));
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
                    zzky zzkyVar = (zzky) zzkjVar2;
                    int zzj5 = zzip.zzj(bArr, i11, zzioVar);
                    int i23 = zzioVar.zza + zzj5;
                    while (zzj5 < i23) {
                        zzj5 = zzip.zzm(bArr, zzj5, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (zzj5 == i23) {
                        return zzj5;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar2;
                    int zzm = zzip.zzm(bArr, i11, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (zzm < i12) {
                        int zzj6 = zzip.zzj(bArr, zzm, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return zzm;
                        }
                        zzm = zzip.zzm(bArr, zzj6, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return zzm;
                }
                return i11;
            case 22:
            case 29:
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
            case 43:
                if (i15 == 2) {
                    return zzip.zzf(bArr, i11, zzkjVar2, zzioVar);
                }
                if (i15 == 0) {
                    return zzip.zzl(i13, bArr, i11, i12, zzkjVar2, zzioVar);
                }
                return i11;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar2;
                    int zzj7 = zzip.zzj(bArr, i11, zzioVar);
                    int i24 = zzioVar.zza + zzj7;
                    while (zzj7 < i24) {
                        zzkyVar3.zzg(zzip.zzn(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i24) {
                        return zzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar2;
                    zzkyVar4.zzg(zzip.zzn(bArr, i11));
                    int i25 = i11 + 8;
                    while (i25 < i12) {
                        int zzj8 = zzip.zzj(bArr, i25, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return i25;
                        }
                        zzkyVar4.zzg(zzip.zzn(bArr, zzj8));
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
                    zzkd zzkdVar = (zzkd) zzkjVar2;
                    int zzj9 = zzip.zzj(bArr, i11, zzioVar);
                    int i26 = zzioVar.zza + zzj9;
                    while (zzj9 < i26) {
                        zzkdVar.zzh(zzip.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i26) {
                        return zzj9;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar2;
                    zzkdVar2.zzh(zzip.zzb(bArr, i11));
                    int i27 = i11 + 4;
                    while (i27 < i12) {
                        int zzj10 = zzip.zzj(bArr, i27, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return i27;
                        }
                        zzkdVar2.zzh(zzip.zzb(bArr, zzj10));
                        i27 = zzj10 + 4;
                    }
                    return i27;
                }
                return i11;
            case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
            case 42:
                if (i15 == 2) {
                    zziq zziqVar = (zziq) zzkjVar2;
                    int zzj11 = zzip.zzj(bArr, i11, zzioVar);
                    int i28 = zzioVar.zza + zzj11;
                    while (zzj11 < i28) {
                        zzj11 = zzip.zzm(bArr, zzj11, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (zzj11 == i28) {
                        return zzj11;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar2;
                    int zzm2 = zzip.zzm(bArr, i11, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (zzm2 < i12) {
                        int zzj12 = zzip.zzj(bArr, zzm2, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzip.zzm(bArr, zzj12, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i11;
            case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                if (i15 == 2) {
                    if ((j11 & 536870912) == 0) {
                        int zzj13 = zzip.zzj(bArr, i11, zzioVar);
                        int i29 = zzioVar.zza;
                        if (i29 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i29 == 0) {
                            zzkjVar2.add("");
                        } else {
                            zzkjVar2.add(new String(bArr, zzj13, i29, zzkk.zzb));
                            zzj13 += i29;
                        }
                        while (zzj13 < i12) {
                            int zzj14 = zzip.zzj(bArr, zzj13, zzioVar);
                            if (i13 != zzioVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzip.zzj(bArr, zzj14, zzioVar);
                            int i31 = zzioVar.zza;
                            if (i31 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i31 == 0) {
                                zzkjVar2.add("");
                            } else {
                                zzkjVar2.add(new String(bArr, zzj13, i31, zzkk.zzb));
                                zzj13 += i31;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzip.zzj(bArr, i11, zzioVar);
                    int i32 = zzioVar.zza;
                    if (i32 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i32 == 0) {
                        zzkjVar2.add("");
                    } else {
                        int i33 = zzj15 + i32;
                        if (!zzna.zzf(bArr, zzj15, i33)) {
                            throw zzkm.zzc();
                        }
                        zzkjVar2.add(new String(bArr, zzj15, i32, zzkk.zzb));
                        zzj15 = i33;
                    }
                    while (zzj15 < i12) {
                        int zzj16 = zzip.zzj(bArr, zzj15, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return zzj15;
                        }
                        zzj15 = zzip.zzj(bArr, zzj16, zzioVar);
                        int i34 = zzioVar.zza;
                        if (i34 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i34 == 0) {
                            zzkjVar2.add("");
                        } else {
                            int i35 = zzj15 + i34;
                            if (!zzna.zzf(bArr, zzj15, i35)) {
                                throw zzkm.zzc();
                            }
                            zzkjVar2.add(new String(bArr, zzj15, i34, zzkk.zzb));
                            zzj15 = i35;
                        }
                    }
                    return zzj15;
                }
                return i11;
            case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                if (i15 == 2) {
                    return zzip.zze(zzE(i16), i13, bArr, i11, i12, zzkjVar2, zzioVar);
                }
                return i11;
            case 28:
                if (i15 == 2) {
                    int zzj17 = zzip.zzj(bArr, i11, zzioVar);
                    int i36 = zzioVar.zza;
                    if (i36 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i36 > bArr.length - zzj17) {
                        throw zzkm.zzf();
                    }
                    if (i36 == 0) {
                        zzkjVar2.add(zzjb.zzb);
                    } else {
                        zzkjVar2.add(zzjb.zzl(bArr, zzj17, i36));
                        zzj17 += i36;
                    }
                    while (zzj17 < i12) {
                        int zzj18 = zzip.zzj(bArr, zzj17, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzip.zzj(bArr, zzj18, zzioVar);
                        int i37 = zzioVar.zza;
                        if (i37 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i37 > bArr.length - zzj17) {
                            throw zzkm.zzf();
                        }
                        if (i37 == 0) {
                            zzkjVar2.add(zzjb.zzb);
                        } else {
                            zzkjVar2.add(zzjb.zzl(bArr, zzj17, i37));
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
                        zzl = zzip.zzl(i13, bArr, i11, i12, zzkjVar2, zzioVar);
                    }
                    return i11;
                }
                zzl = zzip.zzf(bArr, i11, zzkjVar2, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object zzC = zzlw.zzC(i14, zzkjVar2, zzD(i16), zzmmVar, this.zzn);
                if (zzC == null) {
                    return zzl;
                }
                zzkcVar.zzc = (zzmm) zzC;
                return zzl;
            case 33:
            case 47:
                if (i15 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar2;
                    int zzj19 = zzip.zzj(bArr, i11, zzioVar);
                    int i38 = zzioVar.zza + zzj19;
                    while (zzj19 < i38) {
                        zzj19 = zzip.zzj(bArr, zzj19, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (zzj19 == i38) {
                        return zzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar2;
                    int zzj20 = zzip.zzj(bArr, i11, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (zzj20 < i12) {
                        int zzj21 = zzip.zzj(bArr, zzj20, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzip.zzj(bArr, zzj21, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return zzj20;
                }
                return i11;
            case 34:
            case 48:
                if (i15 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar2;
                    int zzj22 = zzip.zzj(bArr, i11, zzioVar);
                    int i39 = zzioVar.zza + zzj22;
                    while (zzj22 < i39) {
                        zzj22 = zzip.zzm(bArr, zzj22, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (zzj22 == i39) {
                        return zzj22;
                    }
                    throw zzkm.zzf();
                }
                if (i15 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar2;
                    int zzm3 = zzip.zzm(bArr, i11, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (zzm3 < i12) {
                        int zzj23 = zzip.zzj(bArr, zzm3, zzioVar);
                        if (i13 != zzioVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzip.zzm(bArr, zzj23, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return zzm3;
                }
                return i11;
            default:
                if (i15 == 3) {
                    zzlu zzE = zzE(i16);
                    int i41 = (i13 & (-8)) | 4;
                    int zzc = zzip.zzc(zzE, bArr, i11, i12, i41, zzioVar);
                    zzlu zzluVar = zzE;
                    zzio zzioVar2 = zzioVar;
                    zzkjVar2.add(zzioVar2.zzc);
                    while (zzc < i12) {
                        int zzj24 = zzip.zzj(bArr, zzc, zzioVar2);
                        if (i13 != zzioVar2.zza) {
                            return zzc;
                        }
                        zzlu zzluVar2 = zzluVar;
                        zzio zzioVar3 = zzioVar2;
                        zzc = zzip.zzc(zzluVar2, bArr, zzj24, i12, i41, zzioVar3);
                        zzkjVar2.add(zzioVar3.zzc);
                        zzluVar = zzluVar2;
                        zzioVar2 = zzioVar3;
                    }
                    return zzc;
                }
                return i11;
        }
    }

    private final int zzw(int i11) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzz(i11, 0);
    }

    private final int zzx(int i11, int i12) {
        if (i11 < this.zze || i11 > this.zzf) {
            return -1;
        }
        return zzz(i11, i12);
    }

    private final int zzy(int i11) {
        return this.zzc[i11 + 2];
    }

    private final int zzz(int i11, int i12) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i11;
        int zzc;
        int i12;
        int zzc2;
        int length = this.zzc.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14 += 3) {
            int zzB = zzB(i14);
            int i15 = this.zzc[i14];
            long j11 = 1048575 & zzB;
            int i16 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i11 = i13 * 53;
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j11)));
                    i13 = zzc + i11;
                    break;
                case 1:
                    i11 = i13 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 2:
                    i11 = i13 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 3:
                    i11 = i13 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 4:
                    i12 = i13 * 53;
                    zzc2 = zzmv.zzc(obj, j11);
                    i13 = i12 + zzc2;
                    break;
                case 5:
                    i11 = i13 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 6:
                    i12 = i13 * 53;
                    zzc2 = zzmv.zzc(obj, j11);
                    i13 = i12 + zzc2;
                    break;
                case 7:
                    i11 = i13 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    zzc = ((String) zzmv.zzf(obj, j11)).hashCode();
                    i13 = zzc + i11;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j11);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i13 = (i13 * 53) + i16;
                    break;
                case 10:
                    i11 = i13 * 53;
                    zzc = zzmv.zzf(obj, j11).hashCode();
                    i13 = zzc + i11;
                    break;
                case 11:
                    i12 = i13 * 53;
                    zzc2 = zzmv.zzc(obj, j11);
                    i13 = i12 + zzc2;
                    break;
                case 12:
                    i12 = i13 * 53;
                    zzc2 = zzmv.zzc(obj, j11);
                    i13 = i12 + zzc2;
                    break;
                case 13:
                    i12 = i13 * 53;
                    zzc2 = zzmv.zzc(obj, j11);
                    i13 = i12 + zzc2;
                    break;
                case 14:
                    i11 = i13 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 15:
                    i12 = i13 * 53;
                    zzc2 = zzmv.zzc(obj, j11);
                    i13 = i12 + zzc2;
                    break;
                case 16:
                    i11 = i13 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j11));
                    i13 = zzc + i11;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j11);
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
                    zzc = zzmv.zzf(obj, j11).hashCode();
                    i13 = zzc + i11;
                    break;
                case 50:
                    i11 = i13 * 53;
                    zzc = zzmv.zzf(obj, j11).hashCode();
                    i13 = zzc + i11;
                    break;
                case 51:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j11)));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zzc(zzC(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zzc(zzC(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzr(obj, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zzc(zzC(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzr(obj, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zza(zzS(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = ((String) zzmv.zzf(obj, j11)).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzmv.zzf(obj, j11).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzmv.zzf(obj, j11).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzr(obj, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzr(obj, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzr(obj, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zzc(zzC(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i14)) {
                        i12 = i13 * 53;
                        zzc2 = zzr(obj, j11);
                        i13 = i12 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzkk.zzc(zzC(obj, j11));
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i14)) {
                        i11 = i13 * 53;
                        zzc = zzmv.zzf(obj, j11).hashCode();
                        i13 = zzc + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzc(obj).hashCode() + (i13 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x04a4, code lost:
    
        if (r11 == r15) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x04a6, code lost:
    
        r20.putInt(r9, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x04ac, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x04b0, code lost:
    
        if (r0 >= r8.zzl) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04b2, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zzmv.zzf(r9, r8.zzB(r1) & r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x04c4, code lost:
    
        if (r2 != null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x04cb, code lost:
    
        if (r8.zzD(r1) != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x04d0, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzld) r2;
        r0 = (com.google.android.gms.internal.measurement.zzlc) r8.zzF(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04d8, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04cd, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04d9, code lost:
    
        if (r7 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x04db, code lost:
    
        if (r3 != r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04e2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04e7, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x04e3, code lost:
    
        if (r3 > r4) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04e5, code lost:
    
        if (r6 != r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04ec, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkm.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int zzc(Object obj, byte[] bArr, int i11, int i12, int i13, zzio zzioVar) throws IOException {
        int i14;
        Object obj2;
        Unsafe unsafe;
        int i15;
        zzlm<T> zzlmVar;
        int i16;
        int i17;
        int zzi;
        int i18;
        int i19;
        int i21;
        int i22;
        zzio zzioVar2;
        Unsafe unsafe2;
        int i23;
        int i24;
        byte[] bArr2;
        int i25;
        int i26;
        byte[] bArr3;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        zzlm<T> zzlmVar2 = this;
        Object obj3 = obj;
        byte[] bArr4 = bArr;
        int i34 = i12;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe3 = zzb;
        int i35 = i11;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = -1;
        int i41 = 1048575;
        while (true) {
            if (i35 < i34) {
                int i42 = i35 + 1;
                int i43 = bArr4[i35];
                if (i43 < 0) {
                    i42 = zzip.zzk(i43, bArr4, i42, zzioVar3);
                    i43 = zzioVar3.zza;
                }
                int i44 = i43;
                int i45 = i42;
                int i46 = i44 >>> 3;
                int i47 = i44 & 7;
                i38 = i46 > i39 ? zzlmVar2.zzx(i46, i38 / 3) : zzlmVar2.zzw(i46);
                if (i38 == -1) {
                    obj2 = obj3;
                    i16 = i45;
                    unsafe = unsafe3;
                    i38 = 0;
                    i15 = 1048575;
                    i14 = i13;
                    zzlmVar = zzlmVar2;
                    i17 = i44;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i48 = iArr[i38 + 1];
                    int zzA = zzA(i48);
                    int i49 = i44;
                    long j11 = i48 & 1048575;
                    if (zzA <= 17) {
                        int i51 = iArr[i38 + 2];
                        int i52 = 1 << (i51 >>> 20);
                        int i53 = i51 & 1048575;
                        if (i53 != i41) {
                            i18 = 1048575;
                            if (i41 != 1048575) {
                                unsafe3.putInt(obj3, i41, i37);
                            }
                            i41 = i53;
                            i37 = unsafe3.getInt(obj3, i53);
                        } else {
                            i18 = 1048575;
                        }
                        switch (zzA) {
                            case 0:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i23 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 1) {
                                    int i54 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i54;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    zzmv.zzo(obj3, j11, Double.longBitsToDouble(zzip.zzn(bArr2, i23)));
                                    i35 = i23 + 8;
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 1:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i23 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 5) {
                                    int i542 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i542;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    zzmv.zzp(obj3, j11, Float.intBitsToFloat(zzip.zzb(bArr2, i23)));
                                    i35 = i23 + 4;
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 2:
                            case 3:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i23 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                if (i47 != 0) {
                                    int i5422 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i5422;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    int zzm = zzip.zzm(bArr, i23, zzioVar2);
                                    unsafe2.putLong(obj, j11, zzioVar2.zzb);
                                    unsafe2 = unsafe2;
                                    obj3 = obj;
                                    i37 |= i52;
                                    bArr4 = bArr;
                                    i36 = i24;
                                    i35 = zzm;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 4:
                            case 11:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i23 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 0) {
                                    int i54222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i54222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = zzip.zzj(bArr2, i23, zzioVar2);
                                    unsafe2.putInt(obj3, j11, zzioVar2.zza);
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 5:
                            case 14:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 1) {
                                    i23 = i25;
                                    int i542222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i542222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i23 = i25;
                                    unsafe2.putLong(obj, j11, zzip.zzn(bArr2, i25));
                                    unsafe2 = unsafe2;
                                    obj3 = obj;
                                    i35 = i23 + 8;
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 6:
                            case 13:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 5) {
                                    i23 = i25;
                                    int i5422222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i5422222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j11, zzip.zzb(bArr2, i25));
                                    i35 = i25 + 4;
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 7:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 0) {
                                    i23 = i25;
                                    int i54222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i54222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = zzip.zzm(bArr2, i25, zzioVar2);
                                    zzmv.zzm(obj3, j11, zzioVar2.zzb != 0);
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 8:
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr2 = bArr;
                                if (i47 != 2) {
                                    i23 = i25;
                                    int i542222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i542222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = (536870912 & i48) == 0 ? zzip.zzg(bArr2, i25, zzioVar2) : zzip.zzh(bArr2, i25, zzioVar2);
                                    unsafe2.putObject(obj3, j11, zzioVar2.zzc);
                                    i37 |= i52;
                                    bArr4 = bArr2;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i12;
                                    break;
                                }
                            case 9:
                                i26 = i12;
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr3 = bArr;
                                if (i47 != 2) {
                                    i23 = i25;
                                    int i5422222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i5422222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = zzip.zzd(zzlmVar2.zzE(i38), bArr3, i25, i26, zzioVar2);
                                    if ((i37 & i52) == 0) {
                                        unsafe2.putObject(obj3, j11, zzioVar2.zzc);
                                    } else {
                                        unsafe2.putObject(obj3, j11, zzkk.zzg(unsafe2.getObject(obj3, j11), zzioVar2.zzc));
                                    }
                                    i37 |= i52;
                                    bArr4 = bArr3;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i26;
                                    break;
                                }
                            case 10:
                                i26 = i12;
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                i24 = i49;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr3 = bArr;
                                if (i47 != 2) {
                                    i23 = i25;
                                    int i54222222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i54222222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = zzip.zza(bArr3, i25, zzioVar2);
                                    unsafe2.putObject(obj3, j11, zzioVar2.zzc);
                                    i37 |= i52;
                                    bArr4 = bArr3;
                                    i36 = i24;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    unsafe3 = unsafe2;
                                    i34 = i26;
                                    break;
                                }
                            case 12:
                                i26 = i12;
                                i19 = i46;
                                unsafe2 = unsafe3;
                                i25 = i45;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                bArr3 = bArr;
                                if (i47 != 0) {
                                    i24 = i49;
                                    i23 = i25;
                                    int i542222222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i542222222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = zzip.zzj(bArr3, i25, zzioVar2);
                                    int i55 = zzioVar2.zza;
                                    zzkg zzD = zzlmVar2.zzD(i38);
                                    if (zzD == null || zzD.zza(i55)) {
                                        i24 = i49;
                                        unsafe2.putInt(obj3, j11, i55);
                                        i37 |= i52;
                                        bArr4 = bArr3;
                                        i36 = i24;
                                        zzioVar3 = zzioVar2;
                                        i39 = i19;
                                        unsafe3 = unsafe2;
                                        i34 = i26;
                                        break;
                                    } else {
                                        i24 = i49;
                                        zzd(obj3).zzh(i24, Long.valueOf(i55));
                                        bArr4 = bArr3;
                                        i36 = i24;
                                        zzioVar3 = zzioVar2;
                                        i39 = i19;
                                        unsafe3 = unsafe2;
                                        i34 = i26;
                                    }
                                }
                                break;
                            case 15:
                                i27 = i12;
                                i19 = i46;
                                unsafe2 = unsafe3;
                                zzioVar2 = zzioVar;
                                i22 = i18;
                                if (i47 != 0) {
                                    i23 = i45;
                                    i24 = i49;
                                    int i5422222222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i5422222222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i35 = zzip.zzj(bArr, i45, zzioVar2);
                                    unsafe2.putInt(obj3, j11, zzjf.zzb(zzioVar2.zza));
                                    i37 |= i52;
                                    unsafe3 = unsafe2;
                                    bArr4 = bArr;
                                    i34 = i27;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    i36 = i49;
                                    break;
                                }
                            case 16:
                                i27 = i12;
                                i19 = i46;
                                i21 = i45;
                                i22 = i18;
                                if (i47 != 0) {
                                    zzioVar2 = zzioVar;
                                    i23 = i21;
                                    unsafe2 = unsafe3;
                                    i24 = i49;
                                    int i54222222222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i54222222222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    int zzm2 = zzip.zzm(bArr, i21, zzioVar);
                                    zzioVar2 = zzioVar;
                                    Object obj4 = obj3;
                                    Unsafe unsafe4 = unsafe3;
                                    unsafe4.putLong(obj4, j11, zzjf.zzc(zzioVar.zzb));
                                    obj3 = obj4;
                                    i37 |= i52;
                                    unsafe3 = unsafe4;
                                    bArr4 = bArr;
                                    i35 = zzm2;
                                    i34 = i27;
                                    zzioVar3 = zzioVar2;
                                    i39 = i19;
                                    i36 = i49;
                                    break;
                                }
                            default:
                                if (i47 != 3) {
                                    i19 = i46;
                                    i21 = i45;
                                    i22 = i18;
                                    zzioVar2 = zzioVar;
                                    i23 = i21;
                                    unsafe2 = unsafe3;
                                    i24 = i49;
                                    int i542222222222222 = i24;
                                    zzlmVar = zzlmVar2;
                                    i17 = i542222222222222;
                                    i14 = i13;
                                    obj2 = obj3;
                                    zzioVar3 = zzioVar2;
                                    i16 = i23;
                                    i46 = i19;
                                    i15 = i22;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    int zzc = zzip.zzc(zzlmVar2.zzE(i38), bArr, i45, i12, (i46 << 3) | 4, zzioVar);
                                    if ((i37 & i52) == 0) {
                                        unsafe3.putObject(obj3, j11, zzioVar.zzc);
                                    } else {
                                        unsafe3.putObject(obj3, j11, zzkk.zzg(unsafe3.getObject(obj3, j11), zzioVar.zzc));
                                    }
                                    i37 |= i52;
                                    zzioVar3 = zzioVar;
                                    i34 = i12;
                                    i36 = i49;
                                    i35 = zzc;
                                    bArr4 = bArr;
                                    i39 = i46;
                                    break;
                                }
                        }
                    } else {
                        Unsafe unsafe5 = unsafe3;
                        zzio zzioVar4 = zzioVar3;
                        if (zzA != 27) {
                            i49 = i49;
                            i28 = i45;
                            if (zzA <= 49) {
                                unsafe = unsafe5;
                                i15 = 1048575;
                                i29 = i41;
                                i32 = i37;
                                int zzv = zzlmVar2.zzv(obj, bArr, i28, i12, i49, i46, i47, i38, i48, zzA, j11, zzioVar);
                                i31 = i46;
                                i33 = i38;
                                if (zzv != i28) {
                                    zzlmVar2 = this;
                                    obj3 = obj;
                                    bArr4 = bArr;
                                    i34 = i12;
                                    zzioVar3 = zzioVar;
                                    i35 = zzv;
                                    i39 = i31;
                                    i38 = i33;
                                    i41 = i29;
                                    i37 = i32;
                                    unsafe3 = unsafe;
                                    i36 = i49;
                                } else {
                                    zzlmVar = this;
                                    zzioVar3 = zzioVar;
                                    i16 = zzv;
                                    i46 = i31;
                                    i38 = i33;
                                    i41 = i29;
                                    i37 = i32;
                                    i17 = i49;
                                    obj2 = obj;
                                    i14 = i13;
                                }
                            } else {
                                unsafe = unsafe5;
                                i15 = 1048575;
                                i29 = i41;
                                i31 = i46;
                                i32 = i37;
                                i33 = i38;
                                if (zzA != 50) {
                                    i46 = i31;
                                    int zzt = zzt(obj, bArr, i28, i12, i49, i46, i47, i48, zzA, j11, i33, zzioVar);
                                    zzlmVar = this;
                                    obj2 = obj;
                                    i17 = i49;
                                    zzioVar3 = zzioVar;
                                    if (zzt != i28) {
                                        bArr4 = bArr;
                                        i34 = i12;
                                        i35 = zzt;
                                        obj3 = obj2;
                                        i38 = i33;
                                        i41 = i29;
                                        i37 = i32;
                                        i39 = i46;
                                        i36 = i17;
                                        zzlmVar2 = zzlmVar;
                                        unsafe3 = unsafe;
                                    } else {
                                        i16 = zzt;
                                        i38 = i33;
                                        i41 = i29;
                                        i37 = i32;
                                        i14 = i13;
                                    }
                                } else if (i47 == 2) {
                                    int zzs = zzs(obj, bArr, i28, i12, i33, j11, zzioVar);
                                    if (zzs != i28) {
                                        zzlmVar2 = this;
                                        obj3 = obj;
                                        bArr4 = bArr;
                                        i34 = i12;
                                        zzioVar3 = zzioVar;
                                        i35 = zzs;
                                        i39 = i31;
                                        i38 = i33;
                                        i41 = i29;
                                        i37 = i32;
                                        unsafe3 = unsafe;
                                        i36 = i49;
                                    } else {
                                        zzlmVar = this;
                                        i14 = i13;
                                        zzioVar3 = zzioVar;
                                        i16 = zzs;
                                        i46 = i31;
                                        i38 = i33;
                                        i41 = i29;
                                        i37 = i32;
                                        i17 = i49;
                                        obj2 = obj;
                                    }
                                }
                            }
                        } else if (i47 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe5.getObject(obj3, j11);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe5.putObject(obj3, j11, zzkjVar);
                            }
                            int zze = zzip.zze(zzlmVar2.zzE(i38), i49, bArr, i45, i12, zzkjVar, zzioVar4);
                            bArr4 = bArr;
                            i34 = i12;
                            zzioVar3 = zzioVar;
                            i35 = zze;
                            unsafe3 = unsafe5;
                            i39 = i46;
                            i36 = i49;
                            obj3 = obj;
                        } else {
                            i49 = i49;
                            i29 = i41;
                            i28 = i45;
                            i31 = i46;
                            i15 = 1048575;
                            unsafe = unsafe5;
                            i32 = i37;
                            i33 = i38;
                        }
                        zzlmVar = this;
                        i14 = i13;
                        zzioVar3 = zzioVar;
                        i16 = i28;
                        i46 = i31;
                        i38 = i33;
                        i41 = i29;
                        i37 = i32;
                        i17 = i49;
                        obj2 = obj;
                    }
                }
                if (i17 != i14 || i14 == 0) {
                    if (!zzlmVar.zzh || zzioVar3.zzd == zzjo.zza()) {
                        zzi = zzip.zzi(i17, bArr, i16, i12, zzd(obj2), zzioVar);
                        i34 = i12;
                    } else {
                        if (zzioVar3.zzd.zzc(zzlmVar.zzg, i46) != null) {
                            throw null;
                        }
                        zzi = zzip.zzi(i17, bArr, i16, i12, zzd(obj2), zzioVar3);
                        i34 = i12;
                    }
                    i35 = zzi;
                    bArr4 = bArr;
                    zzioVar3 = zzioVar;
                    i39 = i46;
                    obj3 = obj2;
                    i36 = i17;
                    zzlmVar2 = zzlmVar;
                    unsafe3 = unsafe;
                } else {
                    i34 = i12;
                    i36 = i17;
                    i35 = i16;
                }
            } else {
                i14 = i13;
                obj2 = obj3;
                unsafe = unsafe3;
                i15 = 1048575;
                zzlmVar = zzlmVar2;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i11;
        int i12 = this.zzk;
        while (true) {
            i11 = this.zzl;
            if (i12 >= i11) {
                break;
            }
            long zzB = zzB(this.zzj[i12]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i12++;
        }
        int length = this.zzj.length;
        while (i11 < length) {
            this.zzm.zza(obj, this.zzj[i11]);
            i11++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i11 = 0; i11 < this.zzc.length; i11 += 3) {
            int zzB = zzB(i11);
            long j11 = 1048575 & zzB;
            int i12 = this.zzc[i11];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i11)) {
                        zzmv.zzo(obj, j11, zzmv.zza(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i11)) {
                        zzmv.zzp(obj, j11, zzmv.zzb(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i11)) {
                        zzmv.zzr(obj, j11, zzmv.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i11)) {
                        zzmv.zzr(obj, j11, zzmv.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i11)) {
                        zzmv.zzq(obj, j11, zzmv.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i11)) {
                        zzmv.zzr(obj, j11, zzmv.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i11)) {
                        zzmv.zzq(obj, j11, zzmv.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i11)) {
                        zzmv.zzm(obj, j11, zzmv.zzw(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i11)) {
                        zzmv.zzs(obj, j11, zzmv.zzf(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i11);
                    break;
                case 10:
                    if (zzO(obj2, i11)) {
                        zzmv.zzs(obj, j11, zzmv.zzf(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i11)) {
                        zzmv.zzq(obj, j11, zzmv.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i11)) {
                        zzmv.zzq(obj, j11, zzmv.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i11)) {
                        zzmv.zzq(obj, j11, zzmv.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i11)) {
                        zzmv.zzr(obj, j11, zzmv.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i11)) {
                        zzmv.zzq(obj, j11, zzmv.zzc(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i11)) {
                        zzmv.zzr(obj, j11, zzmv.zzd(obj2, j11));
                        zzJ(obj, i11);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i11);
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
                    this.zzm.zzb(obj, obj2, j11);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j11);
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
                    if (zzR(obj2, i12, i11)) {
                        zzmv.zzs(obj, j11, zzmv.zzf(obj2, j11));
                        zzK(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i11);
                    break;
                case 61:
                case 62:
                case 63:
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i11)) {
                        zzmv.zzs(obj, j11, zzmv.zzf(obj2, j11));
                        zzK(obj, i12, i11);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i11);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i11, int i12, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i11, i12, zzioVar);
        } else {
            zzc(obj, bArr, i11, i12, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzB = zzB(i11);
            int i12 = this.zzc[i11];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj, i11)) {
                        zzndVar.zzf(i12, zzmv.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i11)) {
                        zzndVar.zzo(i12, zzmv.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i11)) {
                        zzndVar.zzt(i12, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i11)) {
                        zzndVar.zzJ(i12, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i11)) {
                        zzndVar.zzr(i12, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i11)) {
                        zzndVar.zzm(i12, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i11)) {
                        zzndVar.zzk(i12, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i11)) {
                        zzndVar.zzb(i12, zzmv.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj, i11)) {
                        zzT(i12, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzO(obj, i11)) {
                        zzndVar.zzv(i12, zzmv.zzf(obj, zzB & 1048575), zzE(i11));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i11)) {
                        zzndVar.zzd(i12, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i11)) {
                        zzndVar.zzH(i12, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i11)) {
                        zzndVar.zzi(i12, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i11)) {
                        zzndVar.zzw(i12, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i11)) {
                        zzndVar.zzy(i12, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i11)) {
                        zzndVar.zzA(i12, zzmv.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i11)) {
                        zzndVar.zzC(i12, zzmv.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i11)) {
                        zzndVar.zzq(i12, zzmv.zzf(obj, zzB & 1048575), zzE(i11));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlw.zzJ(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    zzlw.zzH(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    zzlw.zzW(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    zzlw.zzR(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i11));
                    break;
                case 28:
                    zzlw.zzI(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    zzlw.zzK(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    zzlw.zzS(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                    break;
                case DescriptorProtos$MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                    zzlw.zzJ(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    zzlw.zzN(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    zzlw.zzQ(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    zzlw.zzP(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    zzlw.zzK(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    zzlw.zzS(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 48:
                    zzlw.zzV(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                    break;
                case 49:
                    zzlw.zzO(i12, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i11));
                    break;
                case 50:
                    zzM(zzndVar, i12, zzmv.zzf(obj, zzB & 1048575), i11);
                    break;
                case 51:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzf(i12, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzo(i12, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzt(i12, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzJ(i12, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzr(i12, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzm(i12, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzk(i12, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzb(i12, zzS(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i12, i11)) {
                        zzT(i12, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzv(i12, zzmv.zzf(obj, zzB & 1048575), zzE(i11));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzd(i12, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzH(i12, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzi(i12, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzw(i12, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzy(i12, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzA(i12, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzC(i12, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i12, i11)) {
                        zzndVar.zzq(i12, zzmv.zzf(obj, zzB & 1048575), zzE(i11));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int zzB = zzB(i11);
            long j11 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i11) && Double.doubleToLongBits(zzmv.zza(obj, j11)) == Double.doubleToLongBits(zzmv.zza(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i11) && Float.floatToIntBits(zzmv.zzb(obj, j11)) == Float.floatToIntBits(zzmv.zzb(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i11) && zzmv.zzd(obj, j11) == zzmv.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i11) && zzmv.zzd(obj, j11) == zzmv.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i11) && zzmv.zzc(obj, j11) == zzmv.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i11) && zzmv.zzd(obj, j11) == zzmv.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i11) && zzmv.zzc(obj, j11) == zzmv.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i11) && zzmv.zzw(obj, j11) == zzmv.zzw(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i11) && zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i11) && zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i11) && zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i11) && zzmv.zzc(obj, j11) == zzmv.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i11) && zzmv.zzc(obj, j11) == zzmv.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i11) && zzmv.zzc(obj, j11) == zzmv.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i11) && zzmv.zzd(obj, j11) == zzmv.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i11) && zzmv.zzc(obj, j11) == zzmv.zzc(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i11) && zzmv.zzd(obj, j11) == zzmv.zzd(obj2, j11)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i11) && zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11))) {
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
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11));
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
                    long zzy = zzy(i11) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j11), zzmv.zzf(obj2, j11))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i11;
        int i12;
        int i13;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i16 < this.zzk) {
            int i17 = this.zzj[i16];
            int i18 = this.zzc[i17];
            int zzB = zzB(i17);
            int i19 = this.zzc[i17 + 2];
            int i21 = i19 & 1048575;
            int i22 = 1 << (i19 >>> 20);
            if (i21 != i14) {
                if (i21 != 1048575) {
                    i15 = zzb.getInt(obj, i21);
                }
                i12 = i17;
                i13 = i15;
                i11 = i21;
            } else {
                int i23 = i15;
                i11 = i14;
                i12 = i17;
                i13 = i23;
            }
            if ((268435456 & zzB) != 0 && !zzP(obj, i12, i11, i13, i22)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i18, i12) && !zzQ(obj, zzB, zzE(i12))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i12);
                    for (int i24 = 0; i24 < list.size(); i24++) {
                        if (!zzE.zzk(list.get(i24))) {
                            return false;
                        }
                    }
                }
            } else if (zzP(obj, i12, i11, i13, i22) && !zzQ(obj, zzB, zzE(i12))) {
                return false;
            }
            i16++;
            i14 = i11;
            i15 = i13;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
