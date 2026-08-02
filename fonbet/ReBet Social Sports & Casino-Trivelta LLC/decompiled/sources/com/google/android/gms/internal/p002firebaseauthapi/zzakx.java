package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzakx<T extends zzakz<T>> {
    private static final zzakx<?> zzb = new zzakx<>(true);
    final zzang<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzakx() {
        this.zza = new zzanf();
    }

    public static int zza(zzaog zzaogVar, int i10, Object obj) {
        int zzh = zzakn.zzh(i10);
        if (zzaogVar == zzaog.zzj) {
            zzalh.zza((zzamm) obj);
            zzh <<= 1;
        }
        return zzh + zza(zzaogVar, obj);
    }

    public static <T extends zzakz<T>> zzakx<T> zzb() {
        return (zzakx<T>) zzb;
    }

    public final /* synthetic */ Object clone() {
        zzakx zzakxVar = new zzakx();
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            Map.Entry<T, Object> zza = this.zza.zza(i10);
            zzakxVar.zzb(zza.getKey(), zza.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzakxVar.zzb(entry.getKey(), entry.getValue());
        }
        zzakxVar.zzd = this.zzd;
        return zzakxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzakx) {
            return this.zza.equals(((zzakx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzc() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzals(this.zza.zzd().iterator()) : this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zzals(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            Object value = this.zza.zza(i10).getValue();
            if (value instanceof zzalf) {
                ((zzalf) value).zzt();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzalf) {
                ((zzalf) value2).zzt();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zzb2 = this.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            if (!zzc(this.zza.zza(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzalq;
        if (key.zze()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzakx<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i10 = 0; i10 < size; i10++) {
                list2.add(zza(list.get(i10)));
            }
            this.zza.zza((zzang<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzaoj.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzang<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzakx<T>) key);
        if (zza2 != null) {
            if (z10) {
                throw new NoSuchMethodError();
            }
            this.zza.zza((zzang<T, Object>) key, (T) (zza2 instanceof zzamr ? key.zza((zzamr) zza2, (zzamr) value) : key.zza(((zzamm) zza2).zzr(), (zzamm) value).zze()));
        } else {
            this.zza.zza((zzang<T, Object>) key, (T) zza(value));
            if (z10) {
                this.zzd = true;
            }
        }
    }

    private zzakx(zzang<T, Object> zzangVar) {
        this.zza = zzangVar;
        zze();
    }

    private static int zza(zzaog zzaogVar, Object obj) {
        switch (zzala.zzb[zzaogVar.ordinal()]) {
            case 1:
                return zzakn.zza(((Double) obj).doubleValue());
            case 2:
                return zzakn.zza(((Float) obj).floatValue());
            case 3:
                return zzakn.zzb(((Long) obj).longValue());
            case 4:
                return zzakn.zze(((Long) obj).longValue());
            case 5:
                return zzakn.zzc(((Integer) obj).intValue());
            case 6:
                return zzakn.zza(((Long) obj).longValue());
            case 7:
                return zzakn.zzb(((Integer) obj).intValue());
            case 8:
                return zzakn.zza(((Boolean) obj).booleanValue());
            case 9:
                return ((zzamm) obj).zzl();
            case 10:
                if (obj instanceof zzalq) {
                    return zzakn.zza((zzalq) obj);
                }
                return zzakn.zza((zzamm) obj);
            case 11:
                if (obj instanceof zzajv) {
                    return zzakn.zza((zzajv) obj);
                }
                return zzakn.zza((String) obj);
            case 12:
                if (obj instanceof zzajv) {
                    return zzakn.zza((zzajv) obj);
                }
                return zzakn.zza((byte[]) obj);
            case 13:
                return zzakn.zzi(((Integer) obj).intValue());
            case 14:
                return zzakn.zzf(((Integer) obj).intValue());
            case 15:
                return zzakn.zzc(((Long) obj).longValue());
            case 16:
                return zzakn.zzg(((Integer) obj).intValue());
            case 17:
                return zzakn.zzd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzalk) {
                    return zzakn.zza(((zzalk) obj).zza());
                }
                return zzakn.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalq) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzalk) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t10, Object obj) {
        zzaog zzb2 = t10.zzb();
        zzalh.zza(obj);
        boolean z10 = true;
        switch (zzala.zza[zzb2.zzb().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                break;
            case 2:
                z10 = obj instanceof Long;
                break;
            case 3:
                z10 = obj instanceof Float;
                break;
            case 4:
                z10 = obj instanceof Double;
                break;
            case 5:
                z10 = obj instanceof Boolean;
                break;
            case 6:
                z10 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzajv)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzamm)) {
                    break;
                }
                break;
            default:
                z10 = false;
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.zza()), t10.zzb().zzb(), obj.getClass().getName()));
        }
    }

    private zzakx(boolean z10) {
        this(new zzanf());
        zze();
    }

    private static <T extends zzakz<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzaoj.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!zzb(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private final void zzb(T t10, Object obj) {
        if (t10.zze()) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = list.get(i10);
                    zzc(t10, obj2);
                    arrayList.add(obj2);
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            zzc(t10, obj);
        }
        if (obj instanceof zzalq) {
            this.zzd = true;
        }
        this.zza.zza((zzang<T, Object>) t10, (T) obj);
    }

    public static int zza(zzakz<?> zzakzVar, Object obj) {
        zzaog zzb2 = zzakzVar.zzb();
        int zza = zzakzVar.zza();
        if (zzakzVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i10 = 0;
            if (!zzakzVar.zzd()) {
                int i11 = 0;
                while (i10 < size) {
                    i11 += zza(zzb2, zza, list.get(i10));
                    i10++;
                }
                return i11;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int i12 = 0;
            while (i10 < size) {
                i12 += zza(zzb2, list.get(i10));
                i10++;
            }
            return zzakn.zzh(zza) + i12 + zzakn.zzi(i12);
        }
        return zza(zzb2, zza, obj);
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzamo) {
            return ((zzamo) obj).zzv();
        }
        if (obj instanceof zzalq) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int zzb2 = this.zza.zzb();
        int i10 = 0;
        for (int i11 = 0; i11 < zzb2; i11++) {
            i10 += zza((Map.Entry) this.zza.zza(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i10 += zza((Map.Entry) it.next());
        }
        return i10;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzaoj.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzalq) {
                return zzakn.zza(entry.getKey().zza(), (zzalq) value);
            }
            return zzakn.zza(entry.getKey().zza(), (zzamm) value);
        }
        return zza((zzakz<?>) key, value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzamr) {
            return ((zzamr) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (obj instanceof zzalq) {
            throw new NoSuchMethodError();
        }
        return obj;
    }

    public final void zza(zzakx<T> zzakxVar) {
        int zzb2 = zzakxVar.zza.zzb();
        for (int i10 = 0; i10 < zzb2; i10++) {
            zzb((Map.Entry) zzakxVar.zza.zza(i10));
        }
        Iterator<Map.Entry<T, Object>> it = zzakxVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    public static void zza(zzakn zzaknVar, zzaog zzaogVar, int i10, Object obj) {
        if (zzaogVar == zzaog.zzj) {
            zzamm zzammVar = (zzamm) obj;
            zzalh.zza(zzammVar);
            zzaknVar.zzj(i10, 3);
            zzammVar.zza(zzaknVar);
            zzaknVar.zzj(i10, 4);
        }
        zzaknVar.zzj(i10, zzaogVar.zza());
        switch (zzala.zzb[zzaogVar.ordinal()]) {
            case 1:
                zzaknVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzaknVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzaknVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzaknVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzaknVar.zzk(((Integer) obj).intValue());
                break;
            case 6:
                zzaknVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzaknVar.zzj(((Integer) obj).intValue());
                break;
            case 8:
                zzaknVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzamm) obj).zza(zzaknVar);
                break;
            case 10:
                zzaknVar.zzb((zzamm) obj);
                break;
            case 11:
                if (obj instanceof zzajv) {
                    zzaknVar.zzb((zzajv) obj);
                    break;
                } else {
                    zzaknVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzajv) {
                    zzaknVar.zzb((zzajv) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzaknVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzaknVar.zzm(((Integer) obj).intValue());
                break;
            case 14:
                zzaknVar.zzj(((Integer) obj).intValue());
                break;
            case 15:
                zzaknVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzaknVar.zzl(((Integer) obj).intValue());
                break;
            case 17:
                zzaknVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzalk) {
                    zzaknVar.zzk(((zzalk) obj).zza());
                    break;
                } else {
                    zzaknVar.zzk(((Integer) obj).intValue());
                    break;
                }
        }
    }
}
