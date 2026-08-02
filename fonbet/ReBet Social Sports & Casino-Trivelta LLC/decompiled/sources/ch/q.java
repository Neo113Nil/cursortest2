package ch;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;

/* loaded from: classes3.dex */
public final class q implements Map.Entry, KMutableMap.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27836a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27837b;

    public q(Object obj, Object obj2) {
        this.f27836a = obj;
        this.f27837b = obj2;
    }

    public void a(Object obj) {
        this.f27837b = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Map.Entry)) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.areEqual(entry.getKey(), getKey()) && Intrinsics.areEqual(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f27836a;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f27837b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Intrinsics.checkNotNull(key);
        int hashCode = key.hashCode() + 527;
        Object value = getValue();
        Intrinsics.checkNotNull(value);
        return hashCode + value.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        a(obj);
        return getValue();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
