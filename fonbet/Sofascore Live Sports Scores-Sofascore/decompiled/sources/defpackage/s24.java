package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class s24 {
    public final ey4 a;
    public final boolean b;

    public s24(ey4 ey4Var, boolean z) {
        ey4Var.getClass();
        this.a = ey4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s24)) {
            return false;
        }
        s24 s24Var = (s24) obj;
        return Intrinsics.c(this.a, s24Var.a) && this.b == s24Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CrowdsourcingDeleteIncidentState(detailPreviewData=" + this.a + ", isLoading=" + this.b + ")";
    }
}
