package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class e extends h implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38097a = new ArrayList();

    @Override // com.google.gson.h
    public boolean a() {
        return p().a();
    }

    @Override // com.google.gson.h
    public int b() {
        return p().b();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof e) && ((e) obj).f38097a.equals(this.f38097a);
        }
        return true;
    }

    @Override // com.google.gson.h
    public long g() {
        return p().g();
    }

    @Override // com.google.gson.h
    public String h() {
        return p().h();
    }

    public int hashCode() {
        return this.f38097a.hashCode();
    }

    public boolean isEmpty() {
        return this.f38097a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f38097a.iterator();
    }

    public void m(h hVar) {
        if (hVar == null) {
            hVar = j.f38328a;
        }
        this.f38097a.add(hVar);
    }

    public void n(String str) {
        this.f38097a.add(str == null ? j.f38328a : new n(str));
    }

    public h o(int i10) {
        return (h) this.f38097a.get(i10);
    }

    public final h p() {
        int size = this.f38097a.size();
        if (size == 1) {
            return (h) this.f38097a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public int size() {
        return this.f38097a.size();
    }
}
