package com.google.android.gms.internal.measurement;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class k implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5108a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(String str) {
        HashMap hashMap = this.f5108a;
        return hashMap.containsKey(str) ? (n) hashMap.get(str) : n.S;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void b(String str, n nVar) {
        HashMap hashMap = this.f5108a;
        if (nVar == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, nVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return new i(this.f5108a.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f5108a.equals(((k) obj).f5108a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(toString()) : androidx.appcompat.widget.c1.B(this, new q(str), xVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean g(String str) {
        return this.f5108a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        return "[object Object]";
    }

    public final int hashCode() {
        return this.f5108a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        k kVar = new k();
        for (Map.Entry entry : this.f5108a.entrySet()) {
            boolean z5 = entry.getValue() instanceof j;
            HashMap hashMap = kVar.f5108a;
            if (z5) {
                hashMap.put((String) entry.getKey(), (n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((n) entry.getValue()).i());
            }
        }
        return kVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        HashMap hashMap = this.f5108a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb2.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(StringUtils.COMMA));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
