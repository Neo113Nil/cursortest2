package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4930a;

    /* renamed from: b, reason: collision with root package name */
    public final e8.d f4931b;

    public b4(Context context, e8.d dVar) {
        this.f4930a = context;
        this.f4931b = dVar;
    }

    public final boolean equals(Object obj) {
        e8.d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b4) {
            b4 b4Var = (b4) obj;
            e8.d dVar2 = b4Var.f4931b;
            if (this.f4930a.equals(b4Var.f4930a) && ((dVar = this.f4931b) != null ? dVar.equals(dVar2) : dVar2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4930a.hashCode() ^ 1000003;
        e8.d dVar = this.f4931b;
        return (hashCode * 1000003) ^ (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        String obj = this.f4930a.toString();
        int length = obj.length();
        String valueOf = String.valueOf(this.f4931b);
        StringBuilder sb2 = new StringBuilder(length + 45 + valueOf.length() + 1);
        r4.k.s(sb2, "FlagsContext{context=", obj, ", hermeticFileOverrides=", valueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
