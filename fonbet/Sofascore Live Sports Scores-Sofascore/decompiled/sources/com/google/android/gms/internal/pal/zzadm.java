package com.google.android.gms.internal.pal;

import defpackage.ilg;
import defpackage.wje;
import defpackage.xdn;
import defpackage.y6n;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadm extends y6n implements RandomAccess, zzadn {
    public final ArrayList b;

    static {
        new zzadm(10).a = false;
    }

    public zzadm(int i) {
        this.b = new ArrayList(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.y6n, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof zzadn) {
            collection = ((zzadn) collection).zzh();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.y6n, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzaby) {
            zzaby zzabyVar = (zzaby) obj;
            String q = zzabyVar.m() == 0 ? "" : zzabyVar.q(zzadg.a);
            if (zzabyVar.s()) {
                arrayList.set(i, q);
            }
            return q;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zzadg.a);
        wje wjeVar = xdn.a;
        int length = bArr.length;
        wjeVar.getClass();
        if (wje.o(0, length, bArr)) {
            arrayList.set(i, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.pal.zzadf
    public final zzadf i(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            ilg.c();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new zzadm(arrayList2);
    }

    @Override // defpackage.y6n, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof zzaby)) {
            return new String((byte[]) remove, zzadg.a);
        }
        zzaby zzabyVar = (zzaby) remove;
        return zzabyVar.m() == 0 ? "" : zzabyVar.q(zzadg.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzaby)) {
            return new String((byte[]) obj2, zzadg.a);
        }
        zzaby zzabyVar = (zzaby) obj2;
        return zzabyVar.m() == 0 ? "" : zzabyVar.q(zzadg.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final zzadn zze() {
        return this.a ? new zzafn(this) : this;
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final Object zzf(int i) {
        return this.b.get(i);
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final List zzh() {
        return Collections.unmodifiableList(this.b);
    }

    public zzadm() {
        this(10);
    }

    public zzadm(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // defpackage.y6n, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
