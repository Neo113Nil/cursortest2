package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes7.dex */
final class zzbd extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();

    @CheckForNull
    transient int[] zza;

    @CheckForNull
    transient Object[] zzb;

    @CheckForNull
    transient Object[] zzc;

    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;

    @CheckForNull
    private transient Set zzh;

    @CheckForNull
    private transient Set zzi;

    @CheckForNull
    private transient Collection zzj;

    zzbd() {
        zzo(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzA() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    static /* synthetic */ int zzb(zzbd zzbdVar) {
        int i = zzbdVar.zzg;
        zzbdVar.zzg = i - 1;
        return i;
    }

    static /* synthetic */ Object zzg(zzbd zzbdVar, int i) {
        return zzbdVar.zzA()[i];
    }

    static /* synthetic */ Object zzj(zzbd zzbdVar, int i) {
        return zzbdVar.zzB()[i];
    }

    static /* synthetic */ Object zzk(zzbd zzbdVar) {
        Object obj = zzbdVar.zze;
        obj.getClass();
        return obj;
    }

    static /* synthetic */ void zzm(zzbd zzbdVar, int i, Object obj) {
        zzbdVar.zzB()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzu() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv(@CheckForNull Object obj) {
        if (zzq()) {
            return -1;
        }
        int zza = zzbf.zza(obj);
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzc = zzbe.zzc(obj2, zza & zzu);
        if (zzc != 0) {
            int i = ~zzu;
            int i2 = zza & i;
            do {
                int i3 = zzc - 1;
                int i4 = zzz()[i3];
                if ((i4 & i) == i2 && zzx.zza(obj, zzA()[i3])) {
                    return i3;
                }
                zzc = i4 & zzu;
            } while (zzc != 0);
        }
        return -1;
    }

    private final int zzw(int i, int i2, int i3, int i4) {
        Object zzd2 = zzbe.zzd(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzbe.zze(zzd2, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzc = zzbe.zzc(obj, i6);
            while (zzc != 0) {
                int i7 = zzc - 1;
                int i8 = zzz[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzc2 = zzbe.zzc(zzd2, i10);
                zzbe.zze(zzd2, i10, zzc);
                zzz[i7] = ((~i5) & i9) | (zzc2 & i5);
                zzc = i8 & i;
            }
        }
        this.zze = zzd2;
        zzy(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzx(@CheckForNull Object obj) {
        if (zzq()) {
            return zzd;
        }
        int zzu = zzu();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb = zzbe.zzb(obj, null, zzu, obj2, zzz(), zzA(), null);
        if (zzb == -1) {
            return zzd;
        }
        Object obj3 = zzB()[zzb];
        zzp(zzb, zzu);
        this.zzg--;
        zzn();
        return obj3;
    }

    private final void zzy(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzz() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzq()) {
            return;
        }
        zzn();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzcn.zza(size(), 3, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzA(), 0, this.zzg, (Object) null);
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzz(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map zzl = zzl();
        return zzl != null ? zzl.containsKey(obj) : zzv(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsValue(obj);
        }
        for (int i = 0; i < this.zzg; i++) {
            if (zzx.zza(obj, zzB()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set != null) {
            return set;
        }
        zzay zzayVar = new zzay(this);
        this.zzi = zzayVar;
        return zzayVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzv = zzv(obj);
        if (zzv == -1) {
            return null;
        }
        return zzB()[zzv];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set != null) {
            return set;
        }
        zzba zzbaVar = new zzba(this);
        this.zzh = zzbaVar;
        return zzbaVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        int i;
        if (zzq()) {
            zzab.zzd(zzq(), "Arrays already allocated");
            int i2 = this.zzf;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzbe.zzd(max2);
            zzy(max2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int zza = zzbf.zza(obj);
        int zzu = zzu();
        int i5 = zza & zzu;
        Object obj3 = this.zze;
        obj3.getClass();
        int zzc = zzbe.zzc(obj3, i5);
        if (zzc == 0) {
            if (i4 > zzu) {
                zzu = zzw(zzu, zzbe.zza(zzu), zza, i3);
            } else {
                Object obj4 = this.zze;
                obj4.getClass();
                zzbe.zze(obj4, i5, i4);
            }
            i = 1;
        } else {
            int i6 = ~zzu;
            int i7 = zza & i6;
            int i8 = 0;
            while (true) {
                int i9 = zzc - 1;
                int i10 = zzz[i9];
                i = 1;
                int i11 = i10 & i6;
                if (i11 == i7 && zzx.zza(obj, zzA[i9])) {
                    Object obj5 = zzB[i9];
                    zzB[i9] = obj2;
                    return obj5;
                }
                int i12 = i10 & zzu;
                i8++;
                if (i12 != 0) {
                    zzc = i12;
                } else {
                    if (i8 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzu() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzA()[zze], zzB()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzn();
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i4 > zzu) {
                        zzu = zzw(zzu, zzbe.zza(zzu), zza, i3);
                    } else {
                        zzz[i9] = (i4 & zzu) | i11;
                    }
                }
            }
        }
        int length = zzz().length;
        if (i4 > length) {
            int i13 = i;
            int min = Math.min(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (Math.max(i13, length >>> 1) + length) | i13);
            if (min != length) {
                this.zza = Arrays.copyOf(zzz(), min);
                this.zzb = Arrays.copyOf(zzA(), min);
                this.zzc = Arrays.copyOf(zzB(), min);
            }
        }
        zzz()[i3] = (~zzu) & zza;
        zzA()[i3] = obj;
        zzB()[i3] = obj2;
        this.zzg = i4;
        zzn();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzx = zzx(obj);
        if (zzx == zzd) {
            return null;
        }
        return zzx;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        return zzl != null ? zzl.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection != null) {
            return collection;
        }
        zzbc zzbcVar = new zzbc(this);
        this.zzj = zzbcVar;
        return zzbcVar;
    }

    final int zze() {
        return isEmpty() ? -1 : 0;
    }

    final int zzf(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    @CheckForNull
    final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    final void zzn() {
        this.zzf += 32;
    }

    final void zzo(int i) {
        this.zzf = zzcn.zza(12, 1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    final void zzp(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzz = zzz();
        Object[] zzA = zzA();
        Object[] zzB = zzB();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            zzA[i] = null;
            zzB[i] = null;
            zzz[i] = 0;
            return;
        }
        Object obj2 = zzA[i3];
        zzA[i] = obj2;
        zzB[i] = zzB[i3];
        zzA[i3] = null;
        zzB[i3] = null;
        zzz[i] = zzz[i3];
        zzz[i3] = 0;
        int zza = zzbf.zza(obj2) & i2;
        int zzc = zzbe.zzc(obj, zza);
        if (zzc == size) {
            zzbe.zze(obj, zza, i + 1);
            return;
        }
        while (true) {
            int i4 = zzc - 1;
            int i5 = zzz[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                zzz[i4] = ((i + 1) & i2) | (i5 & (~i2));
                return;
            }
            zzc = i6;
        }
    }

    final boolean zzq() {
        return this.zze == null;
    }

    zzbd(int i) {
        zzo(12);
    }
}
