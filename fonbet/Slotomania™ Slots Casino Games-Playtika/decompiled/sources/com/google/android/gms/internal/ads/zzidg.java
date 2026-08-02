package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzidg {
    private static final zzidg zzd = new zzidg(true);
    final zzigb zza = new zzifx();
    boolean zzb;
    boolean zzc;

    private zzidg() {
    }

    public static zzidg zza() {
        return zzd;
    }

    static void zzf(zzicw zzicwVar, zzigu zziguVar, int i, Object obj) throws IOException {
        if (zziguVar == zzigu.GROUP) {
            zzicwVar.zzb(i, 3);
            ((zzifc) obj).zzcX(zzicwVar);
            zzicwVar.zzb(i, 4);
            return;
        }
        zzicwVar.zzb(i, zziguVar.zzb());
        zzigv zzigvVar = zzigv.INT;
        switch (zziguVar) {
            case DOUBLE:
                zzicwVar.zzu(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzicwVar.zzs(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case INT64:
                zzicwVar.zzt(((Long) obj).longValue());
                break;
            case UINT64:
                zzicwVar.zzt(((Long) obj).longValue());
                break;
            case INT32:
                zzicwVar.zzq(((Integer) obj).intValue());
                break;
            case FIXED64:
                zzicwVar.zzu(((Long) obj).longValue());
                break;
            case FIXED32:
                zzicwVar.zzs(((Integer) obj).intValue());
                break;
            case BOOL:
                zzicwVar.zzp(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof zzicn)) {
                    zzicwVar.zzw((String) obj);
                    break;
                } else {
                    zzicwVar.zzk((zzicn) obj);
                    break;
                }
            case GROUP:
                ((zzifc) obj).zzcX(zzicwVar);
                break;
            case MESSAGE:
                zzicwVar.zzo((zzifc) obj);
                break;
            case BYTES:
                if (!(obj instanceof zzicn)) {
                    byte[] bArr = (byte[]) obj;
                    zzicwVar.zzl(bArr, 0, bArr.length);
                    break;
                } else {
                    zzicwVar.zzk((zzicn) obj);
                    break;
                }
            case UINT32:
                zzicwVar.zzr(((Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof zzidv)) {
                    zzicwVar.zzq(((Integer) obj).intValue());
                    break;
                } else {
                    zzicwVar.zzq(((zzidv) obj).zza());
                    break;
                }
            case SFIXED32:
                zzicwVar.zzs(((Integer) obj).intValue());
                break;
            case SFIXED64:
                zzicwVar.zzu(((Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                zzicwVar.zzr((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((Long) obj).longValue();
                zzicwVar.zzt((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int zzh(zzigu zziguVar, int i, Object obj) {
        int zzF = zzicw.zzF(i << 3);
        if (zziguVar == zzigu.GROUP) {
            zzF += zzF;
        }
        return zzF + zzi(zziguVar, obj);
    }

    static int zzi(zzigu zziguVar, Object obj) {
        int zzc;
        int zzF;
        zzigu zziguVar2 = zzigu.DOUBLE;
        zzigv zzigvVar = zzigv.INT;
        switch (zziguVar) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                int i = zzicw.zzb;
                return 8;
            case FLOAT:
                ((Float) obj).floatValue();
                int i2 = zzicw.zzb;
                return 4;
            case INT64:
                return zzicw.zzG(((Long) obj).longValue());
            case UINT64:
                return zzicw.zzG(((Long) obj).longValue());
            case INT32:
                return zzicw.zzG(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                int i3 = zzicw.zzb;
                return 8;
            case FIXED32:
                ((Integer) obj).intValue();
                int i4 = zzicw.zzb;
                return 4;
            case BOOL:
                ((Boolean) obj).booleanValue();
                int i5 = zzicw.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof zzicn)) {
                    int i6 = zzicw.zzb;
                    zzc = zzigt.zzc((String) obj);
                    zzF = zzicw.zzF(zzc);
                    break;
                } else {
                    int i7 = zzicw.zzb;
                    zzc = ((zzicn) obj).zzb();
                    zzF = zzicw.zzF(zzc);
                    break;
                }
            case GROUP:
                return ((zzifc) obj).zzbr();
            case MESSAGE:
                if (!(obj instanceof zziel)) {
                    return zzicw.zzH((zzifc) obj);
                }
                zzc = ((zziel) obj).zzb();
                zzF = zzicw.zzF(zzc);
                break;
            case BYTES:
                if (!(obj instanceof zzicn)) {
                    int i8 = zzicw.zzb;
                    zzc = ((byte[]) obj).length;
                    zzF = zzicw.zzF(zzc);
                    break;
                } else {
                    int i9 = zzicw.zzb;
                    zzc = ((zzicn) obj).zzb();
                    zzF = zzicw.zzF(zzc);
                    break;
                }
            case UINT32:
                return zzicw.zzF(((Integer) obj).intValue());
            case ENUM:
                return obj instanceof zzidv ? zzicw.zzG(((zzidv) obj).zza()) : zzicw.zzG(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                int i10 = zzicw.zzb;
                return 4;
            case SFIXED64:
                ((Long) obj).longValue();
                int i11 = zzicw.zzb;
                return 8;
            case SINT32:
                int intValue = ((Integer) obj).intValue();
                return zzicw.zzF((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((Long) obj).longValue();
                return zzicw.zzG((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzF + zzc;
    }

    public static int zzj(zzidf zzidfVar, Object obj) {
        zzigu zzb = zzidfVar.zzb();
        int zza = zzidfVar.zza();
        if (!zzidfVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzidfVar.zze()) {
            int i2 = 0;
            while (i < size) {
                i2 += zzh(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzi(zzb, list.get(i));
            i++;
        }
        return zzicw.zzF(zza << 3) + i3 + zzicw.zzF(i3);
    }

    private static boolean zzk(Map.Entry entry) {
        zzidf zzidfVar = (zzidf) entry.getKey();
        if (zzidfVar.zzc() != zzigv.MESSAGE) {
            return true;
        }
        if (!zzidfVar.zzd()) {
            return zzl(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(Object obj) {
        if (obj instanceof zzifd) {
            return ((zzifd) obj).zzbi();
        }
        if (obj instanceof zziel) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(Map.Entry entry) {
        int i;
        int zzF;
        int zzF2;
        zzidf zzidfVar = (zzidf) entry.getKey();
        Object value = entry.getValue();
        if (zzidfVar.zzc() != zzigv.MESSAGE || zzidfVar.zzd() || zzidfVar.zze()) {
            return zzj(zzidfVar, value);
        }
        if (value instanceof zziel) {
            int zza = ((zzidf) entry.getKey()).zza();
            int zzF3 = zzicw.zzF(8);
            i = zzF3 + zzF3;
            zzF = zzicw.zzF(16) + zzicw.zzF(zza);
            int zzF4 = zzicw.zzF(24);
            int zzb = ((zziel) value).zzb();
            zzF2 = zzF4 + zzicw.zzF(zzb) + zzb;
        } else {
            int zza2 = ((zzidf) entry.getKey()).zza();
            int zzF5 = zzicw.zzF(8);
            i = zzF5 + zzF5;
            zzF = zzicw.zzF(16) + zzicw.zzF(zza2);
            zzF2 = zzicw.zzF(24) + zzicw.zzH((zzifc) value);
        }
        return i + zzF + zzF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(zzidf zzidfVar, Object obj) {
        boolean z;
        zzidfVar.zzb();
        byte[] bArr = zziee.zzb;
        obj.getClass();
        zzigu zziguVar = zzigu.DOUBLE;
        zzigv zzigvVar = zzigv.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzicn) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzidv)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzifc) || (obj instanceof zziel)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzidfVar.zza()), zzidfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzidg zzidgVar = new zzidg();
        zzigb zzigbVar = this.zza;
        int zzc = zzigbVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Map.Entry zzd2 = zzigbVar.zzd(i);
            zzidgVar.zzd((zzidf) ((zzify) zzd2).zza(), zzd2.getValue());
        }
        for (Map.Entry entry : zzigbVar.zze()) {
            zzidgVar.zzd((zzidf) entry.getKey(), entry.getValue());
        }
        zzidgVar.zzc = this.zzc;
        return zzidgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzidg) {
            return this.zza.equals(((zzidg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        zzigb zzigbVar = this.zza;
        int zzc = zzigbVar.zzc();
        for (int i = 0; i < zzc; i++) {
            Object value = zzigbVar.zzd(i).getValue();
            if (value instanceof zzidr) {
                ((zzidr) value).zzbm();
            }
        }
        Iterator it = zzigbVar.zze().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzidr) {
                ((zzidr) value2).zzbm();
            }
        }
        zzigbVar.zza();
        this.zzb = true;
    }

    public final Iterator zzc() {
        zzigb zzigbVar = this.zza;
        return zzigbVar.isEmpty() ? Collections.emptyIterator() : this.zzc ? new zziek(zzigbVar.entrySet().iterator()) : zzigbVar.entrySet().iterator();
    }

    public final void zzd(zzidf zzidfVar, Object obj) {
        if (!zzidfVar.zzd()) {
            zzn(zzidfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzn(zzidfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zziel) {
            this.zzc = true;
        }
        this.zza.put(zzidfVar, obj);
    }

    public final boolean zze() {
        zzigb zzigbVar = this.zza;
        int zzc = zzigbVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzigbVar.zzd(i))) {
                return false;
            }
        }
        Iterator it = zzigbVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        zzigb zzigbVar = this.zza;
        int zzc = zzigbVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzigbVar.zzd(i2));
        }
        Iterator it = zzigbVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((Map.Entry) it.next());
        }
        return i;
    }

    private zzidg(boolean z) {
        zzb();
        zzb();
    }
}
