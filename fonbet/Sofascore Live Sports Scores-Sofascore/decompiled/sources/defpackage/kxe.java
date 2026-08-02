package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kxe {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final Integer f;
    public final boolean g;

    public kxe(int i, String str, String str2, String str3, boolean z, Integer num, boolean z2) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = num;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxe)) {
            return false;
        }
        kxe kxeVar = (kxe) obj;
        return this.a == kxeVar.a && Intrinsics.c(this.b, kxeVar.b) && this.c.equals(kxeVar.c) && this.d.equals(kxeVar.d) && this.e == kxeVar.e && Intrinsics.c(this.f, kxeVar.f) && this.g == kxeVar.g;
    }

    public final int hashCode() {
        int e = dmi.e(dmi.c(dmi.c(dmi.c(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((e + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "PlayerUiModel(id=", ", name=", this.b, ", countryAlpha3=");
        bf3.v(t, this.c, ", countryAlpha2=", this.d, ", isDisabled=");
        t.append(this.e);
        t.append(", endIconRes=");
        t.append(this.f);
        t.append(", canRemove=");
        return wt3.p(t, this.g, ")");
    }
}
