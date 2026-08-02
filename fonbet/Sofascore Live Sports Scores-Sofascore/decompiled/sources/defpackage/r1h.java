package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class r1h implements t1h {
    public final Object a;
    public final tc3 b;

    public r1h(Object obj, tc3 tc3Var) {
        this.a = obj;
        this.b = tc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r1h) {
            r1h r1hVar = (r1h) obj;
            return Intrinsics.c(this.a, r1hVar.a) && this.b == r1hVar.b;
        }
        return false;
    }

    @Override // defpackage.t1h
    public final Object getItem() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        return Boolean.hashCode(true) + ((this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31)) * 31);
    }

    @Override // defpackage.t1h
    public final boolean isEnabled() {
        return true;
    }

    public final String toString() {
        return "Icon(item=" + this.a + ", icon=" + this.b + ", isEnabled=true)";
    }
}
