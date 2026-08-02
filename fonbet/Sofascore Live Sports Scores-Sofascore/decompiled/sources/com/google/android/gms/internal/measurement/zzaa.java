package com.google.android.gms.internal.measurement;

import defpackage.vv9;
import defpackage.wt3;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaa {
    public static final vv9 d = vv9.s(3, "_syn", "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public zzaa(String str, long j, HashMap hashMap) {
        this.a = str;
        this.b = j;
        HashMap hashMap2 = new HashMap();
        this.c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(Object obj, Object obj2, String str) {
        if (d.contains(str) && (obj2 instanceof Double)) {
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
    public final zzaa clone() {
        return new zzaa(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.b == zzaaVar.b && this.a.equals(zzaaVar.a)) {
            return this.c.equals(zzaaVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String obj = this.c.toString();
        int length = String.valueOf(str).length();
        long j = this.b;
        StringBuilder sb = new StringBuilder(wt3.h(length, 25, String.valueOf(j).length(), 9, obj.length()) + 1);
        wt3.A("Event{name='", str, sb, "', timestamp=");
        sb.append(j);
        sb.append(", params=");
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
