package com.google.android.gms.internal.auth;

import defpackage.c0o;
import defpackage.cno;
import defpackage.ilg;
import defpackage.u8f;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfe extends c0o implements RandomAccess, zzff {
    public final List b;

    static {
        new zzfe((Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfe(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.b = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        c();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.c0o, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // defpackage.c0o, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            zzef zzefVar = (zzef) obj;
            String p = zzefVar.m() == 0 ? "" : zzefVar.p(zzfa.a);
            if (zzefVar.q()) {
                list.set(i, p);
            }
            return p;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, zzfa.a);
        u8f u8fVar = cno.a;
        int length = bArr.length;
        u8fVar.getClass();
        if (u8f.q(0, length, bArr)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final zzez i(int i) {
        List list = this.b;
        if (i < list.size()) {
            ilg.c();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new zzfe(arrayList);
    }

    @Override // defpackage.c0o, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        c();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof zzef)) {
            return new String((byte[]) remove, zzfa.a);
        }
        zzef zzefVar = (zzef) remove;
        return zzefVar.m() == 0 ? "" : zzefVar.p(zzfa.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof zzef)) {
            return new String((byte[]) obj2, zzfa.a);
        }
        zzef zzefVar = (zzef) obj2;
        return zzefVar.m() == 0 ? "" : zzefVar.p(zzfa.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final zzff zze() {
        return this.a ? new zzhe(this) : this;
    }

    @Override // com.google.android.gms.internal.auth.zzff
    public final List zzg() {
        return Collections.unmodifiableList(this.b);
    }

    public zzfe() {
        this(10);
    }

    public zzfe(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    public zzfe(Object obj) {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // defpackage.c0o, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
