package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mql {
    public final String a;
    public final String b;
    public final Map c;

    public mql(@NotNull String str, @NotNull String str2, @NotNull Map<String, Double> map) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public static mql copy$default(mql mqlVar, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mqlVar.a;
        }
        if ((i & 2) != 0) {
            str2 = mqlVar.b;
        }
        if ((i & 4) != 0) {
            map = mqlVar.c;
        }
        mqlVar.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        return new mql(str, str2, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mql)) {
            return false;
        }
        mql mqlVar = (mql) obj;
        return Intrinsics.c(this.a, mqlVar.a) && Intrinsics.c(this.b, mqlVar.b) && Intrinsics.c(this.c, mqlVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + o6a.k(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Experiment(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", variants=");
        return dmi.s(sb, this.c, ')');
    }
}
