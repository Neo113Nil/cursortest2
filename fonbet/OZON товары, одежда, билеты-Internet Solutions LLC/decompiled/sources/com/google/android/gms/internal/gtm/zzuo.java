package com.google.android.gms.internal.gtm;

import Nh.b;
import Tl.a;
import com.google.android.gms.internal.gtm.zzun;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class zzuo<T extends zzun<T>> {
    private static final zzuo zzb = new zzuo(true);
    final zzxk<T, Object> zza = new zzxa(16);
    private boolean zzc;
    private boolean zzd;

    private zzuo() {
    }

    public static int zza(zzun<?> zzunVar, Object obj) {
        zzye zzd = zzunVar.zzd();
        int zza = zzunVar.zza();
        zzunVar.zzg();
        int zzC = zzto.zzC(zza);
        if (zzd == zzye.zzj) {
            zzvi.zzi((zzwk) obj);
            zzC += zzC;
        }
        zzyf zzyfVar = zzyf.INT;
        int i11 = 4;
        switch (zzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i11 = 8;
                return zzC + i11;
            case 1:
                ((Float) obj).getClass();
                return zzC + i11;
            case 2:
                i11 = zzto.zzE(((Long) obj).longValue());
                return zzC + i11;
            case 3:
                i11 = zzto.zzE(((Long) obj).longValue());
                return zzC + i11;
            case 4:
                i11 = zzto.zzx(((Integer) obj).intValue());
                return zzC + i11;
            case 5:
                ((Long) obj).getClass();
                i11 = 8;
                return zzC + i11;
            case 6:
                ((Integer) obj).getClass();
                return zzC + i11;
            case 7:
                ((Boolean) obj).getClass();
                i11 = 1;
                return zzC + i11;
            case 8:
                i11 = obj instanceof zztd ? zzto.zzu((zztd) obj) : zzto.zzB((String) obj);
                return zzC + i11;
            case 9:
                i11 = zzto.zzw((zzwk) obj);
                return zzC + i11;
            case 10:
                i11 = obj instanceof zzvp ? zzto.zzy((zzvp) obj) : zzto.zzz((zzwk) obj);
                return zzC + i11;
            case 11:
                i11 = obj instanceof zztd ? zzto.zzu((zztd) obj) : zzto.zzt((byte[]) obj);
                return zzC + i11;
            case 12:
                i11 = zzto.zzD(((Integer) obj).intValue());
                return zzC + i11;
            case 13:
                i11 = obj instanceof zzvb ? zzto.zzx(((zzvb) obj).zza()) : zzto.zzx(((Integer) obj).intValue());
                return zzC + i11;
            case 14:
                ((Integer) obj).getClass();
                return zzC + i11;
            case 15:
                ((Long) obj).getClass();
                i11 = 8;
                return zzC + i11;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i11 = zzto.zzD((intValue >> 31) ^ (intValue + intValue));
                return zzC + i11;
            case 17:
                long longValue = ((Long) obj).longValue();
                i11 = zzto.zzE((longValue >> 63) ^ (longValue + longValue));
                return zzC + i11;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends zzun<T>> zzuo<T> zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzwp) {
            return ((zzwp) obj).zzc();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry<T, Object> entry) {
        zzwk zzC;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzvp) {
            throw null;
        }
        key.zzg();
        if (key.zze() != zzyf.MESSAGE) {
            this.zza.put(key, zzl(value));
            return;
        }
        Object zze = zze(key);
        if (zze == null) {
            this.zza.put(key, zzl(value));
            return;
        }
        if (zze instanceof zzwp) {
            zzC = key.zzc((zzwp) zze, (zzwp) value);
        } else {
            zzwj zzap = ((zzwk) zze).zzap();
            key.zzb(zzap, (zzwk) value);
            zzC = zzap.zzC();
        }
        this.zza.put(key, zzC);
    }

    private static <T extends zzun<T>> boolean zzn(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zze() == zzyf.MESSAGE) {
            key.zzg();
            Object value = entry.getValue();
            if (!(value instanceof zzwk)) {
                if (value instanceof zzvp) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((zzwk) value).zzas()) {
                return false;
            }
        }
        return true;
    }

    private static final int zzo(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zze() != zzyf.MESSAGE) {
            return zza(key, value);
        }
        key.zzg();
        key.zzf();
        if (value instanceof zzvp) {
            int zza = entry.getKey().zza();
            int zzD = zzto.zzD(8);
            int zza2 = ((zzvp) value).zza();
            return a.b(zza2, zza2, zzto.zzD(24), b.a(zza, zzto.zzD(16), zzD + zzD));
        }
        int zza3 = entry.getKey().zza();
        int zzD2 = zzto.zzD(8);
        return zzto.zzz((zzwk) value) + zzto.zzD(24) + b.a(zza3, zzto.zzD(16), zzD2 + zzD2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzuo) {
            return this.zza.equals(((zzuo) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.zza.zzb(); i12++) {
            i11 += zzo(this.zza.zzg(i12));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i11 += zzo(it.next());
        }
        return i11;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzuo<T> clone() {
        zzuo<T> zzuoVar = new zzuo<>();
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            Map.Entry<T, Object> zzg = this.zza.zzg(i11);
            zzuoVar.zzi(zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzc()) {
            zzuoVar.zzi(entry.getKey(), entry.getValue());
        }
        zzuoVar.zzd = this.zzd;
        return zzuoVar;
    }

    public final Object zze(T t2) {
        Object obj = this.zza.get(t2);
        if (obj instanceof zzvp) {
            throw null;
        }
        return obj;
    }

    public final Iterator<Map.Entry<T, Object>> zzf() {
        return this.zzd ? new zzvo(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzuo<T> zzuoVar) {
        for (int i11 = 0; i11 < zzuoVar.zza.zzb(); i11++) {
            zzm(zzuoVar.zza.zzg(i11));
        }
        Iterator<Map.Entry<T, Object>> it = zzuoVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm(it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.gtm.zzvb) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.gtm.zzvp) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(T t2, Object obj) {
        boolean z11;
        t2.zzg();
        t2.zzd();
        zzvi.zze(obj);
        zzye zzyeVar = zzye.zza;
        zzyf zzyfVar = zzyf.INT;
        switch (r0.zza()) {
            case INT:
                z11 = obj instanceof Integer;
                break;
            case LONG:
                z11 = obj instanceof Long;
                break;
            case FLOAT:
                z11 = obj instanceof Float;
                break;
            case DOUBLE:
                z11 = obj instanceof Double;
                break;
            case BOOLEAN:
                z11 = obj instanceof Boolean;
                break;
            case STRING:
                z11 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zztd)) {
                    break;
                }
                if (obj instanceof zzvp) {
                    this.zzd = true;
                }
                this.zza.put(t2, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzvp) {
                }
                this.zza.put(t2, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzwk)) {
                    break;
                }
                if (obj instanceof zzvp) {
                }
                this.zza.put(t2, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t2.zza()), t2.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i11 = 0; i11 < this.zza.zzb(); i11++) {
            if (!zzn(this.zza.zzg(i11))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn(it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzuo(boolean z11) {
        zzg();
        zzg();
    }
}
