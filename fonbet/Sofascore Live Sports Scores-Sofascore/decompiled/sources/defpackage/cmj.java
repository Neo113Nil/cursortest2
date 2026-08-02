package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cmj implements rlj, Serializable {
    public final String a;
    public final List b;
    public final Integer c;

    public cmj(String str, List list, Integer num) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = num;
    }

    @Override // defpackage.rlj
    public final gvh e0() {
        return gvh.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmj)) {
            return false;
        }
        cmj cmjVar = (cmj) obj;
        return this.a.equals(cmjVar.a) && Intrinsics.c(this.b, cmjVar.b) && Intrinsics.c(this.c, cmjVar.c);
    }

    @Override // defpackage.rlj
    public final List f0() {
        return this.b;
    }

    @Override // defpackage.rlj
    public final String g0() {
        return this.a;
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return d + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayerCategory(name=");
        sb.append(this.a);
        sb.append(", playerList=");
        sb.append(this.b);
        sb.append(", categoryAdditionalInfoResId=");
        return vxd.n(sb, this.c, ")");
    }
}
