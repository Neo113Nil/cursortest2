package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f5110a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j6 f5112c;

    public k6(j6 j6Var, Comparable comparable, Object obj) {
        this.f5112c = j6Var;
        this.f5110a = comparable;
        this.f5111b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f5110a.compareTo(((k6) obj).f5110a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f5110a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f5111b;
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
    public final /* synthetic */ Object getKey() {
        return this.f5110a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5111b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5110a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5111b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f5112c.g();
        Object obj2 = this.f5111b;
        this.f5111b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5110a);
        String valueOf2 = String.valueOf(this.f5111b);
        return d9.e.m(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }
}
