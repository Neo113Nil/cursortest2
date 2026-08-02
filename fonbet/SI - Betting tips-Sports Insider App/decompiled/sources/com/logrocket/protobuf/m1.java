package com.logrocket.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f6750a;

    /* renamed from: b, reason: collision with root package name */
    public Object f6751b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i1 f6752c;

    public m1(i1 i1Var, Comparable comparable, Object obj) {
        this.f6752c = i1Var;
        this.f6750a = comparable;
        this.f6751b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6750a.compareTo(((m1) obj).f6750a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f6750a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f6751b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6750a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6751b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f6750a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f6751b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f6752c.c();
        Object obj2 = this.f6751b;
        this.f6751b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f6750a + "=" + this.f6751b;
    }
}
