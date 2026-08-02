package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r83 implements t83 {
    public final int a;
    public final String b;
    public final boolean c;
    public final Integer d;
    public final String e;

    public r83(int i, Integer num, String str, String str2, boolean z) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = num;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r83)) {
            return false;
        }
        r83 r83Var = (r83) obj;
        return this.a == r83Var.a && Intrinsics.c(this.b, r83Var.b) && this.c == r83Var.c && Intrinsics.c(this.d, r83Var.d) && Intrinsics.c(this.e, r83Var.e);
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
        Integer num = this.d;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.t83
    public final boolean isRecent() {
        return this.c;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "PlayerResult(id=", ", name=", this.b, ", isRecent=");
        t.append(this.c);
        t.append(", teamId=");
        t.append(this.d);
        t.append(", teamName=");
        return mz1.o(t, this.e, ")");
    }
}
