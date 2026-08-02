package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ghd {
    public final String a;
    public final r9k b;
    public final r9k c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public ghd(String str, r9k r9kVar, r9k r9kVar2, int i, boolean z, boolean z2) {
        str.getClass();
        this.a = str;
        this.b = r9kVar;
        this.c = r9kVar2;
        this.d = i;
        this.e = z;
        this.f = z2;
    }

    public static ghd a(ghd ghdVar, boolean z, boolean z2, int i) {
        String str = ghdVar.a;
        r9k r9kVar = ghdVar.b;
        r9k r9kVar2 = ghdVar.c;
        int i2 = ghdVar.d;
        if ((i & 16) != 0) {
            z = ghdVar.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = ghdVar.f;
        }
        ghdVar.getClass();
        str.getClass();
        r9kVar.getClass();
        return new ghd(str, r9kVar, r9kVar2, i2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghd)) {
            return false;
        }
        ghd ghdVar = (ghd) obj;
        return Intrinsics.c(this.a, ghdVar.a) && Intrinsics.c(this.b, ghdVar.b) && Intrinsics.c(this.c, ghdVar.c) && this.d == ghdVar.d && this.e == ghdVar.e && this.f == ghdVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        r9k r9kVar = this.c;
        return Boolean.hashCode(this.f) + dmi.e(wv8.a(this.d, (hashCode + (r9kVar == null ? 0 : r9kVar.hashCode())) * 31, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationSettingUiModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.d);
        sb.append(", enabled=");
        return w1l.i(", isChannelEnabled=", ")", sb, this.e, this.f);
    }

    public /* synthetic */ ghd(String str, q9k q9kVar, q9k q9kVar2, int i, boolean z, int i2) {
        this(str, (r9k) q9kVar, (r9k) ((i2 & 4) != 0 ? null : q9kVar2), i, z, false);
    }
}
