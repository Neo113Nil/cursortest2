package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5017a;

    public e(Boolean bool) {
        this.f5017a = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean c() {
        return Boolean.valueOf(this.f5017a);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        return Double.valueOf(true != this.f5017a ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f5017a == ((e) obj).f5017a;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n f(String str, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z5 = this.f5017a;
        if (equals) {
            return new q(Boolean.toString(z5));
        }
        throw new IllegalArgumentException(Boolean.toString(z5) + "." + str + " is not a function.");
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String h() {
        return Boolean.toString(this.f5017a);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f5017a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n i() {
        return new e(Boolean.valueOf(this.f5017a));
    }

    public final String toString() {
        return String.valueOf(this.f5017a);
    }
}
