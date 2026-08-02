package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sgm {
    public final Integer a;
    public final String b;

    public sgm(@Nullable Integer num, @Nullable String str) {
        this.a = num;
        this.b = str;
    }

    public static sgm copy$default(sgm sgmVar, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = sgmVar.a;
        }
        if ((i & 2) != 0) {
            str = sgmVar.b;
        }
        sgmVar.getClass();
        return new sgm(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgm)) {
            return false;
        }
        sgm sgmVar = (sgm) obj;
        return Intrinsics.c(this.a, sgmVar.a) && Intrinsics.c(this.b, sgmVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteImage(resourceId=");
        sb.append(this.a);
        sb.append(", resourceUrl=");
        return lnb.q(sb, this.b, ')');
    }
}
