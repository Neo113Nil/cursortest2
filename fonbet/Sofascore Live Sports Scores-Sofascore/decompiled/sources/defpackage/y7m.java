package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class y7m {
    public final String a;
    public final boolean b;

    public y7m(@NotNull String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public static y7m copy$default(y7m y7mVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = y7mVar.a;
        }
        if ((i & 2) != 0) {
            z = y7mVar.b;
        }
        y7mVar.getClass();
        str.getClass();
        return new y7m(str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7m)) {
            return false;
        }
        y7m y7mVar = (y7m) obj;
        return Intrinsics.c(this.a, y7mVar.a) && this.b == y7mVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EntryPointReadable(id=");
        sb.append(this.a);
        sb.append(", isRead=");
        return lnb.r(sb, this.b, ')');
    }
}
