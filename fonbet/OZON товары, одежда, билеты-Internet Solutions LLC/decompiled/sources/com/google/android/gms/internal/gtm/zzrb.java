package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes9.dex */
final class zzrb implements Iterator<zzqw<?>> {
    final /* synthetic */ zzrd zza;
    private int zzb = 0;

    zzrb(zzrd zzrdVar) {
        this.zza = zzrdVar;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasNext() {
        ArrayList arrayList;
        ArrayList arrayList2;
        for (int i11 = this.zzb; i11 < arrayList.size(); i11++) {
            arrayList2 = this.zza.zzc;
            if (arrayList2.get(i11) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x001a */
    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzqw<?> next() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11 = this.zzb;
        arrayList = this.zza.zzc;
        if (i11 >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        for (int i12 = this.zzb; i12 < arrayList2.size(); i12++) {
            arrayList3 = this.zza.zzc;
            if (arrayList3.get(i12) != null) {
                this.zzb = i12;
                this.zzb = i12 + 1;
                return new zzqy(Double.valueOf(i12));
            }
        }
        throw new NoSuchElementException();
    }
}
