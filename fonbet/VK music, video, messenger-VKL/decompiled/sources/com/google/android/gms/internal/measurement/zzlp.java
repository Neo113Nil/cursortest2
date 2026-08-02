package com.google.android.gms.internal.measurement;

import com.vk.movika.sdk.base.model.history.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import ru.ok.proto.PublisherConfiguration;
import sun.misc.Unsafe;
import xsna.iub0;
import xsna.uga0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes12.dex */
final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmy.zzf(obj, j)).longValue();
    }

    private final zzkj zzD(int i) {
        int i2 = i / 3;
        return (zzkj) this.zzd[i2 + i2 + 1];
    }

    private final zzlx zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlx zzlxVar = (zzlx) this.zzd[i3];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzb2 = zzlu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzG(Object obj, int i) {
        zzlx zzE = zzE(i);
        long zzB = zzB(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzE.zze();
        }
        Object object = zzb.getObject(obj, zzB);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzE.zze();
        if (object != null) {
            zzE.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzH(Object obj, int i, int i2) {
        zzlx zzE = zzE(i2);
        if (!zzX(obj, i, i2)) {
            return zzE.zze();
        }
        Object object = zzb.getObject(obj, zzB(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object zze = zzE.zze();
        if (object != null) {
            zzE.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzI(Class cls, String str) {
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
            StringBuilder a = xe9.a("Field ", str, " for ", name, " not found. Known fields are ");
            a.append(arrays);
            throw new RuntimeException(a.toString());
        }
    }

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            long zzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object == null) {
                throw new IllegalStateException(b.b(this.zzc[i], "Source subfield ", " is present but null: ", obj2.toString()));
            }
            zzlx zzE = zzE(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object zze = zzE.zze();
                    zzE.zzg(zze, object);
                    unsafe.putObject(obj, zzB, zze);
                } else {
                    unsafe.putObject(obj, zzB, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzB);
            if (!zzW(object2)) {
                Object zze2 = zzE.zze();
                zzE.zzg(zze2, object2);
                unsafe.putObject(obj, zzB, zze2);
                object2 = zze2;
            }
            zzE.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            long zzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, zzB);
            if (object == null) {
                throw new IllegalStateException(b.b(this.zzc[i], "Source subfield ", " is present but null: ", obj2.toString()));
            }
            zzlx zzE = zzE(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object zze = zzE.zze();
                    zzE.zzg(zze, object);
                    unsafe.putObject(obj, zzB, zze);
                } else {
                    unsafe.putObject(obj, zzB, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, zzB);
            if (!zzW(object2)) {
                Object zze2 = zzE.zze();
                zzE.zzg(zze2, object2);
                unsafe.putObject(obj, zzB, zze2);
                object2 = zze2;
            }
            zzE.zzg(object2, object);
        }
    }

    private final void zzM(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return;
        }
        zzmy.zzq(obj, j, (1 << (zzy >>> 20)) | zzmy.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzmy.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzB(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzQ(Object obj, zzng zzngVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int zzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int zzA = zzA(zzB);
            if (zzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = zzB & i2;
            switch (zzA) {
                case 0:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzf(i6, zzmy.zza(obj, j));
                        break;
                    }
                case 1:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzo(i6, zzmy.zzb(obj, j));
                        break;
                    }
                case 2:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzt(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzJ(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzr(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzm(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzk(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzb(i6, zzmy.zzw(obj, j));
                        break;
                    }
                case 8:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                        break;
                    }
                case 9:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 10:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzH(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 12:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzi(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzw(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzy(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzA(i6, unsafe.getInt(obj, j));
                        break;
                    }
                case 16:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzC(i6, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i5 & i) == 0) {
                        break;
                    } else {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                        break;
                    }
                case 18:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 28:
                    zzlz.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 29:
                    z = false;
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 30:
                    z = false;
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 31:
                    z = false;
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 32:
                    z = false;
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 33:
                    z = false;
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 34:
                    z = false;
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzngVar, zzE(i4));
                    break;
                case 50:
                    zzR(zzngVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case 55:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzb(i6, zzY(obj, j));
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i4)) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case 65:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case 66:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i4)) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    private final void zzR(zzng zzngVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private final boolean zzT(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != PublisherConfiguration.DEFAULT_LOW_BANDWIDTH_MARK) {
            return (zzmy.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j2)) != 0;
            case 2:
                return zzmy.zzd(obj, j2) != 0;
            case 3:
                return zzmy.zzd(obj, j2) != 0;
            case 4:
                return zzmy.zzc(obj, j2) != 0;
            case 5:
                return zzmy.zzd(obj, j2) != 0;
            case 6:
                return zzmy.zzc(obj, j2) != 0;
            case 7:
                return zzmy.zzw(obj, j2);
            case 8:
                Object zzf = zzmy.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzje) {
                    return !zzje.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmy.zzf(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j2));
            case 11:
                return zzmy.zzc(obj, j2) != 0;
            case 12:
                return zzmy.zzc(obj, j2) != 0;
            case 13:
                return zzmy.zzc(obj, j2) != 0;
            case 14:
                return zzmy.zzd(obj, j2) != 0;
            case 15:
                return zzmy.zzc(obj, j2) != 0;
            case 16:
                return zzmy.zzd(obj, j2) != 0;
            case 17:
                return zzmy.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? zzT(obj, i) : (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzmy.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzmy.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzng zzngVar) throws IOException {
        if (obj instanceof String) {
            zzngVar.zzF(i, (String) obj);
        } else {
            zzngVar.zzd(i, (zzje) obj);
        }
    }

    public static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar != zzmp.zzc()) {
            return zzmpVar;
        }
        zzmp zzf = zzmp.zzf();
        zzkfVar.zzc = zzf;
        return zzf;
    }

    public static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
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
    public static zzlp zzm(zzlw zzlwVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char charAt5;
        int i6;
        char charAt6;
        int i7;
        char charAt7;
        int i8;
        char charAt8;
        int i9;
        char charAt9;
        int i10;
        char charAt10;
        int i11;
        char charAt11;
        int i12;
        char charAt12;
        int i13;
        int i14;
        int i15;
        int i16;
        int objectFieldOffset;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Field zzI;
        char charAt13;
        int i23;
        int i24;
        Object obj;
        Field zzI2;
        Object obj2;
        Field zzI3;
        int i25;
        char charAt14;
        int i26;
        int i27;
        char charAt15;
        int i28;
        char charAt16;
        int i29;
        char charAt17;
        boolean z = zzlwVar.zzc() == 2;
        String zzd = zzlwVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (zzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt18 = zzd.charAt(i);
        if (charAt18 >= 55296) {
            int i32 = charAt18 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt17 = zzd.charAt(i31);
                if (charAt17 < 55296) {
                    break;
                }
                i32 |= (charAt17 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt18 = i32 | (charAt17 << i33);
            i31 = i29;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i3 = 0;
            charAt4 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt19 = zzd.charAt(i31);
            if (charAt19 >= 55296) {
                int i35 = charAt19 & 8191;
                int i36 = 13;
                while (true) {
                    i12 = i34 + 1;
                    charAt12 = zzd.charAt(i34);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i35 |= (charAt12 & 8191) << i36;
                    i36 += 13;
                    i34 = i12;
                }
                charAt19 = i35 | (charAt12 << i36);
                i34 = i12;
            }
            int i37 = i34 + 1;
            int charAt20 = zzd.charAt(i34);
            if (charAt20 >= 55296) {
                int i38 = charAt20 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    charAt11 = zzd.charAt(i37);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i38 |= (charAt11 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                charAt20 = i38 | (charAt11 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            charAt = zzd.charAt(i37);
            if (charAt >= 55296) {
                int i41 = charAt & 8191;
                int i42 = 13;
                while (true) {
                    i10 = i40 + 1;
                    charAt10 = zzd.charAt(i40);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i41 |= (charAt10 & 8191) << i42;
                    i42 += 13;
                    i40 = i10;
                }
                charAt = i41 | (charAt10 << i42);
                i40 = i10;
            }
            int i43 = i40 + 1;
            charAt2 = zzd.charAt(i40);
            if (charAt2 >= 55296) {
                int i44 = charAt2 & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    charAt9 = zzd.charAt(i43);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i44 |= (charAt9 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                charAt2 = i44 | (charAt9 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            charAt3 = zzd.charAt(i43);
            if (charAt3 >= 55296) {
                int i47 = charAt3 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    charAt8 = zzd.charAt(i46);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                charAt3 = i47 | (charAt8 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int charAt21 = zzd.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    charAt7 = zzd.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i50 |= (charAt7 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                charAt21 = i50 | (charAt7 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            int charAt22 = zzd.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i6 = i52 + 1;
                    charAt6 = zzd.charAt(i52);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i53 |= (charAt6 & 8191) << i54;
                    i54 += 13;
                    i52 = i6;
                }
                charAt22 = i53 | (charAt6 << i54);
                i52 = i6;
            }
            int i55 = i52 + 1;
            charAt4 = zzd.charAt(i52);
            if (charAt4 >= 55296) {
                int i56 = charAt4 & 8191;
                int i57 = 13;
                while (true) {
                    i5 = i55 + 1;
                    charAt5 = zzd.charAt(i55);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i56 |= (charAt5 & 8191) << i57;
                    i57 += 13;
                    i55 = i5;
                }
                charAt4 = i56 | (charAt5 << i57);
                i55 = i5;
            }
            int[] iArr2 = new int[charAt4 + charAt21 + charAt22];
            i2 = charAt19 + charAt19 + charAt20;
            i3 = charAt21;
            iArr = iArr2;
            i4 = charAt19;
            i31 = i55;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzlwVar.zze();
        Class<?> cls = zzlwVar.zza().getClass();
        int[] iArr3 = new int[charAt3 * 3];
        Object[] objArr = new Object[charAt3 + charAt3];
        int i58 = i3 + charAt4;
        int i59 = i58;
        int i60 = charAt4;
        int i61 = 0;
        int i62 = 0;
        while (i31 < length) {
            int i63 = i31 + 1;
            int charAt23 = zzd.charAt(i31);
            if (charAt23 >= c) {
                int i64 = charAt23 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i28 = i65 + 1;
                    charAt16 = zzd.charAt(i65);
                    if (charAt16 < c) {
                        break;
                    }
                    i64 |= (charAt16 & 8191) << i66;
                    i66 += 13;
                    i65 = i28;
                }
                charAt23 = i64 | (charAt16 << i66);
                i13 = i28;
            } else {
                i13 = i63;
            }
            int i67 = i13 + 1;
            int charAt24 = zzd.charAt(i13);
            if (charAt24 >= c) {
                int i68 = charAt24 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i27 = i69 + 1;
                    charAt15 = zzd.charAt(i69);
                    i14 = length;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i68 |= (charAt15 & 8191) << i70;
                    i70 += 13;
                    i69 = i27;
                    length = i14;
                }
                charAt24 = i68 | (charAt15 << i70);
                i15 = i27;
            } else {
                i14 = length;
                i15 = i67;
            }
            int i71 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i62] = i61;
                i62++;
            }
            if (i71 >= 51) {
                int i72 = i15 + 1;
                int charAt25 = zzd.charAt(i15);
                if (charAt25 >= 55296) {
                    int i73 = charAt25 & 8191;
                    int i74 = i72;
                    int i75 = 13;
                    while (true) {
                        i25 = i74 + 1;
                        charAt14 = zzd.charAt(i74);
                        i26 = i73;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i73 = i26 | ((charAt14 & 8191) << i75);
                        i75 += 13;
                        i74 = i25;
                    }
                    charAt25 = i26 | (charAt14 << i75);
                    i23 = i25;
                } else {
                    i23 = i72;
                }
                int i76 = charAt25;
                int i77 = i71 - 51;
                int i78 = i23;
                if (i77 == 9 || i77 == 17) {
                    int i79 = i61 / 3;
                    i24 = i2 + 1;
                    objArr[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i77 == 12 && !z) {
                        int i80 = i61 / 3;
                        i24 = i2 + 1;
                        objArr[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = i76 + i76;
                    obj = zze[i81];
                    if (obj instanceof Field) {
                        zzI2 = zzI(cls, (String) obj);
                        zze[i81] = zzI2;
                    } else {
                        zzI2 = (Field) obj;
                    }
                    i16 = charAt23;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzI2);
                    int i82 = i81 + 1;
                    obj2 = zze[i82];
                    if (obj2 instanceof Field) {
                        zzI3 = zzI(cls, (String) obj2);
                        zze[i82] = zzI3;
                    } else {
                        zzI3 = (Field) obj2;
                    }
                    i17 = (int) unsafe.objectFieldOffset(zzI3);
                    i21 = objectFieldOffset2;
                    i31 = i78;
                    i20 = 0;
                }
                i2 = i24;
                int i812 = i76 + i76;
                obj = zze[i812];
                if (obj instanceof Field) {
                }
                i16 = charAt23;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzI2);
                int i822 = i812 + 1;
                obj2 = zze[i822];
                if (obj2 instanceof Field) {
                }
                i17 = (int) unsafe.objectFieldOffset(zzI3);
                i21 = objectFieldOffset22;
                i31 = i78;
                i20 = 0;
            } else {
                i16 = charAt23;
                int i83 = i2 + 1;
                Field zzI4 = zzI(cls, (String) zze[i2]);
                if (i71 == 9 || i71 == 17) {
                    int i84 = i61 / 3;
                    objArr[i84 + i84 + 1] = zzI4.getType();
                } else {
                    if (i71 == 27 || i71 == 49) {
                        int i85 = i61 / 3;
                        i2 += 2;
                        objArr[i85 + i85 + 1] = zze[i83];
                    } else if (i71 == 12 || i71 == 30 || i71 == 44) {
                        if (!z) {
                            int i86 = i61 / 3;
                            i2 += 2;
                            objArr[i86 + i86 + 1] = zze[i83];
                        }
                    } else if (i71 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i61;
                        int i88 = i61 / 3;
                        int i89 = i88 + i88;
                        int i90 = i2 + 2;
                        objArr[i89] = zze[i83];
                        if ((charAt24 & 2048) != 0) {
                            objArr[i89 + 1] = zze[i90];
                            i2 += 3;
                        } else {
                            i2 = i90;
                        }
                        i60 = i87;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                    i17 = 1048575;
                    if ((charAt24 & 4096) == 4096 || i71 > 17) {
                        i18 = i15;
                        i19 = 0;
                    } else {
                        int i91 = i15 + 1;
                        int charAt26 = zzd.charAt(i15);
                        if (charAt26 >= 55296) {
                            int i92 = charAt26 & 8191;
                            int i93 = 13;
                            while (true) {
                                i22 = i91 + 1;
                                charAt13 = zzd.charAt(i91);
                                if (charAt13 < 55296) {
                                    break;
                                }
                                i92 |= (charAt13 & 8191) << i93;
                                i93 += 13;
                                i91 = i22;
                            }
                            charAt26 = i92 | (charAt13 << i93);
                        } else {
                            i22 = i91;
                        }
                        int i94 = (charAt26 / 32) + i4 + i4;
                        Object obj3 = zze[i94];
                        if (obj3 instanceof Field) {
                            zzI = (Field) obj3;
                        } else {
                            zzI = zzI(cls, (String) obj3);
                            zze[i94] = zzI;
                        }
                        i19 = charAt26 % 32;
                        int i95 = i22;
                        i17 = (int) unsafe.objectFieldOffset(zzI);
                        i18 = i95;
                    }
                    if (i71 >= 18 && i71 <= 49) {
                        iArr[i59] = objectFieldOffset;
                        i59++;
                    }
                    i31 = i18;
                    i20 = i19;
                    i21 = objectFieldOffset;
                }
                i2 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                i17 = 1048575;
                if ((charAt24 & 4096) == 4096) {
                }
                i18 = i15;
                i19 = 0;
                if (i71 >= 18) {
                    iArr[i59] = objectFieldOffset;
                    i59++;
                }
                i31 = i18;
                i20 = i19;
                i21 = objectFieldOffset;
            }
            int i96 = i61 + 1;
            iArr4[i61] = i16;
            int i97 = i61 + 2;
            String str = zzd;
            iArr4[i96] = ((charAt24 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? 268435456 : 0) | (i71 << 20) | i21;
            i61 += 3;
            iArr4[i97] = (i20 << 20) | i17;
            iArr3 = iArr4;
            length = i14;
            zzd = str;
            c = 55296;
        }
        return new zzlp(iArr3, objArr, charAt, charAt2, zzlwVar.zza(), z, false, iArr, charAt4, i58, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmy.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmy.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i;
        int zzA;
        int zzB;
        int zzA2;
        int zzv;
        int zzo;
        int i2;
        int zzu;
        boolean z;
        int zzd;
        int zzA3;
        int zzB2;
        int zzA4;
        int zzv2;
        int i3;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < this.zzc.length) {
            int zzB3 = zzB(i6);
            int[] iArr = this.zzc;
            int i9 = iArr[i6];
            int zzA5 = zzA(zzB3);
            if (zzA5 <= 17) {
                int i10 = iArr[i6 + 2];
                int i11 = i10 & i4;
                i = 1 << (i10 >>> 20);
                if (i11 != i5) {
                    i8 = unsafe.getInt(obj, i11);
                    i5 = i11;
                }
            } else {
                i = 0;
            }
            long j = zzB3 & i4;
            switch (zzA5) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 8, i7);
                        break;
                    }
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 4, i7);
                        break;
                    }
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB(j2);
                        i2 = zzB + zzA;
                        i7 += i2;
                        break;
                    }
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB(j3);
                        i2 = zzB + zzA;
                        i7 += i2;
                        break;
                    }
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzv(i12);
                        i2 = zzv + zzA2;
                        i7 += i2;
                        break;
                    }
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 8, i7);
                        break;
                    }
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 4, i7);
                        break;
                    }
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 1, i7);
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzje)) {
                            zzA2 = zzjm.zzA(i9 << 3);
                            zzv = zzjm.zzy((String) object);
                            i2 = zzv + zzA2;
                            i7 += i2;
                            break;
                        } else {
                            int zzA6 = zzjm.zzA(i9 << 3);
                            int zzd2 = ((zzje) object).zzd();
                            i7 = uga0.a(zzd2, zzd2, zzA6, i7);
                            break;
                        }
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzo = zzlz.zzo(i9, unsafe.getObject(obj, j), zzE(i6));
                        i7 += zzo;
                        break;
                    }
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzje zzjeVar = (zzje) unsafe.getObject(obj, j);
                        int zzA7 = zzjm.zzA(i9 << 3);
                        int zzd3 = zzjeVar.zzd();
                        i7 = uga0.a(zzd3, zzd3, zzA7, i7);
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(unsafe.getInt(obj, j), zzjm.zzA(i9 << 3), i7);
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA2 = zzjm.zzA(i9 << 3);
                        zzv = zzjm.zzv(i13);
                        i2 = zzv + zzA2;
                        i7 += i2;
                        break;
                    }
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 4, i7);
                        break;
                    }
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i7 = iub0.a(i9 << 3, 8, i7);
                        break;
                    }
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        i7 = iub0.a((i14 >> 31) ^ (i14 + i14), zzjm.zzA(i9 << 3), i7);
                        break;
                    }
                case 16:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        zzA = zzjm.zzA(i9 << 3);
                        zzB = zzjm.zzB((j4 >> 63) ^ (j4 + j4));
                        i2 = zzB + zzA;
                        i7 += i2;
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        i2 = zzjm.zzu(i9, (zzlm) unsafe.getObject(obj, j), zzE(i6));
                        i7 += i2;
                        break;
                    }
                case 18:
                    zzo = zzlz.zzh(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 19:
                    zzo = zzlz.zzf(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 20:
                    zzo = zzlz.zzm(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 21:
                    zzo = zzlz.zzx(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 22:
                    zzo = zzlz.zzk(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 23:
                    zzo = zzlz.zzh(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 24:
                    zzo = zzlz.zzf(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 25:
                    zzo = zzlz.zza(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzo;
                    break;
                case 26:
                    zzu = zzlz.zzu(i9, (List) unsafe.getObject(obj, j));
                    i7 += zzu;
                    break;
                case 27:
                    zzu = zzlz.zzp(i9, (List) unsafe.getObject(obj, j), zzE(i6));
                    i7 += zzu;
                    break;
                case 28:
                    zzu = zzlz.zzc(i9, (List) unsafe.getObject(obj, j));
                    i7 += zzu;
                    break;
                case 29:
                    zzu = zzlz.zzv(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzu;
                    break;
                case 30:
                    z = false;
                    zzd = zzlz.zzd(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzd;
                    break;
                case 31:
                    z = false;
                    zzd = zzlz.zzf(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzd;
                    break;
                case 32:
                    z = false;
                    zzd = zzlz.zzh(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzd;
                    break;
                case 33:
                    z = false;
                    zzd = zzlz.zzq(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzd;
                    break;
                case 34:
                    z = false;
                    zzd = zzlz.zzs(i9, (List) unsafe.getObject(obj, j), false);
                    i7 += zzd;
                    break;
                case 35:
                    int zzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        i7 = uga0.a(zzi, zzjm.zzz(i9), zzi, i7);
                    }
                    break;
                case 36:
                    int zzg = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzg > 0) {
                        i7 = uga0.a(zzg, zzjm.zzz(i9), zzg, i7);
                    }
                    break;
                case 37:
                    int zzn = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (zzn > 0) {
                        i7 = uga0.a(zzn, zzjm.zzz(i9), zzn, i7);
                    }
                    break;
                case 38:
                    int zzy = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        i7 = uga0.a(zzy, zzjm.zzz(i9), zzy, i7);
                    }
                    break;
                case 39:
                    int zzl = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (zzl > 0) {
                        i7 = uga0.a(zzl, zzjm.zzz(i9), zzl, i7);
                    }
                    break;
                case 40:
                    int zzi2 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 > 0) {
                        i7 = uga0.a(zzi2, zzjm.zzz(i9), zzi2, i7);
                    }
                    break;
                case 41:
                    int zzg2 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 > 0) {
                        i7 = uga0.a(zzg2, zzjm.zzz(i9), zzg2, i7);
                    }
                    break;
                case 42:
                    int zzb2 = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 > 0) {
                        i7 = uga0.a(zzb2, zzjm.zzz(i9), zzb2, i7);
                    }
                    break;
                case 43:
                    int zzw = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (zzw > 0) {
                        i7 = uga0.a(zzw, zzjm.zzz(i9), zzw, i7);
                    }
                    break;
                case 44:
                    int zze = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        i7 = uga0.a(zze, zzjm.zzz(i9), zze, i7);
                    }
                    break;
                case 45:
                    int zzg3 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 > 0) {
                        i7 = uga0.a(zzg3, zzjm.zzz(i9), zzg3, i7);
                    }
                    break;
                case 46:
                    int zzi3 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 > 0) {
                        i7 = uga0.a(zzi3, zzjm.zzz(i9), zzi3, i7);
                    }
                    break;
                case 47:
                    int zzr = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (zzr > 0) {
                        i7 = uga0.a(zzr, zzjm.zzz(i9), zzr, i7);
                    }
                    break;
                case 48:
                    int zzt = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (zzt > 0) {
                        i7 = uga0.a(zzt, zzjm.zzz(i9), zzt, i7);
                    }
                    break;
                case 49:
                    zzu = zzlz.zzj(i9, (List) unsafe.getObject(obj, j), zzE(i6));
                    i7 += zzu;
                    break;
                case 50:
                    zzlh.zza(i9, unsafe.getObject(obj, j), zzF(i6));
                    break;
                case 51:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 8, i7);
                    }
                    break;
                case 52:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 4, i7);
                    }
                    break;
                case 53:
                    if (zzX(obj, i9, i6)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB2 = zzjm.zzB(zzC);
                        i3 = zzB2 + zzA3;
                        i7 += i3;
                    }
                    break;
                case 54:
                    if (zzX(obj, i9, i6)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB2 = zzjm.zzB(zzC2);
                        i3 = zzB2 + zzA3;
                        i7 += i3;
                    }
                    break;
                case 55:
                    if (zzX(obj, i9, i6)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv2 = zzjm.zzv(zzr2);
                        i3 = zzv2 + zzA4;
                        i7 += i3;
                    }
                    break;
                case 56:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 8, i7);
                    }
                    break;
                case 57:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 4, i7);
                    }
                    break;
                case 58:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 1, i7);
                    }
                    break;
                case 59:
                    if (zzX(obj, i9, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzje) {
                            int zzA8 = zzjm.zzA(i9 << 3);
                            int zzd4 = ((zzje) object2).zzd();
                            i7 = uga0.a(zzd4, zzd4, zzA8, i7);
                        } else {
                            zzA4 = zzjm.zzA(i9 << 3);
                            zzv2 = zzjm.zzy((String) object2);
                            i3 = zzv2 + zzA4;
                            i7 += i3;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i9, i6)) {
                        zzu = zzlz.zzo(i9, unsafe.getObject(obj, j), zzE(i6));
                        i7 += zzu;
                    }
                    break;
                case 61:
                    if (zzX(obj, i9, i6)) {
                        zzje zzjeVar2 = (zzje) unsafe.getObject(obj, j);
                        int zzA9 = zzjm.zzA(i9 << 3);
                        int zzd5 = zzjeVar2.zzd();
                        i7 = uga0.a(zzd5, zzd5, zzA9, i7);
                    }
                    break;
                case 62:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(zzr(obj, j), zzjm.zzA(i9 << 3), i7);
                    }
                    break;
                case 63:
                    if (zzX(obj, i9, i6)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjm.zzA(i9 << 3);
                        zzv2 = zzjm.zzv(zzr3);
                        i3 = zzv2 + zzA4;
                        i7 += i3;
                    }
                    break;
                case 64:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 4, i7);
                    }
                    break;
                case 65:
                    if (zzX(obj, i9, i6)) {
                        i7 = iub0.a(i9 << 3, 8, i7);
                    }
                    break;
                case 66:
                    if (zzX(obj, i9, i6)) {
                        int zzr4 = zzr(obj, j);
                        i7 = iub0.a((zzr4 >> 31) ^ (zzr4 + zzr4), zzjm.zzA(i9 << 3), i7);
                    }
                    break;
                case 67:
                    if (zzX(obj, i9, i6)) {
                        long zzC3 = zzC(obj, j);
                        zzA3 = zzjm.zzA(i9 << 3);
                        zzB2 = zzjm.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i3 = zzB2 + zzA3;
                        i7 += i3;
                    }
                    break;
                case 68:
                    if (zzX(obj, i9, i6)) {
                        i3 = zzjm.zzu(i9, (zzlm) unsafe.getObject(obj, j), zzE(i6));
                        i7 += i3;
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int zza2 = i7 + zzmoVar.zza(zzmoVar.zzd(obj));
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
        int zzu;
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzB2 = zzB(i2);
            int zzA3 = zzA(zzB2);
            int i3 = this.zzc[i2];
            long j = zzB2 & 1048575;
            if (zzA3 >= zzjx.zzJ.zza() && zzA3 <= zzjx.zzW.zza()) {
                int i4 = this.zzc[i2 + 2];
            }
            switch (zzA3) {
                case 0:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i2)) {
                        long zzd = zzmy.zzd(obj, j);
                        zzA = zzjm.zzA(i3 << 3);
                        zzB = zzjm.zzB(zzd);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i2)) {
                        long zzd2 = zzmy.zzd(obj, j);
                        zzA = zzjm.zzA(i3 << 3);
                        zzB = zzjm.zzB(zzd2);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i2)) {
                        int zzc = zzmy.zzc(obj, j);
                        zzA2 = zzjm.zzA(i3 << 3);
                        zzv = zzjm.zzv(zzc);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj, i2)) {
                        Object zzf = zzmy.zzf(obj, j);
                        if (zzf instanceof zzje) {
                            int zzA4 = zzjm.zzA(i3 << 3);
                            int zzd3 = ((zzje) zzf).zzd();
                            i = uga0.a(zzd3, zzd3, zzA4, i);
                            break;
                        } else {
                            zzA2 = zzjm.zzA(i3 << 3);
                            zzv = zzjm.zzy((String) zzf);
                            zzu = zzv + zzA2;
                            i += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (zzT(obj, i2)) {
                        zzo = zzlz.zzo(i3, zzmy.zzf(obj, j), zzE(i2));
                        i += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i2)) {
                        zzje zzjeVar = (zzje) zzmy.zzf(obj, j);
                        int zzA5 = zzjm.zzA(i3 << 3);
                        int zzd4 = zzjeVar.zzd();
                        i = uga0.a(zzd4, zzd4, zzA5, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i2)) {
                        i = iub0.a(zzmy.zzc(obj, j), zzjm.zzA(i3 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i2)) {
                        int zzc2 = zzmy.zzc(obj, j);
                        zzA2 = zzjm.zzA(i3 << 3);
                        zzv = zzjm.zzv(zzc2);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i2)) {
                        i = iub0.a(i3 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i2)) {
                        int zzc3 = zzmy.zzc(obj, j);
                        i = iub0.a((zzc3 >> 31) ^ (zzc3 + zzc3), zzjm.zzA(i3 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i2)) {
                        long zzd5 = zzmy.zzd(obj, j);
                        zzA = zzjm.zzA(i3 << 3);
                        zzB = zzjm.zzB((zzd5 >> 63) ^ (zzd5 + zzd5));
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i2)) {
                        zzu = zzjm.zzu(i3, (zzlm) zzmy.zzf(obj, j), zzE(i2));
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlz.zzh(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 19:
                    zzo = zzlz.zzf(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 20:
                    zzo = zzlz.zzm(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 21:
                    zzo = zzlz.zzx(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 22:
                    zzo = zzlz.zzk(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 23:
                    zzo = zzlz.zzh(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 24:
                    zzo = zzlz.zzf(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 25:
                    zzo = zzlz.zza(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 26:
                    zzo = zzlz.zzu(i3, (List) zzmy.zzf(obj, j));
                    i += zzo;
                    break;
                case 27:
                    zzo = zzlz.zzp(i3, (List) zzmy.zzf(obj, j), zzE(i2));
                    i += zzo;
                    break;
                case 28:
                    zzo = zzlz.zzc(i3, (List) zzmy.zzf(obj, j));
                    i += zzo;
                    break;
                case 29:
                    zzo = zzlz.zzv(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 30:
                    zzo = zzlz.zzd(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 31:
                    zzo = zzlz.zzf(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 32:
                    zzo = zzlz.zzh(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 33:
                    zzo = zzlz.zzq(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 34:
                    zzo = zzlz.zzs(i3, (List) zzmy.zzf(obj, j), false);
                    i += zzo;
                    break;
                case 35:
                    int zzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        i = uga0.a(zzi, zzjm.zzz(i3), zzi, i);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int zzg = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzg > 0) {
                        i = uga0.a(zzg, zzjm.zzz(i3), zzg, i);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int zzn = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (zzn > 0) {
                        i = uga0.a(zzn, zzjm.zzz(i3), zzn, i);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int zzy = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (zzy > 0) {
                        i = uga0.a(zzy, zzjm.zzz(i3), zzy, i);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int zzl = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (zzl > 0) {
                        i = uga0.a(zzl, zzjm.zzz(i3), zzl, i);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int zzi2 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 > 0) {
                        i = uga0.a(zzi2, zzjm.zzz(i3), zzi2, i);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int zzg2 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 > 0) {
                        i = uga0.a(zzg2, zzjm.zzz(i3), zzg2, i);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int zzb2 = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 > 0) {
                        i = uga0.a(zzb2, zzjm.zzz(i3), zzb2, i);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int zzw = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (zzw > 0) {
                        i = uga0.a(zzw, zzjm.zzz(i3), zzw, i);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int zze = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (zze > 0) {
                        i = uga0.a(zze, zzjm.zzz(i3), zze, i);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int zzg3 = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 > 0) {
                        i = uga0.a(zzg3, zzjm.zzz(i3), zzg3, i);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int zzi3 = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 > 0) {
                        i = uga0.a(zzi3, zzjm.zzz(i3), zzi3, i);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int zzr = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (zzr > 0) {
                        i = uga0.a(zzr, zzjm.zzz(i3), zzr, i);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int zzt = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (zzt > 0) {
                        i = uga0.a(zzt, zzjm.zzz(i3), zzt, i);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlz.zzj(i3, (List) zzmy.zzf(obj, j), zzE(i2));
                    i += zzo;
                    break;
                case 50:
                    zzlh.zza(i3, zzmy.zzf(obj, j), zzF(i2));
                    break;
                case 51:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i3, i2)) {
                        long zzC = zzC(obj, j);
                        zzA = zzjm.zzA(i3 << 3);
                        zzB = zzjm.zzB(zzC);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i3, i2)) {
                        long zzC2 = zzC(obj, j);
                        zzA = zzjm.zzA(i3 << 3);
                        zzB = zzjm.zzB(zzC2);
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i3, i2)) {
                        int zzr2 = zzr(obj, j);
                        zzA2 = zzjm.zzA(i3 << 3);
                        zzv = zzjm.zzv(zzr2);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 1, i);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i3, i2)) {
                        Object zzf2 = zzmy.zzf(obj, j);
                        if (zzf2 instanceof zzje) {
                            int zzA6 = zzjm.zzA(i3 << 3);
                            int zzd6 = ((zzje) zzf2).zzd();
                            i = uga0.a(zzd6, zzd6, zzA6, i);
                            break;
                        } else {
                            zzA2 = zzjm.zzA(i3 << 3);
                            zzv = zzjm.zzy((String) zzf2);
                            zzu = zzv + zzA2;
                            i += zzu;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i3, i2)) {
                        zzo = zzlz.zzo(i3, zzmy.zzf(obj, j), zzE(i2));
                        i += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i3, i2)) {
                        zzje zzjeVar2 = (zzje) zzmy.zzf(obj, j);
                        int zzA7 = zzjm.zzA(i3 << 3);
                        int zzd7 = zzjeVar2.zzd();
                        i = uga0.a(zzd7, zzd7, zzA7, i);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(zzr(obj, j), zzjm.zzA(i3 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i3, i2)) {
                        int zzr3 = zzr(obj, j);
                        zzA2 = zzjm.zzA(i3 << 3);
                        zzv = zzjm.zzv(zzr3);
                        zzu = zzv + zzA2;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 4, i);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i3, i2)) {
                        i = iub0.a(i3 << 3, 8, i);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i3, i2)) {
                        int zzr4 = zzr(obj, j);
                        i = iub0.a((zzr4 >> 31) ^ (zzr4 + zzr4), zzjm.zzA(i3 << 3), i);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i3, i2)) {
                        long zzC3 = zzC(obj, j);
                        zzA = zzjm.zzA(i3 << 3);
                        zzB = zzjm.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzu = zzB + zzA;
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i3, i2)) {
                        zzu = zzjm.zzu(i3, (zzlm) zzmy.zzf(obj, j), zzE(i2));
                        i += zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmo zzmoVar = this.zzn;
        return i + zzmoVar.zza(zzmoVar.zzd(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmy.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzb2 = zzlg.zza().zzb();
            zzlh.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws IOException {
        int i9;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int zzm = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Long.valueOf(zzirVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return zzm;
            case 55:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int zzj = zzis.zzj(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzirVar.zza));
                unsafe.putInt(obj, j2, i4);
                return zzj;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzis.zzp(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzis.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int zzm2 = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzirVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return zzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int zzj2 = zzis.zzj(bArr, i, zzirVar);
                int i10 = zzirVar.zza;
                if (i10 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 && !zznd.zzf(bArr, zzj2, zzj2 + i10)) {
                        throw zzkp.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, zzj2, i10, zzkn.zzb));
                    zzj2 += i10;
                }
                unsafe.putInt(obj, j2, i4);
                return zzj2;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object zzH = zzH(obj, i4, i8);
                    int zzo = zzis.zzo(zzH, zzE(i8), bArr, i9, i2, zzirVar);
                    zzP(obj, i4, i8, zzH);
                    return zzo;
                }
                break;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int zza2 = zzis.zza(bArr, i9, zzirVar);
                    unsafe.putObject(obj, j, zzirVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                i9 = i;
                if (i5 == 0) {
                    int zzj3 = zzis.zzj(bArr, i9, zzirVar);
                    int i11 = zzirVar.zza;
                    zzkj zzD = zzD(i8);
                    if (zzD != null && !zzD.zza(i11)) {
                        zzd(obj).zzj(i3, Long.valueOf(i11));
                        return zzj3;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i11));
                    unsafe.putInt(obj, j2, i4);
                    return zzj3;
                }
                break;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int zzj4 = zzis.zzj(bArr, i9, zzirVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int zzm3 = zzis.zzm(bArr, i9, zzirVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    Object zzH2 = zzH(obj, i4, i8);
                    int zzn = zzis.zzn(zzH2, zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                    zzP(obj, i4, i8, zzH2);
                    return zzn;
                }
            default:
                return i;
        }
        return i9;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        Object obj2;
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr2;
        zzir zzirVar2;
        int i8;
        int i9;
        Object obj3;
        zzir zzirVar3;
        byte[] bArr3;
        Unsafe unsafe2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzlp<T> zzlpVar = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i16 = i2;
        zzir zzirVar4 = zzirVar;
        zzJ(obj4);
        Unsafe unsafe3 = zzb;
        int i17 = -1;
        int i18 = i;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        int i22 = 1048575;
        while (i18 < i16) {
            int i23 = i18 + 1;
            int i24 = bArr4[i18];
            if (i24 < 0) {
                i23 = zzis.zzk(i24, bArr4, i23, zzirVar4);
                i24 = zzirVar4.zza;
            }
            int i25 = i24 >>> 3;
            int i26 = i24 & 7;
            int zzx = i25 > i19 ? zzlpVar.zzx(i25, i20 / 3) : zzlpVar.zzw(i25);
            if (zzx == i17) {
                obj2 = obj4;
                unsafe = unsafe3;
                i3 = i24;
                i4 = i23;
                i5 = i17;
                i6 = i25;
                i7 = 0;
            } else {
                int[] iArr = zzlpVar.zzc;
                int i27 = iArr[zzx + 1];
                int zzA = zzA(i27);
                int i28 = i24;
                int i29 = zzx;
                long j = i27 & 1048575;
                if (zzA <= 17) {
                    int i30 = iArr[i29 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i22) {
                        int i33 = 1048575;
                        if (i22 != 1048575) {
                            unsafe3.putInt(obj4, i22, i21);
                            i33 = 1048575;
                        }
                        if (i32 != i33) {
                            i21 = unsafe3.getInt(obj4, i32);
                        }
                        i22 = i32;
                    }
                    switch (zzA) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i8 = i23;
                            i9 = i29;
                            if (i26 != 1) {
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                zzmy.zzo(obj4, j, Double.longBitsToDouble(zzis.zzp(bArr5, i8)));
                                i18 = i8 + 8;
                                i21 |= i31;
                                i16 = i2;
                                i19 = i25;
                                bArr4 = bArr5;
                                i20 = i9;
                                i17 = -1;
                                zzirVar4 = zzirVar;
                                break;
                            }
                        case 1:
                            zzir zzirVar5 = zzirVar4;
                            bArr2 = bArr4;
                            zzirVar2 = zzirVar5;
                            i8 = i23;
                            i9 = i29;
                            if (i26 != 5) {
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                zzmy.zzp(obj4, j, Float.intBitsToFloat(zzis.zzb(bArr2, i8)));
                                i18 = i8 + 4;
                                i21 |= i31;
                                byte[] bArr6 = bArr2;
                                zzirVar4 = zzirVar2;
                                bArr4 = bArr6;
                                i16 = i2;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            zzir zzirVar6 = zzirVar4;
                            byte[] bArr7 = bArr4;
                            i8 = i23;
                            i9 = i29;
                            if (i26 != 0) {
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int zzm = zzis.zzm(bArr7, i8, zzirVar6);
                                Unsafe unsafe4 = unsafe3;
                                Object obj5 = obj4;
                                unsafe4.putLong(obj5, j, zzirVar6.zzb);
                                unsafe3 = unsafe4;
                                obj4 = obj5;
                                i21 |= i31;
                                zzirVar4 = zzirVar6;
                                bArr4 = bArr7;
                                i18 = zzm;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            zzir zzirVar7 = zzirVar4;
                            byte[] bArr8 = bArr4;
                            i8 = i23;
                            i9 = i29;
                            if (i26 != 0) {
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int zzj = zzis.zzj(bArr8, i8, zzirVar7);
                                unsafe3.putInt(obj4, j, zzirVar7.zza);
                                i21 |= i31;
                                zzirVar4 = zzirVar7;
                                bArr4 = bArr8;
                                i16 = i2;
                                i18 = zzj;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            Object obj6 = obj4;
                            zzir zzirVar8 = zzirVar4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i34 = i23;
                            i9 = i29;
                            if (i26 != 1) {
                                obj4 = obj6;
                                i8 = i34;
                                unsafe3 = unsafe5;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                zzirVar2 = zzirVar8;
                                unsafe5.putLong(obj6, j, zzis.zzp(bArr2, i34));
                                unsafe3 = unsafe5;
                                obj4 = obj6;
                                i18 = i34 + 8;
                                i21 |= i31;
                                byte[] bArr62 = bArr2;
                                zzirVar4 = zzirVar2;
                                bArr4 = bArr62;
                                i16 = i2;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            byte[] bArr10 = bArr4;
                            obj3 = obj4;
                            zzirVar3 = zzirVar4;
                            bArr3 = bArr10;
                            unsafe2 = unsafe3;
                            i10 = i23;
                            i9 = i29;
                            if (i26 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe6;
                                obj4 = obj3;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                unsafe2.putInt(obj3, j, zzis.zzb(bArr3, i10));
                                i18 = i10 + 4;
                                i21 |= i31;
                                byte[] bArr11 = bArr3;
                                zzirVar4 = zzirVar3;
                                obj4 = obj3;
                                bArr4 = bArr11;
                                unsafe3 = unsafe2;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 7:
                            byte[] bArr12 = bArr4;
                            obj3 = obj4;
                            zzir zzirVar9 = zzirVar4;
                            unsafe2 = unsafe3;
                            i10 = i23;
                            i9 = i29;
                            if (i26 != 0) {
                                Unsafe unsafe62 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe62;
                                obj4 = obj3;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int zzm2 = zzis.zzm(bArr12, i10, zzirVar9);
                                zzmy.zzm(obj3, j, zzirVar9.zzb != 0);
                                i21 |= i31;
                                zzirVar4 = zzirVar9;
                                obj4 = obj3;
                                bArr4 = bArr12;
                                i18 = zzm2;
                                unsafe3 = unsafe2;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 8:
                            byte[] bArr13 = bArr4;
                            obj3 = obj4;
                            zzirVar3 = zzirVar4;
                            bArr3 = bArr13;
                            unsafe2 = unsafe3;
                            i10 = i23;
                            i9 = i29;
                            if (i26 != 2) {
                                Unsafe unsafe622 = unsafe2;
                                i8 = i10;
                                unsafe3 = unsafe622;
                                obj4 = obj3;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                i18 = (536870912 & i27) == 0 ? zzis.zzg(bArr3, i10, zzirVar3) : zzis.zzh(bArr3, i10, zzirVar3);
                                unsafe2.putObject(obj3, j, zzirVar3.zzc);
                                i21 |= i31;
                                byte[] bArr112 = bArr3;
                                zzirVar4 = zzirVar3;
                                obj4 = obj3;
                                bArr4 = bArr112;
                                unsafe3 = unsafe2;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 9:
                            i9 = i29;
                            if (i26 != 2) {
                                obj4 = obj4;
                                i8 = i23;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                Object obj7 = obj4;
                                Object zzG = zzlpVar.zzG(obj7, i9);
                                byte[] bArr14 = bArr4;
                                int i35 = i16;
                                unsafe2 = unsafe3;
                                int i36 = i23;
                                zzir zzirVar10 = zzirVar4;
                                int zzo = zzis.zzo(zzG, zzlpVar.zzE(i9), bArr14, i36, i35, zzirVar10);
                                zzlpVar.zzO(obj7, i9, zzG);
                                i21 |= i31;
                                zzirVar4 = zzirVar10;
                                obj4 = obj7;
                                bArr4 = bArr14;
                                i18 = zzo;
                                unsafe3 = unsafe2;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                i16 = i2;
                                break;
                            }
                        case 10:
                            i9 = i29;
                            if (i26 != 2) {
                                i8 = i23;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                i18 = zzis.zza(bArr4, i23, zzirVar4);
                                unsafe3.putObject(obj4, j, zzirVar4.zzc);
                                i21 |= i31;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        case 12:
                            i9 = i29;
                            if (i26 != 0) {
                                i8 = i23;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                i18 = zzis.zzj(bArr4, i23, zzirVar4);
                                unsafe3.putInt(obj4, j, zzirVar4.zza);
                                i21 |= i31;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        case 15:
                            i9 = i29;
                            if (i26 != 0) {
                                i8 = i23;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                i18 = zzis.zzj(bArr4, i23, zzirVar4);
                                unsafe3.putInt(obj4, j, zzji.zzb(zzirVar4.zza));
                                i21 |= i31;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        case 16:
                            if (i26 != 0) {
                                i9 = i29;
                                i8 = i23;
                                i3 = i28;
                                unsafe = unsafe3;
                                i4 = i8;
                                i6 = i25;
                                i7 = i9;
                                i5 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int zzm3 = zzis.zzm(bArr4, i23, zzirVar4);
                                Unsafe unsafe7 = unsafe3;
                                Object obj8 = obj4;
                                i9 = i29;
                                unsafe7.putLong(obj8, j, zzji.zzc(zzirVar4.zzb));
                                unsafe3 = unsafe7;
                                obj4 = obj8;
                                i21 |= i31;
                                i18 = zzm3;
                                i19 = i25;
                                i20 = i9;
                                i17 = -1;
                                break;
                            }
                        default:
                            i8 = i23;
                            i9 = i29;
                            i3 = i28;
                            unsafe = unsafe3;
                            i4 = i8;
                            i6 = i25;
                            i7 = i9;
                            i5 = -1;
                            obj2 = obj4;
                            break;
                    }
                } else {
                    int i37 = i23;
                    byte[] bArr15 = bArr4;
                    if (zzA != 27) {
                        i7 = i29;
                        i11 = i37;
                        Unsafe unsafe8 = unsafe3;
                        if (zzA <= 49) {
                            unsafe = unsafe8;
                            i13 = i21;
                            i5 = -1;
                            i12 = i22;
                            int zzv = zzlpVar.zzv(obj, bArr, i11, i2, i28, i25, i26, i7, i27, zzA, j, zzirVar);
                            i15 = i28;
                            i14 = i25;
                            if (zzv != i11) {
                                zzlpVar = this;
                                obj4 = obj;
                                i16 = i2;
                                zzirVar4 = zzirVar;
                                i18 = zzv;
                                i19 = i14;
                                i22 = i12;
                                i17 = -1;
                                i20 = i7;
                                i21 = i13;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                obj2 = obj;
                                i4 = zzv;
                                i6 = i14;
                                i3 = i15;
                            }
                        } else {
                            unsafe = unsafe8;
                            i13 = i21;
                            i5 = -1;
                            i15 = i28;
                            i12 = i22;
                            i14 = i25;
                            if (zzA != 50) {
                                i6 = i14;
                                int zzt = zzt(obj, bArr, i11, i2, i15, i6, i26, i27, zzA, j, i7, zzirVar);
                                obj2 = obj;
                                if (zzt != i11) {
                                    zzlpVar = this;
                                    zzirVar4 = zzirVar;
                                    i19 = i6;
                                    i18 = zzt;
                                    obj4 = obj2;
                                    i22 = i12;
                                    i17 = -1;
                                    i20 = i7;
                                    i21 = i13;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i16 = i2;
                                } else {
                                    i3 = i15;
                                    i4 = zzt;
                                }
                            } else if (i26 == 2) {
                                int zzs = zzs(obj, bArr, i11, i2, i7, j, zzirVar);
                                if (zzs != i11) {
                                    zzlpVar = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i16 = i2;
                                    zzirVar4 = zzirVar;
                                    i18 = zzs;
                                    i19 = i14;
                                    i22 = i12;
                                    i17 = -1;
                                    i20 = i7;
                                    i21 = i13;
                                    unsafe3 = unsafe;
                                } else {
                                    obj2 = obj;
                                    i4 = zzs;
                                    i6 = i14;
                                    i3 = i15;
                                }
                            } else {
                                obj2 = obj;
                                i4 = i11;
                                i6 = i14;
                                i3 = i15;
                            }
                        }
                    } else if (i26 == 2) {
                        zzkm zzkmVar = (zzkm) unsafe3.getObject(obj4, j);
                        if (!zzkmVar.zzc()) {
                            int size = zzkmVar.size();
                            zzkmVar = zzkmVar.zzd(size == 0 ? 10 : size + size);
                            unsafe3.putObject(obj4, j, zzkmVar);
                        }
                        int zze = zzis.zze(zzlpVar.zzE(i29), i28, bArr15, i37, i2, zzkmVar, zzirVar);
                        bArr4 = bArr;
                        zzirVar4 = zzirVar;
                        i18 = zze;
                        unsafe3 = unsafe3;
                        i19 = i25;
                        i20 = i29;
                        i17 = -1;
                        obj4 = obj;
                        i16 = i2;
                    } else {
                        i7 = i29;
                        i11 = i37;
                        unsafe = unsafe3;
                        i12 = i22;
                        i13 = i21;
                        i14 = i25;
                        i5 = -1;
                        i15 = i28;
                        obj2 = obj;
                        i4 = i11;
                        i6 = i14;
                        i3 = i15;
                    }
                    i22 = i12;
                    i21 = i13;
                }
            }
            int zzi = zzis.zzi(i3, bArr, i4, i2, zzd(obj2), zzirVar);
            bArr4 = bArr;
            zzirVar4 = zzirVar;
            i19 = i6;
            obj4 = obj2;
            i17 = i5;
            i20 = i7;
            unsafe3 = unsafe;
            i16 = i2;
            i18 = zzi;
            zzlpVar = this;
        }
        Unsafe unsafe9 = unsafe3;
        int i38 = i16;
        int i39 = i22;
        int i40 = i21;
        Object obj9 = obj4;
        if (i39 != 1048575) {
            unsafe9.putInt(obj9, i39, i40);
        }
        if (i18 == i38) {
            return i18;
        }
        throw zzkp.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzir zzirVar) throws IOException {
        int zzl;
        Unsafe unsafe = zzb;
        zzkm zzkmVar = (zzkm) unsafe.getObject(obj, j2);
        if (!zzkmVar.zzc()) {
            int size = zzkmVar.size();
            zzkmVar = zzkmVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkmVar);
        }
        zzkm zzkmVar2 = zzkmVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjo zzjoVar = (zzjo) zzkmVar2;
                    int zzj = zzis.zzj(bArr, i, zzirVar);
                    int i8 = zzirVar.zza + zzj;
                    while (zzj < i8) {
                        zzjoVar.zze(Double.longBitsToDouble(zzis.zzp(bArr, zzj)));
                        zzj += 8;
                    }
                    if (zzj == i8) {
                        return zzj;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzjo zzjoVar2 = (zzjo) zzkmVar2;
                    zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, i)));
                    int i9 = i + 8;
                    while (i9 < i2) {
                        int zzj2 = zzis.zzj(bArr, i9, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i9;
                        }
                        zzjoVar2.zze(Double.longBitsToDouble(zzis.zzp(bArr, zzj2)));
                        i9 = zzj2 + 8;
                    }
                    return i9;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjy zzjyVar = (zzjy) zzkmVar2;
                    int zzj3 = zzis.zzj(bArr, i, zzirVar);
                    int i10 = zzirVar.zza + zzj3;
                    while (zzj3 < i10) {
                        zzjyVar.zze(Float.intBitsToFloat(zzis.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i10) {
                        return zzj3;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzjy zzjyVar2 = (zzjy) zzkmVar2;
                    zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, i)));
                    int i11 = i + 4;
                    while (i11 < i2) {
                        int zzj4 = zzis.zzj(bArr, i11, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i11;
                        }
                        zzjyVar2.zze(Float.intBitsToFloat(zzis.zzb(bArr, zzj4)));
                        i11 = zzj4 + 4;
                    }
                    return i11;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzlb zzlbVar = (zzlb) zzkmVar2;
                    int zzj5 = zzis.zzj(bArr, i, zzirVar);
                    int i12 = zzirVar.zza + zzj5;
                    while (zzj5 < i12) {
                        zzj5 = zzis.zzm(bArr, zzj5, zzirVar);
                        zzlbVar.zzg(zzirVar.zzb);
                    }
                    if (zzj5 == i12) {
                        return zzj5;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar2 = (zzlb) zzkmVar2;
                    int zzm = zzis.zzm(bArr, i, zzirVar);
                    zzlbVar2.zzg(zzirVar.zzb);
                    while (zzm < i2) {
                        int zzj6 = zzis.zzj(bArr, zzm, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzm;
                        }
                        zzm = zzis.zzm(bArr, zzj6, zzirVar);
                        zzlbVar2.zzg(zzirVar.zzb);
                    }
                    return zzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzis.zzf(bArr, i, zzkmVar2, zzirVar);
                }
                if (i5 == 0) {
                    return zzis.zzl(i3, bArr, i, i2, zzkmVar2, zzirVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzlb zzlbVar3 = (zzlb) zzkmVar2;
                    int zzj7 = zzis.zzj(bArr, i, zzirVar);
                    int i13 = zzirVar.zza + zzj7;
                    while (zzj7 < i13) {
                        zzlbVar3.zzg(zzis.zzp(bArr, zzj7));
                        zzj7 += 8;
                    }
                    if (zzj7 == i13) {
                        return zzj7;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 1) {
                    zzlb zzlbVar4 = (zzlb) zzkmVar2;
                    zzlbVar4.zzg(zzis.zzp(bArr, i));
                    int i14 = i + 8;
                    while (i14 < i2) {
                        int zzj8 = zzis.zzj(bArr, i14, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i14;
                        }
                        zzlbVar4.zzg(zzis.zzp(bArr, zzj8));
                        i14 = zzj8 + 8;
                    }
                    return i14;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkg zzkgVar = (zzkg) zzkmVar2;
                    int zzj9 = zzis.zzj(bArr, i, zzirVar);
                    int i15 = zzirVar.zza + zzj9;
                    while (zzj9 < i15) {
                        zzkgVar.zzh(zzis.zzb(bArr, zzj9));
                        zzj9 += 4;
                    }
                    if (zzj9 == i15) {
                        return zzj9;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 5) {
                    zzkg zzkgVar2 = (zzkg) zzkmVar2;
                    zzkgVar2.zzh(zzis.zzb(bArr, i));
                    int i16 = i + 4;
                    while (i16 < i2) {
                        int zzj10 = zzis.zzj(bArr, i16, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return i16;
                        }
                        zzkgVar2.zzh(zzis.zzb(bArr, zzj10));
                        i16 = zzj10 + 4;
                    }
                    return i16;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzit zzitVar = (zzit) zzkmVar2;
                    int zzj11 = zzis.zzj(bArr, i, zzirVar);
                    int i17 = zzirVar.zza + zzj11;
                    while (zzj11 < i17) {
                        zzj11 = zzis.zzm(bArr, zzj11, zzirVar);
                        zzitVar.zze(zzirVar.zzb != 0);
                    }
                    if (zzj11 == i17) {
                        return zzj11;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzit zzitVar2 = (zzit) zzkmVar2;
                    int zzm2 = zzis.zzm(bArr, i, zzirVar);
                    zzitVar2.zze(zzirVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj12 = zzis.zzj(bArr, zzm2, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzis.zzm(bArr, zzj12, zzirVar);
                        zzitVar2.zze(zzirVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj13 = zzis.zzj(bArr, i, zzirVar);
                        int i18 = zzirVar.zza;
                        if (i18 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i18 == 0) {
                            zzkmVar2.add("");
                        } else {
                            zzkmVar2.add(new String(bArr, zzj13, i18, zzkn.zzb));
                            zzj13 += i18;
                        }
                        while (zzj13 < i2) {
                            int zzj14 = zzis.zzj(bArr, zzj13, zzirVar);
                            if (i3 != zzirVar.zza) {
                                return zzj13;
                            }
                            zzj13 = zzis.zzj(bArr, zzj14, zzirVar);
                            int i19 = zzirVar.zza;
                            if (i19 < 0) {
                                throw zzkp.zzd();
                            }
                            if (i19 == 0) {
                                zzkmVar2.add("");
                            } else {
                                zzkmVar2.add(new String(bArr, zzj13, i19, zzkn.zzb));
                                zzj13 += i19;
                            }
                        }
                        return zzj13;
                    }
                    int zzj15 = zzis.zzj(bArr, i, zzirVar);
                    int i20 = zzirVar.zza;
                    if (i20 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i20 == 0) {
                        zzkmVar2.add("");
                    } else {
                        int i21 = zzj15 + i20;
                        if (!zznd.zzf(bArr, zzj15, i21)) {
                            throw zzkp.zzc();
                        }
                        zzkmVar2.add(new String(bArr, zzj15, i20, zzkn.zzb));
                        zzj15 = i21;
                    }
                    while (zzj15 < i2) {
                        int zzj16 = zzis.zzj(bArr, zzj15, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzj15;
                        }
                        zzj15 = zzis.zzj(bArr, zzj16, zzirVar);
                        int i22 = zzirVar.zza;
                        if (i22 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i22 == 0) {
                            zzkmVar2.add("");
                        } else {
                            int i23 = zzj15 + i22;
                            if (!zznd.zzf(bArr, zzj15, i23)) {
                                throw zzkp.zzc();
                            }
                            zzkmVar2.add(new String(bArr, zzj15, i22, zzkn.zzb));
                            zzj15 = i23;
                        }
                    }
                    return zzj15;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzis.zze(zzE(i6), i3, bArr, i, i2, zzkmVar2, zzirVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int zzj17 = zzis.zzj(bArr, i, zzirVar);
                    int i24 = zzirVar.zza;
                    if (i24 < 0) {
                        throw zzkp.zzd();
                    }
                    if (i24 > bArr.length - zzj17) {
                        throw zzkp.zzf();
                    }
                    if (i24 == 0) {
                        zzkmVar2.add(zzje.zzb);
                    } else {
                        zzkmVar2.add(zzje.zzl(bArr, zzj17, i24));
                        zzj17 += i24;
                    }
                    while (zzj17 < i2) {
                        int zzj18 = zzis.zzj(bArr, zzj17, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzj17;
                        }
                        zzj17 = zzis.zzj(bArr, zzj18, zzirVar);
                        int i25 = zzirVar.zza;
                        if (i25 < 0) {
                            throw zzkp.zzd();
                        }
                        if (i25 > bArr.length - zzj17) {
                            throw zzkp.zzf();
                        }
                        if (i25 == 0) {
                            zzkmVar2.add(zzje.zzb);
                        } else {
                            zzkmVar2.add(zzje.zzl(bArr, zzj17, i25));
                            zzj17 += i25;
                        }
                    }
                    return zzj17;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzl = zzis.zzl(i3, bArr, i, i2, zzkmVar2, zzirVar);
                    }
                    return i;
                }
                zzl = zzis.zzf(bArr, i, zzkmVar2, zzirVar);
                zzlz.zzC(obj, i4, zzkmVar2, zzD(i6), null, this.zzn);
                return zzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkg zzkgVar3 = (zzkg) zzkmVar2;
                    int zzj19 = zzis.zzj(bArr, i, zzirVar);
                    int i26 = zzirVar.zza + zzj19;
                    while (zzj19 < i26) {
                        zzj19 = zzis.zzj(bArr, zzj19, zzirVar);
                        zzkgVar3.zzh(zzji.zzb(zzirVar.zza));
                    }
                    if (zzj19 == i26) {
                        return zzj19;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzkg zzkgVar4 = (zzkg) zzkmVar2;
                    int zzj20 = zzis.zzj(bArr, i, zzirVar);
                    zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    while (zzj20 < i2) {
                        int zzj21 = zzis.zzj(bArr, zzj20, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzj20;
                        }
                        zzj20 = zzis.zzj(bArr, zzj21, zzirVar);
                        zzkgVar4.zzh(zzji.zzb(zzirVar.zza));
                    }
                    return zzj20;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzlb zzlbVar5 = (zzlb) zzkmVar2;
                    int zzj22 = zzis.zzj(bArr, i, zzirVar);
                    int i27 = zzirVar.zza + zzj22;
                    while (zzj22 < i27) {
                        zzj22 = zzis.zzm(bArr, zzj22, zzirVar);
                        zzlbVar5.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    if (zzj22 == i27) {
                        return zzj22;
                    }
                    throw zzkp.zzf();
                }
                if (i5 == 0) {
                    zzlb zzlbVar6 = (zzlb) zzkmVar2;
                    int zzm3 = zzis.zzm(bArr, i, zzirVar);
                    zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    while (zzm3 < i2) {
                        int zzj23 = zzis.zzj(bArr, zzm3, zzirVar);
                        if (i3 != zzirVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzis.zzm(bArr, zzj23, zzirVar);
                        zzlbVar6.zzg(zzji.zzc(zzirVar.zzb));
                    }
                    return zzm3;
                }
                return i;
            default:
                if (i5 == 3) {
                    zzlx zzE = zzE(i6);
                    int i28 = (i3 & (-8)) | 4;
                    int zzc = zzis.zzc(zzE, bArr, i, i2, i28, zzirVar);
                    zzlx zzlxVar = zzE;
                    zzir zzirVar2 = zzirVar;
                    zzkmVar2.add(zzirVar2.zzc);
                    while (zzc < i2) {
                        int zzj24 = zzis.zzj(bArr, zzc, zzirVar2);
                        if (i3 != zzirVar2.zza) {
                            return zzc;
                        }
                        zzlx zzlxVar2 = zzlxVar;
                        zzir zzirVar3 = zzirVar2;
                        zzc = zzis.zzc(zzlxVar2, bArr, zzj24, i2, i28, zzirVar3);
                        zzkmVar2.add(zzirVar3.zzc);
                        zzlxVar = zzlxVar2;
                        zzirVar2 = zzirVar3;
                    }
                    return zzc;
                }
                return i;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int i2;
        int zzc2;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzB = zzB(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzB;
            int i6 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i = i3 * 53;
                    zzc = zzkn.zzc(Double.doubleToLongBits(zzmy.zza(obj, j)));
                    i3 = zzc + i;
                    break;
                case 1:
                    i = i3 * 53;
                    zzc = Float.floatToIntBits(zzmy.zzb(obj, j));
                    i3 = zzc + i;
                    break;
                case 2:
                    i = i3 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 3:
                    i = i3 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    zzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 5:
                    i = i3 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    zzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 7:
                    i = i3 * 53;
                    zzc = zzkn.zza(zzmy.zzw(obj, j));
                    i3 = zzc + i;
                    break;
                case 8:
                    i = i3 * 53;
                    zzc = ((String) zzmy.zzf(obj, j)).hashCode();
                    i3 = zzc + i;
                    break;
                case 9:
                    Object zzf = zzmy.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    zzc = zzmy.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    zzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 12:
                    i2 = i3 * 53;
                    zzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 13:
                    i2 = i3 * 53;
                    zzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 14:
                    i = i3 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    zzc2 = zzmy.zzc(obj, j);
                    i3 = i2 + zzc2;
                    break;
                case 16:
                    i = i3 * 53;
                    zzc = zzkn.zzc(zzmy.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 17:
                    Object zzf2 = zzmy.zzf(obj, j);
                    if (zzf2 != null) {
                        i6 = zzf2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
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
                    i = i3 * 53;
                    zzc = zzmy.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 50:
                    i = i3 * 53;
                    zzc = zzmy.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 51:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzr(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzr(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zza(zzY(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = ((String) zzmy.zzf(obj, j)).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzmy.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzmy.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzr(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzr(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzr(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzc2 = zzr(obj, j);
                        i3 = i2 + zzc2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkn.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzmy.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i3 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x043c, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x048a, code lost:
    
        if (r0 == 1048575) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x048c, code lost:
    
        r25.putInt(r9, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0492, code lost:
    
        r0 = r8.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0496, code lost:
    
        if (r0 >= r8.zzl) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0498, code lost:
    
        r1 = r8.zzj[r0];
        r2 = r8.zzc[r1];
        r2 = com.google.android.gms.internal.measurement.zzmy.zzf(r9, r8.zzB(r1) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04aa, code lost:
    
        if (r2 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04b1, code lost:
    
        if (r8.zzD(r1) != null) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04b6, code lost:
    
        r2 = (com.google.android.gms.internal.measurement.zzlg) r2;
        r0 = (com.google.android.gms.internal.measurement.zzlf) r8.zzF(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x04be, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x04b3, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x04bf, code lost:
    
        if (r33 != 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04c1, code lost:
    
        if (r3 != r4) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x04c8, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x04cd, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04c9, code lost:
    
        if (r3 > r4) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x04cb, code lost:
    
        if (r6 != r33) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04d2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkp.zze();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzir zzirVar) throws IOException {
        int i4;
        Unsafe unsafe;
        zzlp<T> zzlpVar;
        Object obj2;
        int i5;
        int i6;
        int zzi;
        zzjr zzjrVar;
        int i7;
        int i8;
        byte[] bArr2;
        zzir zzirVar2;
        int i9;
        Unsafe unsafe2;
        int i10;
        char c;
        int i11;
        Unsafe unsafe3;
        int i12;
        Object obj3;
        int i13;
        byte[] bArr3;
        byte[] bArr4;
        Unsafe unsafe4;
        Object obj4;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzlp<T> zzlpVar2 = this;
        Object obj5 = obj;
        byte[] bArr5 = bArr;
        int i19 = i2;
        zzir zzirVar3 = zzirVar;
        zzJ(obj5);
        Unsafe unsafe5 = zzb;
        int i20 = i;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = -1;
        int i25 = 1048575;
        while (true) {
            if (i20 < i19) {
                int i26 = i20 + 1;
                int i27 = bArr5[i20];
                if (i27 < 0) {
                    i26 = zzis.zzk(i27, bArr5, i26, zzirVar3);
                    i27 = zzirVar3.zza;
                }
                int i28 = i27;
                int i29 = i26;
                int i30 = i28 >>> 3;
                int i31 = i28 & 7;
                i23 = i30 > i24 ? zzlpVar2.zzx(i30, i23 / 3) : zzlpVar2.zzw(i30);
                if (i23 == -1) {
                    i5 = i29;
                    i4 = i25;
                    unsafe = unsafe5;
                    i23 = 0;
                    zzlpVar = zzlpVar2;
                    obj2 = obj5;
                    i6 = i28;
                } else {
                    int[] iArr = zzlpVar2.zzc;
                    int i32 = iArr[i23 + 1];
                    int zzA = zzA(i32);
                    long j = i32 & 1048575;
                    if (zzA <= 17) {
                        int i33 = iArr[i23 + 2];
                        int i34 = 1 << (i33 >>> 20);
                        int i35 = i33 & 1048575;
                        if (i35 != i25) {
                            if (i25 != 1048575) {
                                unsafe5.putInt(obj5, i25, i22);
                            }
                            i8 = i35;
                            i7 = unsafe5.getInt(obj5, i35);
                        } else {
                            i7 = i22;
                            i8 = i25;
                        }
                        switch (zzA) {
                            case 0:
                                bArr2 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe2 = unsafe5;
                                i10 = i29;
                                c = 65535;
                                if (i31 != 1) {
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    zzmy.zzo(obj5, j, Double.longBitsToDouble(zzis.zzp(bArr2, i10)));
                                    i20 = i10 + 8;
                                    i11 = i7 | i34;
                                    i19 = i2;
                                    unsafe5 = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i21 = i28;
                                    i22 = i11;
                                    bArr5 = bArr2;
                                    i24 = i9;
                                    break;
                                }
                            case 1:
                                bArr2 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe2 = unsafe5;
                                i10 = i29;
                                c = 65535;
                                if (i31 != 5) {
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    zzmy.zzp(obj5, j, Float.intBitsToFloat(zzis.zzb(bArr2, i10)));
                                    i20 = i10 + 4;
                                    i11 = i7 | i34;
                                    i19 = i2;
                                    unsafe5 = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i21 = i28;
                                    i22 = i11;
                                    bArr5 = bArr2;
                                    i24 = i9;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe3 = unsafe5;
                                i10 = i29;
                                c = 65535;
                                if (i31 != 0) {
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    int zzm = zzis.zzm(bArr2, i10, zzirVar2);
                                    Object obj6 = obj5;
                                    unsafe3.putLong(obj6, j, zzirVar2.zzb);
                                    obj5 = obj6;
                                    i11 = i7 | i34;
                                    i19 = i2;
                                    i20 = zzm;
                                    i21 = i28;
                                    unsafe5 = unsafe3;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i22 = i11;
                                    bArr5 = bArr2;
                                    i24 = i9;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe3 = unsafe5;
                                i10 = i29;
                                c = 65535;
                                if (i31 != 0) {
                                    unsafe2 = unsafe3;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    int zzj = zzis.zzj(bArr2, i10, zzirVar2);
                                    unsafe3.putInt(obj5, j, zzirVar2.zza);
                                    i19 = i2;
                                    zzirVar3 = zzirVar2;
                                    unsafe5 = unsafe3;
                                    i25 = i8;
                                    i21 = i28;
                                    i22 = i7 | i34;
                                    i20 = zzj;
                                    bArr5 = bArr2;
                                    i24 = i9;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr2 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe2 = unsafe5;
                                i12 = i29;
                                c = 65535;
                                obj3 = obj5;
                                if (i31 != 1) {
                                    obj5 = obj3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    unsafe2.putLong(obj3, j, zzis.zzp(bArr2, i12));
                                    obj5 = obj3;
                                    i20 = i12 + 8;
                                    i11 = i7 | i34;
                                    i19 = i2;
                                    zzirVar3 = zzirVar2;
                                    unsafe5 = unsafe2;
                                    i25 = i8;
                                    i21 = i28;
                                    i22 = i11;
                                    bArr5 = bArr2;
                                    i24 = i9;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe2 = unsafe5;
                                i12 = i29;
                                c = 65535;
                                obj3 = obj5;
                                if (i31 != 5) {
                                    obj5 = obj3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, zzis.zzb(bArr3, i12));
                                    i20 = i12 + 4;
                                    i19 = i2;
                                    bArr5 = bArr3;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i24 = i9;
                                    i22 = i7 | i34;
                                    obj5 = obj3;
                                    unsafe5 = unsafe2;
                                    i21 = i28;
                                    break;
                                }
                            case 7:
                                bArr3 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe2 = unsafe5;
                                i12 = i29;
                                c = 65535;
                                obj3 = obj5;
                                if (i31 != 0) {
                                    obj5 = obj3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    i20 = zzis.zzm(bArr3, i12, zzirVar2);
                                    zzmy.zzm(obj3, j, zzirVar2.zzb != 0);
                                    i19 = i2;
                                    bArr5 = bArr3;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i24 = i9;
                                    i22 = i7 | i34;
                                    obj5 = obj3;
                                    unsafe5 = unsafe2;
                                    i21 = i28;
                                    break;
                                }
                            case 8:
                                bArr3 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe2 = unsafe5;
                                i12 = i29;
                                c = 65535;
                                obj3 = obj5;
                                if (i31 != 2) {
                                    obj5 = obj3;
                                    i10 = i12;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    i20 = (536870912 & i32) == 0 ? zzis.zzg(bArr3, i12, zzirVar2) : zzis.zzh(bArr3, i12, zzirVar2);
                                    unsafe2.putObject(obj3, j, zzirVar2.zzc);
                                    i19 = i2;
                                    bArr5 = bArr3;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i24 = i9;
                                    i22 = i7 | i34;
                                    obj5 = obj3;
                                    unsafe5 = unsafe2;
                                    i21 = i28;
                                    break;
                                }
                            case 9:
                                bArr4 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe4 = unsafe5;
                                i13 = i29;
                                c = 65535;
                                obj4 = obj5;
                                if (i31 != 2) {
                                    obj5 = obj4;
                                    unsafe2 = unsafe4;
                                    i10 = i13;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    Object zzG = zzlpVar2.zzG(obj4, i23);
                                    int zzo = zzis.zzo(zzG, zzlpVar2.zzE(i23), bArr4, i13, i2, zzirVar2);
                                    zzlpVar2.zzO(obj4, i23, zzG);
                                    i14 = i7 | i34;
                                    i19 = i2;
                                    i20 = zzo;
                                    bArr5 = bArr4;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i21 = i28;
                                    i24 = i9;
                                    i22 = i14;
                                    obj5 = obj4;
                                    unsafe5 = unsafe4;
                                    break;
                                }
                            case 10:
                                bArr4 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe4 = unsafe5;
                                i13 = i29;
                                c = 65535;
                                obj4 = obj5;
                                if (i31 != 2) {
                                    obj5 = obj4;
                                    unsafe2 = unsafe4;
                                    i10 = i13;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    i20 = zzis.zza(bArr4, i13, zzirVar2);
                                    unsafe4.putObject(obj4, j, zzirVar2.zzc);
                                    i14 = i7 | i34;
                                    i19 = i2;
                                    bArr5 = bArr4;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i21 = i28;
                                    i24 = i9;
                                    i22 = i14;
                                    obj5 = obj4;
                                    unsafe5 = unsafe4;
                                    break;
                                }
                            case 12:
                                bArr4 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe4 = unsafe5;
                                i13 = i29;
                                c = 65535;
                                obj4 = obj5;
                                if (i31 != 0) {
                                    obj5 = obj4;
                                    unsafe2 = unsafe4;
                                    i10 = i13;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    i20 = zzis.zzj(bArr4, i13, zzirVar2);
                                    int i36 = zzirVar2.zza;
                                    zzkj zzD = zzlpVar2.zzD(i23);
                                    if (zzD != null && !zzD.zza(i36)) {
                                        zzd(obj4).zzj(i28, Long.valueOf(i36));
                                        i19 = i2;
                                        bArr5 = bArr4;
                                        zzirVar3 = zzirVar2;
                                        obj5 = obj4;
                                        unsafe5 = unsafe4;
                                        i25 = i8;
                                        i21 = i28;
                                        i24 = i9;
                                        i22 = i7;
                                        break;
                                    } else {
                                        unsafe4.putInt(obj4, j, i36);
                                        i14 = i7 | i34;
                                        i19 = i2;
                                        bArr5 = bArr4;
                                        zzirVar3 = zzirVar2;
                                        i25 = i8;
                                        i21 = i28;
                                        i24 = i9;
                                        i22 = i14;
                                        obj5 = obj4;
                                        unsafe5 = unsafe4;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                unsafe4 = unsafe5;
                                i13 = i29;
                                c = 65535;
                                obj4 = obj5;
                                if (i31 != 0) {
                                    obj5 = obj4;
                                    unsafe2 = unsafe4;
                                    i10 = i13;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    i20 = zzis.zzj(bArr4, i13, zzirVar2);
                                    unsafe4.putInt(obj4, j, zzji.zzb(zzirVar2.zza));
                                    i14 = i7 | i34;
                                    i19 = i2;
                                    bArr5 = bArr4;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i21 = i28;
                                    i24 = i9;
                                    i22 = i14;
                                    obj5 = obj4;
                                    unsafe5 = unsafe4;
                                    break;
                                }
                            case 16:
                                zzirVar2 = zzirVar3;
                                i9 = i30;
                                i13 = i29;
                                c = 65535;
                                if (i31 != 0) {
                                    unsafe2 = unsafe5;
                                    i10 = i13;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    int zzm2 = zzis.zzm(bArr, i13, zzirVar2);
                                    Object obj7 = obj5;
                                    Unsafe unsafe6 = unsafe5;
                                    unsafe6.putLong(obj7, j, zzji.zzc(zzirVar2.zzb));
                                    unsafe4 = unsafe6;
                                    obj4 = obj7;
                                    i14 = i7 | i34;
                                    i19 = i2;
                                    bArr5 = bArr;
                                    zzirVar3 = zzirVar2;
                                    i20 = zzm2;
                                    i25 = i8;
                                    i21 = i28;
                                    i24 = i9;
                                    i22 = i14;
                                    obj5 = obj4;
                                    unsafe5 = unsafe4;
                                    break;
                                }
                            default:
                                if (i31 != 3) {
                                    i9 = i30;
                                    i13 = i29;
                                    c = 65535;
                                    zzirVar2 = zzirVar3;
                                    unsafe2 = unsafe5;
                                    i10 = i13;
                                    unsafe = unsafe2;
                                    zzirVar3 = zzirVar2;
                                    i5 = i10;
                                    i30 = i9;
                                    zzlpVar = zzlpVar2;
                                    obj2 = obj5;
                                    i4 = i8;
                                    i6 = i28;
                                    i22 = i7;
                                    break;
                                } else {
                                    Object zzG2 = zzlpVar2.zzG(obj5, i23);
                                    zzirVar2 = zzirVar3;
                                    i9 = i30;
                                    i20 = zzis.zzn(zzG2, zzlpVar2.zzE(i23), bArr, i29, i2, (i30 << 3) | 4, zzirVar2);
                                    bArr2 = bArr;
                                    zzlpVar2.zzO(obj5, i23, zzG2);
                                    i11 = i7 | i34;
                                    i19 = i2;
                                    zzirVar3 = zzirVar2;
                                    i25 = i8;
                                    i21 = i28;
                                    i22 = i11;
                                    bArr5 = bArr2;
                                    i24 = i9;
                                    break;
                                }
                        }
                    } else {
                        Unsafe unsafe7 = unsafe5;
                        if (zzA != 27) {
                            i15 = i29;
                            if (zzA <= 49) {
                                unsafe = unsafe7;
                                int i37 = i22;
                                i4 = i25;
                                int zzv = zzlpVar2.zzv(obj, bArr, i15, i2, i28, i30, i31, i23, i32, zzA, j, zzirVar);
                                if (zzv != i15) {
                                    zzlpVar2 = this;
                                    obj5 = obj;
                                    bArr5 = bArr;
                                    i19 = i2;
                                    zzirVar3 = zzirVar;
                                    i20 = zzv;
                                    i21 = i28;
                                    i24 = i30;
                                    i23 = i23;
                                    i25 = i4;
                                    i22 = i37;
                                    unsafe5 = unsafe;
                                } else {
                                    zzlpVar = this;
                                    zzirVar3 = zzirVar;
                                    i5 = zzv;
                                    i6 = i28;
                                    i30 = i30;
                                    i23 = i23;
                                    i22 = i37;
                                    obj2 = obj;
                                }
                            } else {
                                unsafe = unsafe7;
                                i7 = i22;
                                i16 = i23;
                                i17 = i30;
                                i18 = i28;
                                i4 = i25;
                                if (zzA != 50) {
                                    i30 = i17;
                                    int zzt = zzt(obj, bArr, i15, i2, i18, i30, i31, i32, zzA, j, i16, zzirVar);
                                    zzlpVar = this;
                                    obj2 = obj;
                                    i6 = i18;
                                    zzirVar3 = zzirVar;
                                    if (zzt != i15) {
                                        bArr5 = bArr;
                                        i19 = i2;
                                        i20 = zzt;
                                        obj5 = obj2;
                                        i23 = i16;
                                        i22 = i7;
                                        unsafe5 = unsafe;
                                        i24 = i30;
                                        i21 = i6;
                                        zzlpVar2 = zzlpVar;
                                        i25 = i4;
                                    } else {
                                        i5 = zzt;
                                        i23 = i16;
                                        i22 = i7;
                                    }
                                } else if (i31 == 2) {
                                    int zzs = zzs(obj, bArr, i15, i2, i16, j, zzirVar);
                                    if (zzs != i15) {
                                        zzlpVar2 = this;
                                        obj5 = obj;
                                        bArr5 = bArr;
                                        i19 = i2;
                                        zzirVar3 = zzirVar;
                                        i20 = zzs;
                                        i24 = i17;
                                        i21 = i18;
                                        i25 = i4;
                                        unsafe5 = unsafe;
                                        i23 = i16;
                                        i22 = i7;
                                    } else {
                                        zzlpVar = this;
                                        obj2 = obj;
                                        zzirVar3 = zzirVar;
                                        i5 = zzs;
                                    }
                                } else {
                                    zzlpVar = this;
                                    obj2 = obj;
                                    zzirVar3 = zzirVar;
                                    i5 = i15;
                                }
                            }
                        } else if (i31 == 2) {
                            zzkm zzkmVar = (zzkm) unsafe7.getObject(obj5, j);
                            if (!zzkmVar.zzc()) {
                                int size = zzkmVar.size();
                                zzkmVar = zzkmVar.zzd(size == 0 ? 10 : size + size);
                                unsafe7.putObject(obj5, j, zzkmVar);
                            }
                            unsafe5 = unsafe7;
                            int zze = zzis.zze(zzlpVar2.zzE(i23), i28, bArr, i29, i2, zzkmVar, zzirVar);
                            i21 = i28;
                            bArr5 = bArr;
                            i19 = i2;
                            zzirVar3 = zzirVar;
                            i20 = zze;
                            i24 = i30;
                            obj5 = obj;
                        } else {
                            i15 = i29;
                            unsafe = unsafe7;
                            i7 = i22;
                            i16 = i23;
                            i18 = i28;
                            i17 = i30;
                            i4 = i25;
                            zzlpVar = this;
                            obj2 = obj;
                            zzirVar3 = zzirVar;
                            i5 = i15;
                        }
                        i30 = i17;
                        i6 = i18;
                        i23 = i16;
                        i22 = i7;
                    }
                }
                if (i6 != i3 || i3 == 0) {
                    if (!zzlpVar.zzh || (zzjrVar = zzirVar3.zzd) == zzjr.zza) {
                        zzi = zzis.zzi(i6, bArr, i5, i2, zzd(obj2), zzirVar);
                        i19 = i2;
                    } else {
                        if (zzjrVar.zzb(zzlpVar.zzg, i30) != null) {
                            throw null;
                        }
                        zzi = zzis.zzi(i6, bArr, i5, i2, zzd(obj2), zzirVar3);
                        i19 = i2;
                    }
                    i20 = zzi;
                    bArr5 = bArr;
                    zzirVar3 = zzirVar;
                    i24 = i30;
                    obj5 = obj2;
                    unsafe5 = unsafe;
                    i21 = i6;
                    zzlpVar2 = zzlpVar;
                    i25 = i4;
                } else {
                    i19 = i2;
                    i21 = i6;
                    i20 = i5;
                }
            } else {
                i4 = i25;
                unsafe = unsafe5;
                zzlpVar = zzlpVar2;
                obj2 = obj5;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Integer.MAX_VALUE);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                long j = 1048575 & zzB;
                int zzA = zzA(zzB);
                if (zzA != 9) {
                    switch (zzA) {
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
                            this.zzm.zza(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (zzT(obj, i)) {
                    zzE(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzmy.zzo(obj, j, zzmy.zza(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj2, i)) {
                        zzmy.zzp(obj, j, zzmy.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj2, i)) {
                        zzmy.zzm(obj, j, zzmy.zzw(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzK(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzK(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlz.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzL(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzL(obj, obj2, i);
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzirVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzirVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) throws IOException {
        if (!this.zzi) {
            zzQ(obj, zzngVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzT(obj, i)) {
                        zzngVar.zzf(i2, zzmy.zza(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzT(obj, i)) {
                        zzngVar.zzo(i2, zzmy.zzb(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzT(obj, i)) {
                        zzngVar.zzt(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzT(obj, i)) {
                        zzngVar.zzJ(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzT(obj, i)) {
                        zzngVar.zzr(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzT(obj, i)) {
                        zzngVar.zzm(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzT(obj, i)) {
                        zzngVar.zzk(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzT(obj, i)) {
                        zzngVar.zzb(i2, zzmy.zzw(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzT(obj, i)) {
                        zzZ(i2, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzT(obj, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzT(obj, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzT(obj, i)) {
                        zzngVar.zzH(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzT(obj, i)) {
                        zzngVar.zzi(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzT(obj, i)) {
                        zzngVar.zzw(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzT(obj, i)) {
                        zzngVar.zzy(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzT(obj, i)) {
                        zzngVar.zzA(i2, zzmy.zzc(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzT(obj, i)) {
                        zzngVar.zzC(i2, zzmy.zzd(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzT(obj, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i));
                    break;
                case 28:
                    zzlz.zzI(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar);
                    break;
                case 29:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 30:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 31:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 32:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 33:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 34:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(i2, (List) zzmy.zzf(obj, zzB & 1048575), zzngVar, zzE(i));
                    break;
                case 50:
                    zzR(zzngVar, i2, zzmy.zzf(obj, zzB & 1048575), i);
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzf(i2, zzn(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzo(i2, zzo(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzt(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzJ(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzr(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzm(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzk(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzb(i2, zzY(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzX(obj, i2, i)) {
                        zzZ(i2, zzmy.zzf(obj, zzB & 1048575), zzngVar);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzH(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzi(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzw(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzy(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzA(i2, zzr(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzC(i2, zzC(obj, zzB & 1048575));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, zzB & 1048575), zzE(i));
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzS(obj, obj2, i) && Double.doubleToLongBits(zzmy.zza(obj, j)) == Double.doubleToLongBits(zzmy.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzS(obj, obj2, i) && Float.floatToIntBits(zzmy.zzb(obj, j)) == Float.floatToIntBits(zzmy.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzS(obj, obj2, i) && zzmy.zzw(obj, j) == zzmy.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzS(obj, obj2, i) && zzmy.zzc(obj, j) == zzmy.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzS(obj, obj2, i) && zzmy.zzd(obj, j) == zzmy.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzS(obj, obj2, i) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
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
                    zzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
                    break;
                case 50:
                    zzZ = zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzmy.zzc(obj, zzy) == zzmy.zzc(obj2, zzy) && zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int zzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & zzB) != 0 && !zzU(obj, i2, i, i3, i11)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzX(obj, i8, i2) && !zzV(obj, zzB, zzE(i2))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzlg) zzmy.zzf(obj, zzB & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzmy.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlx zzE = zzE(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zzE.zzk(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zzU(obj, i2, i, i3, i11) && !zzV(obj, zzB, zzE(i2))) {
                return false;
            }
            i6++;
            i4 = i;
            i5 = i3;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
