package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzmt {
    private static final zzmt zzb = new zzmt(true);
    final zzpe zza = new zzoz();
    private boolean zzc;
    private boolean zzd;

    private zzmt() {
    }

    public static int zza(zzms zzmsVar, Object obj) {
        int zzd;
        int zzA;
        zzpw zzd2 = zzmsVar.zzd();
        int zza = zzmsVar.zza();
        zzmsVar.zzg();
        int zzA2 = zzln.zzA(zza << 3);
        if (zzd2 == zzpw.zzj) {
            byte[] bArr = zznl.zzb;
            if (((zzoi) obj) instanceof zzkp) {
                throw null;
            }
            zzA2 += zzA2;
        }
        zzpx zzpxVar = zzpx.INT;
        int i10 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i10 = 8;
                return zzA2 + i10;
            case 1:
                ((Float) obj).getClass();
                return zzA2 + i10;
            case 2:
                i10 = zzln.zzB(((Long) obj).longValue());
                return zzA2 + i10;
            case 3:
                i10 = zzln.zzB(((Long) obj).longValue());
                return zzA2 + i10;
            case 4:
                i10 = zzln.zzB(((Integer) obj).intValue());
                return zzA2 + i10;
            case 5:
                ((Long) obj).getClass();
                i10 = 8;
                return zzA2 + i10;
            case 6:
                ((Integer) obj).getClass();
                return zzA2 + i10;
            case 7:
                ((Boolean) obj).getClass();
                i10 = 1;
                return zzA2 + i10;
            case 8:
                if (!(obj instanceof zzle)) {
                    i10 = zzln.zzz((String) obj);
                    return zzA2 + i10;
                }
                zzd = ((zzle) obj).zzd();
                zzA = zzln.zzA(zzd);
                i10 = zzA + zzd;
                return zzA2 + i10;
            case 9:
                i10 = ((zzoi) obj).zzo();
                return zzA2 + i10;
            case 10:
                if (!(obj instanceof zzns)) {
                    i10 = zzln.zzx((zzoi) obj);
                    return zzA2 + i10;
                }
                zzd = ((zzns) obj).zza();
                zzA = zzln.zzA(zzd);
                i10 = zzA + zzd;
                return zzA2 + i10;
            case 11:
                if (obj instanceof zzle) {
                    zzd = ((zzle) obj).zzd();
                    zzA = zzln.zzA(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzA = zzln.zzA(zzd);
                }
                i10 = zzA + zzd;
                return zzA2 + i10;
            case 12:
                i10 = zzln.zzA(((Integer) obj).intValue());
                return zzA2 + i10;
            case 13:
                i10 = obj instanceof zznf ? zzln.zzB(((zznf) obj).zza()) : zzln.zzB(((Integer) obj).intValue());
                return zzA2 + i10;
            case 14:
                ((Integer) obj).getClass();
                return zzA2 + i10;
            case 15:
                ((Long) obj).getClass();
                i10 = 8;
                return zzA2 + i10;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i10 = zzln.zzA((intValue >> 31) ^ (intValue + intValue));
                return zzA2 + i10;
            case 17:
                long longValue = ((Long) obj).longValue();
                i10 = zzln.zzB((longValue >> 63) ^ (longValue + longValue));
                return zzA2 + i10;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzmt zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzon) {
            return ((zzon) obj).zzd();
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

    private final void zzm(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzns;
        zzmsVar.zzg();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzmsVar, zzl(value));
            return;
        }
        Object zze = zze(zzmsVar);
        if (zze != null) {
            if (z10) {
                throw null;
            }
            this.zza.put(zzmsVar, zze instanceof zzon ? zzmsVar.zzc((zzon) zze, (zzon) value) : zzmsVar.zzb(((zzoi) zze).zzae(), (zzoi) value).zzk());
        } else {
            this.zza.put(zzmsVar, zzl(value));
            if (z10) {
                this.zzd = true;
            }
        }
    }

    private static boolean zzn(Map.Entry entry) {
        zzms zzmsVar = (zzms) entry.getKey();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return true;
        }
        zzmsVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzoj) {
            return ((zzoj) value).zzp();
        }
        if (value instanceof zzns) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i10;
        int zzA;
        int zzA2;
        zzms zzmsVar = (zzms) entry.getKey();
        Object value = entry.getValue();
        if (zzmsVar.zze() != zzpx.MESSAGE) {
            return zza(zzmsVar, value);
        }
        zzmsVar.zzg();
        zzmsVar.zzf();
        if (value instanceof zzns) {
            int zza = ((zzms) entry.getKey()).zza();
            int zzA3 = zzln.zzA(8);
            i10 = zzA3 + zzA3;
            zzA = zzln.zzA(16) + zzln.zzA(zza);
            int zzA4 = zzln.zzA(24);
            int zza2 = ((zzns) value).zza();
            zzA2 = zzA4 + zzln.zzA(zza2) + zza2;
        } else {
            int zza3 = ((zzms) entry.getKey()).zza();
            int zzA5 = zzln.zzA(8);
            i10 = zzA5 + zzA5;
            zzA = zzln.zzA(16) + zzln.zzA(zza3);
            zzA2 = zzln.zzA(24) + zzln.zzx((zzoi) value);
        }
        return i10 + zzA + zzA2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzmt) {
            return this.zza.equals(((zzmt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int zzc = this.zza.zzc();
        int i10 = 0;
        for (int i11 = 0; i11 < zzc; i11++) {
            i10 += zzo(this.zza.zzg(i11));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            i10 += zzo((Map.Entry) it.next());
        }
        return i10;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzmt clone() {
        zzmt zzmtVar = new zzmt();
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Map.Entry zzg = this.zza.zzg(i10);
            zzmtVar.zzi((zzms) ((zzpa) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzmtVar.zzi((zzms) entry.getKey(), entry.getValue());
        }
        zzmtVar.zzd = this.zzd;
        return zzmtVar;
    }

    public final Object zze(zzms zzmsVar) {
        Object obj = this.zza.get(zzmsVar);
        if (obj instanceof zzns) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zza.isEmpty() ? Collections.emptyIterator() : this.zzd ? new zznq(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            Object value = this.zza.zzg(i10).getValue();
            if (value instanceof zznd) {
                ((zznd) value).zzG();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zznd) {
                ((zznd) value2).zzG();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzmt zzmtVar) {
        int zzc = zzmtVar.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            zzm(zzmtVar.zza.zzg(i10));
        }
        Iterator it = zzmtVar.zza.zzd().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zznf) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzns) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzms zzmsVar, Object obj) {
        boolean z10;
        zzmsVar.zzg();
        zzmsVar.zzd();
        byte[] bArr = zznl.zzb;
        obj.getClass();
        zzpw zzpwVar = zzpw.zza;
        zzpx zzpxVar = zzpx.INT;
        switch (r0.zza()) {
            case INT:
                z10 = obj instanceof Integer;
                break;
            case LONG:
                z10 = obj instanceof Long;
                break;
            case FLOAT:
                z10 = obj instanceof Float;
                break;
            case DOUBLE:
                z10 = obj instanceof Double;
                break;
            case BOOLEAN:
                z10 = obj instanceof Boolean;
                break;
            case STRING:
                z10 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zzle)) {
                    break;
                }
                if (obj instanceof zzns) {
                    this.zzd = true;
                }
                this.zza.put(zzmsVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzns) {
                }
                this.zza.put(zzmsVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzoi)) {
                    break;
                }
                if (obj instanceof zzns) {
                }
                this.zza.put(zzmsVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzmsVar.zza()), zzmsVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        int zzc = this.zza.zzc();
        for (int i10 = 0; i10 < zzc; i10++) {
            if (!zzn(this.zza.zzg(i10))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzmt(boolean z10) {
        zzg();
        zzg();
    }
}
