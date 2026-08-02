package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jfj implements Serializable {
    public final String a;
    public final Integer b;
    public final boolean c;

    public /* synthetic */ jfj(int i, String str, Integer num) {
        this((i & 2) != 0 ? null : num, (i & 1) != 0 ? null : str, false);
    }

    public static jfj a(jfj jfjVar, String str, Integer num, int i) {
        if ((i & 1) != 0) {
            str = jfjVar.a;
        }
        if ((i & 2) != 0) {
            num = jfjVar.b;
        }
        boolean z = jfjVar.c;
        jfjVar.getClass();
        return new jfj(num, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfj)) {
            return false;
        }
        jfj jfjVar = (jfj) obj;
        return Intrinsics.c(this.a, jfjVar.a) && Intrinsics.c(this.b, jfjVar.b) && this.c == jfjVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextUIItem(text=");
        sb.append(this.a);
        sb.append(", textColor=");
        sb.append(this.b);
        sb.append(", strikethrough=");
        return wt3.p(sb, this.c, ")");
    }

    public jfj(Integer num, String str, boolean z) {
        this.a = str;
        this.b = num;
        this.c = z;
    }
}
