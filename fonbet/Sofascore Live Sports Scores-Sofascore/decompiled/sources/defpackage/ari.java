package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ari {
    public final String a;
    public final int b;
    public final int c;

    public ari(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ari)) {
            return false;
        }
        ari ariVar = (ari) obj;
        return Intrinsics.c(this.a, ariVar.a) && this.b == ariVar.b && this.c == ariVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wv8.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.a);
        sb.append(", generation=");
        sb.append(this.b);
        sb.append(", systemId=");
        return wv8.j(sb, this.c, ')');
    }
}
