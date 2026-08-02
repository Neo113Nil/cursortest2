package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final f8.j f4924d = f8.j.h(3, "_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    public String f4925a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4926b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4927c;

    public b(String str, long j, HashMap hashMap) {
        this.f4925a = str;
        this.f4926b = j;
        HashMap hashMap2 = new HashMap();
        this.f4927c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (f4924d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (obj instanceof String) {
                return obj2;
            }
            if (obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b(this.f4925a, this.f4926b, new HashMap(this.f4927c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4926b == bVar.f4926b && this.f4925a.equals(bVar.f4925a)) {
            return this.f4927c.equals(bVar.f4927c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4925a.hashCode() * 31;
        long j = this.f4926b;
        return this.f4927c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f4925a;
        String obj = this.f4927c.toString();
        int length = String.valueOf(str).length();
        long j = this.f4926b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j);
        sb2.append(", params=");
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
