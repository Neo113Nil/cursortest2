package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3427g extends AbstractC3428h {
    private static final long serialVersionUID = 0;

    /* renamed from: g, reason: collision with root package name */
    public transient int f36817g;

    public C3427g() {
        this(12, 3);
    }

    public static C3427g F() {
        return new C3427g();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f36817g = 3;
        int c10 = f0.c(objectInputStream);
        A(C3433m.r());
        f0.b(this, objectInputStream, c10);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        f0.d(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC3423c
    /* renamed from: E */
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC3424d
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public List u() {
        return new ArrayList(this.f36817g);
    }

    @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public /* bridge */ /* synthetic */ Collection a() {
        return super.a();
    }

    @Override // com.google.common.collect.AbstractC3423c, com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.O
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractC3423c, com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ Set j() {
        return super.j();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ boolean k(Object obj, Iterable iterable) {
        return super.k(obj, iterable);
    }

    @Override // com.google.common.collect.AbstractC3423c, com.google.common.collect.AbstractC3424d, com.google.common.collect.O
    public /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.O
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC3426f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC3424d, com.google.common.collect.AbstractC3426f, com.google.common.collect.O
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public C3427g(int i10, int i11) {
        super(X.c(i10));
        AbstractC3431k.b(i11, "expectedValuesPerKey");
        this.f36817g = i11;
    }
}
