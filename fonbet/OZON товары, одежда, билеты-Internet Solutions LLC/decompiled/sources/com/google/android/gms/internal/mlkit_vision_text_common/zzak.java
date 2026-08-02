package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes9.dex */
class zzak extends zzai implements List {
    final /* synthetic */ zzal zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzak(zzal zzalVar, Object obj, List list, zzai zzaiVar) {
        super(zzalVar, obj, list, zzaiVar);
        this.zzf = zzalVar;
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        int i12;
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i11, obj);
        zzal zzalVar = this.zzf;
        i12 = zzalVar.zzb;
        zzalVar.zzb = i12 + 1;
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        int i12;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i11, collection);
        if (!addAll) {
            return addAll;
        }
        int size2 = this.zzb.size();
        zzal zzalVar = this.zzf;
        i12 = zzalVar.zzb;
        zzalVar.zzb = i12 + (size2 - size);
        if (size != 0) {
            return addAll;
        }
        zza();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        zzb();
        return ((List) this.zzb).get(i11);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzaj(this);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        int i12;
        zzb();
        Object remove = ((List) this.zzb).remove(i11);
        zzal zzalVar = this.zzf;
        i12 = zzalVar.zzb;
        zzalVar.zzb = i12 - 1;
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        zzb();
        return ((List) this.zzb).set(i11, obj);
    }

    @Override // java.util.List
    public final List subList(int i11, int i12) {
        zzb();
        List subList = ((List) this.zzb).subList(i11, i12);
        zzai zzaiVar = this.zzc;
        if (zzaiVar == null) {
            zzaiVar = this;
        }
        return this.zzf.zzf(this.zza, subList, zzaiVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i11) {
        zzb();
        return new zzaj(this, i11);
    }
}
