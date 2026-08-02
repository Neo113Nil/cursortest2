package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final String f5158a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5159b;

    public o(String str, ArrayList arrayList) {
        this.f5158a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f5159b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str = oVar.f5158a;
        String str2 = this.f5158a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.f5159b.equals(oVar.f5159b);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f5158a;
        return this.f5159b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        return this;
    }
}
