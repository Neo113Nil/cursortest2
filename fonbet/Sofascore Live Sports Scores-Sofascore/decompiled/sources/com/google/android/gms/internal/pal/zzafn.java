package com.google.android.gms.internal.pal;

import defpackage.dck;
import defpackage.uoa;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzafn extends AbstractList implements RandomAccess, zzadn {
    public final zzadm a;

    public zzafn(zzadm zzadmVar) {
        this.a = zzadmVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new uoa(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new dck(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final Object zzf(int i) {
        return this.a.b.get(i);
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final List zzh() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.pal.zzadn
    public final zzadn zze() {
        return this;
    }
}
