package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y5d {
    public final int a;
    public u7d b = null;
    public Bundle c = null;

    public y5d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5d)) {
            return false;
        }
        y5d y5dVar = (y5d) obj;
        if (this.a != y5dVar.a || !Intrinsics.c(this.b, y5dVar.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = y5dVar.c;
        if (Intrinsics.c(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !l4a.l(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        u7d u7dVar = this.b;
        int hashCode2 = hashCode + (u7dVar != null ? u7dVar.hashCode() : 0);
        Bundle bundle = this.c;
        if (bundle != null) {
            return l4a.m(bundle) + (hashCode2 * 31);
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(y5d.class.getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
