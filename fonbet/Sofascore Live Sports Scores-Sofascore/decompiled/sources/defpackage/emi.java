package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class emi implements wt9 {
    public final nr9 a;
    public final nt9 b;
    public final pe4 c;
    public final nec d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public emi(nr9 nr9Var, nt9 nt9Var, pe4 pe4Var, nec necVar, String str, boolean z, boolean z2) {
        this.a = nr9Var;
        this.b = nt9Var;
        this.c = pe4Var;
        this.d = necVar;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.wt9
    public final nt9 a() {
        return this.b;
    }

    @Override // defpackage.wt9
    public final nr9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emi)) {
            return false;
        }
        emi emiVar = (emi) obj;
        return Intrinsics.c(this.a, emiVar.a) && Intrinsics.c(this.b, emiVar.b) && this.c == emiVar.c && Intrinsics.c(this.d, emiVar.d) && Intrinsics.c(this.e, emiVar.e) && this.f == emiVar.f && this.g == emiVar.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        nec necVar = this.d;
        int hashCode2 = (hashCode + (necVar == null ? 0 : necVar.hashCode())) * 31;
        String str = this.e;
        return Boolean.hashCode(this.g) + dmi.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(image=");
        sb.append(this.a);
        sb.append(", request=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", memoryCacheKey=");
        sb.append(this.d);
        sb.append(", diskCacheKey=");
        dmi.w(sb, this.e, ", isSampled=", this.f, ", isPlaceholderCached=");
        return wt3.p(sb, this.g, ")");
    }
}
