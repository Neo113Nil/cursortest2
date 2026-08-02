package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zad {
    public final int a;
    public final long b;
    public final long c;
    public final fad d;
    public final mwh e;
    public final Object f;

    public zad(int i, long j, long j2, fad fadVar, mwh mwhVar, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = fadVar;
        this.e = mwhVar;
        this.f = obj;
    }

    public static zad a(zad zadVar, fad fadVar, int i) {
        int i2 = zadVar.a;
        long j = zadVar.b;
        long j2 = zadVar.c;
        mwh mwhVar = (i & 16) != 0 ? zadVar.e : null;
        Object obj = zadVar.f;
        zadVar.getClass();
        return new zad(i2, j, j2, fadVar, mwhVar, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        zad zadVar = (zad) obj;
        return this.a == zadVar.a && this.b == zadVar.b && this.c == zadVar.c && Intrinsics.c(this.d, zadVar.d) && Intrinsics.c(this.e, zadVar.e) && Intrinsics.c(this.f, zadVar.f);
    }

    public final int hashCode() {
        int g = dmi.g(this.d.a, ljg.c(ljg.c(this.a * 31, 31, this.b), 31, this.c), 31);
        mwh mwhVar = this.e;
        int hashCode = (g + (mwhVar == null ? 0 : mwhVar.a.hashCode())) * 31;
        Object obj = this.f;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        fn0.t(this.c, ", responseMillis=", ", headers=", sb);
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        return mz1.n(sb, this.f, ")");
    }
}
