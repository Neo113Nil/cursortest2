package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class h implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5067a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5068b = new HashMap();

    public h(String str) {
        this.f5067a = str;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n a(String str) {
        HashMap hashMap = this.f5068b;
        return hashMap.containsKey(str) ? (n) hashMap.get(str) : n.S;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final void b(String str, n nVar) {
        HashMap hashMap = this.f5068b;
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
        return new i(this.f5068b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        String str = this.f5067a;
        if (str != null) {
            return str.equals(hVar.f5067a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        return "toString".equals(str) ? new q(this.f5067a) : androidx.appcompat.widget.c1.B(this, new q(str), xVar, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final boolean g(String str) {
        return this.f5068b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        return this.f5067a;
    }

    public final int hashCode() {
        String str = this.f5067a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public abstract n j(com.google.firebase.messaging.x xVar, List list);

    @Override // com.google.android.gms.internal.measurement.n
    public n i() {
        return this;
    }
}
