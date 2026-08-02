package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f5036a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5037b;

    public f(String str) {
        this.f5036a = n.S;
        this.f5037b = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5037b.equals(fVar.f5037b) && this.f5036a.equals(fVar.f5036a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.f5036a.hashCode() + (this.f5037b.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        return new f(this.f5037b, this.f5036a.i());
    }

    public f(String str, n nVar) {
        this.f5036a = nVar;
        this.f5037b = str;
    }
}
