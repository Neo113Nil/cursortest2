package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class su {
    public Integer a;
    public String b;
    public String c;
    public Integer d;
    public Integer e;
    public String f;
    public String g;

    public su(int i, String str, Integer num) {
        num = (i & 1) != 0 ? null : num;
        str = (i & 2) != 0 ? null : str;
        this.a = num;
        this.b = str;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
    }

    public final void a(su suVar) {
        suVar.getClass();
        if (this.a == null) {
            this.a = suVar.a;
        }
        if (this.c == null) {
            this.c = suVar.c;
        }
        if (this.d == null) {
            this.d = suVar.d;
        }
        if (this.e == null) {
            this.e = suVar.e;
        }
        if (this.f == null) {
            this.f = suVar.f;
        }
        if (this.g == null) {
            this.g = suVar.g;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        return Intrinsics.c(this.a, suVar.a) && Intrinsics.c(this.b, suVar.b) && Intrinsics.c(this.c, suVar.c) && Intrinsics.c(this.d, suVar.d) && Intrinsics.c(this.e, suVar.e) && Intrinsics.c(this.f, suVar.f) && Intrinsics.c(this.g, suVar.g);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.a;
        String str = this.b;
        String str2 = this.c;
        Integer num2 = this.d;
        Integer num3 = this.e;
        String str3 = this.f;
        String str4 = this.g;
        StringBuilder m = wv8.m("AnalyticsScreenData(id=", num, ", type=", str, ", status=");
        me4.o(num2, str2, ", index=", ", size=", m);
        vxd.s(num3, ", provider=", str3, ", source=", m);
        return mz1.o(m, str4, ")");
    }
}
