package com.google.gson.internal;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public j f6327a;

    /* renamed from: b, reason: collision with root package name */
    public j f6328b;

    /* renamed from: c, reason: collision with root package name */
    public j f6329c;

    /* renamed from: d, reason: collision with root package name */
    public j f6330d;

    /* renamed from: e, reason: collision with root package name */
    public j f6331e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6332f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6333g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6334h;

    /* renamed from: i, reason: collision with root package name */
    public int f6335i;

    public j(boolean z5) {
        this.f6332f = null;
        this.f6333g = z5;
        this.f6331e = this;
        this.f6330d = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f6332f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f6334h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6332f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6334h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f6332f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f6334h;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f6333g) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f6334h;
        this.f6334h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6332f + "=" + this.f6334h;
    }

    public j(boolean z5, j jVar, Object obj, j jVar2, j jVar3) {
        this.f6327a = jVar;
        this.f6332f = obj;
        this.f6333g = z5;
        this.f6335i = 1;
        this.f6330d = jVar2;
        this.f6331e = jVar3;
        jVar3.f6330d = this;
        jVar2.f6331e = this;
    }
}
