package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pql implements s5m {
    public final String a;

    public pql(@Nullable String str) {
        this.a = str;
    }

    public static pql copy$default(pql pqlVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pqlVar.a;
        }
        pqlVar.getClass();
        return new pql(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pql) && Intrinsics.c(this.a, ((pql) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("Casting(deviceName="), this.a, ')');
    }
}
