package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s83 implements t83 {
    public final int a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public s83(String str, String str2, boolean z, int i, String str3) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s83)) {
            return false;
        }
        s83 s83Var = (s83) obj;
        return this.a == s83Var.a && Intrinsics.c(this.b, s83Var.b) && this.c == s83Var.c && Intrinsics.c(this.d, s83Var.d) && Intrinsics.c(this.e, s83Var.e);
    }

    @Override // defpackage.t83
    public final int getId() {
        return this.a;
    }

    @Override // defpackage.t83
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.t83
    public final boolean isRecent() {
        return this.c;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TeamResult(id=", ", name=", this.b, ", isRecent=");
        t.append(this.c);
        t.append(", countryName=");
        t.append(this.d);
        t.append(", countryAlpha2=");
        return mz1.o(t, this.e, ")");
    }
}
