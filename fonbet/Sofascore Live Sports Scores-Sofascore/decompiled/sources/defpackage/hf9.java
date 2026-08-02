package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class hf9 {
    public final int a;
    public final int b;
    public final m22 c;
    public final HashMap d;

    public hf9(int i, int i2, m22 m22Var, HashMap hashMap) {
        this.a = i;
        this.b = i2;
        this.c = m22Var;
        this.d = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf9)) {
            return false;
        }
        hf9 hf9Var = (hf9) obj;
        return this.a == hf9Var.a && this.b == hf9Var.b && Intrinsics.c(this.c, hf9Var.c) && Intrinsics.c(this.d, hf9Var.d);
    }

    public final int hashCode() {
        int a = wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        m22 m22Var = this.c;
        return this.d.hashCode() + ((a + (m22Var == null ? 0 : m22Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder s = lnb.s(this.a, this.b, "HorizontalScrollItemState(scrollX=", ", oldScrollX=", ", lastSectionChanged=");
        s.append(this.c);
        s.append(", sectionScrollMap=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }

    public /* synthetic */ hf9() {
        this(0, 0, null, new HashMap());
    }
}
