package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjc;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.0.1 */
/* loaded from: classes7.dex */
final class zzja<T extends zzjc<T>> {
    private static final zzja zzb = new zzja(true);
    final zzln<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    static int zza(zzmo zzmoVar, int i, Object obj) {
        int zzf = zzir.zzf(i);
        if (zzmoVar == zzmo.zzj) {
            zzjn.zza((zzkq) obj);
            zzf <<= 1;
        }
        return zzf + zza(zzmoVar, obj);
    }

    private static int zza(zzmo zzmoVar, Object obj) {
        switch (zzjd.zzb[zzmoVar.ordinal()]) {
            case 1:
                return zzir.zza(((Double) obj).doubleValue());
            case 2:
                return zzir.zza(((Float) obj).floatValue());
            case 3:
                return zzir.zzb(((Long) obj).longValue());
            case 4:
                return zzir.zze(((Long) obj).longValue());
            case 5:
                return zzir.zzc(((Integer) obj).intValue());
            case 6:
                return zzir.zza(((Long) obj).longValue());
            case 7:
                return zzir.zzb(((Integer) obj).intValue());
            case 8:
                return zzir.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzir.zza((zzkq) obj);
            case 10:
                if (obj instanceof zzju) {
                    return zzir.zza((zzju) obj);
                }
                return zzir.zzb((zzkq) obj);
            case 11:
                if (obj instanceof zzhx) {
                    return zzir.zza((zzhx) obj);
                }
                return zzir.zza((String) obj);
            case 12:
                if (obj instanceof zzhx) {
                    return zzir.zza((zzhx) obj);
                }
                return zzir.zza((byte[]) obj);
            case 13:
                return zzir.zzg(((Integer) obj).intValue());
            case 14:
                return zzir.zzd(((Integer) obj).intValue());
            case 15:
                return zzir.zzc(((Long) obj).longValue());
            case 16:
                return zzir.zze(((Integer) obj).intValue());
            case 17:
                return zzir.zzd(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjm) {
                    return zzir.zza(((zzjm) obj).zza());
                }
                return zzir.zza(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzjc<?> zzjcVar, Object obj) {
        zzmo zzb2 = zzjcVar.zzb();
        int zza = zzjcVar.zza();
        if (zzjcVar.zze()) {
            List list = (List) obj;
            int i = 0;
            if (zzjcVar.zzd()) {
                if (list.isEmpty()) {
                    return 0;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i += zza(zzb2, it.next());
                }
                return zzir.zzf(zza) + i + zzir.zzg(i);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                i += zza(zzb2, zza, it2.next());
            }
            return i;
        }
        return zza(zzb2, zza, obj);
    }

    public final int zza() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zza((Map.Entry) this.zza.zzb(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i += zza((Map.Entry) it.next());
        }
        return i;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzmy.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzju) {
                return zzir.zza(entry.getKey().zza(), (zzju) value);
            }
            return zzir.zza(entry.getKey().zza(), (zzkq) value);
        }
        return zza((zzjc<?>) key, value);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static <T extends zzjc<T>> zzja<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzja zzjaVar = new zzja();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i);
            zzjaVar.zzb(zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzjaVar.zzb(entry.getKey(), entry.getValue());
        }
        zzjaVar.zzd = this.zzd;
        return zzjaVar;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzkz) {
            return ((zzkz) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzju)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zzd) {
            return new zzjz(this.zza.zzd().iterator());
        }
        return this.zza.zzd().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzd) {
            return new zzjz(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    private zzja() {
        this.zza = zzln.zza(16);
    }

    private zzja(zzln<T, Object> zzlnVar) {
        this.zza = zzlnVar;
        zze();
    }

    private zzja(boolean z) {
        this(zzln.zza(0));
        zze();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i);
            if (zzb2.getValue() instanceof zzjk) {
                ((zzjk) zzb2.getValue()).zzch();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zza(zzja<T> zzjaVar) {
        for (int i = 0; i < zzjaVar.zza.zzb(); i++) {
            zzb((Map.Entry) zzjaVar.zza.zzb(i));
        }
        Iterator<Map.Entry<T, Object>> it = zzjaVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzkq zzag;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzju;
        if (key.zze()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzja<T>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zza(it.next()));
            }
            this.zza.zza((zzln<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzmy.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzln<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzja<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzln<T, Object>) key, (T) zza(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw new NoSuchMethodError();
        }
        if (zza2 instanceof zzkz) {
            zzag = key.zza((zzkz) zza2, (zzkz) value);
        } else {
            zzag = key.zza(((zzkq) zza2).zzcg(), (zzkq) value).zzag();
        }
        this.zza.zza((zzln<T, Object>) key, (T) zzag);
    }

    private final void zzb(T t, Object obj) {
        if (t.zze()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                zzc(t, obj2);
            }
            obj = arrayList;
        } else {
            zzc(t, obj);
        }
        if (obj instanceof zzju) {
            this.zzd = true;
        }
        this.zza.zza((zzln<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzju) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjm) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t, Object obj) {
        zzmo zzb2 = t.zzb();
        zzjn.zza(obj);
        boolean z = true;
        switch (zzjd.zza[zzb2.zzb().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzhx)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzkq)) {
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().zzb(), obj.getClass().getName()));
        }
    }

    static void zza(zzir zzirVar, zzmo zzmoVar, int i, Object obj) throws IOException {
        if (zzmoVar == zzmo.zzj) {
            zzkq zzkqVar = (zzkq) obj;
            zzjn.zza(zzkqVar);
            zzirVar.zzj(i, 3);
            zzkqVar.zza(zzirVar);
            zzirVar.zzj(i, 4);
        }
        zzirVar.zzj(i, zzmoVar.zza());
        switch (zzjd.zzb[zzmoVar.ordinal()]) {
            case 1:
                zzirVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzirVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzirVar.zzh(((Long) obj).longValue());
                break;
            case 4:
                zzirVar.zzh(((Long) obj).longValue());
                break;
            case 5:
                zzirVar.zzi(((Integer) obj).intValue());
                break;
            case 6:
                zzirVar.zzf(((Long) obj).longValue());
                break;
            case 7:
                zzirVar.zzh(((Integer) obj).intValue());
                break;
            case 8:
                zzirVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzkq) obj).zza(zzirVar);
                break;
            case 10:
                zzirVar.zzc((zzkq) obj);
                break;
            case 11:
                if (obj instanceof zzhx) {
                    zzirVar.zzb((zzhx) obj);
                    break;
                } else {
                    zzirVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzhx) {
                    zzirVar.zzb((zzhx) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzirVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzirVar.zzk(((Integer) obj).intValue());
                break;
            case 14:
                zzirVar.zzh(((Integer) obj).intValue());
                break;
            case 15:
                zzirVar.zzf(((Long) obj).longValue());
                break;
            case 16:
                zzirVar.zzj(((Integer) obj).intValue());
                break;
            case 17:
                zzirVar.zzg(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzjm) {
                    zzirVar.zzi(((zzjm) obj).zza());
                    break;
                } else {
                    zzirVar.zzi(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzja) {
            return this.zza.equals(((zzja) obj).zza);
        }
        return false;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzc(this.zza.zzb(i))) {
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

    private static <T extends zzjc<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzmy.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!zzb(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzks) {
            return ((zzks) obj).i_();
        }
        if (obj instanceof zzju) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
}
