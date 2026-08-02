package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzcj extends zzcd implements NavigableMap {
    private static final Comparator zzb;
    private static final zzcj zzc;
    private final transient zzcv zzd;
    private final transient zzcc zze;

    @CheckForNull
    private final transient zzcj zzf;

    static {
        zzcq zzcqVar = zzcq.zza;
        zzb = zzcqVar;
        zzcv zzs = zzck.zzs(zzcqVar);
        int i = zzcc.zzd;
        zzc = new zzcj(zzs, zzct.zza, null);
    }

    zzcj(zzcv zzcvVar, zzcc zzccVar, @CheckForNull zzcj zzcjVar) {
        this.zzd = zzcvVar;
        this.zze = zzccVar;
        this.zzf = zzcjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzcj zzf(Map map) {
        final Comparator comparator = zzb;
        Comparator comparator2 = map.comparator();
        int i = 1;
        boolean equals = comparator2 == null ? true : comparator.equals(comparator2);
        Collection entrySet = map.entrySet();
        Map.Entry[] entryArr = zza;
        if (!(entrySet instanceof Collection)) {
            Iterator it = entrySet.iterator();
            Collection arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) entrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return zzg(comparator);
        }
        if (length == 1) {
            Map.Entry entry = (Map.Entry) Objects.requireNonNull(entryArr2[0]);
            return new zzcj(new zzcv(zzcc.zzj(entry.getKey()), comparator), zzcc.zzj(entry.getValue()), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (equals) {
            for (int i2 = 0; i2 < length; i2++) {
                Map.Entry entry2 = (Map.Entry) Objects.requireNonNull(entryArr2[i2]);
                Object key = entry2.getKey();
                Object value = entry2.getValue();
                zzbv.zza(key, value);
                objArr[i2] = key;
                objArr2[i2] = value;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: com.google.android.gms.internal.fido.zzcg
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    Map.Entry entry4 = (Map.Entry) obj2;
                    Objects.requireNonNull(entry3);
                    Objects.requireNonNull(entry4);
                    return comparator.compare(entry3.getKey(), entry4.getKey());
                }
            });
            Map.Entry entry3 = (Map.Entry) Objects.requireNonNull(entryArr2[0]);
            Object key2 = entry3.getKey();
            objArr[0] = key2;
            Object value2 = entry3.getValue();
            objArr2[0] = value2;
            zzbv.zza(objArr[0], value2);
            while (i < length) {
                Map.Entry entry4 = (Map.Entry) Objects.requireNonNull(entryArr2[i - 1]);
                Map.Entry entry5 = (Map.Entry) Objects.requireNonNull(entryArr2[i]);
                Object key3 = entry5.getKey();
                Object value3 = entry5.getValue();
                zzbv.zza(key3, value3);
                objArr[i] = key3;
                objArr2[i] = value3;
                if (comparator.compare(key2, key3) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry4) + " and " + String.valueOf(entry5));
                }
                i++;
                key2 = key3;
            }
        }
        return new zzcj(new zzcv(zzcc.zzh(objArr, length), comparator), zzcc.zzh(objArr2, length), null);
    }

    static zzcj zzg(Comparator comparator) {
        if (zzcq.zza.equals(comparator)) {
            return zzc;
        }
        zzcv zzs = zzck.zzs(comparator);
        int i = zzcc.zzd;
        return new zzcj(zzs, zzct.zza, null);
    }

    private final zzcj zzl(int i, int i2) {
        if (i == 0) {
            if (i2 == this.zze.size()) {
                return this;
            }
            i = 0;
        }
        if (i == i2) {
            return zzg(((zzck) this.zzd).zza);
        }
        return new zzcj(this.zzd.zzw(i, i2), this.zze.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object ceilingKey(Object obj) {
        return zzco.zza(ceilingEntry(obj));
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return ((zzck) this.zzd).zza;
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.zzd.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        zzcj zzcjVar = this.zzf;
        if (zzcjVar != null) {
            return zzcjVar;
        }
        if (!isEmpty()) {
            return new zzcj((zzcv) this.zzd.descendingSet(), this.zze.zzf(), this);
        }
        Comparator comparator = ((zzck) this.zzd).zza;
        return zzg((comparator instanceof zzcs ? (zzcs) comparator : new zzbw(comparator)).zza());
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.zzd.first();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object floorKey(Object obj) {
        return zzco.zza(floorEntry(obj));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object higherKey(Object obj) {
        return zzco.zza(higherEntry(obj));
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Set keySet() {
        return this.zzd;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().zzi().get(this.zze.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.zzd.last();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    public final Object lowerKey(Object obj) {
        return zzco.zza(lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.zzd;
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @Deprecated
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CheckForNull
    @Deprecated
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.zze.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    public final /* synthetic */ Collection values() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: zza */
    public final zzby values() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    final zzcf zzb() {
        return isEmpty() ? zzcu.zza : new zzci(this);
    }

    @Override // com.google.android.gms.internal.fido.zzcd
    /* renamed from: zzd */
    public final /* synthetic */ zzcf keySet() {
        return this.zzd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // com.google.android.gms.internal.fido.zzcd, java.util.Map
    @CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(@CheckForNull Object obj) {
        int binarySearch;
        zzcv zzcvVar = this.zzd;
        if (obj != null) {
            try {
                binarySearch = Collections.binarySearch(zzcvVar.zzd, obj, zzcvVar.zza);
            } catch (ClassCastException unused) {
            }
        }
        binarySearch = -1;
        if (binarySearch == -1) {
            return null;
        }
        return this.zze.get(binarySearch);
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzcj headMap(Object obj, boolean z) {
        obj.getClass();
        return zzl(0, this.zzd.zzu(obj, z));
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final zzcj tailMap(Object obj, boolean z) {
        obj.getClass();
        return zzl(this.zzd.zzv(obj, z), this.zze.size());
    }

    @Override // java.util.NavigableMap
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzcj subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (((zzck) this.zzd).zza.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new IllegalArgumentException(zzbo.zza("expected fromKey <= toKey but %s > %s", obj, obj2));
    }
}
