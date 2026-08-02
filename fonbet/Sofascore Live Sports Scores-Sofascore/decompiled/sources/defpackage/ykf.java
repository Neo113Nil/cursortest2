package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ykf {
    public final int a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;

    public ykf(String str, int i, String str2, boolean z, boolean z2, int i2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykf)) {
            return false;
        }
        ykf ykfVar = (ykf) obj;
        return this.a == ykfVar.a && this.b == ykfVar.b && this.c == ykfVar.c && Intrinsics.c(this.d, ykfVar.d) && Intrinsics.c(this.e, ykfVar.e) && this.f == ykfVar.f;
    }

    public final int hashCode() {
        int e = dmi.e(wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "RaceLap(lap=", ", position=", ", isPitStop=");
        s.append(this.c);
        s.append(", oldTyreType=");
        s.append(this.d);
        s.append(", newTyreType=");
        s.append(this.e);
        s.append(", isDnf=");
        s.append(this.f);
        s.append(")");
        return s.toString();
    }
}
