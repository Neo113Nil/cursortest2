package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
class zzguo extends zzgum implements List {
    final /* synthetic */ zzgup zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzguo(zzgup zzgupVar, Object obj, List list, zzgum zzgumVar) {
        super(zzgupVar, obj, list, zzgumVar);
        Objects.requireNonNull(zzgupVar);
        this.zzf = zzgupVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzgup zzgupVar = this.zzf;
        zzgupVar.zzq(zzgupVar.zzp() + 1);
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzgup zzgupVar = this.zzf;
        zzgupVar.zzq(zzgupVar.zzp() + (size2 - size));
        if (size != 0) {
            return addAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgun(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zza();
        Object remove = ((List) this.zzb).remove(i);
        this.zzf.zzq(r0.zzp() - 1);
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zza();
        List subList = ((List) this.zzb).subList(i, i2);
        zzgum zzgumVar = this.zzc;
        if (zzgumVar == null) {
            zzgumVar = this;
        }
        return this.zzf.zzg(this.zza, subList, zzgumVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zza();
        return new zzgun(this, i);
    }
}
