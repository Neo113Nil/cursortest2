package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f0 extends AbstractList {
    public static final AtomicInteger d = new AtomicInteger();
    public Handler a;
    public final ArrayList b;
    public final ArrayList c;

    public f0(d0... d0VarArr) {
        d.incrementAndGet();
        this.c = new ArrayList();
        List asList = Arrays.asList(d0VarArr);
        asList.getClass();
        this.b = new ArrayList(asList);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        return this.b.add(d0Var);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof d0) {
            return super.contains((d0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (d0) this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof d0) {
            return super.indexOf((d0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof d0) {
            return super.lastIndexOf((d0) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof d0) {
            return super.remove((d0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        return (d0) this.b.set(i, d0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        d0 d0Var = (d0) obj;
        d0Var.getClass();
        this.b.add(i, d0Var);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return (d0) this.b.remove(i);
    }

    public f0(List list) {
        d.incrementAndGet();
        this.c = new ArrayList();
        this.b = new ArrayList(list);
    }
}
