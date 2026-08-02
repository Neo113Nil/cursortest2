package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class t5e {
    public final int a;
    public final Integer b;
    public final int c;

    public t5e(int i, int i2, Integer num) {
        this.a = i;
        this.b = num;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5e)) {
            return false;
        }
        t5e t5eVar = (t5e) obj;
        return this.a == t5eVar.a && Intrinsics.c(this.b, t5eVar.b) && this.c == t5eVar.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return fc6.h(this.c, ")", fc6.r("PagerModalData(title=", ", subtitle=", ", description=", this.b, this.a));
    }
}
