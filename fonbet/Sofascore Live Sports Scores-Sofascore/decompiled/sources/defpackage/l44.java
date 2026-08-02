package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class l44 implements n44 {
    public final ey4 a;
    public final c1j b;
    public final gv9 c;
    public final c0a d;
    public final int e;
    public final boolean f;
    public final kxe g;
    public final kxe h;
    public final boolean i;

    public l44(ey4 ey4Var, c1j c1jVar, gv9 gv9Var, c0a c0aVar, int i, boolean z, kxe kxeVar, kxe kxeVar2, boolean z2) {
        ey4Var.getClass();
        gv9Var.getClass();
        c0aVar.getClass();
        this.a = ey4Var;
        this.b = c1jVar;
        this.c = gv9Var;
        this.d = c0aVar;
        this.e = i;
        this.f = z;
        this.g = kxeVar;
        this.h = kxeVar2;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l44)) {
            return false;
        }
        l44 l44Var = (l44) obj;
        return Intrinsics.c(this.a, l44Var.a) && Intrinsics.c(this.b, l44Var.b) && Intrinsics.c(this.c, l44Var.c) && Intrinsics.c(this.d, l44Var.d) && this.e == l44Var.e && this.f == l44Var.f && Intrinsics.c(this.g, l44Var.g) && Intrinsics.c(this.h, l44Var.h) && this.i == l44Var.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c1j c1jVar = this.b;
        int e = dmi.e(wv8.a(this.e, (this.d.hashCode() + ljg.d((hashCode + (c1jVar == null ? 0 : c1jVar.hashCode())) * 31, 31, this.c)) * 31, 31), 31, this.f);
        kxe kxeVar = this.g;
        int hashCode2 = (e + (kxeVar == null ? 0 : kxeVar.hashCode())) * 31;
        kxe kxeVar2 = this.h;
        return Boolean.hashCode(this.i) + ((hashCode2 + (kxeVar2 != null ? kxeVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormState(detailPreviewData=");
        sb.append(this.a);
        sb.append(", teamsData=");
        sb.append(this.b);
        sb.append(", incidentTypesData=");
        sb.append(this.c);
        sb.append(", incidentTimePickerData=");
        sb.append(this.d);
        sb.append(", playerCardTitle=");
        sb.append(this.e);
        sb.append(", isPlayerOptional=");
        sb.append(this.f);
        sb.append(", playerData=");
        sb.append(this.g);
        sb.append(", assistData=");
        sb.append(this.h);
        sb.append(", isTeamSelected=");
        return wt3.p(sb, this.i, ")");
    }
}
