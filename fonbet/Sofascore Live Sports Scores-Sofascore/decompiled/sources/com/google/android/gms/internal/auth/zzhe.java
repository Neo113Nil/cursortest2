package com.google.android.gms.internal.auth;

import defpackage.dck;
import defpackage.uoa;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public final class zzhe extends AbstractList implements RandomAccess, zzff {
    public final zzfe a;

    public zzhe(zzfe zzfeVar) {
        this.a = zzfeVar;
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
        return this.a.b.size();
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return this;
    }
}
