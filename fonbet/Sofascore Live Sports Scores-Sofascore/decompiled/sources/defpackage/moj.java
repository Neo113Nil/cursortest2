package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class moj implements rlj, Serializable {
    public final String a;
    public final List b;

    public moj(String str, List list) {
        list.getClass();
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.rlj
    public final gvh e0() {
        return gvh.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moj)) {
            return false;
        }
        moj mojVar = (moj) obj;
        return this.a.equals(mojVar.a) && Intrinsics.c(this.b, mojVar.b);
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopTeamCategory(name=" + this.a + ", teamsList=" + this.b + ")";
    }
}
