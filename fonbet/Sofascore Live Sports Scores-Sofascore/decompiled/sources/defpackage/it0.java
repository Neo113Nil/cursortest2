package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class it0 extends fx3 {
    public final List a;
    public final bx3 b;
    public final rw3 c;
    public final ww3 d;
    public final lt0 e;
    public final List f;

    public it0(List list, bx3 bx3Var, rw3 rw3Var, ww3 ww3Var, lt0 lt0Var, List list2) {
        this.a = list;
        this.b = bx3Var;
        this.c = rw3Var;
        this.d = ww3Var;
        this.e = lt0Var;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fx3)) {
            return false;
        }
        fx3 fx3Var = (fx3) obj;
        List list = this.a;
        if (list == null) {
            if (((it0) fx3Var).a != null) {
                return false;
            }
        } else if (!list.equals(((it0) fx3Var).a)) {
            return false;
        }
        bx3 bx3Var = this.b;
        if (bx3Var == null) {
            if (((it0) fx3Var).b != null) {
                return false;
            }
        } else if (!bx3Var.equals(((it0) fx3Var).b)) {
            return false;
        }
        rw3 rw3Var = this.c;
        if (rw3Var == null) {
            if (((it0) fx3Var).c != null) {
                return false;
            }
        } else if (!rw3Var.equals(((it0) fx3Var).c)) {
            return false;
        }
        ww3 ww3Var = this.d;
        if (ww3Var == null) {
            if (((it0) fx3Var).d != null) {
                return false;
            }
        } else if (!ww3Var.equals(((it0) fx3Var).d)) {
            return false;
        }
        it0 it0Var = (it0) fx3Var;
        return this.e.equals(it0Var.e) && this.f.equals(it0Var.f);
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        bx3 bx3Var = this.b;
        int hashCode2 = (hashCode ^ (bx3Var == null ? 0 : bx3Var.hashCode())) * 1000003;
        rw3 rw3Var = this.c;
        int hashCode3 = (hashCode2 ^ (rw3Var == null ? 0 : rw3Var.hashCode())) * 1000003;
        ww3 ww3Var = this.d;
        return this.f.hashCode() ^ (((((ww3Var != null ? ww3Var.hashCode() : 0) ^ hashCode3) * 1000003) ^ this.e.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", profilingManagerInfo=");
        sb.append(this.d);
        sb.append(", signal=");
        sb.append(this.e);
        sb.append(", binaries=");
        return mz1.p(sb, this.f, "}");
    }
}
