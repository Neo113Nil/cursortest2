package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class src {
    public final String a;
    public final ArrayList b;
    public final urc c;

    public src(String str, ArrayList arrayList, urc urcVar) {
        this.a = str;
        this.b = arrayList;
        this.c = urcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof src)) {
            return false;
        }
        src srcVar = (src) obj;
        return Intrinsics.c(this.a, srcVar.a) && Intrinsics.c(this.b, srcVar.b) && this.c == srcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + vxd.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MmaStatsDualGroupWrapper(tag=" + this.a + ", statList=" + this.b + ", type=" + this.c + ")";
    }

    public /* synthetic */ src(String str, ArrayList arrayList) {
        this(str, arrayList, urc.a);
    }
}
