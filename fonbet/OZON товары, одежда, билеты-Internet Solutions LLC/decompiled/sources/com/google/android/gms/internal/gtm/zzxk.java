package com.google.android.gms.internal.gtm;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes9.dex */
class zzxk<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private List<zzxe> zzb = Collections.EMPTY_LIST;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzxi zze;
    private Map<K, V> zzf;

    /* synthetic */ zzxk(int i11, zzxj zzxjVar) {
        this.zza = i11;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.zzc = map;
        this.zzf = map;
    }

    private final int zzk(K k11) {
        int size = this.zzb.size();
        int i11 = size - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int compareTo = k11.compareTo(this.zzb.get(i11).zza());
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = k11.compareTo(this.zzb.get(i13).zza());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzl(int i11) {
        zzn();
        V v11 = (V) this.zzb.remove(i11).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzm().entrySet().iterator();
            List<zzxe> list = this.zzb;
            Map.Entry<K, V> next = it.next();
            list.add(new zzxe(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v11;
    }

    private final SortedMap<K, V> zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzxi(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxk)) {
            return super.equals(obj);
        }
        zzxk zzxkVar = (zzxk) obj;
        int size = size();
        if (size != zzxkVar.size()) {
            return false;
        }
        int zzb = zzb();
        if (zzb != zzxkVar.zzb()) {
            return entrySet().equals(zzxkVar.entrySet());
        }
        for (int i11 = 0; i11 < zzb; i11++) {
            if (!zzg(i11).equals(zzxkVar.zzg(i11))) {
                return false;
            }
        }
        if (zzb != size) {
            return this.zzc.equals(zzxkVar.zzc);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? (V) this.zzb.get(zzk).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i11 = 0;
        for (int i12 = 0; i12 < zzb; i12++) {
            i11 += this.zzb.get(i12).hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i11 : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return (V) zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        return this.zzc.isEmpty() ? zzxd.zza() : this.zzc.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final V put(K k11, V v11) {
        zzn();
        int zzk = zzk(k11);
        if (zzk >= 0) {
            return (V) this.zzb.get(zzk).setValue(v11);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i11 = -(zzk + 1);
        if (i11 >= this.zza) {
            return zzm().put(k11, v11);
        }
        int size = this.zzb.size();
        int i12 = this.zza;
        if (size == i12) {
            zzxe remove = this.zzb.remove(i12 - 1);
            zzm().put(remove.zza(), remove.getValue());
        }
        this.zzb.add(i11, new zzxe(this, k11, v11));
        return null;
    }

    public final Map.Entry<K, V> zzg(int i11) {
        return this.zzb.get(i11);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
