package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jxi {
    public final Integer a;
    public final String b;

    public jxi(Integer num, String str) {
        str.getClass();
        this.a = num;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxi)) {
            return false;
        }
        jxi jxiVar = (jxi) obj;
        return Intrinsics.c(this.a, jxiVar.a) && Intrinsics.c(this.b, jxiVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "TeamManagerUiModel(id=" + this.a + ", name=" + this.b + ")";
    }
}
