package defpackage;

import com.sofascore.model.Colors;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class yld {
    public final int a;
    public final Colors b;
    public final String c;

    public yld(int i, Colors colors, String str) {
        str.getClass();
        this.a = i;
        this.b = colors;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yld)) {
            return false;
        }
        yld yldVar = (yld) obj;
        return this.a == yldVar.a && Intrinsics.c(this.b, yldVar.b) && Intrinsics.c(this.c, yldVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Colors colors = this.b;
        return this.c.hashCode() + ((hashCode + (colors == null ? 0 : colors.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OddsProviderUIModel(id=");
        sb.append(this.a);
        sb.append(", colors=");
        sb.append(this.b);
        sb.append(", slug=");
        return mz1.o(sb, this.c, ")");
    }
}
