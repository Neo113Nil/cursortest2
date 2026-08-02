package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vjg {
    public final String a;
    public final List b;
    public final String c;

    public vjg(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjg)) {
            return false;
        }
        vjg vjgVar = (vjg) obj;
        return Intrinsics.c(this.a, vjgVar.a) && Intrinsics.c(this.b, vjgVar.b) && Intrinsics.c(this.c, vjgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreativeFeedbackConfig(loggerUrl=");
        sb.append(this.a);
        sb.append(", reasons=");
        sb.append(this.b);
        sb.append(", whyThisAdUrl=");
        return mz1.o(sb, this.c, ")");
    }
}
