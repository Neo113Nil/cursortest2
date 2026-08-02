package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xjk {
    public final List a;
    public final Set b;
    public final Set c;
    public final boolean d;

    public xjk(List list, Set set, HashSet hashSet, boolean z) {
        set.getClass();
        this.a = list;
        this.b = set;
        this.c = hashSet;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xjk)) {
            return false;
        }
        xjk xjkVar = (xjk) obj;
        return this.a.equals(xjkVar.a) && Intrinsics.c(this.b, xjkVar.b) && Intrinsics.c(this.c, xjkVar.c) && this.d == xjkVar.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Set set = this.c;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VVPConfig(rules=");
        sb.append(this.a);
        sb.append(", standardParams=");
        sb.append(this.b);
        sb.append(", inScopeEventNames=");
        sb.append(this.c);
        sb.append(", isShadowEnabled=");
        return lnb.r(sb, this.d, ')');
    }
}
