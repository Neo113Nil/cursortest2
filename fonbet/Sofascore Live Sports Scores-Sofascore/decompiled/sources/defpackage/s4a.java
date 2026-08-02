package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class s4a {
    public final int a;
    public final int b;
    public final Map c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s4a(int i, int i2, Map map, int i3) {
        this(map, i, i2);
        i = (i3 & 1) != 0 ? -1 : i;
        i2 = (i3 & 2) != 0 ? -1 : i2;
        if ((i3 & 4) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4a)) {
            return false;
        }
        s4a s4aVar = (s4a) obj;
        return this.a == s4aVar.a && this.b == s4aVar.b && Intrinsics.c(this.c, s4aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsertedViewInfo(mainViewId=");
        sb.append(this.a);
        sb.append(", complexViewId=");
        sb.append(this.b);
        sb.append(", children=");
        return dmi.s(sb, this.c, ')');
    }

    public s4a(Map map, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = map;
    }
}
