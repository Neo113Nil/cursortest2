package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a3a {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final List d;

    public a3a(Integer num, Integer num2, Integer num3, List list) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3a)) {
            return false;
        }
        a3a a3aVar = (a3a) obj;
        return Intrinsics.c(this.a, a3aVar.a) && Intrinsics.c(this.b, a3aVar.b) && Intrinsics.c(this.c, a3aVar.c) && Intrinsics.c(this.d, a3aVar.d);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List list = this.d;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder k = wv8.k(this.a, "InfoSection(titleResId=", ", body1ResId=", ", body2ResId=", this.b);
        k.append(this.c);
        k.append(", points=");
        k.append(this.d);
        k.append(")");
        return k.toString();
    }
}
