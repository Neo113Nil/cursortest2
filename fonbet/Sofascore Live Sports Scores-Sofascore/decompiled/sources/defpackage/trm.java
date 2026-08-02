package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class trm {
    public final List a;
    public final String b;

    public trm(@NotNull List<atm> list, @Nullable String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public static trm copy$default(trm trmVar, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trmVar.a;
        }
        if ((i & 2) != 0) {
            str = trmVar.b;
        }
        trmVar.getClass();
        list.getClass();
        return new trm(list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trm)) {
            return false;
        }
        trm trmVar = (trm) obj;
        return Intrinsics.c(this.a, trmVar.a) && Intrinsics.c(this.b, trmVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PosterModel(renditions=");
        sb.append(this.a);
        sb.append(", type=");
        return lnb.q(sb, this.b, ')');
    }
}
