package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x93 extends p2 {
    public final String b;
    public final Integer c;
    public final ArrayList d;
    public boolean e;
    public final int f;
    public final int g;

    public x93(String str, Integer num, ArrayList arrayList, boolean z, int i, int i2) {
        super(str, arrayList);
        this.b = str;
        this.c = num;
        this.d = arrayList;
        this.e = z;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.p2
    public final ArrayList d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x93)) {
            return false;
        }
        x93 x93Var = (x93) obj;
        return this.b.equals(x93Var.b) && Intrinsics.c(this.c, x93Var.c) && this.d.equals(x93Var.d) && this.e == x93Var.e && this.f == x93Var.f && this.g == x93Var.g;
    }

    @Override // defpackage.p2
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return Integer.hashCode(this.g) + wv8.a(this.f, dmi.e((this.d.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.e), 31);
    }

    public final String toString() {
        boolean z = this.e;
        StringBuilder sb = new StringBuilder("CollapsibleTennisGroup(name=");
        sb.append(this.b);
        sb.append(", logoTournamentId=");
        sb.append(this.c);
        sb.append(", items=");
        sb.append(this.d);
        sb.append(", isExpanded=");
        sb.append(z);
        sb.append(", groupPosition=");
        return me4.i(sb, this.f, ", scrollToIndex=", this.g, ")");
    }
}
